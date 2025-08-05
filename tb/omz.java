package tb;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.monitor.c;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.b;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.tao.powermsg.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONObject;
import tao.reactivex.e;
import tao.reactivex.h;
import tao.reactivex.i;
import tb.njw;
import tb.olu;
import tb.oms;

/* loaded from: classes8.dex */
public class omz implements olu.b<olu.c<byte[]>, List<b>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(178226726);
        kge.a(-1823132098);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [tb.oms$e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [tb.oms$f] */
    @Override // tb.olu.b
    public Ack a(int i, Map<String, Object> map) {
        Object obj;
        String optString;
        oms.c cVar;
        HashMap hashMap;
        olu a2;
        njw.n nVar;
        IpChange ipChange = $ipChange;
        int i2 = 1;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (Ack) ipChange.ipc$dispatch("847e1ee8", new Object[]{this, new Integer(i), map});
        }
        String str = null;
        if (map == null) {
            return null;
        }
        final Ack create = Ack.create();
        create.body = map.get(AgooConstants.MESSAGE_BODY);
        create.data = map.get("data");
        Object obj2 = map.get("mqtt_type");
        Object obj3 = map.get("sub_type");
        try {
            if (obj2 instanceof Integer) {
                create.msgType = ((Integer) obj2).intValue();
                if (create.msgType == 8 || create.msgType == 10 || create.msgType == 9 || create.msgType == 11) {
                    JSONObject jSONObject = (JSONObject) create.data;
                    if (jSONObject != null) {
                        nVar = new njw.n();
                        nVar.b = jSONObject.optInt("role");
                        nVar.d = jSONObject.optInt("period");
                        if (olt.b()) {
                            nVar.h = jSONObject.optString("fullStreamIds");
                            nVar.i = jSONObject.optString("latestSequenceNrs");
                        }
                    } else {
                        nVar = null;
                    }
                    create.data = nVar;
                }
            }
            if (obj3 instanceof Integer) {
                create.header.g = ((Integer) obj3).intValue();
                switch (create.header.g) {
                    case 402:
                        JSONObject jSONObject2 = (JSONObject) create.data;
                        if (jSONObject2 != null) {
                            obj = new oms.e();
                            obj.e = jSONObject2.optInt("digNum");
                            obj.b = jSONObject2.optInt("onlineNum");
                            obj.d = jSONObject2.optInt("msgNum");
                            obj.c = jSONObject2.optInt("totalNum");
                            obj.f32186a = jSONObject2.optInt("visitNum");
                        } else {
                            obj = 0;
                        }
                        create.data = obj;
                        break;
                    case 403:
                        JSONObject jSONObject3 = (JSONObject) create.data;
                        if (jSONObject3 != null) {
                            obj = new oms.f();
                            JSONArray optJSONArray = jSONObject3.optJSONArray("result");
                            int length = optJSONArray.length();
                            obj.f32187a = new oms.f.a[length];
                            for (int i4 = 0; i4 < length; i4++) {
                                oms.f.a aVar = new oms.f.a();
                                JSONObject jSONObject4 = optJSONArray.getJSONObject(i4);
                                aVar.b = jSONObject4.optString("nick");
                                aVar.f32188a = jSONObject4.optString("userId");
                                aVar.c = jSONObject4.optLong("addTime");
                                obj.f32187a[i4] = aVar;
                            }
                        } else {
                            obj = 0;
                        }
                        create.data = obj;
                        break;
                    case 404:
                        JSONObject jSONObject5 = (JSONObject) create.data;
                        if (jSONObject5 != null && (optString = jSONObject5.optString("data")) != null) {
                            e.a(optString).b(new jgn<String, olu.c<byte[]>>() { // from class: tb.omz.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                public olu.c<byte[]> a(String str2) {
                                    IpChange ipChange2 = $ipChange;
                                    return ipChange2 instanceof IpChange ? (olu.c) ipChange2.ipc$dispatch("2d34d5bd", new Object[]{this, str2}) : new olu.c<>(c.a((String) null, (String) null), 3, "", Base64.decode(str2, 0));
                                }

                                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, tb.olu$c<byte[]>] */
                                @Override // tb.jgn
                                public /* synthetic */ olu.c<byte[]> apply(String str2) {
                                    IpChange ipChange2 = $ipChange;
                                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("7a74adc1", new Object[]{this, str2}) : a(str2);
                                }
                            }).a((i) new omy()).b(new jgn<List<b>, List<PowerMessage>>() { // from class: tb.omz.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                public List<PowerMessage> a(List<b> list) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        return (List) ipChange2.ipc$dispatch("b71fabce", new Object[]{this, list});
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    for (b bVar : list) {
                                        if (bVar.f20780a.type() == 1) {
                                            arrayList.add(d.a((BaseMessage) bVar.f20780a));
                                        }
                                    }
                                    return arrayList;
                                }

                                /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List<com.taobao.tao.powermsg.common.PowerMessage>, java.lang.Object] */
                                @Override // tb.jgn
                                public /* synthetic */ List<PowerMessage> apply(List<b> list) {
                                    IpChange ipChange2 = $ipChange;
                                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("7a74adc1", new Object[]{this, list}) : a(list);
                                }
                            }).c(new jew<List<PowerMessage>>() { // from class: tb.omz.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                public void a(List<PowerMessage> list) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                                        return;
                                    }
                                    MsgLog.a("ReceivedConverter4Mtop", "pullHistory >", Integer.valueOf(list.size()));
                                    create.data = list;
                                }

                                @Override // tb.jew
                                public /* synthetic */ void accept(List<PowerMessage> list) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("b028bfab", new Object[]{this, list});
                                    } else {
                                        a(list);
                                    }
                                }
                            });
                            break;
                        }
                        break;
                    case 405:
                        JSONObject jSONObject6 = (JSONObject) create.data;
                        if (jSONObject6 != null) {
                            cVar = new oms.c();
                            cVar.b = jSONObject6.optInt("role");
                            cVar.c = jSONObject6.optInt("period");
                            cVar.f32183a = jSONObject6.optLong("offset");
                            JSONObject optJSONObject = jSONObject6.optJSONObject("traceMsgIds");
                            HashMap hashMap2 = new HashMap();
                            if (optJSONObject != null) {
                                hashMap2.put(30, optJSONObject.toString());
                            }
                            JSONArray optJSONArray2 = jSONObject6.optJSONArray("timestampList");
                            if (optJSONArray2 != null) {
                                int i5 = 0;
                                while (i5 < optJSONArray2.length()) {
                                    String optString2 = optJSONArray2.getJSONObject(i5).optString("data");
                                    long optLong = optJSONArray2.getJSONObject(i5).optLong("offset");
                                    if (optString2 == null || (a2 = com.taobao.tao.messagekit.base.network.b.a(i2)) == null) {
                                        hashMap = hashMap2;
                                    } else {
                                        hashMap = hashMap2;
                                        a2.a(new olu.c(c.a(str, str), 2, "" + optLong, Base64.decode(optString2, i3), hashMap2));
                                    }
                                    i5++;
                                    hashMap2 = hashMap;
                                    str = null;
                                    i2 = 1;
                                    i3 = 0;
                                }
                            }
                        } else {
                            cVar = null;
                        }
                        create.data = cVar;
                        break;
                }
            }
        } catch (Exception e) {
            MsgLog.c("ReceivedConverter4Mtop", e, new Object[0]);
        }
        return create;
    }

    public e<List<b>> a(e<olu.c<byte[]>> eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("1560407a", new Object[]{this, eVar}) : eVar.b(new jgn<olu.c<byte[]>, List<b>>() { // from class: tb.omz.1
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
