package com.taobao.browser.jsbridge;

import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.browser.utils.BrowserUtil;
import tb.kge;

/* loaded from: classes6.dex */
public class WVUIImagepreview extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUIImagepreview";

    static {
        kge.a(767141315);
    }

    public static /* synthetic */ Object ipc$super(WVUIImagepreview wVUIImagepreview, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        BrowserUtil.a(TAG, "preview", str, this.mWebView != null ? this.mWebView.getUrl() : null, null);
        if ("showImagepreview".equals(str)) {
            showImagepreview(wVCallBackContext, str2);
        } else if (!"showVerticalImagepreview".equals(str)) {
            return false;
        } else {
            showVerticalImagepreview(wVCallBackContext, str2);
        }
        return true;
    }

    @WindVaneInterface
    public void showVerticalImagepreview(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5720e4e", new Object[]{this, wVCallBackContext, str});
        } else if (!isEmpty(str)) {
            try {
                JSONArray jSONArray = JSONObject.parseObject(str).getJSONArray("images");
                String[] strArr = new String[jSONArray.size()];
                for (int i = 0; i < jSONArray.size(); i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("image_list_urls", strArr);
                bundle.putString("fragmentClassName", "com.taobao.browser.fragment.ImageListFragment");
                Nav.from(this.mContext).withFlags(268435456).withExtras(bundle).toUri("taobao://go/FragmentContainerActivity");
            } catch (JSONException unused) {
                m.e(TAG, "WVUIDialog: param parse to JSON error, param=" + str);
                r rVar = new r();
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
            }
        }
    }

    @WindVaneInterface
    public void showImagepreview(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c391f438", new Object[]{this, wVCallBackContext, str});
        } else if (!isEmpty(str)) {
            try {
                JSONObject parseObject = JSONObject.parseObject(str);
                JSONArray jSONArray = parseObject.getJSONArray("images");
                String string = parseObject.getString("index");
                String[] strArr = new String[jSONArray.size()];
                for (int i = 0; i < jSONArray.size(); i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("image_list_urls", strArr);
                bundle.putString("image_position", string);
                bundle.putString("fragmentClassName", "com.taobao.browser.fragment.HorizontalImageListFragment");
                Nav.from(this.mContext).withExtras(bundle).withFlags(268435456).toUri("taobao://go/FragmentContainerActivity");
            } catch (JSONException unused) {
                m.e(TAG, "WVUIDialog: param parse to JSON error, param=" + str);
                r rVar = new r();
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
            }
        }
    }

    private boolean isEmpty(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{this, str})).booleanValue() : str == null || "".equals(str);
    }
}
