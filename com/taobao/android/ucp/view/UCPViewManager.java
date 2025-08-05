package com.taobao.android.ucp.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.njr;

/* loaded from: classes6.dex */
public class UCPViewManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Pair<String, String>, b> f15714a;
    private static b b;

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b();
    }

    static {
        kge.a(-200437008);
        f15714a = new ConcurrentHashMap();
        b = null;
    }

    public static b a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("87188395", new Object[]{str, str2});
        }
        if (!b() || !b(b)) {
            return null;
        }
        return b;
    }

    private static boolean b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed593064", new Object[]{bVar})).booleanValue() : bVar != null && bVar.b() && System.currentTimeMillis() - bVar.a() < 60000;
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7919f801", new Object[]{bVar});
            return;
        }
        b = bVar;
        if (bVar == null) {
            return;
        }
        for (b bVar2 : f15714a.values()) {
            b(bVar2);
        }
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : com.taobao.android.behavix.behavixswitch.a.a("enablePopCenterState", true);
    }

    /* loaded from: classes.dex */
    public static class PopCenterShowReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1149612450);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!UCPViewManager.a() || (jSONObject = (JSONObject) intent.getSerializableExtra("data")) == null) {
            } else {
                njr njrVar = (njr) jSONObject.get("popOperation");
                if (njrVar != null && !"low".equals(njrVar.a())) {
                    UCPViewManager.a(new c(njrVar));
                } else {
                    UCPViewManager.a(null);
                }
            }
        }
    }
}
