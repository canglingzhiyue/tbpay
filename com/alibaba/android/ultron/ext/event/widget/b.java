package com.alibaba.android.ultron.ext.event.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.GravityCompat;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.alibaba.android.ultron.ext.event.util.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import java.util.HashMap;
import java.util.Map;
import tb.bpl;
import tb.dcn;
import tb.gbg;
import tb.kge;
import tb.rgu;
import tb.rgw;
import tb.rgy;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VESSEL_METHOD_MAP_KEY_FILEDS = "fields";
    public static final String VESSEL_METHOD_MAP_KEY_TYPE = "type";
    public static final String VESSEL_METHOD_NAME_CLOSE_POP_WINDOW = "closePopWindow";
    public static final String VESSEL_METHOD_NAME_RELOAD = "reload";
    private static float m;

    /* renamed from: a */
    private PopupWindow f2627a;
    private FrameLayout b;
    private FrameLayout c;
    private ImageView d;
    private View e;
    private AlphaAnimation f;
    private AlphaAnimation g;
    private TranslateAnimation h;
    private TranslateAnimation i;
    private RelativeLayout j;
    private VesselView k;
    private C0091b l;
    private a n;
    private Context o;
    private boolean p = false;
    private boolean q;
    private OnScreenChangedListener r;

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ PopupWindow a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("78d0bdaf", new Object[]{bVar}) : bVar.f2627a;
    }

    public static /* synthetic */ void a(b bVar, Map map, com.taobao.vessel.base.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87807d06", new Object[]{bVar, map, aVar});
        } else {
            bVar.a(map, aVar);
        }
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86718f93", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.q = z;
        return z;
    }

    public static /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5cbba44", new Object[]{bVar});
        } else {
            bVar.i();
        }
    }

    public static /* synthetic */ void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a454a3", new Object[]{bVar});
        } else {
            bVar.g();
        }
    }

    public static /* synthetic */ View d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6f928ac4", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ AlphaAnimation e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlphaAnimation) ipChange.ipc$dispatch("ca876557", new Object[]{bVar}) : bVar.g;
    }

    public static /* synthetic */ a f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("db94ec20", new Object[]{bVar}) : bVar.n;
    }

    public static /* synthetic */ boolean g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b06be23", new Object[]{bVar})).booleanValue() : bVar.p;
    }

    static {
        kge.a(1871297155);
        m = 0.6f;
    }

    public b(Context context) {
        this.o = context;
        this.k = new VesselView(context);
        this.q = h.a().b(context);
        a();
        b();
        d();
        c();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = new FrameLayout(this.o);
        this.e = new View(this.o);
        this.e.setBackgroundColor(Color.parseColor("#7F000000"));
        this.b.addView(this.e);
        this.j = (RelativeLayout) LayoutInflater.from(this.o).inflate(R.layout.common_popop_window, (ViewGroup) this.b, false);
        this.j.setClickable(true);
        this.c = (FrameLayout) this.j.findViewById(R.id.ultron_popup_view);
        this.d = (ImageView) this.j.findViewById(R.id.ultron_popup_close_button);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) (bpl.b(this.o) * m), 80);
        this.c.addView(this.k, new FrameLayout.LayoutParams(-1, -1));
        this.b.addView(this.j, layoutParams);
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f = new AlphaAnimation(0.0f, 1.0f);
        this.f.setDuration(200L);
        this.g = new AlphaAnimation(1.0f, 0.0f);
        this.g.setDuration(200L);
        this.g.setAnimationListener(new Animation.AnimationListener() { // from class: com.alibaba.android.ultron.ext.event.widget.b.1
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
                b.this = this;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    b.a(b.this).dismiss();
                }
            }
        });
        g();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (this.q) {
            this.h = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            this.i = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        } else {
            this.h = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            this.i = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
        }
        this.h.setDuration(200L);
        this.i.setDuration(200L);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.r = new OnScreenChangedListener() { // from class: com.alibaba.android.ultron.ext.event.widget.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
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
                b bVar = b.this;
                if (i == 2) {
                    z = false;
                }
                b.a(bVar, z);
                if (!b.this.f()) {
                    return;
                }
                b.b(b.this);
                b.c(b.this);
            }
        };
        h.a().c(this.r);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.ultron.ext.event.widget.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                b.d(b.this).setEnabled(false);
                b.this.a(false);
            }
        });
        this.b.setOnKeyListener(new View.OnKeyListener() { // from class: com.alibaba.android.ultron.ext.event.widget.b.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue();
                }
                if (i == 4 && b.a(b.this).isShowing() && !b.e(b.this).hasStarted()) {
                    b.this.a(false);
                }
                return false;
            }
        });
    }

    public void a(C0091b c0091b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46802727", new Object[]{this, c0091b});
            return;
        }
        this.l = c0091b;
        if (dcn.a()) {
            h();
        }
        if (this.f2627a == null) {
            this.f2627a = new PopupWindow(this.o);
            this.f2627a.setBackgroundDrawable(new ColorDrawable(0));
            this.f2627a.setWidth(-1);
            this.f2627a.setHeight(-1);
            this.f2627a.setSoftInputMode(16);
            this.f2627a.setOutsideTouchable(true);
            this.f2627a.setFocusable(true);
        }
        C0091b c0091b2 = this.l;
        if (c0091b2 != null) {
            if (C0091b.a(c0091b2) < 0) {
                this.e.setBackgroundColor(C0091b.a(this.l));
            }
            if (C0091b.b(this.l) > 0.0f) {
                i();
            }
            if (C0091b.c(this.l)) {
                this.d.setVisibility(0);
                this.d.setContentDescription("关闭");
                this.d.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.ultron.ext.event.widget.CommonPopupWindow$5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            b.this.a(false);
                        }
                    }
                });
            } else {
                this.d.setVisibility(8);
            }
            if (dcn.a() || (this.j instanceof RoundRelativeLayout)) {
                ((RoundRelativeLayout) this.j).setRadius(0.0f);
            }
        }
        this.e.setEnabled(true);
        this.f2627a.setContentView(this.b);
        this.f2627a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.alibaba.android.ultron.ext.event.widget.CommonPopupWindow$6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                } else if (b.f(b.this) == null || b.g(b.this)) {
                } else {
                    b.f(b.this).a();
                }
            }
        });
        e();
        a(C0091b.d(this.l));
        this.e.startAnimation(this.f);
        this.j.startAnimation(this.h);
        this.f2627a.showAtLocation(this.b, C0091b.e(this.l), 0, 0);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.p = z;
        this.e.startAnimation(this.g);
        this.j.startAnimation(this.i);
        if (this.n == null) {
            return;
        }
        h.a().d(this.r);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        VesselView vesselView = this.k;
        if (vesselView == null) {
            return;
        }
        vesselView.loadUrl(str);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("467fb2c8", new Object[]{this, aVar});
        } else {
            this.n = aVar;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        PopupWindow popupWindow = this.f2627a;
        return popupWindow != null && popupWindow.isShowing();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        int c = gbg.c(this.o);
        int b = gbg.b(this.o);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j.getLayoutParams();
        if (this.q) {
            layoutParams.height = (int) (c * C0091b.b(this.l));
            layoutParams.width = b;
            layoutParams.gravity = 80;
        } else {
            layoutParams.height = c;
            layoutParams.width = b / 2;
            layoutParams.gravity = GravityCompat.END;
        }
        this.j.setLayoutParams(layoutParams);
    }

    /* renamed from: com.alibaba.android.ultron.ext.event.widget.b$b */
    /* loaded from: classes2.dex */
    public static class C0091b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_BOTTOM_RADIUS = "popupWindowBottomRadius";
        public static final String KEY_TOP_RADIUS = "popupWindowTopRadius";

        /* renamed from: a */
        private float f2634a;
        private int c;
        private String e;
        private int b = 0;
        private int d = 0;
        private boolean f = true;

        static {
            kge.a(-968718349);
        }

        public static /* synthetic */ int a(C0091b c0091b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4680271a", new Object[]{c0091b})).intValue() : c0091b.b;
        }

        public static /* synthetic */ float b(C0091b c0091b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("609ba5b6", new Object[]{c0091b})).floatValue() : c0091b.f2634a;
        }

        public static /* synthetic */ boolean c(C0091b c0091b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ab72469", new Object[]{c0091b})).booleanValue() : c0091b.f;
        }

        public static /* synthetic */ String d(C0091b c0091b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a7e93a1c", new Object[]{c0091b}) : c0091b.e;
        }

        public static /* synthetic */ int e(C0091b c0091b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aeee2196", new Object[]{c0091b})).intValue() : c0091b.c;
        }

        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            } else {
                this.f2634a = f;
            }
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.d = i;
            }
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.e = str;
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f = z;
            }
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        VesselView vesselView = this.k;
        if (vesselView == null) {
            return;
        }
        vesselView.setOnLoadListener(new rgu() { // from class: com.alibaba.android.ultron.ext.event.widget.b.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgu
            public void onLoadFinish(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c38c0593", new Object[]{this, view});
                }
            }

            @Override // tb.rgu
            public void onLoadStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f829aa04", new Object[]{this});
                }
            }

            {
                b.this = this;
            }

            @Override // tb.rgu
            public void onLoadError(rgy rgyVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
                } else {
                    c.a(getClass().getSimpleName(), "vesselViewOnLoadError", "vesselViewError", rgyVar.b);
                }
            }

            @Override // tb.rgu
            public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
                } else {
                    c.a(getClass().getSimpleName(), "vesselViewOnDowngrade", "vesselViewDowngrade", rgyVar.b);
                }
            }
        });
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        VesselView vesselView = this.k;
        if (vesselView == null) {
            return;
        }
        vesselView.setVesselViewCallback(new rgw() { // from class: com.alibaba.android.ultron.ext.event.widget.b.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // tb.rgw
            public void a(Map<String, Object> map, com.taobao.vessel.base.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
                } else {
                    b.a(b.this, map, aVar);
                }
            }
        });
    }

    private void a(Map<String, Object> map, com.taobao.vessel.base.a aVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
        } else if (map == null) {
        } else {
            String str = null;
            if (map.containsKey("type") && (obj = map.get("type")) != null && (obj instanceof String)) {
                str = (String) obj;
            }
            if (map.containsKey("fields")) {
                map.get("fields");
            }
            if (str != null) {
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -1325911415) {
                    if (hashCode == -934641255 && str.equals("reload")) {
                        c = 1;
                    }
                } else if (str.equals(VESSEL_METHOD_NAME_CLOSE_POP_WINDOW)) {
                    c = 0;
                }
                if (c == 0) {
                    a(false);
                } else if (c == 1) {
                    a(C0091b.d(this.l));
                }
            }
            aVar.invoke(new HashMap());
        }
    }
}
