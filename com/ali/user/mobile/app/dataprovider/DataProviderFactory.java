package com.ali.user.mobile.app.dataprovider;

import android.app.Application;
import android.content.Context;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
public class DataProviderFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Context applicationContext;
    private static IDataProvider dataProvider;
    private static OrangeConfig orangeConfig;

    static {
        kge.a(-861438063);
    }

    public static IDataProvider getDataProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDataProvider) ipChange.ipc$dispatch("9eba9107", new Object[0]);
        }
        IDataProvider iDataProvider = dataProvider;
        return iDataProvider == null ? new DataProvider() : iDataProvider;
    }

    public static void setDataProvider(IDataProvider iDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e825ad", new Object[]{iDataProvider});
        } else {
            dataProvider = iDataProvider;
        }
    }

    public static OrangeConfig getOrangeConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrangeConfig) ipChange.ipc$dispatch("970a77b0", new Object[0]);
        }
        if (orangeConfig == null) {
            orangeConfig = new OrangeConfig();
        }
        return orangeConfig;
    }

    public static void setOrangeConfig(OrangeConfig orangeConfig2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df7e57a", new Object[]{orangeConfig2});
        } else {
            orangeConfig = orangeConfig2;
        }
    }

    public static synchronized Context getApplicationContext() {
        synchronized (DataProviderFactory.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("c5c75d34", new Object[0]);
            } else if (applicationContext != null) {
                return applicationContext;
            } else {
                if (dataProvider != null) {
                    applicationContext = dataProvider.getContext();
                } else {
                    applicationContext = getSystemApp();
                }
                return applicationContext;
            }
        }
    }

    public static Application getSystemApp() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
