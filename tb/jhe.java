package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.a;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jhe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1959497617);
    }

    public static Map<String, String> a(jhg jhgVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b889a82e", new Object[]{jhgVar, aVar});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aVar.b != null) {
            linkedHashMap.put(jhb.appKeyName, aVar.b);
        }
        if (aVar.c != null) {
            linkedHashMap.put(jhb.appIdName, aVar.c);
        }
        if (aVar.f15567a != null) {
            linkedHashMap.put(jhb.deviceIdName, aVar.f15567a);
        }
        if (jhgVar.e != null) {
            linkedHashMap.put(jhb.requestIdName, jhgVar.e);
        }
        linkedHashMap.put(jhb.replyIdName, jhz.a());
        linkedHashMap.put(jhb.sessionIdName, jhz.a());
        linkedHashMap.put(jhb.opCodeName, aVar.d);
        if (aVar.e != null) {
            linkedHashMap.put(jhb.replyCode, aVar.e);
        }
        if (aVar.f != null) {
            linkedHashMap.put(jhb.replyMsg, aVar.f);
        }
        return linkedHashMap;
    }
}
