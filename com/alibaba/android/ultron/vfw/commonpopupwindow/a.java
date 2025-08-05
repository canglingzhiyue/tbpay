package com.alibaba.android.ultron.vfw.commonpopupwindow;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.android.ultron.vfw.widget.RoundRelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.i;
import com.taobao.android.autosize.l;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import tb.boc;
import tb.bpl;
import tb.jqg;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static float m;

    /* renamed from: a */
    private PopupWindow f2680a;
    private FrameLayout b;
    private LinearLayout c;
    private RecyclerView d;
    private LinearLayout e;
    private ImageView f;
    private View g;
    private AlphaAnimation h;
    private AlphaAnimation i;
    private TranslateAnimation j;
    private TranslateAnimation k;
    private RelativeLayout l;
    private InterfaceC0097a n;
    private boolean o;
    private final d p;
    private final Context q;
    private boolean r;
    private boolean s;
    private b t;
    private final int u;
    private OnScreenChangedListener v;

    /* renamed from: com.alibaba.android.ultron.vfw.commonpopupwindow.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC0097a {
        void a(boolean z);
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10120ab6", new Object[]{aVar});
        } else {
            aVar.i();
        }
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f22ffee2", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.s = z;
        return z;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a613b7", new Object[]{aVar});
        } else {
            aVar.j();
        }
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b3a1cb8", new Object[]{aVar});
        } else {
            aVar.g();
        }
    }

    public static /* synthetic */ void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ce25b9", new Object[]{aVar});
        } else {
            aVar.h();
        }
    }

    public static /* synthetic */ PopupWindow e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("895411ba", new Object[]{aVar}) : aVar.f2680a;
    }

    public static /* synthetic */ View f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("796a773d", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ AlphaAnimation g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlphaAnimation) ipChange.ipc$dispatch("69d2c072", new Object[]{aVar}) : aVar.i;
    }

    public static /* synthetic */ InterfaceC0097a h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0097a) ipChange.ipc$dispatch("9dd7646a", new Object[]{aVar}) : aVar.n;
    }

    public static /* synthetic */ boolean i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3cb252c2", new Object[]{aVar})).booleanValue() : aVar.o;
    }

    static {
        kge.a(-1932071023);
        m = 0.6f;
    }

    public a(Context context) {
        this(context, new UltronInstanceConfig());
    }

    public a(Context context, UltronInstanceConfig ultronInstanceConfig) {
        boolean z = false;
        this.o = false;
        this.r = false;
        this.s = true;
        if (Build.VERSION.SDK_INT >= 19) {
            this.r = (l.d(context) || l.b(context)) ? true : z;
        }
        this.s = h.a().b(context);
        this.q = context;
        ultronInstanceConfig.a(new boc.a().a(new DXEngineConfig.a(ultronInstanceConfig.b()).a(true, true)).a());
        this.p = d.a(ultronInstanceConfig, context);
        a(context);
        c();
        this.u = d();
        b();
        if (this.r) {
            g();
        }
        this.p.f().put("CommonPopupWindow", this);
    }

    public void a(JSONObject jSONObject, d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b4070e", new Object[]{this, jSONObject, cVar});
            return;
        }
        g();
        this.p.a(jSONObject, cVar);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.v = new OnScreenChangedListener() { // from class: com.alibaba.android.ultron.vfw.commonpopupwindow.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public void onScreenChanged(int i, Configuration configuration) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                    return;
                }
                jqg.b("DeviceAdapter", "order-onScreenChanged");
                a aVar = a.this;
                if (i == 2) {
                    z = false;
                }
                a.a(aVar, z);
                a.a(a.this);
                if (!a.this.e()) {
                    return;
                }
                a.b(a.this);
                a.c(a.this);
                a.d(a.this);
            }
        };
        h.a().c(this.v);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Context context = this.q;
        if (!(context instanceof Activity)) {
            return;
        }
        int width = i.a((Activity) context).width();
        if (!this.s) {
            width /= 2;
        }
        this.p.q().f(DXWidgetNode.DXMeasureSpec.a(width, 1073741824));
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.p.a(127);
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.b = new FrameLayout(context);
        this.g = new View(context);
        this.g.setBackgroundColor(Color.parseColor("#7F000000"));
        this.b.addView(this.g);
        this.l = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.ultron_popop_window, (ViewGroup) this.b, false);
        this.l.setClickable(true);
        this.c = (LinearLayout) this.l.findViewById(R.id.ultron_popup_header_view);
        this.d = (RecyclerView) this.l.findViewById(R.id.ultron_popup_recycler_view);
        this.d.setLayoutManager(new com.alibaba.android.ultron.vfw.popupwindow.a(context, 1, false));
        this.e = (LinearLayout) this.l.findViewById(R.id.ultron_popup_footer_view);
        this.f = (ImageView) this.l.findViewById(R.id.ultron_popup_close_button);
        this.b.addView(this.l, new FrameLayout.LayoutParams(-1, (int) (bpl.b(context) * m), 80));
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
        this.p.a(this.c, this.d, this.e);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.h = new AlphaAnimation(0.0f, 1.0f);
        this.h.setDuration(200L);
        this.i = new AlphaAnimation(1.0f, 0.0f);
        this.i.setDuration(200L);
        this.i.setAnimationListener(new Animation.AnimationListener() { // from class: com.alibaba.android.ultron.vfw.commonpopupwindow.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            {
                a.this = this;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    a.e(a.this).dismiss();
                }
            }
        });
        i();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        if (this.s) {
            this.j = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            this.k = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        } else {
            this.j = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            this.k = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
        }
        this.j.setDuration(200L);
        this.k.setDuration(200L);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.ultron.vfw.commonpopupwindow.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                a.f(a.this).setEnabled(false);
                a.this.a(false);
            }
        });
        this.b.setOnKeyListener(new View.OnKeyListener() { // from class: com.alibaba.android.ultron.vfw.commonpopupwindow.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue();
                }
                if (i == 4 && a.e(a.this).isShowing() && !a.g(a.this).hasStarted()) {
                    a.this.a(false);
                }
                return false;
            }
        });
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528fa1b8", new Object[]{this, bVar});
            return;
        }
        this.t = bVar;
        if (this.r) {
            f();
        }
        try {
            if (this.f2680a == null) {
                this.f2680a = new PopupWindow(this.q);
                this.f2680a.setBackgroundDrawable(new ColorDrawable(0));
                this.f2680a.setWidth(-1);
                this.f2680a.setHeight(-1);
                this.f2680a.setSoftInputMode(16);
                this.f2680a.setOutsideTouchable(true);
                this.f2680a.setFocusable(true);
            }
            if (bVar != null) {
                if (b.a(bVar) < 0) {
                    this.g.setBackgroundColor(b.a(bVar));
                }
                if (b.b(bVar) > 0.0f) {
                    j();
                }
                if (b.c(bVar) != null) {
                    this.f.setVisibility(0);
                    this.f.setContentDescription(com.alibaba.ability.localization.b.a(R.string.app_close));
                    this.f.setImageDrawable(b.c(bVar));
                    this.f.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.ultron.vfw.commonpopupwindow.CommonPopupWindow$6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            } else {
                                a.this.a(false);
                            }
                        }
                    });
                } else {
                    this.f.setVisibility(8);
                }
                if (b.g(bVar) < 0) {
                    if (this.r) {
                        bVar.a(0.0f, 0.0f);
                    }
                    this.l.setBackgroundDrawable(bpl.a(b.g(bVar), b.d(bVar), b.e(bVar)));
                }
                if (this.r && (this.l instanceof RoundRelativeLayout)) {
                    bVar.a(0.0f, 0.0f);
                    ((RoundRelativeLayout) this.l).setRadius(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            this.g.setEnabled(true);
            this.f2680a.setContentView(this.b);
            this.f2680a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.alibaba.android.ultron.vfw.commonpopupwindow.CommonPopupWindow$7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                    } else if (a.h(a.this) == null) {
                    } else {
                        a.h(a.this).a(a.i(a.this));
                    }
                }
            });
            this.g.startAnimation(this.h);
            this.l.startAnimation(this.j);
            this.f2680a.showAtLocation(this.b, bVar != null ? b.f(bVar) : 0, 0, 0);
        } catch (Throwable th) {
            UnifyLog.d("CommonPopupWindow", th.getMessage());
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        Context context = this.q;
        if (!(context instanceof Activity)) {
            return;
        }
        int height = i.a((Activity) context).height();
        int width = i.a((Activity) this.q).width();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l.getLayoutParams();
        if (this.s) {
            layoutParams.height = (int) (height * b.b(this.t));
            layoutParams.width = width;
            layoutParams.gravity = 80;
        } else {
            layoutParams.height = height - Math.max(this.u, 0);
            layoutParams.width = width / 2;
            layoutParams.gravity = GravityCompat.END;
        }
        this.l.setLayoutParams(layoutParams);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.o = z;
        if (this.v != null) {
            h.a().d(this.v);
        }
        this.g.startAnimation(this.i);
        this.l.startAnimation(this.k);
    }

    public void a(InterfaceC0097a interfaceC0097a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528f2d59", new Object[]{this, interfaceC0097a});
        } else {
            this.n = interfaceC0097a;
        }
    }

    public int d() {
        Window window;
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        Context context = this.q;
        if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return 0;
        }
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        return i.a((Activity) this.q).height() - rect.height();
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        PopupWindow popupWindow = this.f2680a;
        return popupWindow != null && popupWindow.isShowing();
    }

    /* loaded from: classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_BOTTOM_RADIUS = "popupWindowBottomRadius";
        public static final String KEY_TOP_RADIUS = "popupWindowTopRadius";

        /* renamed from: a */
        private float f2685a;
        private int c;
        private Drawable e;
        private float f;
        private float g;
        private int b = 0;
        private int d = 0;

        static {
            kge.a(-1292600923);
        }

        public static /* synthetic */ int a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("528fa1ab", new Object[]{bVar})).intValue() : bVar.b;
        }

        public static /* synthetic */ float b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63456e69", new Object[]{bVar})).floatValue() : bVar.f2685a;
        }

        public static /* synthetic */ Drawable c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("7063d440", new Object[]{bVar}) : bVar.e;
        }

        public static /* synthetic */ float d(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("84b107eb", new Object[]{bVar})).floatValue() : bVar.f;
        }

        public static /* synthetic */ float e(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9566d4ac", new Object[]{bVar})).floatValue() : bVar.g;
        }

        public static /* synthetic */ int f(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a61ca170", new Object[]{bVar})).intValue() : bVar.c;
        }

        public static /* synthetic */ int g(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b6d26e31", new Object[]{bVar})).intValue() : bVar.d;
        }

        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            } else {
                this.f2685a = f;
            }
        }

        public void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            this.f = f;
            this.g = f2;
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }
    }

    public d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("a2357d8d", new Object[]{this}) : this.p;
    }
}
