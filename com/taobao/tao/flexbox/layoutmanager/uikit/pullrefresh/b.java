package com.taobao.tao.flexbox.layoutmanager.uikit.pullrefresh;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.uikit.feature.DragToRefreshFeature;
import com.taobao.uikit.utils.UIKITLog;
import java.util.Date;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DONE = 3;
    public static final int DOWN_PULL = 4;
    public static final int LEFT_PULL = 7;
    public static final int PULL_TO_REFRESH = 1;
    public static final int REFRESHING = 2;
    public static final int RELEASE_TO_REFRESH = 0;
    public static final int RIGHT_PULL = 6;
    public static final int UP_PULL = 5;
    private int F;
    private float b;
    private float c;
    private c d;
    private c e;
    private boolean g;
    private int h;
    private int i;
    private boolean k;
    private DragToRefreshFeature.a l;
    private Scroller m;
    private a o;
    private Context p;
    private int q;
    private int w;
    private int x;

    /* renamed from: a  reason: collision with root package name */
    public int f20492a = -1;
    private boolean n = false;
    private boolean r = false;
    private boolean s = false;
    private boolean t = true;
    private boolean u = false;
    private boolean v = true;
    private boolean y = false;
    private int z = 0;
    private int A = 0;
    private int B = 0;
    private int C = 0;
    private int D = -1;
    private int E = 0;
    private int f = 3;
    private boolean j = true;

    static {
        kge.a(1407575144);
    }

    public b(a aVar, Context context, Scroller scroller, int i) {
        this.F = 1;
        this.o = aVar;
        this.m = scroller;
        this.p = context;
        this.F = i;
    }

    public void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
            return;
        }
        c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.a(strArr);
    }

    public void b(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb3fe96", new Object[]{this, strArr});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.a(strArr);
    }

    public void a(int i) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i <= 0 || (cVar = this.d) == null) {
        } else {
            cVar.e(i);
        }
    }

    public void a(boolean z, int i, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e764c5", new Object[]{this, new Boolean(z), new Integer(i), view, new Float(f)});
        } else {
            a(z, i, view, true, f);
        }
    }

    public void a(boolean z, int i, View view, boolean z2, float f) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b30eb307", new Object[]{this, new Boolean(z), new Integer(i), view, new Boolean(z2), new Float(f)});
        } else if (z) {
            if (this.d != null) {
                return;
            }
            if (view == null) {
                ImageView imageView2 = new ImageView(this.p);
                imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView = imageView2;
            } else {
                imageView = view;
            }
            this.d = new c(this.p, i, imageView, z2, this.F == 1 ? 1 : 3, f);
            String str = "最近更新:" + new Date().toLocaleString();
            a();
        } else {
            if (this.d != null) {
                b();
                this.d = null;
            }
            FakeHeaderView fakeHeaderView = new FakeHeaderView(this.p);
            fakeHeaderView.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            fakeHeaderView.setPadding(0, -1, 0, 0);
            this.o.setHeadView(fakeHeaderView);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.d;
        if (cVar != null) {
            cVar.a(z);
        }
        this.v = z;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.d;
        if (cVar != null) {
            cVar.a(i);
        }
        c cVar2 = this.e;
        if (cVar2 == null) {
            return;
        }
        cVar2.a(i);
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.b(i);
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.b(i);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c cVar = this.d;
        if (cVar == null) {
            return;
        }
        this.o.setHeadView(cVar.a());
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c cVar = this.d;
        if (cVar == null) {
            return;
        }
        this.o.removeHeaderView(cVar.a());
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        this.o.removeFooterView(cVar.a());
    }

    public void b(boolean z, int i, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3387586", new Object[]{this, new Boolean(z), new Integer(i), view, new Float(f)});
        } else {
            b(z, i, view, true, f);
        }
    }

    public void b(boolean z, int i, View view, boolean z2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3dfba66", new Object[]{this, new Boolean(z), new Integer(i), view, new Boolean(z2), new Float(f)});
        } else if (z) {
            if (this.e != null) {
                return;
            }
            this.e = new c(this.p, i, view, z2, this.F == 1 ? 2 : 4, f);
            String str = "最近更新:" + new Date().toLocaleString();
            d();
        } else if (this.e == null) {
        } else {
            c();
            this.e = null;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        this.o.setFooterView(cVar.a());
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.t = !z;
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.c(z);
        this.e.c(1);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.t || this.u || this.r) {
        } else {
            this.u = true;
            this.q = 5;
            c cVar = this.e;
            if (cVar != null) {
                cVar.c(2);
            }
            DragToRefreshFeature.a aVar = this.l;
            if (aVar != null) {
                aVar.b();
            }
            c cVar2 = this.e;
            if (cVar2 == null) {
                return;
            }
            cVar2.b(true);
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.m.isFinished();
    }

    private int f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0a9cea9", new Object[]{this, new Integer(i)})).intValue();
        }
        DisplayMetrics displayMetrics = this.p.getResources().getDisplayMetrics();
        c cVar = this.d;
        return cVar != null ? (int) (((float) ((displayMetrics.heightPixels / (displayMetrics.heightPixels + (this.d.f() + cVar.b()))) / 1.3d)) * i) : i;
    }

    private int g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b25ea748", new Object[]{this, new Integer(i)})).intValue();
        }
        DisplayMetrics displayMetrics = this.p.getResources().getDisplayMetrics();
        c cVar = this.d;
        return cVar != null ? (int) (((float) ((displayMetrics.widthPixels / (displayMetrics.widthPixels + (this.d.g() + cVar.d()))) / 1.3d)) * i) : i;
    }

    private boolean b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue();
        }
        a aVar = this.o;
        if (aVar != null) {
            if (aVar.hasArrivedTopEdge() && !this.k) {
                this.k = true;
                this.h = (int) motionEvent.getY();
                this.i = (int) motionEvent.getX();
                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                if (this.f20492a == -1) {
                    this.f20492a = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    this.b = motionEvent.getY();
                    this.c = motionEvent.getX();
                    this.D = this.f20492a;
                }
                return true;
            } else if (this.o.hasArrivedBottomEdge() && !this.k) {
                this.k = true;
                this.h = (int) motionEvent.getY();
                this.i = (int) motionEvent.getX();
                int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                if (this.f20492a == -1) {
                    this.f20492a = MotionEventCompat.getPointerId(motionEvent, actionIndex2);
                    this.b = motionEvent.getY();
                    this.c = motionEvent.getX();
                    this.D = this.f20492a;
                }
                return true;
            }
        }
        return false;
    }

    private void a(int i, int i2) {
        int h;
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        int h2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.f;
        if (i3 == 0) {
            if (this.q == 4 && this.d != null) {
                this.o.keepTop();
                if (this.v) {
                    h2 = this.d.f();
                } else {
                    h2 = this.d.h();
                }
                if (f(i) < h2 && i2 - this.h > 0) {
                    this.f = 1;
                    m();
                }
            } else if (this.q == 5 && this.e != null) {
                this.o.keepBottom();
                if (Math.abs(i / 3) < this.e.f() && i2 - this.h < 0) {
                    this.f = 1;
                    if (this.t) {
                        n();
                    }
                }
            } else if (this.q == 6 && this.d != null) {
                this.o.keepTop();
                if (g(i) < this.d.g() && i2 - this.i > 0) {
                    this.f = 1;
                    m();
                }
            } else if (this.q == 7 && this.e != null) {
                this.o.keepBottom();
                if (Math.abs(i) < this.e.g() && i2 - this.i < 0) {
                    this.f = 1;
                    if (this.t) {
                        n();
                    }
                }
            }
        } else if (i3 == 1) {
            if (this.q == 4 && this.d != null) {
                this.o.keepTop();
                if (this.v) {
                    h = this.d.f();
                } else {
                    h = this.d.h();
                }
                if (f(i) >= h) {
                    this.f = 0;
                    this.g = true;
                } else if (i2 - this.h <= 0) {
                    this.f = 3;
                }
                m();
                h(f(i));
            } else if (this.q == 5 && this.e != null) {
                this.o.keepBottom();
                if (i / 3 <= this.e.f() * (-1)) {
                    this.f = 0;
                    this.g = true;
                } else if (i2 - this.h >= 0) {
                    this.f = 3;
                }
                if (this.t) {
                    n();
                    i((-i) / 3);
                }
            } else if (this.q == 6 && this.d != null) {
                this.o.keepTop();
                if (g(i) >= this.d.g()) {
                    this.f = 0;
                    this.g = true;
                } else if (i2 - this.i <= 0) {
                    this.f = 3;
                }
                m();
                h(g(i));
            } else if (this.q == 7 && this.e != null) {
                this.o.keepBottom();
                if (i <= this.e.g() * (-1)) {
                    this.f = 0;
                    this.g = true;
                } else if (i2 - this.i >= 0) {
                    this.f = 3;
                }
                if (this.t) {
                    n();
                    i(-i);
                }
            }
        } else if (i3 == 3) {
            if (i > 0 && this.o.hasArrivedTopEdge()) {
                this.q = this.F == 1 ? 4 : 6;
                this.f = 1;
                m();
            } else if (i < 0 && this.o.hasArrivedBottomEdge()) {
                this.q = this.F == 1 ? 5 : 7;
                if (this.t) {
                    this.f = 1;
                    n();
                } else {
                    e();
                }
            }
        }
        int i4 = this.f;
        if (i4 != 1 && i4 != 0) {
            return;
        }
        if (this.q == 4 && (cVar4 = this.d) != null) {
            cVar4.a(0, f(i) - this.d.f(), 0, 0);
        } else if (this.q == 5 && (cVar3 = this.e) != null && !this.r) {
            if (!this.t) {
                return;
            }
            cVar3.a(0, 0, 0, (cVar3.f() * (-1)) - (i / 3));
        } else if (this.q == 6 && (cVar2 = this.d) != null) {
            cVar2.a((cVar2.g() * (-1)) + g(i), 0, 0, 0);
        } else if (this.q != 7 || (cVar = this.e) == null || !this.t) {
        } else {
            cVar.a(0, 0, (cVar.g() * (-1)) - i, 0);
        }
    }

    public void a(MotionEvent motionEvent) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
        } else if (!this.j || this.n) {
        } else {
            switch (motionEvent.getAction() & 255) {
                case 0:
                    b(motionEvent);
                    return;
                case 1:
                case 3:
                case 4:
                    int i3 = this.f;
                    if (i3 != 2) {
                        int i4 = this.q;
                        if (i4 == 4) {
                            if (i3 == 1) {
                                this.f = 3;
                                m();
                            }
                            if (this.f == 0) {
                                this.f = 2;
                                m();
                                o();
                            }
                        } else if (i4 == 5) {
                            if (i3 == 1) {
                                this.f = 3;
                                if (this.t) {
                                    n();
                                }
                            }
                            if (this.f == 0) {
                                this.f = 2;
                                if (this.t) {
                                    n();
                                }
                                o();
                            }
                        } else if (i4 == 6) {
                            if (i3 == 1) {
                                this.f = 3;
                                m();
                            }
                            if (this.f == 0) {
                                this.f = 2;
                                m();
                                o();
                            }
                        } else if (i4 == 7) {
                            if (i3 == 1) {
                                this.f = 3;
                                if (this.t) {
                                    n();
                                }
                            }
                            if (this.f == 0) {
                                this.f = 2;
                                if (this.t) {
                                    n();
                                }
                                o();
                            }
                        }
                    }
                    this.k = false;
                    this.g = false;
                    this.y = false;
                    this.w = 0;
                    this.z = 0;
                    this.A = 0;
                    this.f20492a = -1;
                    return;
                case 2:
                    if (this.f20492a == -1) {
                        this.f20492a = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                        this.b = motionEvent.getY();
                        this.c = motionEvent.getX();
                        this.D = this.f20492a;
                    }
                    try {
                        int a2 = a(motionEvent, this.f20492a);
                        int y = (int) MotionEventCompat.getY(motionEvent, a2);
                        int x = (int) MotionEventCompat.getX(motionEvent, a2);
                        b(motionEvent);
                        if (this.y) {
                            int i5 = this.D;
                            int i6 = this.f20492a;
                            if (i5 == i6) {
                                if (1 == this.F) {
                                    float f = y;
                                    float f2 = this.b;
                                    i = (int) (this.w + (f - f2));
                                    y = (int) (this.z + (f - f2));
                                    this.x = i;
                                    this.B = y;
                                } else {
                                    float f3 = x;
                                    float f4 = this.c;
                                    i = (int) (this.w + (f3 - f4));
                                    x = (int) (this.A + (f3 - f4));
                                    this.x = i;
                                    this.C = x;
                                }
                            } else {
                                if (1 == this.F) {
                                    int i7 = this.x;
                                    float f5 = y;
                                    float f6 = this.b;
                                    i2 = (int) (i7 + (f5 - f6));
                                    int i8 = this.B;
                                    y = (int) (i8 + (f5 - f6));
                                    this.D = i6;
                                    this.w = i7;
                                    this.z = i8;
                                } else {
                                    int i9 = this.x;
                                    float f7 = x;
                                    float f8 = this.c;
                                    i2 = (int) (i9 + (f7 - f8));
                                    int i10 = this.C;
                                    x = (int) (i10 + (f7 - f8));
                                    this.D = i6;
                                    this.w = i9;
                                    this.A = i10;
                                }
                                i = i2;
                            }
                        } else if (1 == this.F) {
                            i = y - this.h;
                            this.w = i;
                            this.x = i;
                            this.z = y;
                            this.B = y;
                        } else {
                            i = x - this.i;
                            this.w = i;
                            this.x = i;
                            this.A = x;
                            this.C = x;
                        }
                        if (this.f == 2 || !this.k) {
                            return;
                        }
                        if (this.F == 1) {
                            x = y;
                        }
                        a(i, x);
                        this.E = i;
                        return;
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                        return;
                    }
                case 5:
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    UIKITLog.i("DownRefreshControler", "ACTION_POINTER_DOWN : mActivePointerId %d  position : %f", Integer.valueOf(this.f20492a), Float.valueOf(this.b));
                    this.b = MotionEventCompat.getY(motionEvent, actionIndex);
                    this.c = MotionEventCompat.getX(motionEvent, actionIndex);
                    this.f20492a = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    this.y = true;
                    return;
                case 6:
                    int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                    if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.f20492a) {
                        int i11 = actionIndex2 == 0 ? 1 : 0;
                        this.b = MotionEventCompat.getY(motionEvent, i11);
                        this.c = MotionEventCompat.getX(motionEvent, i11);
                        this.f20492a = MotionEventCompat.getPointerId(motionEvent, i11);
                    }
                    int a3 = a(motionEvent, this.f20492a);
                    if (this.f20492a == -1) {
                        return;
                    }
                    this.b = MotionEventCompat.getY(motionEvent, a3);
                    this.c = MotionEventCompat.getX(motionEvent, a3);
                    UIKITLog.i("DownRefreshControler", "ACTION_POINTER_UP : mActivePointerId %d mLastMotionY position : %f", Integer.valueOf(this.f20492a), Float.valueOf(this.b));
                    return;
                default:
                    return;
            }
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.E;
    }

    private int a(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87bf4e19", new Object[]{this, motionEvent, new Integer(i)})).intValue();
        }
        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
        if (findPointerIndex == -1) {
            this.f20492a = -1;
        }
        return findPointerIndex;
    }

    private void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.d(i);
    }

    private void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.d(i);
    }

    public void a(int i, boolean z) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        int i2 = this.q;
        if (i2 == 4) {
            if (!this.n) {
                return;
            }
            if (z && (cVar4 = this.d) != null) {
                cVar4.a(0, i, 0, 0);
            } else {
                this.n = false;
            }
        } else if (i2 == 5) {
            if (!this.n) {
                return;
            }
            if (z && (cVar3 = this.e) != null) {
                cVar3.a(0, 0, 0, i);
            } else {
                this.n = false;
            }
        } else if (i2 == 6) {
            if (!this.n) {
                return;
            }
            if (z && (cVar2 = this.d) != null) {
                cVar2.a(i, 0, 0, 0);
            } else {
                this.n = false;
            }
        } else if (i2 != 7 || !this.n) {
        } else {
            if (z && (cVar = this.e) != null) {
                cVar.a(0, 0, i, 0);
            } else {
                this.n = false;
            }
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.c(this.f);
        if (this.f == 1 && this.g) {
            this.g = false;
            return;
        }
        int i = this.f;
        if (i == 2) {
            UIKITLog.v("DownRefreshControler", "刷新造成scroll", new Object[0]);
            j(this.f);
        } else if (i != 3) {
        } else {
            UIKITLog.v("DownRefreshControler", "不需要刷新或者刷新完成造成scroll", new Object[0]);
            j(this.f);
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.c(this.f);
        if (this.f == 1 && this.g) {
            this.g = false;
            return;
        }
        int i = this.f;
        if (i == 2) {
            UIKITLog.v("DownRefreshControler", "刷新造成scroll", new Object[0]);
            e(this.f);
        } else if (i != 3) {
        } else {
            UIKITLog.v("DownRefreshControler", "不需要刷新或者刷新完成造成scroll", new Object[0]);
            e(this.f);
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        int f = this.F == 1 ? cVar.f() : cVar.g();
        if (f == 0) {
            return;
        }
        if (i != 2 && i == 3) {
            i2 = -f;
        }
        this.n = true;
        if (this.F == 1) {
            this.m.startScroll(0, this.e.c(), 0, i2 - this.e.c(), 350);
        } else {
            this.m.startScroll(this.e.e(), 0, i2 - this.e.e(), 0, 350);
        }
        this.o.trigger();
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.d;
        if (cVar == null) {
            return;
        }
        this.s = z;
        cVar.d(z);
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.e;
        if (cVar != null) {
            this.r = z;
            cVar.d(z);
        }
        this.u = false;
    }

    private void j(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d3132", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.d;
        if (cVar == null) {
            return;
        }
        int f = this.F == 1 ? cVar.f() : cVar.g();
        if (f == 0) {
            return;
        }
        if (i != 2 && i == 3) {
            i2 = -f;
        }
        this.n = true;
        if (this.F == 1) {
            if (this.v) {
                this.m.startScroll(0, this.d.b(), 0, i2 - this.d.b(), 350);
            } else if (i == 2) {
                this.m.startScroll(0, this.d.b(), 0, (this.d.h() - this.d.b()) - this.d.f(), 350);
            } else if (i == 3) {
                this.m.startScroll(0, this.d.b(), 0, i2 - this.d.b(), 350);
            }
        } else {
            this.m.startScroll(this.d.d(), 0, i2 - this.d.d(), 0, 350);
        }
        this.o.trigger();
    }

    public void a(DragToRefreshFeature.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ec7cc3", new Object[]{this, aVar});
            return;
        }
        this.l = aVar;
        this.j = true;
    }

    private void o() {
        DragToRefreshFeature.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        int i = this.q;
        if (i == 4 || i == 6) {
            if (this.s) {
                h();
                return;
            }
            DragToRefreshFeature.a aVar2 = this.l;
            if (aVar2 == null) {
                return;
            }
            aVar2.a();
        } else if (i != 5 && i != 7) {
        } else {
            if (this.r) {
                h();
            } else if (!this.t || (aVar = this.l) == null) {
            } else {
                aVar.b();
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.f = 3;
        int i = this.q;
        if (i == 4 || i == 6) {
            if (this.d == null) {
                return;
            }
            String str = "最近更新:" + new Date().toLocaleString();
            m();
        } else if ((i != 5 && i != 7) || this.e == null) {
        } else {
            String str2 = "最近更新:" + new Date().toLocaleString();
            if (this.t) {
                n();
                return;
            }
            this.u = false;
            if (this.r) {
                return;
            }
            this.e.c(3);
            e(3);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.d == null) {
        } else {
            this.f = 2;
            m();
            this.d.a(0, 0, 0, 0);
            this.q = 4;
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.e == null) {
        } else {
            this.q = 5;
            this.f = 2;
            m();
            this.e.a(0, 0, 0, 0);
        }
    }

    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.q;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.f;
    }
}
