package com.taobao.android.detail.ttdetail.content;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import java.util.Map;
import tb.hjs;
import tb.ivx;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1165973951);
    }

    public static JSONObject a(JSONArray jSONArray, JSONObject jSONObject, String str, String str2, String str3, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e8b03c92", new Object[]{jSONArray, jSONObject, str, str2, str3, jSONObject2});
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONArray != null) {
            jSONObject3.put(hjs.UNDER_TAKE_GOODS_LIST, (Object) jSONArray);
        }
        if (jSONObject != null) {
            jSONObject3.put("filter", (Object) jSONObject);
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("code", (Object) str);
        jSONObject4.put("errorMsg", (Object) str2);
        jSONObject3.put("state", (Object) jSONObject4);
        jSONObject3.put("rootHeight", (Object) str3);
        if (jSONObject2 != null) {
            jSONObject3.put("utParams", (Object) jSONObject2);
        }
        return jSONObject3;
    }

    public static JSONArray a(JSONArray jSONArray, String str, String str2, Map<String, JSONArray> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("2cd65af", new Object[]{jSONArray, str, str2, map, jSONObject});
        }
        int a2 = a(str, map.get("all"));
        JSONObject jSONObject2 = null;
        JSONArray jSONArray2 = map.get("all");
        if (a2 != -1 && jSONArray2 != null) {
            jSONObject2 = jSONArray2.getJSONObject(a2);
        }
        if (jSONArray == null) {
            return new JSONArray();
        }
        JSONArray parseArray = JSONArray.parseArray(jSONArray.toJSONString());
        int a3 = a(str, parseArray);
        if (jSONObject2 != null) {
            JSONObject parseObject = JSONObject.parseObject(jSONObject2.toJSONString());
            parseObject.put(ivx.IMAGE_TYPE_HEAD, (Object) "true");
            if (a3 == 0) {
                parseArray.set(0, parseObject);
            } else {
                if (a3 != -1) {
                    parseArray.mo1572remove(a3);
                }
                parseArray.add(0, parseObject);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", (Object) ivx.IMAGE_TYPE_HEAD);
            jSONObject3.put("title", (Object) str2);
            if (parseArray.size() >= 3 && ivx.IMAGE_TYPE_HEAD.equals(parseArray.getJSONObject(1).getString("type"))) {
                parseArray.set(1, jSONObject3);
            } else {
                parseArray.add(1, jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("filter", (Object) jSONObject);
            if (parseArray.size() >= 3 && parseArray.getJSONObject(2).getJSONObject("filter") != null) {
                parseArray.set(2, jSONObject4);
            } else {
                parseArray.add(2, jSONObject4);
            }
        } else {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("filter", (Object) jSONObject);
            parseArray.add(0, jSONObject5);
        }
        return parseArray;
    }

    public static int a(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0d6dd4d", new Object[]{str, jSONArray})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            String string = jSONArray.getJSONObject(i).getString("id");
            if (!TextUtils.isEmpty(str) && str.equals(string)) {
                return i;
            }
        }
        return -1;
    }

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static void a(String str, JSONObject jSONObject, DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ada9ae", new Object[]{str, jSONObject, dXRecyclerLayout});
        } else if (dXRecyclerLayout == null) {
        } else {
            DXMsgCenterEvent dXMsgCenterEvent = new DXMsgCenterEvent(0L);
            dXMsgCenterEvent.setType("General");
            dXMsgCenterEvent.setMethod(str);
            dXMsgCenterEvent.setParams(jSONObject);
            dXRecyclerLayout.postEvent(dXMsgCenterEvent);
        }
    }

    public static void a(Handler handler, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f3c616", new Object[]{handler, runnable});
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }
}
