package com.alibaba.android.umf.taobao.adapter.widget.behavior;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.math.MathUtils;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import tb.bay;
import tb.kge;

/* loaded from: classes2.dex */
public class AURABottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private float A;
    private final ViewDragHelper.Callback B;

    /* renamed from: a  reason: collision with root package name */
    public int f2862a;
    private final int[] b;
    private float c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private ViewDragHelper m;
    private boolean n;
    private int o;
    private boolean p;
    private int q;
    private WeakReference<V> r;
    private WeakReference<View> s;
    private a t;
    private VelocityTracker u;
    private int v;
    private int w;
    private boolean x;
    private float y;
    private float z;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface State {
    }

    static {
        kge.a(-1830112014);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(AURABottomSheetBehavior aURABottomSheetBehavior, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1311535025:
                return new Boolean(super.onNestedPreFling((CoordinatorLayout) objArr[0], (View) objArr[1], (View) objArr[2], ((Number) objArr[3]).floatValue(), ((Number) objArr[4]).floatValue()));
            case 845915598:
                super.onStopNestedScroll((CoordinatorLayout) objArr[0], (View) objArr[1], (View) objArr[2], ((Number) objArr[3]).intValue());
                return null;
            case 1331437710:
                super.onRestoreInstanceState((CoordinatorLayout) objArr[0], (View) objArr[1], (Parcelable) objArr[2]);
                return null;
            case 1332091669:
                super.onNestedPreScroll((CoordinatorLayout) objArr[0], (View) objArr[1], (View) objArr[2], ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), (int[]) objArr[5], ((Number) objArr[6]).intValue());
                return null;
            case 1576128123:
                return super.onSaveInstanceState((CoordinatorLayout) objArr[0], (View) objArr[1]);
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ boolean a(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8795aae9", new Object[]{aURABottomSheetBehavior})).booleanValue() : aURABottomSheetBehavior.x;
    }

    public static /* synthetic */ int b(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3f821859", new Object[]{aURABottomSheetBehavior})).intValue() : aURABottomSheetBehavior.v;
    }

    public static /* synthetic */ WeakReference c(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("9f93a235", new Object[]{aURABottomSheetBehavior}) : aURABottomSheetBehavior.s;
    }

    public static /* synthetic */ WeakReference d(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("530cb436", new Object[]{aURABottomSheetBehavior}) : aURABottomSheetBehavior.r;
    }

    public static /* synthetic */ int e(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("674760dc", new Object[]{aURABottomSheetBehavior})).intValue() : aURABottomSheetBehavior.g;
    }

    public static /* synthetic */ int f(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1f33ce5d", new Object[]{aURABottomSheetBehavior})).intValue() : aURABottomSheetBehavior.h;
    }

    public static /* synthetic */ boolean g(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d7203bef", new Object[]{aURABottomSheetBehavior})).booleanValue() : aURABottomSheetBehavior.i;
    }

    public static /* synthetic */ int h(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8f0ca95f", new Object[]{aURABottomSheetBehavior})).intValue() : aURABottomSheetBehavior.q;
    }

    public static /* synthetic */ boolean i(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46f916f1", new Object[]{aURABottomSheetBehavior})).booleanValue() : aURABottomSheetBehavior.l;
    }

    public static /* synthetic */ ViewDragHelper j(AURABottomSheetBehavior aURABottomSheetBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewDragHelper) ipChange.ipc$dispatch("c61f2596", new Object[]{aURABottomSheetBehavior}) : aURABottomSheetBehavior.m;
    }

    /* loaded from: classes2.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-467174521);
        }

        public abstract void a(View view, float f);

        public abstract void a(View view, int i);

        public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2d2b886e", new Object[]{this, coordinatorLayout, view, view2, new Integer(i)})).booleanValue();
            }
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("59011340", new Object[]{this, coordinatorLayout, view, view2, new Integer(i), new Integer(i2), iArr, new Integer(i3)})).booleanValue();
            }
            return false;
        }

        public int a(View view) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9501e35d", new Object[]{this, view})).intValue() : view.getHeight();
        }
    }

    public AURABottomSheetBehavior() {
        this.b = new int[2];
        this.j = true;
        this.k = true;
        this.f2862a = 4;
        this.B = new ViewDragHelper.Callback() { // from class: com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                View view2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i)})).booleanValue();
                }
                if (!AURABottomSheetBehavior.this.b() || AURABottomSheetBehavior.this.f2862a == 1 || AURABottomSheetBehavior.a(AURABottomSheetBehavior.this)) {
                    return false;
                }
                return (AURABottomSheetBehavior.this.f2862a != 3 || AURABottomSheetBehavior.b(AURABottomSheetBehavior.this) != i || (view2 = (View) AURABottomSheetBehavior.c(AURABottomSheetBehavior.this).get()) == null || !view2.canScrollVertically(-1)) && AURABottomSheetBehavior.d(AURABottomSheetBehavior.this) != null && AURABottomSheetBehavior.d(AURABottomSheetBehavior.this).get() == view;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                } else {
                    AURABottomSheetBehavior.this.d(i2);
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
                } else if (i != 1) {
                } else {
                    AURABottomSheetBehavior.this.c(1);
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                int f3;
                int i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
                    return;
                }
                if (f2 < 0.0f) {
                    if (AURABottomSheetBehavior.this.c()) {
                        f3 = AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                        i = 3;
                    } else {
                        f3 = AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                        i = 4;
                    }
                } else if (!AURABottomSheetBehavior.g(AURABottomSheetBehavior.this) || !AURABottomSheetBehavior.this.a(view, f2)) {
                    if (f2 == 0.0f) {
                        int top = view.getTop();
                        if (Math.abs(top - AURABottomSheetBehavior.e(AURABottomSheetBehavior.this)) < Math.abs(top - AURABottomSheetBehavior.f(AURABottomSheetBehavior.this))) {
                            f3 = AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                            i = 3;
                        } else {
                            f3 = AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                        }
                    } else {
                        f3 = AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                    }
                    i = 4;
                } else {
                    f3 = AURABottomSheetBehavior.h(AURABottomSheetBehavior.this);
                    i = 5;
                }
                if (AURABottomSheetBehavior.this.c() && AURABottomSheetBehavior.i(AURABottomSheetBehavior.this) && 4 == i) {
                    f3 = AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                    i = 3;
                }
                if (AURABottomSheetBehavior.j(AURABottomSheetBehavior.this).settleCapturedViewAt(view.getLeft(), f3)) {
                    AURABottomSheetBehavior.this.c(2);
                    ViewCompat.postOnAnimation(view, new b(view, i));
                    return;
                }
                AURABottomSheetBehavior.this.c(i);
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("53c1297f", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
                }
                if (!AURABottomSheetBehavior.this.c() && i2 < 0) {
                    return view.getTop();
                }
                return MathUtils.clamp(i, AURABottomSheetBehavior.e(AURABottomSheetBehavior.this), AURABottomSheetBehavior.g(AURABottomSheetBehavior.this) ? AURABottomSheetBehavior.h(AURABottomSheetBehavior.this) : AURABottomSheetBehavior.f(AURABottomSheetBehavior.this));
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue() : view.getLeft();
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("896fc226", new Object[]{this, view})).intValue();
                }
                if (AURABottomSheetBehavior.this.c()) {
                    if (AURABottomSheetBehavior.g(AURABottomSheetBehavior.this)) {
                        return AURABottomSheetBehavior.h(AURABottomSheetBehavior.this) - AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                    }
                    return AURABottomSheetBehavior.f(AURABottomSheetBehavior.this) - AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                }
                return AURABottomSheetBehavior.h(AURABottomSheetBehavior.this) - AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
            }
        };
    }

    public AURABottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new int[2];
        this.j = true;
        this.k = true;
        this.f2862a = 4;
        this.B = new ViewDragHelper.Callback() { // from class: com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                View view2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i)})).booleanValue();
                }
                if (!AURABottomSheetBehavior.this.b() || AURABottomSheetBehavior.this.f2862a == 1 || AURABottomSheetBehavior.a(AURABottomSheetBehavior.this)) {
                    return false;
                }
                return (AURABottomSheetBehavior.this.f2862a != 3 || AURABottomSheetBehavior.b(AURABottomSheetBehavior.this) != i || (view2 = (View) AURABottomSheetBehavior.c(AURABottomSheetBehavior.this).get()) == null || !view2.canScrollVertically(-1)) && AURABottomSheetBehavior.d(AURABottomSheetBehavior.this) != null && AURABottomSheetBehavior.d(AURABottomSheetBehavior.this).get() == view;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                } else {
                    AURABottomSheetBehavior.this.d(i2);
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
                } else if (i != 1) {
                } else {
                    AURABottomSheetBehavior.this.c(1);
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                int f3;
                int i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
                    return;
                }
                if (f2 < 0.0f) {
                    if (AURABottomSheetBehavior.this.c()) {
                        f3 = AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                        i = 3;
                    } else {
                        f3 = AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                        i = 4;
                    }
                } else if (!AURABottomSheetBehavior.g(AURABottomSheetBehavior.this) || !AURABottomSheetBehavior.this.a(view, f2)) {
                    if (f2 == 0.0f) {
                        int top = view.getTop();
                        if (Math.abs(top - AURABottomSheetBehavior.e(AURABottomSheetBehavior.this)) < Math.abs(top - AURABottomSheetBehavior.f(AURABottomSheetBehavior.this))) {
                            f3 = AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                            i = 3;
                        } else {
                            f3 = AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                        }
                    } else {
                        f3 = AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
                    }
                    i = 4;
                } else {
                    f3 = AURABottomSheetBehavior.h(AURABottomSheetBehavior.this);
                    i = 5;
                }
                if (AURABottomSheetBehavior.this.c() && AURABottomSheetBehavior.i(AURABottomSheetBehavior.this) && 4 == i) {
                    f3 = AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                    i = 3;
                }
                if (AURABottomSheetBehavior.j(AURABottomSheetBehavior.this).settleCapturedViewAt(view.getLeft(), f3)) {
                    AURABottomSheetBehavior.this.c(2);
                    ViewCompat.postOnAnimation(view, new b(view, i));
                    return;
                }
                AURABottomSheetBehavior.this.c(i);
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("53c1297f", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
                }
                if (!AURABottomSheetBehavior.this.c() && i2 < 0) {
                    return view.getTop();
                }
                return MathUtils.clamp(i, AURABottomSheetBehavior.e(AURABottomSheetBehavior.this), AURABottomSheetBehavior.g(AURABottomSheetBehavior.this) ? AURABottomSheetBehavior.h(AURABottomSheetBehavior.this) : AURABottomSheetBehavior.f(AURABottomSheetBehavior.this));
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue() : view.getLeft();
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("896fc226", new Object[]{this, view})).intValue();
                }
                if (AURABottomSheetBehavior.this.c()) {
                    if (AURABottomSheetBehavior.g(AURABottomSheetBehavior.this)) {
                        return AURABottomSheetBehavior.h(AURABottomSheetBehavior.this) - AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                    }
                    return AURABottomSheetBehavior.f(AURABottomSheetBehavior.this) - AURABottomSheetBehavior.e(AURABottomSheetBehavior.this);
                }
                return AURABottomSheetBehavior.h(AURABottomSheetBehavior.this) - AURABottomSheetBehavior.f(AURABottomSheetBehavior.this);
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AURABottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_default_state);
        if (peekValue != null) {
            this.f2862a = peekValue.data;
        }
        if (obtainStyledAttributes.peekValue(R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_peekHeightPercent) == null) {
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_peekHeight);
            if (peekValue2 != null && peekValue2.data == -1) {
                a(peekValue2.data);
            } else {
                a(obtainStyledAttributes.getDimensionPixelSize(R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_peekHeight, -1));
            }
        } else {
            a((int) (bay.c() * obtainStyledAttributes.getFloat(R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_peekHeightPercent, 0.5f)));
        }
        a(obtainStyledAttributes.getBoolean(R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_hideable, false));
        b(obtainStyledAttributes.getBoolean(R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_draggable, true));
        d(obtainStyledAttributes.getBoolean(R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_expandable, true));
        c(obtainStyledAttributes.getBoolean(R.styleable.AURABottomSheetBehavior_Layout_aura_bottom_sheet_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Parcelable) ipChange.ipc$dispatch("5df1ce7b", new Object[]{this, coordinatorLayout, v}) : new SavedState(super.onSaveInstanceState(coordinatorLayout, v), this.f2862a);
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5c208e", new Object[]{this, coordinatorLayout, v, parcelable});
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        if (savedState.state == 1 || savedState.state == 2) {
            this.f2862a = 4;
        } else {
            this.f2862a = savedState.state;
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75bc679c", new Object[]{this, coordinatorLayout, v, new Integer(i)})).booleanValue();
        }
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            ViewCompat.setFitsSystemWindows(v, true);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.q = coordinatorLayout.getHeight();
        if (this.e) {
            if (this.f == 0) {
                this.f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.aura_bottom_sheet_behavior_peek_height_min);
            }
            i2 = (int) Math.max(this.f, this.q - (coordinatorLayout.getHeight() * 0.5f));
        } else {
            i2 = this.d;
        }
        a aVar = this.t;
        this.g = Math.max(0, this.q - (aVar != null ? aVar.a(v) : v.getHeight()));
        this.h = Math.max(this.q - i2, this.g);
        int i3 = this.f2862a;
        if (i3 == 3) {
            ViewCompat.offsetTopAndBottom(v, this.g);
        } else if (this.i && i3 == 5) {
            ViewCompat.offsetTopAndBottom(v, this.q);
        } else {
            int i4 = this.f2862a;
            if (i4 == 4) {
                ViewCompat.offsetTopAndBottom(v, this.h);
            } else if (i4 == 1 || i4 == 2) {
                ViewCompat.offsetTopAndBottom(v, top - v.getTop());
            }
        }
        if (this.m == null) {
            this.m = ViewDragHelper.create(coordinatorLayout, this.B);
        }
        this.r = new WeakReference<>(v);
        this.s = new WeakReference<>(a(v));
        return true;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edd2f44f", new Object[]{this, coordinatorLayout, v, motionEvent})).booleanValue();
        }
        if (!b()) {
            return false;
        }
        if (!v.isShown()) {
            this.n = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            e();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        this.A = motionEvent.getRawY();
        if (actionMasked == 0) {
            this.y = motionEvent.getRawX();
            this.z = motionEvent.getRawY();
            int x = (int) motionEvent.getX();
            this.w = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.s;
            View view = weakReference != null ? weakReference.get() : null;
            if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.w)) {
                this.v = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.x = true;
            }
            this.n = this.v == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.w);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.x = false;
            this.v = -1;
            if (this.n) {
                this.n = false;
                return false;
            }
        }
        if (!this.n && this.m.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        View view2 = this.s.get();
        return actionMasked == 2 && view2 != null && !this.n && this.f2862a != 1 && !coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.w) - motionEvent.getY()) > ((float) this.m.getTouchSlop());
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e34a5a8b", new Object[]{this, coordinatorLayout, v, motionEvent})).booleanValue();
        }
        if (!b() || !v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2862a == 1 && actionMasked == 0) {
            return true;
        }
        this.m.processTouchEvent(motionEvent);
        if (actionMasked == 0) {
            this.y = motionEvent.getRawX();
            this.z = motionEvent.getRawY();
            e();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (actionMasked == 2 && !this.n && Math.abs(this.w - motionEvent.getY()) > this.m.getTouchSlop()) {
            this.m.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.n;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39b7f443", new Object[]{this, coordinatorLayout, v, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!b()) {
            return false;
        }
        this.o = 0;
        this.p = false;
        return (i & 2) != 0 && !c(view2);
    }

    private boolean c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d05012c", new Object[]{this, view})).booleanValue();
        }
        View findFocus = view.findFocus();
        if (!(findFocus instanceof EditText)) {
            return false;
        }
        return a(findFocus, (int) this.y, (int) this.z);
    }

    private boolean a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c25114e", new Object[]{this, view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        view.getLocationOnScreen(this.b);
        int[] iArr = this.b;
        int i3 = iArr[0];
        int i4 = iArr[1];
        return i2 >= i4 && i2 <= view.getMeasuredHeight() + i4 && i >= i3 && i <= view.getMeasuredWidth() + i3;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f661b15", new Object[]{this, coordinatorLayout, v, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
            return;
        }
        super.onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr, i3);
        a aVar = this.t;
        if ((aVar != null && aVar.a(coordinatorLayout, v, view, i, i2, iArr, i3)) || Math.abs(i2) < Math.abs(i) || view != (view2 = this.s.get())) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (!c() && i2 > 0 && i4 <= this.h) {
            return;
        }
        if (i2 > 0) {
            int i5 = this.g;
            if (i4 < i5) {
                iArr[1] = top - i5;
                ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                c(3);
            } else {
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(v, -i2);
                c(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            if (1 == i3) {
                return;
            }
            int i6 = this.h;
            if (i4 <= i6 || this.i) {
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(v, -i2);
                c(1);
            } else {
                iArr[1] = top - i6;
                ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                c(4);
            }
        }
        d(v.getTop());
        this.o = i2;
        this.p = true;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i3 = 5;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326ba5ce", new Object[]{this, coordinatorLayout, v, view, new Integer(i)});
            return;
        }
        super.onStopNestedScroll(coordinatorLayout, v, view, i);
        a aVar = this.t;
        if ((aVar != null && aVar.a(coordinatorLayout, v, view, i)) || c(view)) {
            return;
        }
        if (v.getTop() == this.g) {
            c(3);
            return;
        }
        WeakReference<View> weakReference = this.s;
        if (weakReference == null || view != weakReference.get() || !this.p) {
            return;
        }
        int i4 = this.o;
        if (i4 <= 0) {
            if (i4 == 0) {
                int top = v.getTop();
                if (Math.abs(top - this.g) < Math.abs(top - this.h)) {
                    i2 = this.g;
                    i3 = 3;
                } else {
                    i2 = this.h;
                }
            } else if (this.i && a(v, f())) {
                i2 = this.q;
            } else {
                i2 = this.h;
            }
            i3 = 4;
        } else if (c()) {
            i2 = this.g;
            i3 = 3;
        } else {
            i2 = this.h;
            i3 = 4;
        }
        if (v.getHeight() <= a()) {
            z = false;
        }
        if (c() && this.l && 4 == i3 && z) {
            i2 = this.g;
            i3 = 3;
        }
        if (this.m.smoothSlideViewTo(v, v.getLeft(), i2)) {
            c(2);
            ViewCompat.postOnAnimation(v, new b(v, i3));
        } else {
            c(i3);
        }
        this.p = false;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1d3904f", new Object[]{this, coordinatorLayout, v, view, new Float(f), new Float(f2)})).booleanValue() : view == this.s.get() && (this.f2862a != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2));
    }

    public final void a(int i) {
        WeakReference<V> weakReference;
        V v;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == -1) {
            if (!this.e) {
                this.e = true;
            }
            z = false;
        } else {
            if (this.e || this.d != i) {
                this.e = false;
                this.d = Math.max(0, i);
                this.h = this.q - i;
            }
            z = false;
        }
        if (!z || this.f2862a != 4 || (weakReference = this.r) == null || (v = weakReference.get()) == null) {
            return;
        }
        v.requestLayout();
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        if (!this.e) {
            return this.d;
        }
        return -1;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.k;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.j;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ab7dc8", new Object[]{this, aVar});
        } else {
            this.t = aVar;
        }
    }

    public final void b(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (i == this.f2862a) {
        } else {
            WeakReference<V> weakReference = this.r;
            if (weakReference == null) {
                if (i != 4 && i != 3 && (!this.i || i != 5)) {
                    return;
                }
                this.f2862a = i;
                return;
            }
            final V v = weakReference.get();
            if (v == null) {
                return;
            }
            ViewParent parent = v.getParent();
            if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v)) {
                v.post(new Runnable() { // from class: com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AURABottomSheetBehavior.this.a(v, i);
                        }
                    }
                });
            } else {
                a((View) v, i);
            }
        }
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f2862a;
    }

    public void c(int i) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (this.f2862a == i) {
        } else {
            this.f2862a = i;
            V v = this.r.get();
            if (v == null || (aVar = this.t) == null) {
                return;
            }
            aVar.a((View) v, i);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.v = -1;
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
        this.u = null;
    }

    public boolean a(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3af19a", new Object[]{this, view, new Float(f)})).booleanValue();
        }
        if (f >= 6000.0f) {
            return true;
        }
        float abs = Math.abs(this.A - this.z);
        int a2 = a();
        return view.getHeight() > a2 ? abs / ((float) (a2 + this.h)) > 0.3f : abs / ((float) a2) > 0.3f;
    }

    public View a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{this, view});
        }
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View a2 = a(viewGroup.getChildAt(i));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    private float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue();
        }
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.c);
        return this.u.getYVelocity(this.v);
    }

    public void a(View view, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
            return;
        }
        if (i == 4) {
            i2 = this.h;
        } else if (i == 3) {
            i2 = this.g;
        } else if (this.i && i == 5) {
            i2 = this.q;
        } else {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        }
        if (this.m.smoothSlideViewTo(view, view.getLeft(), i2)) {
            c(2);
            ViewCompat.postOnAnimation(view, new b(view, i));
            return;
        }
        c(i);
    }

    public void d(int i) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        V v = this.r.get();
        if (v == null || (aVar = this.t) == null) {
            return;
        }
        int i2 = this.h;
        if (i > i2) {
            aVar.a(v, (i2 - i) / (this.q - i2));
        } else {
            aVar.a(v, (i2 - i) / (i2 - this.g));
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final View b;
        private final int c;

        static {
            kge.a(1989481370);
            kge.a(-1390502639);
        }

        public b(View view, int i) {
            this.b = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AURABottomSheetBehavior.j(AURABottomSheetBehavior.this) != null && AURABottomSheetBehavior.j(AURABottomSheetBehavior.this).continueSettling(true)) {
                ViewCompat.postOnAnimation(this.b, this);
            } else {
                AURABottomSheetBehavior.this.c(this.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR;
        final int state;

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }

        @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }

        static {
            kge.a(1191084380);
            CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.SavedState.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Object createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
                }

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior$SavedState] */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("fcd477bf", new Object[]{this, parcel, classLoader}) : a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Object[] newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
                }

                public SavedState a(Parcel parcel, ClassLoader classLoader) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState) ipChange.ipc$dispatch("50968da", new Object[]{this, parcel, classLoader}) : new SavedState(parcel, classLoader);
                }

                public SavedState a(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState) ipChange.ipc$dispatch("d0919d1a", new Object[]{this, parcel}) : new SavedState(parcel, (ClassLoader) null);
                }

                public SavedState[] a(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState[]) ipChange.ipc$dispatch("dd1e6c0b", new Object[]{this, new Integer(i)}) : new SavedState[i];
                }
            };
        }
    }

    public static <V extends View> AURABottomSheetBehavior<V> b(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURABottomSheetBehavior) ipChange.ipc$dispatch("4d4c496a", new Object[]{v});
        }
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.b)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior b2 = ((CoordinatorLayout.b) layoutParams).b();
        if (!(b2 instanceof AURABottomSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with NUTFloatDraggableBehavior");
        }
        return (AURABottomSheetBehavior) b2;
    }
}
