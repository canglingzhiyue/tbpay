package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.d;
import com.taobao.collection.manager.a;
import com.taobao.collection.manager.b;
import com.taobao.fence.client.TBFenceClient;
import com.taobao.geofence.aidl.GatherManager;

/* loaded from: classes7.dex */
public class ksw implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f30296a;
    private GatherManager b;
    private int c;
    private SwitchOption.CollectionType d;

    static {
        kge.a(1430632628);
        kge.a(1430195901);
        f30296a = ksu.a();
    }

    public ksw(GatherManager gatherManager, SwitchOption.CollectionType collectionType) {
        this.b = gatherManager;
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
                nea.b("lbs_sdk.fence_ActiveWifiListener", "[dataChanged] event null");
            } else if (dVar.a() != SwitchOption.CollectionType.WIFI) {
                nea.b("lbs_sdk.fence_ActiveWifiListener", "[dataChanged] find not wifi data change");
            } else {
                Object c = dVar.c();
                if (c != null && (c instanceof com.taobao.collection.dto.a)) {
                    this.b.setGatherData(TBFenceClient.TypeEnum.WIFI, JSON.toJSONString(((com.taobao.collection.dto.a) c).a()));
                } else if (c == null) {
                    nea.b("lbs_sdk.fence_ActiveWifiListener", "[dataChanged] data null");
                } else {
                    nea.b("lbs_sdk.fence_ActiveWifiListener", "[dataChanged]  object type=" + c.getClass());
                }
            }
        } finally {
            f30296a.a(this.c, this.d);
        }
    }
}
