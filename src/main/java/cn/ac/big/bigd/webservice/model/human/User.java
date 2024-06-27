package cn.ac.big.bigd.webservice.model.human;


import java.util.Date;
import java.util.List;

public class User {
    private Integer userId;
    private String casUserId;
    private String firstName;

    private String middleName;

    private String lastName;

    private String email;

    private String organization;

    private String organizationStandard;

    private String department;
    private String title;

    private String phone;

    private String fax;

    private String street;

    private String city;

    private String postalCode;

    private String lab;

    private String researchArea;

    private String state;

    private Integer isActive=0;
    private Integer isLocked=0;
    private Integer isDeleted=0;
//    private Integer isRoleAllocated=0;
    private Date deleteTime;
    private Date createTime;

    private Date activeTime;
    private Date modifyTime;
    private String password;  
    private String confirmPassword;
    private String encryptPwd;

    private Country country;

    private Integer isPi=0;
    private String homepage;
    private String unitHomepage;
    private Integer updateTimes;
    private Date lastTime;
    private int checkPi;

//    private String authorUrl;
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    

    public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

	public String getPassword() {
		return password;
	}

	
	public Integer getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(Integer isLocked) {
		this.isLocked = isLocked;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Date getActiveTime() {
		return activeTime;
	}

	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

	public Date getDeleteTime() {
		return deleteTime;
	}

	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//	public Integer getIsRoleAllocated() {
//		return isRoleAllocated;
//	}
//
//	public void setIsRoleAllocated(Integer isRoleAllocated) {
//		this.isRoleAllocated = isRoleAllocated;
//	}

	public String getEncryptPwd() {
		return encryptPwd;
	}

	public void setEncryptPwd(String encryptPwd) {
		this.encryptPwd = encryptPwd;
	}


	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getCasUserId() {
		return casUserId;
	}

	public void setCasUserId(String casUserId) {
		this.casUserId = casUserId;
	}

    public Integer getIsPi() {
        return isPi;
    }

    public void setIsPi(Integer isPi) {
        this.isPi = isPi;
    }

    public String getUnitHomepage() {
        return unitHomepage;
    }

    public void setUnitHomepage(String unitHomepage) {
        this.unitHomepage = unitHomepage;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Integer getUpdateTimes() {
        return updateTimes;
    }

    public void setUpdateTimes(Integer updateTimes) {
        this.updateTimes = updateTimes;
    }

    public String getOrganizationStandard() {
        return organizationStandard;
    }

    public void setOrganizationStandard(String organizationStandard) {
        this.organizationStandard = organizationStandard;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public int getCheckPi() {
        return checkPi;
    }

    public void setCheckPi(int checkPi) {
        this.checkPi = checkPi;
    }
}