package com.taobao.android.behavix.task;

/* loaded from: classes4.dex */
public enum BehaviXTaskType {
    BATCH_TASK("batch", 1),
    UPLOAD_TASK("upload", 1),
    FEATURE_WRITE_TASK("featureWrite", 1);
    
    public String taskName;
    public int taskType;

    BehaviXTaskType(String str, int i) {
        this.taskName = str;
        this.taskType = i;
    }
}
