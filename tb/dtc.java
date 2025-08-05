package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class dtc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<String>> f26952a = new ConcurrentHashMap();
    private a b;

    /* loaded from: classes4.dex */
    public interface a {
        Map<String, List<String>> a();
    }

    static {
        kge.a(1878466874);
    }

    public dtc(Context context) {
        this.b = new dta(context);
        a();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ae2b708", new Object[]{this, aVar});
            return;
        }
        this.b = aVar;
        a();
    }

    public List<String> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str}) : this.f26952a.get(str);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a aVar = this.b;
        if (aVar == null || aVar.a() == null) {
            return;
        }
        this.f26952a.putAll(this.b.a());
    }
}
