package tb;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.FrameMetrics;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.room.utils.k;
import com.taobao.taolive.sdk.goodlist.l;
import com.taobao.taolive.sdk.utils.b;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class hia {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean ENABLED;
    private Window.OnFrameMetricsAvailableListener d;

    /* renamed from: a  reason: collision with root package name */
    public long f28677a = 0;
    public long f = 0;
    public long b = 0;
    public int g = 0;
    public long c = 0;
    private boolean e = false;

    public static /* synthetic */ boolean a(hia hiaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ec01ab5c", new Object[]{hiaVar})).booleanValue() : hiaVar.e;
    }

    static {
        kge.a(1513712250);
        ENABLED = hiw.a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c = 0L;
        this.b = 0L;
        this.f28677a = 0L;
        this.f = 0L;
        this.g = 0;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (!ENABLED || Build.VERSION.SDK_INT < 26) {
        } else {
            final long nanos = TimeUnit.SECONDS.toNanos(1L) / ((int) activity.getWindowManager().getDefaultDisplay().getRefreshRate());
            this.d = new Window.OnFrameMetricsAvailableListener() { // from class: tb.hia.1
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                    if (hia.a(hia.this)) {
                        FrameMetrics frameMetrics2 = new FrameMetrics(frameMetrics);
                        long metric = frameMetrics2.getMetric(11) - frameMetrics2.getMetric(10);
                        long j = metric / nanos;
                        hia.this.c += Math.max(metric, nanos);
                        hia.this.b += j;
                        hia.this.g++;
                        if (j >= 5) {
                            hia.this.f28677a++;
                        }
                        if (j >= 3) {
                            hia.this.f++;
                        }
                        if (!a.d()) {
                            return;
                        }
                        float nanos2 = (float) TimeUnit.MILLISECONDS.toNanos(1L);
                        String str = "\ndrop frames: " + j + "\ntotal duration: " + (((float) frameMetrics2.getMetric(8)) / nanos2) + "ms\ninput duration: " + (((float) frameMetrics2.getMetric(1)) / nanos2) + "ms\n animation duration: " + (((float) frameMetrics2.getMetric(2)) / nanos2) + "ms\nmeasure + layout duration: " + (((float) frameMetrics2.getMetric(3)) / nanos2) + "ms\ndraw duration: " + (((float) frameMetrics2.getMetric(4)) / nanos2) + "ms\n";
                    }
                }
            };
            activity.getWindow().addOnFrameMetricsAvailableListener(this.d, new Handler());
        }
    }

    public void a(Activity activity, c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1befec2", new Object[]{this, activity, cVar, new Integer(i)});
        } else if (!ENABLED || Build.VERSION.SDK_INT < 26) {
        } else {
            try {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this.d);
                this.d = null;
                float nanos = ((float) this.c) / ((float) TimeUnit.SECONDS.toNanos(1L));
                l j = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j();
                if (j == null || nanos <= 0.0f || b.d(activity)) {
                    return;
                }
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("jank_frames_5", String.valueOf(this.f28677a));
                hashMap.put("jank_frames_3", String.valueOf(this.f));
                hashMap.put("skipped_frames", String.valueOf(this.b));
                hashMap.put("frame_sum", String.valueOf(this.g));
                hashMap.put("duration", String.valueOf(nanos));
                hashMap.put("skipped_frames_per_second", String.valueOf(((float) this.b) / nanos));
                hashMap.put("deviceLevel", "" + k.a());
                hashMap.put("gl_opt", "" + a.i());
                String str = "1";
                hashMap.put("glNewPage", a.a(cVar) ? str : "0");
                if (!a.w()) {
                    str = "0";
                }
                hashMap.put("cdnCache", str);
                hashMap.put("scrollStopTimes", "" + i);
                hashMap.put("trackV", "4");
                j.a("tblive_gl_trace", hashMap);
                his.b("FrameTracer", "unregisterFrameListener | jankFramesSum_5=" + this.f28677a + " jankFramesSum_3=" + this.f + " skipped_frames=" + this.b + " frame_sum=" + this.g + " duration=" + nanos + " skipped_frames_per_second=" + (((float) this.b) / nanos));
                a();
            } catch (IllegalArgumentException e) {
                Log.e("FrameTracer", e.toString());
            }
        }
    }
}
