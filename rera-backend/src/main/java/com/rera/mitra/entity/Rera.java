package com.rera.mitra.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "project")
public class Rera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "application_id")
    private Integer applicationId;

    @Column(name = "promoter_id")
    private Integer promoterId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "project_type")
    private String projectType;

    @Column(name = "project_status")
    private String projectStatus;

    @Column(name = "original_proposed_completion")
    private LocalDate originalProposedCompletion;

    @Column(name = "actual_completion")
    private LocalDate actualCompletion;

    @Column(name = "proposed_completion")
    private LocalDate proposedCompletion;

    @Column(name = "revised_proposed_completion")
    private LocalDate revisedProposedCompletion;

    @Column(name = "litigation_flag")
    private Boolean litigationFlag;

    @Column(name = "co_promoter_flag")
    private Boolean coPromoterFlag;

    @Column(name = "land_owner_investor_flag")
    private Boolean landOwnerInvestorFlag;

    @Column(name = "plot_survey_cts")
    private String plotSurveyCts;

    @Column(name = "land_area_sqm", precision = 15, scale = 2)
    private BigDecimal landAreaSqm;

    @Column(name = "total_building_count")
    private Integer totalBuildingCount;

    @Column(name = "sanctioned_building_count")
    private Integer sanctionedBuildingCount;

    @Column(name = "proposed_not_sanctioned_building_count")
    private Integer proposedNotSanctionedBuildingCount;

    @Column(name = "recreational_open_space_sqm", precision = 15, scale = 2)
    private BigDecimal recreationalOpenSpaceSqm;

    @Column(name = "proposed_fsi_builtup_sqm", precision = 15, scale = 2)
    private BigDecimal proposedFsiBuildupSqm;

    @Column(name = "approved_fsi_builtup_sqm", precision = 15, scale = 2)
    private BigDecimal approvedFsiBuildupSqm;

    @Column(name = "total_fsi", precision = 15, scale = 2)
    private BigDecimal totalFsi;

    @Column(name = "boundary_east")
    private String boundaryEast;

    @Column(name = "boundary_west")
    private String boundaryWest;

    @Column(name = "boundary_north")
    private String boundaryNorth;

    @Column(name = "boundary_south")
    private String boundarySouth;

    @Column(name = "source_document_id")
    private Integer sourceDocumentId;

    // Getters and Setters

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public LocalDate getOriginalProposedCompletion() {
        return originalProposedCompletion;
    }

    public void setOriginalProposedCompletion(LocalDate date) {
        this.originalProposedCompletion = date;
    }

    public LocalDate getActualCompletion() {
        return actualCompletion;
    }

    public void setActualCompletion(LocalDate date) {
        this.actualCompletion = date;
    }

    public LocalDate getProposedCompletion() {
        return proposedCompletion;
    }

    public void setProposedCompletion(LocalDate date) {
        this.proposedCompletion = date;
    }

    public LocalDate getRevisedProposedCompletion() {
        return revisedProposedCompletion;
    }

    public void setRevisedProposedCompletion(LocalDate date) {
        this.revisedProposedCompletion = date;
    }

    public BigDecimal getLandAreaSqm() {
        return landAreaSqm;
    }

    public void setLandAreaSqm(BigDecimal landAreaSqm) {
        this.landAreaSqm = landAreaSqm;
    }

    public Integer getTotalBuildingCount() {
        return totalBuildingCount;
    }

    public void setTotalBuildingCount(Integer count) {
        this.totalBuildingCount = count;
    }

    public BigDecimal getProposedFsiBuildupSqm() {
        return proposedFsiBuildupSqm;
    }

    public void setProposedFsiBuildupSqm(BigDecimal value) {
        this.proposedFsiBuildupSqm = value;
    }

    public BigDecimal getApprovedFsiBuildupSqm() {
        return approvedFsiBuildupSqm;
    }

    public void setApprovedFsiBuildupSqm(BigDecimal value) {
        this.approvedFsiBuildupSqm = value;
    }

    public BigDecimal getTotalFsi() {
        return totalFsi;
    }

    public void setTotalFsi(BigDecimal totalFsi) {
        this.totalFsi = totalFsi;
    }

	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public Integer getPromoterId() {
		return promoterId;
	}

	public void setPromoterId(Integer promoterId) {
		this.promoterId = promoterId;
	}

	public Boolean getLitigationFlag() {
		return litigationFlag;
	}

	public void setLitigationFlag(Boolean litigationFlag) {
		this.litigationFlag = litigationFlag;
	}

	public Boolean getCoPromoterFlag() {
		return coPromoterFlag;
	}

	public void setCoPromoterFlag(Boolean coPromoterFlag) {
		this.coPromoterFlag = coPromoterFlag;
	}

	public Boolean getLandOwnerInvestorFlag() {
		return landOwnerInvestorFlag;
	}

	public void setLandOwnerInvestorFlag(Boolean landOwnerInvestorFlag) {
		this.landOwnerInvestorFlag = landOwnerInvestorFlag;
	}

	public String getPlotSurveyCts() {
		return plotSurveyCts;
	}

	public void setPlotSurveyCts(String plotSurveyCts) {
		this.plotSurveyCts = plotSurveyCts;
	}

	public Integer getSanctionedBuildingCount() {
		return sanctionedBuildingCount;
	}

	public void setSanctionedBuildingCount(Integer sanctionedBuildingCount) {
		this.sanctionedBuildingCount = sanctionedBuildingCount;
	}

	public Integer getProposedNotSanctionedBuildingCount() {
		return proposedNotSanctionedBuildingCount;
	}

	public void setProposedNotSanctionedBuildingCount(Integer proposedNotSanctionedBuildingCount) {
		this.proposedNotSanctionedBuildingCount = proposedNotSanctionedBuildingCount;
	}

	public BigDecimal getRecreationalOpenSpaceSqm() {
		return recreationalOpenSpaceSqm;
	}

	public void setRecreationalOpenSpaceSqm(BigDecimal recreationalOpenSpaceSqm) {
		this.recreationalOpenSpaceSqm = recreationalOpenSpaceSqm;
	}

	public String getBoundaryEast() {
		return boundaryEast;
	}

	public void setBoundaryEast(String boundaryEast) {
		this.boundaryEast = boundaryEast;
	}

	public String getBoundaryWest() {
		return boundaryWest;
	}

	public void setBoundaryWest(String boundaryWest) {
		this.boundaryWest = boundaryWest;
	}

	public String getBoundaryNorth() {
		return boundaryNorth;
	}

	public void setBoundaryNorth(String boundaryNorth) {
		this.boundaryNorth = boundaryNorth;
	}

	public String getBoundarySouth() {
		return boundarySouth;
	}

	public void setBoundarySouth(String boundarySouth) {
		this.boundarySouth = boundarySouth;
	}

	public Integer getSourceDocumentId() {
		return sourceDocumentId;
	}

	public void setSourceDocumentId(Integer sourceDocumentId) {
		this.sourceDocumentId = sourceDocumentId;
	}
    
}
