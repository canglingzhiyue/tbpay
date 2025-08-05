package tb;

import android.app.Activity;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.procedure.IPage;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import tb.mon;

/* loaded from: classes7.dex */
public abstract class sgh implements DisplayManager.DisplayListener, mon.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final WeakReference<Activity> B;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<qpi> f33549a;
    private int b;
    public Map<mou, Long> C = new HashMap();
    public boolean D = false;
    public long E = 0;
    public float F = 0.0f;
    public float G = 0.0f;
    public float H = 0.0f;
    public float I = 0.0f;
    private volatile float c = 16.666666f;

    @Override // tb.mon.a
    public void a(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8cd354", new Object[]{this, keyEvent});
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf36749f", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548f547f", new Object[]{this, new Integer(i)});
        }
    }

    public sgh(Activity activity, qpi qpiVar) {
        Display defaultDisplay;
        this.B = new WeakReference<>(activity);
        this.f33549a = new WeakReference<>(qpiVar);
        WindowManager windowManager = activity.getWindowManager();
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return;
        }
        this.b = defaultDisplay.getDisplayId();
    }

    public float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.c;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        b(this.B.get());
        qpi qpiVar = this.f33549a.get();
        if (qpiVar == null) {
            return;
        }
        qpiVar.a(this);
    }

    public void a(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f025d123", new Object[]{this, iPage});
        } else if (!(iPage instanceof mou) || this.C.containsKey(iPage)) {
        } else {
            this.C.put((mou) iPage, Long.valueOf(System.nanoTime() / 1000000));
        }
    }

    public void b(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cc5fc24", new Object[]{this, iPage});
        } else if (!(iPage instanceof mou)) {
        } else {
            this.C.remove((mou) iPage);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Activity activity = this.B.get();
        if (activity != null && this.D) {
            c(activity);
        }
        qpi qpiVar = this.f33549a.get();
        if (qpiVar != null) {
            qpiVar.b(this);
        }
        if (this.C.size() <= 0) {
            return;
        }
        for (mou mouVar : new HashSet(this.C.keySet())) {
            if (mouVar != null) {
                b(mouVar);
            }
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i) {
        Activity activity;
        DisplayManager displayManager;
        Display display;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ed5eab", new Object[]{this, new Integer(i)});
        } else if (this.b != i || (activity = this.B.get()) == null || (displayManager = (DisplayManager) activity.getSystemService("display")) == null || (display = displayManager.getDisplay(i)) == null || d.ak) {
        } else {
            this.c = (float) (1000.0d / display.getRefreshRate());
        }
    }

    public void a(int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cea8149", new Object[]{this, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else if (i == 0) {
            this.E = j;
            this.F = f;
            this.G = f2;
            this.H = 0.0f;
            this.I = 0.0f;
        } else {
            if (i != 1) {
                if (i == 2) {
                    this.H += Math.abs(f - this.F);
                    this.I += Math.abs(f2 - this.G);
                    this.F = f;
                    this.G = f2;
                    return;
                } else if (i != 3) {
                    return;
                }
            }
            this.E = 0L;
        }
    }

    public static void a(Activity activity, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        ViewTreeObserver a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60751d0c", new Object[]{activity, onScrollChangedListener});
        } else if (activity == null || onScrollChangedListener == null || (a2 = a(activity)) == null || !a2.isAlive()) {
        } else {
            a2.addOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public static void b(Activity activity, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        ViewTreeObserver a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f26872b", new Object[]{activity, onScrollChangedListener});
        } else if (activity == null || onScrollChangedListener == null || (a2 = a(activity)) == null) {
        } else {
            a2.removeOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public static ViewTreeObserver a(Activity activity) {
        Window window;
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewTreeObserver) ipChange.ipc$dispatch("46efbfc8", new Object[]{activity});
        }
        if (Build.VERSION.SDK_INT >= 16 && activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            return decorView.getViewTreeObserver();
        }
        return null;
    }

    public static void a(Activity activity, mnw mnwVar) {
        Window window;
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b1aa374", new Object[]{activity, mnwVar});
        } else if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || !decorView.getViewTreeObserver().isAlive() || Build.VERSION.SDK_INT < 24 || mnwVar == null) {
        } else {
            window.addOnFrameMetricsAvailableListener(mnwVar, e.a().e());
        }
    }

    public static void a(Activity activity, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86c21ba9", new Object[]{activity, onFrameMetricsAvailableListener});
        } else if (onFrameMetricsAvailableListener == null || activity == null || (window = activity.getWindow()) == null || Build.VERSION.SDK_INT < 24) {
        } else {
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this, e.a().e());
        this.D = true;
    }

    public void c(Activity activity) {
        DisplayManager displayManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{this, activity});
        } else if (activity == null || (displayManager = (DisplayManager) activity.getSystemService("display")) == null) {
        } else {
            displayManager.unregisterDisplayListener(this);
        }
    }
}
