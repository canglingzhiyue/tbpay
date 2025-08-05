package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.b;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.List;
import java.util.Map;
import tao.reactivex.e;
import tao.reactivex.h;
import tb.olu;

/* loaded from: classes8.dex */
public class omy implements olu.b<olu.c<byte[]>, List<b>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(177820752);
        kge.a(-1823132098);
    }

    public static List<b> a(olu.c<byte[]> cVar) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1196f1a6", new Object[]{cVar});
        }
        if (cVar.g != null) {
            try {
            } catch (Exception e) {
                e = e;
                bool = null;
            }
            if (cVar.g.containsKey(0)) {
                bool = Boolean.valueOf(Boolean.parseBoolean(cVar.g.get(0)));
                try {
                    MsgLog.a("ReceivedConverter4ACCS", "parseReceivedData ", "isFullReport:", bool);
                } catch (Exception e2) {
                    e = e2;
                    MsgLog.c("ReceivedConverter4ACCS", e, "oriExtHeader err");
                    return a(cVar, null, bool);
                }
                return a(cVar, null, bool);
            }
        }
        bool = null;
        return a(cVar, null, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<com.taobao.tao.messagekit.core.model.b> a(tb.olu.c<byte[]> r32, java.util.Map<java.lang.String, java.lang.Integer> r33, java.lang.Boolean r34) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.omy.a(tb.olu$c, java.util.Map, java.lang.Boolean):java.util.List");
    }

    @Override // tb.olu.b
    public Ack a(int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("847e1ee8", new Object[]{this, new Integer(i), map});
        }
        return null;
    }

    public e<List<b>> a(e<olu.c<byte[]>> eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("1560407a", new Object[]{this, eVar}) : eVar.b(new jgn<olu.c<byte[]>, List<b>>() { // from class: tb.omy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public List<b> a(olu.c<byte[]> cVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (List) ipChange2.ipc$dispatch("1196f1a6", new Object[]{this, cVar}) : omy.a(cVar);
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List<com.taobao.tao.messagekit.core.model.b>] */
            @Override // tb.jgn
            public /* synthetic */ List<b> apply(olu.c<byte[]> cVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("7a74adc1", new Object[]{this, cVar}) : a(cVar);
            }
        });
    }

    @Override // tao.reactivex.i
    public /* synthetic */ h b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("76b2dd76", new Object[]{this, eVar}) : a(eVar);
    }
}
