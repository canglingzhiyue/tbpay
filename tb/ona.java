package tb;

import android.support.v4.util.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.d;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.b;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.model.Report;
import java.util.Collection;
import java.util.List;
import tao.reactivex.e;
import tao.reactivex.f.k;
import tao.reactivex.h;
import tb.olu;

/* loaded from: classes8.dex */
public class ona implements olu.a<List<b>, AccsConnection.DataPackage> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2103908809);
        kge.a(-682805107);
    }

    public static String a(BaseMessage baseMessage, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e8a55743", new Object[]{baseMessage, new Boolean(z)}) : olu.a(baseMessage, z);
    }

    private boolean a(List<b> list, b<BaseMessage> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("265c5ce0", new Object[]{this, list, bVar})).booleanValue();
        }
        if (bVar.f20780a.type == 6) {
            for (b bVar2 : list) {
                if (((BaseMessage) bVar2.f20780a).type == 6 && bVar2.d == bVar.d && ((BaseMessage) bVar2.f20780a).header.g == bVar.f20780a.header.g && ((Report) bVar2.f20780a).body.f31519a.equals(((Report) bVar.f20780a).body.f31519a)) {
                    MsgLog.a("SendConverter4ACCS", "drop report msg", bVar.f20780a.header.f);
                    return false;
                }
            }
        }
        return true;
    }

    public static /* synthetic */ boolean a(ona onaVar, List list, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("10e93bae", new Object[]{onaVar, list, bVar})).booleanValue() : onaVar.a(list, bVar);
    }

    public e<AccsConnection.DataPackage> a(e<List<b>> eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("1560407a", new Object[]{this, eVar}) : eVar.b(k.b()).b(new jgn<List<b>, Collection<AccsConnection.DataPackage>>() { // from class: tb.ona.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public Collection<AccsConnection.DataPackage> a(List<b> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Collection) ipChange2.ipc$dispatch("8cc6950e", new Object[]{this, list});
                }
                MsgLog.b("SendConverter4ACCS", "con 0", "convert msgs to bytes:", Integer.valueOf(list.size()));
                ArrayMap arrayMap = new ArrayMap(5);
                for (b bVar : list) {
                    String a2 = ona.a((BaseMessage) bVar.f20780a, bVar.m);
                    AccsConnection.DataPackage dataPackage = (AccsConnection.DataPackage) arrayMap.get(a2);
                    if (dataPackage == null) {
                        dataPackage = new AccsConnection.DataPackage(((BaseMessage) bVar.f20780a).routerId, bVar.b, ((BaseMessage) bVar.f20780a).header.f31524a);
                        if (bVar.m) {
                            dataPackage.a(((BaseMessage) bVar.f20780a).bizCode);
                            if (((BaseMessage) bVar.f20780a).msgType == 8 || ((BaseMessage) bVar.f20780a).msgType == 10) {
                                dataPackage.a(true);
                            }
                        }
                        arrayMap.put(a2, dataPackage);
                    }
                    if (ona.a(ona.this, dataPackage.c(), bVar)) {
                        dataPackage.a(bVar);
                    } else {
                        d.a().e().a(((BaseMessage) bVar.f20780a).getID(), -3003, null);
                    }
                }
                return arrayMap.values();
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection<com.taobao.tao.messagekit.base.network.AccsConnection$DataPackage>, java.lang.Object] */
            @Override // tb.jgn
            public /* synthetic */ Collection<AccsConnection.DataPackage> apply(List<b> list) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("7a74adc1", new Object[]{this, list}) : a(list);
            }
        }).a(new jgn<Collection<AccsConnection.DataPackage>, e<AccsConnection.DataPackage>>() { // from class: tb.ona.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public e<AccsConnection.DataPackage> a(Collection<AccsConnection.DataPackage> collection) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (e) ipChange2.ipc$dispatch("ecaee742", new Object[]{this, collection}) : e.a((Iterable) collection);
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [tao.reactivex.e<com.taobao.tao.messagekit.base.network.AccsConnection$DataPackage>, java.lang.Object] */
            @Override // tb.jgn
            public /* synthetic */ e<AccsConnection.DataPackage> apply(Collection<AccsConnection.DataPackage> collection) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("7a74adc1", new Object[]{this, collection}) : a(collection);
            }
        });
    }

    @Override // tao.reactivex.i
    public /* synthetic */ h b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("76b2dd76", new Object[]{this, eVar}) : a(eVar);
    }
}
