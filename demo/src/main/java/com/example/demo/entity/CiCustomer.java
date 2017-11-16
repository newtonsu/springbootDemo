package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CiCustomer implements Serializable{

	 private static final long serialVersionUID = 1L;

	    public static final String TABLE_NAME = "CI_CUSTOMER";

	    private String custCommonId;

	    private String name;

	    private Integer age;

	    private Date birthday;

	    private String idNo;

	    private String sino;

	    private String nationality;

	    private String nationaliType;

	    private String nativePlace;

	    private String politicalFace;

	    private String email;

	    private String mobileNo;

	    private String position;

	    private String location;

	    public String getCustCommonId() {
			return custCommonId;
		}

		public void setCustCommonId(String custCommonId) {
			this.custCommonId = custCommonId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public Date getBirthday() {
			return birthday;
		}

		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}

		public String getIdNo() {
			return idNo;
		}

		public void setIdNo(String idNo) {
			this.idNo = idNo;
		}

		public String getSino() {
			return sino;
		}

		public void setSino(String sino) {
			this.sino = sino;
		}

		public String getNationality() {
			return nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		public String getNationaliType() {
			return nationaliType;
		}

		public void setNationaliType(String nationaliType) {
			this.nationaliType = nationaliType;
		}

		public String getNativePlace() {
			return nativePlace;
		}

		public void setNativePlace(String nativePlace) {
			this.nativePlace = nativePlace;
		}

		public String getPoliticalFace() {
			return politicalFace;
		}

		public void setPoliticalFace(String politicalFace) {
			this.politicalFace = politicalFace;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMobileNo() {
			return mobileNo;
		}

		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getLanguageInd() {
			return languageInd;
		}

		public void setLanguageInd(String languageInd) {
			this.languageInd = languageInd;
		}

		public Boolean getHaveChilds() {
			return haveChilds;
		}

		public void setHaveChilds(Boolean haveChilds) {
			this.haveChilds = haveChilds;
		}

		public String getFaceFlag() {
			return faceFlag;
		}

		public void setFaceFlag(String faceFlag) {
			this.faceFlag = faceFlag;
		}

		public Integer getOlVersion() {
			return olVersion;
		}

		public void setOlVersion(Integer olVersion) {
			this.olVersion = olVersion;
		}

		public String getCreditLevel() {
			return creditLevel;
		}

		public void setCreditLevel(String creditLevel) {
			this.creditLevel = creditLevel;
		}

		public String getEvaluateDate() {
			return evaluateDate;
		}

		public void setEvaluateDate(String evaluateDate) {
			this.evaluateDate = evaluateDate;
		}

		public String getIntro() {
			return intro;
		}

		public void setIntro(String intro) {
			this.intro = intro;
		}

		public BigDecimal getMonIncome() {
			return monIncome;
		}

		public void setMonIncome(BigDecimal monIncome) {
			this.monIncome = monIncome;
		}

		public BigDecimal getFamMonIncome() {
			return famMonIncome;
		}

		public void setFamMonIncome(BigDecimal famMonIncome) {
			this.famMonIncome = famMonIncome;
		}

		public BigDecimal getYearIncome() {
			return yearIncome;
		}

		public void setYearIncome(BigDecimal yearIncome) {
			this.yearIncome = yearIncome;
		}

		public String getIncomeSource() {
			return incomeSource;
		}

		public void setIncomeSource(String incomeSource) {
			this.incomeSource = incomeSource;
		}

		public Integer getPopulation() {
			return population;
		}

		public void setPopulation(Integer population) {
			this.population = population;
		}

		public Boolean getIsStaff() {
			return isStaff;
		}

		public void setIsStaff(Boolean isStaff) {
			this.isStaff = isStaff;
		}

		public String getRiskInc() {
			return riskInc;
		}

		public void setRiskInc(String riskInc) {
			this.riskInc = riskInc;
		}

		public String getCharacter() {
			return character;
		}

		public void setCharacter(String character) {
			this.character = character;
		}

		public String getQq() {
			return qq;
		}

		public void setQq(String qq) {
			this.qq = qq;
		}

		public String getWeichat() {
			return weichat;
		}

		public void setWeichat(String weichat) {
			this.weichat = weichat;
		}

		public String getWeiblog() {
			return weiblog;
		}

		public void setWeiblog(String weiblog) {
			this.weiblog = weiblog;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getLoginPassword() {
			return loginPassword;
		}

		public void setLoginPassword(String loginPassword) {
			this.loginPassword = loginPassword;
		}

		public String getBusinessPassword() {
			return businessPassword;
		}

		public void setBusinessPassword(String businessPassword) {
			this.businessPassword = businessPassword;
		}

		public String getSignPassword() {
			return signPassword;
		}

		public void setSignPassword(String signPassword) {
			this.signPassword = signPassword;
		}

		public Date getBizDate() {
			return bizDate;
		}

		public void setBizDate(Date bizDate) {
			this.bizDate = bizDate;
		}

		public static String getTableName() {
			return TABLE_NAME;
		}

		private String languageInd;

	    private Boolean haveChilds;

	    private String faceFlag;

	    private Integer olVersion;

	    private String creditLevel;

	    private String evaluateDate;

	    private String intro;

	    private BigDecimal monIncome;

	    private BigDecimal famMonIncome;

	    private BigDecimal yearIncome;

	    private String incomeSource;

	    private Integer population;

	    private Boolean isStaff;

	    private String riskInc;

	    private String character;

	    private String qq;

	    private String weichat;

	    private String weiblog;

	    private String phone;

	    private String loginPassword;

	    private String businessPassword;

	    private String signPassword;

	    private Date bizDate;
}
