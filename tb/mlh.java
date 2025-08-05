package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.context.c;
import com.taobao.metrickit.event.b;

/* loaded from: classes7.dex */
public class mlh extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static mlh f31090a;

    @Override // com.taobao.metrickit.event.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : c.SWITCH_BLUETOOTH_ADAPTER_PROXY_EVENT;
    }

    public mlh(Handler handler) {
        super(handler);
    }

    @Override // com.taobao.metrickit.event.b
    public int[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[]{this}) : new int[]{25, 26, 27, 28};
    }

    @Override // com.taobao.metrickit.event.b
    public void a(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee74df14", new Object[]{this, metricContext});
        } else {
            f31090a = this;
        }
    }

    @Override // com.taobao.metrickit.event.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            f31090a = null;
        }
    }
}
