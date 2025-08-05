package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.b;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.strategy.protocol.a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class ltf implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1798778024);
        kge.a(-1456936360);
    }

    public abstract int a(com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.a aVar);

    @Override // com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.strategy.protocol.a
    public List<b> a(List<b> list, com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bd1e2ddb", new Object[]{this, list, aVar});
        }
        int a2 = a(aVar);
        for (b bVar : list) {
            bVar.a(a(a2, bVar));
        }
        Collections.sort(list);
        return list;
    }

    private int a(int i, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("86c48dbc", new Object[]{this, new Integer(i), bVar})).intValue() : Math.abs(i - bVar.b().b().centerY());
    }
}
