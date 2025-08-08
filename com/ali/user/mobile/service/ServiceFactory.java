package com.ali.user.mobile.service;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.lang.reflect.InvocationTargetException;
import tb.kge;

/* loaded from: classes2.dex */
public class ServiceFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BeanLoader";

    static {
        kge.a(1747493495);
    }

    private ServiceFactory() {
    }

    public static boolean registerService(Class<?> cls) {
        Class cls2;
        Object newInstance;
        if (cls == null) {
            return false;
        }
        try {
            if (ServiceContainer.getInstance().getService(cls) != null) {
                return true;
            }
            String beanClassName = getBeanClassName(cls.getName());
            if (StringUtils.isEmpty(beanClassName)) {
                return false;
            }
            try {
                newInstance = Class.forName(beanClassName).getField("INSTANCE").get(null);
            } catch (NoSuchFieldException unused) {
                newInstance = cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
            if (cls != null && newInstance != null) {
                return ServiceContainer.getInstance().registerService(cls, newInstance);
            }
            return false;
        } catch (ClassNotFoundException e) {
            LoginTLogAdapter.e(TAG, e.getMessage());
            return false;
        } catch (InvocationTargetException e2) {
            LoginTLogAdapter.e(TAG, e2.getMessage());
            return false;
        } catch (Exception e3) {
            LoginTLogAdapter.e(TAG, e3.getMessage());
            return false;
        }
    }

    public static <T> T getService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bb314f9b", new Object[]{cls});
        }
        registerService(cls);
        return (T) ServiceContainer.getInstance().getService(cls);
    }

    private static String getBeanClassName(String str) {
        try {
            Class<?> cls = Class.forName("com.ali.user.mobile.config.BeanConfig");
            return (String) cls.getMethod("getBeanClassName", String.class).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), str);
        } catch (ClassNotFoundException e) {
            LoginTLogAdapter.e(TAG, e.getMessage());
            return "";
        } catch (InvocationTargetException e2) {
            LoginTLogAdapter.e(TAG, e2.getMessage());
            return "";
        } catch (Exception e3) {
            LoginTLogAdapter.e(TAG, e3.getMessage());
            return "";
        }
    }
}
