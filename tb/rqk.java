package tb;

import android.app.Activity;
import android.os.Bundle;
import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public class rqk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static rqk f;

    /* renamed from: a  reason: collision with root package name */
    private int f33321a = 0;
    private boolean b = false;
    private ScheduledFuture<?> c = null;
    private List<rqi> d = new LinkedList();
    private final Object e = new Object();
    private int g = 50;

    public static /* synthetic */ int a(rqk rqkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fd87693f", new Object[]{rqkVar})).intValue() : rqkVar.g;
    }

    public static /* synthetic */ int a(rqk rqkVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b366332a", new Object[]{rqkVar, new Integer(i)})).intValue();
        }
        rqkVar.g = i;
        return i;
    }

    public static /* synthetic */ Object b(rqk rqkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("698a9b05", new Object[]{rqkVar}) : rqkVar.e;
    }

    public static /* synthetic */ List c(rqk rqkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("510f3639", new Object[]{rqkVar}) : rqkVar.d;
    }

    static {
        kge.a(209379407);
        f = new rqk();
    }

    private rqk() {
        UTClientConfigMgr.a().a(new UTClientConfigMgr.a() { // from class: tb.rqk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
            public String getKey() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : "switch_background_delay";
            }

            @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
            public void onChange(String str) {
                int i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5bfd17c0", new Object[]{this, str});
                    return;
                }
                try {
                    i = Integer.parseInt(str);
                } catch (Exception unused) {
                    i = 50;
                }
                if (i >= 0 && i <= 500) {
                    rqk.a(rqk.this, i);
                } else {
                    rqk.a(rqk.this, 50);
                }
                apr.b("", "SwitchBackgroundDelay", Integer.valueOf(rqk.a(rqk.this)));
            }
        });
    }

    public static rqk getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rqk) ipChange.ipc$dispatch("20148ca8", new Object[0]) : f;
    }

    public void registerAppStatusCallbacks(rqi rqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2d554b", new Object[]{this, rqiVar});
        } else if (rqiVar == null) {
        } else {
            synchronized (this.e) {
                this.d.add(rqiVar);
            }
        }
    }

    public void unregisterAppStatusCallbacks(rqi rqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a46a924", new Object[]{this, rqiVar});
        } else if (rqiVar == null) {
        } else {
            synchronized (this.e) {
                this.d.remove(rqiVar);
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        synchronized (this.e) {
            for (int i = 0; i < this.d.size(); i++) {
                this.d.get(i).onActivityCreated(activity, bundle);
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        synchronized (this.e) {
            for (int i = 0; i < this.d.size(); i++) {
                this.d.get(i).onActivityDestroyed(activity);
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        synchronized (this.e) {
            for (int i = 0; i < this.d.size(); i++) {
                this.d.get(i).onActivityPaused(activity);
            }
        }
    }

    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        synchronized (this.e) {
            for (int i = 0; i < this.d.size(); i++) {
                this.d.get(i).onActivityResumed(activity);
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        synchronized (this.e) {
            for (int i = 0; i < this.d.size(); i++) {
                this.d.get(i).onActivitySaveInstanceState(activity, bundle);
            }
        }
    }

    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        a();
        this.f33321a++;
        if (this.b) {
            return;
        }
        apr.b("UTAppStatusMonitor", "onSwitchForeground");
        synchronized (this.e) {
            for (int i = 0; i < this.d.size(); i++) {
                this.d.get(i).onSwitchForeground();
            }
            this.b = true;
        }
    }

    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        this.f33321a--;
        if (this.f33321a != 0) {
            return;
        }
        apr.b("UTAppStatusMonitor", "onSwitchBackground");
        synchronized (this.e) {
            for (int i = 0; i < this.d.size(); i++) {
                this.d.get(i).onSwitchBackground();
            }
            this.b = false;
        }
        a();
        this.c = aqe.a().a(null, new a(), this.g);
    }

    /* loaded from: classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2122654083);
            kge.a(-1390502639);
        }

        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (rqk.b(rqk.this)) {
                for (int i = 0; i < rqk.c(rqk.this).size(); i++) {
                    rqi rqiVar = (rqi) rqk.c(rqk.this).get(i);
                    if (rqiVar instanceof rqj) {
                        ((rqj) rqiVar).onSwitchBackgroundDelay();
                    }
                }
            }
        }
    }

    public boolean isInForeground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6cfcc61d", new Object[]{this})).booleanValue() : this.b;
    }

    private synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.c != null) {
            this.c.cancel(true);
        }
    }
}
