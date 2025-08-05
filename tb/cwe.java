package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes4.dex */
public class cwe implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public Activity f26563a;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final cwe f26564a;

        static {
            kge.a(1110368639);
            f26564a = new cwe();
        }
    }

    static {
        kge.a(1315120450);
        kge.a(-1894394539);
    }

    public Activity a() {
        StringBuilder sb;
        String message;
        Activity activity = this.f26563a;
        if (activity == null) {
            cwn.a("ActivityLifeCallBack", "get activity from reflect");
            try {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mActivities");
                declaredField.setAccessible(true);
                for (Object obj : ((Map) declaredField.get(invoke)).values()) {
                    Class<?> cls2 = obj.getClass();
                    Field declaredField2 = cls2.getDeclaredField("paused");
                    declaredField2.setAccessible(true);
                    if (!declaredField2.getBoolean(obj)) {
                        Field declaredField3 = cls2.getDeclaredField("activity");
                        declaredField3.setAccessible(true);
                        return (Activity) declaredField3.get(obj);
                    }
                }
                return null;
            } catch (ClassNotFoundException e) {
                sb = new StringBuilder();
                sb.append("getActivityReflect: ");
                message = e.getMessage();
                sb.append(message);
                cwn.c("ActivityLifeCallBack", sb.toString());
                return null;
            } catch (IllegalAccessException e2) {
                sb = new StringBuilder();
                sb.append("getActivityReflect: ");
                message = e2.getMessage();
                sb.append(message);
                cwn.c("ActivityLifeCallBack", sb.toString());
                return null;
            } catch (NoSuchFieldException e3) {
                sb = new StringBuilder();
                sb.append("getActivityReflect: ");
                message = e3.getMessage();
                sb.append(message);
                cwn.c("ActivityLifeCallBack", sb.toString());
                return null;
            } catch (NoSuchMethodException e4) {
                sb = new StringBuilder();
                sb.append("getActivityReflect: ");
                message = e4.getMessage();
                sb.append(message);
                cwn.c("ActivityLifeCallBack", sb.toString());
                return null;
            } catch (InvocationTargetException e5) {
                sb = new StringBuilder();
                sb.append("getActivityReflect: ");
                message = e5.getMessage();
                sb.append(message);
                cwn.c("ActivityLifeCallBack", sb.toString());
                return null;
            }
        }
        return activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        cwn.b("ActivityLifeCallBack", "onActivityCreated " + activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f26563a = null;
        cwn.b("ActivityLifeCallBack", "onActivityPaused " + activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f26563a = activity;
        cwn.b("ActivityLifeCallBack", "onActivityResumed " + activity.getClass().getSimpleName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        cwn.b("ActivityLifeCallBack", "onActivityStopped " + activity.getClass().getSimpleName());
    }
}
