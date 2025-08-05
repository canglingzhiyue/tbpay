package tb;

import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ScheduleComposer;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.bootstrap.tao.h;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class nso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static ScheduleComposer a(gtk gtkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduleComposer) ipChange.ipc$dispatch("b88b7e8a", new Object[]{gtkVar});
        }
        h.b("ScheduleComposerFactory", "using NGNextScheduleComposer");
        BootstrapMode.a(8);
        return new nsl(gtkVar);
    }

    public static void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{str, str2, new Integer(i)});
            return;
        }
        AppMonitor.Counter.commit(gve.MODULE, "ScheduleComposerFactory", "pageName=" + str + ",stage=" + str2 + ",state=" + i, 1.0d);
        StringBuilder sb = new StringBuilder();
        sb.append("event ");
        sb.append(str2);
        sb.append(" received, something went wrong, current composer state is: ");
        sb.append(i);
        h.b("ScheduleComposerFactory", sb.toString());
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return a.a();
        }
        return false;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static Method f31736a;
        private static Method b;

        public static /* synthetic */ Method b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Method) ipChange.ipc$dispatch("33fb52b5", new Object[0]) : f31736a;
        }

        public static /* synthetic */ Method c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Method) ipChange.ipc$dispatch("34a7fe54", new Object[0]) : b;
        }

        static {
            try {
                Method declaredMethod = MessageQueue.class.getDeclaredMethod("postSyncBarrier", new Class[0]);
                declaredMethod.setAccessible(true);
                f31736a = declaredMethod;
                Method declaredMethod2 = MessageQueue.class.getDeclaredMethod("removeSyncBarrier", Integer.TYPE);
                declaredMethod2.setAccessible(true);
                b = declaredMethod2;
            } catch (Throwable th) {
                h.a("ScheduleComposerFactory", "LazyHolder init error occurred:", th);
            }
        }

        public static boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : (f31736a == null || b == null) ? false : true;
        }
    }

    private static <T> T a(MessageQueue messageQueue, T t) {
        if (a.b() == null) {
            throw new IllegalStateException("PostSyncBarrier is null");
        }
        try {
            return (T) a.b().invoke(messageQueue, new Object[0]);
        } catch (Throwable th) {
            h.a("ScheduleComposerFactory", "postSyncBarrier error occurred:", th);
            return t;
        }
    }

    private static void a(MessageQueue messageQueue, int i) {
        if (a.c() == null) {
            throw new IllegalStateException("RemoveSyncBarrier is null");
        }
        try {
            a.c().invoke(messageQueue, Integer.valueOf(i));
        } catch (Throwable th) {
            h.a("ScheduleComposerFactory", "removeSyncBarrier error occurred:", th);
        }
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else if (i < 0) {
            throw new IllegalStateException("this token is illegal, please check");
        } else {
            gvt.a("LAUNCH_REMOVE_SYNC_BARRIER");
            a(Looper.getMainLooper().getQueue(), i);
            h.b("ScheduleComposerFactory", "released token: " + i);
            gvt.a();
        }
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        gvt.a("LAUNCH_POST_SYNC_BARRIER");
        int intValue = ((Integer) a(Looper.getMainLooper().getQueue(), 0)).intValue();
        h.b("ScheduleComposerFactory", "obtained token: " + intValue);
        gvt.a();
        return intValue;
    }
}
