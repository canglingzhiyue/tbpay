package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class opc implements gkl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ope f32251a;

    static {
        kge.a(-166700184);
        kge.a(41894641);
    }

    public opc(ope opeVar) throws GatewayException {
        if (opeVar == null) {
            throw new GatewayException("RecmdDataSource should not be null");
        }
        this.f32251a = opeVar;
    }

    @Override // tb.gkl
    public Object a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8e00aaf9", new Object[]{this, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof gln)) {
                String obj = next == null ? null : next.toString();
                if (!StringUtils.isEmpty(obj)) {
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append(",");
                    }
                    stringBuffer.append(obj);
                }
            }
        }
        return stringBuffer.toString();
    }
}
