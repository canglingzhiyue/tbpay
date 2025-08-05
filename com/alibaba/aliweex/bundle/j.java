package com.alibaba.aliweex.bundle;

import android.app.Activity;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.WXLogUtils;
import org.json.JSONObject;
import tb.amu;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class j extends amu implements com.taobao.weex.appfram.navigator.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WXNavBarAdapter";
    private FragmentActivity mActivity;

    static {
        kge.a(-954298590);
        kge.a(684822686);
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean pop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("665cea26", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    public abstract void push(Activity activity, String str, JSONObject jSONObject);

    public j(FragmentActivity fragmentActivity) {
        this.mActivity = fragmentActivity;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean push(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68dc3a2f", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url", "");
                if (!TextUtils.isEmpty(optString)) {
                    Uri parse = Uri.parse(optString);
                    String scheme = parse.getScheme();
                    Uri.Builder buildUpon = parse.buildUpon();
                    if (!TextUtils.equals(scheme, "http") && !TextUtils.equals(scheme, "https")) {
                        buildUpon.scheme("http");
                    }
                    push(getFragmentActivity(), optString, jSONObject);
                }
            } catch (Exception e) {
                WXLogUtils.e(TAG, WXLogUtils.getStackTrace(e));
            }
        }
        return true;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.mActivity = null;
        }
    }

    public FragmentActivity getFragmentActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentActivity) ipChange.ipc$dispatch("961ba80f", new Object[]{this}) : this.mActivity;
    }
}
