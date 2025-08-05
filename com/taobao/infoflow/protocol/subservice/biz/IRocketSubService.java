package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes.dex */
public interface IRocketSubService extends ISubService {
    public static final String SERVICE_NAME = "RocketService";

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z);
    }

    void addRocketListener(a aVar);

    int getRocketAnchorPosition();

    boolean isOnRocketState();

    void onClickRocket();

    void removeRocketListener(a aVar);
}
