package tb;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.Window;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import tb.nky;

/* loaded from: classes7.dex */
public class nkx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f31541a;
    private Map<Activity, nky> b = new HashMap();

    /* loaded from: classes7.dex */
    public interface a {
        void b(Activity activity, int i, float f, float f2, long j);

        void b(Activity activity, KeyEvent keyEvent, long j);
    }

    public static /* synthetic */ a a(nkx nkxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("39ff3471", new Object[]{nkxVar}) : nkxVar.f31541a;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16c2780", new Object[]{this, aVar});
        } else {
            this.f31541a = aVar;
        }
    }

    public void a(Activity activity) {
        Window window;
        Window.Callback callback;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (activity == null || this.b.containsKey(activity) || (window = activity.getWindow()) == null || (callback = window.getCallback()) == null) {
        } else {
            nky nkyVar = new nky(callback);
            try {
                window.setCallback((Window.Callback) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{Window.Callback.class}, nkyVar));
                z = true;
            } catch (Exception e) {
                ALog.e("falco.WindowHookManager", "addProxy error.", null, e, new Object[0]);
                z = false;
            }
            if (!z) {
                return;
            }
            ALog.e("falco.WindowHookManager", "addProxy", null, "activity", activity.getLocalClassName());
            nkyVar.a(new b(activity));
            this.b.put(activity, nkyVar);
        }
    }

    public void b(Activity activity) {
        nky remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
        } else if (activity == null || (remove = this.b.remove(activity)) == null) {
        } else {
            ALog.e("falco.WindowHookManager", "removeProxy", null, "activity", activity.getLocalClassName());
            remove.a();
        }
    }

    /* loaded from: classes7.dex */
    public class b implements nky.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<Activity> b;

        public b(Activity activity) {
            this.b = new WeakReference<>(activity);
        }

        @Override // tb.nky.a
        public void a(int i, float f, float f2, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cea8149", new Object[]{this, new Integer(i), new Float(f), new Float(f2), new Long(j)});
            } else if (nkx.a(nkx.this) == null) {
            } else {
                nkx.a(nkx.this).b(this.b.get(), i, f, f2, j);
            }
        }

        @Override // tb.nky.a
        public void a(KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e8cd354", new Object[]{this, keyEvent});
            } else if (nkx.a(nkx.this) == null) {
            } else {
                nkx.a(nkx.this).b(this.b.get(), keyEvent, System.currentTimeMillis());
            }
        }
    }
}
