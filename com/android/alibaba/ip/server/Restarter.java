package com.android.alibaba.ip.server;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import android.util.ArrayMap;
import android.widget.Toast;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.kge;

/* loaded from: classes3.dex */
public class Restarter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(668233367);
    }

    public static /* synthetic */ void access$000(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e57b89", new Object[]{activity});
        } else {
            updateActivity(activity);
        }
    }

    public static void restartActivityOnUiThread(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe5ba74", new Object[]{activity});
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.android.alibaba.ip.server.Restarter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Restarter.access$000(activity);
                    }
                }
            });
        }
    }

    private static void restartActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7302d157", new Object[]{activity});
            return;
        }
        String str = "About to restart " + activity.getClass().getSimpleName();
        while (activity.getParent() != null) {
            String str2 = activity.getClass().getSimpleName() + " is not a top level activity; restarting " + activity.getParent().getClass().getSimpleName() + " instead";
            activity = activity.getParent();
        }
        activity.recreate();
    }

    public static void restartApp(Context context, Collection<Activity> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f1a140", new Object[]{context, collection});
        } else if (collection.isEmpty()) {
        } else {
            Activity foregroundActivity = getForegroundActivity(context);
            if (foregroundActivity != null) {
                ((AlarmManager) foregroundActivity.getSystemService("alarm")).set(1, System.currentTimeMillis() + 100, a.a(foregroundActivity, 0, new Intent(foregroundActivity, foregroundActivity.getClass()), 268435456));
                String str = "Scheduling activity " + foregroundActivity + " to start after exiting process";
            }
            System.exit(0);
        }
    }

    public static void showToast(final Activity activity, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af33ec4d", new Object[]{activity, str});
            return;
        }
        String str2 = "About to show toast for activity " + activity + ResponseProtocolType.COMMENT + str;
        activity.runOnUiThread(new Runnable() { // from class: com.android.alibaba.ip.server.Restarter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                int i = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Context applicationContext = activity.getApplicationContext();
                    if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                        return;
                    }
                    if (str.length() >= 60 || str.indexOf(10) != -1) {
                        i = 1;
                    }
                    Toast.makeText(activity, str, i).show();
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static Activity getForegroundActivity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("300e318f", new Object[]{context});
        }
        List<Activity> activities = getActivities(context, true);
        if (!activities.isEmpty()) {
            return activities.get(0);
        }
        return null;
    }

    public static List<Activity> getActivities(Context context, boolean z) {
        Class<?> cls;
        Object activityThread;
        Field declaredField;
        Collection values;
        ArrayList arrayList = new ArrayList();
        try {
            cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            activityThread = MonkeyPatcher.getActivityThread(context, cls);
            declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
        } catch (Throwable unused) {
        }
        if (hasAppCrashed(context, cls, activityThread)) {
            return new ArrayList();
        }
        Object obj = declaredField.get(activityThread);
        if (obj instanceof HashMap) {
            values = ((HashMap) obj).values();
        } else {
            if (Build.VERSION.SDK_INT >= 19 && (obj instanceof ArrayMap)) {
                values = ((ArrayMap) obj).values();
            }
            return arrayList;
        }
        for (Object obj2 : values) {
            Class<?> cls2 = obj2.getClass();
            if (z) {
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj2)) {
                    arrayList.add(getActivity(obj2));
                }
            } else {
                Activity activity = getActivity(obj2);
                if (activity != null) {
                    arrayList.add(activity);
                }
            }
        }
        return arrayList;
    }

    private static Activity getActivity(Object obj) throws Exception {
        Field declaredField = obj.getClass().getDeclaredField("activity");
        declaredField.setAccessible(true);
        return (Activity) declaredField.get(obj);
    }

    private static boolean hasAppCrashed(Context context, Class cls, Object obj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e650607b", new Object[]{context, cls, obj})).booleanValue();
        }
        if (context != null && obj != null) {
            String packageName = getPackageName(cls, obj);
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = ((ActivityManager) context.getSystemService("activity")).getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.processName.equals(packageName) && processErrorStateInfo.condition != 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static String getPackageName(Class cls, Object obj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return (String) cls.getDeclaredMethod("currentPackageName", new Class[0]).invoke(obj, new Object[0]);
    }

    private static void updateActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b72d3d91", new Object[]{activity});
        } else {
            restartActivity(activity);
        }
    }
}
