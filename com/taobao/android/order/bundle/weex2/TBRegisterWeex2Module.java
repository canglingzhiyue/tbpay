package com.taobao.android.order.bundle.weex2;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.helper.l;
import com.taobao.android.weex_framework.MUSEngine;
import tb.kge;

/* loaded from: classes6.dex */
public class TBRegisterWeex2Module extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-454330091);
    }

    public static /* synthetic */ Object ipc$super(TBRegisterWeex2Module tBRegisterWeex2Module, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("register".equals(str)) {
            registerWeex2Module(wVCallBackContext);
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
            return true;
        } else if (!"registerView".equals(str)) {
            return false;
        } else {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    registerWeexPlatformViews(JSONObject.parseObject(str2).getString("tagName"), wVCallBackContext);
                }
            } catch (Exception unused) {
            }
            return true;
        }
    }

    private void registerWeex2Module(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95887be", new Object[]{this, wVCallBackContext});
        } else if (l.f14548a) {
        } else {
            MUSEngine.registerModule("order_module", TBOrderWeex2Module.class);
            l.f14548a = true;
        }
    }

    private void registerWeexPlatformViews(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("482ec965", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Class<?> a2 = l.a(str);
        if (a2 == null) {
            return;
        }
        MUSEngine.registerPlatformView(str, a2);
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success();
    }
}
