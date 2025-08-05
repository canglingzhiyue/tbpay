package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.GoodFrame;
import com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.GoodFrameForKandian;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.ShowcaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.b;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.proxy.good.IGoodProxy;
import com.taobao.android.live.plugin.proxy.good.a;
import com.taobao.taolive.sdk.goodlist.d;
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
import com.taobao.taolive.sdk.utils.v;
import tb.ddx;
import tb.hhq;
import tb.hhs;
import tb.him;
import tb.his;
import tb.hiu;
import tb.kge;
import tb.pmv;
import tb.qna;

/* loaded from: classes6.dex */
public class GoodProxyX implements IGoodProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GoodProxyX";
    private a mGoodHandlerProxy = new hhq();

    static {
        kge.a(1941389780);
        kge.a(-1377349555);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object createUltronInstanceAndInitServerConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ec8af478", new Object[]{this, context});
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void initUltronServerConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd4618", new Object[]{this, context});
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    @Deprecated
    public boolean isShowcaseRec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab4e6224", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setActionAdapter(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992b80c9", new Object[]{this, eVar});
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().a(eVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public e getActionAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("93210141", new Object[]{this}) : com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setNavAdapter(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c777930d", new Object[]{this, jVar});
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().a(jVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setTrackAdapter(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66cec673", new Object[]{this, lVar});
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().a(lVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setWeexAuctionAdapter(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da853dc9", new Object[]{this, mVar});
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().a(mVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setH5TabFrameAdapter(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6cb6394", new Object[]{this, iVar});
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().a(iVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setGoodFrameAdapter(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("997bbe3d", new Object[]{this, gVar});
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().a(gVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void registShowcaseFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6688c571", new Object[]{this});
        } else {
            ddx.a("tl-showcase-common", ShowcaseFrame.class);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public f createGoodFrame(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("1309237f", new Object[]{this, activity, str, new Boolean(z), tBLiveDataModel, view, aVar}) : new GoodFrame(activity, str, z, tBLiveDataModel, view, aVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public f createGoodFrameKandian(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("865b7e3d", new Object[]{this, activity, str, new Boolean(z), tBLiveDataModel, view, aVar}) : new GoodFrameForKandian(activity, str, z, tBLiveDataModel, view, aVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean getFollowState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9789e5b5", new Object[]{this})).booleanValue() : com.taobao.android.live.plugin.atype.flexalocal.good.a.a().b(null);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void follow(pmv pmvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b16979", new Object[]{this, pmvVar, str});
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().a(null, pmvVar, str);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public String getCurrentAnchorId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b933cbc6", new Object[]{this}) : qna.e(null);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public a getGoodHandlerProxy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("103d44f3", new Object[]{this}) : this.mGoodHandlerProxy;
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public DXRootView createDX(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("e00af95c", new Object[]{this, context, str}) : hhs.a().b(context, str);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void renderDX(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e594c7e", new Object[]{this, dXRootView, jSONObject});
        } else {
            hhs.a().a(dXRootView, jSONObject);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void renderDX(DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac21322", new Object[]{this, dXRootView, jSONObject, dXRenderOptions});
        } else {
            hhs.a().a(dXRootView, jSONObject, dXRenderOptions);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void destroyDXManger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853c7fef", new Object[]{this});
        } else {
            hhs.a().b();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setTemplateString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722234fe", new Object[]{this, str});
        } else {
            hhs.a().a(str);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void setListCacheData(r rVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6390a7b", new Object[]{this, rVar, str, str2});
        } else if (TextUtils.isEmpty(str2) && !v.b.a("goodlist", "enableLandPortrait", true)) {
        } else {
            c cVar = rVar instanceof c ? (c) rVar : null;
            b a2 = b.a(str, str2);
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().a(cVar, a2);
            if (rVar == null || !d.c() || TextUtils.isEmpty(str2)) {
                return;
            }
            a2.b(cVar.d());
            his.a(TAG, "gotoTimeShift | cache goodlist dxdata. cacheData=" + a2);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object parseExpressionObj(JSONObject jSONObject, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e50914b7", new Object[]{this, jSONObject, obj, new Boolean(z)}) : him.a(jSONObject, obj, z);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public String getItemListXEageleeyeId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ac7db491", new Object[]{this}) : com.taobao.android.live.plugin.atype.flexalocal.good.a.a().m();
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public boolean isMultiStateSecKill(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3ff13673", new Object[]{this, liveItem})).booleanValue() : hiu.a(liveItem);
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public Object getGLConfig(r rVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f5536ef2", new Object[]{this, rVar, str});
        }
        if (!"glPerformanceExclusive".equals(str)) {
            return null;
        }
        return Boolean.valueOf(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.b());
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public void destroy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788c091d", new Object[]{this, obj});
        } else if (!(obj instanceof c)) {
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().a((c) obj);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    @Deprecated
    public void activityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6651cf2", new Object[]{this});
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().o();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.good.IGoodProxy
    public DinamicXEngine getDynamicXEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("954c806f", new Object[]{this}) : hhs.a().c();
    }
}
