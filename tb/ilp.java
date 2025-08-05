package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.a;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.metrickit.event.d;
import java.util.Map;

/* loaded from: classes6.dex */
public class ilp extends ilj implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final a b = new a.C0567a().a(2).b(4).a();
    private final a c = new a.C0567a().a(2).b(7).a();

    static {
        kge.a(1327790253);
        kge.a(-720983562);
    }

    public static /* synthetic */ Object ipc$super(ilp ilpVar, String str, Object... objArr) {
        if (str.hashCode() == 1933540452) {
            super.a((a) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ilj
    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        EventCenter.a().b(15).a(this);
        EventCenter.a().b(13).a(this);
        EventCenter.a().b(14).a(this);
    }

    @Override // tb.ilj
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        EventCenter.a().b(15).b(this);
        EventCenter.a().b(13).b(this);
        EventCenter.a().b(14).b(this);
    }

    public void a(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        Object obj = map.get("javaUsed");
        Object obj2 = map.get("nativeHeapAllocatedSize");
        Object obj3 = map.get("javaMax");
        if (!(obj3 instanceof Long) || !(obj instanceof Long) || !(obj2 instanceof Long)) {
            ilt.a("Memory", "new event came, but map is wrong. javaUsedRaw:" + obj + "; nativeHeapAllocatedSizeRaw:" + obj2 + "; javaTotalRaw:" + obj3);
            return;
        }
        try {
            a(new a.C0567a().b(3).a(2).a("javaUsedRate", String.valueOf((int) ((((Long) obj).longValue() * 100) / ((Long) obj3).longValue()))).a());
            a(new a.C0567a().b(9).a(2).a("nativeHeapAllocatedSize", String.valueOf(obj2)).a());
        } catch (ClassCastException e) {
            ilt.a("Memory", "EVENT_MEMORY_COLLECTED failed " + e);
        }
    }

    @Override // com.taobao.metrickit.event.d
    public void a(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
            return;
        }
        switch (i) {
            case 13:
                ilt.a("Memory", "EVENT_SYSTEM_LOW_MEMORY");
                super.a(this.c);
                return;
            case 14:
                ilt.a("Memory", "EVENT_SYSTEM_TRIM_MEMORY");
                super.a(this.b);
                return;
            case 15:
                a(map);
                return;
            default:
                return;
        }
    }
}
