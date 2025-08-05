package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class kvw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, ksi> f30346a = new LinkedHashMap();

    static {
        kge.a(-242337830);
    }

    public void a(String str, ksi ksiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("319b3901", new Object[]{this, str, ksiVar});
        } else {
            this.f30346a.put(str, ksiVar);
        }
    }

    public <T extends ksi> T a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("7c71ae33", new Object[]{this, str}) : (T) this.f30346a.get(str);
    }

    public Map<String, ksi> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f30346a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f30346a.clear();
        }
    }
}
