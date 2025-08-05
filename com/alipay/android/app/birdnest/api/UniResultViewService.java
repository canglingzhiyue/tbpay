package com.alipay.android.app.birdnest.api;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class UniResultViewService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract View createView(String str, Context context);

    public abstract int getHeight();

    public abstract void setOnUpdateHeightListener(OnUpdateHeightListener onUpdateHeightListener);

    public JSONObject onPageEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ae07d5f3", new Object[]{this, str, jSONObject});
        }
        LogUtil.d("UniResultViewService", "onPageEvent", "onPageEvent not override, event: ".concat(String.valueOf(str)));
        return new JSONObject();
    }
}
