package com.taobao.android.fluid;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import tb.kge;
import tb.spx;
import tb.spy;
import tb.spz;
import tb.sqb;
import tb.sqc;

/* loaded from: classes5.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-744184011);
    }

    public static void a(String str, spx spxVar) {
        Class<?> a2;
        if (sqc.a() && (a2 = sqb.a()) != null) {
            try {
                a2.getMethod("registerMessageHandler", String.class, spx.class).invoke(null, str, spxVar);
                spz.c("FluidSDKReflect", "FluidSDKReflect 调用 registerMessageHandler，bizName: " + str + ", messageHandler: " + spxVar);
            } catch (InvocationTargetException e) {
                spz.a("FluidSDKReflect", "FluidSDKReflect 调用 registerMessageHandler 失败", e.getTargetException());
            } catch (Exception e2) {
                spz.a("FluidSDKReflect", "FluidSDKReflect 调用 registerMessageHandler 失败", e2);
            }
        }
    }

    public static void b(String str, spx spxVar) {
        Class<?> a2;
        if (sqc.a() && (a2 = sqb.a()) != null) {
            try {
                a2.getMethod("unRegisterMessageHandler", String.class, spx.class).invoke(null, str, spxVar);
                spz.c("FluidSDKReflect", "FluidSDKReflect 调用 unRegisterMessageHandler，bizName: " + str + ", messageHandler: " + spxVar);
            } catch (InvocationTargetException e) {
                spz.a("FluidSDKReflect", "FluidSDKReflect 调用 unRegisterMessageHandler 失败", e.getTargetException());
            } catch (Exception e2) {
                spz.a("FluidSDKReflect", "FluidSDKReflect 调用 unRegisterMessageHandler 失败", e2);
            }
        }
    }

    public static void a(String str, spy spyVar) {
        Class<?> a2;
        if (sqc.a() && (a2 = sqb.a()) != null) {
            try {
                a2.getMethod("sendMessage", String.class, spy.class).invoke(null, str, spyVar);
                spz.c("FluidSDKReflect", "FluidSDKReflect 调用 sendMessage，bizName: " + str + ", message: " + spyVar);
            } catch (InvocationTargetException e) {
                spz.a("FluidSDKReflect", "FluidSDKReflect 调用 sendMessage 失败", e.getTargetException());
            } catch (Exception e2) {
                spz.a("FluidSDKReflect", "FluidSDKReflect 调用 sendMessage 失败", e2);
            }
        }
    }
}
