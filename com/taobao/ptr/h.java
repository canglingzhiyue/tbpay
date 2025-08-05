package com.taobao.ptr;

/* loaded from: classes7.dex */
public interface h {
    int getPullDirection();

    boolean isReadyForPullEnd();

    boolean isReadyForPullStart();

    void onPullAdapterAdded(PullBase pullBase);

    void onPullAdapterRemoved(PullBase pullBase);
}
