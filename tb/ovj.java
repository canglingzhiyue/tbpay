package tb;

import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.c;
import com.taobao.tao.util.DensityUtil;

/* loaded from: classes8.dex */
public class ovj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int MAX_DISTANCE_Y;

    /* renamed from: a  reason: collision with root package name */
    private float f32454a;
    private float b;
    private float c;
    private float d;
    private boolean i;
    private boolean k;
    private a l;
    private boolean e = false;
    private boolean f = false;
    private int g = -1;
    private boolean j = false;
    private float m = 0.0f;
    private int h = ViewConfiguration.get(Globals.getApplication()).getScaledPagingTouchSlop();

    /* loaded from: classes8.dex */
    public interface a {
        void a(MotionEvent motionEvent);
    }

    static {
        kge.a(2125396735);
        MAX_DISTANCE_Y = DensityUtil.dip2px(Globals.getApplication(), 42.0f);
    }

    public ovj(a aVar) {
        this.l = aVar;
    }

    public void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
        } else if (!ovi.a().b()) {
        } else {
            b(motionEvent);
        }
    }

    public boolean a(MotionEvent motionEvent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87bf8dfb", new Object[]{this, motionEvent, new Boolean(z)})).booleanValue();
        }
        this.e = z;
        return z;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (c.a().E() && this.k) {
            kss.a("Page_Home", 2101, "Page_Home_Accident_Slideto-tabdingyue", "spm=a2141.1.searchbar.dingyue");
            e.e("AccidentSlideFeature", "accident slide");
        }
        this.k = false;
    }

    private void b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74207cbe", new Object[]{this, motionEvent});
        } else if (this.e) {
        } else {
            int action = motionEvent.getAction();
            if (action == 0) {
                c(motionEvent);
            } else if (action == 1) {
                e(motionEvent);
            } else if (action != 2) {
            } else {
                d(motionEvent);
            }
        }
    }

    private void c(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("890944ff", new Object[]{this, motionEvent});
            return;
        }
        this.f = d();
        if (!this.f) {
            return;
        }
        this.g = MotionEventCompat.getPointerId(motionEvent, 0);
        this.f32454a = motionEvent.getX();
        this.b = motionEvent.getY();
    }

    private void d(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df20d40", new Object[]{this, motionEvent});
        } else if (j(motionEvent) || !g(motionEvent)) {
        } else {
            this.j = true;
            this.k = true;
            f(motionEvent);
            k(i(motionEvent));
        }
    }

    private void e(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dad581", new Object[]{this, motionEvent});
        } else if (!this.f) {
        } else {
            if (j(motionEvent)) {
                motionEvent = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 1, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
            }
            k(motionEvent);
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.g = -1;
        this.i = false;
        this.f32454a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.m = 0.0f;
        this.j = false;
    }

    private void f(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7c39dc2", new Object[]{this, motionEvent});
        } else if (this.i) {
        } else {
            this.i = true;
            this.c = motionEvent.getX();
            this.d = motionEvent.getY();
            k(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
        }
    }

    private boolean g(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dcac6607", new Object[]{this, motionEvent})).booleanValue() : !this.e && this.f && e() && h(motionEvent);
    }

    private boolean h(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1952e48", new Object[]{this, motionEvent})).booleanValue();
        }
        float x = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.g)) - this.f32454a;
        return !a(x) && Math.abs(x) > ((float) this.h) * ovi.a().c();
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : c.a().u() <= ovi.a().d();
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (c()) {
            return true;
        }
        lap.b("Scene.ACCIDENT_SLIDE", "Conditional judgment", "Not eligible for rolling ");
        return false;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : c.a().v();
    }

    private boolean a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821885c", new Object[]{this, new Float(f)})).booleanValue() : f < 0.0f && c.a().w();
    }

    private MotionEvent i(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionEvent) ipChange.ipc$dispatch("c22341c6", new Object[]{this, motionEvent});
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.g);
        float y = motionEvent.getY(findPointerIndex);
        if (this.m == 0.0f) {
            this.m = y;
        }
        motionEvent.setLocation(motionEvent.getX(findPointerIndex), this.m);
        return motionEvent;
    }

    private boolean j(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b66beca", new Object[]{this, motionEvent})).booleanValue();
        }
        int i = this.g;
        return i == -1 || motionEvent.findPointerIndex(i) == -1;
    }

    private void k(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("304f8707", new Object[]{this, motionEvent});
        } else {
            this.l.a(motionEvent);
        }
    }
}
