package com.taobao.browser.jsbridge;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import tb.kge;
import tb.noa;

/* loaded from: classes6.dex */
public class WVTBLocation extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1834743739);
    }

    public static /* synthetic */ Object ipc$super(WVTBLocation wVTBLocation, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
        } else {
            super.initialize(context, iWVWebView);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getCachedCity".equals(str)) {
            getCachedCity(str2, wVCallBackContext);
        } else if (!"getCachedLocation".equals(str)) {
            return false;
        } else {
            getCachedLocation(str2, wVCallBackContext);
        }
        return true;
    }

    public void getCachedLocation(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0bcefb", new Object[]{this, str, wVCallBackContext});
            return;
        }
        TBLocationDTO b = TBLocationClient.b();
        if (b != null) {
            r rVar = new r();
            rVar.a("latitude", b.getLatitude());
            rVar.a("longitude", b.getLongitude());
            wVCallBackContext.success(rVar);
            return;
        }
        wVCallBackContext.error();
    }

    public void getCachedCity(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5fc931", new Object[]{this, str, wVCallBackContext});
            return;
        }
        TBLocationDTO b = TBLocationClient.b();
        if (b != null) {
            r rVar = new r();
            rVar.a(noa.KEY_CITY_CODE, b.getCityCode());
            rVar.a(noa.KEY_CITY_NAME, b.getCityName());
            wVCallBackContext.success(rVar);
            return;
        }
        wVCallBackContext.error();
    }
}
