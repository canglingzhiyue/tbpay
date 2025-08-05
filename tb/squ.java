package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.dinamicx.DXRootView;

/* loaded from: classes6.dex */
public interface squ {
    JSONArray getChannelTabExpInfo();

    JSONObject getTabRecommendData();

    void onAccountInfoChanged(String str, DXRootView dXRootView, JSONObject jSONObject);

    void onFollowChangedAction(String str, DXRootView dXRootView, JSONObject jSONObject);

    void onHorizontalScrollEnable(String str, DXRootView dXRootView, JSONObject jSONObject);

    void onSwitchToSingleTab(String str, DXRootView dXRootView, JSONObject jSONObject);
}
