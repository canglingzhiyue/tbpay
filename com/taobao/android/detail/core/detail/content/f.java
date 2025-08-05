package com.taobao.android.detail.core.detail.content;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import tb.emu;
import tb.hjs;
import tb.kge;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Handler f9449a;

    static {
        kge.a(-243456505);
        f9449a = new Handler(Looper.getMainLooper());
        emu.a("com.taobao.android.detail.core.detail.content.ContentUtils");
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

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            f9449a.post(runnable);
        } else {
            runnable.run();
        }
    }
}
