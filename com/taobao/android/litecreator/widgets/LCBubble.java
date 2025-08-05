package com.taobao.android.litecreator.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.util.k;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.ap;
import com.taobao.android.litecreator.util.u;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class LCBubble {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f13517a;
    private FrameLayout b;
    private View c;
    private boolean d;
    private Animator e;
    private boolean f;
    private c g;
    private Context h;
    private Handler i;
    private Runnable j;
    private a k;
    private View.OnClickListener l;
    private List<d> m;

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes5.dex */
    public @interface Priority {
        public static final int HIGH = 100;
        public static final int LOW = 300;
        public static final int MID = 200;
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes5.dex */
    public @interface Type {
        public static final int Bottom = 0;
        public static final int Right = 1;
        public static final int Top = 2;
    }

    /* loaded from: classes5.dex */
    public interface a {
        ObjectAnimator a(View view);
    }

    /* loaded from: classes5.dex */
    public interface c {
        boolean a();
    }

    /* loaded from: classes5.dex */
    public interface d {
        void a(LCBubble lCBubble);

        void b(LCBubble lCBubble);

        void c(LCBubble lCBubble);
    }

    static {
        kge.a(-2123694393);
    }

    public static /* synthetic */ Animator a(LCBubble lCBubble, Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("dd91b44", new Object[]{lCBubble, animator});
        }
        lCBubble.e = animator;
        return animator;
    }

    public static /* synthetic */ List a(LCBubble lCBubble) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4fb5f9d5", new Object[]{lCBubble}) : lCBubble.m;
    }

    public static /* synthetic */ boolean a(LCBubble lCBubble, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca2b0ae6", new Object[]{lCBubble, new Boolean(z)})).booleanValue();
        }
        lCBubble.f = z;
        return z;
    }

    public static /* synthetic */ View.OnClickListener b(LCBubble lCBubble) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("97db2bfa", new Object[]{lCBubble}) : lCBubble.l;
    }

    public static /* synthetic */ View c(LCBubble lCBubble) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("21df07b2", new Object[]{lCBubble}) : lCBubble.c;
    }

    public static /* synthetic */ FrameLayout d(LCBubble lCBubble) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("f6bf4d6a", new Object[]{lCBubble}) : lCBubble.b;
    }

    public static /* synthetic */ FrameLayout e(LCBubble lCBubble) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("d738a36b", new Object[]{lCBubble}) : lCBubble.f13517a;
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public View d;
        public Point e;
        public View f;
        public int g;
        public long h;
        public int i;
        public int j;

        /* renamed from: a  reason: collision with root package name */
        public int f13525a = -1;
        public int b = 0;
        public int c = 300;
        public int k = 15;
        public boolean l = false;
        public boolean m = true;
        public boolean n = true;
        public boolean o = false;

        static {
            kge.a(115992543);
        }

        public b a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("23e9f867", new Object[]{this, new Integer(i)});
            }
            this.f13525a = i;
            return this;
        }

        public b b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("25204b46", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public b c(@Type int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("26569e25", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public b a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a4759676", new Object[]{this, view});
            }
            this.d = view;
            return this;
        }

        public b a(Point point) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6ec562d7", new Object[]{this, point});
            }
            this.e = point;
            return this;
        }

        public b b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bee68f95", new Object[]{this, view});
            }
            this.f = view;
            return this;
        }

        public b d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("278cf104", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public b a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b124a9e8", new Object[]{this, new Long(j)});
            }
            this.h = j;
            return this;
        }

        public b e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("28c343e3", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }

        public b a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("84cfc1f8", new Object[]{this, new Boolean(z)});
            }
            this.l = z;
            return this;
        }

        public b b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("860614d7", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }

        public b f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("29f996c2", new Object[]{this, new Integer(i)});
            }
            this.j = i;
            return this;
        }

        public b c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("873c67b6", new Object[]{this, new Boolean(z)});
            }
            this.n = z;
            return this;
        }

        public b d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8872ba95", new Object[]{this, new Boolean(z)});
            }
            this.o = z;
            return this;
        }

        public b g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2b2fe9a1", new Object[]{this, new Integer(i)});
            }
            this.k = i;
            return this;
        }
    }

    public LCBubble(Context context) {
        this.e = null;
        this.i = new Handler(Looper.getMainLooper());
        this.j = new Runnable() { // from class: com.taobao.android.litecreator.widgets.LCBubble.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Iterator it = LCBubble.a(LCBubble.this).iterator();
                while (it.hasNext()) {
                    it.next();
                }
                LCBubble.this.a();
            }
        };
        this.k = new a() { // from class: com.taobao.android.litecreator.widgets.LCBubble.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.widgets.LCBubble.a
            public ObjectAnimator a(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ObjectAnimator) ipChange.ipc$dispatch("706a320a", new Object[]{this, view});
                }
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
                ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
                ofPropertyValuesHolder.setDuration(300L);
                return ofPropertyValuesHolder;
            }
        };
        this.m = new ArrayList();
        this.h = context;
        View findViewById = ((Activity) context).findViewById(16908290);
        if (findViewById instanceof FrameLayout) {
            this.f13517a = (FrameLayout) findViewById;
        }
    }

    public LCBubble(Context context, c cVar) {
        this(context);
        this.g = cVar;
    }

    public void a(b bVar) {
        c cVar;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f61634", new Object[]{this, bVar});
        } else if (this.d || (((cVar = this.g) != null && cVar.a()) || this.f13517a == null || bVar == null || (bVar.d == null && bVar.e == null))) {
            for (d dVar : this.m) {
                dVar.c(this);
            }
        } else {
            this.d = true;
            this.f = true;
            Context context = this.h;
            int i2 = bVar.b;
            if (i2 == 0) {
                i = R.layout.layout_bubble_common_container_bottom;
            } else if (i2 == 1) {
                i = R.layout.layout_bubble_common_container_right;
            } else if (i2 == 2) {
                i = R.layout.layout_bubble_common_container_top;
            } else {
                i = R.layout.layout_bubble_common_container_bottom;
            }
            try {
                this.c = LayoutInflater.from(context).inflate(i, (ViewGroup) this.f13517a, false);
            } catch (Throwable th) {
                u.d("LCBubble", Log.getStackTraceString(th));
            }
            View view = this.c;
            if (view == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.fl_bubble);
            if (bVar.l) {
                View findViewById = this.c.findViewById(R.id.ll_bubble);
                int a2 = android.taobao.windvane.util.c.a(12.0f);
                findViewById.setPadding(0, a2, a2, 0);
                View findViewById2 = this.c.findViewById(R.id.im_bubble_close);
                findViewById2.setVisibility(0);
                findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.litecreator.widgets.LCBubble.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else if (LCBubble.b(LCBubble.this) != null) {
                            LCBubble.b(LCBubble.this).onClick(view2);
                        } else {
                            LCBubble.this.a();
                        }
                    }
                });
            }
            if (!bVar.m) {
                this.c.findViewById(R.id.iv_triangle).setVisibility(4);
            }
            frameLayout.setMinimumHeight(android.taobao.windvane.util.c.a(bVar.g) << 1);
            frameLayout.addView(bVar.f, new FrameLayout.LayoutParams(-2, -2, 17));
            this.b = new FrameLayout(context);
            this.b.setClipChildren(false);
            this.b.addView(this.c, b(bVar));
            this.f13517a.setClipChildren(false);
            this.f13517a.addView(this.b, new FrameLayout.LayoutParams(-1, -1));
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.c, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
            ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder.setDuration(300L);
            ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.litecreator.widgets.LCBubble.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("84781bba", new Object[]{this, animator, new Boolean(z)});
                        return;
                    }
                    LCBubble.a(LCBubble.this, (Animator) null);
                    for (d dVar2 : LCBubble.a(LCBubble.this)) {
                        dVar2.a(LCBubble.this);
                    }
                }
            });
            ofPropertyValuesHolder.start();
            this.e = ofPropertyValuesHolder;
            if (bVar.n) {
                this.b.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.android.litecreator.widgets.LCBubble.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view2, MotionEvent motionEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view2, motionEvent})).booleanValue();
                        }
                        LCBubble.this.a();
                        return false;
                    }
                });
            }
            if (bVar.h <= 0 || bVar.h == Long.MAX_VALUE) {
                return;
            }
            this.i.postDelayed(this.j, bVar.h);
        }
    }

    private FrameLayout.LayoutParams b(b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("3efc5d5c", new Object[]{this, bVar});
        }
        this.c.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.c.getMeasuredHeight();
        int measuredWidth = this.c.getMeasuredWidth();
        int[] iArr = new int[2];
        if (bVar.d != null) {
            bVar.d.getLocationOnScreen(iArr);
            i2 = iArr[0];
            i = iArr[1];
            i3 = bVar.d.getWidth();
            i4 = bVar.d.getHeight();
        } else if (bVar.e != null) {
            int i7 = bVar.e.y - 1;
            i3 = 2;
            i4 = 2;
            i2 = bVar.e.x - 1;
            i = i7;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        ImageView imageView = (ImageView) this.c.findViewById(R.id.iv_triangle);
        imageView.setColorFilter(bVar.f13525a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        FrameLayout frameLayout = (FrameLayout) this.c.findViewById(R.id.fl_bubble);
        int a2 = k.a();
        boolean b2 = ap.b((Activity) this.h);
        if (bVar.b == 1) {
            int a3 = ((a2 - measuredWidth) - i3) + android.taobao.windvane.util.c.a(bVar.j);
            int d2 = ((i + (i4 / 2)) - (measuredHeight / 2)) - (b2 ? 0 : ap.d(this.h));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadii(new float[]{bVar.g, bVar.g, bVar.g, bVar.g, bVar.g, bVar.g, bVar.g, bVar.g});
            gradientDrawable.setColor(bVar.f13525a);
            frameLayout.setBackground(gradientDrawable);
            layoutParams.setMargins(a3, d2, 0, 0);
        } else if (bVar.b == 0) {
            int i8 = i2 + (i3 / 2);
            int max = Math.max(i8 - (measuredWidth / 2), android.taobao.windvane.util.c.a(bVar.k));
            int d3 = ((i - measuredHeight) - (b2 ? 0 : ap.d(this.h))) + android.taobao.windvane.util.c.a(bVar.i);
            int minimumHeight = frameLayout.getMinimumHeight() / 2;
            if (max + minimumHeight > i8 - android.taobao.windvane.util.c.a(8.0f)) {
                max = 0;
            }
            if (max + measuredWidth > a2) {
                max = Math.min(max, (a2 - measuredWidth) - android.taobao.windvane.util.c.a(bVar.k));
            }
            int a4 = (i8 - max) - android.taobao.windvane.util.c.a(8.0f);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams2.setMargins(a4, 0, 0, 0);
            imageView.setLayoutParams(layoutParams2);
            layoutParams.setMargins(max, d3, 0, 0);
            int min = Math.min(a4, minimumHeight);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            float f = minimumHeight;
            float f2 = min;
            gradientDrawable2.setCornerRadii(new float[]{f, f, f, f, f, f, f2, f2});
            gradientDrawable2.setColor(bVar.f13525a);
            frameLayout.setBackground(gradientDrawable2);
        } else if (bVar.b == 2) {
            int i9 = i2 + (i3 / 2);
            int max2 = Math.max(i9 - (measuredWidth / 2), android.taobao.windvane.util.c.a(15.0f));
            int d4 = ((i + i4) - (b2 ? 0 : ap.d(this.h))) + android.taobao.windvane.util.c.a(bVar.i);
            int minimumHeight2 = frameLayout.getMinimumHeight() / 2;
            int i10 = max2 + minimumHeight2;
            if (i10 > i9 - android.taobao.windvane.util.c.a(8.0f)) {
                i6 = i10 - (i9 - android.taobao.windvane.util.c.a(8.0f));
                i5 = 0;
            } else {
                i5 = max2;
                i6 = minimumHeight2;
            }
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            float f3 = i6;
            float f4 = minimumHeight2;
            gradientDrawable3.setCornerRadii(new float[]{f3, f3, f4, f4, f4, f4, f4, f4});
            gradientDrawable3.setColor(bVar.f13525a);
            frameLayout.setBackground(gradientDrawable3);
            if (i5 + measuredWidth > a2) {
                i5 = Math.min(i5, (a2 - measuredWidth) - android.taobao.windvane.util.c.a(15.0f));
            }
            int a5 = (i9 - i5) - android.taobao.windvane.util.c.a(8.0f);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams3.setMargins(a5, 0, 0, 0);
            imageView.setLayoutParams(layoutParams3);
            layoutParams.setMargins(i5, d4, 0, 0);
        }
        if (bVar.o) {
            layoutParams.setMargins((a2 - measuredWidth) / 2, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
        }
        return layoutParams;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.d) {
        } else {
            this.d = false;
            ObjectAnimator a2 = this.k.a(this.c);
            a2.start();
            this.e = a2;
            a2.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.litecreator.widgets.LCBubble.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                    if (str.hashCode() == -2145066406) {
                        super.onAnimationEnd((Animator) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    super.onAnimationEnd(animator);
                    LCBubble.a(LCBubble.this, (Animator) null);
                    LCBubble.a(LCBubble.this, false);
                    LCBubble.c(LCBubble.this).setVisibility(8);
                    for (d dVar : LCBubble.a(LCBubble.this)) {
                        dVar.b(LCBubble.this);
                    }
                    LCBubble.e(LCBubble.this).post(new Runnable() { // from class: com.taobao.android.litecreator.widgets.LCBubble.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                LCBubble.e(LCBubble.this).removeView(LCBubble.d(LCBubble.this));
                            }
                        }
                    });
                }
            });
            this.i.removeCallbacksAndMessages(null);
        }
    }

    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        } else {
            this.l = onClickListener;
        }
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f6fef2", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            this.m.add(dVar);
        }
    }
}
