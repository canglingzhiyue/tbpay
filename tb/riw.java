package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes9.dex */
public class riw extends rjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<rjb> f33174a;

    static {
        kge.a(-1129993372);
    }

    public riw(List<rjb> list, int i) {
        super("", i);
        this.f33174a = list;
    }

    @Override // tb.rjb
    public Object a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9798556e", new Object[]{this, obj});
        }
        if (b() == 7) {
            List<rjb> list = this.f33174a;
            if (list == null || list.size() == 0) {
                return new JSONArray(4);
            }
            JSONArray jSONArray = new JSONArray(this.f33174a.size());
            for (int i = 0; i < this.f33174a.size(); i++) {
                rjb rjbVar = this.f33174a.get(i);
                if (rjbVar == null) {
                    jSONArray.add(null);
                } else {
                    jSONArray.add(rjbVar.a(obj));
                }
            }
            return jSONArray;
        }
        List<rjb> list2 = this.f33174a;
        if (list2 != null && list2.size() != 0) {
            return this.f33174a.get(0).a(obj);
        }
        return null;
    }

    @Override // tb.rjb
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (b() == 7) {
            return "" + this.f33174a + "";
        }
        List<rjb> list = this.f33174a;
        if (list != null && list.size() == 1) {
            return riy.BLOCK_START_STR + this.f33174a.get(0) + '}';
        }
        return riy.BLOCK_START_STR + this.f33174a + '}';
    }
}
