package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.a;
import com.taobao.android.detail.ttdetail.component.module.d;
import java.util.ArrayList;
import java.util.List;
import tb.eyy;

/* loaded from: classes4.dex */
public class qpj<CD extends eyy> extends qms<CD> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHILDREN = "children";
    private List<qms> z_;

    static {
        kge.a(-1712965985);
    }

    public static /* synthetic */ Object ipc$super(qpj qpjVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -541393027) {
            if (hashCode != -385542000) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.a((String) objArr[0], (a) objArr[1]);
        }
        return super.a((String) objArr[0]);
    }

    public qpj(JSONObject jSONObject, plc plcVar) {
        super(jSONObject, plcVar);
    }

    @Override // tb.qms
    public <C extends d> C a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("e9051890", new Object[]{this, str, aVar});
        }
        List<qms> list = this.z_;
        if (list != null) {
            for (qms qmsVar : list) {
                C c = (C) qmsVar.a(str, aVar);
                if (c != null) {
                    return c;
                }
            }
        }
        return (C) super.a(str, aVar);
    }

    @Override // tb.qms
    public <C extends d> C a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("dfbaff7d", new Object[]{this, str});
        }
        List<qms> list = this.z_;
        if (list != null) {
            for (qms qmsVar : list) {
                C c = (C) qmsVar.a(str);
                if (c != null) {
                    return c;
                }
            }
        }
        return (C) super.a(str);
    }

    public <C extends qms> List<C> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this});
        }
        List<C> list = (List<C>) this.z_;
        if (list != null) {
            return list;
        }
        return null;
    }

    public <C extends qms> C a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("e6669394", new Object[]{this, new Integer(i)});
        }
        List<qms> list = this.z_;
        if (list != null && i >= 0 && i < list.size()) {
            return (C) this.z_.get(i);
        }
        return null;
    }

    public void a(qms qmsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9dd5a1", new Object[]{this, qmsVar});
            return;
        }
        if (this.z_ == null) {
            this.z_ = new ArrayList();
        }
        qmsVar.h = this;
        this.z_.add(qmsVar);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        List<qms> list = this.z_;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
