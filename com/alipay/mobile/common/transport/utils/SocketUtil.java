package com.alipay.mobile.common.transport.utils;

import android.os.Build;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

/* loaded from: classes3.dex */
public class SocketUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Class f5637a;
    private static Class b;
    private static Class c;
    private static Object d;
    private static Method e;
    private static Method f;
    private static Method g;
    private static Method h;
    private static Method i;
    private static Integer j;
    private static Integer k;

    /* loaded from: classes3.dex */
    public static class SndTimeoutInitModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Integer sol_socket = null;
        public Integer so_sndtimeo = null;
        public FileDescriptor fileDescriptor = null;
        public boolean result = false;

        public static SndTimeoutInitModel getInstance(Socket socket) {
            SndTimeoutInitModel sndTimeoutInitModel = new SndTimeoutInitModel();
            if (socket == null) {
                LogCatUtil.warn("SocketUtil", "socket is null");
                return sndTimeoutInitModel;
            } else if (socket.isClosed()) {
                LogCatUtil.warn("SocketUtil", "socket is closed");
                return sndTimeoutInitModel;
            } else {
                sndTimeoutInitModel.sol_socket = SocketUtil.access$000();
                if (sndTimeoutInitModel.sol_socket == null) {
                    LogCatUtil.warn("SocketUtil", "sol_socket is closed");
                    return sndTimeoutInitModel;
                }
                sndTimeoutInitModel.so_sndtimeo = SocketUtil.access$100();
                if (sndTimeoutInitModel.so_sndtimeo == null) {
                    LogCatUtil.warn("SocketUtil", "so_sndtimeo is closed");
                    return sndTimeoutInitModel;
                }
                Method access$200 = SocketUtil.access$200(socket.getClass());
                if (access$200 == null) {
                    LogCatUtil.warn("SocketUtil", "getGetFileDescriptorMethod return null");
                    return sndTimeoutInitModel;
                }
                try {
                    sndTimeoutInitModel.fileDescriptor = (FileDescriptor) access$200.invoke(socket, new Object[0]);
                    if (sndTimeoutInitModel.fileDescriptor == null) {
                        LogCatUtil.warn("SocketUtil", "fileDescriptor is null");
                        return sndTimeoutInitModel;
                    }
                    sndTimeoutInitModel.result = true;
                    return sndTimeoutInitModel;
                } catch (Throwable th) {
                    LogCatUtil.warn("SocketUtil", "Invoke getFileDescriptor method fail", th);
                    return sndTimeoutInitModel;
                }
            }
        }
    }

    public static /* synthetic */ Integer access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("4b3756de", new Object[0]) : h();
    }

    public static /* synthetic */ Integer access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("cf67a3df", new Object[0]) : i();
    }

    public static /* synthetic */ Method access$200(Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Method) ipChange.ipc$dispatch("64261c9a", new Object[]{cls}) : a(cls);
    }

    public static final boolean setSndTimeOut(Socket socket, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edd5715a", new Object[]{socket, new Long(j2)})).booleanValue();
        }
        try {
            if (!TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.SET_SND_TIMEOUT_SWITCH, "T")) {
                LogCatUtil.info("SocketUtil", "setSndTimeOut. SET_SND_TIMEOUT_SWITCH off");
                return false;
            }
            return doSetSndTimeOut(socket, j2);
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "setSndTimeOut fail", th);
            return false;
        }
    }

    public static final Integer getSndTimeOut(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("f58b9e61", new Object[]{socket});
        }
        try {
            if (!TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.SET_SND_TIMEOUT_SWITCH, "T")) {
                LogCatUtil.info("SocketUtil", "getSndTimeOut. SET_SND_TIMEOUT_SWITCH off");
                return null;
            }
            return a(socket);
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "getSndTimeOut fail", th);
            return null;
        }
    }

    private static final Integer a(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("cf2562e", new Object[]{socket});
        }
        SndTimeoutInitModel sndTimeoutInitModel = SndTimeoutInitModel.getInstance(socket);
        if (sndTimeoutInitModel.result) {
            return a(sndTimeoutInitModel.fileDescriptor, sndTimeoutInitModel.sol_socket.intValue(), sndTimeoutInitModel.so_sndtimeo.intValue());
        }
        return null;
    }

    public static boolean doSetSndTimeOut(Socket socket, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27b588cf", new Object[]{socket, new Long(j2)})).booleanValue();
        }
        SndTimeoutInitModel sndTimeoutInitModel = SndTimeoutInitModel.getInstance(socket);
        if (sndTimeoutInitModel.result) {
            return a(sndTimeoutInitModel.fileDescriptor, sndTimeoutInitModel.sol_socket.intValue(), sndTimeoutInitModel.so_sndtimeo.intValue(), j2);
        }
        return false;
    }

    private static final Integer a(FileDescriptor fileDescriptor, int i2, int i3) {
        Method j2;
        Method d2 = d();
        if (d2 == null || (j2 = j()) == null) {
            return null;
        }
        try {
            Long l = (Long) j2.invoke(d2.invoke(b(), fileDescriptor, Integer.valueOf(i2), Integer.valueOf(i3)), new Object[0]);
            LogCatUtil.info("SocketUtil", "getSockoptTimeval is " + l);
            return Integer.valueOf(l.intValue());
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "getSockoptTimeval fail", th);
            return null;
        }
    }

    private static final boolean a(FileDescriptor fileDescriptor, int i2, int i3, long j2) {
        Object a2;
        Method c2 = c();
        if (c2 == null || (a2 = a(j2)) == null) {
            return false;
        }
        try {
            c2.invoke(b(), fileDescriptor, Integer.valueOf(i2), Integer.valueOf(i3), a2);
            return true;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "SetsockoptTimeval fail", th);
            return false;
        }
    }

    private static Object a(long j2) {
        Method f2 = f();
        if (f2 == null) {
            return null;
        }
        try {
            return f2.invoke(e(), Long.valueOf(j2));
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "invoke fromMillis fail.", th);
            return null;
        }
    }

    private static final Class a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("5d842d15", new Object[0]);
        }
        Class cls = f5637a;
        if (cls != null) {
            return cls;
        }
        try {
            Class<?> cls2 = Class.forName("libcore.io.Libcore");
            f5637a = cls2;
            if (cls2 != null) {
                return null;
            }
            LogCatUtil.warn("SocketUtil", "libcoreClass loaded , but be null");
            return null;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "getLibcoreClass exception.", th);
            return null;
        }
    }

    private static final Object b() {
        Object obj = d;
        if (obj != null) {
            return obj;
        }
        Class a2 = a();
        if (a2 == null) {
            return null;
        }
        try {
            Field declaredField = a2.getDeclaredField("os");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(a2);
            d = obj2;
            if (obj2 == null) {
                LogCatUtil.warn("SocketUtil", "os get finish , but be null");
            }
            return d;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "getOsField fail.", th);
            return null;
        }
    }

    private static final Method c() {
        Class<?> e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("34a7fe54", new Object[0]);
        }
        Method method = e;
        if (method != null) {
            return method;
        }
        Object b2 = b();
        if (b2 == null || (e2 = e()) == null) {
            return null;
        }
        try {
            Method method2 = b2.getClass().getMethod("setsockoptTimeval", FileDescriptor.class, Integer.TYPE, Integer.TYPE, e2);
            e = method2;
            method2.setAccessible(true);
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "get setsockoptTimeval method fail.", th);
        }
        return e;
    }

    private static final Method d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("3554a9f3", new Object[0]);
        }
        Method method = f;
        if (method != null) {
            return method;
        }
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        try {
            Method method2 = b2.getClass().getMethod("getsockoptTimeval", FileDescriptor.class, Integer.TYPE, Integer.TYPE);
            f = method2;
            method2.setAccessible(true);
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "get getSockoptTimeval method fail.", th);
        }
        return f;
    }

    private static final Class e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("8fe80319", new Object[0]);
        }
        Class cls = b;
        if (cls != null) {
            return cls;
        }
        if (Build.VERSION.SDK_INT < 21) {
            try {
                b = Class.forName("libcore.io.StructTimeval");
            } catch (Throwable th) {
                LogCatUtil.warn("SocketUtil", "Classload libcore.io.StructTimeval fail. SDK_INT:" + Build.VERSION.SDK_INT, th);
            }
        } else {
            try {
                b = Class.forName("android.system.StructTimeval");
            } catch (Throwable th2) {
                LogCatUtil.warn("SocketUtil", "Classload android.system.StructTimeval fail. SDK_INT:" + Build.VERSION.SDK_INT, th2);
            }
        }
        return b;
    }

    private static final Method f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("36ae0131", new Object[0]);
        }
        Method method = g;
        if (method != null) {
            return method;
        }
        Class e2 = e();
        if (e2 == null) {
            return null;
        }
        try {
            Method declaredMethod = e2.getDeclaredMethod("fromMillis", Long.TYPE);
            g = declaredMethod;
            declaredMethod.setAccessible(true);
            return g;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "getDeclaredMethod fromMillis fail", th);
            return null;
        }
    }

    private static final Class g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("a919ee1b", new Object[0]);
        }
        Class cls = c;
        if (cls != null) {
            return cls;
        }
        try {
            if (Build.VERSION.SDK_INT < 21) {
                c = Class.forName("libcore.io.OsConstants");
            } else {
                c = Class.forName("android.system.OsConstants");
            }
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "Class load OsConstants fail. sdk: " + Build.VERSION.SDK_INT, th);
        }
        return c;
    }

    private static final Integer h() {
        Integer num = j;
        if (num != null) {
            return num;
        }
        Class g2 = g();
        if (g2 == null) {
            return -1;
        }
        try {
            Field declaredField = g2.getDeclaredField("SOL_SOCKET");
            declaredField.setAccessible(true);
            j = (Integer) declaredField.get(g2);
            LogCatUtil.info("SocketUtil", "Get SOL_SOCKET is " + j.intValue());
            return j;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "Get SOL_SOCKET fail.", th);
            return null;
        }
    }

    private static final Integer i() {
        Integer num = k;
        if (num != null) {
            return num;
        }
        Class g2 = g();
        if (g2 == null) {
            return -1;
        }
        try {
            Field declaredField = g2.getDeclaredField("SO_SNDTIMEO");
            declaredField.setAccessible(true);
            k = Integer.valueOf(((Integer) declaredField.get(g2)).intValue());
            LogCatUtil.info("SocketUtil", "Get SO_SNDTIMEO is " + k.intValue());
            return k;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "Get SO_SNDTIMEO fail.", th);
            return null;
        }
    }

    private static final Method j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("3960afad", new Object[0]);
        }
        Method method = h;
        if (method != null) {
            return method;
        }
        Class e2 = e();
        if (e2 == null) {
            return null;
        }
        try {
            Method method2 = e2.getMethod("toMillis", new Class[0]);
            h = method2;
            method2.setAccessible(true);
            return h;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "Get toMillis method fail.", th);
            return null;
        }
    }

    private static final Method a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("f4059049", new Object[]{cls});
        }
        Method method = i;
        if (method != null) {
            return method;
        }
        if (cls == null) {
            LogCatUtil.warn("SocketUtil", "Illegal argument class is null ");
            return null;
        } else if (!Socket.class.isAssignableFrom(cls)) {
            LogCatUtil.warn("SocketUtil", "Illegal argument class: " + cls.getName());
            return null;
        } else {
            try {
                Method declaredMethod = cls.getDeclaredMethod("getFileDescriptor$", new Class[0]);
                i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable th) {
                LogCatUtil.warn("SocketUtil", "Get getFileDescriptor$ method fail", th);
            }
            return i;
        }
    }
}
