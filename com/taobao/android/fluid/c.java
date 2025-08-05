package com.taobao.android.fluid;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.a;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import tb.kge;
import tb.spz;
import tb.sqb;

/* loaded from: classes5.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f12431a;
    private static Context b;

    static {
        kge.a(-1731386693);
        f12431a = false;
    }

    public static Class<?> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("9ff6350d", new Object[]{context});
        }
        e(context);
        return sqb.c();
    }

    public static Class<?> b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("596dc2ac", new Object[]{context});
        }
        e(context);
        return sqb.d();
    }

    public static Class<?> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("12e5504b", new Object[]{context});
        }
        e(context);
        return sqb.e();
    }

    public static com.taobao.tao.flexbox.layoutmanager.container.f a(Context context, com.taobao.tao.flexbox.layoutmanager.container.e eVar, String str, boolean z, Bundle bundle) {
        boolean z2;
        spz.c("FluidInitializeReflect", "FluidSDK 创建视频流二跳页实例：" + str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (!str.contains("/video-fullpage/transparent-videolist.html") && !a.b(str)) {
                z2 = false;
                return (com.taobao.tao.flexbox.layoutmanager.container.f) sqb.e().getConstructor(Context.class, com.taobao.tao.flexbox.layoutmanager.container.e.class, String.class, Boolean.TYPE, Boolean.TYPE).newInstance(context, eVar, str, Boolean.valueOf(z2), Boolean.valueOf(z));
            }
            z2 = true;
            return (com.taobao.tao.flexbox.layoutmanager.container.f) sqb.e().getConstructor(Context.class, com.taobao.tao.flexbox.layoutmanager.container.e.class, String.class, Boolean.TYPE, Boolean.TYPE).newInstance(context, eVar, str, Boolean.valueOf(z2), Boolean.valueOf(z));
        } catch (InvocationTargetException e) {
            spz.a("FluidInitializeReflect", "FluidSDK 创建视频流二跳页实例失败", e.getTargetException());
            return null;
        } catch (Exception e2) {
            spz.a("FluidInitializeReflect", "FluidSDK 创建视频流二跳页实例失败", e2);
            return null;
        }
    }

    public static void d(Context context) {
        if (f12431a) {
            spz.c("FluidInitializeReflect", "FluidSDK 加载新架构已经初始化");
            return;
        }
        spz.c("FluidInitializeReflect", "FluidSDK 加载新架构 FullPageWakeChainLauncher");
        e(context);
        Class<?> a2 = sqb.a(sqb.FLUID_SDK_FULL_PAGE_WAKE_CHAIN_LAUNCHER_CLASS_NAME);
        if (a2 == null) {
            return;
        }
        try {
            a2.getDeclaredMethod("initTBVideoSDK", Context.class).invoke(null, context);
            f12431a = true;
            spz.c("FluidInitializeReflect", "FluidSDK 执行新架构唤端初始方法 initTBVideoSDK");
        } catch (InvocationTargetException e) {
            spz.a("FluidInitializeReflect", "FluidSDK 执行新架构唤端初始方法 initTBVideoSDK 失败 ", e.getTargetException());
        } catch (Exception e2) {
            spz.a("FluidInitializeReflect", "FluidSDK 执行新架构唤端初始化方法 initTBVideoSDK 失败 ", e2);
        }
    }

    public static void a(Context context, HashMap<String, Object> hashMap) {
        spz.c("FluidInitializeReflect", "FluidSDK 加载新架构 FullPageWakeChainLauncher");
        e(context);
        Class<?> a2 = sqb.a(sqb.FLUID_SDK_FULL_PAGE_WAKE_CHAIN_LAUNCHER_CLASS_NAME);
        if (a2 != null) {
            try {
                a2.getDeclaredMethod("init", Context.class, HashMap.class).invoke(null, context, hashMap);
                spz.c("FluidInitializeReflect", "FluidSDK 执行新架构唤端初始方法 init");
            } catch (InvocationTargetException e) {
                spz.a("FluidInitializeReflect", "FluidSDK 执行新架构唤端初始化方法 init 失败 ", e.getTargetException());
            } catch (Exception e2) {
                spz.a("FluidInitializeReflect", "FluidSDK 执行新架构唤端初始化方法 init 失败", e2);
            }
        }
    }

    private static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
        } else if (b != null) {
        } else {
            b = context;
            spz.c("FluidInitializeReflect", "FluidSDK 加载新架构初始化 Application: " + context);
        }
    }
}
