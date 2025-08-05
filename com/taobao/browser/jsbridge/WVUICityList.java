package com.taobao.browser.jsbridge;

import android.app.Activity;
import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.ui.CityList;
import com.taobao.browser.jsbridge.ui.CityModel;
import com.taobao.browser.utils.BrowserUtil;
import tb.kge;
import tb.noa;

@Deprecated
/* loaded from: classes6.dex */
public class WVUICityList extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int CHOOSE_CITY = 4999;
    private WVCallBackContext mCallback = null;

    static {
        kge.a(-826346657);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"showCityList".equals(str)) {
            return false;
        }
        BrowserUtil.a("WVUICityList", BrowserUtil.f16842a, str, this.mWebView != null ? this.mWebView.getUrl() : null, null);
        showCityList(str2, wVCallBackContext);
        return true;
    }

    public final void showCityList(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c4be94", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mCallback = wVCallBackContext;
        Intent intent = new Intent();
        intent.setClass(this.mContext, CityList.class);
        ((Activity) this.mContext).startActivityForResult(intent, 4999);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WVCallBackContext wVCallBackContext = this.mCallback;
        if (wVCallBackContext == null || i != 4999) {
            return;
        }
        if (i2 == -1) {
            CityModel cityModel = (CityModel) intent.getExtras().get(CityList.CITY_INFO);
            if (cityModel == null) {
                return;
            }
            r rVar = new r();
            rVar.a(noa.KEY_CITY_CODE, cityModel.getCityId());
            rVar.a(noa.KEY_CITY_NAME, cityModel.getCityName());
            if (!cityModel.getLongitude().equals("{}")) {
                rVar.a("longitude", cityModel.getLongitude());
                rVar.a("latitude", cityModel.getLatitude());
            }
            this.mCallback.success(rVar);
            return;
        }
        wVCallBackContext.error();
    }
}
