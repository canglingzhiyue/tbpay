package com.alibaba.triver.triver_shop.newShop.ext;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;
import tb.ruk;
import tb.rvm;

/* loaded from: classes3.dex */
public final class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static final class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3866a;
        public final /* synthetic */ ruk<t> b;

        public a(View view, ruk<t> rukVar) {
            this.f3866a = view;
            this.b = rukVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Object m2371constructorimpl;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            ruk<t> rukVar = this.b;
            try {
                Result.a aVar = Result.Companion;
                rukVar.mo2427invoke();
                m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
            }
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            if (m2374exceptionOrNullimpl != null) {
                ceg.Companion.a(m2374exceptionOrNullimpl);
            }
            this.f3866a.removeOnLayoutChangeListener(this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3867a;

        public b(int i) {
            this.f3867a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else if (view == null || outline == null) {
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f3867a);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3868a;
        public final /* synthetic */ int b;

        public c(View view, int i) {
            this.f3868a = view;
            this.b = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0) {
            } else {
                Path path = new Path();
                int i = this.b;
                float width = view.getWidth();
                float height = view.getHeight();
                float f = i * 2;
                path.moveTo(0.0f, 0.0f);
                float f2 = width - f;
                path.lineTo(f2, 0.0f);
                path.arcTo(f2, 0.0f, width, f, -90.0f, 90.0f, false);
                path.lineTo(width, height);
                path.lineTo(0.0f, height);
                path.close();
                if (path.isConvex()) {
                    if (outline == null) {
                        return;
                    }
                    outline.setConvexPath(path);
                } else if (outline == null) {
                } else {
                    outline.setRect(0, 0, this.f3868a.getWidth(), this.f3868a.getHeight());
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3869a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public d(View view, int i, int i2, int i3, int i4) {
            this.f3869a = view;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0) {
            } else {
                Path path = new Path();
                int i = this.b;
                int i2 = this.c;
                int i3 = this.d;
                int i4 = this.e;
                float width = view.getWidth();
                float height = view.getHeight();
                float f = 2;
                float f2 = i * f;
                float f3 = i2 * f;
                float f4 = i3 * f;
                float f5 = f * i4;
                path.moveTo(0.0f, f2);
                path.arcTo(0.0f, 0.0f, f2, f2, 180.0f, 90.0f, false);
                float f6 = width - f3;
                path.lineTo(f6, 0.0f);
                path.arcTo(f6, 0.0f, width, f3, -90.0f, 90.0f, false);
                float f7 = height - f5;
                path.lineTo(width, f7);
                path.arcTo(width - f5, f7, width, height, 0.0f, 90.0f, false);
                path.lineTo(f4, height);
                path.arcTo(0.0f, height - f4, f4, height, 90.0f, 90.0f, false);
                path.close();
                if (path.isConvex()) {
                    if (outline == null) {
                        return;
                    }
                    outline.setConvexPath(path);
                } else if (outline == null) {
                } else {
                    outline.setRect(0, 0, this.f3869a.getWidth(), this.f3869a.getHeight());
                }
            }
        }
    }

    static {
        kge.a(-1880165962);
    }

    public static final int a(int i, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c114778", new Object[]{new Integer(i), new Float(f)})).intValue() : i | (((int) (255 * f)) << 24);
    }

    public static final ViewGroup.LayoutParams a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("315589f7", new Object[]{view});
        }
        q.d(view, "<this>");
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static final ViewGroup.LayoutParams m(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("7983126b", new Object[]{view});
        }
        q.d(view, "<this>");
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public static /* synthetic */ FrameLayout.LayoutParams a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("52446b0d", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), obj});
        }
        if ((i8 & 1) != 0) {
            i = -1;
        }
        if ((i8 & 2) != 0) {
            i2 = -1;
        }
        if ((i8 & 4) != 0) {
            i3 = 0;
        }
        if ((i8 & 8) != 0) {
            i4 = 0;
        }
        if ((i8 & 16) != 0) {
            i5 = 0;
        }
        if ((i8 & 32) != 0) {
            i6 = 0;
        }
        if ((i8 & 64) != 0) {
            i7 = 0;
        }
        return a(i, i2, i3, i4, i5, i6, i7);
    }

    public static final FrameLayout.LayoutParams a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("b8bcf8c4", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2, i7);
        layoutParams.bottomMargin = i4;
        layoutParams.topMargin = i3;
        layoutParams.leftMargin = i5;
        layoutParams.rightMargin = i6;
        return layoutParams;
    }

    public static /* synthetic */ LinearLayout.LayoutParams a(int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("434759d4", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), obj});
        }
        if ((i7 & 1) != 0) {
            i = -1;
        }
        return a(i, (i7 & 2) != 0 ? -2 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6);
    }

    public static final LinearLayout.LayoutParams a(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("9c095903", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i2);
        layoutParams.bottomMargin = i4;
        layoutParams.topMargin = i3;
        layoutParams.leftMargin = i5;
        layoutParams.rightMargin = i6;
        return layoutParams;
    }

    public static /* synthetic */ FrameLayout.LayoutParams b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("35701e4e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), obj});
        }
        if ((i8 & 1) != 0) {
            i = -1;
        }
        if ((i8 & 2) != 0) {
            i2 = -1;
        }
        if ((i8 & 4) != 0) {
            i3 = 0;
        }
        if ((i8 & 8) != 0) {
            i4 = 0;
        }
        if ((i8 & 16) != 0) {
            i5 = 0;
        }
        if ((i8 & 32) != 0) {
            i6 = 0;
        }
        if ((i8 & 64) != 0) {
            i7 = 0;
        }
        return b(i, i2, i3, i4, i5, i6, i7);
    }

    public static final FrameLayout.LayoutParams b(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("e6959323", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2, i7);
        layoutParams.bottomMargin = i4;
        layoutParams.topMargin = i3;
        layoutParams.leftMargin = i5;
        layoutParams.rightMargin = i6;
        return layoutParams;
    }

    public static final void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{view});
            return;
        }
        q.d(view, "<this>");
        view.setVisibility(0);
    }

    public static final void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{view});
            return;
        }
        q.d(view, "<this>");
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    public static final void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89069007", new Object[]{view});
            return;
        }
        q.d(view, "<this>");
        view.setVisibility(4);
    }

    public static final void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85081ee6", new Object[]{view});
            return;
        }
        q.d(view, "<this>");
        view.setVisibility(8);
    }

    public static final boolean f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8109adc9", new Object[]{view})).booleanValue();
        }
        q.d(view, "<this>");
        return view.getVisibility() == 0;
    }

    public static final void a(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39d30cb", new Object[]{viewGroup, view});
            return;
        }
        q.d(viewGroup, "<this>");
        q.d(view, "view");
        viewGroup.addView(view, a(view));
    }

    public static final void b(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d67d2aa", new Object[]{viewGroup, view});
            return;
        }
        q.d(viewGroup, "<this>");
        q.d(view, "view");
        viewGroup.addView(view, m(view));
    }

    public static final void g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0b3ca4", new Object[]{view});
            return;
        }
        q.d(view, "<this>");
        view.setBackgroundColor(0);
    }

    public static final void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{view, new Integer(i)});
            return;
        }
        q.d(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static final void b(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6b49da", new Object[]{view, new Integer(i)});
            return;
        }
        q.d(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    public static final void b(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfe6469", new Object[]{view, new Integer(i), new Integer(i2)});
            return;
        }
        q.d(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static final void a(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7b0fa7", new Object[]{textView, new Integer(i)});
            return;
        }
        q.d(textView, "<this>");
        textView.setTextSize(0, i);
    }

    public static final void c(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("139b96db", new Object[]{view, new Integer(i)});
            return;
        }
        q.d(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
        view.setLayoutParams(layoutParams);
    }

    public static final int h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("790ccb76", new Object[]{view})).intValue();
        }
        q.d(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
    }

    public static final void d(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cbe3dc", new Object[]{view, new Integer(i)});
            return;
        }
        q.d(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i;
        view.setLayoutParams(layoutParams);
    }

    public static final int i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("750e5a55", new Object[]{view})).intValue();
        }
        q.d(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    public static final void e(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bfc30dd", new Object[]{view, new Integer(i)});
            return;
        }
        q.d(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(i);
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
        view.setLayoutParams(layoutParams);
    }

    public static final void f(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02c7dde", new Object[]{view, new Integer(i)});
            return;
        }
        q.d(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(i);
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i;
        view.setLayoutParams(layoutParams);
    }

    public static final void g(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245ccadf", new Object[]{view, new Integer(i)});
            return;
        }
        q.d(view, "<this>");
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final void i(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbd64e1", new Object[]{view, new Integer(i)});
            return;
        }
        q.d(view, "<this>");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static final void a(View... view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867a3085", new Object[]{view});
            return;
        }
        q.d(view, "view");
        int length = view.length;
        while (i < length) {
            View view2 = view[i];
            i++;
            if (view2 != null) {
                g(view2);
            }
        }
    }

    public static final void j(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710fe941", new Object[]{view});
            return;
        }
        q.d(view, "<this>");
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).removeView(view);
    }

    public static final void k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d117820", new Object[]{view});
            return;
        }
        q.d(view, "<this>");
        view.setLayoutParams(a(view));
    }

    public static final boolean a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c25114e", new Object[]{view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        q.d(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        return i2 <= view.getMeasuredHeight() + i4 && i2 >= i4 && i <= view.getMeasuredWidth() + i3 && i >= i3;
    }

    public static final void a(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b9198e", new Object[]{view, drawable});
            return;
        }
        q.d(view, "<this>");
        if (drawable == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static final void a(View view, ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20771c52", new Object[]{view, rukVar});
            return;
        }
        q.d(view, "<this>");
        if (rukVar == null) {
            return;
        }
        view.addOnLayoutChangeListener(new a(view, rukVar));
    }

    public static final void b(View view, ruk<t> rukVar) {
        Window window;
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a75c31", new Object[]{view, rukVar});
            return;
        }
        q.d(view, "<this>");
        if (rukVar == null) {
            return;
        }
        Context context = view.getContext();
        if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        a(decorView, rukVar);
    }

    public static final int a(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("614665ed", new Object[]{number})).intValue();
        }
        q.d(number, "<this>");
        return (int) ((number.floatValue() * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static final int b(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab77ff2e", new Object[]{number})).intValue();
        }
        q.d(number, "<this>");
        return (int) ((number.floatValue() / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static final int c(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5a9986f", new Object[]{number})).intValue();
        }
        q.d(number, "<this>");
        if (com.alibaba.triver.triver_shop.f.INSTANCE.a()) {
            return (int) ((Resources.getSystem().getDisplayMetrics().widthPixels / 750.0f) * number.floatValue());
        }
        return a(Float.valueOf(number.floatValue() / 2));
    }

    public static final int d(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fdb31b0", new Object[]{number})).intValue();
        }
        q.d(number, "<this>");
        return c(number);
    }

    public static final int e(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a0ccaf1", new Object[]{number})).intValue();
        }
        q.d(number, "<this>");
        if (com.alibaba.triver.triver_shop.f.INSTANCE.a()) {
            return rvm.a((Resources.getSystem().getDisplayMetrics().widthPixels / 750.0f) * number.floatValue());
        }
        return a(Float.valueOf(number.floatValue() / 2));
    }

    public static final int f(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d43e6432", new Object[]{number})).intValue();
        }
        q.d(number, "<this>");
        if (com.alibaba.triver.triver_shop.f.INSTANCE.a()) {
            return (int) (number.floatValue() / (Resources.getSystem().getDisplayMetrics().widthPixels / 750.0f));
        }
        return b(Float.valueOf(number.floatValue() * 2));
    }

    public static final int g(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e6ffd73", new Object[]{number})).intValue();
        }
        q.d(number, "<this>");
        return c(Float.valueOf(number.floatValue() * 2));
    }

    public static final int h(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a196b4", new Object[]{number})).intValue();
        }
        q.d(number, "<this>");
        return f(Float.valueOf(number.floatValue() / 2));
    }

    public static final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static final int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        q.d(context, "<this>");
        int identifier = context.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return context.getApplicationContext().getResources().getDimensionPixelSize(identifier);
    }

    public static final View a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a97f025", new Object[]{context, new Integer(i)});
        }
        q.d(context, "<this>");
        return LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }

    public static final RecyclerView l(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("c952e0e5", new Object[]{view});
        }
        q.d(view, "<this>");
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RecyclerView) {
                return (RecyclerView) parent;
            }
        }
        return null;
    }

    public static final void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        q.d(context, "<this>");
        try {
            Result.a aVar = Result.Companion;
            Object systemService = context.getApplicationContext().getSystemService("vibrator");
            t tVar = null;
            Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
            if (vibrator != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    vibrator.vibrate(VibrationEffect.createPredefined(0));
                } else {
                    vibrator.vibrate(10L);
                }
                tVar = t.INSTANCE;
            }
            Result.m2371constructorimpl(tVar);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }

    public static final void a(View view, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2ccb99", new Object[]{view, new Boolean(z), new Integer(i)});
            return;
        }
        q.d(view, "<this>");
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (z) {
            view.setOutlineProvider(new b(i));
            view.setClipToOutline(true);
            return;
        }
        view.setOutlineProvider(null);
        view.setClipToOutline(false);
    }

    public static final void h(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88d17e0", new Object[]{view, new Integer(i)});
            return;
        }
        q.d(view, "<this>");
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (i > 0) {
            view.setOutlineProvider(new c(view, i));
            view.setClipToOutline(true);
            return;
        }
        view.setOutlineProvider(null);
        view.setClipToOutline(false);
    }

    public static /* synthetic */ void a(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7a4cb5", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), obj});
            return;
        }
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        a(view, i, i2, i3, i4);
    }

    public static final void a(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e734472a", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        q.d(view, "<this>");
        view.setOutlineProvider(new d(view, i, i2, i3, i4));
        view.setClipToOutline(true);
    }

    public static final boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{motionEvent})).booleanValue() : motionEvent != null && motionEvent.getAction() == 0;
    }

    public static final boolean b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{motionEvent})).booleanValue() : motionEvent != null && motionEvent.getAction() == 1;
    }

    public static final boolean c(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("89094503", new Object[]{motionEvent})).booleanValue() : motionEvent != null && motionEvent.getAction() == 3;
    }

    public static final boolean d(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9df20d44", new Object[]{motionEvent})).booleanValue() : motionEvent != null && motionEvent.getAction() == 2;
    }

    public static /* synthetic */ Drawable a(int i, GradientDrawable.Orientation orientation, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("b40e04d", new Object[]{new Integer(i), orientation, iArr, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), obj});
        }
        if ((i9 & 1) != 0) {
            i = 0;
        }
        if ((i9 & 2) != 0) {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        }
        if ((i9 & 4) != 0) {
            iArr = null;
        }
        if ((i9 & 8) != 0) {
            i2 = 0;
        }
        if ((i9 & 16) != 0) {
            i3 = 0;
        }
        if ((i9 & 32) != 0) {
            i4 = 0;
        }
        if ((i9 & 64) != 0) {
            i5 = 0;
        }
        if ((i9 & 128) != 0) {
            i6 = 0;
        }
        if ((i9 & 256) != 0) {
            i7 = 0;
        }
        if ((i9 & 512) != 0) {
            i8 = 0;
        }
        return a(i, orientation, iArr, i2, i3, i4, i5, i6, i7, i8);
    }

    public static final Drawable a(int i, GradientDrawable.Orientation orientation, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("738bc3e8", new Object[]{new Integer(i), orientation, iArr, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        }
        q.d(orientation, "orientation");
        GradientDrawable gradientDrawable = i != 0 ? new GradientDrawable() : new GradientDrawable(orientation, iArr);
        gradientDrawable.setShape(0);
        if (i != 0) {
            gradientDrawable.setColor(i);
        }
        if (i2 > 0) {
            gradientDrawable.setCornerRadius(i2);
        } else {
            float f = i3;
            float f2 = i4;
            float f3 = i6;
            float f4 = i5;
            gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
        }
        if (i7 > 0) {
            gradientDrawable.setStroke(i7, i8);
        }
        return gradientDrawable;
    }

    public static final void a(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af386b6c", new Object[]{imageView, str});
            return;
        }
        q.d(imageView, "<this>");
        if (str == null) {
            return;
        }
        com.taobao.phenix.intf.b.h().a(str).into(imageView);
    }
}
