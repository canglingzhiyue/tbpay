package com.taobao.themis.mix;

import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.m;
import com.taobao.themis.mix.h5_render.TMSTinyH5APIBridge;
import com.taobao.themis.mix.h5_render.TMSTinyH5EventBridge;
import com.taobao.themis.mix.utils.MixPageInfo;
import com.taobao.themis.mix.weex_render.TMSWeexAPIBridge;
import com.taobao.themis.open.permission.auth.ui.c;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.nfc;
import tb.qqc;
import tb.qqh;
import tb.qqq;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/themis/mix/TMSTinyAppRenderFactory;", "Lcom/taobao/themis/kernel/render_factory/TMSBaseRenderFactory;", "Ljava/io/Serializable;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "mPHAManifest", "Lcom/alibaba/fastjson/JSONObject;", "mPageInfoList", "", "Lcom/taobao/themis/mix/utils/MixPageInfo;", nfc.PHA_MONITOR_MODULE_POINT_CREATE_RENDER, "Lcom/taobao/themis/kernel/runtime/TMSRenderProtocol;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "Companion", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSTinyAppRenderFactory extends qqh implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final String TAG = "TMSTinyAppRenderFactory";
    private JSONObject mPHAManifest;
    private List<MixPageInfo> mPageInfoList;

    static {
        kge.a(88383908);
        kge.a(1028243835);
        Companion = new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSTinyAppRenderFactory(f instance) {
        super(instance);
        q.d(instance, "instance");
        android.taobao.windvane.jsbridge.q.a("Triver", (Class<? extends e>) TMSTinyH5APIBridge.class);
        android.taobao.windvane.jsbridge.q.a("TriverEvent", (Class<? extends e>) TMSTinyH5EventBridge.class);
        MUSEngine.registerModule("openApi", TMSWeexAPIBridge.class);
        try {
            Class<?> cls = Class.forName("com.taobao.accs.windvane.TBACCS");
            if (cls != null) {
                android.taobao.windvane.jsbridge.q.a("WVACCS", (Class<? extends e>) cls, true);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<out android.taobao.windvane.jsbridge.WVApiPlugin?>");
        } catch (ClassNotFoundException e) {
            TMSLogger.d(TAG, "Register WVACCS Module Faild: " + e.getMessage());
        }
    }

    @Override // tb.qqg
    public qqq createRender(ITMSPage page) {
        List<MixPageInfo> list;
        List<MixPageInfo> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qqq) ipChange.ipc$dispatch("877603f1", new Object[]{this, page});
        }
        q.d(page, "page");
        if (m.a(page.e())) {
            return new com.taobao.themis.mix.h5_render.a(page, page.e());
        }
        if (m.b(page.e())) {
            return new c(page);
        }
        if (this.mPageInfoList == null || !(!list.isEmpty())) {
            this.mPageInfoList = com.taobao.themis.mix.utils.a.b(getMInstance().v());
        }
        if (this.mPageInfoList == null || !(!list2.isEmpty())) {
            this.mPHAManifest = com.taobao.themis.mix.utils.a.a(getMInstance().v());
        }
        MixPageInfo mixPageInfo = null;
        if (qqc.a(page)) {
            if (this.mPageInfoList != null) {
                String g = getMInstance().g();
                q.b(g, "mInstance.url");
                List<MixPageInfo> list3 = this.mPageInfoList;
                q.a(list3);
                mixPageInfo = com.taobao.themis.mix.utils.a.a(g, list3);
            }
            if (mixPageInfo == null && this.mPHAManifest != null) {
                TMSLogger.d(TAG, "tms by pha");
                JSONObject jSONObject = this.mPHAManifest;
                q.a(jSONObject);
                String jSONString = jSONObject.toJSONString();
                q.b(jSONString, "mPHAManifest!!.toJSONString()");
                return new com.taobao.themis.mix.pha_render.a(page, jSONString);
            }
        } else {
            mixPageInfo = com.taobao.themis.mix.utils.a.a(this.mPageInfoList, page.e());
            if (mixPageInfo == null) {
                String a2 = page.c().a();
                String e = page.e();
                MixPageInfo mixPageInfo2 = new MixPageInfo();
                mixPageInfo2.setPageType(a2);
                mixPageInfo2.setPageUrl(e);
                mixPageInfo = mixPageInfo2;
            }
        }
        if (mixPageInfo != null) {
            if (TextUtils.equals("h5", mixPageInfo.getPageType())) {
                TMSLogger.d(TAG, "tms h5 renderUrl: " + mixPageInfo.getPageUrl());
                return new com.taobao.themis.mix.h5_render.a(page, mixPageInfo.getPageUrl());
            } else if (TextUtils.equals("weex2", mixPageInfo.getPageType())) {
                TMSLogger.d(TAG, "tms weex2 renderUrl: " + mixPageInfo.getPageUrl());
                String pageUrl = mixPageInfo.getPageUrl();
                q.a((Object) pageUrl);
                return new com.taobao.themis.mix.weex_render.a(page, pageUrl);
            }
        }
        TMSLogger.d(TAG, "unknown render type");
        getMInstance().a(com.taobao.themis.kernel.e.f22510a);
        return new com.taobao.themis.mix.h5_render.a(page, "");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/mix/TMSTinyAppRenderFactory$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-188624916);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
