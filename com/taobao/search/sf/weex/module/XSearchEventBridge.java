package com.taobao.search.sf.weex.module;

import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.musie.MUSXSearchEventModule;
import com.taobao.weex.WXSDKInstance;
import tb.kge;

/* loaded from: classes8.dex */
public class XSearchEventBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_GET_NAVIGATION_INFO = "getNavigationInfo";
    private static final String ACTION_OPEN_URL = "openUrl";
    private static final String ACTION_SEARCH = "search";
    public static final String API_NAME = "TBSearchWVBridge";
    private a mEventImpl = new a();

    static {
        kge.a(1491191360);
    }

    public static /* synthetic */ Object ipc$super(XSearchEventBridge xSearchEventBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            parseObject = JSON.parseObject(str2);
        } catch (Throwable unused) {
        }
        if (TextUtils.equals(str, "openUrl")) {
            openUrl(parseObject);
            return true;
        } else if (TextUtils.equals(str, ACTION_GET_NAVIGATION_INFO)) {
            getNavigationInfo(wVCallBackContext);
            return true;
        } else {
            JSONObject b = com.taobao.android.searchbaseframe.util.a.b(parseObject, "message");
            if (b != null && str.equals("search")) {
                this.mEventImpl.a((WXSDKInstance) null, this.mContext, b);
                return true;
            }
            return false;
        }
    }

    private void openUrl(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9355fa4", new Object[]{this, jSONObject});
            return;
        }
        try {
            final String string = jSONObject.getString("url");
            final String string2 = jSONObject.getString("params");
            if (Looper.getMainLooper() == Looper.myLooper()) {
                MUSXSearchEventModule.openUrl(getContext(), string, string2);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.search.sf.weex.module.XSearchEventBridge.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MUSXSearchEventModule.openUrl(XSearchEventBridge.this.getContext(), string, string2);
                        }
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    private void getNavigationInfo(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1058a41c", new Object[]{this, wVCallBackContext});
            return;
        }
        JSONObject navigationInfo = MUSXSearchEventModule.getNavigationInfo(getContext());
        if (navigationInfo == null) {
            return;
        }
        try {
            r rVar = new r();
            rVar.a(new org.json.JSONObject(navigationInfo.toString()));
            wVCallBackContext.success(rVar);
        } catch (Exception unused) {
        }
    }
}
