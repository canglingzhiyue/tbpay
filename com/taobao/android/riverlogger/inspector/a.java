package com.taobao.android.riverlogger.inspector;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean g;
    private static boolean h;

    static {
        kge.a(-1617372007);
        g = false;
        h = false;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            InspectorNativeAgent.registerInfo(str, str2);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : g;
    }

    public static void a(f fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ea6f79", new Object[]{fVar, str});
        } else if (!g) {
        } else {
            fVar.b(str);
        }
    }

    public static void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{new Boolean(z), new Boolean(z2)});
            return;
        }
        g = z;
        if (z) {
            h = z2;
        } else {
            h = false;
        }
        InspectorNativeAgent.setConnected(z, z2);
    }

    public static void a(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b95557", new Object[]{set});
        } else {
            InspectorNativeAgent.updateEnabled(set);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            InspectorNativeAgent.updatePlugins(str, str2);
        }
    }

    public static void a(String str, int i, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88679c03", new Object[]{str, new Integer(i), str2, jSONObject});
        } else {
            InspectorNativeAgent.handleCommand(str, i, str2, jSONObject);
        }
    }

    public static void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec64652", new Object[]{cVar});
            return;
        }
        cVar.a("Dev.clientInfo", (String) null, InspectorNativeAgent.getClientInfo(), MessagePriority.Normal, (h) null);
        JSONObject allSessionInfo = InspectorNativeAgent.getAllSessionInfo();
        if (allSessionInfo == null) {
            return;
        }
        Iterator<String> keys = allSessionInfo.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = allSessionInfo.optJSONObject(next);
            if (optJSONObject != null) {
                cVar.a("Dev.pageOpen", next, optJSONObject, MessagePriority.Normal, (h) null);
            }
        }
    }

    @Deprecated
    public static void a(f fVar, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba64f70", new Object[]{fVar, set});
        } else {
            a(fVar, TextUtils.join(",", set));
        }
    }
}
