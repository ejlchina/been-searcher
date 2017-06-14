package com.ejl.searcher.temp;


/**
 * @author Troy.Zhou @ 2017-03-20
 * 检索中间对象接口
 * */
public interface SearchTmpData {


	/**
	 * 根据 字段别名 取值
	 * @param dbAlias 数据库字段别名
	 * @return 数据库字段值
	 */
	public Object get(String dbAlias);
	
}