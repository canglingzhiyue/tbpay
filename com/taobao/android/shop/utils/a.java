package com.taobao.android.shop.utils;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXEnvironment;
import java.io.File;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOP_COST = "ShopCost";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f15115a;
    private static Boolean b;
    private static Boolean c;

    static {
        kge.a(203894264);
        f15115a = null;
        b = null;
        c = null;
    }

    public static Boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5b7a33e5", new Object[0]);
        }
        if (f15115a == null) {
            try {
                if (g()) {
                    f15115a = false;
                } else {
                    if (WXEnvironment.isApkDebugable() || d() || f()) {
                        z = true;
                    }
                    f15115a = Boolean.valueOf(z);
                }
                String str = "main-cost doLog is " + f15115a;
            } catch (Exception e) {
                f15115a = false;
                e.printStackTrace();
            }
        }
        return f15115a;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : WXEnvironment.isApkDebugable() || d() || e();
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (b == null) {
            if ("true".equals(OrangeConfig.getInstance().getConfig("shop_render", "doLog", "false"))) {
                b = true;
            } else {
                b = false;
            }
            String str = "main-cost get configDoLog (doLog) result is " + b;
        }
        Boolean bool = b;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        String nick = Login.getNick();
        if ((!StringUtils.isEmpty(nick) && ("tmallapp".equals(nick) || "tyx测试账号001".equals(nick) || "行久".equals(nick) || "清锐".equals(nick) || "东煜".equals(nick) || "曹西".equals(nick))) || "小程序测试qa".equals(nick) || "c测试账号911".equals(nick)) {
            c = true;
        } else if (!StringUtils.isEmpty(nick) && OrangeConfig.getInstance().getConfig("shop_router", "private_window_whitelist", "").contains(nick)) {
            c = true;
        } else {
            c = false;
        }
        String str = "main-cost testUser result is " + c;
        Boolean bool = c;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : new File("/data/local/tmp/.shop_log").exists();
    }

    private static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : new File("/data/local/tmp/.shop_no_log").exists();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : new File("/data/local/tmp/.shop_no_weex_analyzer").exists();
    }

    public static void a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{objArr});
        } else if (!a().booleanValue()) {
        } else {
            String d = d(objArr);
            if (com.taobao.tao.log.f.a().q()) {
                TLog.loge("shop", "ShopCost", d);
            } else {
                Log.e("ShopCost", d);
            }
        }
    }

    public static void b(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b232c4a8", new Object[]{objArr});
        } else if (!a().booleanValue()) {
        } else {
            String d = d(objArr);
            if (!com.taobao.tao.log.f.a().q()) {
                return;
            }
            TLog.logw("shop", "ShopCost", d);
        }
    }

    public static void c(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae345387", new Object[]{objArr});
        } else if (!a().booleanValue()) {
        } else {
            String d = d(objArr);
            if (!com.taobao.tao.log.f.a().q()) {
                return;
            }
            TLog.logd("shop", "ShopCost", d);
        }
    }

    public static String d(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb646afa", new Object[]{objArr});
        }
        if (objArr == null) {
            return "no message";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj);
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String a(Throwable th) {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        if (th == null) {
            return "exception is null";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("Exception in thread \"%s\" %s: %s", Thread.currentThread().getName(), th.getClass().getName(), th.getMessage()));
            sb.append("\n");
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append(String.format("at %s.%s(%s:%s)", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber())));
                sb.append("\n");
            }
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                sb.append(b(cause));
            }
            return sb.toString();
        } catch (Throwable unused) {
            String str = "simple exception msg is " + String.format("Exception in thread \"%s\" %s: %s", Thread.currentThread().getName(), th.getClass().getName(), th.getMessage());
            AppMonitor.Alarm.commitFail("Shop", ShopRenderActivity.SHOP_RENDER, str, "-52901", "error in formatExceptionStackTrace");
            return str;
        }
    }

    private static String b(Throwable th) {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5451674", new Object[]{th});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Caused By %s: %s", th.getClass().getName(), th.getMessage()));
        sb.append("\n");
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            String className = stackTraceElement.getClassName();
            if (className != null && (className.contains("taobao") || className.contains("alibaba") || className.contains("shop") || className.contains("tm"))) {
                sb.append(String.format("at %s.%s(%s:%s)", className, stackTraceElement.getMethodName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber())));
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{str, str2, objArr});
        } else {
            a(str, str2, null, objArr);
        }
    }

    public static void a(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f0c298", new Object[]{str, str2, th, objArr});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (objArr != null) {
            for (Object obj : objArr) {
                sb.append(obj);
                sb.append(" | ");
                if (WXEnvironment.isApkDebugable()) {
                    sb.append("\n");
                }
            }
        }
        if (th != null) {
            sb.append(a(th));
        }
        String sb2 = sb.toString();
        AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", sb2, str, str2);
        a("main-cost", "commitFail", str, str2, sb2);
    }

    public static void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{str, str2, objArr});
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append("|");
        if (StringUtils.isEmpty(str2)) {
            str2 = "home";
        }
        sb.append(str2);
        if (objArr != null) {
            for (Object obj : objArr) {
                sb.append("|");
                sb.append(obj);
                if (WXEnvironment.isApkDebugable()) {
                    sb.append("\n");
                }
            }
        }
        AppMonitor.Alarm.commitSuccess("Shop", ShopRenderActivity.SHOP_RENDER, sb.toString());
    }
}
