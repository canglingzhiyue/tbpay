package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.context.c;
import com.taobao.metrickit.event.f;

/* loaded from: classes7.dex */
public class mlg extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static mlg f31089a;

    public static /* synthetic */ Object ipc$super(mlg mlgVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -294330604) {
            super.a((MetricContext) objArr[0]);
            return null;
        } else if (hashCode != 92838762) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c();
            return null;
        }
    }

    @Override // com.taobao.metrickit.event.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : c.SWITCH_ALARM_MANAGER_PROXY_EVENT;
    }

    public mlg(Handler handler) {
        super(handler);
    }

    @Override // com.taobao.metrickit.event.b
    public int[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[]{this}) : new int[]{23, 24};
    }

    @Override // com.taobao.metrickit.event.f, com.taobao.metrickit.event.b
    public void a(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee74df14", new Object[]{this, metricContext});
            return;
        }
        super.a(metricContext);
        f31089a = this;
    }

    @Override // com.taobao.metrickit.event.f, com.taobao.metrickit.event.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        f31089a = null;
    }
}
