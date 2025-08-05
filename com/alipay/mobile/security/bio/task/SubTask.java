package com.alipay.mobile.security.bio.task;

/* loaded from: classes3.dex */
public interface SubTask {
    ActionType action(ActionFrame actionFrame);

    int done();

    int init();
}
