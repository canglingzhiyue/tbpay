package com.alibaba.ut.abtest.push;

/* loaded from: classes3.dex */
public interface f {
    void cancelSyncCrowd();

    void destory();

    void initialize();

    boolean isCrowd(String str);

    void syncExperiments(boolean z, String str);
}
