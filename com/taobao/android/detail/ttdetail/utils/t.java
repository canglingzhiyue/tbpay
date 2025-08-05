package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Vertical;
import tb.eyx;
import tb.kge;

/* loaded from: classes5.dex */
public class t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1738073665);
    }

    public static void a(Context context, eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e48e0c", new Object[]{context, eyxVar});
        } else {
            a(context, eyxVar, com.taobao.android.miniLive.sdk.d.PAGE_PAUSE_ACTION);
        }
    }

    public static void b(Context context, eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db372aab", new Object[]{context, eyxVar});
        } else {
            a(context, eyxVar, com.taobao.android.miniLive.sdk.d.PAGE_RESUME_ACTION);
        }
    }

    public static void c(Context context, eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c89c74a", new Object[]{context, eyxVar});
        } else {
            a(context, eyxVar, com.taobao.android.miniLive.sdk.d.ACTION_NOTIFY_DETAIL_SLIDE_INTO_INFO);
        }
    }

    public static void d(Context context, eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ddc63e9", new Object[]{context, eyxVar});
        } else {
            a(context, eyxVar, com.taobao.android.miniLive.sdk.d.ACTION_NOTIFY_DETAIL_SLIDE_OUT_INFO);
        }
    }

    public static void a(Context context, eyx eyxVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1deccd6", new Object[]{context, eyxVar, str});
        } else if (context == null || eyxVar == null) {
        } else {
            Intent intent = new Intent(str);
            intent.putExtra("ACTIVITY_HASHCODE", context.hashCode());
            JSONObject a2 = a(eyxVar);
            if (a2 != null) {
                intent.putExtra("transparentBroadcast", a2);
            }
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        }
    }

    private static JSONObject a(eyx eyxVar) {
        Vertical vertical;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("85306934", new Object[]{eyxVar});
        }
        if (eyxVar != null && (vertical = (Vertical) eyxVar.a().a(Vertical.class)) != null) {
            return vertical.getTransparentBroadcast();
        }
        return null;
    }
}
