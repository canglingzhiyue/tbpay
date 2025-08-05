package com.taobao.tao.powermsg.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.Map;
import tb.kge;
import tb.omg;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static d f20838a;

    static {
        kge.a(-1825091544);
    }

    public static int a(int i, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acc2286b", new Object[]{new Integer(i), cVar})).intValue();
        }
        MsgLog.c("PowerMsgService", "registerDispatcher bizCode=" + i + " msgDispatcher=" + cVar);
        return a().registerDispatcher(i, null, cVar);
    }

    public static synchronized d a() {
        d dVar;
        synchronized (g.class) {
            b();
            if (f20838a == null) {
                try {
                    f20838a = (d) Class.forName("com.taobao.tao.powermsg.PowerMsgServiceImpl").newInstance();
                } catch (Exception e) {
                    MsgLog.c("PowerMsgService", "IPowerMsgService getImpl failed = " + e.getMessage());
                    e.printStackTrace();
                }
            }
            if (f20838a == null) {
                throw new RuntimeException("IPowerMsgService is null");
            }
            dVar = f20838a;
        }
        return dVar;
    }

    @Deprecated
    public static void a(int i, PowerMessage powerMessage, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca9efc10", new Object[]{new Integer(i), powerMessage, new Integer(i2)});
            return;
        }
        MsgLog.c("PowerMsgService", "report " + PowerMessage.safeToString(powerMessage));
        a().report(i, powerMessage, i2);
    }

    public static void a(int i, PowerMessage powerMessage, b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd2dbc0", new Object[]{new Integer(i), powerMessage, bVar, objArr});
            return;
        }
        MsgLog.c("PowerMsgService", "sendMessage " + PowerMessage.safeToString(powerMessage));
        a().sendMessage(i, powerMessage, bVar, objArr);
    }

    public static void a(int i, PowerMessage powerMessage, f fVar, b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144fe006", new Object[]{new Integer(i), powerMessage, fVar, bVar, objArr});
            return;
        }
        MsgLog.c("PowerMsgService", "sendStreamMessage " + powerMessage.bizCode + "|" + powerMessage.topic);
        a().sendStreamMessage(i, powerMessage, fVar, bVar, objArr);
    }

    public static void a(int i, TextPowerMessage textPowerMessage, b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa08d0d", new Object[]{new Integer(i), textPowerMessage, bVar, objArr});
            return;
        }
        MsgLog.c("PowerMsgService", "sendText " + PowerMessage.safeToString(textPowerMessage));
        a().sendText(i, textPowerMessage, bVar, objArr);
    }

    public static void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{new Integer(i), str});
            return;
        }
        MsgLog.c("PowerMsgService", "unRegisterStableDispatcher bizCode=" + i);
        a().unRegisterStableDispatcher(c(i, str));
    }

    public static void a(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd34dafe", new Object[]{new Integer(i), str, new Integer(i2)});
            return;
        }
        MsgLog.c("PowerMsgService", "setMsgFetchMode bizCode=" + i + " topic=" + str + " type=" + i2);
        a().setMsgFetchMode(i, str, i2);
    }

    public static void a(int i, String str, int i2, int i3, int i4, b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587d0a15", new Object[]{new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4), bVar, objArr});
            return;
        }
        MsgLog.c("PowerMsgService", "sendRequest bizCode=" + i + " topic=" + str + " type=" + i2 + " index=" + i3 + " pageSize=" + i4);
        a().sendRequest(i, str, i2, i3, i4, bVar, objArr);
    }

    public static void a(int i, String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e2ff02", new Object[]{new Integer(i), str, cVar});
            return;
        }
        MsgLog.c("PowerMsgService", "registerStableDispatcher bizCode=" + i + " msgDispatcher=" + cVar);
        a().registerStableDispatcher(c(i, str), cVar);
    }

    public static void a(int i, String str, String str2, String str3, String str4, b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3316250", new Object[]{new Integer(i), str, str2, str3, str4, bVar, objArr});
        } else {
            a().subscribe(i, str, str2, str3, str4, bVar, objArr);
        }
    }

    public static void a(int i, String str, String str2, String str3, String str4, String str5, b bVar, f fVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebd694c", new Object[]{new Integer(i), str, str2, str3, str4, str5, bVar, fVar, objArr});
        } else {
            a().subscribe(i, str, str2, str3, str4, str5, bVar, fVar, objArr);
        }
    }

    public static void a(int i, String str, String str2, String str3, String str4, String str5, b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b41586", new Object[]{new Integer(i), str, str2, str3, str4, str5, bVar, objArr});
            return;
        }
        MsgLog.c("PowerMsgService", "subscribe bizCode=" + i + " topic=" + str + " channel=" + str2 + " from=" + str3 + " bizTag" + str4 + " ext=" + str5);
        a().subscribe(i, str, str2, str3, str4, str5, bVar, objArr);
    }

    public static void a(int i, String str, Map<String, Double> map, boolean z, b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e43b91f", new Object[]{new Integer(i), str, map, new Boolean(z), bVar, objArr});
            return;
        }
        MsgLog.c("PowerMsgService", "countValue bizCode=" + i + " topic=" + str);
        a().countValue(i, str, map, z, bVar, objArr);
    }

    public static boolean a(int i, String str, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0e45c23", new Object[]{new Integer(i), str, fVar})).booleanValue();
        }
        MsgLog.c("PowerMsgService", "queryMessagesByStream ");
        return a().queryMessagesByStream(i, str, fVar);
    }

    public static int b(int i, String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dd01614", new Object[]{new Integer(i), str, cVar})).intValue();
        }
        MsgLog.c("PowerMsgService", "registerDispatcher bizCode=" + i + " sub=" + str + " msgDispatcher=" + cVar);
        return a().registerDispatcher(i, str, cVar);
    }

    public static c b(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("91d7fe2f", new Object[]{new Integer(i), str}) : a().getStableDispatcher(c(i, str));
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (omg.b()) {
        } else {
            com.taobao.tao.messagekit.core.utils.d.a("MKT", "c_pipe_init", 1.0d);
            MsgLog.c("PowerMsgService", "not inited success");
        }
    }

    public static void b(int i, String str, String str2, String str3, String str4, b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f45611", new Object[]{new Integer(i), str, str2, str3, str4, bVar, objArr});
        } else {
            a().unSubscribe(i, str, str2, str3, str4, bVar, objArr);
        }
    }

    public static void b(int i, String str, String str2, String str3, String str4, String str5, b bVar, f fVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513cae8d", new Object[]{new Integer(i), str, str2, str3, str4, str5, bVar, fVar, objArr});
        } else {
            a().unSubscribe(i, str, str2, str3, str4, str5, bVar, fVar, objArr);
        }
    }

    public static void b(int i, String str, String str2, String str3, String str4, String str5, b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d33fb07", new Object[]{new Integer(i), str, str2, str3, str4, str5, bVar, objArr});
        } else {
            a().unSubscribe(i, str, str2, str3, str4, str5, bVar, objArr);
        }
    }

    private static String c(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e68d5c9d", new Object[]{new Integer(i), str});
        }
        return i + "_" + str;
    }
}
