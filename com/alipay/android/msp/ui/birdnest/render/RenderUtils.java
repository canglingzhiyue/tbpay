package com.alipay.android.msp.ui.birdnest.render;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.utils.FlybirdUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class RenderUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void showWebView(JSONObject jSONObject, ViewGroup viewGroup, boolean z, Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5189c49", new Object[]{jSONObject, viewGroup, new Boolean(z), activity, new Integer(i)});
        } else {
            FlybirdUtil.showWebView(jSONObject, viewGroup, z, activity, i);
        }
    }

    public static void preloadH5OffScreen(Activity activity, ViewGroup viewGroup, JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba07b13e", new Object[]{activity, viewGroup, jSONArray, new Integer(i)});
        } else {
            FlybirdUtil.preloadH5OffScreen(activity, viewGroup, jSONArray, i);
        }
    }
}
