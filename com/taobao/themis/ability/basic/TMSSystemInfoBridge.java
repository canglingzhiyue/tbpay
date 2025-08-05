package com.taobao.themis.ability.basic;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.a;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.entity.InstanceStartParams;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.c;
import com.taobao.themis.utils.k;
import mtopsdk.mtop.global.SDKUtils;
import tb.kge;
import tb.mto;
import tb.nfc;
import tb.qqc;
import tb.svr;

/* loaded from: classes9.dex */
public class TMSSystemInfoBridge implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(181930532);
        kge.a(-86622547);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.SYNC)
    @APIMethod
    public void getSystemInfo(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65660e5", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null || apiContext.c() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            ITMSPage d = apiContext.d();
            if (d == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.d("getSystemInfo", "page is null");
                return;
            }
            Activity a2 = apiContext.a();
            DisplayMetrics displayMetrics = a2.getResources().getDisplayMetrics();
            float f = displayMetrics.density;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiLevel", (Object) Integer.valueOf(Build.VERSION.SDK_INT));
            jSONObject.put("app", RVEnvironmentService.PLATFORM_TB);
            jSONObject.put("brand", (Object) Build.BRAND);
            jSONObject.put("currentBattery", "100%");
            jSONObject.put("fontSizeSetting", (Object) 16);
            jSONObject.put(LoggingSPCache.STORAGE_LANGUAGE, AdvanceSetting.CLEAR_NOTIFICATION);
            jSONObject.put("model", (Object) (Build.MANUFACTURER + " " + Build.MODEL));
            jSONObject.put(nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, "middle");
            jSONObject.put("pixelRatio", (Object) Float.valueOf(f));
            jSONObject.put("platform", "Android");
            jSONObject.put("platformType", "tb");
            jSONObject.put("screenHeight", (Object) Integer.valueOf(displayMetrics.heightPixels));
            jSONObject.put(d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) Integer.valueOf(displayMetrics.widthPixels));
            jSONObject.put("statusBarHeight", (Object) Float.valueOf(k.b(a2) / f));
            jSONObject.put("system", (Object) Build.VERSION.RELEASE);
            jSONObject.put("titleBarHeight", (Object) 44);
            if (qqc.b(d)) {
                jSONObject.put(RVStartParams.KEY_TRANSPARENT_TITLE, (Object) true);
            } else {
                jSONObject.put(RVStartParams.KEY_TRANSPARENT_TITLE, (Object) false);
            }
            jSONObject.put("version", (Object) c.a(a2));
            jSONObject.put("windowWidth", (Object) Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)));
            jSONObject.put("windowHeight", (Object) Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density)));
            svr svrVar = (svr) d.b().b(svr.class);
            if (svrVar != null) {
                if (svrVar.a() != null) {
                    jSONObject.put("windowWidth", (Object) Integer.valueOf(Math.round(svrVar.a().floatValue() / displayMetrics.density)));
                }
                if (svrVar.b() != null) {
                    jSONObject.put("windowHeight", (Object) Integer.valueOf(Math.round(svrVar.b().floatValue() / displayMetrics.density)));
                }
            } else if (d.g() != null && d.g().getMeasuredWidth() > 0) {
                jSONObject.put("windowWidth", (Object) Integer.valueOf(Math.round(d.g().getMeasuredWidth() / displayMetrics.density)));
                jSONObject.put("windowHeight", (Object) Integer.valueOf(Math.round(d.g().getMeasuredHeight() / displayMetrics.density)));
            }
            jSONObject.put("deviceOrientation", (Object) com.taobao.themis.kernel.utils.k.n(d.b()));
            if (bridgeCallback == null) {
                return;
            }
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    @ThreadType(ExecutorType.SYNC)
    @APIMethod
    public void getWindowInfo(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62e70e44", new Object[]{this, apiContext, bridgeCallback});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Activity a2 = apiContext.a();
            DisplayMetrics displayMetrics = a2.getResources().getDisplayMetrics();
            double a3 = k.a((Context) a2, apiContext.a().getWindow().getDecorView().getWidth());
            double a4 = k.a((Context) a2, apiContext.a().getWindow().getDecorView().getHeight());
            ITMSPage d9 = apiContext.d();
            double d10 = mto.a.GEO_NOT_SUPPORT;
            if (d9 == null || d9.g() == null) {
                d = a4;
                d2 = 0.0d;
                d3 = 0.0d;
                d4 = 0.0d;
                d5 = 0.0d;
                d6 = 0.0d;
            } else {
                d10 = k.a((Context) a2, d9.g().getWidth());
                d4 = k.a((Context) a2, d9.g().getHeight());
                int[] iArr = new int[2];
                d9.g().getLocationOnScreen(iArr);
                d2 = k.a((Context) a2, iArr[1]);
                d = a4;
                d3 = k.a((Context) a2, iArr[0]);
                d5 = d2 + d4;
                d6 = d3 + d10;
            }
            if (d9 == null || !qqc.b(d9)) {
                d7 = d3;
                d8 = d2;
            } else {
                d8 = d2 + 44.0d;
                if (qqc.l(d9)) {
                    d7 = d3;
                    d8 += k.a((Context) a2, k.b(a2));
                } else {
                    d7 = d3;
                }
            }
            jSONObject.put("pixelRatio", (Object) Float.valueOf(displayMetrics.density));
            jSONObject.put(d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) Double.valueOf(a3));
            jSONObject.put("screenHeight", (Object) Double.valueOf(d));
            jSONObject.put("windowWidth", (Object) Double.valueOf(d10));
            jSONObject.put("windowHeight", (Object) Double.valueOf(d4));
            jSONObject.put("screenTop", (Object) Double.valueOf(d2));
            jSONObject.put("statusBarHeight", (Object) Integer.valueOf(k.a((Context) a2, k.b(a2))));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("top", (Object) Double.valueOf(d8));
            jSONObject2.put("left", (Object) Double.valueOf(d7));
            jSONObject2.put("bottom", (Object) Double.valueOf(d5));
            jSONObject2.put("right", (Object) Double.valueOf(d6));
            jSONObject2.put("width", (Object) Double.valueOf(d6 - d7));
            jSONObject2.put("height", (Object) Double.valueOf(d5 - d8));
            jSONObject.put("safeArea", (Object) jSONObject2);
            bridgeCallback.sendJSONResponse(jSONObject);
        } catch (Exception unused) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, TLogTracker.SCENE_EXCEPTION));
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public BridgeResponse getRunScene(@BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("fba5f72b", new Object[]{this, apiContext});
        }
        if (apiContext == null || apiContext.a() == null || apiContext.c() == null) {
            return BridgeResponse.FORBIDDEN_ERROR;
        }
        InstanceStartParams q = apiContext.c().q();
        if (q == null) {
            return BridgeResponse.FORBIDDEN_ERROR;
        }
        String str = "develop";
        if (!n.cb() ? q.isMiniAppDebug() : !q.isMiniAppDebug()) {
            str = "release";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("envVersion", (Object) str);
        return new BridgeResponse(jSONObject);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public void getServerTime(@BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a54776f", new Object[]{this, bridgeCallback});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", (Object) Long.valueOf(SDKUtils.getCorrectionTime() * 1000));
            bridgeCallback.sendJSONResponse(jSONObject);
        } catch (Exception e) {
            TMSLogger.d("getServerTime", "getServerTime :" + e);
        }
    }
}
