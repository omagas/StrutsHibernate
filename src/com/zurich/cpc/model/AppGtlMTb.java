package com.zurich.cpc.model;

// Generated 2014/6/18 �U�� 04:24:04 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * AppGtlMTb generated by hbm2java
 */
public class AppGtlMTb implements java.io.Serializable {

	private AppGtlMTbId id;
	private String dataid;
	private Integer dataidverno;
	private String recptNo;
	private String cmpgnCd;
	private String hostRefProjCd;
	public String getDataid() {
		return dataid;
	}

	public void setDataid(String dataid) {
		this.dataid = dataid;
	}

	public Integer getDataidverno() {
		return dataidverno;
	}

	public void setDataidverno(Integer dataidverno) {
		this.dataidverno = dataidverno;
	}

	private Integer tourDays;
	private String tourAreaCd;
	private String tourCntyCd;
	private String tourPlaceDesc;
	private Integer tourCustCnt;
	private Integer childCustCnt;
	private Integer agedCustCnt;
	private Integer adultCustCnt;
	private Integer childCustPrm;
	private Integer agedCustPrm;
	private Integer adultCustPrm;
	private Character rskId01Mk;
	private Integer rskId01Amt;
	private Integer rskId01Prm;
	private Character rskId02Mk;
	private Integer rskId02Amt;
	private Integer rskId02Prm;
	private Character rskId03Mk;
	private Integer rskId03Amt;
	private Integer rskId03Prm;
	private Character rskId04Mk;
	private Integer rskId04Amt;
	private Integer rskId04Prm;
	private Character rskId05Mk;
	private Integer rskId05Amt;
	private Integer rskId05Prm;
	private Character rskId06Mk;
	private Integer rskId06Amt;
	private Integer rskId06Prm;
	private Character rskId07Mk;
	private Integer rskId07Amt;
	private Integer rskId07Prm;
	private Character rskId11Mk;
	private Integer rskId11Amt;
	private Integer rskId11Prm;
	private Character rskId12Mk;
	private Integer rskId12Amt;
	private Integer rskId12Prm;
	private Character rskId13Mk;
	private Integer rskId13Amt;
	private Integer rskId13Prm;
	private Character rskId14Mk;
	private Integer rskId14Amt;
	private Integer rskId14Prm;
	private Character rskId15Mk;
	private Integer rskId15Amt;
	private Integer rskId15Prm;
	private Character rskId16Mk;
	private Integer rskId16Amt;
	private Integer rskId16Prm;
	private Character rskId17Mk;
	private Integer rskId17Amt;
	private Integer rskId17Prm;
	private Character rskId18Mk;
	private Integer rskId18Amt;
	private Integer rskId18Prm;
	private Character rskId19Mk;
	private Integer rskId19Amt;
	private Integer rskId19Prm;
	private Integer totPrm;
	private String insuredInputTyp;
	private Character memberListTyp;
	private String procStatusCd;
	private String hostPolicyNo;
	private String hostPolicyTranNo;
	private String paymntCardAuthCd;
	private String paymntResponseCd;
	private String paymntResponseMsg;
	private String paymntTransSeqNo;
	private String paymntAuthDt;
	private Character paymntCancelMk;
	private String paymntCancelUsrId;
	private Date paymntCancelDt;
	private Integer kycVerNo;
	private Character cmpgnSelMk;
	private Character sameInsAmtMk;
	private Character ftpSendMk;
	private Character prtPcyMk;
	private Character prtRecptMk;
	private Character emailPcyMk;
	private Character emailRecptMk;
	private Character rapidInputMk;
	private Integer riTotPrm;
	private Character cpcinputMk;
	private Date mailPcyRecptDt;
	
	private AppMTb app;
	private String agentCd;
	private String issueBrhCd;
	private String custid;
	private String custemail;
	
	
	
	public AppGtlMTb() {
		
	}

	


	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getCustemail() {
		return custemail;
	}

	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}

	public String getIssueBrhCd() {
		return issueBrhCd;
	}

	public void setIssueBrhCd(String issueBrhCd) {
		this.issueBrhCd = issueBrhCd;
	}

	public String getAgentCd() {
		return agentCd;
	}

	public void setAgentCd(String agentCd) {
		this.agentCd = agentCd;
	}

	public AppGtlMTb(AppGtlMTbId id, String recptNo) {
		this.id = id;
		this.recptNo = recptNo;
	}

	public AppGtlMTb(AppGtlMTbId id, String recptNo, String cmpgnCd,
			String hostRefProjCd, Integer tourDays, String tourAreaCd,
			String tourCntyCd, String tourPlaceDesc, Integer tourCustCnt,
			Integer childCustCnt, Integer agedCustCnt, Integer adultCustCnt,
			Integer childCustPrm, Integer agedCustPrm, Integer adultCustPrm,
			Character rskId01Mk, Integer rskId01Amt, Integer rskId01Prm,
			Character rskId02Mk, Integer rskId02Amt, Integer rskId02Prm,
			Character rskId03Mk, Integer rskId03Amt, Integer rskId03Prm,
			Character rskId04Mk, Integer rskId04Amt, Integer rskId04Prm,
			Character rskId05Mk, Integer rskId05Amt, Integer rskId05Prm,
			Character rskId06Mk, Integer rskId06Amt, Integer rskId06Prm,
			Character rskId07Mk, Integer rskId07Amt, Integer rskId07Prm,
			Character rskId11Mk, Integer rskId11Amt, Integer rskId11Prm,
			Character rskId12Mk, Integer rskId12Amt, Integer rskId12Prm,
			Character rskId13Mk, Integer rskId13Amt, Integer rskId13Prm,
			Character rskId14Mk, Integer rskId14Amt, Integer rskId14Prm,
			Character rskId15Mk, Integer rskId15Amt, Integer rskId15Prm,
			Character rskId16Mk, Integer rskId16Amt, Integer rskId16Prm,
			Character rskId17Mk, Integer rskId17Amt, Integer rskId17Prm,
			Character rskId18Mk, Integer rskId18Amt, Integer rskId18Prm,
			Character rskId19Mk, Integer rskId19Amt, Integer rskId19Prm,
			Integer totPrm, String insuredInputTyp, Character memberListTyp,
			String procStatusCd, String hostPolicyNo, String hostPolicyTranNo,
			String paymntCardAuthCd, String paymntResponseCd,
			String paymntResponseMsg, String paymntTransSeqNo,
			String paymntAuthDt, Character paymntCancelMk,
			String paymntCancelUsrId, Date paymntCancelDt, Integer kycVerNo,
			Character cmpgnSelMk, Character sameInsAmtMk, Character ftpSendMk,
			Character prtPcyMk, Character prtRecptMk, Character emailPcyMk,
			Character emailRecptMk, Character rapidInputMk, Integer riTotPrm,
			Character cpcinputMk, Date mailPcyRecptDt) {
		this.id = id;
		this.recptNo = recptNo;
		this.cmpgnCd = cmpgnCd;
		this.hostRefProjCd = hostRefProjCd;
		this.tourDays = tourDays;
		this.tourAreaCd = tourAreaCd;
		this.tourCntyCd = tourCntyCd;
		this.tourPlaceDesc = tourPlaceDesc;
		this.tourCustCnt = tourCustCnt;
		this.childCustCnt = childCustCnt;
		this.agedCustCnt = agedCustCnt;
		this.adultCustCnt = adultCustCnt;
		this.childCustPrm = childCustPrm;
		this.agedCustPrm = agedCustPrm;
		this.adultCustPrm = adultCustPrm;
		this.rskId01Mk = rskId01Mk;
		this.rskId01Amt = rskId01Amt;
		this.rskId01Prm = rskId01Prm;
		this.rskId02Mk = rskId02Mk;
		this.rskId02Amt = rskId02Amt;
		this.rskId02Prm = rskId02Prm;
		this.rskId03Mk = rskId03Mk;
		this.rskId03Amt = rskId03Amt;
		this.rskId03Prm = rskId03Prm;
		this.rskId04Mk = rskId04Mk;
		this.rskId04Amt = rskId04Amt;
		this.rskId04Prm = rskId04Prm;
		this.rskId05Mk = rskId05Mk;
		this.rskId05Amt = rskId05Amt;
		this.rskId05Prm = rskId05Prm;
		this.rskId06Mk = rskId06Mk;
		this.rskId06Amt = rskId06Amt;
		this.rskId06Prm = rskId06Prm;
		this.rskId07Mk = rskId07Mk;
		this.rskId07Amt = rskId07Amt;
		this.rskId07Prm = rskId07Prm;
		this.rskId11Mk = rskId11Mk;
		this.rskId11Amt = rskId11Amt;
		this.rskId11Prm = rskId11Prm;
		this.rskId12Mk = rskId12Mk;
		this.rskId12Amt = rskId12Amt;
		this.rskId12Prm = rskId12Prm;
		this.rskId13Mk = rskId13Mk;
		this.rskId13Amt = rskId13Amt;
		this.rskId13Prm = rskId13Prm;
		this.rskId14Mk = rskId14Mk;
		this.rskId14Amt = rskId14Amt;
		this.rskId14Prm = rskId14Prm;
		this.rskId15Mk = rskId15Mk;
		this.rskId15Amt = rskId15Amt;
		this.rskId15Prm = rskId15Prm;
		this.rskId16Mk = rskId16Mk;
		this.rskId16Amt = rskId16Amt;
		this.rskId16Prm = rskId16Prm;
		this.rskId17Mk = rskId17Mk;
		this.rskId17Amt = rskId17Amt;
		this.rskId17Prm = rskId17Prm;
		this.rskId18Mk = rskId18Mk;
		this.rskId18Amt = rskId18Amt;
		this.rskId18Prm = rskId18Prm;
		this.rskId19Mk = rskId19Mk;
		this.rskId19Amt = rskId19Amt;
		this.rskId19Prm = rskId19Prm;
		this.totPrm = totPrm;
		this.insuredInputTyp = insuredInputTyp;
		this.memberListTyp = memberListTyp;
		this.procStatusCd = procStatusCd;
		this.hostPolicyNo = hostPolicyNo;
		this.hostPolicyTranNo = hostPolicyTranNo;
		this.paymntCardAuthCd = paymntCardAuthCd;
		this.paymntResponseCd = paymntResponseCd;
		this.paymntResponseMsg = paymntResponseMsg;
		this.paymntTransSeqNo = paymntTransSeqNo;
		this.paymntAuthDt = paymntAuthDt;
		this.paymntCancelMk = paymntCancelMk;
		this.paymntCancelUsrId = paymntCancelUsrId;
		this.paymntCancelDt = paymntCancelDt;
		this.kycVerNo = kycVerNo;
		this.cmpgnSelMk = cmpgnSelMk;
		this.sameInsAmtMk = sameInsAmtMk;
		this.ftpSendMk = ftpSendMk;
		this.prtPcyMk = prtPcyMk;
		this.prtRecptMk = prtRecptMk;
		this.emailPcyMk = emailPcyMk;
		this.emailRecptMk = emailRecptMk;
		this.rapidInputMk = rapidInputMk;
		this.riTotPrm = riTotPrm;
		this.cpcinputMk = cpcinputMk;
		this.mailPcyRecptDt = mailPcyRecptDt;
	}

	public AppGtlMTbId getId() {
		return this.id;
	}

	public void setId(AppGtlMTbId id) {
		this.id = id;
	}

	public String getRecptNo() {
		return this.recptNo;
	}

	public void setRecptNo(String recptNo) {
		this.recptNo = recptNo;
	}

	public String getCmpgnCd() {
		return this.cmpgnCd;
	}

	public void setCmpgnCd(String cmpgnCd) {
		this.cmpgnCd = cmpgnCd;
	}

	public String getHostRefProjCd() {
		return this.hostRefProjCd;
	}

	public void setHostRefProjCd(String hostRefProjCd) {
		this.hostRefProjCd = hostRefProjCd;
	}

	public Integer getTourDays() {
		return this.tourDays;
	}

	public void setTourDays(Integer tourDays) {
		this.tourDays = tourDays;
	}

	public String getTourAreaCd() {
		return this.tourAreaCd;
	}

	public void setTourAreaCd(String tourAreaCd) {
		this.tourAreaCd = tourAreaCd;
	}

	public String getTourCntyCd() {
		return this.tourCntyCd;
	}

	public void setTourCntyCd(String tourCntyCd) {
		this.tourCntyCd = tourCntyCd;
	}

	public String getTourPlaceDesc() {
		return this.tourPlaceDesc;
	}

	public void setTourPlaceDesc(String tourPlaceDesc) {
		this.tourPlaceDesc = tourPlaceDesc;
	}

	public Integer getTourCustCnt() {
		return this.tourCustCnt;
	}

	public void setTourCustCnt(Integer tourCustCnt) {
		this.tourCustCnt = tourCustCnt;
	}

	public Integer getChildCustCnt() {
		return this.childCustCnt;
	}

	public void setChildCustCnt(Integer childCustCnt) {
		this.childCustCnt = childCustCnt;
	}

	public Integer getAgedCustCnt() {
		return this.agedCustCnt;
	}

	public void setAgedCustCnt(Integer agedCustCnt) {
		this.agedCustCnt = agedCustCnt;
	}

	public Integer getAdultCustCnt() {
		return this.adultCustCnt;
	}

	public void setAdultCustCnt(Integer adultCustCnt) {
		this.adultCustCnt = adultCustCnt;
	}

	public Integer getChildCustPrm() {
		return this.childCustPrm;
	}

	public void setChildCustPrm(Integer childCustPrm) {
		this.childCustPrm = childCustPrm;
	}

	public Integer getAgedCustPrm() {
		return this.agedCustPrm;
	}

	public void setAgedCustPrm(Integer agedCustPrm) {
		this.agedCustPrm = agedCustPrm;
	}

	public Integer getAdultCustPrm() {
		return this.adultCustPrm;
	}

	public void setAdultCustPrm(Integer adultCustPrm) {
		this.adultCustPrm = adultCustPrm;
	}

	public Character getRskId01Mk() {
		return this.rskId01Mk;
	}

	public void setRskId01Mk(Character rskId01Mk) {
		this.rskId01Mk = rskId01Mk;
	}

	public Integer getRskId01Amt() {
		return this.rskId01Amt;
	}

	public void setRskId01Amt(Integer rskId01Amt) {
		this.rskId01Amt = rskId01Amt;
	}

	public Integer getRskId01Prm() {
		return this.rskId01Prm;
	}

	public void setRskId01Prm(Integer rskId01Prm) {
		this.rskId01Prm = rskId01Prm;
	}

	public Character getRskId02Mk() {
		return this.rskId02Mk;
	}

	public void setRskId02Mk(Character rskId02Mk) {
		this.rskId02Mk = rskId02Mk;
	}

	public Integer getRskId02Amt() {
		return this.rskId02Amt;
	}

	public void setRskId02Amt(Integer rskId02Amt) {
		this.rskId02Amt = rskId02Amt;
	}

	public Integer getRskId02Prm() {
		return this.rskId02Prm;
	}

	public void setRskId02Prm(Integer rskId02Prm) {
		this.rskId02Prm = rskId02Prm;
	}

	public Character getRskId03Mk() {
		return this.rskId03Mk;
	}

	public void setRskId03Mk(Character rskId03Mk) {
		this.rskId03Mk = rskId03Mk;
	}

	public Integer getRskId03Amt() {
		return this.rskId03Amt;
	}

	public void setRskId03Amt(Integer rskId03Amt) {
		this.rskId03Amt = rskId03Amt;
	}

	public Integer getRskId03Prm() {
		return this.rskId03Prm;
	}

	public void setRskId03Prm(Integer rskId03Prm) {
		this.rskId03Prm = rskId03Prm;
	}

	public Character getRskId04Mk() {
		return this.rskId04Mk;
	}

	public void setRskId04Mk(Character rskId04Mk) {
		this.rskId04Mk = rskId04Mk;
	}

	public Integer getRskId04Amt() {
		return this.rskId04Amt;
	}

	public void setRskId04Amt(Integer rskId04Amt) {
		this.rskId04Amt = rskId04Amt;
	}

	public Integer getRskId04Prm() {
		return this.rskId04Prm;
	}

	public void setRskId04Prm(Integer rskId04Prm) {
		this.rskId04Prm = rskId04Prm;
	}

	public Character getRskId05Mk() {
		return this.rskId05Mk;
	}

	public void setRskId05Mk(Character rskId05Mk) {
		this.rskId05Mk = rskId05Mk;
	}

	public Integer getRskId05Amt() {
		return this.rskId05Amt;
	}

	public void setRskId05Amt(Integer rskId05Amt) {
		this.rskId05Amt = rskId05Amt;
	}

	public Integer getRskId05Prm() {
		return this.rskId05Prm;
	}

	public void setRskId05Prm(Integer rskId05Prm) {
		this.rskId05Prm = rskId05Prm;
	}

	public Character getRskId06Mk() {
		return this.rskId06Mk;
	}

	public void setRskId06Mk(Character rskId06Mk) {
		this.rskId06Mk = rskId06Mk;
	}

	public Integer getRskId06Amt() {
		return this.rskId06Amt;
	}

	public void setRskId06Amt(Integer rskId06Amt) {
		this.rskId06Amt = rskId06Amt;
	}

	public Integer getRskId06Prm() {
		return this.rskId06Prm;
	}

	public void setRskId06Prm(Integer rskId06Prm) {
		this.rskId06Prm = rskId06Prm;
	}

	public Character getRskId07Mk() {
		return this.rskId07Mk;
	}

	public void setRskId07Mk(Character rskId07Mk) {
		this.rskId07Mk = rskId07Mk;
	}

	public Integer getRskId07Amt() {
		return this.rskId07Amt;
	}

	public void setRskId07Amt(Integer rskId07Amt) {
		this.rskId07Amt = rskId07Amt;
	}

	public Integer getRskId07Prm() {
		return this.rskId07Prm;
	}

	public void setRskId07Prm(Integer rskId07Prm) {
		this.rskId07Prm = rskId07Prm;
	}

	public Character getRskId11Mk() {
		return this.rskId11Mk;
	}

	public void setRskId11Mk(Character rskId11Mk) {
		this.rskId11Mk = rskId11Mk;
	}

	public Integer getRskId11Amt() {
		return this.rskId11Amt;
	}

	public void setRskId11Amt(Integer rskId11Amt) {
		this.rskId11Amt = rskId11Amt;
	}

	public Integer getRskId11Prm() {
		return this.rskId11Prm;
	}

	public void setRskId11Prm(Integer rskId11Prm) {
		this.rskId11Prm = rskId11Prm;
	}

	public Character getRskId12Mk() {
		return this.rskId12Mk;
	}

	public void setRskId12Mk(Character rskId12Mk) {
		this.rskId12Mk = rskId12Mk;
	}

	public Integer getRskId12Amt() {
		return this.rskId12Amt;
	}

	public void setRskId12Amt(Integer rskId12Amt) {
		this.rskId12Amt = rskId12Amt;
	}

	public Integer getRskId12Prm() {
		return this.rskId12Prm;
	}

	public void setRskId12Prm(Integer rskId12Prm) {
		this.rskId12Prm = rskId12Prm;
	}

	public Character getRskId13Mk() {
		return this.rskId13Mk;
	}

	public void setRskId13Mk(Character rskId13Mk) {
		this.rskId13Mk = rskId13Mk;
	}

	public Integer getRskId13Amt() {
		return this.rskId13Amt;
	}

	public void setRskId13Amt(Integer rskId13Amt) {
		this.rskId13Amt = rskId13Amt;
	}

	public Integer getRskId13Prm() {
		return this.rskId13Prm;
	}

	public void setRskId13Prm(Integer rskId13Prm) {
		this.rskId13Prm = rskId13Prm;
	}

	public Character getRskId14Mk() {
		return this.rskId14Mk;
	}

	public void setRskId14Mk(Character rskId14Mk) {
		this.rskId14Mk = rskId14Mk;
	}

	public Integer getRskId14Amt() {
		return this.rskId14Amt;
	}

	public void setRskId14Amt(Integer rskId14Amt) {
		this.rskId14Amt = rskId14Amt;
	}

	public Integer getRskId14Prm() {
		return this.rskId14Prm;
	}

	public void setRskId14Prm(Integer rskId14Prm) {
		this.rskId14Prm = rskId14Prm;
	}

	public Character getRskId15Mk() {
		return this.rskId15Mk;
	}

	public void setRskId15Mk(Character rskId15Mk) {
		this.rskId15Mk = rskId15Mk;
	}

	public Integer getRskId15Amt() {
		return this.rskId15Amt;
	}

	public void setRskId15Amt(Integer rskId15Amt) {
		this.rskId15Amt = rskId15Amt;
	}

	public Integer getRskId15Prm() {
		return this.rskId15Prm;
	}

	public void setRskId15Prm(Integer rskId15Prm) {
		this.rskId15Prm = rskId15Prm;
	}

	public Character getRskId16Mk() {
		return this.rskId16Mk;
	}

	public void setRskId16Mk(Character rskId16Mk) {
		this.rskId16Mk = rskId16Mk;
	}

	public Integer getRskId16Amt() {
		return this.rskId16Amt;
	}

	public void setRskId16Amt(Integer rskId16Amt) {
		this.rskId16Amt = rskId16Amt;
	}

	public Integer getRskId16Prm() {
		return this.rskId16Prm;
	}

	public void setRskId16Prm(Integer rskId16Prm) {
		this.rskId16Prm = rskId16Prm;
	}

	public Character getRskId17Mk() {
		return this.rskId17Mk;
	}

	public void setRskId17Mk(Character rskId17Mk) {
		this.rskId17Mk = rskId17Mk;
	}

	public Integer getRskId17Amt() {
		return this.rskId17Amt;
	}

	public void setRskId17Amt(Integer rskId17Amt) {
		this.rskId17Amt = rskId17Amt;
	}

	public Integer getRskId17Prm() {
		return this.rskId17Prm;
	}

	public void setRskId17Prm(Integer rskId17Prm) {
		this.rskId17Prm = rskId17Prm;
	}

	public Character getRskId18Mk() {
		return this.rskId18Mk;
	}

	public void setRskId18Mk(Character rskId18Mk) {
		this.rskId18Mk = rskId18Mk;
	}

	public Integer getRskId18Amt() {
		return this.rskId18Amt;
	}

	public void setRskId18Amt(Integer rskId18Amt) {
		this.rskId18Amt = rskId18Amt;
	}

	public Integer getRskId18Prm() {
		return this.rskId18Prm;
	}

	public void setRskId18Prm(Integer rskId18Prm) {
		this.rskId18Prm = rskId18Prm;
	}

	public Character getRskId19Mk() {
		return this.rskId19Mk;
	}

	public void setRskId19Mk(Character rskId19Mk) {
		this.rskId19Mk = rskId19Mk;
	}

	public Integer getRskId19Amt() {
		return this.rskId19Amt;
	}

	public void setRskId19Amt(Integer rskId19Amt) {
		this.rskId19Amt = rskId19Amt;
	}

	public Integer getRskId19Prm() {
		return this.rskId19Prm;
	}

	public void setRskId19Prm(Integer rskId19Prm) {
		this.rskId19Prm = rskId19Prm;
	}

	public Integer getTotPrm() {
		return this.totPrm;
	}

	public void setTotPrm(Integer totPrm) {
		this.totPrm = totPrm;
	}

	public String getInsuredInputTyp() {
		return this.insuredInputTyp;
	}

	public void setInsuredInputTyp(String insuredInputTyp) {
		this.insuredInputTyp = insuredInputTyp;
	}

	public Character getMemberListTyp() {
		return this.memberListTyp;
	}

	public void setMemberListTyp(Character memberListTyp) {
		this.memberListTyp = memberListTyp;
	}

	public String getProcStatusCd() {
		return this.procStatusCd;
	}

	public void setProcStatusCd(String procStatusCd) {
		this.procStatusCd = procStatusCd;
	}

	public String getHostPolicyNo() {
		return this.hostPolicyNo;
	}

	public void setHostPolicyNo(String hostPolicyNo) {
		this.hostPolicyNo = hostPolicyNo;
	}

	public String getHostPolicyTranNo() {
		return this.hostPolicyTranNo;
	}

	public void setHostPolicyTranNo(String hostPolicyTranNo) {
		this.hostPolicyTranNo = hostPolicyTranNo;
	}

	public String getPaymntCardAuthCd() {
		return this.paymntCardAuthCd;
	}

	public void setPaymntCardAuthCd(String paymntCardAuthCd) {
		this.paymntCardAuthCd = paymntCardAuthCd;
	}

	public String getPaymntResponseCd() {
		return this.paymntResponseCd;
	}

	public void setPaymntResponseCd(String paymntResponseCd) {
		this.paymntResponseCd = paymntResponseCd;
	}

	public String getPaymntResponseMsg() {
		return this.paymntResponseMsg;
	}

	public void setPaymntResponseMsg(String paymntResponseMsg) {
		this.paymntResponseMsg = paymntResponseMsg;
	}

	public String getPaymntTransSeqNo() {
		return this.paymntTransSeqNo;
	}

	public void setPaymntTransSeqNo(String paymntTransSeqNo) {
		this.paymntTransSeqNo = paymntTransSeqNo;
	}

	public String getPaymntAuthDt() {
		return this.paymntAuthDt;
	}

	public void setPaymntAuthDt(String paymntAuthDt) {
		this.paymntAuthDt = paymntAuthDt;
	}

	public Character getPaymntCancelMk() {
		return this.paymntCancelMk;
	}

	public void setPaymntCancelMk(Character paymntCancelMk) {
		this.paymntCancelMk = paymntCancelMk;
	}

	public String getPaymntCancelUsrId() {
		return this.paymntCancelUsrId;
	}

	public void setPaymntCancelUsrId(String paymntCancelUsrId) {
		this.paymntCancelUsrId = paymntCancelUsrId;
	}

	public Date getPaymntCancelDt() {
		return this.paymntCancelDt;
	}

	public void setPaymntCancelDt(Date paymntCancelDt) {
		this.paymntCancelDt = paymntCancelDt;
	}

	public Integer getKycVerNo() {
		return this.kycVerNo;
	}

	public void setKycVerNo(Integer kycVerNo) {
		this.kycVerNo = kycVerNo;
	}

	public Character getCmpgnSelMk() {
		return this.cmpgnSelMk;
	}

	public void setCmpgnSelMk(Character cmpgnSelMk) {
		this.cmpgnSelMk = cmpgnSelMk;
	}

	public Character getSameInsAmtMk() {
		return this.sameInsAmtMk;
	}

	public void setSameInsAmtMk(Character sameInsAmtMk) {
		this.sameInsAmtMk = sameInsAmtMk;
	}

	public Character getFtpSendMk() {
		return this.ftpSendMk;
	}

	public void setFtpSendMk(Character ftpSendMk) {
		this.ftpSendMk = ftpSendMk;
	}

	public Character getPrtPcyMk() {
		return this.prtPcyMk;
	}

	public void setPrtPcyMk(Character prtPcyMk) {
		this.prtPcyMk = prtPcyMk;
	}

	public Character getPrtRecptMk() {
		return this.prtRecptMk;
	}

	public void setPrtRecptMk(Character prtRecptMk) {
		this.prtRecptMk = prtRecptMk;
	}

	public Character getEmailPcyMk() {
		return this.emailPcyMk;
	}

	public void setEmailPcyMk(Character emailPcyMk) {
		this.emailPcyMk = emailPcyMk;
	}

	public Character getEmailRecptMk() {
		return this.emailRecptMk;
	}

	public void setEmailRecptMk(Character emailRecptMk) {
		this.emailRecptMk = emailRecptMk;
	}

	public Character getRapidInputMk() {
		return this.rapidInputMk;
	}

	public void setRapidInputMk(Character rapidInputMk) {
		this.rapidInputMk = rapidInputMk;
	}

	public Integer getRiTotPrm() {
		return this.riTotPrm;
	}

	public void setRiTotPrm(Integer riTotPrm) {
		this.riTotPrm = riTotPrm;
	}

	public Character getCpcinputMk() {
		return this.cpcinputMk;
	}

	public void setCpcinputMk(Character cpcinputMk) {
		this.cpcinputMk = cpcinputMk;
	}

	public Date getMailPcyRecptDt() {
		return this.mailPcyRecptDt;
	}

	public void setMailPcyRecptDt(Date mailPcyRecptDt) {
		this.mailPcyRecptDt = mailPcyRecptDt;
	}

}
