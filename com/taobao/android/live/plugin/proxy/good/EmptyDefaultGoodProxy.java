package com.taobao.android.live.plugin.proxy.good;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
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
import tb.kge;
import tb.pmv;

/* loaded from: classes6.dex */
public class EmptyDefaultGoodProxy implements IGoodProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "EmptyDefaultGoodProxy ";

    static {
        kge.a(1544319416);
        kge.a(-1377349555);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setActionAdapter(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992b80c9", new Object[]{this, eVar});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy setActionAdapter");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public e getActionAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("93210141", new Object[]{this});
        }
        com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy getActionAdapter");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setNavAdapter(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c777930d", new Object[]{this, jVar});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy setNavAdapter");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setTrackAdapter(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66cec673", new Object[]{this, lVar});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy setTrackAdapter");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setWeexAuctionAdapter(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da853dc9", new Object[]{this, mVar});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy setWeexAuctionAdapter");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setH5TabFrameAdapter(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6cb6394", new Object[]{this, iVar});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy setH5TabFrameAdapter");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setGoodFrameAdapter(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("997bbe3d", new Object[]{this, gVar});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy setGoodFrameAdapter");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void initUltronServerConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd4618", new Object[]{this, context});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy initUltronServerConfig");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public f createGoodFrame(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("1309237f", new Object[]{this, activity, str, new Boolean(z), tBLiveDataModel, view, aVar});
        }
        com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy createGoodFrame");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public f createGoodFrameKandian(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("865b7e3d", new Object[]{this, activity, str, new Boolean(z), tBLiveDataModel, view, aVar});
        }
        com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy createGoodFrameKandian");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean getFollowState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9789e5b5", new Object[]{this})).booleanValue();
        }
        com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy getFollowState");
        return false;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void follow(pmv pmvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b16979", new Object[]{this, pmvVar, str});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy follow");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public String getCurrentAnchorId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b933cbc6", new Object[]{this});
        }
        com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy getCurrentAnchorId");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void registShowcaseFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6688c571", new Object[]{this});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy registShowcaseFrame");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public a getGoodHandlerProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("103d44f3", new Object[]{this});
        }
        com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy getGoodHandlerProxy");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public DXRootView createDX(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("e00af95c", new Object[]{this, context, str});
        }
        com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy createDX");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void renderDX(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e594c7e", new Object[]{this, dXRootView, jSONObject});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy renderDX");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void renderDX(DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac21322", new Object[]{this, dXRootView, jSONObject, dXRenderOptions});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy renderDX");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void destroyDXManger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853c7fef", new Object[]{this});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy destroyDXManger");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setTemplateString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722234fe", new Object[]{this, str});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy setTemplateString");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setListCacheData(r rVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6390a7b", new Object[]{this, rVar, str, str2});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy setListCacheData");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object parseExpressionObj(JSONObject jSONObject, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e50914b7", new Object[]{this, jSONObject, obj, new Boolean(z)});
        }
        com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy parseExpressionObj");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public String getItemListXEageleeyeId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac7db491", new Object[]{this});
        }
        com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy getItemListXEageleeyeId");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public DinamicXEngine getDynamicXEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("954c806f", new Object[]{this});
        }
        com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy getDynamicXEngine");
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean isMultiStateSecKill(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ff13673", new Object[]{this, liveItem})).booleanValue();
        }
        com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy isMultiStateSecKill");
        return false;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean isShowcaseRec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab4e6224", new Object[]{this})).booleanValue();
        }
        com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy isMultiStateSecKill");
        return false;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object getGLConfig(r rVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f5536ef2", new Object[]{this, rVar, str});
        }
        com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy getGLConfig | key=" + str);
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void destroy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788c091d", new Object[]{this, obj});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy destroy");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void activityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6651cf2", new Object[]{this});
        } else {
            com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy activityDestroy");
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object createUltronInstanceAndInitServerConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ec8af478", new Object[]{this, context});
        }
        com.taobao.android.live.plugin.proxy.e.c("EmptyDefaultGoodProxy createUltronInstanceAndInitServerConfig");
        return new Object();
    }
}
