package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.media.frame.a;
import com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.Globals;
import com.taobao.tao.util.SystemBarDecorator;

/* loaded from: classes5.dex */
public class xjg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NdQuickJumpManager";

    /* renamed from: a  reason: collision with root package name */
    private static volatile xjg f34324a;
    private static volatile long b;
    private static String t;
    private boolean c;
    private Intent d;
    private boolean e;
    private boolean f;
    private boolean g;
    private Runnable h;
    private Runnable i;
    private Runnable j;
    private Runnable k;
    private Runnable l;
    private ImageView m;
    private FrameLayout n;
    private FrameLayout o;
    private mvl p;
    private SystemBarDecorator q;
    private xji r;
    private a s;

    public static /* synthetic */ ImageView a(xjg xjgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("1a1c51ed", new Object[]{xjgVar}) : xjgVar.m;
    }

    static {
        kge.a(1386564203);
        b = -1L;
        t = null;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!xji.c()) {
        } else {
            t = fky.e(Globals.getApplication());
        }
    }

    public xjg(boolean z, xji xjiVar) {
        this.c = z;
        this.r = xjiVar;
    }

    public xji b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xji) ipChange.ipc$dispatch("16be71a6", new Object[]{this}) : this.r;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc666a1", new Object[]{this, aVar});
        } else {
            this.s = aVar;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.g;
    }

    public void a(mvl mvlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5461815", new Object[]{this, mvlVar});
        } else {
            this.p = mvlVar;
        }
    }

    public static void a(long j, xjg xjgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b084fdf7", new Object[]{new Long(j), xjgVar});
            return;
        }
        f34324a = xjgVar;
        b = j;
    }

    public SystemBarDecorator d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SystemBarDecorator) ipChange.ipc$dispatch("248e63b6", new Object[]{this}) : this.q;
    }

    public static xjg a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xjg) ipChange.ipc$dispatch("dab32695", new Object[]{new Long(j)});
        }
        xjg xjgVar = (j <= 0 || b != j) ? null : f34324a;
        f34324a = null;
        return xjgVar;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            ipa.N().postDelayed(runnable, fkt.t());
        }
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        this.d = intent;
        this.e = true;
        Runnable runnable = this.h;
        if (runnable == null) {
            return;
        }
        xjh.a(runnable, this.d);
        ipa.N().postDelayed(this.h, fkt.r());
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
        } else if (!this.c) {
            runnable.run();
        } else if (this.e) {
            xjh.a(runnable, this.d);
            ipa.N().postDelayed(runnable, fkt.r());
        } else {
            this.h = runnable;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f = true;
        Runnable runnable = this.i;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.j;
        if (runnable2 != null) {
            runnable2.run();
        }
        Runnable runnable3 = this.l;
        if (runnable3 != null) {
            runnable3.run();
        }
        Runnable runnable4 = this.k;
        if (runnable4 == null) {
            return;
        }
        runnable4.run();
    }

    public void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1ace8", new Object[]{this, runnable});
        } else if (!this.c) {
            runnable.run();
        } else if (this.f) {
            runnable.run();
        } else {
            this.i = runnable;
        }
    }

    public void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9021f9e9", new Object[]{this, runnable});
        } else if (!this.c) {
            runnable.run();
        } else if (this.f) {
            runnable.run();
        } else {
            this.j = runnable;
        }
    }

    public void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("145246ea", new Object[]{this, runnable});
        } else if (!this.c) {
            runnable.run();
        } else if (this.f) {
            runnable.run();
        } else {
            this.l = runnable;
        }
    }

    public void f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988293eb", new Object[]{this, runnable});
        } else if (!this.c) {
            runnable.run();
        } else if (this.f) {
            runnable.run();
        } else {
            this.k = runnable;
        }
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        this.o = this.n;
        NewDetailMaskFrameLayout newDetailMaskFrameLayout = null;
        if (c()) {
            FrameLayout frameLayout = this.n;
            NewDetailMaskFrameLayout newDetailMaskFrameLayout2 = new NewDetailMaskFrameLayout(activity);
            newDetailMaskFrameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            newDetailMaskFrameLayout2.addView(frameLayout);
            FrameLayout frameLayout2 = new FrameLayout(activity);
            frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout2.addView(newDetailMaskFrameLayout2);
            this.o = frameLayout2;
            this.p.a(activity, newDetailMaskFrameLayout2, frameLayout2);
            newDetailMaskFrameLayout = newDetailMaskFrameLayout2;
        }
        activity.setContentView(this.o);
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        Window window = activity.getWindow();
        int statusBarColor = window.getStatusBarColor();
        if (c()) {
            if (newDetailMaskFrameLayout != null) {
                newDetailMaskFrameLayout.setBackgroundColor(statusBarColor);
            }
            this.q = new SystemBarDecorator(activity);
            this.q.enableImmersiveStatusBar(true);
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(statusBarColor));
    }

    public boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{this, activity})).booleanValue();
        }
        Intent intent = activity.getIntent();
        String stringExtra = intent.getStringExtra("ndNavMainPicUrl");
        int intExtra = intent.getIntExtra("ndNavMainPicWidth", 0);
        int intExtra2 = intent.getIntExtra("ndNavMainPicHeight", 0);
        if (intExtra <= 0 || intExtra2 <= 0) {
            this.c = false;
            qxo.a("Error:没有读取到 ndNavMainPicWidth 或 ndNavMainPicHeight", null);
            return false;
        } else if (this.s == null) {
            this.c = false;
            qxo.a("Error:mMediaFrameSizeObject 为空。", null);
            return false;
        } else {
            FrameLayout frameLayout = new FrameLayout(activity);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            final ImageView imageView = new ImageView(activity);
            this.m = imageView;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(intExtra, intExtra2);
            layoutParams.gravity = 48;
            layoutParams.topMargin = this.s.e;
            imageView.setScaleType(this.s.h);
            imageView.setLayoutParams(layoutParams);
            b.h().a(stringExtra).addLoaderExtra(esr.BUNDLE_BIZ_CODE, fln.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.xjg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    imageView.setImageDrawable(succPhenixEvent.getDrawable());
                    return true;
                }
            }).fetch();
            frameLayout.addView(imageView);
            this.n = frameLayout;
            return true;
        }
    }

    public boolean a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cabb048d", new Object[]{this, activity, new Integer(i)})).booleanValue();
        }
        if (!this.c) {
            return false;
        }
        this.n.addView(LayoutInflater.from(activity).inflate(i, (ViewGroup) this.n, false), 0);
        return true;
    }

    public boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        if (!this.c) {
            return false;
        }
        this.n.addView(view, 0);
        return true;
    }

    public void b(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (c()) {
            ipa.N().postDelayed(new Runnable() { // from class: tb.xjg.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        xjg.a(xjg.this).setAlpha(0.0f);
                    }
                }
            }, 500L);
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            ofFloat.setDuration(fkt.s());
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: tb.xjg.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    view.setAlpha(1.0f);
                    xjg.a(xjg.this).setAlpha(0.0f);
                }
            });
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.xjg.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else {
                        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                }
            });
            view.setAlpha(0.01f);
            ofFloat.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0181 A[Catch: Exception -> 0x0189, TRY_LEAVE, TryCatch #1 {Exception -> 0x0189, blocks: (B:82:0x014b, B:90:0x0173, B:92:0x0181), top: B:105:0x014b }] */
    /* JADX WARN: Type inference failed for: r4v8, types: [F, com.alibaba.fastjson.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Intent r11, tb.ojy<com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject> r12, tb.xjg r13) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xjg.a(android.content.Intent, tb.ojy, tb.xjg):boolean");
    }
}
