package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.messiah.model.TbHRLogModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class kyr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<TbHRLogModel>> f30407a = new HashMap(32);
    private final Map<String, List<TbHRLogModel>> b = new HashMap(32);

    static {
        kge.a(-191966044);
    }

    public void a(kys kysVar, List<TbHRLogModel> list, List<TbHRLogModel> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed467d5", new Object[]{this, kysVar, list, list2});
            return;
        }
        String b = kysVar.b();
        String a2 = kysVar.a();
        if ("log".equals(b)) {
            this.f30407a.put(a2, list);
        } else if ("monitor".equals(b)) {
            this.b.put(a2, list2);
        } else if (!"all".equals(b)) {
        } else {
            this.f30407a.put(a2, list);
            this.b.put(a2, list2);
        }
    }

    public List<TbHRLogModel> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str}) : this.f30407a.get(str);
    }

    public List<TbHRLogModel> b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str}) : this.b.get(str);
    }

    public void a(kys kysVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f209dbf3", new Object[]{this, kysVar});
            return;
        }
        String b = kysVar.b();
        String a2 = kysVar.a();
        if ("log".equals(b)) {
            this.f30407a.remove(a2);
        } else if ("monitor".equals(b)) {
            this.b.remove(a2);
        } else if (!"all".equals(b)) {
        } else {
            this.b.remove(a2);
            this.f30407a.remove(a2);
        }
    }
}
