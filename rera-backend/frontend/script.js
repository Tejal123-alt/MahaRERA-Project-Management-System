
// Spring Boot API URL
const API_URL = "http://localhost:8082/api/projects";

// Store project records
let allProjects = [];

// Load projects when the Projects page opens
$(document).ready(function () {

    if ($("#projectContainer").length > 0) {
        loadProjects();
    }

    // Search projects
    $("#searchInput").on("input", function () {
        const searchText = $(this).val().toLowerCase();

        const filteredProjects = allProjects.filter(function (project) {
            return (
                (project.projectName || "").toLowerCase().includes(searchText) ||
                (project.projectStatus || "").toLowerCase().includes(searchText) ||
                (project.projectType || "").toLowerCase().includes(searchText)
            );
        });

        displayProjects(filteredProjects);
    });
});


// Fetch projects from Spring Boot
function loadProjects() {

    $("#projectContainer").html(
        '<div class="col-12 text-center">Loading projects...</div>'
    );

    $.ajax({
        url: API_URL,
        method: "GET",
        dataType: "json",

        success: function (projects) {
            allProjects = projects;
            displayProjects(allProjects);
        },

        error: function (xhr) {
            $("#projectCount").text("Unable to load");

            $("#projectContainer").html(
                '<div class="col-12 text-center text-danger">' +
                'Unable to load projects. Please check whether the backend is running.' +
                '</div>'
            );

            console.error("API Error:", xhr);
        }
    });
}


// Display project cards
function displayProjects(projects) {

    $("#projectCount").text(projects.length + " Projects");

    if (projects.length === 0) {
        $("#projectContainer").html(
            '<div class="col-12 text-center">No projects found.</div>'
        );
        return;
    }

    let cards = "";

    projects.forEach(function (project) {

        const projectName = escapeHTML(project.projectName || "Unnamed Project");
        const projectStatus = escapeHTML(project.projectStatus || "Not Available");
        const projectType = escapeHTML(project.projectType || "Not Available");
        const projectArea = project.landAreaSqm ?? "Not Available";
        const projectDate = escapeHTML(
            project.revisedProposedCompletion ||
            project.proposedCompletion ||
            "Not Available"
        );

        cards += `
            <div class="col-md-6 col-lg-4">
                <div class="project-card">

                    <span class="status-badge">${projectStatus}</span>

                    <h5 class="mt-3">${projectName}</h5>

                    <p class="project-info">
                        <strong>Project Type:</strong> ${projectType}
                    </p>

                    <p class="project-info">
                        <strong>Land Area:</strong> ${projectArea} sqm
                    </p>

                    <p class="project-info">
                        <strong>Proposed Completion:</strong> ${projectDate}
                    </p>

                    <button class="details-btn mt-2"
                        onclick="showProjectDetails(${Number(project.projectId)})">
                        View Details
                    </button>

                </div>
            </div>
        `;
    });

    $("#projectContainer").html(cards);
}


// Show project details in a Bootstrap modal
function showProjectDetails(projectId) {

    const project = allProjects.find(function (item) {
        return Number(item.projectId) === Number(projectId);
    });

    if (!project) {
        return;
    }

    $("#modalProjectName").text(project.projectName || "Project Details");

    const details = `
        <p><strong>Project ID:</strong> ${escapeHTML(project.projectId)}</p>
        <p><strong>Project Name:</strong> ${escapeHTML(project.projectName)}</p>
        <p><strong>Project Type:</strong> ${escapeHTML(project.projectType)}</p>
        <p><strong>Project Status:</strong> ${escapeHTML(project.projectStatus)}</p>
        <p><strong>Proposed Completion:</strong> ${escapeHTML(project.proposedCompletion)}</p>
        <p><strong>Revised Completion:</strong> ${escapeHTML(project.revisedProposedCompletion)}</p>
        <p><strong>Land Area:</strong> ${escapeHTML(project.landAreaSqm)} sqm</p>
        <p><strong>Total Buildings:</strong> ${escapeHTML(project.totalBuildingCount)}</p>
        <p><strong>Approved FSI:</strong> ${escapeHTML(project.approvedFsiBuildupSqm)}</p>
        <p><strong>Proposed FSI:</strong> ${escapeHTML(project.proposedFsiBuildupSqm)}</p>
    `;

    $("#modalProjectBody").html(details);

    const modal = new bootstrap.Modal(
        document.getElementById("projectModal")
    );

    modal.show();
}


// Safely display values received from the API
function escapeHTML(value) {

    if (value === null || value === undefined || value === "") {
        return "Not Available";
    }

    return $("<div>").text(String(value)).html();
}
