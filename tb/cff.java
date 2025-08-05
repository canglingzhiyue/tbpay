package tb;

import com.alibaba.ut.abtest.internal.util.g;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class cff {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Object f26263a;

    static {
        kge.a(28063870);
    }

    private cff(List<Object> list) {
        this.f26263a = list;
    }

    private cff(Map<String, Object> map) {
        this.f26263a = map;
    }

    public static cff a(List<Object> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cff) ipChange.ipc$dispatch("fa5a330a", new Object[]{list}) : new cff(list);
    }

    public static cff a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cff) ipChange.ipc$dispatch("24aea5c6", new Object[]{map}) : new cff(map);
    }

    public Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f26263a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        try {
            return super.toString() + g.a(this.f26263a);
        } catch (Exception unused) {
            return super.toString();
        }
    }
}
