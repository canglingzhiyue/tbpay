package com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.widget.listview.features.DragToRefreshFeature;
import com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeature;
import com.taobao.android.detail.core.utils.i;
import java.util.Date;
import tb.edb;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
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
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;

    /* renamed from: a  reason: collision with root package name */
    public int f9689a;
    private float b;
    private float c;
    private c d;
    private c e;
    private int f;
    private boolean g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private PullToRefreshFeature.a l;
    private DragToRefreshFeature.a m;
    private Scroller n;
    private boolean o;
    private a p;
    private Context q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private boolean z;

    static {
        kge.a(628867012);
    }

    public b(a aVar, Context context, Scroller scroller) {
        this.f9689a = -1;
        this.o = false;
        this.s = false;
        this.t = false;
        this.u = true;
        this.v = false;
        this.w = true;
        this.z = false;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = -1;
        this.F = 0;
        this.G = 1;
        this.H = 350;
        this.p = aVar;
        this.n = scroller;
        this.q = context;
        this.f = 3;
        this.j = true;
        emu.a("com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh.RefreshController");
    }

    public b(a aVar, Context context, Scroller scroller, int i) {
        this.f9689a = -1;
        this.o = false;
        this.s = false;
        this.t = false;
        this.u = true;
        this.v = false;
        this.w = true;
        this.z = false;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = -1;
        this.F = 0;
        this.G = 1;
        this.H = 350;
        this.p = aVar;
        this.n = scroller;
        this.q = context;
        this.f = 3;
        this.j = true;
        this.G = i;
        emu.a("com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh.RefreshController");
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

    public void a(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        ImageView imageView = view;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472ce5b", new Object[]{this, new Boolean(z), new Integer(i), view});
        } else if (z) {
            if (view == null) {
                ImageView imageView2 = new ImageView(this.q);
                imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView = imageView2;
            }
            this.d = new c(this.q, i, null, imageView, this.G == 1 ? 1 : 3);
            String str = "最近更新:" + new Date().toLocaleString();
        } else {
            this.d = null;
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
        this.w = z;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
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

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.b(i);
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
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
        this.p.setHeadView(cVar.a());
    }

    public void b(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c217a", new Object[]{this, new Boolean(z), new Integer(i), view});
        } else if (z) {
            this.e = new c(this.q, i, null, view, this.G == 1 ? 2 : 4);
            String str = "最近更新:" + new Date().toLocaleString();
        } else {
            this.e = null;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        this.p.setFooterView(cVar.a());
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.u = !z;
        this.e.c(z);
        this.e.a(1, false);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.v || this.s) {
        } else {
            this.v = true;
            this.r = 5;
            this.e.a(2, false);
            this.e.b(true);
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.n.isFinished();
    }

    private int g(int i) {
        int h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b25ea748", new Object[]{this, new Integer(i)})).intValue();
        }
        DisplayMetrics displayMetrics = this.q.getResources().getDisplayMetrics();
        c cVar = this.d;
        if (cVar == null) {
            return i;
        }
        int b = cVar.b();
        if (this.w) {
            h = this.d.f();
        } else {
            h = this.d.h();
        }
        return (int) (((float) ((displayMetrics.heightPixels / (displayMetrics.heightPixels + (h + b))) / 1.3d)) * i);
    }

    private int h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4137fe7", new Object[]{this, new Integer(i)})).intValue();
        }
        DisplayMetrics displayMetrics = this.q.getResources().getDisplayMetrics();
        c cVar = this.d;
        return cVar != null ? (int) (((float) ((displayMetrics.widthPixels / (displayMetrics.widthPixels + (this.d.g() + cVar.d()))) / 1.3d)) * i) : i;
    }

    private boolean b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue();
        }
        a aVar = this.p;
        if (aVar != null) {
            if (aVar.hasArrivedTopEdge() && !this.k) {
                this.k = true;
                this.h = (int) motionEvent.getY();
                this.i = (int) motionEvent.getX();
                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                if (this.f9689a == -1) {
                    this.f9689a = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    this.b = motionEvent.getY();
                    this.c = motionEvent.getX();
                    this.E = this.f9689a;
                }
                return true;
            } else if (this.p.hasArrivedBottomEdge() && !this.k) {
                this.k = true;
                this.h = (int) motionEvent.getY();
                this.i = (int) motionEvent.getX();
                int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                if (this.f9689a == -1) {
                    this.f9689a = MotionEventCompat.getPointerId(motionEvent, actionIndex2);
                    this.b = motionEvent.getY();
                    this.c = motionEvent.getX();
                    this.E = this.f9689a;
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
            if (this.r == 4 && this.d != null) {
                this.p.keepTop();
                if (this.w) {
                    h2 = this.d.f();
                } else {
                    h2 = this.d.h();
                }
                if (g(i) < h2 && i2 - this.h > 0) {
                    this.f = 1;
                    l();
                }
            } else if (this.r == 5 && this.e != null) {
                this.p.keepBottom();
                if (Math.abs(i / 3) < this.e.f() && i2 - this.h < 0) {
                    this.f = 1;
                    if (this.u) {
                        m();
                    }
                }
            } else if (this.r == 6 && this.d != null) {
                this.p.keepTop();
                if (h(i) < this.d.g() && i2 - this.i > 0) {
                    this.f = 1;
                    l();
                }
            } else if (this.r == 7 && this.e != null) {
                this.p.keepBottom();
                if (Math.abs(i) < this.e.g() && i2 - this.i < 0) {
                    this.f = 1;
                    if (this.u) {
                        m();
                    }
                }
            }
        } else if (i3 == 1) {
            if (this.r == 4 && this.d != null) {
                this.p.keepTop();
                if (this.w) {
                    h = this.d.f();
                } else {
                    h = this.d.h();
                }
                if (g(i) >= h) {
                    this.f = 0;
                    this.g = true;
                } else if (i2 - this.h <= 0) {
                    this.f = 3;
                }
                l();
                g(i);
            } else if (this.r == 5 && this.e != null) {
                this.p.keepBottom();
                if (i / 3 <= this.e.f() * (-1)) {
                    this.f = 0;
                    this.g = true;
                } else if (i2 - this.h >= 0) {
                    this.f = 3;
                }
                if (this.u) {
                    m();
                }
            } else if (this.r == 6 && this.d != null) {
                this.p.keepTop();
                if (h(i) >= this.d.g()) {
                    this.f = 0;
                    this.g = true;
                } else if (i2 - this.i <= 0) {
                    this.f = 3;
                }
                l();
                h(i);
            } else if (this.r == 7 && this.e != null) {
                this.p.keepBottom();
                if (i <= this.e.g() * (-1)) {
                    this.f = 0;
                    this.g = true;
                } else if (i2 - this.i >= 0) {
                    this.f = 3;
                }
                if (this.u) {
                    m();
                }
            }
        } else if (i3 == 3) {
            if (i > 0 && this.p.hasArrivedTopEdge()) {
                this.r = this.G == 1 ? 4 : 6;
                this.f = 1;
                l();
            } else if (i < 0 && this.p.hasArrivedBottomEdge()) {
                this.r = this.G == 1 ? 5 : 7;
                this.f = 1;
                if (this.u) {
                    m();
                }
            }
        }
        int i4 = this.f;
        if (i4 != 1 && i4 != 0) {
            return;
        }
        if (this.r == 4 && (cVar4 = this.d) != null) {
            cVar4.a(0, (cVar4.f() * (-1)) + g(i), 0, 0);
        } else if (this.r == 5 && (cVar3 = this.e) != null && !this.s) {
            if (!this.u) {
                return;
            }
            cVar3.a(0, 0, 0, (cVar3.f() * (-1)) - (i / 3));
        } else if (this.r == 6 && (cVar2 = this.d) != null) {
            cVar2.a((cVar2.g() * (-1)) + h(i), 0, 0, 0);
        } else if (this.r != 7 || (cVar = this.e) == null || !this.u) {
        } else {
            cVar.a(0, 0, (cVar.g() * (-1)) - i, 0);
        }
    }

    public void a(MotionEvent motionEvent) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
        } else if (!this.j || this.o) {
        } else {
            switch (motionEvent.getAction() & 255) {
                case 0:
                    b(motionEvent);
                    return;
                case 1:
                case 3:
                case 4:
                    int i4 = this.f;
                    if (i4 != 2) {
                        int i5 = this.r;
                        if (i5 == 4) {
                            if (i4 == 1) {
                                this.f = 3;
                                l();
                            }
                            if (this.f == 0) {
                                this.f = 2;
                                l();
                                n();
                            }
                        } else if (i5 == 5) {
                            if (i4 == 1) {
                                this.f = 3;
                                if (this.u) {
                                    m();
                                }
                            }
                            if (this.f == 0) {
                                this.f = 2;
                                if (this.u) {
                                    m();
                                }
                                n();
                            }
                        } else if (i5 == 6) {
                            if (i4 == 1) {
                                this.f = 3;
                                l();
                            }
                            if (this.f == 0) {
                                this.f = 2;
                                l();
                                n();
                            }
                        } else if (i5 == 7) {
                            if (i4 == 1) {
                                this.f = 3;
                                if (this.u) {
                                    m();
                                }
                            }
                            if (this.f == 0) {
                                this.f = 2;
                                if (this.u) {
                                    m();
                                }
                                n();
                            }
                        }
                    }
                    this.k = false;
                    this.g = false;
                    this.z = false;
                    this.x = 0;
                    this.A = 0;
                    this.B = 0;
                    this.f9689a = -1;
                    return;
                case 2:
                    if (this.f9689a == -1) {
                        this.f9689a = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                        this.b = motionEvent.getY();
                        this.c = motionEvent.getX();
                        this.E = this.f9689a;
                    }
                    try {
                        int a2 = a(motionEvent, this.f9689a);
                        int y = (int) MotionEventCompat.getY(motionEvent, a2);
                        int x = (int) MotionEventCompat.getX(motionEvent, a2);
                        b(motionEvent);
                        if (this.z) {
                            int i6 = this.E;
                            int i7 = this.f9689a;
                            if (i6 == i7) {
                                if (1 == this.G) {
                                    float f = y;
                                    float f2 = this.b;
                                    i = (int) (this.x + (f - f2));
                                    y = (int) (this.A + (f - f2));
                                    this.y = i;
                                    this.C = y;
                                } else {
                                    float f3 = x;
                                    float f4 = this.c;
                                    i = (int) (this.x + (f3 - f4));
                                    x = (int) (this.B + (f3 - f4));
                                    this.y = i;
                                    this.D = x;
                                }
                            } else {
                                if (1 == this.G) {
                                    int i8 = this.y;
                                    float f5 = y;
                                    float f6 = this.b;
                                    i2 = (int) (i8 + (f5 - f6));
                                    int i9 = this.C;
                                    y = (int) (i9 + (f5 - f6));
                                    this.E = i7;
                                    this.x = i8;
                                    this.A = i9;
                                } else {
                                    int i10 = this.y;
                                    float f7 = x;
                                    float f8 = this.c;
                                    i2 = (int) (i10 + (f7 - f8));
                                    int i11 = this.D;
                                    x = (int) (i11 + (f7 - f8));
                                    this.E = i7;
                                    this.x = i10;
                                    this.B = i11;
                                }
                                i = i2;
                            }
                        } else if (1 == this.G) {
                            i = y - this.h;
                            this.x = i;
                            this.y = i;
                            this.A = y;
                            this.C = y;
                        } else {
                            i = x - this.i;
                            this.x = i;
                            this.y = i;
                            this.B = x;
                            this.D = x;
                        }
                        if (edb.f27204a) {
                            i.d("DownRefreshControler", this.x + "");
                        }
                        if (this.f == 2 || !this.k) {
                            return;
                        }
                        if (this.G == 1) {
                            x = y;
                        }
                        a(i, x);
                        this.F = i;
                        return;
                    } catch (IllegalArgumentException e) {
                        i.a("DownRefreshControler", "onTouchEvent", e);
                        return;
                    }
                case 5:
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    this.b = MotionEventCompat.getY(motionEvent, actionIndex);
                    this.c = MotionEventCompat.getX(motionEvent, actionIndex);
                    this.f9689a = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    this.z = true;
                    return;
                case 6:
                    int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                    if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.f9689a) {
                        if (actionIndex2 == 0) {
                            i3 = 1;
                        }
                        this.b = MotionEventCompat.getY(motionEvent, i3);
                        this.c = MotionEventCompat.getX(motionEvent, i3);
                        this.f9689a = MotionEventCompat.getPointerId(motionEvent, i3);
                    }
                    int a3 = a(motionEvent, this.f9689a);
                    if (this.f9689a == -1) {
                        return;
                    }
                    this.b = MotionEventCompat.getY(motionEvent, a3);
                    this.c = MotionEventCompat.getX(motionEvent, a3);
                    i.c("DownRefreshControler", "ACTION_POINTER_UP : mActivePointerId " + this.f9689a + " mLastMotionY position : " + this.b);
                    return;
                default:
                    return;
            }
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.F;
    }

    private int a(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87bf4e19", new Object[]{this, motionEvent, new Integer(i)})).intValue();
        }
        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
        if (findPointerIndex == -1) {
            this.f9689a = -1;
        }
        return findPointerIndex;
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
        int i2 = this.r;
        if (i2 == 4) {
            if (!this.o) {
                if (this.f != 2) {
                }
            } else if (z && (cVar4 = this.d) != null) {
                cVar4.a(0, i, 0, 0);
            } else {
                this.o = false;
            }
        } else if (i2 == 5) {
            if (!this.o) {
                if (this.f != 2) {
                }
            } else if (z && (cVar3 = this.e) != null) {
                cVar3.a(0, 0, 0, i);
            } else {
                this.o = false;
            }
        } else if (i2 == 6) {
            if (!this.o) {
                if (this.f != 2) {
                }
            } else if (z && (cVar2 = this.d) != null) {
                cVar2.a(i, 0, 0, 0);
            } else {
                this.o = false;
            }
        } else if (i2 != 7 || !this.o) {
        } else {
            if (z && (cVar = this.e) != null) {
                cVar.a(0, 0, i, 0);
            } else {
                this.o = false;
            }
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.a(this.f, this.g);
    }

    private void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
            return;
        }
        this.H = i;
        if (this.f == 1 && this.g) {
            this.g = false;
            return;
        }
        int i2 = this.f;
        if (i2 == 2) {
            if (edb.f27204a) {
                i.d("DownRefreshControler", "刷新造成scroll");
            }
            j(this.f);
        } else if (i2 != 3) {
        } else {
            if (edb.f27204a) {
                i.d("DownRefreshControler", "不需要刷新或者刷新完成造成scroll");
            }
            j(this.f);
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.a(this.f, this.g);
        if (this.f == 1 && this.g) {
            this.g = false;
            return;
        }
        int i = this.f;
        if (i == 2) {
            if (edb.f27204a) {
                i.d("DownRefreshControler", "刷新造成scroll");
            }
            j(this.f);
        } else if (i != 3) {
        } else {
            if (edb.f27204a) {
                i.d("DownRefreshControler", "不需要刷新或者刷新完成造成scroll");
            }
            j(this.f);
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.a(this.f, this.g);
        if (this.f == 1 && this.g) {
            this.g = false;
            return;
        }
        int i = this.f;
        if (i == 2) {
            if (edb.f27204a) {
                i.d("DownRefreshControler", "刷新造成scroll");
            }
            d(this.f);
        } else if (i != 3) {
        } else {
            if (edb.f27204a) {
                i.d("DownRefreshControler", "不需要刷新或者刷新完成造成scroll");
            }
            d(this.f);
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        int f = this.G == 1 ? cVar.f() : cVar.g();
        if (f == 0) {
            return;
        }
        if (i != 2 && i == 3) {
            i2 = -f;
        }
        i.a("DetailScroll", "resetHeadViewPadding startScroll:" + Thread.currentThread().toString());
        this.o = true;
        if (this.G == 1) {
            this.n.startScroll(0, this.e.c(), 0, i2 - this.e.c(), 350);
        } else {
            this.n.startScroll(this.e.e(), 0, i2 - this.e.e(), 0, 350);
        }
        this.p.trigger();
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
        this.t = z;
        cVar.d(z);
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        this.s = z;
        cVar.d(z);
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
        int f = this.G == 1 ? cVar.f() : cVar.g();
        if (f == 0) {
            return;
        }
        if (i != 2 && i == 3) {
            i2 = -f;
        }
        this.o = true;
        i.a("DetailScroll", "resetHeadViewPadding startScroll:" + Thread.currentThread().toString());
        if (this.G == 1) {
            if (this.w) {
                this.n.startScroll(0, this.d.b(), 0, i2 - this.d.b(), this.H);
            } else if (i == 2) {
                this.n.startScroll(0, this.d.b(), 0, ((this.d.b() + this.d.f()) - this.d.h()) * (-1), this.H);
            } else if (i == 3) {
                this.n.startScroll(0, this.d.b(), 0, i2 - this.d.b(), this.H);
            }
        } else {
            this.n.startScroll(this.d.d(), 0, i2 - this.d.d(), 0, this.H);
        }
        this.p.trigger();
    }

    public void a(PullToRefreshFeature.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0eb669", new Object[]{this, aVar});
            return;
        }
        this.l = aVar;
        this.j = true;
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        int i = this.r;
        if (i == 4 || i == 6) {
            if (this.t) {
                g();
                return;
            }
            PullToRefreshFeature.a aVar = this.l;
            if (aVar != null) {
                aVar.a();
            }
            if (this.m != null) {
            }
        } else if ((i != 5 && i != 7) || !this.s) {
        } else {
            g();
        }
    }

    public void e(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        this.H = i;
        this.f = 3;
        int i2 = this.r;
        if (i2 == 4 || i2 == 6) {
            if (this.d == null) {
                return;
            }
            str = "最近更新:" + new Date().toLocaleString();
            l();
        } else if ((i2 != 5 && i2 != 7) || this.e == null) {
        } else {
            r0 = "最近更新:" + new Date().toLocaleString();
            if (this.u) {
                m();
            } else if (this.s) {
            } else {
                this.e.a(3, true);
                this.v = false;
                d(3);
                i.c("RefreshController", "onRefreshComplete");
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f = 3;
        int i = this.r;
        if (i == 4 || i == 6) {
            if (this.d == null) {
                return;
            }
            String str = "最近更新:" + new Date().toLocaleString();
            k();
        } else if ((i != 5 && i != 7) || this.e == null) {
        } else {
            String str2 = "最近更新:" + new Date().toLocaleString();
            if (this.u) {
                m();
            } else if (this.s) {
            } else {
                this.e.a(3, true);
                this.v = false;
                d(3);
                i.c("RefreshController", "onRefreshFinish");
            }
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            i(i);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.H = 350;
        this.f = 3;
        int i = this.r;
        if (i == 4 || i == 6) {
            if (this.d == null) {
                return;
            }
            String str = "最近更新:" + new Date().toLocaleString();
            l();
        } else if ((i != 5 && i != 7) || this.e == null) {
        } else {
            String str2 = "最近更新:" + new Date().toLocaleString();
            if (this.u) {
                m();
            } else if (this.s) {
            } else {
                this.e.a(3, true);
                this.v = false;
                d(3);
                i.c("RefreshController", "onRefreshComplete");
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.d == null) {
        } else {
            this.f = 2;
            l();
            this.d.a(0, 0, 0, 0);
            this.r = 4;
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.e == null) {
        } else {
            this.r = 5;
            this.f = 2;
            l();
            this.e.a(0, 0, 0, 0);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.i();
    }
}
