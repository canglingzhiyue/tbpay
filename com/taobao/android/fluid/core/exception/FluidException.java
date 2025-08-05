package com.taobao.android.fluid.core.exception;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.core.b;
import java.io.Serializable;
import tb.kge;
import tb.pin;
import tb.spz;

/* loaded from: classes5.dex */
public final class FluidException extends RuntimeException implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EMPTY_OBSERVER = "emptyObserver";
    public static final String METHOD_NAME = "methodName";
    public static final String OBSERVER_NAME = "observerName";
    public static final String SERVICE_NAME = "serviceName";
    private static final String TAG = "FluidException";
    private final String mErrorCode;

    static {
        kge.a(-531942723);
        kge.a(1028243835);
    }

    private FluidException(String str, String str2, Throwable th) {
        super(str2, th);
        this.mErrorCode = str;
    }

    public static void throwServiceNotFoundException(FluidContext fluidContext, Class<? extends FluidService> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17f51d3", new Object[]{fluidContext, cls});
            return;
        }
        b bVar = b.SERVICE_NOT_REGISTER;
        bVar.a(SERVICE_NAME, cls.getSimpleName());
        throwException(fluidContext, bVar, cls.getSimpleName() + " 未注册");
    }

    public static void throwObserverCallbackException(FluidContext fluidContext, Object obj, String str, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c3bf39", new Object[]{fluidContext, obj, str, exc});
            return;
        }
        b bVar = FluidInstance.INSTANCE_LISTENER_CALLBACK_EXECUTE_ERROR;
        bVar.a(OBSERVER_NAME, obj == null ? EMPTY_OBSERVER : obj.getClass().getSimpleName());
        bVar.a(METHOD_NAME, str);
        throwException(fluidContext, bVar, exc);
    }

    public static void throwException(FluidContext fluidContext, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce29e055", new Object[]{fluidContext, bVar});
        } else {
            throwException(fluidContext, bVar, null, null);
        }
    }

    public static void throwException(FluidContext fluidContext, b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c97edf", new Object[]{fluidContext, bVar, str});
        } else {
            throwException(fluidContext, bVar, str, null);
        }
    }

    public static void throwException(FluidContext fluidContext, b bVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a10ac0", new Object[]{fluidContext, bVar, th});
        } else {
            throwException(fluidContext, bVar, null, th);
        }
    }

    public static void throwException(FluidContext fluidContext, b bVar, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a6c676", new Object[]{fluidContext, bVar, str, th});
            return;
        }
        String b = bVar.b();
        String str2 = bVar.c() + ", errorMessage: " + str + ", throwableMessage: " + (th == null ? "" : th.getMessage());
        FluidException fluidException = new FluidException(b, str2, th);
        String str3 = "FluidSDK 发生异常，错误码：" + b + "，错误信息：" + str2;
        if (th == null) {
            th = fluidException;
        }
        spz.a(TAG, str3, th);
        pin.a(fluidContext, bVar, str2);
    }

    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this}) : this.mErrorCode;
    }
}
