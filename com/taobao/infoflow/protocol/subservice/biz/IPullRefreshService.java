package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public interface IPullRefreshService extends ISubService {
    public static final String SERVICE_NAME = "PullRefreshService";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface RefreshState {
    }

    /* loaded from: classes7.dex */
    public interface a {
        void a(int i);

        void a(String str, String str2);
    }

    void addPullRefreshListener(a aVar);

    void onPullDistance(int i);

    void onRefresh();

    void onRefreshStateChanged(String str, String str2);

    void removePullRefreshListener(a aVar);
}
