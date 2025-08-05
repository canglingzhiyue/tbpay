package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class ikr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ikr EMPTY = new ikr("EMPTY");

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Long> f29129a = new ConcurrentHashMap();
    private final Map<String, Long> b = new ConcurrentHashMap();
    private final String c;

    public ikr(String str) {
        this.c = str;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f29129a.put(str, Long.valueOf(iky.a()));
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        Long l = this.f29129a.get(str2);
        if (l == null) {
            ikq.a("stopwatch.hitAfter(), afterWhoTime == null", "params -> hitTag=" + str + ", afterWhichTag=" + str2);
            return;
        }
        long a2 = iky.a();
        this.f29129a.put(str, Long.valueOf(a2));
        this.b.put(b(str, str2), Long.valueOf(a2 - l.longValue()));
    }

    private String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        return str2 + "_2_" + str;
    }

    public Map<String, Long> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.b;
    }
}
