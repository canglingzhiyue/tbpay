package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.monitor.bean.LiveAPMBean;
import com.taobao.taolive.sdk.utils.u;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public class pqb implements Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float i;
    private float j;
    private int n;

    /* renamed from: a  reason: collision with root package name */
    private float f32807a = 16.6f;
    private float b = 700.0f;
    private float c = 500.0f;
    private float d = 300.0f;
    private float e = 100.0f;
    private float f = 150.0f;
    private float g = 33.2f;
    private float h = 49.800003f;
    private long k = -1;
    private long l = -1;
    private long m = 0;
    private CopyOnWriteArrayList<LiveAPMBean> o = new CopyOnWriteArrayList<>();
    private a p = new a(Looper.getMainLooper());

    /* loaded from: classes8.dex */
    public static class a extends Handler {
        static {
            kge.a(-1585506890);
        }

        public a(Looper looper) {
            super(looper);
        }
    }

    static {
        kge.a(-2021709143);
        kge.a(-569788179);
    }

    public static /* synthetic */ CopyOnWriteArrayList a(pqb pqbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("53656f24", new Object[]{pqbVar}) : pqbVar.o;
    }

    public static /* synthetic */ long b(pqb pqbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e89ca72c", new Object[]{pqbVar})).longValue() : pqbVar.k;
    }

    public static /* synthetic */ a c(pqb pqbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ca65e6ef", new Object[]{pqbVar}) : pqbVar.p;
    }

    public pqb() {
        this.i = 100.0f;
        this.j = 150.0f;
        this.i = (float) u.aM();
        this.j = (float) u.aN();
    }

    public void a(WeakReference<Context> weakReference, final LiveAPMBean liveAPMBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0292d6a", new Object[]{this, weakReference, liveAPMBean});
        } else if (this.p == null) {
        } else {
            this.f32807a = 1000.0f / a(weakReference);
            this.k = System.nanoTime();
            this.l = this.k;
            if (liveAPMBean == null) {
                pmd.a().m().b("HitchRateStage", "liveAPMBean is null return");
            } else {
                this.p.post(new Runnable() { // from class: tb.pqb.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (pqb.a(pqb.this).size() <= 0 || pqb.b(pqb.this) <= 0) {
                            pqb.a(pqb.this).add(liveAPMBean);
                            Choreographer.getInstance().postFrameCallback(pqb.this);
                            pmd.a().m().b("HitchRateStage", "post main thread start postFrameCallback");
                        } else {
                            pqb.a(pqb.this).add(liveAPMBean);
                            pnj m = pmd.a().m();
                            m.b("HitchRateStage", "post main thread start addListener" + liveAPMBean);
                        }
                    }
                });
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.m = 0L;
        this.k = -1L;
        this.l = -1L;
        this.n = 0;
    }

    public void a(final LiveAPMBean liveAPMBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16baa278", new Object[]{this, liveAPMBean});
            return;
        }
        a aVar = this.p;
        if (aVar == null) {
            return;
        }
        aVar.post(new Runnable() { // from class: tb.pqb.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (liveAPMBean == null) {
                    Choreographer.getInstance().removeFrameCallback(pqb.this);
                    pqb.a(pqb.this).clear();
                    pqb.this.a();
                    pmd.a().m().b("HitchRateStage", "post main thread intercept remove all monitor");
                    pqb.c(pqb.this).removeCallbacksAndMessages(null);
                } else {
                    if (pqb.a(pqb.this).contains(liveAPMBean)) {
                        pqb.a(pqb.this).remove(liveAPMBean);
                        pnj m = pmd.a().m();
                        m.b("HitchRateStage", "post main thread end remove liveAPMBean：" + liveAPMBean.hashCode());
                    }
                    if (pqb.a(pqb.this).size() != 0) {
                        return;
                    }
                    Choreographer.getInstance().removeFrameCallback(pqb.this);
                    pqb.this.a();
                    pmd.a().m().b("HitchRateStage", "post main thread end remove all monitor");
                }
            }
        });
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long j2;
        float f;
        LiveAPMBean.PerformanceData performanceData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
            return;
        }
        Choreographer.getInstance().postFrameCallback(this);
        double d = ((j - this.l) * 1.0d) / 1000000.0d;
        if (d > this.f32807a) {
            this.m = ((float) this.m) + (((float) j2) - f);
        }
        this.n++;
        this.l = j;
        CopyOnWriteArrayList<LiveAPMBean> copyOnWriteArrayList = this.o;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        for (int i = 0; i < this.o.size(); i++) {
            LiveAPMBean liveAPMBean = this.o.get(i);
            if (liveAPMBean.isWholeSession) {
                if (liveAPMBean.endPerformanceData == null) {
                    liveAPMBean.endPerformanceData = new LiveAPMBean.PerformanceData();
                }
                performanceData = liveAPMBean.endPerformanceData;
            } else {
                performanceData = liveAPMBean.totalPerformanceData;
            }
            if (performanceData.allFrameNums == 0) {
                performanceData.startTime = System.currentTimeMillis();
            }
            performanceData.allFrameNums++;
            if (d > this.f32807a && d <= this.e) {
                performanceData.frameNumsNormal_100++;
            } else if (d > this.e && d <= this.d) {
                performanceData.frameNums100_300++;
            } else if (d > this.d && d <= this.c) {
                performanceData.frameNums300_500++;
            } else if (d > this.c && d <= this.b) {
                performanceData.frameNums500_700++;
            } else if (d > this.b) {
                performanceData.freezeFrameNums++;
            }
            if (u.aK()) {
                if (d > this.e && d <= this.f) {
                    performanceData.frameNums100_150++;
                } else if (d > this.f && d <= this.d) {
                    performanceData.frameNums150_300++;
                }
            }
            if (u.aL()) {
                float f2 = this.i;
                if (d <= f2) {
                    performanceData.f0_t1++;
                } else if (d > f2 && d <= this.j) {
                    performanceData.ft1_t2++;
                } else {
                    performanceData.ft2_x++;
                }
                if (d >= this.g && d <= this.h) {
                    performanceData.seriousFrames++;
                } else if (d > this.h) {
                    performanceData.stuckFrames++;
                }
            }
            if (d > this.f32807a) {
                performanceData.hitchTotal = ((float) performanceData.hitchTotal) + (((float) j2) - this.f32807a);
            }
        }
    }

    private float a(WeakReference weakReference) {
        WindowManager windowManager;
        Display defaultDisplay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8bb9cf26", new Object[]{this, weakReference})).floatValue();
        }
        if (weakReference != null && weakReference.get() != null && (weakReference.get() instanceof Activity) && (windowManager = ((Activity) weakReference.get()).getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            return defaultDisplay.getRefreshRate();
        }
        return 60.0f;
    }
}
