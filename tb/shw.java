package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class shw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, a> f33590a = new HashMap<>();

    static {
        kge.a(1211301624);
    }

    public a.c a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.c) ipChange.ipc$dispatch("2c2cae0f", new Object[]{this, str});
        }
        a aVar = this.f33590a.get(str);
        if (aVar == null) {
            return null;
        }
        return aVar.a();
    }

    public a b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ad77566f", new Object[]{this, str}) : this.f33590a.get(str);
    }

    public void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee56cda", new Object[]{this, str, aVar});
        } else {
            this.f33590a.put(str, aVar);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.f33590a.remove(str);
        }
    }
}
