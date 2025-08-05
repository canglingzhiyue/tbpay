package com.taobao.android.live.plugin.proxy.good;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.taolive.sdk.goodlist.e;
import com.taobao.taolive.sdk.goodlist.f;
import com.taobao.taolive.sdk.goodlist.g;
import com.taobao.taolive.sdk.goodlist.i;
import com.taobao.taolive.sdk.goodlist.j;
import com.taobao.taolive.sdk.goodlist.l;
import com.taobao.taolive.sdk.goodlist.m;
import com.taobao.taolive.sdk.goodlist.r;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.pmv;

/* loaded from: classes6.dex */
public interface IGoodProxy extends IProxy {
    public static final String KEY = "GoodProxy";

    @Deprecated
    void activityDestroy();

    DXRootView createDX(Context context, String str);

    f createGoodFrame(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, com.taobao.alilive.aliliveframework.frame.a aVar);

    f createGoodFrameKandian(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, com.taobao.alilive.aliliveframework.frame.a aVar);

    Object createUltronInstanceAndInitServerConfig(Context context);

    void destroy(Object obj);

    void destroyDXManger();

    void follow(pmv pmvVar, String str);

    e getActionAdapter();

    String getCurrentAnchorId();

    DinamicXEngine getDynamicXEngine();

    boolean getFollowState();

    Object getGLConfig(r rVar, String str);

    a getGoodHandlerProxy();

    String getItemListXEageleeyeId();

    @Deprecated
    void initUltronServerConfig(Context context);

    boolean isMultiStateSecKill(LiveItem liveItem);

    boolean isShowcaseRec();

    Object parseExpressionObj(JSONObject jSONObject, Object obj, boolean z);

    void registShowcaseFrame();

    void renderDX(DXRootView dXRootView, JSONObject jSONObject);

    void renderDX(DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions);

    void setActionAdapter(e eVar);

    void setGoodFrameAdapter(g gVar);

    void setH5TabFrameAdapter(i iVar);

    void setListCacheData(r rVar, String str, String str2);

    void setNavAdapter(j jVar);

    void setTemplateString(String str);

    void setTrackAdapter(l lVar);

    void setWeexAuctionAdapter(m mVar);
}
