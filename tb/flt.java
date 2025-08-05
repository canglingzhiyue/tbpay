package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.data.model.d;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class flt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, flu> f28041a = new HashMap<>();

    static {
        kge.a(1976196826);
    }

    public void a(String str, flu fluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b5cdd3", new Object[]{this, str, fluVar});
        } else {
            this.f28041a.put(str, fluVar);
        }
    }

    public d a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("3c996a7f", new Object[]{this, str, bVar});
        }
        flu fluVar = this.f28041a.get(str);
        if (fluVar == null) {
            return null;
        }
        try {
            return fluVar.a(bVar);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
