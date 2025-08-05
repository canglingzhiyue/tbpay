package tb;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.view.FrameMetrics;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.f;
import com.taobao.application.common.impl.b;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.data.thread.LooperObserver;
import com.taobao.monitor.impl.util.LimitedQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes7.dex */
public class mnw implements Window.OnFrameMetricsAvailableListener {
    public static final int NANOS_PER_MS = 1000000;
    private volatile String c;

    /* renamed from: a  reason: collision with root package name */
    private final List<mou> f31148a = new ArrayList();
    private volatile boolean b = false;
    private final LimitedQueue<FrameMetrics> d = new LimitedQueue<>(5);

    public mnw(mou mouVar) {
        this.f31148a.add(mouVar);
    }

    public void a(final mou mouVar) {
        e.a().e().post(new Runnable() { // from class: tb.mnw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    mnw.this.f31148a.add(mouVar);
                }
            }
        });
    }

    public void b(final mou mouVar) {
        e.a().e().post(new Runnable() { // from class: tb.mnw.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    mnw.this.f31148a.remove(mouVar);
                }
            }
        });
    }

    public void a(Activity activity, String str) {
        this.c = str;
        this.b = true;
    }

    public void a(Activity activity) {
        this.b = false;
        this.d.clear();
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        String str;
        FrameMetrics frameMetrics2 = new FrameMetrics(frameMetrics);
        long metric = frameMetrics2.getMetric(8);
        long j = metric / 1000000;
        String str2 = null;
        int i2 = (j > 250L ? 1 : (j == 250L ? 0 : -1));
        if (i2 > 0) {
            f j2 = b.d().j();
            HashMap hashMap = new HashMap();
            String a2 = a(frameMetrics2, metric, hashMap);
            if ("DEFAULT".equals(a2)) {
                str2 = a(frameMetrics2, metric);
            }
            hashMap.put("totalDurationNs", Long.valueOf(metric));
            j2.onBlock(hashMap);
            this.d.add(frameMetrics2);
            str = str2;
            str2 = a2;
        } else {
            str = null;
        }
        for (mou mouVar : this.f31148a) {
            if (mouVar == null) {
                return;
            }
            mouVar.z();
            mouVar.a(i);
            if (this.b) {
                mouVar.C();
                if (i2 > 0) {
                    mouVar.E();
                    mouVar.f(str2);
                    mouVar.g(str);
                }
                if (j > 700) {
                    mouVar.G();
                }
            }
        }
        if (j > d.D) {
            a(frameMetrics2);
        }
    }

    private String a(FrameMetrics frameMetrics, long j, Map<String, Object> map) {
        String str;
        long j2 = j / 2;
        long metric = frameMetrics.getMetric(0);
        long j3 = -1;
        if (metric > j2) {
            j3 = Math.max(-1L, metric);
            str = "UNKNOWN_DELAY";
        } else {
            str = "DEFAULT";
        }
        long metric2 = frameMetrics.getMetric(1);
        if (metric2 > j2) {
            j3 = Math.max(j3, metric2);
            str = "INPUT_HANDLING";
        }
        long metric3 = frameMetrics.getMetric(2);
        if (metric3 > j2) {
            j3 = Math.max(j3, metric3);
            str = "ANIMATION";
        }
        long metric4 = frameMetrics.getMetric(3);
        if (metric4 > j2) {
            j3 = Math.max(j3, metric4);
            str = "LAYOUT_MEASURE";
        }
        long metric5 = frameMetrics.getMetric(4);
        if (metric5 > j2) {
            j3 = Math.max(j3, metric5);
            str = "DRAW";
        }
        long metric6 = frameMetrics.getMetric(5);
        if (metric6 > j2) {
            j3 = Math.max(j3, metric6);
            str = "SYNC";
        }
        long metric7 = frameMetrics.getMetric(6);
        if (metric7 > j2) {
            j3 = Math.max(j3, metric7);
            str = "COMMAND_ISSUE";
        }
        long metric8 = frameMetrics.getMetric(7);
        if (metric8 > j2) {
            j3 = Math.max(j3, metric8);
            str = "SWAP_BUFFERS";
        }
        if (map != null) {
            map.put("mainCause", str);
            map.put("mainCauseCostNs", Long.valueOf(j3));
        }
        return str;
    }

    private String a(FrameMetrics frameMetrics, long j) {
        long j2 = (long) (j * 0.3d);
        if (frameMetrics.getMetric(0) > j2) {
            return "UNKNOWN_DELAY";
        }
        if (frameMetrics.getMetric(1) > j2) {
            return "INPUT_HANDLING";
        }
        if (frameMetrics.getMetric(2) > j2) {
            return "ANIMATION";
        }
        if (frameMetrics.getMetric(3) > j2) {
            return "LAYOUT_MEASURE";
        }
        if (frameMetrics.getMetric(4) > j2) {
            return "DRAW";
        }
        if (frameMetrics.getMetric(5) > j2) {
            return "SYNC";
        }
        if (frameMetrics.getMetric(6) > j2) {
            return "COMMAND_ISSUE";
        }
        if (frameMetrics.getMetric(7) <= j2) {
            return null;
        }
        return "SWAP_BUFFERS";
    }

    private void a(FrameMetrics frameMetrics) {
        StringBuilder sb = new StringBuilder();
        sb.append("是否滑动中(isScrolling) ");
        sb.append(this.b);
        sb.append("\t滑动类型 ");
        sb.append(this.c);
        sb.append("\n");
        a(sb, frameMetrics);
        sb.append("卡顿帧主要原因：");
        sb.append(a(a(frameMetrics, frameMetrics.getMetric(8), null)));
        if (Build.VERSION.SDK_INT >= 29) {
            LooperObserver.a a2 = LooperObserver.a(frameMetrics.getMetric(10), frameMetrics.getMetric(11));
            sb.append("\n");
            while (a2 != null) {
                sb.append(a2.toString());
                sb.append("\n");
                LooperObserver.a aVar = a2.p;
                a2.b();
                a2 = aVar;
            }
        }
        mpi.c("FrameMetricsApi24", "FrameMetrics", sb.toString());
    }

    public Queue<FrameMetrics> a() {
        return new ConcurrentLinkedQueue(this.d);
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "无法分析出原因";
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -389862556:
                if (str.equals("ANIMATION")) {
                    c = 2;
                    break;
                }
                break;
            case -292422359:
                if (str.equals("LAYOUT_MEASURE")) {
                    c = 3;
                    break;
                }
                break;
            case 2106692:
                if (str.equals("DRAW")) {
                    c = 4;
                    break;
                }
                break;
            case 2560667:
                if (str.equals("SYNC")) {
                    c = 5;
                    break;
                }
                break;
            case 241775269:
                if (str.equals("COMMAND_ISSUE")) {
                    c = 6;
                    break;
                }
                break;
            case 961277287:
                if (str.equals("SWAP_BUFFERS")) {
                    c = 7;
                    break;
                }
                break;
            case 1205952986:
                if (str.equals("INPUT_HANDLING")) {
                    c = 1;
                    break;
                }
                break;
            case 1774720270:
                if (str.equals("UNKNOWN_DELAY")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "主线程卡顿";
            case 1:
                return "输入事件处理耗时过长";
            case 2:
                return "动画处理耗时过长";
            case 3:
                return "layout 和 measure 太慢";
            case 4:
                return "draw 耗时过长";
            case 5:
                return "render线程同步耗时过长";
            case 6:
                return "向 GPU 发送绘制命令花费的耗时过长";
            case 7:
                return "交换缓冲队列耗时过长";
            default:
                return "无法分析出原因";
        }
    }

    public static void a(StringBuilder sb, FrameMetrics frameMetrics) {
        sb.append("FIRST_DRAW_FRAME(绘制的该帧是否是第一帧, 0 不是, 1 是) ");
        sb.append(frameMetrics.getMetric(9));
        sb.append("\n");
        sb.append("UNKNOWN_DELAY_DURATION(UI线程响应并开始处理渲染的等待时间) ");
        sb.append(frameMetrics.getMetric(0) / 1000000);
        sb.append("ms\n");
        sb.append("INPUT_HANDLING_DURATION(处理输入事件耗时) ");
        sb.append(frameMetrics.getMetric(1) / 1000000);
        sb.append("ms\n");
        sb.append("ANIMATION_DURATION(动画执行回调耗时) ");
        sb.append(frameMetrics.getMetric(2) / 1000000);
        sb.append("ms\n");
        sb.append("LAYOUT_MEASURE_DURATION(measure和layout耗时) ");
        sb.append(frameMetrics.getMetric(3) / 1000000);
        sb.append("ms\n");
        sb.append("DRAW_DURATION(draw耗时) ");
        sb.append(frameMetrics.getMetric(4) / 1000000);
        sb.append("ms\n");
        sb.append("SYNC_DURATION(render线程同步耗时) ");
        sb.append(frameMetrics.getMetric(5) / 1000000);
        sb.append("ms\n");
        sb.append("COMMAND_ISSUE_DURATION(向GPU发送绘制命令耗时) ");
        sb.append(frameMetrics.getMetric(6) / 1000000);
        sb.append("ms\n");
        sb.append("SWAP_BUFFERS_DURATION(交换缓冲队列耗时) ");
        sb.append(frameMetrics.getMetric(7) / 1000000);
        sb.append("ms\n");
        sb.append("TOTAL_DURATION(总耗时) ");
        sb.append(frameMetrics.getMetric(8) / 1000000);
        sb.append("ms\n");
        if (Build.VERSION.SDK_INT >= 26) {
            sb.append("VSYNC_TIMESTAMP ");
            sb.append(frameMetrics.getMetric(11));
            sb.append("\n");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            sb.append("INTENDED_VSYNC_TIMESTAMP ");
            sb.append(frameMetrics.getMetric(10));
            sb.append("\n");
        }
    }
}
