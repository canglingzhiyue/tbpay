package com.taobao.android.tbuprofen.util;

import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.log.c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class StackDumpUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Method f15499a;
    private static Field b;
    private static Field c;
    private static Field d;
    private static final ConcurrentHashMap<Long, a> e;
    private static Method f;
    private static Method g;

    /* loaded from: classes6.dex */
    public interface a {
        void a(int i);
    }

    public static native String[] dumpAllNativeStacks();

    public static native String[] dumpNativeStacks(int[] iArr);

    public static native String[] dumpNativeStacksWithSignal(int[] iArr);

    public static native Object[] dumpRawStackTraceSafely(Thread thread, boolean z);

    public static native int[] findTidByName(String[] strArr);

    public static native boolean fixThreadStackDumpTimeout(long j);

    public static native void removeThreadStackDumpTimeout(long j);

    static {
        kge.a(-450713975);
        f15499a = null;
        b = null;
        c = null;
        d = null;
        f = null;
        g = null;
        if (Build.VERSION.SDK_INT >= 28) {
            f15499a = ReflectUtils.a("dalvik.system.VMStack", "getAnnotatedThreadStackTrace", Thread.class);
            b = ReflectUtils.a("dalvik.system.AnnotatedStackTraceElement", "stackTraceElement");
            c = ReflectUtils.a("dalvik.system.AnnotatedStackTraceElement", "heldLocks");
            d = ReflectUtils.a("dalvik.system.AnnotatedStackTraceElement", "blockedOn");
        }
        f = ReflectUtils.a("org.apache.harmony.dalvik.ddmc.DdmVmInternal", "getStackTraceById", Integer.TYPE);
        g = ReflectUtils.a("org.apache.harmony.dalvik.ddmc.DdmVmInternal", "getThreadStats", new Class[0]);
        e = new ConcurrentHashMap<>();
    }

    public static Object[] dumpRawStackTrace(Thread thread, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("3229020c", new Object[]{thread, new Boolean(z)});
        }
        if (z) {
            int myPid = Process.myPid();
            int a2 = a(myPid);
            if (a2 == -1) {
                c.a("StackDumpUtils", "mainTid = " + myPid + ", mainThreadId = -1", new Object[0]);
                return null;
            }
            return a(a2);
        }
        Object[] a3 = a(thread);
        return a3 == null ? thread.getStackTrace() : a3;
    }

    public static Queue<String> a(String str, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("390a375f", new Object[]{str, objArr});
        }
        if (objArr == null) {
            return null;
        }
        if (StackTraceElement.class.equals(objArr.getClass().getComponentType())) {
            return a(str, (StackTraceElement[]) objArr);
        }
        return b(str, objArr);
    }

    public static String a(Queue<String> queue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c3e8798", new Object[]{queue});
        }
        if (queue == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        for (String str : queue) {
            printWriter.println(str);
        }
        return stringWriter.toString();
    }

    private static Object[] a(Thread thread) {
        Method method = f15499a;
        if (method == null) {
            return null;
        }
        try {
            return (Object[]) method.invoke(null, thread);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static StackTraceElement[] a(int i) {
        Method method = f;
        if (method != null && i >= 0) {
            try {
                return (StackTraceElement[]) method.invoke(null, Integer.valueOf(i));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static int a(long j) {
        Method method = g;
        if (method != null) {
            try {
                return a((byte[]) method.invoke(null, new Object[0]), j);
            } catch (Exception e2) {
                e2.printStackTrace();
                return -1;
            }
        }
        return -1;
    }

    private static int a(byte[] bArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2713f568", new Object[]{bArr, new Long(j)})).intValue();
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.BIG_ENDIAN);
        wrap.get();
        wrap.get();
        wrap.get();
        wrap.get();
        while (wrap.remaining() >= 14) {
            int i = wrap.getInt();
            wrap.get();
            int i2 = wrap.getInt();
            wrap.getInt();
            wrap.getInt();
            wrap.get();
            if (i2 == j) {
                return i;
            }
        }
        return -1;
    }

    private static Queue<String> a(String str, StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("7c969f13", new Object[]{str, stackTraceElementArr});
        }
        if (stackTraceElementArr == null) {
            return null;
        }
        try {
            LinkedList linkedList = new LinkedList();
            if (str != null) {
                linkedList.add(str + " stack trace:");
            }
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                linkedList.offer("    at " + stackTraceElement);
            }
            return linkedList;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static Queue<String> b(String str, Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        try {
            LinkedList linkedList = new LinkedList();
            if (str != null) {
                linkedList.add(str + " annotated stack trace:");
            }
            for (Object obj : objArr) {
                StackTraceElement stackTraceElement = (StackTraceElement) b.get(obj);
                Object[] objArr2 = c != null ? (Object[]) c.get(obj) : null;
                Object obj2 = d != null ? d.get(obj) : null;
                linkedList.offer("    at " + stackTraceElement);
                if (obj2 != null) {
                    linkedList.offer("    " + a(obj2));
                }
                if (objArr2 != null) {
                    for (Object obj3 : objArr2) {
                        linkedList.offer("    " + b(obj3));
                    }
                }
            }
            return linkedList;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static String a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj}) : String.format("- waiting to lock <0x%08x> (a %s)", Integer.valueOf(System.identityHashCode(obj)), obj.getClass().getName());
    }

    private static String b(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e17923bb", new Object[]{obj}) : String.format("- locked <0x%08x> (a %s)", Integer.valueOf(System.identityHashCode(obj)), obj.getClass().getName());
    }

    public static boolean a(long j, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39fbdfc9", new Object[]{new Long(j), aVar})).booleanValue();
        }
        boolean fixThreadStackDumpTimeout = fixThreadStackDumpTimeout(j);
        if (fixThreadStackDumpTimeout) {
            e.put(Long.valueOf(j), aVar);
        }
        return fixThreadStackDumpTimeout;
    }

    public static void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{new Long(j)});
            return;
        }
        e.remove(Long.valueOf(j));
        removeThreadStackDumpTimeout(j);
    }

    private static void onDumpError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab868f27", new Object[]{new Integer(i)});
            return;
        }
        a aVar = e.get(Long.valueOf(Process.myTid()));
        if (aVar == null) {
            return;
        }
        aVar.a(i);
    }
}
