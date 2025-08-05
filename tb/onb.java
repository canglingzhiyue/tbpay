package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.network.a;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.b;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tao.reactivex.e;
import tao.reactivex.h;
import tb.olu;

/* loaded from: classes8.dex */
public class onb implements olu.a<List<b>, Map<String, Object>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile omv f32197a;

    static {
        kge.a(-2103534611);
        kge.a(-682805107);
    }

    private void a(Map<String, Object> map, b<BaseMessage> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f3231a0", new Object[]{this, map, bVar});
            return;
        }
        if (this.f32197a == null) {
            synchronized (onb.class) {
                if (this.f32197a == null) {
                    this.f32197a = omw.a(omg.g);
                }
            }
        }
        this.f32197a.a(map, bVar);
    }

    public static /* synthetic */ void a(onb onbVar, Map map, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7fd0dd3", new Object[]{onbVar, map, bVar});
        } else {
            onbVar.a(map, bVar);
        }
    }

    public e<Map<String, Object>> a(e<List<b>> eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("1560407a", new Object[]{this, eVar}) : eVar.a(new jgn<List<b>, e<b>>() { // from class: tb.onb.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public e<b> a(List<b> list) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (e) ipChange2.ipc$dispatch("d6ad1482", new Object[]{this, list}) : e.a((Iterable) list);
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, tao.reactivex.e<com.taobao.tao.messagekit.core.model.b>] */
            @Override // tb.jgn
            public /* synthetic */ e<b> apply(List<b> list) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("7a74adc1", new Object[]{this, list}) : a(list);
            }
        }).b(new jgn<b, Map<String, Object>>() { // from class: tb.onb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public Map<String, Object> a(b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("e734bfe0", new Object[]{this, bVar});
                }
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("mqtt_type", Integer.valueOf(((BaseMessage) bVar.f20780a).msgType));
                    hashMap.put("msg_type", Integer.valueOf(((BaseMessage) bVar.f20780a).type));
                    hashMap.put("sub_type", Integer.valueOf(((BaseMessage) bVar.f20780a).header.g));
                    if (((BaseMessage) bVar.f20780a).bizCode > 0) {
                        hashMap.put("namespace", Integer.valueOf(((BaseMessage) bVar.f20780a).bizCode));
                    }
                    hashMap.put("context", bVar.n);
                    hashMap.put("id", ((BaseMessage) bVar.f20780a).getID());
                    hashMap.put(a.KEY_DID, omg.f32175a);
                    hashMap.put("version", "1.0");
                    onb.a(onb.this, hashMap, bVar);
                    hashMap.put("data", new JSONObject(((BaseMessage) bVar.f20780a).toMap()).toString());
                    MsgLog.b("SendConverter4MTOP", "con 1", "convert msg to map", hashMap.get("api"));
                } catch (Throwable th) {
                    MsgLog.c("SendConverter4MTOP", th, "mtop send apply err");
                }
                return hashMap;
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map<java.lang.String, java.lang.Object>, java.lang.Object] */
            @Override // tb.jgn
            public /* synthetic */ Map<String, Object> apply(b bVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("7a74adc1", new Object[]{this, bVar}) : a(bVar);
            }
        });
    }

    @Override // tao.reactivex.i
    public /* synthetic */ h b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("76b2dd76", new Object[]{this, eVar}) : a(eVar);
    }
}
