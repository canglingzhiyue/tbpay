package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.RGTypeInfo;
import com.taobao.android.resourceguardian.data.model.b;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
public class ilg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f29134a;
    private static final String b;
    private final List<a> c = new LinkedList();

    static {
        kge.a(1160416309);
        f29134a = RGTypeInfo.a(101);
        b = RGTypeInfo.a(101) + "Duration";
    }

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f29135a;
        public long b;
        public long c;
        public long d;
        public long e;

        static {
            kge.a(-1579254920);
        }

        private a() {
        }
    }

    private float a(a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be4d9476", new Object[]{this, aVar, aVar2})).floatValue();
        }
        long j = aVar2.e - aVar.e;
        long j2 = ((aVar2.d + aVar2.c) - aVar.d) - aVar.c;
        if (j > 0) {
            return ((1000.0f / ((float) ils.f29140a)) * ((float) j2)) / ((float) j);
        }
        return 0.0f;
    }

    private float b(a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("427de177", new Object[]{this, aVar, aVar2})).floatValue();
        }
        long j = aVar2.e - aVar.e;
        long j2 = ((aVar2.b + aVar2.f29135a) - aVar.b) - aVar.f29135a;
        if (j > 0) {
            return ((1000.0f / ((float) ils.f29140a)) * ((float) j2)) / ((float) j);
        }
        return 0.0f;
    }

    private b b(com.taobao.android.resourceguardian.data.model.a aVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1cf3bb82", new Object[]{this, aVar, new Boolean(z)});
        }
        a aVar2 = new a();
        try {
            aVar2.f29135a = Long.parseLong((String) Objects.requireNonNull(aVar.c.get("main_thread_u_time")));
            aVar2.b = Long.parseLong((String) Objects.requireNonNull(aVar.c.get("main_thread_s_time")));
            aVar2.c = Long.parseLong((String) Objects.requireNonNull(aVar.c.get("process_u_time")));
            aVar2.d = Long.parseLong((String) Objects.requireNonNull(aVar.c.get("process_s_time")));
            aVar2.e = Long.parseLong((String) Objects.requireNonNull(aVar.c.get("total_cpu_time")));
            long a2 = ils.a(f29134a, "critical", 80L);
            long a3 = ils.a(b, "critical", 50L);
            this.c.add(0, aVar2);
            int i = (int) (a3 / 10);
            if (this.c.size() <= i) {
                return null;
            }
            a aVar3 = this.c.get(i);
            this.c.remove(aVar3);
            long a4 = a(aVar3, aVar2) * 100.0f;
            long b2 = b(aVar3, aVar2) * 100.0f;
            String str2 = "";
            if (a4 > a2) {
                str = String.valueOf(a4);
                str2 = "all";
            } else {
                str = str2;
            }
            if (b2 > a2) {
                str = String.valueOf(b2);
                str2 = "main";
            }
            if (!StringUtils.isEmpty(str2)) {
                return new b.a().a("critical").a(1).b(101).c(str2).b(str).a();
            }
            if (!z) {
                return null;
            }
            return new b.a().a("normal").a(1).b(101).c("main").b(String.valueOf(b2)).a();
        } catch (Exception e) {
            ilt.a("CpuLoadWarningProvider", "getCpuLoadWarning error", e.toString());
            return null;
        }
    }

    public b a(com.taobao.android.resourceguardian.data.model.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("196c1881", new Object[]{this, aVar, new Boolean(z)});
        }
        if (aVar.b != 6) {
            return null;
        }
        return b(aVar, z);
    }

    public b a(com.taobao.android.resourceguardian.data.model.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9a89c58d", new Object[]{this, aVar}) : a(aVar, false);
    }
}
