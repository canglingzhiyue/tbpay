package com.taobao.android.detail.core.utils;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import tb.ecu;
import tb.emu;
import tb.eqb;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(82443443);
        emu.a("com.taobao.android.detail.core.utils.BroadcastUtils");
    }

    public static void a(Activity activity, com.taobao.android.detail.datasdk.model.datamodel.node.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa55e633", new Object[]{activity, cVar});
        } else if (activity == null || !ecu.J || d(activity)) {
        } else {
            Intent intent = new Intent(com.taobao.android.miniLive.sdk.d.PAGE_PAUSE_ACTION);
            intent.putExtra("ACTIVITY_HASHCODE", activity.hashCode());
            JSONObject a2 = a(cVar);
            if (a2 != null) {
                intent.putExtra("transparentBroadcast", a2);
            }
            LocalBroadcastManager.getInstance(activity).sendBroadcast(intent);
            i.c("BroadcastUtils", "broadcastDetailPause");
        }
    }

    public static void b(Activity activity, com.taobao.android.detail.datasdk.model.datamodel.node.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24253b4", new Object[]{activity, cVar});
        } else if (activity == null || !ecu.J || d(activity)) {
        } else {
            Intent intent = new Intent(com.taobao.android.miniLive.sdk.d.PAGE_RESUME_ACTION);
            intent.putExtra("ACTIVITY_HASHCODE", activity.hashCode());
            JSONObject a2 = a(cVar);
            if (a2 != null) {
                intent.putExtra("transparentBroadcast", a2);
            }
            LocalBroadcastManager.getInstance(activity).sendBroadcast(intent);
            i.c("BroadcastUtils", "broadcastDetailResume");
        }
    }

    public static void c(Activity activity, com.taobao.android.detail.datasdk.model.datamodel.node.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2ec135", new Object[]{activity, cVar});
        } else if (activity == null || !ecu.J || d(activity)) {
        } else {
            Intent intent = new Intent(com.taobao.android.miniLive.sdk.d.ACTION_NOTIFY_DETAIL_SHOW);
            intent.putExtra("ACTIVITY_HASHCODE", activity.hashCode());
            JSONObject a2 = a(cVar);
            if (a2 != null) {
                intent.putExtra("transparentBroadcast", a2);
            }
            LocalBroadcastManager.getInstance(activity).sendBroadcast(intent);
            i.c("BroadcastUtils", "broadcastDetailShow");
        }
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
        } else if (activity == null || !ecu.J || d(activity)) {
        } else {
            Intent intent = new Intent(com.taobao.android.miniLive.sdk.d.ACTION_NOTIFY_DETAIL_SLIDE_INTO_INFO);
            intent.putExtra("ACTIVITY_HASHCODE", activity.hashCode());
            JSONObject c = c(activity);
            if (c != null) {
                intent.putExtra("transparentBroadcast", c);
            }
            LocalBroadcastManager.getInstance(activity).sendBroadcast(intent);
            i.c("BroadcastUtils", "broadcastDetailInfoSlideInto");
        }
    }

    public static void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{activity});
        } else if (activity == null || !ecu.J || d(activity)) {
        } else {
            Intent intent = new Intent(com.taobao.android.miniLive.sdk.d.ACTION_NOTIFY_DETAIL_SLIDE_OUT_INFO);
            intent.putExtra("ACTIVITY_HASHCODE", activity.hashCode());
            JSONObject c = c(activity);
            if (c != null) {
                intent.putExtra("transparentBroadcast", c);
            }
            LocalBroadcastManager.getInstance(activity).sendBroadcast(intent);
            i.c("BroadcastUtils", "broadcastDetailInfoSlideOut");
        }
    }

    public static void a(Activity activity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d13476", new Object[]{activity, jSONObject});
        } else if (activity == null || !ecu.J || d(activity)) {
        } else {
            Intent intent = new Intent(com.taobao.android.miniLive.sdk.d.PAGE_DETAIL_UPP_SHOWFLOATVIEWNOTIFICATION);
            intent.putExtra("ACTIVITY_HASHCODE", activity.hashCode());
            JSONObject c = c(activity);
            if (c != null) {
                intent.putExtra("transparentBroadcast", c);
            }
            if (jSONObject != null) {
                intent.putExtra("UPP_DATA", jSONObject);
            }
            LocalBroadcastManager.getInstance(activity).sendBroadcast(intent);
            i.c("BroadcastUtils", "broadcastDetailInfoSlideOut");
        }
    }

    private static JSONObject c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("151f025c", new Object[]{activity});
        }
        if (!(activity instanceof DetailCoreActivity)) {
            return null;
        }
        return a(((DetailCoreActivity) activity).C());
    }

    private static JSONObject a(com.taobao.android.detail.datasdk.model.datamodel.node.c cVar) {
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar;
        VerticalNode g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ce26be81", new Object[]{cVar});
        }
        if (cVar != null && (bVar = cVar.f10055a) != null && (g = eqb.g(bVar)) != null && g.getData() != null) {
            return g.getData().getJSONObject("transparentBroadcast");
        }
        return null;
    }

    private static boolean d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b27d5801", new Object[]{activity})).booleanValue();
        }
        if (!(activity instanceof com.taobao.android.detail.core.detail.activity.c)) {
            return false;
        }
        return ((com.taobao.android.detail.core.detail.activity.c) activity).J_();
    }
}
