package com.alibaba.android.split.core.internal;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Looper;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class InternalHacker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Object _mLoadedApk;
    private static Object _sActivityThread;
    private static List<ProviderInfo> providerInfos;

    static {
        kge.a(374806083);
        _sActivityThread = null;
        _mLoadedApk = null;
        providerInfos = new ArrayList();
    }

    public static Object getActivityThread(Context context) throws Exception {
        Field declaredField;
        if (_sActivityThread == null) {
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            declaredMethod.setAccessible(true);
            if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
                _sActivityThread = declaredMethod.invoke(null, new Object[0]);
            }
            if (_sActivityThread == null && context != null) {
                if (_mLoadedApk == null) {
                    if (context instanceof Application) {
                        declaredField = context.getClass().getField("mLoadedApk");
                    } else {
                        declaredField = context.getClass().getDeclaredField("mPackageInfo");
                    }
                    declaredField.setAccessible(true);
                    _mLoadedApk = declaredField.get(context);
                }
                Field declaredField2 = _mLoadedApk.getClass().getDeclaredField("mActivityThread");
                declaredField2.setAccessible(true);
                _sActivityThread = declaredField2.get(_mLoadedApk);
            }
        }
        return _sActivityThread;
    }

    public static void initApplication(Application application, String str) throws Exception {
        Class<?> cls;
        try {
            cls = Class.forName("android.app.LoadedApk");
        } catch (Exception unused) {
            cls = Class.forName("android.app.ActivityThread$PackageInfo");
        }
        Field declaredField = cls.getDeclaredField("mApplication");
        declaredField.setAccessible(true);
        declaredField.set(getLoadedApk(getActivityThread(application), str), application);
        Field declaredField2 = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mInitialApplication");
        declaredField2.setAccessible(true);
        declaredField2.set(getActivityThread(application), application);
    }

    private static Object getBoundApplication(Context context) {
        try {
            Field declaredField = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mBoundApplication");
            declaredField.setAccessible(true);
            return declaredField.get(getActivityThread(context));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void clearProviders(Context context) {
        Object boundApplication = getBoundApplication(context);
        try {
            Field declaredField = Class.forName("android.app.ActivityThread$AppBindData").getDeclaredField("providers");
            declaredField.setAccessible(true);
            List<ProviderInfo> list = (List) declaredField.get(boundApplication);
            providerInfos = list;
            if (list == null || providerInfos.size() <= 0) {
                return;
            }
            declaredField.set(boundApplication, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void installProviders(Context context) {
        try {
            Field declaredField = Class.forName("android.app.ActivityThread$AppBindData").getDeclaredField("providers");
            declaredField.setAccessible(true);
            if (providerInfos == null || providerInfos.size() <= 0) {
                return;
            }
            declaredField.set(getBoundApplication(context), providerInfos);
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod("installContentProviders", Context.class, List.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(getActivityThread(context), context, providerInfos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object getLoadedApk(Object obj, String str) throws Exception {
        Object obj2 = _mLoadedApk;
        if (obj2 != null) {
            return obj2;
        }
        Field declaredField = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mPackages");
        declaredField.setAccessible(true);
        WeakReference weakReference = (WeakReference) ((Map) declaredField.get(obj)).get(str);
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        _mLoadedApk = weakReference.get();
        return weakReference.get();
    }

    public static Field getInstrumentationField() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("df89f626", new Object[0]);
        }
        Field field = null;
        try {
            field = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mInstrumentation");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        field.setAccessible(true);
        return field;
    }

    public static Field getAllApplicationField() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("dc7d1f19", new Object[0]);
        }
        Field field = null;
        try {
            field = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mAllApplications");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        field.setAccessible(true);
        return field;
    }
}
