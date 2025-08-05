package tb;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.orange.OrangeConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes6.dex */
public class ixe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile ixe f29392a;
    private int b;
    private LinkedList<WeakReference<Activity>> c = new LinkedList<>();

    static {
        kge.a(-657865979);
    }

    private ixe() {
        this.b = 2;
        try {
            this.b = Integer.parseInt(OrangeConfig.getInstance().getConfig("shop_render", "shop_render_stack_size", "2"));
        } catch (NumberFormatException unused) {
        }
    }

    public static ixe a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ixe) ipChange.ipc$dispatch("f062ec8", new Object[0]);
        }
        if (f29392a == null) {
            f29392a = new ixe();
        }
        return f29392a;
    }

    public void a(Activity activity) {
        WeakReference<Activity> removeFirst;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (activity == null || this.b <= 0) {
        } else {
            try {
                this.c.addLast(new WeakReference<>(activity));
                Log.e("ActivityInstanceManager", "adding activity " + activity);
                if (((!l.f((Context) activity) && !l.e((Context) activity)) || this.c.size() <= this.b * 3) && (l.f((Context) activity) || l.e((Context) activity) || this.c.size() <= this.b)) {
                    z = false;
                }
                if (!z || (removeFirst = this.c.removeFirst()) == null || removeFirst.get() == null) {
                    return;
                }
                Log.e("ActivityInstanceManager", "activity stack is full. " + this.c.size() + " finishing " + removeFirst.get());
                removeFirst.get().finish();
            } catch (Throwable th) {
                Log.e("ActivityInstanceManager", "checkAtCreate exception " + activity, th);
            }
        }
    }

    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
        } else if (activity == null || this.b <= 0) {
        } else {
            WeakReference<Activity> weakReference = null;
            try {
                Iterator<WeakReference<Activity>> it = this.c.iterator();
                while (it.hasNext()) {
                    WeakReference<Activity> next = it.next();
                    if (next != null && next.get() != null && activity.equals(next.get())) {
                        weakReference = next;
                    }
                }
                if (weakReference == null) {
                    return;
                }
                Log.e("ActivityInstanceManager", "removing activity " + weakReference.get());
                weakReference.clear();
                this.c.remove(weakReference);
            } catch (Throwable th) {
                Log.e("ActivityInstanceManager", "checkAtDestory exception " + activity, th);
            }
        }
    }
}
