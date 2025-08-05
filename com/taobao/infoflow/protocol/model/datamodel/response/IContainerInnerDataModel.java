package com.taobao.infoflow.protocol.model.datamodel.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public interface IContainerInnerDataModel<M extends BaseSectionModel> extends Serializable {
    void abandonData(String str);

    long getCacheTime();

    JSONObject getClientCache();

    long getDataCacheTime();

    String getDataType();

    long getExpTimeInterval();

    String getExpireType();

    JSONObject getExt();

    JSONObject getFloatLayerSection();

    String getPageName();

    /* renamed from: getPageParams */
    IPageDataModel mo1280getPageParams();

    JSONObject getPassParams();

    List<JSONObject> getPopData();

    JSONObject getRangerParams();

    JSONObject getRemindSection();

    List<M> getSections();

    JSONObject getStayTimeParams();

    JSONObject getTopViewSplashSection();

    JSONObject getVersionInfo();

    boolean isAbandoned();

    boolean isDataChange();

    boolean isRemote();
}
