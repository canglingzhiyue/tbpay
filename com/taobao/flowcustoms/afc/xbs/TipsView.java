package com.taobao.flowcustoms.afc.xbs;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.IBinder;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.taobao.R;
import java.math.BigDecimal;
import java.util.Timer;
import java.util.TimerTask;
import tb.kge;
import tb.koi;

/* loaded from: classes7.dex */
public class TipsView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLOSE_REASON_LEFT_SWIPE = "left_swipe";

    /* renamed from: a  reason: collision with root package name */
    public static volatile TipsView f17193a;
    public static volatile boolean b;
    public static Integer c;
    public LinearLayout e;
    public WindowManager f;
    public WindowManager.LayoutParams g;
    public a i;
    private float j;
    private float k;
    private float l;
    private LinearLayout n;
    private LinearLayout o;
    private TextView p;
    private int q;
    private BigDecimal r;
    private Timer w;
    private b x;
    public BigDecimal d = BigDecimal.valueOf(-1L);
    private boolean m = false;
    private String s = null;
    private d t = null;
    private FloatingType u = FloatingType.SHOW_ONCE;
    private FloatingShowStatus v = FloatingShowStatus.CLOSE;
    public Handler h = new Handler();

    /* loaded from: classes7.dex */
    public enum FloatingShowStatus {
        SHOW,
        CLOSE,
        HIDE
    }

    /* loaded from: classes7.dex */
    public enum FloatingType {
        SHOW_ONCE,
        SHOW_ALWAYS
    }

    public static /* synthetic */ float a(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("37306da7", new Object[]{tipsView})).floatValue() : tipsView.k;
    }

    public static /* synthetic */ float a(TipsView tipsView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeddb0d9", new Object[]{tipsView, new Float(f)})).floatValue();
        }
        tipsView.j = f;
        return f;
    }

    public static /* synthetic */ FloatingShowStatus a(TipsView tipsView, FloatingShowStatus floatingShowStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatingShowStatus) ipChange.ipc$dispatch("24b107ff", new Object[]{tipsView, floatingShowStatus});
        }
        tipsView.v = floatingShowStatus;
        return floatingShowStatus;
    }

    public static /* synthetic */ b a(TipsView tipsView, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("134ba55b", new Object[]{tipsView, bVar});
        }
        tipsView.x = bVar;
        return bVar;
    }

    public static /* synthetic */ BigDecimal a(TipsView tipsView, BigDecimal bigDecimal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigDecimal) ipChange.ipc$dispatch("4553203f", new Object[]{tipsView, bigDecimal});
        }
        tipsView.r = bigDecimal;
        return bigDecimal;
    }

    public static /* synthetic */ Timer a(TipsView tipsView, Timer timer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timer) ipChange.ipc$dispatch("e9ceffd1", new Object[]{tipsView, timer});
        }
        tipsView.w = timer;
        return timer;
    }

    public static /* synthetic */ boolean a(TipsView tipsView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeddfc01", new Object[]{tipsView, new Boolean(z)})).booleanValue();
        }
        tipsView.m = z;
        return z;
    }

    public static /* synthetic */ float b(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f0a7fb46", new Object[]{tipsView})).floatValue() : tipsView.l;
    }

    public static /* synthetic */ float b(TipsView tipsView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2457d71a", new Object[]{tipsView, new Float(f)})).floatValue();
        }
        tipsView.k = f;
        return f;
    }

    public static /* synthetic */ float c(TipsView tipsView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99d1fd5b", new Object[]{tipsView, new Float(f)})).floatValue();
        }
        tipsView.l = f;
        return f;
    }

    public static /* synthetic */ LinearLayout c(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("4e3528cc", new Object[]{tipsView}) : tipsView.n;
    }

    public static /* synthetic */ int d(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63971687", new Object[]{tipsView})).intValue() : tipsView.q;
    }

    public static /* synthetic */ float e(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1d0ea423", new Object[]{tipsView})).floatValue() : tipsView.j;
    }

    public static /* synthetic */ boolean f(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d68631d6", new Object[]{tipsView})).booleanValue() : tipsView.m;
    }

    public static /* synthetic */ BigDecimal g(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BigDecimal) ipChange.ipc$dispatch("59990ec9", new Object[]{tipsView}) : tipsView.r;
    }

    public static /* synthetic */ d h(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("35a3fc16", new Object[]{tipsView}) : tipsView.t;
    }

    public static /* synthetic */ FloatingShowStatus i(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatingShowStatus) ipChange.ipc$dispatch("fa559dbf", new Object[]{tipsView}) : tipsView.v;
    }

    public static /* synthetic */ FloatingType j(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatingType) ipChange.ipc$dispatch("f4f29b35", new Object[]{tipsView}) : tipsView.u;
    }

    public static /* synthetic */ b k(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7fc213be", new Object[]{tipsView}) : tipsView.x;
    }

    public static /* synthetic */ Timer l(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Timer) ipChange.ipc$dispatch("10ab3b78", new Object[]{tipsView}) : tipsView.w;
    }

    static {
        kge.a(1834366562);
        b = false;
        c = null;
    }

    public static TipsView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TipsView) ipChange.ipc$dispatch("9bd0cc77", new Object[0]);
        }
        if (f17193a == null) {
            synchronized (TipsView.class) {
                if (f17193a == null) {
                    f17193a = new TipsView();
                }
            }
        }
        return f17193a;
    }

    public TipsView() {
        e();
        f();
        g();
    }

    public TipsView a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TipsView) ipChange.ipc$dispatch("98e19a41", new Object[]{this, str});
        }
        if (this.p != null && !StringUtils.isEmpty(str)) {
            this.s = str;
        }
        return f17193a;
    }

    public TipsView a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TipsView) ipChange.ipc$dispatch("5dff5b47", new Object[]{this, dVar});
        }
        if (dVar != null) {
            this.t = dVar;
        }
        return f17193a;
    }

    public TipsView a(FloatingType floatingType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TipsView) ipChange.ipc$dispatch("3eae3a24", new Object[]{this, floatingType});
        }
        this.u = floatingType;
        return f17193a;
    }

    public TipsView a(BigDecimal bigDecimal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TipsView) ipChange.ipc$dispatch("6f3db03b", new Object[]{this, bigDecimal});
        }
        this.d = bigDecimal;
        return f17193a;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.q = AfcCustomSdk.a().f17167a.getResources().getDisplayMetrics().heightPixels;
        this.g = new WindowManager.LayoutParams(-2, -2, 1003, 520, -3);
        WindowManager.LayoutParams layoutParams = this.g;
        layoutParams.gravity = 51;
        layoutParams.x = 0;
        layoutParams.y = (this.q / 6) << 2;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            Application application = AfcCustomSdk.a().f17167a;
            this.e = (LinearLayout) ((LayoutInflater) application.getSystemService("layout_inflater")).inflate(R.layout.alibc_floating_layer_layout, (ViewGroup) null);
            this.n = (LinearLayout) this.e.findViewById(R.id.layer_hidepart);
            this.o = (LinearLayout) this.e.findViewById(R.id.layer_back_ground);
            this.e.setLayoutParams(this.g);
            this.p = (TextView) this.e.findViewById(R.id.layer_content);
            this.f = (WindowManager) application.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
            if (c == null) {
                return;
            }
            a(application, c.intValue());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.e.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.flowcustoms.afc.xbs.TipsView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
                    if (r12 != 3) goto L14;
                 */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
                    /*
                        Method dump skipped, instructions count: 547
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.flowcustoms.afc.xbs.TipsView.AnonymousClass1.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (a() == null || this.e == null || this.v != FloatingShowStatus.CLOSE || this.s == null) {
                return;
            }
            b = true;
            this.v = FloatingShowStatus.SHOW;
            if (koi.a().f30190a == null) {
                return;
            }
            a(koi.a().f30190a.get());
            this.e.postDelayed(new Runnable() { // from class: com.taobao.flowcustoms.afc.xbs.TipsView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TipsView.this.g.x = -TipsView.this.e.getWidth();
                    try {
                        TipsView.this.f.updateViewLayout(TipsView.this.e, TipsView.this.g);
                    } catch (Exception unused) {
                    }
                    TipsView.this.e.setVisibility(0);
                    TipsView tipsView = TipsView.this;
                    TipsView.a(tipsView, new b());
                    TipsView.a(TipsView.this, new Timer());
                    TipsView.l(TipsView.this).schedule(TipsView.k(TipsView.this), 0L, 16L);
                }
            }, 100L);
            if (this.t == null) {
                return;
            }
            this.t.a((Activity) null);
        } catch (Throwable unused) {
        }
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        try {
            if (this.s != null) {
                this.p.setText(this.s);
            }
            BigDecimal valueOf = BigDecimal.valueOf(System.currentTimeMillis());
            if (this.d.floatValue() > 0.0f && valueOf.subtract(this.d).floatValue() >= 0.0f) {
                b = false;
                f17193a = null;
                if (this.t == null) {
                    return;
                }
                this.t.b();
            } else if (a() == null || !b) {
            } else {
                this.i = new a(activity);
                this.h.postDelayed(this.i, 1000L);
            }
        } catch (Throwable unused) {
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (a() == null || !b) {
                return;
            }
            this.f.removeViewImmediate(this.e);
            this.g.token = null;
        } catch (Throwable unused) {
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            b = false;
            try {
                this.f.removeViewImmediate(this.e);
                this.g.token = null;
            } catch (Exception unused) {
            }
            f17193a = null;
        } catch (Throwable unused2) {
        }
    }

    public void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{this, context, new Integer(i)});
        } else if (this.o == null) {
        } else {
            c = Integer.valueOf(i);
            ((GradientDrawable) this.o.getBackground()).setColor(context.getResources().getColor(i));
        }
    }

    /* loaded from: classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f17196a = 0;
        private Activity c;

        static {
            kge.a(1085848668);
            kge.a(-1390502639);
        }

        public a(Activity activity) {
            this.c = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IBinder iBinder;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.c == null || !TipsView.b) {
            } else {
                try {
                    iBinder = this.c.getWindow().getDecorView().getWindowToken();
                } catch (Exception unused) {
                    iBinder = null;
                }
                if (iBinder != null) {
                    try {
                        try {
                            TipsView.this.g.token = iBinder;
                            TipsView.this.e.setVisibility(0);
                            TipsView.this.f.addView(TipsView.this.e, TipsView.this.g);
                            this.c = null;
                            return;
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        if (TipsView.this.e.getParent() != null) {
                            TipsView.this.f.removeView(TipsView.this.e);
                        }
                        TipsView.this.f.addView(TipsView.this.e, TipsView.this.g);
                        return;
                    }
                }
                this.f17196a++;
                TipsView.this.g.token = null;
                if (this.f17196a >= 10 || TipsView.this.i == null) {
                    return;
                }
                TipsView.this.h.postDelayed(TipsView.this.i, 500L);
            }
        }
    }

    /* loaded from: classes7.dex */
    public class b extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f17197a;
        public int b;

        static {
            kge.a(308036030);
        }

        public b() {
            if (TipsView.i(TipsView.this) == FloatingShowStatus.CLOSE) {
                this.f17197a = -TipsView.this.e.getWidth();
            } else if (TipsView.i(TipsView.this) == FloatingShowStatus.HIDE) {
                this.f17197a = -TipsView.c(TipsView.this).getWidth();
            } else {
                this.f17197a = 0;
            }
            this.b = TipsView.this.g.y;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                TipsView.this.h.post(new Runnable() { // from class: com.taobao.flowcustoms.afc.xbs.TipsView.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        if (Math.abs(TipsView.this.g.x - b.this.f17197a) <= 4 || Math.abs(TipsView.this.g.y - b.this.b) <= 4) {
                            TipsView.this.g.x = b.this.f17197a;
                            TipsView.this.g.y = b.this.b;
                            b.this.cancel();
                            TipsView.l(TipsView.this).cancel();
                        } else {
                            TipsView.this.g.x = ((b.this.f17197a - TipsView.this.g.x) / 4) + TipsView.this.g.x;
                            TipsView.this.g.y = ((b.this.b - TipsView.this.g.y) / 4) + TipsView.this.g.y;
                        }
                        try {
                            TipsView.this.f.updateViewLayout(TipsView.this.e, TipsView.this.g);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (TipsView.i(TipsView.this) != FloatingShowStatus.CLOSE) {
                            return;
                        }
                        TipsView.this.d();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}
