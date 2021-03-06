package com.zurich.cpc.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import net.viralpatel.contact.util.HibernateUtil;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;


import com.zurich.cpc.model.*;
//import com.zurich.sds.model.gtl.hibernate.entity.CmpgnRefTb;
//import net.viralpatel.contact.model.Contact;
//import com.zurich.sds.model.gtl.hibernate.entity.CmpgnRefTb;

public class AppMTbDao extends HibernateUtil{



	private List<AppGtlMTb> resultList;

	public AppMTb add(AppMTb appMTb) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(appMTb);
		session.getTransaction().commit();
		return appMTb;
	}
	
	public AppMTb delete(Long dataId) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		AppMTb appMTb = (AppMTb) session.load(AppMTb.class, dataId);
		if(null != appMTb) {
			session.delete(appMTb);
		}
		session.getTransaction().commit();
		return appMTb;
	}
	
//	public String update(String hostPolicyNoT) {
//		Calendar cal = Calendar.getInstance();  
//		cal.setTime(new Date());
//		
//		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//		session.beginTransaction();	
//		try{
//		   Query q = session.createQuery("from AppGtlMTb where hostPolicyNo = :hostPolicyNo ");
//		   q.setParameter("hostPolicyNo", hostPolicyNoT);
//		   AppGtlMTb appGtlMTb = (AppGtlMTb)q.list().get(0);
//		   appGtlMTb.setMailPcyRecptDt(cal.getTime());
//		   session.update(appGtlMTb);
//		}catch(HibernateException e){
//			e.printStackTrace();
//			session.getTransaction().rollback();			
//		}
//		   
//		return "sucess";
//		   
//	}	

	public int update(String hostPolicyNoT) {
		int updated = 0;
		Calendar cal = Calendar.getInstance();  
		cal.setTime(new Date());
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		tx=session.beginTransaction();	

	
		try{
		Query deleteQuery = session.createSQLQuery("update APP_GTL_M_Tb set Mail_PcyRecpt_Dt=getDate()  where Host_Policy_No=?");
			deleteQuery.setString(0, hostPolicyNoT);
			updated = deleteQuery.executeUpdate();
			
		    System.out.println("hostPolicyNoT"+hostPolicyNoT);
		    System.out.println("updated"+updated);

		    	session.getTransaction().commit(); 

		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		   
		
		
		return updated;
	   
	}		
	
	public List<AppMTb> list() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<AppMTb> appMTb = null;
		try {
			
			appMTb = (List<AppMTb>)session.createQuery("from AppMTb").list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return appMTb;
	}
	
	public List<AppGtlMTb> listsql() {
		AppGtlMTb appGtlMTb = new AppGtlMTb();
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		tx=session.beginTransaction();
	
						StringBuffer sql = new StringBuffer();
						sql.append("SELECT CONVERT(nvarchar(100), Host_Policy_No) AS Host_Policy_No,CONVERT(nvarchar(100), G.Data_ID) AS Data_ID,CONVERT(int,G. Data_ID_Verno) AS Data_ID_Verno,Email_Pcy_MK,Email_Recpt_MK,CONVERT(nvarchar(100),M.Agnt_CD) AS Agnt_CD,CONVERT(nvarchar(100),Issue_Brh_CD) AS Issue_Brh_CD,CONVERT(nvarchar(100),C.Cust_ID) as Cust_ID,CONVERT(nvarchar(100),C.Cust_EMail) as Cust_EMail " +
								"from App_GTL_M_Tb G left join Cust_Detail_Tb C on G.Data_id=C.Data_id and G.Data_ID_Verno=C.Data_ID_Verno left join App_M_Tb M on G.Data_ID=M.Data_ID    WHERE 1=1 AND Host_Policy_No>='04313554' and (Email_Pcy_MK='Y' or Email_Recpt_MK='Y') and C.Cust_Role_CD='A' and Mail_PcyRecpt_Dt is NULL");
						
						
					    SQLQuery query = session.createSQLQuery(sql.toString());
//					    query.setString("osType","04313554");
//					    query.addScalar("Host_Policy_No", Hibernate.STRING);
//					    query.addScalar("Data_ID", Hibernate.STRING);
//					    query.addScalar("Data_ID_Verno", Hibernate.STRING);
					    
				        query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

						//List<Object[]> query = session.createSQLQuery(sql.toString()).setString("osType","04313554").addScalar("Host_Policy_No", Hibernate.STRING).addScalar("Data_ID", Hibernate.STRING).addScalar("Data_ID_Verno", Hibernate.STRING).list();					    

				        List  result = query.list();	
				        List<AppGtlMTb> resultList = new ArrayList<AppGtlMTb>();
				        try{
				        
					        for (Object object :result) {
					        	AppGtlMTb appGtlMTbR = new AppGtlMTb();
					        	
					        	Map qqq = (Map) object;
					        	//appGtlMTb.setHostPolicyNo(String.valueOf(map.get("Host_Policy_No")));
					            System.out.print("Host_Policy_No: " + qqq.get("Host_Policy_No")); 
					            System.out.print(", Data_ID: " + qqq.get("Data_ID"));
					            System.out.println(", Cust_EMail: " + qqq.get("Cust_EMail"));				            
					        
					            appGtlMTbR.setHostPolicyNo(String.valueOf(qqq.get("Host_Policy_No")));
					            appGtlMTbR.setDataid(String.valueOf(qqq.get("Data_ID")));
					            appGtlMTbR.setDataidverno(Integer.parseInt(String.valueOf(((qqq.get("Data_ID_Verno"))))));
					            appGtlMTbR.setEmailPcyMk(Character.valueOf((Character) qqq.get("Email_Pcy_MK")));
					            appGtlMTbR.setEmailRecptMk(Character.valueOf((Character) qqq.get("Email_Recpt_MK")));
					            appGtlMTbR.setAgentCd(String.valueOf(qqq.get("Agnt_CD")));
					            appGtlMTbR.setIssueBrhCd(String.valueOf(qqq.get("Issue_Brh_CD")));
					            appGtlMTbR.setCustid(String.valueOf(qqq.get("Cust_ID")));
					            appGtlMTbR.setCustemail(String.valueOf(qqq.get("Cust_EMail")));
					            
					            resultList.add(appGtlMTbR);
					        }	
				        
						} catch (HibernateException e) {
							e.printStackTrace();
							session.getTransaction().rollback();
						}
				        //System.out.println("SizeSizeSizeSize:"+resultList.get(0).getHostPolicyNo());
				        
				        
				//            CmpgnRefTb cmpgnRefTb = new CmpgnRefTb();
				//            Map map = (Map) item;
				//            cmpgnRefTb.setCmpgnCd(String.valueOf(map.get("Cmpgn_CD")));
				//            cmpgnRefTb.setCmpgnNm(String.valueOf(map.get("Cmpgn_Nm")));
				//            cmpgnRefTb.setGtlAllowDomesticMk(String.valueOf(map.get("GTL_Allow_Domestic_MK")));
				//            cmpgnRefTb.setGtlLimitSchengenMk(String.valueOf(map.get("GTL_Limit_Schengen_MK")));
				//            resultList.add(cmpgnRefTb);
				        

				//		
				//        return resultList;

		
		return resultList;
	}	
	
	
	public List<AppGtlMTb> listsql(String policyno) {
		AppGtlMTb appGtlMTb = new AppGtlMTb();
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		tx=session.beginTransaction();
	
						StringBuffer sql = new StringBuffer();
						sql.append("SELECT CONVERT(nvarchar(100), Host_Policy_No) AS Host_Policy_No,CONVERT(nvarchar(100), G.Data_ID) AS Data_ID,CONVERT(int,G. Data_ID_Verno) AS Data_ID_Verno,Email_Pcy_MK,Email_Recpt_MK,CONVERT(nvarchar(100),M.Agnt_CD) AS Agnt_CD,CONVERT(nvarchar(100),Issue_Brh_CD) AS Issue_Brh_CD,CONVERT(nvarchar(100),C.Cust_ID) as Cust_ID,CONVERT(nvarchar(100),C.Cust_EMail) as Cust_EMail " +
								"from App_GTL_M_Tb G left join Cust_Detail_Tb C on G.Data_id=C.Data_id and G.Data_ID_Verno=C.Data_ID_Verno left join App_M_Tb M on G.Data_ID=M.Data_ID    WHERE 1=1");
						sql.append(" AND Host_Policy_No='"+policyno+"' and (Email_Pcy_MK='Y' or Email_Recpt_MK='Y') and C.Cust_Role_CD='A'");
						
					    SQLQuery query = session.createSQLQuery(sql.toString());
//					    query.setString("osType","04313554");
//					    query.addScalar("Host_Policy_No", Hibernate.STRING);
//					    query.addScalar("Data_ID", Hibernate.STRING);
//					    query.addScalar("Data_ID_Verno", Hibernate.STRING);
					    
				        query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

						//List<Object[]> query = session.createSQLQuery(sql.toString()).setString("osType","04313554").addScalar("Host_Policy_No", Hibernate.STRING).addScalar("Data_ID", Hibernate.STRING).addScalar("Data_ID_Verno", Hibernate.STRING).list();					    

				        List  result = query.list();	
				        List<AppGtlMTb> resultList = new ArrayList<AppGtlMTb>();
				        try{
				        
					        for (Object object :result) {
					        	AppGtlMTb appGtlMTbR = new AppGtlMTb();
					        	
					        	Map qqq = (Map) object;
					        	//appGtlMTb.setHostPolicyNo(String.valueOf(map.get("Host_Policy_No")));
					            System.out.print("Host_Policy_No: " + qqq.get("Host_Policy_No")); 
					            System.out.print(", Data_ID: " + qqq.get("Data_ID"));
					            System.out.println(", Cust_EMail: " + qqq.get("Cust_EMail"));				            
					        
					            appGtlMTbR.setHostPolicyNo(String.valueOf(qqq.get("Host_Policy_No")));
					            appGtlMTbR.setDataid(String.valueOf(qqq.get("Data_ID")));
					            appGtlMTbR.setDataidverno(Integer.parseInt(String.valueOf(((qqq.get("Data_ID_Verno"))))));
					            appGtlMTbR.setEmailPcyMk(Character.valueOf((Character) qqq.get("Email_Pcy_MK")));
					            appGtlMTbR.setEmailRecptMk(Character.valueOf((Character) qqq.get("Email_Recpt_MK")));
					            appGtlMTbR.setAgentCd(String.valueOf(qqq.get("Agnt_CD")));
					            appGtlMTbR.setIssueBrhCd(String.valueOf(qqq.get("Issue_Brh_CD")));
					            appGtlMTbR.setCustid(String.valueOf(qqq.get("Cust_ID")));
					            appGtlMTbR.setCustemail(String.valueOf(qqq.get("Cust_EMail")));
					            
					            resultList.add(appGtlMTbR);
					        }	
				        
						} catch (HibernateException e) {
							e.printStackTrace();
							session.getTransaction().rollback();
						}
		
		return resultList;
	}
	
	
	
	//Example for nativeSQL
//	List<Person> peopleWithBooks = session.createSQLQuery(
//			   "select {p.*}, {b.*} from person p, book b where <complicated join>").
//			     .addEntity("p", Person.class)
//			     .addJoin("b", "p.books")
//			     .addEntity("p", Person.class)
//			     .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
//			     .list();	
	
	
//	  public List<CmpgnRefTb> getAgntCmpgnList(String agntCD, String prdtCD, String tourArea, String limitSchengen) {
//	        Session session = this.getSessionFactory().getCurrentSession();
//	        StringBuffer sql = new StringBuffer();
//	        //-------------------------appGTLMTB
//	        //�NA.Total_Prm AS total_Prm, �אּ B.Tot_Prm AS GTL_Tot_Prm,�� Q.Tot_Prm AS QT_Tot_Prm, Wade   2/18
//	        sql.append(" select C.* from Cmpgn_Ref_Tb AS C inner join gtl_cmpgnAgnt_ref_tb AS G ON C.cmpgn_CD = G.cmpgn_CD WHERE  1 = 1 ");
//
//	        if (StringUtils.isNotBlank(agntCD)) {
//	            if (agntCD.length() > 5) {
//	                agntCD = agntCD.substring(0, 5);
//	            }
//	            sql.append(" AND G.agnt_CD like '"+ agntCD +"%' ");
//	        }
//
//	        if (StringUtils.isNotBlank(prdtCD)) {
//	            sql.append(" AND C.Prdt_CD='"+prdtCD+"' ");
//	        }
//
//	        if (StringUtils.isNotBlank(tourArea)) {
//	            sql.append(" AND C.GTL_Allow_Domestic_MK='"+tourArea+"' ");
//	        }
//
//	        if (StringUtils.isNotBlank(limitSchengen)) {
//	            sql.append(" AND C.GTL_Limit_Schengen_MK='"+limitSchengen+"' ");
//	        }
//
//	        Query query = session.createSQLQuery(sql.toString());
//	        query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
//	        List<Object> result = query.list();
//	        List<CmpgnRefTb> resultList = new ArrayList<CmpgnRefTb>();
//	        for (Object item :result) {
//	            CmpgnRefTb cmpgnRefTb = new CmpgnRefTb();
//	            Map map = (Map) item;
//	            cmpgnRefTb.setCmpgnCd(String.valueOf(map.get("Cmpgn_CD")));
//	            cmpgnRefTb.setCmpgnNm(String.valueOf(map.get("Cmpgn_Nm")));
//	            cmpgnRefTb.setGtlAllowDomesticMk(String.valueOf(map.get("GTL_Allow_Domestic_MK")));
//	            cmpgnRefTb.setGtlLimitSchengenMk(String.valueOf(map.get("GTL_Limit_Schengen_MK")));
//	            resultList.add(cmpgnRefTb);
//	        }
//
//	        return resultList;
//	    }	
	
}
