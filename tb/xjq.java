package tb;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.msg.QoSLevel;
import com.taobao.android.launcher.bootstrap.tao.h;

/* loaded from: classes5.dex */
public class xjq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static boolean a(jzi jziVar, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba7e7af6", new Object[]{jziVar, message})).booleanValue();
        }
        if (b(message)) {
            return false;
        }
        int a2 = QoSLevel.a(jziVar, message);
        return a2 == 3 || a2 == 2;
    }

    public static jzh a(jzi jziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzh) ipChange.ipc$dispatch("79c15c6f", new Object[]{jziVar});
        }
        if (!xjo.sAvailable) {
            h.b("QoScheduler", "QoScheduler is not supported on this device");
            return null;
        }
        h.b("QoScheduler", "schedule started");
        try {
            if (jziVar.f29882a) {
                a(Looper.myQueue());
            }
            jzh b = b(jziVar);
            h.b("QoScheduler", "schedule finished, report: " + b);
            if (jziVar.f29882a) {
                a(Looper.myQueue());
            }
            return b;
        } catch (Throwable th) {
            h.a("QoScheduler", "schedule failed due to:", th);
            return null;
        }
    }

    private static jzh b(jzi jziVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (jzh) ipChange.ipc$dispatch("616332ce", new Object[]{jziVar});
        }
        if (!jziVar.b) {
            return null;
        }
        MessageQueue myQueue = Looper.myQueue();
        long uptimeMillis = SystemClock.uptimeMillis();
        Message a2 = xjo.a(myQueue);
        int i2 = 0;
        while (a2 != null) {
            i++;
            boolean a3 = a(jziVar, a2);
            Message a4 = xjo.a(a2);
            if (a3) {
                h.b("QoScheduler", "qos sensitive message found: " + a2);
                i2++;
                if (jziVar.d) {
                    f(a2);
                }
            }
            a2 = a4;
        }
        return new jzh(i, i2, SystemClock.uptimeMillis() - uptimeMillis);
    }

    private static void f(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8b5ac0", new Object[]{message});
            return;
        }
        Bundle data = message.getData();
        data.putBoolean("__sensitive_msg__", true);
        data.putLong("__sensitive_reply_when__", SystemClock.uptimeMillis());
        Runnable callback = message.getCallback();
        if (callback instanceof xjm) {
            callback.run();
        } else if (callback instanceof xjn) {
            xjo.a(message, "SensitiveRunnable").getCallback().run();
        } else {
            data.putBoolean("__sensitive_reply__", true);
            message.getTarget().dispatchMessage(Message.obtain(message));
            e(message);
            data.remove("__sensitive_reply__");
        }
    }

    public static boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{message})).booleanValue();
        }
        Bundle peekData = message.peekData();
        return peekData != null && peekData.getBoolean("__sensitive_reply__");
    }

    public static boolean b(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeca26c0", new Object[]{message})).booleanValue();
        }
        Bundle peekData = message.peekData();
        return peekData != null && peekData.getBoolean("__sensitive_msg__");
    }

    public static long c(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fa73b1", new Object[]{message})).longValue();
        }
        Bundle peekData = message.peekData();
        if (peekData != null) {
            return peekData.getLong("__sensitive_reply_when__", -1L);
        }
        return -1L;
    }

    public static long d(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f72ac0b2", new Object[]{message})).longValue();
        }
        Bundle peekData = message.peekData();
        if (peekData != null) {
            return peekData.getLong("__sensitive_replied_when__", -1L);
        }
        return -1L;
    }

    public static void e(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5b0dbf", new Object[]{message});
        } else {
            message.getData().putLong("__sensitive_replied_when__", SystemClock.uptimeMillis());
        }
    }

    private static void a(MessageQueue messageQueue) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99abb124", new Object[]{messageQueue});
            return;
        }
        h.b("QoScheduler", "dumpQueue started.");
        for (Message a2 = xjo.a(messageQueue); a2 != null; a2 = xjo.a(a2)) {
            i++;
            h.b("QoScheduler", "====> when=" + a2.getWhen() + ", msg=" + a2.what);
        }
        h.b("QoScheduler", "dumpQueue finished, totalCount: " + i);
    }
}
