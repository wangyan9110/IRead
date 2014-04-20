package org.yywang.iread.threadPool;

/**
 * the task progress
 * @author wangyan
 */
public enum TaskProgress {
	
	/**
	 * init the task
	 */
	init,
	
	/**
	 * the task is running
	 */
	running,
	
	/**
	 * the task is successed
	 */
	success,
	
	/**
	 * the task is failed!
	 */
	failed
}
