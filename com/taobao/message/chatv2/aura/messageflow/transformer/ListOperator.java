package com.taobao.message.chatv2.aura.messageflow.transformer;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public final class ListOperator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-772233538);
    }

    public static JSONObject updateLoadMoreStatus(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ca836991", new Object[]{str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "updateLoadMoreStatus");
        jSONObject.put("widgetNodeId", (Object) str);
        jSONObject.put("status", (Object) str2);
        return jSONObject;
    }

    public static JSONObject updatePullLoadMoreStatus(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("773aadb6", new Object[]{str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "updatePullLoadMoreStatus");
        jSONObject.put("widgetNodeId", (Object) str);
        jSONObject.put("status", (Object) str2);
        return jSONObject;
    }

    public static JSONObject scrollBottom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7374cf09", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "scrollBottom");
        jSONObject.put("widgetNodeId", (Object) str);
        return jSONObject;
    }

    public static JSONObject scrollOffset(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a2754bf2", new Object[]{str, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "scrollOffset");
        jSONObject.put("widgetNodeId", (Object) str);
        jSONObject.put(aw.PARAM_SEARCH_KEYWORD_POS, (Object) Integer.valueOf(i));
        return jSONObject;
    }

    public static JSONObject scrollOffset(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cc3c8762", new Object[]{str, new Integer(i), new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "scrollOffset");
        jSONObject.put("widgetNodeId", (Object) str);
        jSONObject.put(aw.PARAM_SEARCH_KEYWORD_POS, (Object) Integer.valueOf(i));
        jSONObject.put("animation", (Object) Boolean.valueOf(z));
        return jSONObject;
    }

    public static JSONObject scrollOffset(String str, int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("db5cb9f2", new Object[]{str, new Integer(i), new Boolean(z), new Boolean(z2)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "scrollOffset");
        jSONObject.put("widgetNodeId", (Object) str);
        jSONObject.put(aw.PARAM_SEARCH_KEYWORD_POS, (Object) Integer.valueOf(i));
        jSONObject.put("animation", (Object) Boolean.valueOf(z));
        jSONObject.put("delay", (Object) Boolean.valueOf(z2));
        return jSONObject;
    }

    public static JSONObject shimmerItem(String str, List<Integer> list, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1dac0da0", new Object[]{str, list, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "shimmerItem");
        jSONObject.put("widgetNodeId", (Object) str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.addAll(list);
        jSONObject.put("list", (Object) jSONArray);
        jSONObject.put("partShimmerNodeId", (Object) str2);
        return jSONObject;
    }
}
