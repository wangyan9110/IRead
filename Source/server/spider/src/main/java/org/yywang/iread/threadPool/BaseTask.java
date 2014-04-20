package org.yywang.iread.threadPool;

/**
 * the base task
 * all the task in running the thread pool extends it.
 *
 * @author wangyan
 */
public abstract class BaseTask implements Runnable {

    /**
     * the task id
     */
    private String id;

    /**
     * the task progress
     */
    private TaskProgress taskProgress;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the taskProgress
     */
    public TaskProgress getTaskProgress() {
        return taskProgress;
    }

    /**
     * @param taskProgress the taskProgress to set
     */
    public void setTaskProgress(TaskProgress taskProgress) {
        this.taskProgress = taskProgress;
    }

    /**
     * the base task conr
     */
    public BaseTask() {
        this.id = "";
        this.taskProgress = TaskProgress.init;
    }

    /**
     * the task running
     */
    public abstract void run();
}
