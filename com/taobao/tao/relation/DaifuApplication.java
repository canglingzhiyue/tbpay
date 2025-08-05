package com.taobao.tao.relation;

import android.app.Application;
import android.util.Log;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public class DaifuApplication extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DaifuApplication";
    private static boolean isInit = false;
    private static Application sApplication;

    public static /* synthetic */ Object ipc$super(DaifuApplication daifuApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        Log.e(TAG, "DaifuApplication onCreate registerPreprocessor");
        if (isInit) {
            return;
        }
        c cVar = new c();
        ((PanguApplication) getApplication()).registerCrossActivityLifecycleCallback(cVar);
        ((PanguApplication) getApplication()).registerActivityLifecycleCallbacks(cVar);
        isInit = true;
    }

    public static synchronized Application getApplication() {
        synchronized (DaifuApplication.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
            }
            if (sApplication == null) {
                sApplication = getSystemApp();
            }
            return sApplication;
        }
    }

    private static Application getSystemApp() {
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
