package org.yywang.iread.threadPool;

import java.util.LinkedList;
import java.util.List;

/**
 * the task manager
 * is a single class
 *
 * @author wangyan
 */
public class TaskManager {

    /**
     * the task pool max size
     */
    private int maxSize;

    /**
     * the task pool
     */
    private static final List<BaseTask> taskPool=new LinkedList<BaseTask>();

    /**
     * add the task to the pool
     * @param baseTask
     */
    public void add(BaseTask baseTask){
        taskPool.add(baseTask);
    }

}
