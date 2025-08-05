package com.taobao.tao.messagekit.core.utils;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.kge;
import tb.omg;

/* loaded from: classes8.dex */
public class MsgLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f20785a;
    private static a b;

    /* loaded from: classes8.dex */
    public enum Level {
        V,
        D,
        I,
        W,
        E,
        L
    }

    /* loaded from: classes8.dex */
    public interface a {
        void a(String str, String str2);

        void b(String str, String str2);

        void c(String str, String str2);
    }

    static {
        kge.a(-1359572847);
        f20785a = false;
        try {
            Class.forName(OConstant.REFLECT_TLOG);
            f20785a = true;
        } catch (ClassNotFoundException unused) {
            f20785a = false;
        }
    }

    private static String a(Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c12de79c", new Object[]{th, objArr});
        }
        return a(objArr) + '\n' + Log.getStackTraceString(th);
    }

    private static String a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2583e9f7", new Object[]{objArr});
        }
        StringBuilder sb = new StringBuilder();
        if (objArr != null) {
            for (Object obj : objArr) {
                sb.append("|");
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7eecb", new Object[]{aVar});
        } else {
            b = aVar;
        }
    }

    public static void a(String str, com.taobao.tao.messagekit.core.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d777f2b5", new Object[]{str, bVar});
        } else {
            a(str, null, "msg:", Integer.valueOf(bVar.b), "biz:", Integer.valueOf(bVar.f20780a.bizCode()), "topic:", bVar.f20780a.topic(), "mqtt:", Integer.valueOf(bVar.f20780a.msgType()), "type:", Integer.valueOf(bVar.f20780a.type()), "subType:", Integer.valueOf(bVar.f20780a.subType()), "ack:", Boolean.valueOf(bVar.f20780a.needACK()), "router:", bVar.f20780a.routerId(), "usr", bVar.f20780a.userId(), "qos", Byte.valueOf(bVar.f20780a.qosLevel()), "tag", bVar.e, "mid:", bVar.f20780a.getID(), "dataid", bVar.c, "source", Integer.valueOf(bVar.d));
        }
    }

    public static void a(String str, Throwable th, Object... objArr) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4328134e", new Object[]{str, th, objArr});
        } else if (!a() || (aVar = b) == null) {
        } else {
            aVar.a("PMMESSAGES_" + str, a(th, objArr));
        }
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
        } else {
            b(str, null, objArr);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean a(Level level) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5e51eec", new Object[]{level})).booleanValue();
        }
        if (omg.c() || !f20785a) {
            return true;
        }
        Level level2 = Level.L;
        try {
            level2 = Level.valueOf(AdapterForTLog.getLogLevel());
        } catch (Exception unused) {
        }
        return level.ordinal() >= level2.ordinal();
    }

    public static void b(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b7978f", new Object[]{str, th, objArr});
        } else if (b == null || !a(Level.I)) {
        } else {
            a aVar = b;
            aVar.b("PMMESSAGES_" + str, a(th, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2d52de", new Object[]{str, objArr});
        } else {
            b(str, null, objArr);
        }
    }

    public static void c(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a471bd0", new Object[]{str, th, objArr});
            return;
        }
        a aVar = b;
        if (aVar == null) {
            return;
        }
        aVar.c("PMMESSAGES_" + str, a(th, objArr));
    }

    public static void c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919287fd", new Object[]{str, objArr});
        } else {
            c(str, null, objArr);
        }
    }
}
