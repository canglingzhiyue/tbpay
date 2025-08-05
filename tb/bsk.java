package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.design.widget.CoordinatorLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public abstract class bsk extends bsg implements View.OnLayoutChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bsq d;
    private boolean e;
    private int f = 0;

    static {
        kge.a(1741066578);
        kge.a(-782512414);
    }

    public static /* synthetic */ Object ipc$super(bsk bskVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 84942234) {
            super.a((View) objArr[0], (bsq) objArr[1]);
            return null;
        } else if (hashCode != 92838762) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c();
            return null;
        }
    }

    public abstract void a(ViewGroup viewGroup, View view);

    @Override // tb.bsh
    public void b(bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0dbcf19", new Object[]{this, bsqVar});
        }
    }

    public static /* synthetic */ void a(bsk bskVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686c7036", new Object[]{bskVar, new Boolean(z)});
        } else {
            bskVar.b(z);
        }
    }

    public static /* synthetic */ boolean a(bsk bskVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e2560e62", new Object[]{bskVar})).booleanValue() : bskVar.e;
    }

    public static /* synthetic */ ViewGroup b(bsk bskVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("d200fa56", new Object[]{bskVar}) : bskVar.g();
    }

    @Override // tb.bsg
    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : R.id.auraFloatViewLayoutClose;
    }

    @Override // tb.bsg
    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : R.id.auraFloatViewLayoutContentWrapper;
    }

    @Override // tb.bsg
    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : R.id.auraFloatViewLayoutBackgroundMask;
    }

    @Override // tb.bsg
    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : R.id.auraFloatViewLayoutContentPlaceholder;
    }

    @Override // tb.bsg, tb.bsh
    public ViewGroup a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d01cc9b5", new Object[]{this, context});
        }
        if (this.c == null) {
            this.c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.aura_float_view_draggable_layout, (ViewGroup) null);
            this.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.c.addOnLayoutChangeListener(this);
        } else {
            a((View) this.c);
        }
        return this.c;
    }

    @Override // tb.bsg, tb.bsh
    public void a(View view, bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5101d9a", new Object[]{this, view, bsqVar});
            return;
        }
        this.d = bsqVar;
        super.a(view, bsqVar);
        a(this.c, m(), bsqVar);
        b(view, bsqVar);
    }

    private void b(final View view, bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d405d79", new Object[]{this, view, bsqVar});
            return;
        }
        Boolean g = bsqVar.g();
        if ((g != null && !g.booleanValue()) || bsqVar.h() != null) {
            return;
        }
        final ViewGroup g2 = g();
        g2.post(new Runnable() { // from class: tb.bsk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    view.post(new Runnable() { // from class: tb.bsk.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                bsk.this.a(g2, view);
                            }
                        }
                    });
                }
            }
        });
    }

    public void a(final ViewGroup viewGroup, final AURABottomSheetBehavior aURABottomSheetBehavior, final bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1027a954", new Object[]{this, viewGroup, aURABottomSheetBehavior, bsqVar});
            return;
        }
        Boolean g = bsqVar.g();
        if (g != null) {
            aURABottomSheetBehavior.b(g.booleanValue());
        }
        aURABottomSheetBehavior.c(true);
        viewGroup.post(new Runnable() { // from class: tb.bsk.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    aURABottomSheetBehavior.a((int) (viewGroup.getHeight() * bsqVar.a()));
                }
            }
        });
        aURABottomSheetBehavior.a(new AURABottomSheetBehavior.a() { // from class: tb.bsk.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                str.hashCode();
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.a
            public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("59011340", new Object[]{this, coordinatorLayout, view, view2, new Integer(i), new Integer(i2), iArr, new Integer(i3)})).booleanValue();
                }
                boolean z = bsk.a(bsk.this) || view.getTop() >= coordinatorLayout.getHeight();
                if (z) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                return z;
            }

            @Override // com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.a
            public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("2d2b886e", new Object[]{this, coordinatorLayout, view, view2, new Integer(i)})).booleanValue() : bsk.a(bsk.this) || view.getTop() >= coordinatorLayout.getHeight();
            }

            @Override // com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.a
            public void a(View view, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
                } else if (5 != i) {
                } else {
                    bsk.a(bsk.this, true);
                }
            }

            @Override // com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.a
            public void a(View view, float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b3af196", new Object[]{this, view, new Float(f)});
                    return;
                }
                a(f);
                if (f < 0.0f) {
                    return;
                }
                if (0.0f == f && !bsk.this.m().c()) {
                    return;
                }
                ViewGroup b = bsk.b(bsk.this);
                ViewGroup.LayoutParams layoutParams = b.getLayoutParams();
                int height = (int) (viewGroup.getHeight() * bsqVar.a());
                layoutParams.height = (int) (height + ((((int) (viewGroup.getHeight() * bsqVar.b())) - height) * f));
                b.setLayoutParams(layoutParams);
            }

            private void a(float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                    return;
                }
                View a2 = bsk.this.a();
                if (a2 == null) {
                    return;
                }
                Drawable background = a2.getBackground();
                background.mutate();
                if (f >= 0.0f) {
                    background.setAlpha(255);
                } else {
                    background.setAlpha(Math.min(255, Math.max(0, (int) ((1.0f - Math.abs(f)) * 255))));
                }
            }

            @Override // com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.a
            public int a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("9501e35d", new Object[]{this, view})).intValue();
                }
                int height = (int) (viewGroup.getHeight() * bsqVar.b());
                return height <= 0 ? (int) (bay.c() * bsqVar.b()) : height;
            }
        });
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            m().d(z);
        }
    }

    public final int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : m().d();
    }

    public final AURABottomSheetBehavior<View> m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURABottomSheetBehavior) ipChange.ipc$dispatch("add1d1df", new Object[]{this}) : AURABottomSheetBehavior.b((View) b());
    }

    @Override // tb.bsg
    public void a(ViewGroup viewGroup, View view, View view2, ViewGroup.MarginLayoutParams marginLayoutParams, bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691a36f8", new Object[]{this, viewGroup, view, view2, marginLayoutParams, bsqVar});
            return;
        }
        marginLayoutParams.height = (int) (viewGroup.getHeight() * bsqVar.a());
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.bottomMargin = 0;
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.rightMargin = 0;
    }

    @Override // tb.bsg
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        n();
        return false;
    }

    @Override // tb.bsg, tb.bsh
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : n();
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        if (this.b != null && this.b.a()) {
            return true;
        }
        AURABottomSheetBehavior<View> m = m();
        if (5 == m.d()) {
            return false;
        }
        m.b(5);
        this.e = true;
        return true;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            return;
        }
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (this.f != 0 && i9 != i10 && f() != null && this.d != null) {
            a(f(), this.d);
        }
        this.f = i10;
    }

    @Override // tb.bsg, tb.bsh
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        if (this.c == null) {
            return;
        }
        this.c.removeOnLayoutChangeListener(this);
    }
}
