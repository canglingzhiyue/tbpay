package tb;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class gnu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "stageName")

    /* renamed from: a  reason: collision with root package name */
    private final String f28397a;
    @JSONField(name = "startTimeMills")
    private long b;
    @JSONField(name = "endTimeMills")
    private long c;
    @JSONField(name = "durationMills")
    private long d;

    static {
        kge.a(1855628563);
    }

    public gnu(String str, long j) {
        this(str, j, 0L);
    }

    public gnu(String str, long j, long j2) {
        this.f28397a = str;
        this.b = j;
        this.c = j2;
        this.d = this.c - this.b;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        this.c = j;
        this.d = this.c - this.b;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f28397a;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.d;
    }
}
