package com.taobao.android.live.plugin.atype.flexalocal.usertask;

import android.view.View;
import com.alibaba.fastjson.JSONObject;

/* loaded from: classes6.dex */
public interface f {
    void changeGoldUI(Object obj);

    View getView();

    void hideEntryInnerText();

    boolean isNew();

    void onPause();

    void onResume();

    void reset(String str);

    void setAtmosphere(JSONObject jSONObject);

    void setEntryImage(String str, String str2, boolean z);

    void setEntryText(String str);

    void setProgress(float f);
}
