package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IScrollListener;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.context.c;
import com.taobao.metrickit.event.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class mlf extends b implements IScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f31088a;

    @Override // com.taobao.metrickit.event.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : c.SWITCH_SCROLL_EVENT;
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollEnd(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a820af52", new Object[]{this, activity, str});
        }
    }

    public mlf() {
        super(new Handler(Looper.getMainLooper()));
        this.f31088a = new HashMap();
        d();
        e();
    }

    @Override // com.taobao.metrickit.event.b
    public int[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[]{this}) : new int[]{9, 10, 11, 12};
    }

    @Override // com.taobao.metrickit.event.b
    public void a(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee74df14", new Object[]{this, metricContext});
        } else {
            com.taobao.application.common.c.a(this);
        }
    }

    @Override // com.taobao.metrickit.event.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.application.common.c.b(this);
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onDoFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ad383a", new Object[]{this, new Long(j)});
            return;
        }
        this.f31088a.clear();
        this.f31088a.put("frameTimeNanos", Long.valueOf(j));
        a(9, this.f31088a);
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onStopMonitorDoFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4729dd0", new Object[]{this});
            return;
        }
        this.f31088a.clear();
        a(10, this.f31088a);
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollStart(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b005994", new Object[]{this, activity, new Integer(i)});
        } else if (i != 1) {
        } else {
            this.f31088a.clear();
            this.f31088a.put("activity", activity != null ? activity.getClass().getName() : null);
            a(11, this.f31088a);
            this.f31088a.clear();
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollEnd(Activity activity, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc32d85", new Object[]{this, activity, new Integer(i), str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("activity", activity != null ? activity.getClass().getName() : null);
        hashMap.put("blockFrameMetrics", str);
        hashMap.put("scrollHitchRate", Integer.valueOf(i));
        a(12, hashMap);
    }
}
