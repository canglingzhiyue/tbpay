package com.taobao.android.live.plugin.proxy.good;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import com.taobao.taolive.sdk.goodlist.f;
import com.taobao.taolive.sdk.goodlist.i;
import com.taobao.taolive.sdk.goodlist.j;
import com.taobao.taolive.sdk.goodlist.l;
import com.taobao.taolive.sdk.goodlist.m;
import com.taobao.taolive.sdk.goodlist.r;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.kge;
import tb.pmv;

/* loaded from: classes6.dex */
public class GoodProxy extends g<IGoodProxy> implements IGoodProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GoodProxy";
    private IGoodProxy mDefaultProxy = new EmptyDefaultGoodProxy();

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final GoodProxy f14110a;

        static {
            kge.a(647256420);
            f14110a = new GoodProxy();
        }

        public static /* synthetic */ GoodProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (GoodProxy) ipChange.ipc$dispatch("8fb9cb0d", new Object[0]) : f14110a;
        }
    }

    static {
        kge.a(-1449406452);
        kge.a(-1377349555);
    }

    public static /* synthetic */ Object ipc$super(GoodProxy goodProxy, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : "GoodProxy";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.atype.flexalocal.proxy.GoodProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "installLiveGoodPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "宝贝口袋";
    }

    public static IGoodProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IGoodProxy) ipChange.ipc$dispatch("7afbf586", new Object[0]) : a.a();
    }

    public GoodProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            e.c("[GoodProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setActionAdapter(com.taobao.taolive.sdk.goodlist.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992b80c9", new Object[]{this, eVar});
        } else {
            getProxyWithDefault().setActionAdapter(eVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public com.taobao.taolive.sdk.goodlist.e getActionAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.goodlist.e) ipChange.ipc$dispatch("93210141", new Object[]{this}) : getProxyWithDefault().getActionAdapter();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setNavAdapter(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c777930d", new Object[]{this, jVar});
        } else {
            getProxyWithDefault().setNavAdapter(jVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setTrackAdapter(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66cec673", new Object[]{this, lVar});
        } else {
            getProxyWithDefault().setTrackAdapter(lVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setWeexAuctionAdapter(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da853dc9", new Object[]{this, mVar});
        } else {
            getProxyWithDefault().setWeexAuctionAdapter(mVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setH5TabFrameAdapter(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6cb6394", new Object[]{this, iVar});
        } else {
            getProxyWithDefault().setH5TabFrameAdapter(iVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setGoodFrameAdapter(com.taobao.taolive.sdk.goodlist.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("997bbe3d", new Object[]{this, gVar});
        } else {
            getProxyWithDefault().setGoodFrameAdapter(gVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void initUltronServerConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd4618", new Object[]{this, context});
        } else {
            getProxyWithDefault().initUltronServerConfig(context);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void registShowcaseFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6688c571", new Object[]{this});
        } else {
            getProxyWithDefault().registShowcaseFrame();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public f createGoodFrame(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("1309237f", new Object[]{this, activity, str, new Boolean(z), tBLiveDataModel, view, aVar}) : getProxyWithDefault().createGoodFrame(activity, str, z, tBLiveDataModel, view, aVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public f createGoodFrameKandian(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("865b7e3d", new Object[]{this, activity, str, new Boolean(z), tBLiveDataModel, view, aVar}) : getProxyWithDefault().createGoodFrameKandian(activity, str, z, tBLiveDataModel, view, aVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean getFollowState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9789e5b5", new Object[]{this})).booleanValue() : getProxyWithDefault().getFollowState();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void follow(pmv pmvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b16979", new Object[]{this, pmvVar, str});
        } else {
            getProxyWithDefault().follow(pmvVar, str);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public String getCurrentAnchorId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b933cbc6", new Object[]{this}) : getProxyWithDefault().getCurrentAnchorId();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public com.taobao.android.live.plugin.proxy.good.a getGoodHandlerProxy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.proxy.good.a) ipChange.ipc$dispatch("103d44f3", new Object[]{this}) : getProxyWithDefault().getGoodHandlerProxy();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public DXRootView createDX(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("e00af95c", new Object[]{this, context, str}) : getProxyWithDefault().createDX(context, str);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void renderDX(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e594c7e", new Object[]{this, dXRootView, jSONObject});
        } else {
            getProxyWithDefault().renderDX(dXRootView, jSONObject);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void renderDX(DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac21322", new Object[]{this, dXRootView, jSONObject, dXRenderOptions});
        } else {
            getProxyWithDefault().renderDX(dXRootView, jSONObject, dXRenderOptions);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void destroyDXManger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853c7fef", new Object[]{this});
        } else {
            getProxyWithDefault().destroyDXManger();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setTemplateString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722234fe", new Object[]{this, str});
        } else {
            getProxyWithDefault().setTemplateString(str);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setListCacheData(r rVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6390a7b", new Object[]{this, rVar, str, str2});
        } else {
            getProxyWithDefault().setListCacheData(rVar, str, str2);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object parseExpressionObj(JSONObject jSONObject, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e50914b7", new Object[]{this, jSONObject, obj, new Boolean(z)}) : getProxyWithDefault().parseExpressionObj(jSONObject, obj, z);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public String getItemListXEageleeyeId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ac7db491", new Object[]{this}) : getProxyWithDefault().getItemListXEageleeyeId();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public DinamicXEngine getDynamicXEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("954c806f", new Object[]{this}) : getProxyWithDefault().getDynamicXEngine();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean isMultiStateSecKill(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3ff13673", new Object[]{this, liveItem})).booleanValue() : getProxyWithDefault().isMultiStateSecKill(liveItem);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean isShowcaseRec() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab4e6224", new Object[]{this})).booleanValue() : getProxyWithDefault().isShowcaseRec();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object getGLConfig(r rVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("f5536ef2", new Object[]{this, rVar, str}) : Boolean.valueOf(getProxyWithDefault().isShowcaseRec());
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void destroy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788c091d", new Object[]{this, obj});
        } else {
            getProxyWithDefault().destroy(obj);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void activityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6651cf2", new Object[]{this});
        } else {
            getProxyWithDefault().activityDestroy();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object createUltronInstanceAndInitServerConfig(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ec8af478", new Object[]{this, context}) : getProxyWithDefault().createUltronInstanceAndInitServerConfig(context);
    }

    private IGoodProxy getProxyWithDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IGoodProxy) ipChange.ipc$dispatch("ce6b5fce", new Object[]{this});
        }
        IGoodProxy real = getReal();
        return real == null ? this.mDefaultProxy : real;
    }
}
