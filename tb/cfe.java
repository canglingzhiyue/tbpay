package tb;

import com.alibaba.ut.abtest.internal.debug.d;
import com.alibaba.ut.abtest.internal.util.o;
import com.alibaba.ut.abtest.pipeline.RequestMethod;
import com.alibaba.ut.abtest.pipeline.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class cfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(901191867);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("7163993a", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("utdid", UTDevice.getUtdid(cex.a().c()));
        hashMap.put("appKey", any.d().c());
        hashMap.put("configVersion", String.valueOf(cex.a().i().c()));
        hashMap.put("userId", cex.a().r());
        hashMap.put("userNick", cex.a().s());
        hashMap.put("appVersion", o.a().c());
        hashMap.put("channel", o.a().d());
        return new c.a("/v4.0/api/experiment/allocate").a(RequestMethod.POST).a(cff.a(hashMap)).a(bwt.class).a();
    }

    public static c a(List<d> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("56e1721f", new Object[]{list, str});
        }
        ArrayList arrayList = new ArrayList();
        for (d dVar : list) {
            HashMap hashMap = new HashMap();
            hashMap.put("level", dVar.b());
            hashMap.put("content", dVar.c());
            hashMap.put("platform", "android");
            hashMap.put("source", "ab");
            hashMap.put("type", dVar.d());
            hashMap.put("createTime", String.valueOf(dVar.a()));
            arrayList.add(hashMap);
        }
        cff a2 = cff.a(arrayList);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ab-debug-key", str);
        return new c.a("/v2.0/api/experiment/uploadDebugLogs").a(RequestMethod.POST).a(a2).a(hashMap2).a();
    }
}
