package com.taobao.android.detail.core.standard.lightoff;

import android.view.View;
import com.alibaba.fastjson.JSONObject;

/* loaded from: classes4.dex */
public interface c {
    View getView();

    void loadView();

    void onDestroy();

    void onDismiss();

    void onLocatorTo(JSONObject jSONObject);

    void onLongClick();

    void onPause();

    void onResume();

    void onShow();

    void onStop();

    void setLoadUrl(String str);

    void setTransHelpCallback(b bVar);
}
