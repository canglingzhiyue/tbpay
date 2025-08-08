package tb;

import android.app.Activity;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import android.util.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.e;
import com.uc.webview.export.extension.UCCore;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class ren {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ren b;

    /* renamed from: a  reason: collision with root package name */
    private List<WeakReference<Activity>> f33086a = new ArrayList();

    static {
        kge.a(1551544824);
        b = null;
    }

    private ren() {
    }

    public static synchronized ren getInstance() {
        synchronized (ren.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ren) ipChange.ipc$dispatch("20145ff9", new Object[0]);
            }
            if (b == null) {
                b = new ren();
            }
            return b;
        }
    }

    public void handleActivityStack(String str, Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f03e919f", new Object[]{this, str, intent, new Integer(i), new Integer(i2)});
            return;
        }
        String str2 = null;
        if (this.f33086a.size() > 0) {
            List<WeakReference<Activity>> list = this.f33086a;
            str2 = list.get(list.size() - 1).get().getClass().getName();
        }
        if (StringUtils.equals(str2, str) && (i2 == 1 || (i & UCCore.VERIFY_POLICY_PAK_QUICK) == 536870912)) {
            intent.addFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
        } else if (i2 == 2 || i2 == 3 || (i & 67108864) == 67108864) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.f33086a.size()) {
                    break;
                }
                WeakReference<Activity> weakReference = this.f33086a.get(i3);
                if (weakReference != null && weakReference.get() != null && weakReference.get().getClass().getName().equals(str)) {
                    z = true;
                    break;
                }
                i3++;
            }
            if (!z) {
                return;
            }
            List<WeakReference<Activity>> list2 = this.f33086a;
            int i4 = i3 + 1;
            for (WeakReference<Activity> weakReference2 : list2.subList(i4, list2.size())) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().finish();
                }
            }
            List<WeakReference<Activity>> list3 = this.f33086a;
            list3.subList(i4, list3.size()).clear();
            intent.addFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
        }
    }

    public Activity peekTopActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f7a19d78", new Object[]{this});
        }
        List<WeakReference<Activity>> list = this.f33086a;
        if (list == null || list.size() <= 0) {
            return null;
        }
        List<WeakReference<Activity>> list2 = this.f33086a;
        WeakReference<Activity> weakReference = list2.get(list2.size() - 1);
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        return null;
    }

    public void pushToActivityStack(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69e931d", new Object[]{this, activity});
        } else {
            this.f33086a.add(new WeakReference<>(activity));
        }
    }

    public void popFromActivityStack(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c9f9f7", new Object[]{this, activity});
            return;
        }
        for (int i = 0; i < this.f33086a.size(); i++) {
            WeakReference<Activity> weakReference = this.f33086a.get(i);
            if (weakReference != null && weakReference.get() != null && weakReference.get() == activity) {
                this.f33086a.remove(weakReference);
            }
        }
    }

    public void clearActivityStack() {
        try {
            Object a2 = e.a();
            Field declaredField = a2.getClass().getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((ArrayMap) declaredField.get(a2)).values()) {
                Field declaredField2 = obj.getClass().getDeclaredField("activity");
                declaredField2.setAccessible(true);
                Activity activity = (Activity) declaredField2.get(obj);
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    activity.finish();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isActivityStackEmpty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("726d2869", new Object[]{this})).booleanValue() : this.f33086a.size() == 0;
    }

    public int sizeOfActivityStack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a57969db", new Object[]{this})).intValue() : this.f33086a.size();
    }
}
