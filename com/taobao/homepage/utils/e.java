package com.taobao.homepage.utils;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.kge;
import tb.lbq;
import tb.oiy;
import tb.tim;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2013287791);
    }

    public static Context a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("52552462", new Object[]{view});
        }
        Activity activity = null;
        lbq b = oiy.a().b();
        if (b != null) {
            activity = b.getCurActivity();
        }
        return activity == null ? view.getContext() : activity;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        DinamicXEngine.a(true);
        com.taobao.android.dinamic.e.a(true);
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461bb032", new Object[]{jSONObject, jSONObject2, str});
        } else if (jSONObject == null || jSONObject2 == null || (jSONObject3 = jSONObject.getJSONObject("args")) == null || !StringUtils.equals("1", jSONObject3.getString(tim.S_ARGS_IS_CLIENT_CACHE)) || (jSONObject4 = jSONObject2.getJSONObject(str)) == null) {
        } else {
            JSONObject jSONObject5 = jSONObject4.getJSONObject("args");
            if (jSONObject5 == null) {
                jSONObject5 = new JSONObject();
                jSONObject2.put("args", (Object) jSONObject5);
            }
            jSONObject5.put(tim.S_ARGS_IS_CLIENT_CACHE, "1");
        }
    }

    public static void a(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63cd4437", new Object[]{dXRuntimeContext, jSONObject});
        } else {
            a(dXRuntimeContext.e(), jSONObject, "clickParam");
        }
    }

    public static void b(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abcca296", new Object[]{dXRuntimeContext, jSONObject});
        } else {
            a(dXRuntimeContext.e(), jSONObject, com.taobao.android.home.component.utils.h.TRACK_EXPOSURE_PARAM);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
        } else {
            a(jSONObject, jSONObject2, "clickParam");
        }
    }
}
