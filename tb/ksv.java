package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.d;
import com.taobao.collection.dto.BeaconRecord;
import com.taobao.collection.manager.a;
import com.taobao.collection.manager.b;
import com.taobao.fence.client.TBFenceClient;
import com.taobao.geofence.aidl.GatherManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class ksv implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static a b;

    /* renamed from: a  reason: collision with root package name */
    private GatherManager f30295a;
    private int c;
    private SwitchOption.CollectionType d;

    static {
        kge.a(-2146504669);
        kge.a(1430195901);
        b = ksu.a();
    }

    public ksv(GatherManager gatherManager, SwitchOption.CollectionType collectionType) {
        this.f30295a = gatherManager;
        this.d = collectionType;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    @Override // com.taobao.collection.manager.b
    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47455d9", new Object[]{this, dVar});
            return;
        }
        try {
            if (dVar == null) {
                nea.b("lbs_sdk.fence_ActiveBeaconListener", "[dataChanged] event null");
            } else if (dVar.a() != SwitchOption.CollectionType.BEACON) {
                nea.b("lbs_sdk.fence_ActiveBeaconListener", "[dataChanged] find not beacon data change");
            } else {
                Object c = dVar.c();
                if (c != null && (c instanceof BeaconRecord)) {
                    List<BeaconRecord.IBeacon> a2 = ((BeaconRecord) c).a();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    if (a2 != null) {
                        for (BeaconRecord.IBeacon iBeacon : a2) {
                            arrayList.add(new String(iBeacon.proximityUuid + "|" + iBeacon.getMajor() + "|" + iBeacon.minor));
                            StringBuilder sb = new StringBuilder();
                            sb.append("");
                            sb.append(iBeacon.rssi);
                            arrayList2.add(sb.toString());
                        }
                    }
                    this.f30295a.setGatherData(TBFenceClient.TypeEnum.IBEACON, JSON.toJSONString(arrayList), JSON.toJSONString(arrayList2));
                } else if (c == null) {
                    nea.b("lbs_sdk.fence_ActiveBeaconListener", "[dataChanged] data null");
                } else {
                    nea.b("lbs_sdk.fence_ActiveBeaconListener", "[dataChanged]  object type=" + c.getClass());
                }
            }
        } finally {
            b.a(this.c, this.d);
        }
    }
}
