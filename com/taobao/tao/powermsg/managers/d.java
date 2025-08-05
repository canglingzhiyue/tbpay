package com.taobao.tao.powermsg.managers;

import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.data.AccsStreamConfig;
import com.taobao.accs.init.Launcher_InitAccs;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.common.f;
import com.taobao.tao.powermsg.common.h;
import com.taobao.tao.powermsg.managers.e;
import com.taobao.tao.powermsg.model.SubscribeMessage;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import tao.reactivex.f.k;
import tb.dck;
import tb.jdz;
import tb.jew;
import tb.kge;
import tb.olt;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_SUBSCRIBE = 2;
    public static final int STATUS_SUBSCRIBE_PENDING = 3;
    public static final int STATUS_UNSUBSCRIBE = 0;
    public static final int STATUS_UNSUBSCRIBE_PENDING = 1;

    /* renamed from: a  reason: collision with root package name */
    private final Object f20845a = new Object();
    private HashMap<String, Long> b = new HashMap<>();

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f20856a;
        public com.taobao.tao.messagekit.core.model.a b;

        static {
            kge.a(-1179297711);
        }
    }

    static {
        kge.a(-182042138);
    }

    public static /* synthetic */ Object a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("3fee89", new Object[]{dVar}) : dVar.f20845a;
    }

    private void a(f fVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d04241a", new Object[]{this, fVar, hVar});
            return;
        }
        try {
            boolean z = fVar.a() == 2;
            AccsStreamConfig accsStreamConfig = new AccsStreamConfig(z ? "powermsg3" : "powermsg");
            if (olt.a(GlobalClientInfo.getContext())) {
                accsStreamConfig.setUserId(Launcher_InitAccs.mUserId);
            }
            accsStreamConfig.setStreamId(hVar.c());
            accsStreamConfig.setSyncTimeoutInMill(fVar.d());
            accsStreamConfig.setStartSeq(fVar.e());
            accsStreamConfig.setSeqSnapshotInterval(fVar.g());
            accsStreamConfig.setSaveDB(fVar.b());
            ACCSClient.getAccsClient(z ? AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG : null).subscribeStream(accsStreamConfig);
            MsgLog.c("MultiSubscribeManager", "registerAccsStream succ");
        } catch (Exception e) {
            MsgLog.c("MultiSubscribeManager", e, "registerStream err");
        }
    }

    public static /* synthetic */ void a(d dVar, f fVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b65aafb", new Object[]{dVar, fVar, hVar});
        } else {
            dVar.a(fVar, hVar);
        }
    }

    public static boolean a(int i, Map<String, Object> map, ArrayList<a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47acb564", new Object[]{new Integer(i), map, arrayList})).booleanValue();
        }
        if (arrayList != null) {
            try {
                Iterator<a> it = arrayList.iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    com.taobao.tao.messagekit.base.h.a(i, map, next.b);
                    MsgLog.b("MultiSubscribeManager", next.f20856a, "invoke callback", Integer.valueOf(i));
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean] */
    public int a(final int i, final String str, String str2, final String str3, final String str4, final String str5, final int i2, final int i3, final f fVar, final com.taobao.tao.messagekit.core.model.a aVar) {
        e.a a2;
        boolean z;
        ?? r8;
        e.a aVar2;
        String str6;
        String str7;
        char c;
        int i4;
        String str8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("737577e", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, new Integer(i2), new Integer(i3), fVar, aVar})).intValue();
        }
        String str9 = TextUtils.isEmpty(str2) ? "_default" : str2;
        final String a3 = com.taobao.tao.powermsg.d.a(str4);
        synchronized (this.f20845a) {
            final String str10 = str9;
            try {
                try {
                    a2 = e.a(str, a3, str4, str2, str3, str5);
                    z = a2.g;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (2 != a2.f20858a) {
                    r8 = 1;
                    if (1 == a2.f20858a) {
                        a aVar3 = new a();
                        aVar3.f20856a = str10;
                        aVar3.b = new com.taobao.tao.messagekit.core.model.a() { // from class: com.taobao.tao.powermsg.managers.d.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.tao.messagekit.core.model.a
                            public void a(int i5, Map<String, Object> map) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i5), map});
                                } else {
                                    d.this.a(i, str, str10, str3, str4, str5, i2, i3, fVar, aVar);
                                }
                            }
                        };
                        a2.l.add(aVar3);
                        MsgLog.c("MultiSubscribeManager", Integer.valueOf(i), "subscribe:", str, "biztag:", a3, str10, "wait unSubscribe " + a2.l.size());
                        return 0;
                    }
                    aVar2 = a2;
                    str6 = str10;
                    str7 = str;
                    c = 2;
                } else if (!z) {
                    a2.j.put(e.a.a(i, str10), com.taobao.android.weex_framework.util.a.ATOM_EXT_bind);
                    MsgLog.c("MultiSubscribeManager", Integer.valueOf(i), "subscribe:", str, "biztag:", a3, str10, "return subscribed");
                    com.taobao.tao.messagekit.base.h.a(1000, null, aVar);
                    return 0;
                } else {
                    aVar2 = a2;
                    str6 = str10;
                    str7 = str;
                    c = 2;
                    r8 = 1;
                }
                aVar2.j.put(e.a.a(i, str6), com.taobao.android.weex_framework.util.a.ATOM_EXT_bind);
                a aVar4 = new a();
                aVar4.f20856a = str6;
                aVar4.b = aVar;
                aVar2.k.add(aVar4);
                Object[] objArr = new Object[7];
                objArr[0] = Integer.valueOf(i);
                byte b = r8 == true ? 1 : 0;
                byte b2 = r8 == true ? 1 : 0;
                objArr[b] = "subscribe:";
                objArr[c] = str7;
                objArr[3] = "biztag:";
                objArr[4] = a3;
                objArr[5] = str6;
                objArr[6] = "add waiting list : " + aVar2.k.size();
                MsgLog.c("MultiSubscribeManager", objArr);
                final boolean z2 = (!olt.a(GlobalClientInfo.getContext()) || fVar == null || fVar.a() == r8) ? false : true;
                if (aVar2.f20858a != 3) {
                    aVar2.f20858a = 3;
                    final SubscribeMessage create = SubscribeMessage.create();
                    create.msgType = 8;
                    if (z2) {
                        create.sysCode = 5;
                    }
                    create.header.f31524a = str7;
                    create.bizCode = i;
                    create.setFrom(str3);
                    create.setBizTag(str4);
                    create.body.b = i2;
                    create.body.d = i3;
                    if (TextUtils.isEmpty(str5)) {
                        str8 = "" + create.createTime;
                    } else {
                        str8 = str5;
                    }
                    create.ext = str8;
                    create.internalExt = "";
                    if (z) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(aw.PARAM_IGNORE_PV, (boolean) r8);
                            create.internalExt = jSONObject.toString();
                            aVar2.g = false;
                        } catch (Exception e) {
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = "internalExt json err";
                            objArr2[r8] = e;
                            MsgLog.c("MultiSubscribeManager", objArr2);
                        }
                    }
                    this.b.put("" + i + str7, Long.valueOf(create.createTime));
                    final com.taobao.tao.messagekit.core.model.b bVar = new com.taobao.tao.messagekit.core.model.b(create);
                    if (z2) {
                        try {
                            bVar.m = true;
                            create.routeGroup = fVar.c();
                            if (!TextUtils.isEmpty(Launcher_InitAccs.mUserId)) {
                                create.header.n = new HashMap(2);
                                create.header.n.put("userId", Launcher_InitAccs.mUserId);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    Object[] objArr3 = new Object[8];
                    objArr3[0] = "start subscribe";
                    try {
                        objArr3[1] = Integer.valueOf(i);
                        objArr3[2] = "topic:";
                        objArr3[3] = str7;
                        objArr3[4] = "reSub:";
                        objArr3[5] = Boolean.valueOf(z);
                        objArr3[6] = "msgid:";
                        objArr3[7] = ((BaseMessage) bVar.f20780a).getID();
                        MsgLog.c("MultiSubscribeManager", objArr3);
                    } catch (Throwable unused2) {
                    }
                    i4 = 1;
                    final String str11 = str6;
                    tao.reactivex.e.a(bVar).a(k.a()).b(new jew<jdz>() { // from class: com.taobao.tao.powermsg.managers.d.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public void a(jdz jdzVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("ef304458", new Object[]{this, jdzVar});
                            } else {
                                com.taobao.tao.messagekit.base.d.a().e().a(((BaseMessage) bVar.f20780a).header.f, new com.taobao.tao.messagekit.core.model.a() { // from class: com.taobao.tao.powermsg.managers.d.2.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // com.taobao.tao.messagekit.core.model.a
                                    public void a(int i5, Map<String, Object> map) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i5), map});
                                            return;
                                        }
                                        ArrayList arrayList = new ArrayList(3);
                                        synchronized (d.a(d.this)) {
                                            e.a c2 = e.c(str, a3);
                                            if (c2 != null) {
                                                if (i5 == 1000) {
                                                    c2.f20858a = 2;
                                                    if (map != null) {
                                                        if (z2 && map.containsKey("systemExt")) {
                                                            Map map2 = (Map) map.get("systemExt");
                                                            h hVar = new h();
                                                            hVar.c((String) map2.get("routeMode"));
                                                            hVar.d((String) map2.get("routeValue"));
                                                            hVar.b((String) map2.get("fullStreamIds"));
                                                            hVar.a(fVar.c());
                                                            e.a(i, str, hVar);
                                                            MsgLog.c("MultiSubscribeManager", "registerTopicInfo", hVar);
                                                            d.a(d.this, fVar, hVar);
                                                            map.put("latestSequenceNrs", map2.get("latestSequenceNrs"));
                                                        } else if (fVar != null && fVar.a() == 1) {
                                                            h hVar2 = new h();
                                                            hVar2.b(map.get(dck.COL_STREAM) + "");
                                                            hVar2.a(fVar);
                                                            e.a(i, str, hVar2);
                                                            d.a(d.this, fVar, hVar2);
                                                            map.put("latestSequenceNrs", map.get("stream_seq") + "");
                                                        }
                                                    }
                                                } else {
                                                    c2.f20858a = 0;
                                                    if (1 == i2) {
                                                        e.d(str, a3);
                                                        MsgLog.c("MultiSubscribeManager", Integer.valueOf(i), "subscribe removeSubItem", str, "biztag:", a3);
                                                    }
                                                }
                                                Iterator<a> it = c2.k.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(it.next());
                                                }
                                                c2.k.clear();
                                            }
                                            MsgLog.c("MultiSubscribeManager", Integer.valueOf(i), "subscribe resp", str, "biztag:", a3, "channel:", str11, "response: ", Integer.valueOf(i5));
                                        }
                                        com.taobao.tao.powermsg.model.a aVar5 = new com.taobao.tao.powermsg.model.a(com.taobao.tao.messagekit.base.monitor.c.a((String) null, (String) null), 3, i, str, str4, i5, i2);
                                        aVar5.l = create.createTime;
                                        com.taobao.tao.messagekit.base.monitor.c.a(aVar5, com.taobao.tao.powermsg.d.b(), false);
                                        if (i5 == 1000) {
                                            com.taobao.tao.messagekit.core.utils.d.a("POWERMSG", "POWERMSG_SUBSCRIBE_RATE");
                                        } else {
                                            com.taobao.tao.messagekit.core.utils.d.a("POWERMSG", "POWERMSG_SUBSCRIBE_RATE", "" + i5, (String) null);
                                        }
                                        d.a(i5, map, arrayList);
                                    }
                                });
                            }
                        }

                        @Override // tb.jew
                        public /* synthetic */ void accept(jdz jdzVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("b028bfab", new Object[]{this, jdzVar});
                            } else {
                                a(jdzVar);
                            }
                        }
                    }).b(com.taobao.tao.messagekit.base.d.a().b());
                } else {
                    i4 = 1;
                }
                return i4;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (e.a(str)) {
            MsgLog.a("MultiSubscribeManager", "innerUnSubscribe topic exists");
        } else {
            MsgLog.c("MultiSubscribeManager", "innerUnSubscribe start", str, Integer.valueOf(i));
            SubscribeMessage create = SubscribeMessage.create();
            create.msgType = 10;
            create.header.f31524a = str;
            create.bizCode = i;
            final com.taobao.tao.messagekit.core.model.b bVar = new com.taobao.tao.messagekit.core.model.b(create);
            try {
                if (e.a(i, str) != null) {
                    bVar.m = true;
                    create.sysCode = 5;
                    if (!TextUtils.isEmpty(Launcher_InitAccs.mUserId)) {
                        create.header.n = new HashMap(2);
                        create.header.n.put("userId", Launcher_InitAccs.mUserId);
                    }
                }
            } catch (Throwable unused) {
            }
            tao.reactivex.e.a(bVar).a(k.a()).b(new jew<jdz>() { // from class: com.taobao.tao.powermsg.managers.d.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void a(jdz jdzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ef304458", new Object[]{this, jdzVar});
                    } else {
                        com.taobao.tao.messagekit.base.d.a().e().a(((BaseMessage) bVar.f20780a).header.f, new com.taobao.tao.messagekit.core.model.a() { // from class: com.taobao.tao.powermsg.managers.d.7.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.tao.messagekit.core.model.a
                            public void a(int i2, Map<String, Object> map) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i2), map});
                                } else {
                                    MsgLog.c("MultiSubscribeManager", "innerUnSubscribe resp:", Integer.valueOf(i2));
                                }
                            }
                        });
                    }
                }

                @Override // tb.jew
                public /* synthetic */ void accept(jdz jdzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b028bfab", new Object[]{this, jdzVar});
                    } else {
                        a(jdzVar);
                    }
                }
            }).b(com.taobao.tao.messagekit.base.d.a().b());
        }
    }

    public int b(final int i, final String str, String str2, final String str3, final String str4, final String str5, final int i2, final int i3, final f fVar, final com.taobao.tao.messagekit.core.model.a aVar) {
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de6ed0dd", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, new Integer(i2), new Integer(i3), fVar, aVar})).intValue();
        }
        String str7 = TextUtils.isEmpty(str2) ? "_default" : str2;
        final String a2 = com.taobao.tao.powermsg.d.a(str4);
        synchronized (this.f20845a) {
            try {
                try {
                    e.a a3 = e.a(str, a2, str4, str2, str3, str5);
                    a3.j.remove(e.a.a(i, str7));
                    if (a3.f20858a != 1 && a3.j.size() > 0) {
                        MsgLog.c("MultiSubscribeManager", Integer.valueOf(i), "unSubscribe:", str, "biztag:", a2, str7, "although has bind :", Integer.valueOf(a3.j.size()));
                        com.taobao.tao.messagekit.base.h.a(1000, null, aVar);
                        return 0;
                    }
                    try {
                        if (3 == a3.f20858a) {
                            a aVar2 = new a();
                            aVar2.f20856a = str7;
                            final String str8 = str7;
                            aVar2.b = new com.taobao.tao.messagekit.core.model.a() { // from class: com.taobao.tao.powermsg.managers.d.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.tao.messagekit.core.model.a
                                public void a(int i4, Map<String, Object> map) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i4), map});
                                    } else {
                                        d.this.b(i, str, str8, str3, str4, str5, i2, i3, fVar, aVar);
                                    }
                                }
                            };
                            a3.k.add(aVar2);
                            MsgLog.c("MultiSubscribeManager", Integer.valueOf(i), "unSubscribe:", str, "biztag:", a2, str7, "wait unSubscribe " + a3.k.size());
                            return 1;
                        }
                        final String str9 = str7;
                        a aVar3 = new a();
                        aVar3.f20856a = str9;
                        aVar3.b = aVar;
                        a3.l.add(aVar3);
                        if (a3.f20858a != 1) {
                            a3.f20858a = 1;
                            final Long put = this.b.put("" + i + str, 0L);
                            if (put != null && put.longValue() > 0) {
                                com.taobao.tao.messagekit.core.utils.d.a("POWERMSG", "POWERMSG_SUBSCRIBE_DURATION", new ArrayMap<String, String>() { // from class: com.taobao.tao.powermsg.managers.d.4
                                    {
                                        put("POWERMSG_DIMENS_BIZ", "" + i);
                                    }
                                }, new ArrayMap<String, Double>() { // from class: com.taobao.tao.powermsg.managers.d.5
                                    {
                                        put("POWERMSG_MEASURE_DURATION", Double.valueOf(System.currentTimeMillis() - put.longValue()));
                                    }
                                });
                            }
                            boolean z = (!olt.a(GlobalClientInfo.getContext()) || fVar == null || fVar.a() == 1) ? false : true;
                            final SubscribeMessage create = SubscribeMessage.create();
                            create.msgType = 10;
                            if (z) {
                                create.sysCode = 5;
                            }
                            create.header.f31524a = str;
                            create.bizCode = i;
                            if (TextUtils.isEmpty(str5)) {
                                str6 = "" + put;
                            } else {
                                str6 = str5;
                            }
                            create.ext = str6;
                            create.setFrom(str3);
                            create.body.b = i2;
                            create.body.d = i3;
                            create.setBizTag(str4);
                            final com.taobao.tao.messagekit.core.model.b bVar = new com.taobao.tao.messagekit.core.model.b(create);
                            if (z) {
                                try {
                                    bVar.m = true;
                                    if (!TextUtils.isEmpty(Launcher_InitAccs.mUserId)) {
                                        create.header.n = new HashMap(2);
                                        create.header.n.put("userId", Launcher_InitAccs.mUserId);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            MsgLog.c("MultiSubscribeManager", Integer.valueOf(i), "start unSubscribe", str, "msgid:", create.header.f);
                            tao.reactivex.e.a(bVar).a(k.a()).b(new jew<jdz>() { // from class: com.taobao.tao.powermsg.managers.d.6
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                public void a(jdz jdzVar) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("ef304458", new Object[]{this, jdzVar});
                                    } else {
                                        com.taobao.tao.messagekit.base.d.a().e().a(((BaseMessage) bVar.f20780a).header.f, new com.taobao.tao.messagekit.core.model.a() { // from class: com.taobao.tao.powermsg.managers.d.6.1
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // com.taobao.tao.messagekit.core.model.a
                                            public void a(int i4, Map<String, Object> map) {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    ipChange3.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i4), map});
                                                    return;
                                                }
                                                ArrayList arrayList = new ArrayList(3);
                                                synchronized (d.a(d.this)) {
                                                    e.a c = e.c(str, a2);
                                                    if (c != null) {
                                                        Iterator<a> it = c.l.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList.add(it.next());
                                                        }
                                                        c.l.clear();
                                                        e.d(str, a2);
                                                    }
                                                    Object[] objArr = new Object[10];
                                                    objArr[0] = Integer.valueOf(i);
                                                    objArr[1] = "unSubscribe resp";
                                                    objArr[2] = str;
                                                    objArr[3] = "biztag:";
                                                    objArr[4] = a2;
                                                    objArr[5] = "channel:";
                                                    objArr[6] = str9;
                                                    objArr[7] = "response: ";
                                                    objArr[8] = Integer.valueOf(i4);
                                                    objArr[9] = Boolean.valueOf(c != null);
                                                    MsgLog.c("MultiSubscribeManager", objArr);
                                                }
                                                com.taobao.tao.powermsg.model.a aVar4 = new com.taobao.tao.powermsg.model.a(com.taobao.tao.messagekit.base.monitor.c.a((String) null, (String) null), 4, i, str, str4, i4, i2);
                                                aVar4.l = create.createTime;
                                                com.taobao.tao.messagekit.base.monitor.c.a(aVar4, com.taobao.tao.powermsg.d.b(), false);
                                                if (i4 == 1000) {
                                                    com.taobao.tao.messagekit.core.utils.d.a("POWERMSG", "POWERMSG_UNSUBSCRIBE_RATE");
                                                } else {
                                                    com.taobao.tao.messagekit.core.utils.d.a("POWERMSG", "POWERMSG_UNSUBSCRIBE_RATE", "" + i4, (String) null);
                                                }
                                                try {
                                                    h b = e.b(i, str);
                                                    Object[] objArr2 = new Object[3];
                                                    objArr2[0] = Integer.valueOf(i);
                                                    objArr2[1] = "unSubscribe > clear topic info";
                                                    objArr2[2] = Boolean.valueOf(b == null);
                                                    MsgLog.c("MultiSubscribeManager", objArr2);
                                                    if (b != null) {
                                                        boolean z2 = fVar != null && fVar.a() == 2;
                                                        ACCSClient.getAccsClient(z2 ? AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG : null).unSubscribeStream(new AccsStreamConfig(z2 ? "powermsg3" : "powermsg"));
                                                    }
                                                } catch (Throwable th) {
                                                    MsgLog.c("MultiSubscribeManager", th, "unSubscribe unRegisterStream err");
                                                }
                                                d.a(i4, map, arrayList);
                                            }
                                        });
                                    }
                                }

                                @Override // tb.jew
                                public /* synthetic */ void accept(jdz jdzVar) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("b028bfab", new Object[]{this, jdzVar});
                                    } else {
                                        a(jdzVar);
                                    }
                                }
                            }).b(com.taobao.tao.messagekit.base.d.a().b());
                        }
                        return 1;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }
}
