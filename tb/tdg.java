package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.taobao.R;
import tb.shm;

/* loaded from: classes5.dex */
public class tdg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_LIVE_DELAY_TIME = 1000;
    public static final int MAX_LIVE_DELAY_TIME = 60000;
    private static long e;

    /* renamed from: a  reason: collision with root package name */
    private sic f34043a;
    private Context b;
    private FluidContext c;
    private Handler d;

    public static /* synthetic */ Context a(tdg tdgVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9377915f", new Object[]{tdgVar, context});
        }
        tdgVar.b = context;
        return context;
    }

    public static /* synthetic */ sic a(tdg tdgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sic) ipChange.ipc$dispatch("f7d5d8b8", new Object[]{tdgVar}) : tdgVar.f34043a;
    }

    public static /* synthetic */ void a(tdg tdgVar, sic sicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f676504", new Object[]{tdgVar, sicVar});
        } else {
            tdgVar.a(sicVar);
        }
    }

    static {
        kge.a(-968437962);
        e = 0L;
    }

    public tdg(final sic sicVar) {
        this.f34043a = sicVar;
        this.c = sicVar.z();
        this.f34043a.t().addCardLifecycleListener(new shm.a() { // from class: tb.tdg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -1355309186) {
                    super.onCreateView((psw) objArr[0], (snp) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // tb.shm.a, tb.shm
            public void onCreateView(psw pswVar, snp snpVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
                    return;
                }
                super.onCreateView(pswVar, snpVar);
                tdg.a(tdg.this, sicVar.y());
            }
        });
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!c()) {
        } else {
            spz.c("LiveWarmupManager", "onPreCreateDWInstance");
            if (g() == 0) {
                spz.c("LiveWarmupManager", "首坑，不执行预热");
                return;
            }
            if (this.d == null) {
                f();
            }
            b();
            this.f34043a.a(true);
            int d = d();
            if (d <= 0 || d >= 60000) {
                if (d == 0) {
                    spz.c("LiveWarmupManager", "直接创建播放器");
                    this.f34043a.S();
                    return;
                }
                spz.c("LiveWarmupManager", "不满足预热条件");
                return;
            }
            spz.c("LiveWarmupManager", "延迟x ms创建播放器，x=：" + d);
            this.d.sendEmptyMessageDelayed(0, (long) d);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.d = new Handler(Looper.getMainLooper()) { // from class: tb.tdg.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                    } else if (tdg.a(tdg.this) == null) {
                    } else {
                        tdg.a(tdg.this).S();
                        tdg tdgVar = tdg.this;
                        tdg.a(tdgVar, tdg.a(tdgVar));
                        spz.c("LiveWarmupManager", "onPreCreateDWInstance videoAppearPlay 请求播放器,appeared:" + tdg.a(tdg.this).I() + "，position" + tdg.a(tdg.this).r());
                    }
                }
            };
        }
    }

    private void a(sic sicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec7e2eb", new Object[]{this, sicVar});
        } else if (sicVar == null || sicVar.q() == null || this.b == null) {
            spz.c("LiveWarmupManager", " mediaView is null");
        } else {
            spz.c("LiveWarmupManager", "window is null，mContext:" + this.b);
            Window window = ((Activity) this.b).getWindow();
            if (window == null) {
                spz.c("LiveWarmupManager", "window is null");
                return;
            }
            View decorView = window.getDecorView();
            if (!(decorView instanceof ViewGroup)) {
                spz.c("LiveWarmupManager", "decorView not instanceof ViewGroup");
                return;
            }
            ViewGroup q = sicVar.q();
            if (q.getParent() != null) {
                ((ViewGroup) q.getParent()).removeView(q);
            }
            spz.c("LiveWarmupManager", "preBindVideoView");
            q.setTag(R.id.fluid_sdk_live_view_to_decorView, true);
            ((ViewGroup) decorView).addView(q, 0, new ViewGroup.LayoutParams(1, 1));
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d == null) {
        } else {
            spz.c("LiveWarmupManager", "videoAppearPlay,removePreCreatePlayerMessages");
            this.d.removeMessages(0);
        }
    }

    private int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        sic sicVar = this.f34043a;
        if (sicVar == null) {
            return 0;
        }
        return sicVar.r();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableLivWarmupLiveStream", true) && h();
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue() : oeb.a("ShortVideo.livePlayerDelayTime", 1000);
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        spz.c("LiveWarmupManager", "getABBucketId,AB config bucketId:" + e);
        return String.valueOf(e);
    }

    private static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue();
        }
        String b = oeb.b("AB_fullscreenpage_video.live_warmup.isOpenWarmup", String.valueOf(false));
        boolean equals = StringUtils.equals("true", b);
        spz.c("LiveWarmupManager", "AB config enable:" + equals);
        if (StringUtils.equals(b, String.valueOf(true)) || StringUtils.equals(b, String.valueOf(false))) {
            i();
        }
        return equals;
    }

    private static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
        } else if (e != 0) {
            spz.c("LiveWarmupManager", "AB config bucketId不为null:" + e);
        } else {
            VariationSet activate = UTABTest.activate("AB_fullscreenpage_video", "live_warmup");
            if (activate == null) {
                return;
            }
            e = activate.getExperimentBucketId();
            spz.c("LiveWarmupManager", "AB config bucketId:" + e);
        }
    }
}
