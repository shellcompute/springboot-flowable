package com.example.demo.listener;

import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

public class ManagerTaskHandler implements TaskListener {
    @Override
    public void notify(DelegateTask delegateTask) {
        delegateTask.setAssignee("Manager Senior");
    }
}
