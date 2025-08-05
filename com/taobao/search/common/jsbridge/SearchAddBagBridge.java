package com.taobao.search.common.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.taobao.search.mmd.util.f;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.tfu;

/* loaded from: classes7.dex */
public class SearchAddBagBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "TBSearchSKUBridge";
    private static final String LOG_TAG = "SearchAddBagBridge";

    static {
        kge.a(-1750150683);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (tfu.ADD_CART.equals(str) && !TextUtils.isEmpty(str2)) {
            q.i(LOG_TAG, "params str is ok");
            try {
                jSONObject = new JSONObject(str2);
                q.i(LOG_TAG, "json is ok");
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            return f.a().a(jSONObject.optString("itemid"));
        }
        q.h(LOG_TAG, "no action :" + str);
        return false;
    }
}
