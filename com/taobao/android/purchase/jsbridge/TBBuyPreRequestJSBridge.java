package com.taobao.android.purchase.jsbridge;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.purchase.aura.utils.b;
import com.taobao.android.purchase.preload.TBBuyPreloadFactory;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import tb.arc;
import tb.bba;
import tb.kge;
import tb.tbt;

/* loaded from: classes6.dex */
public class TBBuyPreRequestJSBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2040022828);
    }

    public static /* synthetic */ Object ipc$super(TBBuyPreRequestJSBridge tBBuyPreRequestJSBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TBBuyPreloadScene.ENTER_PAGE.equals(str) && AliBuyPerfSwitcher.enableJSBridgePreRequest()) {
            doLifecycleHandler(str2, wVCallBackContext, true);
            return true;
        } else if ((tbt.PRE_REQUEST.equals(str) || "onTouchDown".equals(str)) && AliBuyPerfSwitcher.enableJSBridgePreRequest()) {
            doPreRequestHandler(str2, wVCallBackContext);
            return true;
        } else if (!TBBuyPreloadScene.EXIT_PAGE.equals(str)) {
            return false;
        } else {
            doLifecycleHandler(str2, wVCallBackContext, false);
            return true;
        }
    }

    private void doLifecycleHandler(String str, WVCallBackContext wVCallBackContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6a2993b", new Object[]{this, str, wVCallBackContext, new Boolean(z)});
            return;
        }
        JSONObject a2 = bba.a(str);
        String str2 = null;
        if (a2 != null) {
            str2 = a2.getString("bizCode");
            a2.put("from", (Object) str2);
            a2.put("bizName", (Object) str2);
        }
        TBBuyPreloadFactory.a(getContext(), z ? TBBuyPreloadScene.ENTER_PAGE : TBBuyPreloadScene.EXIT_PAGE, str2, a2);
        r rVar = new r();
        rVar.b();
        wVCallBackContext.success(rVar);
    }

    private void doPreRequestHandler(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec06d81", new Object[]{this, str, wVCallBackContext});
            return;
        }
        JSONObject a2 = bba.a(str);
        if (a2 == null) {
            arc.a().b("TBBuyPreRequestJSBridge doPreRequestHandler jsObj is null");
            wVCallBackContext.error();
            return;
        }
        String string = a2.getString("url");
        if (TextUtils.isEmpty(string)) {
            arc.a().b("TBBuyPreRequestJSBridge doPreRequestHandler url is null");
            wVCallBackContext.error();
            return;
        }
        Intent intent = new Intent();
        intent.setData(Uri.parse(string));
        onTouchDown(getContext(), intent, !b.a(intent));
        r rVar = new r();
        rVar.b();
        wVCallBackContext.success(rVar);
    }

    private void onTouchDown(Context context, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e16fc98", new Object[]{this, context, intent, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, (Object) intent);
        jSONObject.put("fullScreen", (Object) Boolean.valueOf(z));
        jSONObject.put("bizName", (Object) "purchase");
        jSONObject.put("from", (Object) "iCarts");
        TBBuyPreloadFactory.a(context, TBBuyPreloadScene.TOUCH_DOWN, "tbBuy", jSONObject);
    }
}
