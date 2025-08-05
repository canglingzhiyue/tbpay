package com.taobao.infoflow.protocol.subservice.biz;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.lkq;

/* loaded from: classes.dex */
public interface IPopViewService extends ISubService, lkq {
    public static final String SERVICE_NAME = "PopViewService";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface InfoFlowPopMessageType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface InfoFlowPopTriggerType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface InfoflowPopEventType {
    }

    /* loaded from: classes7.dex */
    public interface a {
        void a(String str, Object obj, JSONObject jSONObject);
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes7.dex */
    public interface c {
        void a(String str);

        void b(String str);
    }

    void addPopEventListener(b bVar);

    void addPopMessageListener(a aVar);

    void addPopViewUpdateListener(c cVar);

    JSONObject getPopDataByBusinessId(String str);

    boolean isPopViewOnScreen(String str);

    void onIconScroll(int i);

    void onPopTabSelected();

    void onPopTabUnSelected();

    void removePopEventListener(b bVar);

    void removePopMessageListener(a aVar);

    void removePopViewUpdateListener(c cVar);

    void triggerPopEvent(int i, String str);

    void triggerPopRemove(String str);

    void triggerPopShow(int i, String str);

    void triggerPopShowByCustomData(JSONObject jSONObject);

    boolean triggerPopShowByPopData(int i, JSONObject jSONObject);

    void triggerPopShowWithDataReset(int i, String str);
}
