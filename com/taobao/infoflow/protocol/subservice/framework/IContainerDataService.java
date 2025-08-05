package com.taobao.infoflow.protocol.subservice.framework;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import tb.lli;

/* loaded from: classes.dex */
public interface IContainerDataService<DATA extends IContainerDataModel> extends ISubService {
    public static final String SERVICE_NAME = "DataService";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface Event {
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(lli lliVar);

        void a(lli lliVar, IContainerDataModel<?> iContainerDataModel);

        void b(lli lliVar, IContainerDataModel<?> iContainerDataModel);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str);

        void a(lli lliVar, String str);

        void a(lli lliVar, String str, String str2, String str3);
    }

    /* loaded from: classes.dex */
    public interface c {
        Map<String, String> a(lli lliVar, String str);
    }

    /* loaded from: classes7.dex */
    public interface d {
        Map<String, String> a(lli lliVar, String str);
    }

    /* loaded from: classes7.dex */
    public interface e {
        void a(String str, JSONObject jSONObject);
    }

    void addDataProcessListener(a aVar);

    void addRequestBizParamsCreator(c cVar);

    void addRequestCommonBizParamsCreator(d dVar);

    void addRequestListener(b bVar);

    void addTriggerEventListener(e eVar);

    BaseSectionModel<?> createBaseSectionModel(JSONObject jSONObject);

    DATA getContainerData();

    com.taobao.infoflow.protocol.model.datamodel.response.a getPageInfo();

    void removeDataProcessListener(a aVar);

    void removeRequestBizParamsCreator(c cVar);

    void removeRequestCommonBizParamsCreator(d dVar);

    void removeRequestListener(b bVar);

    void removeTriggerEventListener(e eVar);

    boolean triggerEvent(String str, JSONObject jSONObject);

    boolean triggerEvent(String str, JSONObject jSONObject, lli lliVar);
}
