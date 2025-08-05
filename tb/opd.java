package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.home.component.utils.e;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;

/* loaded from: classes8.dex */
public class opd implements gkl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ope f32252a;

    static {
        kge.a(2066101294);
        kge.a(41894641);
    }

    public opd(ope opeVar) throws GatewayException {
        if (opeVar == null) {
            throw new GatewayException("RecmdDataSource should not be null");
        }
        this.f32252a = opeVar;
    }

    @Override // tb.gkl
    public Object a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8e00aaf9", new Object[]{this, list});
        }
        if (list == null || list.size() < 2) {
            return -1;
        }
        try {
            String str = (String) list.get(0);
            int intValue = Integer.valueOf(list.get(1).toString()).intValue();
            int requestInAdvanceNum = this.f32252a.b(str).getRequestInAdvanceNum();
            if (requestInAdvanceNum >= 2 && requestInAdvanceNum <= 10) {
                intValue = requestInAdvanceNum;
            }
            List<SectionModel> g = this.f32252a.g(str);
            if (g != null && !g.isEmpty()) {
                if (intValue > g.size()) {
                    return 0;
                }
                return Integer.valueOf(g.size() - intValue);
            }
            return -1;
        } catch (Throwable th) {
            e.a("gateway2.lastIndex", th, new String[0]);
            return -1;
        }
    }
}
