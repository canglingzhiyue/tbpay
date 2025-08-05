package com.taobao.android.riverlogger.inspector;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class InspectorNativeAgent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1053727445);
    }

    private static native void closeSessionNative(long j, String str);

    public static void connectionChanged(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e1cbdb", new Object[]{obj, new Boolean(z)});
        }
    }

    private static native long createSessionNative(String str, String str2, String str3);

    private static native JSONObject getAllSessionInfoNative();

    private static native JSONObject getClientInfoNative();

    private static native Object handleCommandNative(String str, int i, String str2, JSONObject jSONObject);

    private static native void onMessageCallbackNative(long j, JSONObject jSONObject);

    private static native void openSessionNative(long j, String str);

    private static native void registerAgentNative(String str, Object obj);

    private static native void registerInfoNative(String str, String str2);

    private static native void releaseMessageCallbackNative(long j);

    public static void sessionClosed(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec254f", new Object[]{obj, str});
        }
    }

    private static native void setConnectedNative(boolean z, boolean z2);

    private static native void updateEnabledNative(Set<String> set);

    private static native void updatePluginsNative(String str, String str2);

    private static native void updateSessionInfoNative(long j, String str, String str2);

    public static /* synthetic */ void access$000(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6061b1", new Object[]{new Long(j), jSONObject});
        } else {
            onMessageCallbackNative(j, jSONObject);
        }
    }

    public static void registerInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ffbb0c", new Object[]{str, str2});
            return;
        }
        com.taobao.android.riverlogger.internal.c.a();
        registerInfoNative(str, str2);
    }

    public static void registerAgent(String str, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fade570", new Object[]{str, pVar});
            return;
        }
        com.taobao.android.riverlogger.internal.c.a();
        registerAgentNative(str, pVar);
    }

    public static void setConnected(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1250cce", new Object[]{new Boolean(z), new Boolean(z2)});
            return;
        }
        com.taobao.android.riverlogger.internal.c.a();
        setConnectedNative(z, z2);
    }

    public static void updateEnabled(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b1a20", new Object[]{set});
            return;
        }
        com.taobao.android.riverlogger.internal.c.a();
        updateEnabledNative(set);
    }

    public static void updatePlugins(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2482b1b2", new Object[]{str, str2});
            return;
        }
        com.taobao.android.riverlogger.internal.c.a();
        updatePluginsNative(str, str2);
    }

    public static long createSession(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b5b19493", new Object[]{str, str2, str3})).longValue() : createSessionNative(str, str2, str3);
    }

    public static void openSession(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bc093b", new Object[]{new Long(j), str});
            return;
        }
        com.taobao.android.riverlogger.internal.c.a();
        openSessionNative(j, str);
    }

    public static void updateSessionInfo(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9b1836", new Object[]{new Long(j), str, str2});
            return;
        }
        com.taobao.android.riverlogger.internal.c.a();
        updateSessionInfoNative(j, str, str2);
    }

    public static void closeSession(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb9c69", new Object[]{new Long(j), str});
            return;
        }
        com.taobao.android.riverlogger.internal.c.a();
        closeSessionNative(j, str);
    }

    public static void handleCommand(String str, int i, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0cb5825", new Object[]{str, new Integer(i), str2, jSONObject});
            return;
        }
        com.taobao.android.riverlogger.internal.c.a();
        if (((r) handleCommandNative(str, i, str2, jSONObject)) == null) {
            return;
        }
        new q(str, i, str2, jSONObject);
    }

    public static JSONObject getClientInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("40c69604", new Object[0]);
        }
        com.taobao.android.riverlogger.internal.c.a();
        return getClientInfoNative();
    }

    public static JSONObject getAllSessionInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("89f3cdee", new Object[0]);
        }
        com.taobao.android.riverlogger.internal.c.a();
        return getAllSessionInfoNative();
    }

    public static Iterator<Map.Entry<String, r>> getPlatformCommands(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Iterator) ipChange.ipc$dispatch("6fe4c983", new Object[]{obj}) : ((p) obj).a().entrySet().iterator();
    }

    public static void sendMessage(String str, String str2, JSONObject jSONObject, int i, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f27ea5", new Object[]{str, str2, jSONObject, new Integer(i), new Long(j)});
            return;
        }
        c a2 = e.a();
        if (a2 != null) {
            a2.a(str, str2, jSONObject, MessagePriority.valueOf(i), j != 0 ? new h() { // from class: com.taobao.android.riverlogger.inspector.InspectorNativeAgent.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.riverlogger.inspector.h
                public void a(JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject2});
                    } else {
                        InspectorNativeAgent.access$000(j, jSONObject2);
                    }
                }
            } : null);
        } else if (j == 0) {
        } else {
            releaseMessageCallbackNative(j);
        }
    }

    public static void callbackMethod(int i, String str, JSONObject jSONObject, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c42ee5", new Object[]{new Integer(i), str, jSONObject, new Integer(i2)});
            return;
        }
        c a2 = e.a();
        if (a2 == null) {
            return;
        }
        a2.a(i, str, jSONObject, MessagePriority.valueOf(i2));
    }
}
