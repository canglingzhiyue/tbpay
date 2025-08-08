package com.taobao.android.ucp.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.LinkedMapWithMaxSize;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavir.util.g;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tb.bzy;
import tb.kge;

/* loaded from: classes.dex */
public class UCPTrackBroadCastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXPOSE = "Expose";
    public static final String EXPOSE_STATE = "ExposeState";
    public static final String UCP_TRACKER = "UCPTracker";

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Long> f15710a = Collections.synchronizedMap(new LinkedMapWithMaxSize(10));

    static {
        kge.a(2071978074);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            Utils.b bVar = (Utils.b) Utils.a((JSONObject) intent.getSerializableExtra("trackInfo")).get("nonSerializableData");
            if (bVar == null || !bVar.a().getBooleanValue("fromNative")) {
                return;
            }
            a(intent, (NativeBroadcast.Callback) bVar.a().get("nativeCallback"));
        } catch (Exception e) {
            com.taobao.android.behavir.util.d.a("UCPTracker", e.toString(), e.getMessage());
            if (!Debuggable.isDebug()) {
                return;
            }
            throw new RuntimeException("ucp 数据回流异常" + e.getMessage());
        }
    }

    private static void a(Intent intent, NativeBroadcast.Callback callback) {
        boolean z;
        List a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a4058f", new Object[]{intent, callback});
            return;
        }
        String stringExtra = intent.getStringExtra("key");
        String stringExtra2 = intent.getStringExtra("group");
        String stringExtra3 = intent.getStringExtra("type");
        String stringExtra4 = intent.getStringExtra("errorMessage");
        JSONObject a3 = Utils.a((JSONObject) intent.getSerializableExtra("trackInfo"));
        JSONObject a4 = Utils.a((JSONObject) intent.getSerializableExtra("bizTrackInfo"));
        if (!a4.getBooleanValue("displayed")) {
            String a5 = a.a("compensateErrorCodes", "");
            if (StringUtils.isEmpty(a5)) {
                a2 = Arrays.asList("OnViewJSClose", bzy.POINT_CONFIG_FAIL, "OnViewErrorClose", "Error");
            } else {
                a2 = g.a(JSON.parseArray(a5), String.class);
            }
            if (a2.contains(stringExtra)) {
                z = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", (Object) stringExtra);
                jSONObject.put("group", (Object) stringExtra2);
                jSONObject.put("type", (Object) stringExtra3);
                jSONObject.put("bizTrackInfo", (Object) a4);
                jSONObject.put("error", (Object) Boolean.valueOf(z));
                jSONObject.put("errorCode", (Object) TypeUtils.castToInt(intent.getExtras().get("errorCode")));
                jSONObject.put("trackInfo", (Object) a3);
                jSONObject.put("errorMessage", (Object) stringExtra4);
                callback.callback(jSONObject, null);
                if (!"track".equals(stringExtra3) || Arrays.asList("PopReceiver", "PopViewLoaded", "PopDSLFetched", "PopPreRequested").contains(stringExtra)) {
                }
                callback.close();
                return;
            }
        }
        z = false;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("key", (Object) stringExtra);
        jSONObject2.put("group", (Object) stringExtra2);
        jSONObject2.put("type", (Object) stringExtra3);
        jSONObject2.put("bizTrackInfo", (Object) a4);
        jSONObject2.put("error", (Object) Boolean.valueOf(z));
        jSONObject2.put("errorCode", (Object) TypeUtils.castToInt(intent.getExtras().get("errorCode")));
        jSONObject2.put("trackInfo", (Object) a3);
        jSONObject2.put("errorMessage", (Object) stringExtra4);
        callback.callback(jSONObject2, null);
        if (!"track".equals(stringExtra3)) {
        }
    }
}
