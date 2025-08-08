package com.taobao.trtc.rtcroom;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.CardView;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.trtc.utils.TrtcLog;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ien;
import tb.kge;
import tb.pmb;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_FLOATING_WINDOW_BORDER_COLOR = -186032;
    public static final int DEFAULT_FLOATING_WINDOW_BORDER_MARGIN = 12;
    public static final int DEFAULT_FLOATING_WINDOW_BORDER_RADIUS = 0;
    public static final int DEFAULT_FLOATING_WINDOW_BORDER_WIDTH = 0;
    public static final int DEFAULT_FLOATING_WINDOW_CLOSE_ICON_DIAMETER = 18;
    public static final int DEFAULT_FLOATING_WINDOW_CLOSE_MARGIN = 6;
    public static final int DEFAULT_FLOATING_WINDOW_HEIGHT = 173;
    public static final int DEFAULT_FLOATING_WINDOW_WIDTH = 96;

    /* renamed from: a  reason: collision with root package name */
    public ImageView f23156a;
    private final c b;
    private final b c;
    private CardView d;
    private Activity e;
    private WindowManager.LayoutParams f;
    private int g;
    private int h;
    private int i;
    private float j;
    private float k;
    private float l;
    private float m;
    private AtomicBoolean n = new AtomicBoolean(false);
    private C0992a o;

    /* renamed from: com.taobao.trtc.rtcroom.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C0992a {

        /* renamed from: a  reason: collision with root package name */
        public int f23162a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public float h;
        public int i;
        public int j;

        static {
            kge.a(-2013246848);
        }
    }

    static {
        kge.a(1980620614);
    }

    public static /* synthetic */ float a(a aVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71f766d6", new Object[]{aVar, new Float(f)})).floatValue();
        }
        aVar.l = f;
        return f;
    }

    public static /* synthetic */ b a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ee6027ab", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ void a(a aVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf745fa", new Object[]{aVar, new Integer(i), new Integer(i2)});
        } else {
            aVar.a(i, i2);
        }
    }

    public static /* synthetic */ float b(a aVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efcf22d7", new Object[]{aVar, new Float(f)})).floatValue();
        }
        aVar.j = f;
        return f;
    }

    public static /* synthetic */ WindowManager.LayoutParams b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowManager.LayoutParams) ipChange.ipc$dispatch("48db0609", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ float c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("459a03c8", new Object[]{aVar})).floatValue() : aVar.j;
    }

    public static /* synthetic */ float c(a aVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6da6ded8", new Object[]{aVar, new Float(f)})).floatValue();
        }
        aVar.m = f;
        return f;
    }

    public static /* synthetic */ float d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cdca43a7", new Object[]{aVar})).floatValue() : aVar.k;
    }

    public static /* synthetic */ float d(a aVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb7e9ad9", new Object[]{aVar, new Float(f)})).floatValue();
        }
        aVar.k = f;
        return f;
    }

    public static /* synthetic */ Activity e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("856090d2", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ CardView f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CardView) ipChange.ipc$dispatch("9832277e", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ void g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665b0354", new Object[]{aVar});
        } else {
            aVar.b();
        }
    }

    public static /* synthetic */ float h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee8b4323", new Object[]{aVar})).floatValue() : aVar.l;
    }

    public static /* synthetic */ float i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("76bb8302", new Object[]{aVar})).floatValue() : aVar.m;
    }

    public static /* synthetic */ C0992a j(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0992a) ipChange.ipc$dispatch("d165086", new Object[]{aVar}) : aVar.o;
    }

    public a(Activity activity, c cVar, b bVar) {
        TrtcLog.b("FloatWindowController", "CTOR");
        this.b = cVar;
        this.c = bVar;
        this.e = activity;
    }

    public boolean a(C0992a c0992a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbbdddc1", new Object[]{this, c0992a})).booleanValue();
        }
        Activity activity = this.e;
        if (activity == null || this.b == null || this.c == null) {
            TrtcLog.a("FloatWindowController", "init failed: var error");
            return false;
        }
        this.o = c0992a;
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        this.h = displayMetrics.widthPixels;
        this.i = displayMetrics.heightPixels;
        this.g = c0992a.e;
        this.d = new CardView(this.e);
        if (c0992a.g > 0) {
            this.d.setCardBackgroundColor(c0992a.f);
            this.d.setContentPadding(c0992a.g, c0992a.g, c0992a.g, c0992a.g);
            this.d.setRadius(c0992a.h);
            this.d.setPreventCornerOverlap(true);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c0992a.f23162a, c0992a.b);
        layoutParams.gravity = 8388661;
        this.d.setLayoutParams(layoutParams);
        this.f23156a = new ImageView(this.e);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ien.DEFAULT_TINT_COLOR);
        gradientDrawable.setShape(1);
        this.f23156a.setBackground(gradientDrawable);
        this.f23156a.setImageResource(R.drawable.float_close);
        this.f23156a.setClickable(true);
        this.f23156a.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.trtc.rtcroom.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                com.taobao.trtc.utils.h.a("FloatWindowController", "close float window for manual");
                a.this.b("clickClose");
            }
        });
        this.d.setClickable(true);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.trtc.rtcroom.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                a.this.b("clickMiniWindow");
                if (a.a(a.this) == null) {
                    return;
                }
                com.taobao.trtc.utils.h.a("FloatWindowController", "clickMiniWindow, finish other activity");
                a.a(a.this).onMiniWindowClicked();
            }
        });
        this.d.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.trtc.rtcroom.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    a aVar = a.this;
                    a.a(aVar, a.b(aVar, motionEvent.getRawX()));
                    a aVar2 = a.this;
                    a.c(aVar2, a.d(aVar2, motionEvent.getRawY()));
                } else if (action == 1) {
                    a.g(a.this);
                    if (Math.abs(motionEvent.getRawX() - a.h(a.this)) > 10.0f || Math.abs(motionEvent.getRawY() - a.i(a.this)) > 10.0f) {
                        return true;
                    }
                } else if (action == 2) {
                    WindowManager.LayoutParams b = a.b(a.this);
                    b.x = (int) (b.x + (motionEvent.getRawX() - a.c(a.this)));
                    WindowManager.LayoutParams b2 = a.b(a.this);
                    b2.y = (int) (b2.y + (motionEvent.getRawY() - a.d(a.this)));
                    a.e(a.this).getWindowManager().updateViewLayout(a.f(a.this), a.b(a.this));
                    a.b(a.this, motionEvent.getRawX());
                    a.d(a.this, motionEvent.getRawY());
                }
                return false;
            }
        });
        this.f = new WindowManager.LayoutParams();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f.type = 2038;
        } else {
            this.f.type = 2002;
        }
        WindowManager.LayoutParams layoutParams2 = this.f;
        layoutParams2.format = -3;
        layoutParams2.flags = 8;
        layoutParams2.gravity = 51;
        layoutParams2.width = c0992a.f23162a;
        this.f.height = c0992a.b;
        WindowManager.LayoutParams layoutParams3 = this.f;
        layoutParams3.x = (this.h - layoutParams3.width) - c0992a.c;
        WindowManager.LayoutParams layoutParams4 = this.f;
        layoutParams4.y = (this.i - layoutParams4.height) - c0992a.d;
        com.taobao.trtc.utils.h.a("FloatWindowController", "init, float window size: " + c0992a.f23162a + "x" + c0992a.b + ", borderMargin: " + c0992a.e + ", borderClolor: " + Integer.toHexString(c0992a.f) + ", borderWidth: " + c0992a.g + ", borderRadius: " + c0992a.h);
        return true;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            d();
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.f == null || this.e == null || this.d == null || this.n.get()) {
            TrtcLog.d("FloatWindowController", "float window already started or var error");
            return false;
        }
        com.taobao.trtc.utils.h.a("FloatWindowController", "start float window for: " + str);
        View f = this.b.f();
        if (f != null) {
            this.b.a(f, true);
            if (Build.VERSION.SDK_INT >= 21) {
                f.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.trtc.rtcroom.a.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            return;
                        }
                        Rect rect = new Rect();
                        view.getGlobalVisibleRect(rect);
                        outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), a.j(a.this).h);
                    }
                });
                f.setClipToOutline(true);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            this.d.setLayoutParams(layoutParams);
            this.d.addView(f);
        }
        if (this.f23156a != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 53;
            int i = this.o.i;
            layoutParams2.height = i;
            layoutParams2.width = i;
            int i2 = this.o.j;
            layoutParams2.rightMargin = i2;
            layoutParams2.topMargin = i2;
            this.d.addView(this.f23156a, layoutParams2);
        }
        try {
            WindowManager windowManager = this.e.getWindowManager();
            if (windowManager != null) {
                windowManager.addView(this.d, this.f);
            }
            this.n.set(true);
            c();
            return true;
        } catch (Throwable th) {
            TrtcLog.a("FloatWindowController", "showFloatWindow, t: " + th.getMessage());
            return false;
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        com.taobao.trtc.utils.h.a("FloatWindowController", "close float window for: " + str);
        if (!this.n.get() || this.e == null) {
            d();
            TrtcLog.a("FloatWindowController", "float window not started or var error");
            return false;
        }
        this.n.set(false);
        WindowManager windowManager = this.e.getWindowManager();
        if (windowManager != null) {
            windowManager.removeView(this.d);
        }
        View f = this.b.f();
        if (f != null) {
            this.d.removeView(f);
            this.b.a(f, false);
        }
        ImageView imageView = this.f23156a;
        if (imageView != null) {
            this.d.removeView(imageView);
        }
        d();
        return true;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        final WindowManager.LayoutParams layoutParams = this.f;
        int i = layoutParams.x + (this.f.width / 2);
        int i2 = this.h;
        ValueAnimator ofInt = ValueAnimator.ofInt(layoutParams.x, i >= i2 / 2 ? (i2 - this.f.width) - this.g : this.g);
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.trtc.rtcroom.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    a.a(a.this, ((Integer) valueAnimator.getAnimatedValue()).intValue(), layoutParams.y);
                }
            }
        });
        ofInt.start();
    }

    private void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f;
        layoutParams.x = i;
        layoutParams.y = i2;
        try {
            this.e.getWindowManager().updateViewLayout(this.d, this.f);
        } catch (Exception unused) {
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(this.e).sendBroadcast(new Intent("action.com.taobao.taolive.room.start"));
        a(pmb.class, "canShowMiniLive", false);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(pmb.class, "canShowMiniLive", true);
        }
    }

    private boolean a(Class cls, String str, boolean z) {
        Field[] declaredFields;
        if (cls == null || StringUtils.isEmpty(str)) {
            return false;
        }
        synchronized (cls) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName()) && Modifier.isStatic(field.getModifiers()) && field.getType() == Boolean.TYPE) {
                    try {
                        com.taobao.trtc.utils.h.a("FloatWindowController", "[FloattingWindow] set " + str + " from " + field.get(null) + " to " + z);
                        field.set(null, Boolean.valueOf(z));
                    } catch (Throwable unused) {
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
