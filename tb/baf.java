package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class baf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, bag> f25726a = new ConcurrentHashMap();

    static {
        kge.a(2042551947);
    }

    public void a(bag bagVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15695d0", new Object[]{this, bagVar});
        } else if (bagVar == null || StringUtils.isEmpty(bagVar.l())) {
        } else {
            this.f25726a.put(bagVar.l(), bagVar);
        }
    }

    public void b(bag bagVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd99c51", new Object[]{this, bagVar});
        } else if (bagVar == null || StringUtils.isEmpty(bagVar.l())) {
        } else {
            this.f25726a.remove(bagVar.l());
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f25726a.clear();
        }
    }

    public bag a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bag) ipChange.ipc$dispatch("7c6d530c", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return this.f25726a.get(str);
        }
        return null;
    }

    public List<bag> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f25726a.values());
        return arrayList;
    }
}
