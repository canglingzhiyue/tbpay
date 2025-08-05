package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes.dex */
public interface IPullSecondFloorService extends ISubService {
    public static final String SERVICE_NAME = "PullSecondFloorService";

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    void addLifeCycleListener(a aVar);

    boolean isOnPullSecondFloor();

    void onEnterPullSecondFloor();

    void onExitPullSecondFloor();

    void removeLifeCycleListener(a aVar);
}
