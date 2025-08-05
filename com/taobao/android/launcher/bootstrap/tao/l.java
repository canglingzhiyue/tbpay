package com.taobao.android.launcher.bootstrap.tao;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f13095a = new AtomicBoolean(false);

    public static List<FragmentManager.FragmentLifecycleCallbacks> a(FragmentManager fragmentManager) {
        try {
            Field declaredField = Class.forName("android.support.v4.app.FragmentManagerImpl").getDeclaredField("mLifecycleCallbacks");
            declaredField.setAccessible(true);
            List<Pair> list = (List) declaredField.get(fragmentManager);
            declaredField.setAccessible(false);
            ArrayList arrayList = new ArrayList(list.size());
            for (Pair pair : list) {
                arrayList.add(pair.first);
            }
            for (Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.isAdded()) {
                    arrayList.addAll(a(fragment.getChildFragmentManager()));
                }
            }
            return arrayList;
        } catch (ClassNotFoundException e) {
            h.a("ActivityLifeCycleCallbacks", "obtainFragmentLifecycleCallbacks error occurred:", e);
            return Collections.emptyList();
        } catch (IllegalAccessException e2) {
            h.a("ActivityLifeCycleCallbacks", "obtainFragmentLifecycleCallbacks error occurred:", e2);
            return Collections.emptyList();
        } catch (NoSuchFieldException e3) {
            h.a("ActivityLifeCycleCallbacks", "obtainFragmentLifecycleCallbacks error occurred:", e3);
            return Collections.emptyList();
        }
    }

    public static List<Application.ActivityLifecycleCallbacks> a(Application application) {
        try {
            Field declaredField = Application.class.getDeclaredField("mActivityLifecycleCallbacks");
            declaredField.setAccessible(true);
            List<Application.ActivityLifecycleCallbacks> list = (List) declaredField.get(application);
            declaredField.setAccessible(false);
            return list;
        } catch (IllegalAccessException e) {
            h.a("ActivityLifeCycleCallbacks", "obtainActivityLifecycleCallbacks error occurred:", e);
            return Collections.emptyList();
        } catch (NoSuchFieldException e2) {
            h.a("ActivityLifeCycleCallbacks", "obtainActivityLifecycleCallbacks error occurred:", e2);
            return Collections.emptyList();
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            f13095a.compareAndSet(false, true);
        }
    }

    public static void a(FragmentManager fragmentManager, String str, List<FragmentManager.FragmentLifecycleCallbacks> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5d5bd4", new Object[]{fragmentManager, str, list});
            return;
        }
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.isAdded()) {
                a(fragmentManager, str, fragment, list);
                a(fragment.getChildFragmentManager(), str, list);
            }
        }
    }

    public static void a(FragmentManager fragmentManager, String str, Fragment fragment, List<FragmentManager.FragmentLifecycleCallbacks> list) {
        try {
            Field declaredField = Class.forName("android.support.v4.app.FragmentManagerImpl").getDeclaredField("mLifecycleCallbacks");
            declaredField.setAccessible(true);
            declaredField.setAccessible(false);
            for (Pair pair : (List) declaredField.get(fragmentManager)) {
                FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks = (FragmentManager.FragmentLifecycleCallbacks) pair.first;
                if (fragmentLifecycleCallbacks != null && !list.contains(fragmentLifecycleCallbacks) && "onFragmentResumed".equals(str)) {
                    fragmentLifecycleCallbacks.onFragmentResumed(fragmentManager, fragment);
                }
            }
        } catch (ClassNotFoundException e) {
            h.a("ActivityLifeCycleCallbacks", "invokeFragmentLifeCyclesInternal error occurred:", e);
        } catch (IllegalAccessException e2) {
            h.a("ActivityLifeCycleCallbacks", "invokeFragmentLifeCyclesInternal error occurred:", e2);
        } catch (NoSuchFieldException e3) {
            h.a("ActivityLifeCycleCallbacks", "invokeFragmentLifeCyclesInternal error occurred:", e3);
        }
    }

    public static void a(Application application, String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = Application.class.getDeclaredMethod(str, clsArr);
            if (declaredMethod == null) {
                return;
            }
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(application, objArr);
        } catch (IllegalAccessException e) {
            h.a("ActivityLifeCycleCallbacks", "invokeActivityLifeCycles error occurred:", e);
        } catch (NoSuchMethodException e2) {
            h.a("ActivityLifeCycleCallbacks", "invokeActivityLifeCycles error occurred:", e2);
        } catch (InvocationTargetException e3) {
            h.a("ActivityLifeCycleCallbacks", "invokeActivityLifeCycles error occurred:", e3);
        }
    }

    public static boolean a(Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        if (activity != null && (intent = activity.getIntent()) != null) {
            return intent.getBooleanExtra(BootstrapMode.EXTRA_KEY_LIFECYCLE_COMPACT, false);
        }
        return false;
    }

    public static void b(Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{activity});
        } else if (activity == null || (intent = activity.getIntent()) == null) {
        } else {
            intent.putExtra(BootstrapMode.EXTRA_KEY_LIFECYCLE_COMPACT, true);
        }
    }

    public static void c(Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{activity});
        } else if (activity == null || (intent = activity.getIntent()) == null) {
        } else {
            intent.removeExtra(BootstrapMode.EXTRA_KEY_LIFECYCLE_COMPACT);
        }
    }
}
