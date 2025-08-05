package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import tb.huo;

/* loaded from: classes4.dex */
public class gvo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ClassLoader f28518a;
    private static Class<?> b;
    private static Class<?> c;
    private static Object d;
    private static Class<?> e;
    private static gvn f;

    public static /* synthetic */ void a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{list});
        } else {
            b(list);
        }
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        try {
            f28518a = new PathClassLoader("/system_ext/framework/androidx.window.extensions.jar", gvo.class.getClassLoader());
            if (c()) {
                return;
            }
            List b2 = b(application);
            if (b2 == null) {
                return;
            }
            synchronized (b2) {
                b2.add(c(application));
            }
        } catch (Exception e2) {
            TLog.loge("TBAutoSize.WindowExt", "initLoader: ", e2);
        } finally {
            d();
            b();
        }
    }

    private static List b(Application application) throws NoSuchFieldException, IllegalAccessException {
        Field declaredField = Application.class.getDeclaredField("mActivityLifecycleCallbacks");
        declaredField.setAccessible(true);
        return (List) declaredField.get(application);
    }

    private static Application.ActivityLifecycleCallbacks c(Application application) throws NoSuchFieldException, IllegalAccessException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application.ActivityLifecycleCallbacks) ipChange.ipc$dispatch("badb6cfb", new Object[]{application});
        }
        final List b2 = b(application);
        return new huo() { // from class: tb.gvo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
            public /* synthetic */ void onActivityCreated(Activity activity, Bundle bundle) {
                huo.CC.$default$onActivityCreated(this, activity, bundle);
            }

            @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
            public /* synthetic */ void onActivityDestroyed(Activity activity) {
                huo.CC.$default$onActivityDestroyed(this, activity);
            }

            @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
            public /* synthetic */ void onActivityPaused(Activity activity) {
                huo.CC.$default$onActivityPaused(this, activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPreCreated(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ebc4708", new Object[]{this, activity, bundle});
                } else {
                    gvo.a(b2);
                }
            }

            @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
            public /* synthetic */ void onActivityResumed(Activity activity) {
                huo.CC.$default$onActivityResumed(this, activity);
            }

            @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
            public /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                huo.CC.$default$onActivitySaveInstanceState(this, activity, bundle);
            }

            @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
            public /* synthetic */ void onActivityStarted(Activity activity) {
                huo.CC.$default$onActivityStarted(this, activity);
            }

            @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
            public /* synthetic */ void onActivityStopped(Activity activity) {
                huo.CC.$default$onActivityStopped(this, activity);
            }
        };
    }

    private static void b(List list) {
        if (list == null) {
            return;
        }
        synchronized (list) {
            for (Object obj : list) {
                if (obj != null) {
                    if (c()) {
                        return;
                    }
                    if (obj.getClass().getName().toLowerCase(Locale.ROOT).contains("androidx")) {
                        f28518a = obj.getClass().getClassLoader();
                        if (c()) {
                            break;
                        }
                    }
                    if (obj.getClass().getName().equals("com.taobao.android.compat.ActivityLifecycleCallbacksWrapper")) {
                        try {
                            Field declaredField = obj.getClass().getDeclaredField("mCallbacks");
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(obj);
                            if (obj2 instanceof Application.ActivityLifecycleCallbacks) {
                                f28518a = obj2.getClass().getClassLoader();
                                if (c()) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } catch (Exception e2) {
                            TLog.loge("TBAutoSize.WindowExt", "findLoader: ", e2);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public static gvn a() {
        Class<?> cls;
        if (b != null && (cls = c) != null && e != null) {
            gvn gvnVar = f;
            if (gvnVar != null) {
                return gvnVar;
            }
            try {
                Method declaredMethod = cls.getDeclaredMethod("getActivityEmbeddingComponent", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(d, new Object[0]);
                if (e.equals(declaredMethod.getReturnType())) {
                    gvn gvnVar2 = new gvn(e, invoke);
                    f = gvnVar2;
                    return gvnVar2;
                }
            } catch (Exception e2) {
                TLog.loge("TBAutoSize.WindowExt", "getActivityEmbeddingComponent: ", e2);
            }
        }
        return null;
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            if (e != null) {
                return true;
            }
            if (f28518a != null) {
                Class<?> loadClass = f28518a.loadClass("androidx.window.extensions.embedding.ActivityEmbeddingComponent");
                e = loadClass;
                if (loadClass != null) {
                    return true;
                }
            }
            return false;
        } catch (ClassNotFoundException e2) {
            TLog.loge("TBAutoSize.WindowExt", "isActivityEmbeddingComponentPresent: ", e2);
            return false;
        } catch (NoClassDefFoundError e3) {
            TLog.loge("TBAutoSize.WindowExt", "isActivityEmbeddingComponentPresent: ", e3);
            return false;
        }
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        try {
            if (b != null) {
                return true;
            }
            if (f28518a != null) {
                Class<?> loadClass = f28518a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                b = loadClass;
                if (loadClass != null) {
                    return true;
                }
            }
            return false;
        } catch (ClassNotFoundException e2) {
            TLog.loge("TBAutoSize.WindowExt", "isWindowExtensionsPresent: ", e2);
            return false;
        } catch (NoClassDefFoundError e3) {
            TLog.loge("TBAutoSize.WindowExt", "isWindowExtensionsPresent: ", e3);
            return false;
        }
    }

    private static boolean d() {
        Class<?> loadClass;
        if (!c()) {
            return false;
        }
        try {
            Method declaredMethod = b.getDeclaredMethod("getWindowExtensions", new Class[0]);
            declaredMethod.setAccessible(true);
            d = declaredMethod.invoke(null, new Object[0]);
            if (c == null && f28518a != null && (loadClass = f28518a.loadClass("androidx.window.extensions.WindowExtensions")) == declaredMethod.getReturnType()) {
                c = loadClass;
            }
            return c != null;
        } catch (ClassNotFoundException e2) {
            TLog.loge("TBAutoSize.WindowExt", "isWindowExtensionsValid: ", e2);
            return false;
        } catch (IllegalAccessException e3) {
            TLog.loge("TBAutoSize.WindowExt", "isWindowExtensionsValid: ", e3);
            return false;
        } catch (NoSuchMethodException e4) {
            TLog.loge("TBAutoSize.WindowExt", "isWindowExtensionsValid: ", e4);
            return false;
        } catch (InvocationTargetException e5) {
            TLog.loge("TBAutoSize.WindowExt", "isWindowExtensionsValid: ", e5);
            return false;
        }
    }
}
