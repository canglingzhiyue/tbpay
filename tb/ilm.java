package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.a;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.metrickit.event.d;
import java.util.Map;

/* loaded from: classes6.dex */
public class ilm extends ilj implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile a b;

    static {
        kge.a(-1362804356);
        kge.a(-720983562);
    }

    public static /* synthetic */ Object ipc$super(ilm ilmVar, String str, Object... objArr) {
        if (str.hashCode() == -1608292547) {
            super.d((Context) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ilj
    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
        } else {
            EventCenter.a().a(81, this);
        }
    }

    @Override // tb.ilj
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            EventCenter.a().b(81, this);
        }
    }

    @Override // tb.ilj
    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
            return;
        }
        super.d(context);
        if (this.b == null) {
            return;
        }
        a(this.b);
    }

    @Override // com.taobao.metrickit.event.d
    public void a(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
        } else if (i != 81) {
        } else {
            Object obj = map.get("mainThreadSTime");
            Object obj2 = map.get("mainThreadUTime");
            Object obj3 = map.get("totalCpuTime");
            Object obj4 = map.get("processSTime");
            Object obj5 = map.get("processUTime");
            if (!(obj instanceof Long) || !(obj2 instanceof Long) || !(obj3 instanceof Long) || !(obj4 instanceof Long) || !(obj5 instanceof Long)) {
                return;
            }
            this.b = new a.C0567a().b(6).a(1).a("main_thread_s_time", String.valueOf(obj)).a("main_thread_u_time", String.valueOf(obj2)).a("process_s_time", String.valueOf(obj4)).a("process_u_time", String.valueOf(obj5)).a("total_cpu_time", String.valueOf(obj3)).a();
        }
    }
}
