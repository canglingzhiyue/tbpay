package com.alipay.android.msp.ui.base;

import android.app.Activity;
import android.content.Intent;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class ActivityResultManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<Activity, Set<ActivityResultHandler>> f4957a = new ConcurrentHashMap<>();

    /* loaded from: classes3.dex */
    public interface ActivityResultHandler {
        void handleResult(Activity activity, int i, int i2, Intent intent);
    }

    public static synchronized void registerActivityResultHandler(Activity activity, ActivityResultHandler activityResultHandler) {
        synchronized (ActivityResultManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2bb2687", new Object[]{activity, activityResultHandler});
            } else if (activity == null) {
            } else {
                if (activityResultHandler == null) {
                    return;
                }
                LogUtil.i("ActivityResultManager", "registerActivityResultHandler", "adding " + activityResultHandler + ":" + activity);
                Set<ActivityResultHandler> set = f4957a.get(activity);
                if (set == null) {
                    set = Collections.synchronizedSet(new HashSet());
                    f4957a.put(activity, set);
                }
                set.add(activityResultHandler);
            }
        }
    }

    public static synchronized void unregisterActivityResultHandler(ActivityResultHandler activityResultHandler) {
        synchronized (ActivityResultManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ca5bc", new Object[]{activityResultHandler});
            } else if (activityResultHandler != null) {
                LogUtil.i("ActivityResultManager", "unregisterActivityResultHandler", "removing ".concat(String.valueOf(activityResultHandler)));
                for (Activity activity : f4957a.keySet()) {
                    Set<ActivityResultHandler> set = f4957a.get(activity);
                    if (set != null) {
                        set.remove(activityResultHandler);
                    }
                }
            }
        }
    }

    public static void handleActivityResult(Activity activity, int i, int i2, Intent intent) {
        Set<ActivityResultHandler> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea909ca", new Object[]{activity, new Integer(i), new Integer(i2), intent});
        } else if (activity == null || (set = f4957a.get(activity)) == null) {
        } else {
            Iterator it = new HashSet(set).iterator();
            while (it.hasNext()) {
                ActivityResultHandler activityResultHandler = (ActivityResultHandler) it.next();
                try {
                    LogUtil.i("ActivityResultManager", "handleActivityResult", "triggering " + activityResultHandler + ":" + activity);
                    activityResultHandler.handleResult(activity, i, i2, intent);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace("ActivityResultManager", "handleActivityResult", th);
                }
            }
        }
    }

    public static void handleActivityDestroy(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e977b17c", new Object[]{activity});
        } else if (activity == null) {
        } else {
            LogUtil.i("ActivityResultManager", "handleActivityDestroy", "releasing ".concat(String.valueOf(activity)));
            f4957a.remove(activity);
        }
    }
}
