package com.ejl.searcher;

import java.util.List;
import java.util.Map;


/***
 * @author Troy.Zhou @ 2017-03-20
 * 
 * 自动检索器接口
 * 根据 Bean 的 Class 和请求参数，自动检索 Bean
 * 
 * */

public interface Searcher {

	/**
	 * @param beanClass 要检索的 bean 类型
	 * @param paraMap 检索参数（包括排序分页参数）
	 * @param prefix 检索参数前缀
	 * @return 满足条件的第一个Bean 
	 * */
	public <T> T searchFirst(Class<T> beanClass, Map<String, String> paraMap, String prefix);
	
	/**
	 * @param beanClass 要检索的 bean 类型
	 * @param paraMap 检索参数（包括排序分页参数）
	 * @return 满足条件的第一个Bean 
	 * */
	public <T> T searchFirst(Class<T> beanClass, Map<String, String> paraMap);
	
	
	/**
	 * 适合不需要分页的查询
	 * @param beanClass 要检索的 bean 类型
	 * @param paraMap 检索参数（包括排序分页参数）
	 * @param prefix 检索参数前缀
	 * @return Bean 数据列表
	 * */
	public <T> List<T> searchList(Class<T> beanClass, Map<String, String> paraMap, String prefix);
	
	/**
	 * 适合不需要分页的查询
	 * @param beanClass 要检索的 bean 类型
	 * @param paraMap 检索参数（包括排序分页参数）
	 * @return Bean 数据列表
	 * */
	public <T> List<T> searchList(Class<T> beanClass, Map<String, String> paraMap);
	
	/**
	 * 适合需要分页的查询
	 * @param beanClass 要检索的 bean 类型
	 * @param paraMap 检索参数
	 * @param prefix 检索参数前缀
	 * @return 总条数，Bean 数据列表
	 * */
	public <T> SearchResult<T> search(Class<T> beanClass, Map<String, String> paraMap, String prefix);
	
	/**
	 * 适合需要分页的查询
	 * @param beanClass 要检索的 bean 类型
	 * @param paraMap 检索参数
	 * @return 总条数，Bean 数据列表
	 * */
	public <T> SearchResult<T> search(Class<T> beanClass, Map<String, String> paraMap);
	
	

	
}