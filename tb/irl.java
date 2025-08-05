package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.movehighlight.utils.o;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class irl implements qmp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f29253a;

    static {
        kge.a(-947518439);
        kge.a(1262784915);
    }

    public irl(a aVar) {
        this.f29253a = aVar;
    }

    @Override // tb.qmp
    public void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{this, str, strArr});
        } else {
            o.a(this.f29253a, str, strArr);
        }
    }

    @Override // tb.qmp
    public void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
        } else {
            o.a(this.f29253a, str2, map);
        }
    }

    @Override // tb.qmp
    public void a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202a441", new Object[]{this, str, hashMap});
        } else {
            o.a(this.f29253a, str, hashMap);
        }
    }

    @Override // tb.qmp
    public void a(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a507bab7", new Object[]{this, str, str2, hashMap});
        } else {
            o.a(this.f29253a, str2, (String) null, hashMap);
        }
    }

    @Override // tb.qmp
    public void a(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c673040", new Object[]{this, new Integer(i), str, map});
        } else {
            o.a(this.f29253a, i, str, map);
        }
    }
}
