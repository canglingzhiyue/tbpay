package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class mkw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<mku> f31079a;
    private long b;

    public mkw() {
    }

    public mkw(long j, List<mku> list) {
        this.b = j;
        this.f31079a = list;
    }

    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.b;
    }

    public List<mku> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        List<mku> list = this.f31079a;
        return list == null ? new ArrayList() : new ArrayList(list);
    }
}
