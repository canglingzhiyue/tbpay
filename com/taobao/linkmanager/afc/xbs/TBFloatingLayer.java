package com.taobao.linkmanager.afc.xbs;

import android.app.Activity;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.model.AfcXbsData;
import com.taobao.flowcustoms.afc.xbs.d;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.taobaocompat.lifecycle.TimestampSynchronizer;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.math.BigDecimal;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.koi;

/* loaded from: classes7.dex */
public class TBFloatingLayer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile TBFloatingLayer f17694a;
    public static volatile boolean b;
    private TextView A;
    private TextView B;
    private View C;
    public LinearLayout d;
    public WindowManager e;
    public WindowManager.LayoutParams f;
    public a h;
    private float j;
    private float k;
    private float l;
    private LinearLayout n;
    private TextView o;
    private int p;
    private BigDecimal q;
    private Timer u;
    private b v;
    private TUrlImageView w;
    private LinearLayout x;
    private RelativeLayout y;
    private FrameLayout z;
    public BigDecimal c = BigDecimal.valueOf(-1L);
    private boolean m = false;
    private d r = null;
    private FloatingType s = FloatingType.SHOW_ALWAYS;
    private FloatingShowStatus t = FloatingShowStatus.CLOSE;
    public Handler g = new Handler(Looper.getMainLooper());
    public boolean i = false;
    private AtomicBoolean D = new AtomicBoolean(false);

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

    public static /* synthetic */ float a(TBFloatingLayer tBFloatingLayer, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef07670", new Object[]{tBFloatingLayer, new Float(f)})).floatValue();
        }
        tBFloatingLayer.j = f;
        return f;
    }

    public static /* synthetic */ FloatingShowStatus a(TBFloatingLayer tBFloatingLayer, FloatingShowStatus floatingShowStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatingShowStatus) ipChange.ipc$dispatch("774af16e", new Object[]{tBFloatingLayer, floatingShowStatus});
        }
        tBFloatingLayer.t = floatingShowStatus;
        return floatingShowStatus;
    }

    public static /* synthetic */ FloatingType a(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatingType) ipChange.ipc$dispatch("2b85ae84", new Object[]{tBFloatingLayer}) : tBFloatingLayer.s;
    }

    public static /* synthetic */ b a(TBFloatingLayer tBFloatingLayer, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("db8c8d6", new Object[]{tBFloatingLayer, bVar});
        }
        tBFloatingLayer.v = bVar;
        return bVar;
    }

    public static /* synthetic */ BigDecimal a(TBFloatingLayer tBFloatingLayer, BigDecimal bigDecimal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigDecimal) ipChange.ipc$dispatch("2b7f916", new Object[]{tBFloatingLayer, bigDecimal});
        }
        tBFloatingLayer.q = bigDecimal;
        return bigDecimal;
    }

    public static /* synthetic */ Timer a(TBFloatingLayer tBFloatingLayer, Timer timer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timer) ipChange.ipc$dispatch("bfcda968", new Object[]{tBFloatingLayer, timer});
        }
        tBFloatingLayer.u = timer;
        return timer;
    }

    public static /* synthetic */ boolean a(TBFloatingLayer tBFloatingLayer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef0c198", new Object[]{tBFloatingLayer, new Boolean(z)})).booleanValue();
        }
        tBFloatingLayer.m = z;
        return z;
    }

    public static /* synthetic */ float b(TBFloatingLayer tBFloatingLayer, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("290bf50f", new Object[]{tBFloatingLayer, new Float(f)})).floatValue();
        }
        tBFloatingLayer.k = f;
        return f;
    }

    public static /* synthetic */ d b(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("1f25b885", new Object[]{tBFloatingLayer}) : tBFloatingLayer.r;
    }

    public static /* synthetic */ float c(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9e87c32", new Object[]{tBFloatingLayer})).floatValue() : tBFloatingLayer.k;
    }

    public static /* synthetic */ float c(TBFloatingLayer tBFloatingLayer, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("432773ae", new Object[]{tBFloatingLayer, new Float(f)})).floatValue();
        }
        tBFloatingLayer.l = f;
        return f;
    }

    public static /* synthetic */ float d(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("87232db3", new Object[]{tBFloatingLayer})).floatValue() : tBFloatingLayer.l;
    }

    public static /* synthetic */ LinearLayout e(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("a5de029b", new Object[]{tBFloatingLayer}) : tBFloatingLayer.n;
    }

    public static /* synthetic */ int f(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a19890b8", new Object[]{tBFloatingLayer})).intValue() : tBFloatingLayer.p;
    }

    public static /* synthetic */ float g(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2ed34236", new Object[]{tBFloatingLayer})).floatValue() : tBFloatingLayer.j;
    }

    public static /* synthetic */ boolean h(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc0df3cb", new Object[]{tBFloatingLayer})).booleanValue() : tBFloatingLayer.m;
    }

    public static /* synthetic */ BigDecimal i(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BigDecimal) ipChange.ipc$dispatch("cccf0552", new Object[]{tBFloatingLayer}) : tBFloatingLayer.q;
    }

    public static /* synthetic */ FloatingShowStatus j(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatingShowStatus) ipChange.ipc$dispatch("cbba9418", new Object[]{tBFloatingLayer}) : tBFloatingLayer.t;
    }

    public static /* synthetic */ b k(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d2cc5326", new Object[]{tBFloatingLayer}) : tBFloatingLayer.v;
    }

    public static /* synthetic */ Timer l(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Timer) ipChange.ipc$dispatch("96f213b7", new Object[]{tBFloatingLayer}) : tBFloatingLayer.u;
    }

    public static /* synthetic */ AtomicBoolean m(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("8562018c", new Object[]{tBFloatingLayer}) : tBFloatingLayer.D;
    }

    static {
        kge.a(1809307767);
        b = false;
    }

    public static TBFloatingLayer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFloatingLayer) ipChange.ipc$dispatch("68e8ba86", new Object[0]);
        }
        if (f17694a == null) {
            synchronized (TBFloatingLayer.class) {
                if (f17694a == null) {
                    f17694a = new TBFloatingLayer();
                }
            }
        }
        return f17694a;
    }

    public TBFloatingLayer a(com.taobao.flowcustoms.afc.a aVar, AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFloatingLayer) ipChange.ipc$dispatch("63acfb7c", new Object[]{this, aVar, afcXbsData});
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "TBFloatingLayer  === setDisplayContent ==  设置小把手内容");
        this.i = com.taobao.flowcustoms.afc.xbs.a.a(afcXbsData);
        e();
        f();
        g();
        if (this.y == null || aVar == null) {
            return f17694a;
        }
        String str = afcXbsData.type;
        if (StringUtils.equals(str, "1") && !StringUtils.isEmpty(afcXbsData.tipsIcon)) {
            if (!this.i) {
                this.x.getLayoutParams().width = (int) TFCCommonUtils.a(71.0f);
            }
            this.y.setVisibility(0);
            this.w.setImageUrl(afcXbsData.tipsIcon);
            this.z.setVisibility(8);
            this.B.setVisibility(0);
            return f17694a;
        } else if (StringUtils.equals(str, "2") && !StringUtils.isEmpty(afcXbsData.appName)) {
            if (!this.i) {
                this.x.getLayoutParams().width = (int) TFCCommonUtils.a(78.0f);
            }
            this.z.setVisibility(0);
            this.A.setText(a(afcXbsData.appName));
            this.y.setVisibility(8);
            this.B.setVisibility(8);
            return f17694a;
        } else if (StringUtils.equals(str, "3") && !StringUtils.isEmpty(afcXbsData.tipsIcon)) {
            this.y.setVisibility(0);
            this.w.setImageUrl(afcXbsData.tipsIcon);
            this.z.setVisibility(0);
            this.A.setText(a(afcXbsData.appName));
            this.B.setVisibility(8);
            return f17694a;
        } else {
            if (!this.i) {
                this.x.getLayoutParams().width = (int) TFCCommonUtils.a(57.0f);
            }
            this.B.setVisibility(0);
            this.y.setVisibility(8);
            this.z.setVisibility(8);
            return f17694a;
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || str.length() <= 4) {
            return str;
        }
        return str.substring(0, 4) + "...";
    }

    public TBFloatingLayer a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFloatingLayer) ipChange.ipc$dispatch("c4d2e1b6", new Object[]{this, dVar});
        }
        if (dVar != null) {
            this.r = dVar;
        }
        return f17694a;
    }

    public TBFloatingLayer a(FloatingType floatingType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFloatingLayer) ipChange.ipc$dispatch("bb1d1042", new Object[]{this, floatingType});
        }
        this.s = floatingType;
        return f17694a;
    }

    public TBFloatingLayer a(BigDecimal bigDecimal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFloatingLayer) ipChange.ipc$dispatch("572cd242", new Object[]{this, bigDecimal});
        }
        this.c = bigDecimal;
        return f17694a;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.p = Globals.getApplication().getResources().getDisplayMetrics().heightPixels;
        this.f = new WindowManager.LayoutParams(-2, -2, 1003, 520, -3);
        WindowManager.LayoutParams layoutParams = this.f;
        layoutParams.gravity = 51;
        layoutParams.x = 0;
        layoutParams.y = (this.p / 6) << 2;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            LayoutInflater layoutInflater = (LayoutInflater) Globals.getApplication().getSystemService("layout_inflater");
            if (this.i) {
                this.d = (LinearLayout) layoutInflater.inflate(R.layout.alibc_tipsview_layer_layout_new, (ViewGroup) null);
            } else {
                this.d = (LinearLayout) layoutInflater.inflate(R.layout.alibc_tipsview_layer_layout, (ViewGroup) null);
            }
            this.n = (LinearLayout) this.d.findViewById(R.id.layer_hidepart);
            this.d.setLayoutParams(this.f);
            this.x = (LinearLayout) this.d.findViewById(R.id.alibc_tips_container);
            this.y = (RelativeLayout) this.d.findViewById(R.id.alibc_tips_icon);
            this.w = (TUrlImageView) this.d.findViewById(R.id.alibc_circle_imageview);
            this.w.setErrorImageResId(R.drawable.alibc_placeholder);
            this.o = (TextView) this.d.findViewById(R.id.layer_content);
            this.z = (FrameLayout) this.d.findViewById(R.id.app_name_container);
            this.A = (TextView) this.d.findViewById(R.id.app_name);
            this.B = (TextView) this.d.findViewById(R.id.back_text);
            if (this.i) {
                this.C = this.d.findViewById(R.id.alibc_tips_close);
                this.C.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.linkmanager.afc.xbs.TBFloatingLayer.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        TBFloatingLayer tBFloatingLayer;
                        FloatingShowStatus floatingShowStatus;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        if (TBFloatingLayer.a(TBFloatingLayer.this) == FloatingType.SHOW_ALWAYS) {
                            tBFloatingLayer = TBFloatingLayer.this;
                            floatingShowStatus = FloatingShowStatus.HIDE;
                        } else {
                            tBFloatingLayer = TBFloatingLayer.this;
                            floatingShowStatus = FloatingShowStatus.CLOSE;
                        }
                        TBFloatingLayer.a(tBFloatingLayer, floatingShowStatus);
                        if (TBFloatingLayer.b(TBFloatingLayer.this) == null) {
                            return;
                        }
                        TBFloatingLayer.b(TBFloatingLayer.this).a(c.CLOSE_REASON_CLOSE_BTN);
                    }
                });
            }
            this.e = (WindowManager) Globals.getApplication().getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        } catch (Throwable unused) {
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.d.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.linkmanager.afc.xbs.TBFloatingLayer.2
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
                        Method dump skipped, instructions count: 553
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.linkmanager.afc.xbs.TBFloatingLayer.AnonymousClass2.onTouch(android.view.View, android.view.MotionEvent):boolean");
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
            if (a() == null || this.d == null || this.t != FloatingShowStatus.CLOSE) {
                return;
            }
            b = true;
            this.t = FloatingShowStatus.SHOW;
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "TBFloatingLayer  === show ==  小把手绘制ing");
            if (koi.a().f30190a == null) {
                return;
            }
            a(koi.a().f30190a.get());
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "TBFloatingLayer  === show == mShowStatus: " + this.t);
            this.d.postDelayed(new Runnable() { // from class: com.taobao.linkmanager.afc.xbs.TBFloatingLayer.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TBFloatingLayer.this.f.x = -TBFloatingLayer.this.d.getWidth();
                    try {
                        TBFloatingLayer.this.e.updateViewLayout(TBFloatingLayer.this.d, TBFloatingLayer.this.f);
                    } catch (Exception unused) {
                    }
                    TBFloatingLayer.this.d.setVisibility(0);
                    TBFloatingLayer tBFloatingLayer = TBFloatingLayer.this;
                    TBFloatingLayer.a(tBFloatingLayer, new b());
                    TBFloatingLayer.a(TBFloatingLayer.this, new Timer());
                    TBFloatingLayer.l(TBFloatingLayer.this).schedule(TBFloatingLayer.k(TBFloatingLayer.this), 0L, 16L);
                }
            }, 100L);
        } catch (Exception e) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "TBFloatingLayer == show 小把手展示异常了： " + e.getMessage());
        }
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        try {
            long serverTime = TimestampSynchronizer.getServerTime();
            String str = "TBFloatingLayer === showView中获取服务器时间 = " + serverTime;
            BigDecimal valueOf = BigDecimal.valueOf(serverTime);
            if (this.c.floatValue() > 0.0f && valueOf.subtract(this.c).floatValue() >= 0.0f) {
                b = false;
                f17694a = null;
                if (this.r == null) {
                    return;
                }
                this.r.b();
            } else if (a() == null || !b) {
            } else {
                this.h = new a(activity);
                this.g.postDelayed(this.h, 1000L);
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
            this.e.removeViewImmediate(this.d);
            this.f.token = null;
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
                this.e.removeViewImmediate(this.d);
                this.f.token = null;
            } catch (Exception unused) {
            }
            f17694a = null;
        } catch (Throwable unused2) {
        }
    }

    /* loaded from: classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f17698a = 0;
        private Activity c;

        static {
            kge.a(2090853479);
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
            } else if (this.c == null || !TBFloatingLayer.b || this.c.isFinishing()) {
            } else {
                try {
                    iBinder = this.c.getWindow().getDecorView().getWindowToken();
                } catch (Exception unused) {
                    iBinder = null;
                }
                if (iBinder != null) {
                    try {
                        try {
                            TBFloatingLayer.this.f.token = iBinder;
                            TBFloatingLayer.this.d.setVisibility(0);
                            TBFloatingLayer.this.e.addView(TBFloatingLayer.this.d, TBFloatingLayer.this.f);
                            com.taobao.flowcustoms.afc.utils.c.a("linkx", "ShowRunnable addView");
                            if (TBFloatingLayer.m(TBFloatingLayer.this).compareAndSet(false, true)) {
                                TBFloatingLayer.b(TBFloatingLayer.this).a(koi.a().b());
                            }
                            this.c = null;
                            return;
                        } catch (Exception unused2) {
                            if (TBFloatingLayer.this.d.getParent() != null) {
                                TBFloatingLayer.this.e.removeView(TBFloatingLayer.this.d);
                            }
                            TBFloatingLayer.this.e.addView(TBFloatingLayer.this.d, TBFloatingLayer.this.f);
                            return;
                        }
                    } catch (Exception unused3) {
                    }
                }
                this.f17698a++;
                if (TBFloatingLayer.this.f != null) {
                    TBFloatingLayer.this.f.token = null;
                }
                if (this.f17698a >= 10 || TBFloatingLayer.this.h == null) {
                    return;
                }
                TBFloatingLayer.this.g.postDelayed(TBFloatingLayer.this.h, 500L);
            }
        }
    }

    /* loaded from: classes7.dex */
    public class b extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f17699a;
        public int b;

        static {
            kge.a(-79357943);
        }

        public b() {
            if (TBFloatingLayer.j(TBFloatingLayer.this) == FloatingShowStatus.CLOSE) {
                this.f17699a = -TBFloatingLayer.this.d.getWidth();
            } else if (TBFloatingLayer.j(TBFloatingLayer.this) == FloatingShowStatus.HIDE) {
                this.f17699a = -TBFloatingLayer.e(TBFloatingLayer.this).getWidth();
            } else {
                this.f17699a = 0;
            }
            this.b = TBFloatingLayer.this.f.y;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                TBFloatingLayer.this.g.post(new Runnable() { // from class: com.taobao.linkmanager.afc.xbs.TBFloatingLayer.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        if (Math.abs(TBFloatingLayer.this.f.x - b.this.f17699a) <= 4 || Math.abs(TBFloatingLayer.this.f.y - b.this.b) <= 4) {
                            TBFloatingLayer.this.f.x = b.this.f17699a;
                            TBFloatingLayer.this.f.y = b.this.b;
                            b.this.cancel();
                            TBFloatingLayer.l(TBFloatingLayer.this).cancel();
                        } else {
                            TBFloatingLayer.this.f.x = ((b.this.f17699a - TBFloatingLayer.this.f.x) / 4) + TBFloatingLayer.this.f.x;
                            TBFloatingLayer.this.f.y = ((b.this.b - TBFloatingLayer.this.f.y) / 4) + TBFloatingLayer.this.f.y;
                        }
                        try {
                            TBFloatingLayer.this.e.updateViewLayout(TBFloatingLayer.this.d, TBFloatingLayer.this.f);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (TBFloatingLayer.j(TBFloatingLayer.this) != FloatingShowStatus.CLOSE) {
                            return;
                        }
                        TBFloatingLayer.this.d();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}
