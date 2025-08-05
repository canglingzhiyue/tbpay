package com.taobao.infoflow.protocol.engine.invoke.biz;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes.dex */
public interface ITopViewService extends ISubService {
    public static final String SERVICE_NAME = "TopViewService";

    /* loaded from: classes.dex */
    public interface a {
        void a(String str);

        void b();
    }

    void addTopViewShowListener(a aVar);

    boolean expendTopViewRecord();

    JSONObject getSubTabSearchBarData();

    void removeTopViewShowListener(a aVar);
}
