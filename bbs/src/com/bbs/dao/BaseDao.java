package com.bbs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BaseDao {
	
	private static final String DRIVER_CLASS="oracle.jdbc.driver.OracleDriver";
	private static final String URL="jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String USER="crm_user01";
	private static final String PWD="a1234";
	
	
	private Connection conn=null;
	private PreparedStatement pstm=null;
	private ResultSet rs=null;
	/**
	 * 获取连接的方法
	 * @return
	 */
	public Connection getConnection(){
		try {
			Class.forName(DRIVER_CLASS);
			conn=DriverManager.getConnection(URL,USER,PWD);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * 使用JDBC实现增删改,不带占位符
	 * @param sql
	 * @return
	 */
	public int executeUpdate(String sql){
		return this.executeUpdate(sql, new Object[]{});
	}
	public int executeUpdate(String sql,List params){
		int ret=0;
		//获得连接
		conn=this.getConnection();
		try {
			pstm=conn.prepareStatement(sql);
			if(params!=null){
				for(int i=0;i<params.size();i++){
					pstm.setObject(i+1, params.get(i));
				}
			}
			ret=pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				pstm.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return ret;
	}
	/**
	 * 使用JDBC实现增删改,带占位符
	 * @param sql
	 * @param params 传入占位符的数据
	 * @return
	 */
	public int executeUpdate(String sql,Object[] params){
		int ret=0;
		//获得连接
		conn=this.getConnection();
		try {
			pstm=conn.prepareStatement(sql);
			if(params!=null){
				for(int i=0;i<params.length;i++){
					pstm.setObject(i+1, params[i]);
				}
			}
			ret=pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				pstm.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return ret;
	}
	public int executeUpdate(String sql,Object params){
		return executeUpdate(sql,new Object[]{params});
	}
	public ResultSet executeQuery(String sql){
		return executeQuery(sql,new Object[]{});
	}
	public ResultSet executeQuery(String sql,Object params){
		return executeQuery(sql,new Object[]{params});
	}
	public ResultSet executeQuery(String sql,List params){
		
		return executeQuery(sql,params.toArray());
	}
	/**
	 * 实现查询
	 */
	public ResultSet executeQuery(String sql,Object[] params){
		conn=this.getConnection();
		try {
			pstm=conn.prepareStatement(sql);
			if(params!=null){
				for(int i=0;i<params.length;i++){
					pstm.setObject(i+1, params[i]);
				}
			}
			rs=pstm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public void close(){
			try {
				if(rs!=null)rs.close();
				if(pstm!=null)pstm.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
}
