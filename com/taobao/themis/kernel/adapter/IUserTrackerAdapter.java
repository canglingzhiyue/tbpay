package com.taobao.themis.kernel.adapter;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;

/* loaded from: classes9.dex */
public interface IUserTrackerAdapter extends com.taobao.themis.kernel.basic.a {
    void customAdvance(String str, String str2, String str3, String str4, String str5, Map<String, String> map);

    void customAdvance(String str, String str2, String str3, String str4, String str5, Map<String, String> map, Map<String, ? extends Object> map2);

    String getUtdid(Activity activity);

    void pageAppear(Activity activity);

    void pageAppearWithRouter(Activity activity, int i);

    void pageDisappear(Activity activity);

    void pvWithRouterIndex(Activity activity);

    void skipPage(Activity activity);

    void updateNextPageProperties(Map<String, String> map);

    void updateNextPageUtParam(JSONObject jSONObject);

    void updatePageName(Activity activity, String str);

    void updatePageProperties(Activity activity, Map<String, String> map);

    void updatePageUrl(Activity activity, String str);

    void updatePageUtParam(Activity activity, JSONObject jSONObject);
}
