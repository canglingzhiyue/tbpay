package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ezg extends eyy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SPLIT_MARK_4_TYPES = "&";
    private StringBuilder g;
    public List<eyy> k;

    static {
        kge.a(1277138635);
    }

    public ezg(JSONObject jSONObject) {
        super(jSONObject);
        this.g = new StringBuilder();
    }

    public ezg(JSONObject jSONObject, ezo ezoVar) {
        super(jSONObject, ezoVar);
        this.g = new StringBuilder();
    }

    public <T extends eyy> List<T> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3e0c1553", new Object[]{this});
        }
        List<T> list = (List<T>) this.k;
        if (list != null) {
            return list;
        }
        return null;
    }

    public <T extends eyy> T a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("e6614ce6", new Object[]{this, new Integer(i)});
        }
        List<eyy> list = this.k;
        if (list != null) {
            return (T) list.get(i);
        }
        return null;
    }

    public void a(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cf8273", new Object[]{this, eyyVar});
            return;
        }
        if (this.k == null) {
            this.k = new ArrayList();
        }
        eyyVar.f = this;
        this.k.add(eyyVar);
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        StringBuilder sb = this.g;
        sb.delete(0, sb.length());
        for (eyy eyyVar : this.k) {
            StringBuilder sb2 = this.g;
            sb2.append("&");
            sb2.append(eyyVar.c);
        }
        if (this.g.length() > 0) {
            this.g.deleteCharAt(0);
        }
        return this.g.toString();
    }
}
