package com.taobao.android.tbuprofen.adapter.anr;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.ProcessInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.util.ReflectUtils;
import java.lang.reflect.Field;
import java.util.List;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIND_APPLICATION = 110;
    public static final int BIND_SERVICE = 121;
    public static final int CREATE_SERVICE = 114;
    public static final int EXECUTE_TRANSACTION = 159;
    public static final int RECEIVER = 113;
    public static final int SERVICE_ARGS = 115;

    /* renamed from: a  reason: collision with root package name */
    private static Field f15468a;
    private static Field b;
    private static Field c;
    private static volatile boolean d;
    private static volatile boolean e;

    static {
        kge.a(615779836);
        f15468a = null;
        b = null;
        c = null;
        d = false;
        e = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (e) {
        } else {
            try {
                Class<?> cls = Class.forName("android.app.servertransaction.ClientTransaction");
                f15468a = ReflectUtils.a(cls, "mActivityCallbacks");
                b = ReflectUtils.a(cls, "mLifecycleStateRequest");
                c = ReflectUtils.a(Class.forName("android.app.servertransaction.LaunchActivityItem"), "mIntent");
                if (f15468a != null && b != null && c != null) {
                    d = true;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            } finally {
                e = true;
            }
        }
    }

    private static String a(Object obj) {
        Intent intent;
        try {
            if (!d) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            Object obj2 = b.get(obj);
            Object obj3 = f15468a.get(obj);
            if (obj3 != null) {
                for (Object obj4 : (List) obj3) {
                    String simpleName = obj4.getClass().getSimpleName();
                    sb.append(simpleName);
                    if (ProcessInfo.LAUNCH_ACTIVITY_ITEM.equals(simpleName) && (intent = (Intent) c.get(obj4)) != null) {
                        sb.append(riy.BRACKET_START_STR);
                        sb.append(intent);
                        sb.append(") -> ");
                    }
                }
            }
            if (obj2 != null) {
                sb.append(obj2.getClass().getSimpleName());
            }
            return sb.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "null";
        }
    }

    public static String a(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28a1141", new Object[]{obj, new Integer(i)});
        }
        if (e && Build.VERSION.SDK_INT >= 28 && obj != null && i != 110) {
            try {
                if (i != 121) {
                    if (i == 159) {
                        return a(obj);
                    }
                    switch (i) {
                    }
                }
                return obj.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public static boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{message})).booleanValue();
        }
        if (message != null && message.getTarget() != null) {
            return "android.app.ActivityThread$H".equals(message.getTarget().getClass().getName());
        }
        return false;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return str.contains("android.app.ActivityThread$H");
        }
        return false;
    }

    public static MessageQueue b() {
        if (Build.VERSION.SDK_INT >= 23) {
            return Looper.getMainLooper().getQueue();
        }
        Field a2 = ReflectUtils.a(Looper.class, "mQueue");
        if (a2 == null) {
            return null;
        }
        try {
            return (MessageQueue) a2.get(Looper.getMainLooper());
        } catch (IllegalAccessException e2) {
            com.taobao.android.tbuprofen.log.c.a("MessageTool", e2, "exception", new Object[0]);
            return null;
        }
    }

    public static String a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4db4e6c9", new Object[]{new Integer(i), obj});
        }
        if (obj == null) {
            return null;
        }
        if (i == 3) {
            return (String) obj;
        }
        if (i != 1) {
            return null;
        }
        Message message = (Message) obj;
        StringBuilder sb = new StringBuilder();
        Handler target = message.getTarget();
        Runnable callback = message.getCallback();
        if (target != null) {
            sb.append("target: ");
            sb.append(target.getClass().getName());
            sb.append(" ");
        }
        if (callback != null) {
            sb.append("callback: ");
            sb.append(callback.getClass().getName());
        }
        return sb.toString();
    }
}
