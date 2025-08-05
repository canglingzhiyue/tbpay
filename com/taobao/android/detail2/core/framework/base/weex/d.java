package com.taobao.android.detail2.core.framework.base.weex;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;

/* loaded from: classes5.dex */
public interface d {
    void fireEvent(String str, JSONObject jSONObject);

    String getBundleUrl();

    View getContainerView();

    Context getContext();
}
