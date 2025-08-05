package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.Command;
import com.taobao.tao.messagekit.core.model.b;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.d;
import com.taobao.tao.powermsg.managers.e;
import com.taobao.tao.powermsg.model.Report;
import java.util.List;

/* loaded from: classes8.dex */
public class ond implements olv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1902691696);
        kge.a(-1909143075);
    }

    @Override // tb.olv
    public Ack a(Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("3702b6b0", new Object[]{this, command});
        }
        List<e.a> a2 = e.a();
        if (command.header.c != 1000) {
            for (e.a aVar : a2) {
                if (e.a(aVar.b, aVar.c) && aVar.h == 5) {
                    MsgLog.b("ConnectionCmdProcessor", "pushFlag ", aVar.b);
                    d.a().getPullManager().a(aVar.b, aVar.c, 0);
                }
            }
            return null;
        }
        for (e.a aVar2 : a2) {
            if (e.a(aVar2.b, aVar2.c) && aVar2.h == 5) {
                b bVar = new b(Report.create());
                ((Report) bVar.f20780a).header.c = 1000;
                ((Report) bVar.f20780a).header.g = 504;
                ((Report) bVar.f20780a).header.f31524a = aVar2.b;
                ((Report) bVar.f20780a).setBizTag(aVar2.c);
                MsgLog.b("ConnectionCmdProcessor", "report ", aVar2.b);
                MsgLog.a("ConnectionCmdProcessor", bVar);
                tao.reactivex.e.a(bVar).b(com.taobao.tao.messagekit.base.d.a().b());
            }
        }
        return null;
    }
}
