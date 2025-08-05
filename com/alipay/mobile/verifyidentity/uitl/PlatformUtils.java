package com.alipay.mobile.verifyidentity.uitl;

import android.content.Context;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class PlatformUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f6095a = "PlatformUtils";

    /* loaded from: classes3.dex */
    public static class EnvModeConfig {
        public static int ENVIRONMENT_DAILY = 1;
        public static int ENVIRONMENT_ONLINE = 0;
        public static int ENVIRONMENT_PRE = 2;
        public static int ENVIRONMENT_SIT = 3;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : f6095a;
    }

    public static String getApdid(Context context) {
        Object invokeMethod;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81fa0459", new Object[]{context});
        }
        initSecuritySdk(context);
        Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.apmobilesecuritysdk.face.APSecuritySdk", "getInstance", new Class[]{Context.class}, new Object[]{context});
        return (invokeStaticMethod == null || (invokeMethod = ReflectUtils.invokeMethod(invokeStaticMethod, "getTokenResult")) == null) ? "" : (String) ReflectUtils.getFieldValue(invokeMethod, "apdid");
    }

    public static Object getTokenResult(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8d0e2671", new Object[]{context});
        }
        initSecuritySdk(context);
        Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.apmobilesecuritysdk.face.APSecuritySdk", "getInstance", new Class[]{Context.class}, new Object[]{context});
        if (invokeStaticMethod != null) {
            return ReflectUtils.invokeMethod(invokeStaticMethod, "getTokenResult");
        }
        return null;
    }

    public static String getUmidToken(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("718eef", new Object[]{context});
        }
        Object tokenResult = getTokenResult(context);
        return tokenResult == null ? "" : (String) ReflectUtils.getFieldValue(tokenResult, "umidToken");
    }

    public static String getApdidToken(Context context) {
        Object invokeMethod;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("684513e", new Object[]{context});
        }
        initSecuritySdk(context);
        Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.apmobilesecuritysdk.face.APSecuritySdk", "getInstance", new Class[]{Context.class}, new Object[]{context});
        return (invokeStaticMethod == null || (invokeMethod = ReflectUtils.invokeMethod(invokeStaticMethod, "getApdidToken")) == null) ? "" : (String) invokeMethod;
    }

    public static void initSecuritySdk(Context context) {
        Class<?>[] declaredClasses;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c177b7", new Object[]{context});
            return;
        }
        Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.apmobilesecuritysdk.face.APSecuritySdk", "getInstance", new Class[]{Context.class}, new Object[]{context});
        if (invokeStaticMethod == null) {
            return;
        }
        try {
            Object obj = null;
            for (Class<?> cls : Class.forName("com.alipay.apmobilesecuritysdk.face.APSecuritySdk").getDeclaredClasses()) {
                if (cls.isInterface()) {
                    if ("com.alipay.apmobilesecuritysdk.face.APSecuritySdk$InitResultListener".equalsIgnoreCase(cls.getName())) {
                        obj = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new TrivialInvocationHandler());
                    }
                    VerifyLogCat.i(f6095a, "get an [inner interface] : " + cls.getName());
                } else {
                    VerifyLogCat.i(f6095a, "get a [inner class] : " + cls.getName());
                }
            }
            if (obj == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("tid", "");
            hashMap.put("utdid", "");
            hashMap.put("userId", "");
            VerifyLogCat.i(f6095a, "It's ready to init SecuritySDK now!");
            Class[] clsArr = {Integer.TYPE, Map.class, obj.getClass()};
            Object[] objArr = new Object[3];
            if (isDebug(context)) {
                i = EnvModeConfig.ENVIRONMENT_DAILY;
            } else {
                i = EnvModeConfig.ENVIRONMENT_ONLINE;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = hashMap;
            objArr[2] = obj;
            ReflectUtils.invokeMethod(invokeStaticMethod, "initToken", clsArr, objArr);
        } catch (Throwable th) {
            VerifyLogCat.e(f6095a, th);
        }
    }

    /* loaded from: classes3.dex */
    public static class TrivialInvocationHandler implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private TrivialInvocationHandler() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
            }
            String access$100 = PlatformUtils.access$100();
            VerifyLogCat.i(access$100, "callback method: " + method.getName());
            return "";
        }
    }

    public static boolean isDebug(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16deea7c", new Object[]{context})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            VerifyLogCat.w(f6095a, "get isDebug exception: ", th);
        }
        return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 16384).flags & 2) != 0;
    }

    public static boolean isAlipay(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbc4e991", new Object[]{context})).booleanValue();
        }
        String packageName = context.getPackageName();
        String str = f6095a;
        VerifyLogCat.i(str, "当前客户端的包名：" + packageName);
        return "com.eg.android.AlipayGphone".equalsIgnoreCase(packageName) || "com.eg.android.AlipayGphoneRC".equalsIgnoreCase(packageName);
    }
}
