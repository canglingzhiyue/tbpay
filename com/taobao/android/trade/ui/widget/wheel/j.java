package com.taobao.android.trade.ui.widget.wheel;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MIN_DELTA_FOR_SCROLLING = 1;

    /* renamed from: a  reason: collision with root package name */
    private a f15651a;
    private Context b;
    private GestureDetector c;
    private Scroller d;
    private int e;
    private float f;
    private boolean g;
    private GestureDetector.SimpleOnGestureListener h = new GestureDetector.SimpleOnGestureListener() { // from class: com.taobao.android.trade.ui.widget.wheel.j.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            j.a(j.this, 0);
            j.b(j.this).fling(0, j.a(j.this), 0, (int) (-f2), 0, 0, -2147483647, Integer.MAX_VALUE);
            j.b(j.this, 0);
            return true;
        }
    };
    private final int i = 0;
    private final int j = 1;
    private Handler k = new Handler() { // from class: com.taobao.android.trade.ui.widget.wheel.j.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            j.b(j.this).computeScrollOffset();
            int currY = j.b(j.this).getCurrY();
            int a2 = j.a(j.this) - currY;
            j.a(j.this, currY);
            if (a2 != 0) {
                j.c(j.this).a(a2);
            }
            if (Math.abs(currY - j.b(j.this).getFinalY()) <= 0) {
                j.b(j.this).getFinalY();
                j.b(j.this).forceFinished(true);
            }
            if (!j.b(j.this).isFinished()) {
                j.d(j.this).sendEmptyMessage(message.what);
            } else if (message.what == 0) {
                j.e(j.this);
            } else {
                j.this.b();
            }
        }
    };

    /* loaded from: classes6.dex */
    public interface a {
        void a();

        void a(int i);

        void b();

        void c();
    }

    static {
        kge.a(-263320109);
    }

    public static /* synthetic */ int a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("827034e2", new Object[]{jVar})).intValue() : jVar.e;
    }

    public static /* synthetic */ int a(j jVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb96dbe7", new Object[]{jVar, new Integer(i)})).intValue();
        }
        jVar.e = i;
        return i;
    }

    public static /* synthetic */ Scroller b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Scroller) ipChange.ipc$dispatch("c283a19c", new Object[]{jVar}) : jVar.d;
    }

    public static /* synthetic */ void b(j jVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd408213", new Object[]{jVar, new Integer(i)});
        } else {
            jVar.a(i);
        }
    }

    public static /* synthetic */ a c(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6615d1ef", new Object[]{jVar}) : jVar.f15651a;
    }

    public static /* synthetic */ Handler d(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("1501294", new Object[]{jVar}) : jVar.k;
    }

    public static /* synthetic */ void e(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80969cf3", new Object[]{jVar});
        } else {
            jVar.d();
        }
    }

    public j(Context context, a aVar) {
        this.c = new GestureDetector(context, this.h);
        this.c.setIsLongpressEnabled(false);
        this.d = new Scroller(context);
        this.f15651a = aVar;
        this.b = context;
    }

    public void a(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade445bd", new Object[]{this, interpolator});
            return;
        }
        this.d.forceFinished(true);
        this.d = new Scroller(this.b, interpolator);
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.d.forceFinished(true);
        this.e = 0;
        this.d.startScroll(0, 0, 0, i, i2 != 0 ? i2 : 400);
        a(0);
        e();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d.forceFinished(true);
        }
    }

    public boolean a(MotionEvent motionEvent) {
        int y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f = motionEvent.getY();
            this.d.forceFinished(true);
            c();
        } else if (action == 2 && (y = (int) (motionEvent.getY() - this.f)) != 0) {
            e();
            this.f15651a.a(y);
            this.f = motionEvent.getY();
        }
        if (!this.c.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
            d();
        }
        return true;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        c();
        this.k.sendEmptyMessage(i);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.k.removeMessages(0);
        this.k.removeMessages(1);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f15651a.c();
        a(1);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.g) {
        } else {
            this.g = true;
            this.f15651a.a();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.g) {
        } else {
            this.f15651a.b();
            this.g = false;
        }
    }
}
