package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.a;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.component.module.u;

/* loaded from: classes4.dex */
public class pst extends qpj<eze> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private u y_;

    static {
        kge.a(539396214);
    }

    public static /* synthetic */ Object ipc$super(pst pstVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -541393027) {
            if (hashCode == -385542000) {
                return super.a((String) objArr[0], (a) objArr[1]);
            }
            if (hashCode != 1271836742) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.a((a) objArr[0]);
        }
        return super.a((String) objArr[0]);
    }

    public pst(JSONObject jSONObject, plc plcVar) {
        super(jSONObject, plcVar);
    }

    @Override // tb.qpj, tb.qms
    public <C extends d> C a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("e9051890", new Object[]{this, str, aVar});
        }
        u uVar = this.y_;
        C c = uVar != null ? (C) uVar.findComponentByUltronName(str) : null;
        return c != null ? c : (C) super.a(str, aVar);
    }

    @Override // tb.qpj, tb.qms
    public <C extends d> C a(String str) {
        u uVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("dfbaff7d", new Object[]{this, str});
        }
        C c = (C) super.a(str);
        return (c != null || (uVar = this.y_) == null) ? c : (C) uVar.findComponent(str);
    }

    @Override // tb.qms
    public synchronized <C extends d> C a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("4bceb046", new Object[]{this, aVar});
        }
        C c = (C) super.a(aVar);
        if (c != null) {
            this.y_ = (u) c;
        }
        return c;
    }
}
