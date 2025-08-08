package com.taobao.tao.powermsg;

import android.os.SystemClock;
import android.support.v4.util.Pair;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.data.AccsStreamConfig;
import com.taobao.accs.init.Launcher_InitAccs;
import com.taobao.tao.messagekit.base.e;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.Command;
import com.taobao.tao.messagekit.core.model.b;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.a;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.tao.powermsg.common.TextPowerMessage;
import com.taobao.tao.powermsg.common.f;
import com.taobao.tao.powermsg.common.h;
import com.taobao.tao.powermsg.model.Count;
import com.taobao.tao.powermsg.model.Report;
import com.taobao.tao.powermsg.model.Request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tao.reactivex.f.k;
import tb.jdz;
import tb.jew;
import tb.jgn;
import tb.jrg;
import tb.kge;
import tb.muz;
import tb.njw;
import tb.olt;
import tb.olx;
import tb.omg;
import tb.onh;
import tb.riy;

/* loaded from: classes8.dex */
public class PowerMsgServiceImpl implements com.taobao.tao.powermsg.common.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INTERVAL_TIME = 5;
    private static final String TAG = "PowerMsgRouter";
    private com.taobao.tao.messagekit.core.model.d<b<BaseMessage>> endStream = new com.taobao.tao.messagekit.core.model.d<>();
    private com.taobao.tao.powermsg.managers.d subscribeManager = new com.taobao.tao.powermsg.managers.d();
    private onh pullManager = new onh();
    private com.taobao.tao.powermsg.managers.c msgManager = new com.taobao.tao.powermsg.managers.c();

    static {
        kge.a(-88379450);
        kge.a(-1647788095);
    }

    public PowerMsgServiceImpl() {
        initDownStream(com.taobao.tao.messagekit.base.d.a().c());
        MsgLog.b(TAG, "init>>>");
        com.taobao.tao.messagekit.core.utils.d.a("POWERMSG", "POWERMSG_SUBSCRIBE_DURATION", new ArrayList<String>() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.1
            {
                add("POWERMSG_DIMENS_BIZ");
            }
        }, new ArrayList<String>() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.2
            {
                add("POWERMSG_MEASURE_DURATION");
            }
        });
        com.taobao.tao.messagekit.core.utils.d.a("POWERMSG", "pullCost", new ArrayList<String>() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.3
            {
                add("POWERMSG_DIMENS_BIZ");
                add("MKT_DIMENS_TOPIC");
                add("code");
                add("mode");
                add("time");
            }
        }, new ArrayList<String>() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.4
            {
                add("POWERMSG_MEASURE_DURATION");
            }
        });
        this.endStream.a().a(k.a()).a(new jew<b<BaseMessage>>() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void a(b<BaseMessage> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("da6724eb", new Object[]{this, bVar});
                    return;
                }
                MsgLog.a(PowerMsgServiceImpl.TAG, "Error Result >");
                MsgLog.a(PowerMsgServiceImpl.TAG, bVar);
                d.a(bVar, bVar.f20780a.header.c);
                e.a(bVar);
            }

            @Override // tb.jew
            public /* synthetic */ void accept(b<BaseMessage> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b028bfab", new Object[]{this, bVar});
                } else {
                    a(bVar);
                }
            }
        });
    }

    public static /* synthetic */ onh access$000(PowerMsgServiceImpl powerMsgServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (onh) ipChange.ipc$dispatch("63770a19", new Object[]{powerMsgServiceImpl}) : powerMsgServiceImpl.pullManager;
    }

    private boolean filterMsg(int i, int i2) {
        JSONObject parseObject;
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f04bdd54", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        try {
            parseObject = JSON.parseObject(com.taobao.tao.messagekit.base.c.a("subtype_limit", ""));
            sb = new StringBuilder();
            sb.append(i);
            sb.append(riy.PLUS);
            sb.append(i2);
        } catch (Exception unused) {
        }
        return System.currentTimeMillis() % 1000 < ((long) parseObject.getIntValue(sb.toString()));
    }

    private void initDownStream(com.taobao.tao.messagekit.core.model.d<b> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4795c3ba", new Object[]{this, dVar});
            return;
        }
        MsgLog.b(TAG, "initDownStream");
        if (dVar == null) {
            MsgLog.c(TAG, "initDownStream downStream is null");
        }
        dVar.a().a(k.a()).a(new jrg<b>() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public boolean a(b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("da6724ef", new Object[]{this, bVar})).booleanValue();
                }
                boolean z = PowerMsgServiceImpl.this.returnCode() == bVar.b;
                if (!z) {
                    MsgLog.c(PowerMsgServiceImpl.TAG, "not syscode:", Integer.valueOf(bVar.b), "biz:", Integer.valueOf(bVar.f20780a.bizCode()), "topic:", bVar.f20780a.topic(), "msgId:", bVar.f20780a.getID());
                }
                if (bVar.o != null) {
                    bVar.o.streamFilterTime = SystemClock.elapsedRealtime();
                }
                return z;
            }

            @Override // tb.jrg
            public /* synthetic */ boolean test(b bVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("5a0eabb9", new Object[]{this, bVar})).booleanValue() : a(bVar);
            }
        }).a(downObserver());
    }

    public static boolean invoke(int i, Map<String, Object> map, com.taobao.tao.powermsg.common.b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b030b6", new Object[]{new Integer(i), map, bVar, objArr})).booleanValue();
        }
        if (i == 2021) {
            Command create = Command.create(1);
            create.header.g = 304;
            tao.reactivex.e.a(new b(create)).b(com.taobao.tao.messagekit.base.d.a().d());
        }
        if (bVar != null) {
            try {
                bVar.a(i, map, objArr);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private void sendMessageImpl(int i, PowerMessage powerMessage, f fVar, final com.taobao.tao.powermsg.common.b bVar, final Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc98808", new Object[]{this, new Integer(i), powerMessage, fVar, bVar, objArr});
        } else if (filterMsg(i, powerMessage.type)) {
            invoke(4001, null, bVar, objArr);
        } else {
            final b bVar2 = new b(d.a(powerMessage));
            ((BaseMessage) bVar2.f20780a).bizCode = i;
            try {
                if (olt.a(GlobalClientInfo.getContext()) && fVar != null) {
                    if (!StringUtils.isEmpty(fVar.f())) {
                        ((BaseMessage) bVar2.f20780a).header.p = fVar.f();
                    }
                    bVar2.m = true;
                    ((BaseMessage) bVar2.f20780a).sysCode = 5;
                    bVar2.b = 5;
                    if (!StringUtils.isEmpty(Launcher_InitAccs.mUserId)) {
                        if (((BaseMessage) bVar2.f20780a).header.n == null) {
                            ((BaseMessage) bVar2.f20780a).header.n = new HashMap(2);
                        }
                        ((BaseMessage) bVar2.f20780a).header.n.put("userId", Launcher_InitAccs.mUserId);
                        Map<String, String> map = ((BaseMessage) bVar2.f20780a).header.n;
                        map.put("clientSendTime", a.a() + "");
                    }
                }
                String id = ((BaseMessage) bVar2.f20780a).getID();
                com.taobao.tao.powermsg.managers.c.a(id, i + "", powerMessage.topic);
                MsgLog.c(TAG, "start sendStreamMessage", "namespace:", Integer.valueOf(i), "topic:", powerMessage.topic, "msgid:", ((BaseMessage) bVar2.f20780a).getID());
            } catch (Throwable unused) {
            }
            tao.reactivex.e.a(bVar2).b(new jew<jdz>() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void a(jdz jdzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ef304458", new Object[]{this, jdzVar});
                    } else {
                        com.taobao.tao.messagekit.base.d.a().e().a(((BaseMessage) bVar2.f20780a).header.f, new com.taobao.tao.messagekit.core.model.a() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.13.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.tao.messagekit.core.model.a
                            public void a(int i2, Map<String, Object> map2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i2), map2});
                                    return;
                                }
                                PowerMsgServiceImpl.invoke(i2, map2, bVar, objArr);
                                if (i2 == 1000) {
                                    com.taobao.tao.messagekit.core.utils.d.a("POWERMSG", "POWERMSG_SENDMSG_RATE");
                                    return;
                                }
                                com.taobao.tao.messagekit.core.utils.d.a("POWERMSG", "POWERMSG_SENDMSG_RATE", "" + i2, (String) null);
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

    private void sendRequestInterval(final BaseMessage baseMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541ab7e2", new Object[]{this, baseMessage});
        } else {
            tao.reactivex.e.a(0L, 5L, TimeUnit.SECONDS).a(k.a()).b(new jgn<Long, b<BaseMessage>>() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public b<BaseMessage> a(Long l) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (b) ipChange2.ipc$dispatch("bfa116d2", new Object[]{this, l});
                    }
                    Request request = new Request(baseMessage);
                    request.header.g = 401;
                    request.needACK = false;
                    request.body.f31520a = 0L;
                    request.body.b = 5;
                    MsgLog.a(PowerMsgServiceImpl.TAG, "sendRequest >", Long.valueOf(request.body.f31520a), "interval:", 5, "topic:", baseMessage.header.f31524a);
                    return new b<>(request);
                }

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.taobao.tao.messagekit.core.model.b<com.taobao.tao.messagekit.core.model.BaseMessage>] */
                @Override // tb.jgn
                public /* synthetic */ b<BaseMessage> apply(Long l) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("7a74adc1", new Object[]{this, l}) : a(l);
                }
            }).b(com.taobao.tao.messagekit.base.d.a().b());
        }
    }

    private void subscribeImpl(final int i, final String str, String str2, String str3, final String str4, String str5, final com.taobao.tao.powermsg.common.b bVar, f fVar, final Object... objArr) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab03feb5", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, bVar, fVar, objArr});
            return;
        }
        MsgLog.c(TAG, "subscribe >", str, "biz:", Integer.valueOf(i), "biztag:", str4, str2);
        int c = com.taobao.tao.powermsg.managers.e.c(i, str, str4, str2);
        if (1000 != c) {
            MsgLog.c(TAG, Integer.valueOf(i), "subscribe:", str, "biztag:", str4, str2, "error in states", Integer.valueOf(c));
            invoke(c, null, bVar, objArr);
            return;
        }
        com.taobao.tao.messagekit.base.d.a().f().a(i, str, str2, str3, str4);
        int a2 = com.taobao.tao.messagekit.base.c.a("push_aside_pull_duration", 3);
        int a3 = com.taobao.tao.powermsg.managers.a.a("" + i, str);
        int a4 = com.taobao.tao.messagekit.base.c.a("force_pull_type", -1);
        int i2 = (a3 == 4 || a4 <= 0) ? a3 : a4;
        if (!onh.a(i2)) {
            a2 = com.taobao.tao.messagekit.base.c.a("pull_duration", 1);
        }
        int i3 = a2;
        if (1 != i2 && fVar == null) {
            invoke(1000, null, bVar, objArr);
            MsgLog.b(TAG, "subscribe >", 1000, str, "biz:", Integer.valueOf(i));
            z = true;
        }
        int i4 = i2;
        final boolean z2 = z;
        if (this.subscribeManager.a(i, str, str2, str3, str4, str5, i4, i3, fVar, new com.taobao.tao.messagekit.core.model.a() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.messagekit.core.model.a
            public void a(int i5, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i5), map});
                    return;
                }
                if (map != null && (map.get("data") instanceof njw.n)) {
                    njw.n nVar = (njw.n) map.get("data");
                    PowerMsgServiceImpl.access$000(PowerMsgServiceImpl.this).a(i, str, str4, nVar.b, nVar.d);
                }
                if (z2) {
                    return;
                }
                PowerMsgServiceImpl.invoke(i5, map, bVar, objArr);
            }
        }) != 1) {
            return;
        }
        this.pullManager.a(i, str, str4, i4, i3);
    }

    @Override // com.taobao.tao.powermsg.common.d
    public void countValue(final int i, final String str, Map<String, Double> map, boolean z, final com.taobao.tao.powermsg.common.b bVar, final Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c43856e0", new Object[]{this, new Integer(i), str, map, new Boolean(z), bVar, objArr});
            return;
        }
        Count create = Count.create();
        create.header.f31524a = str;
        create.body.f31511a = map;
        create.needACK = z;
        final b bVar2 = new b(create);
        ((BaseMessage) bVar2.f20780a).bizCode = i;
        tao.reactivex.e.a(bVar2).b(new jew<jdz>() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void a(jdz jdzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ef304458", new Object[]{this, jdzVar});
                } else {
                    com.taobao.tao.messagekit.base.d.a().e().a(((BaseMessage) bVar2.f20780a).header.f, new com.taobao.tao.messagekit.core.model.a() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.7.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.messagekit.core.model.a
                        public void a(int i2, Map<String, Object> map2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i2), map2});
                                return;
                            }
                            PowerMsgServiceImpl.invoke(i2, map2, bVar, objArr);
                            MsgLog.b(PowerMsgServiceImpl.TAG, "countValue >", Integer.valueOf(i2), str, "biz:", Integer.valueOf(i));
                            if (i2 == 1000) {
                                com.taobao.tao.messagekit.core.utils.d.a("POWERMSG", "POWERMSG_COUNT_RATE");
                                return;
                            }
                            com.taobao.tao.messagekit.core.utils.d.a("POWERMSG", "POWERMSG_COUNT_RATE", "" + i2, (String) null);
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

    @Override // com.taobao.tao.powermsg.common.d
    public void doFullLink(PowerMessage powerMessage, com.taobao.tao.messagekit.base.monitor.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b134d830", new Object[]{this, powerMessage, eVar});
        } else if (powerMessage == null || eVar == null) {
            MsgLog.c(TAG, "doFullLink param is illegal");
        } else if (powerMessage.fullLinkFlag != 1) {
        } else {
            com.taobao.tao.messagekit.base.monitor.e eVar2 = new com.taobao.tao.messagekit.base.monitor.e();
            eVar2.b = eVar.b;
            eVar2.e = powerMessage.messageId;
            eVar2.j = omg.f();
            eVar2.d = powerMessage.sourceType == 2 ? 200 : 100;
            eVar2.c = 1;
            olx.a().a(eVar2);
        }
    }

    public muz<b> downObserver() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (muz) ipChange.ipc$dispatch("6fbdc5f5", new Object[]{this}) : this.msgManager;
    }

    public com.taobao.tao.messagekit.core.model.d<b<BaseMessage>> endStream() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.messagekit.core.model.d) ipChange.ipc$dispatch("a48fa015", new Object[]{this}) : this.endStream;
    }

    public onh getPullManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (onh) ipChange.ipc$dispatch("b7312724", new Object[]{this}) : this.pullManager;
    }

    @Override // com.taobao.tao.powermsg.common.d
    public com.taobao.tao.powermsg.common.c getStableDispatcher(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.powermsg.common.c) ipChange.ipc$dispatch("56042a0a", new Object[]{this, str}) : com.taobao.tao.powermsg.managers.a.a(str);
    }

    public List<PowerMessage> getStashMessages(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9762e04c", new Object[]{this, new Integer(i), str});
        }
        com.taobao.tao.powermsg.managers.c cVar = this.msgManager;
        List<b<BaseMessage>> a2 = cVar.a("" + i, str);
        ArrayList arrayList = new ArrayList();
        if (a2 != null) {
            for (b<BaseMessage> bVar : a2) {
                arrayList.add(d.a(bVar.f20780a));
            }
        }
        return arrayList;
    }

    public void pullMessages(final int i, final String str, int i2, final com.taobao.tao.powermsg.common.b bVar, final Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98011aa5", new Object[]{this, new Integer(i), str, new Integer(i2), bVar, objArr});
            return;
        }
        final Request create = Request.create();
        create.bizCode = i;
        create.needACK = false;
        create.header.f31524a = str;
        create.header.g = 401;
        create.body.b = i2;
        MsgLog.a(TAG, "pullMessages >", Long.valueOf(create.body.f31520a), "duration:", Integer.valueOf(i2), "topic:", create.header.f31524a);
        tao.reactivex.e.a(new b(create)).b(new jew<jdz>() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void a(jdz jdzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ef304458", new Object[]{this, jdzVar});
                } else {
                    com.taobao.tao.messagekit.base.d.a().e().a(create.header.f, new com.taobao.tao.messagekit.core.model.a() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.6.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.messagekit.core.model.a
                        public void a(int i3, Map<String, Object> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i3), map});
                                return;
                            }
                            PowerMsgServiceImpl.invoke(i3, map, bVar, objArr);
                            MsgLog.b(PowerMsgServiceImpl.TAG, "pullMessages >", Integer.valueOf(i3), str, "biz:", Integer.valueOf(i));
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

    @Override // com.taobao.tao.powermsg.common.d
    public boolean queryMessagesByStream(int i, String str, f fVar) {
        h a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a83026b9", new Object[]{this, new Integer(i), str, fVar})).booleanValue();
        }
        try {
            a2 = com.taobao.tao.powermsg.managers.e.a(i, str);
        } catch (Throwable th) {
            MsgLog.c(TAG, th, "queryMessagesByStream err");
        }
        if (a2 == null) {
            MsgLog.c(TAG, "queryMessagesByStream topicInfo = null");
            return false;
        }
        AccsStreamConfig accsStreamConfig = new AccsStreamConfig("powermsg3");
        accsStreamConfig.setStreamId(a2.c());
        accsStreamConfig.setStartSeq(fVar.e());
        accsStreamConfig.setEndSeq(fVar.h());
        ACCSClient.getAccsClient(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG).queryStream(accsStreamConfig);
        return true;
    }

    @Override // com.taobao.tao.powermsg.common.d
    public int registerDispatcher(int i, String str, com.taobao.tao.powermsg.common.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("846bc1cc", new Object[]{this, new Integer(i), str, cVar})).intValue() : com.taobao.tao.powermsg.managers.a.a(i, str, cVar);
    }

    @Override // com.taobao.tao.powermsg.common.d
    public void registerStableDispatcher(String str, com.taobao.tao.powermsg.common.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df117ff3", new Object[]{this, str, cVar});
        } else {
            com.taobao.tao.powermsg.managers.a.a(str, cVar);
        }
    }

    public void report(int i, BaseMessage baseMessage, int i2, int i3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861411a1", new Object[]{this, new Integer(i), baseMessage, new Integer(i2), new Integer(i3), str});
        } else if (baseMessage == null) {
        } else {
            b bVar = new b(new Report(baseMessage, i2, d.b(baseMessage), i3));
            ((BaseMessage) bVar.f20780a).bizCode = i;
            if (!StringUtils.isEmpty(str)) {
                ((BaseMessage) bVar.f20780a).header.f = str;
            }
            tao.reactivex.e.a(bVar).b(com.taobao.tao.messagekit.base.d.a().b());
            MsgLog.b(TAG, "reportMessage >");
            MsgLog.a(TAG, bVar);
        }
    }

    @Override // com.taobao.tao.powermsg.common.d
    @Deprecated
    public void report(int i, PowerMessage powerMessage, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b301645d", new Object[]{this, new Integer(i), powerMessage, new Integer(i2)});
        } else if (powerMessage == null) {
        } else {
            report(i, d.a(powerMessage), i2, 0, powerMessage.messageId);
        }
    }

    public int returnCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85a1e537", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // com.taobao.tao.powermsg.common.d
    public void sendMessage(int i, PowerMessage powerMessage, com.taobao.tao.powermsg.common.b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a63c4b02", new Object[]{this, new Integer(i), powerMessage, bVar, objArr});
        } else {
            sendMessageImpl(i, powerMessage, null, bVar, objArr);
        }
    }

    @Override // com.taobao.tao.powermsg.common.d
    public void sendRequest(int i, String str, int i2, int i3, int i4, final com.taobao.tao.powermsg.common.b bVar, final Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6798bcf", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4), bVar, objArr});
            return;
        }
        Request create = Request.create();
        create.bizCode = i;
        create.header.g = i2;
        create.header.f31524a = str;
        create.body.f31520a = i3;
        create.body.b = i4;
        final b bVar2 = new b(create);
        tao.reactivex.e.a(bVar2).a(k.a()).b(new jew<jdz>() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void a(jdz jdzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ef304458", new Object[]{this, jdzVar});
                } else {
                    com.taobao.tao.messagekit.base.d.a().e().a(((BaseMessage) bVar2.f20780a).header.f, new com.taobao.tao.messagekit.core.model.a() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.messagekit.core.model.a
                        public void a(int i5, Map<String, Object> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i5), map});
                                return;
                            }
                            MsgLog.a(PowerMsgServiceImpl.TAG, "receiveRequest >", Integer.valueOf(((BaseMessage) bVar2.f20780a).header.g), "topic:", ((BaseMessage) bVar2.f20780a).header.f31524a, "code:", Integer.valueOf(i5));
                            PowerMsgServiceImpl.invoke(i5, map, bVar, objArr);
                            if (i5 == 1000) {
                                com.taobao.tao.messagekit.core.utils.d.a("POWERMSG", "POWERMSG_REQUEST_RATE");
                                return;
                            }
                            com.taobao.tao.messagekit.core.utils.d.a("POWERMSG", "POWERMSG_REQUEST_RATE", "" + i5, (String) null);
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
        MsgLog.a(TAG, "sendRequest >", str, "biz:", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    @Override // com.taobao.tao.powermsg.common.d
    public void sendStreamMessage(int i, PowerMessage powerMessage, f fVar, com.taobao.tao.powermsg.common.b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d83468", new Object[]{this, new Integer(i), powerMessage, fVar, bVar, objArr});
            return;
        }
        b bVar2 = new b(d.a(powerMessage));
        ((BaseMessage) bVar2.f20780a).bizCode = i;
        try {
            if (!StringUtils.isEmpty(fVar.f())) {
                ((BaseMessage) bVar2.f20780a).header.p = fVar.f();
            }
            bVar2.m = true;
            int i2 = fVar.a() == 2 ? 5 : 1;
            ((BaseMessage) bVar2.f20780a).sysCode = i2;
            bVar2.b = i2;
            if (!StringUtils.isEmpty(Launcher_InitAccs.mUserId)) {
                if (((BaseMessage) bVar2.f20780a).header.n == null) {
                    ((BaseMessage) bVar2.f20780a).header.n = new HashMap(2);
                }
                ((BaseMessage) bVar2.f20780a).header.n.put("userId", Launcher_InitAccs.mUserId);
                Map<String, String> map = ((BaseMessage) bVar2.f20780a).header.n;
                map.put("clientSendTime", a.a() + "");
            }
            String id = ((BaseMessage) bVar2.f20780a).getID();
            com.taobao.tao.powermsg.managers.c.a(id, i + "", powerMessage.topic);
            MsgLog.c(TAG, "start sendStreamMessage", "namespace:", Integer.valueOf(i), "topic:", powerMessage.topic, "msgid:", ((BaseMessage) bVar2.f20780a).getID());
            com.taobao.tao.messagekit.base.network.b.a(bVar2.k).a(bVar2);
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.tao.powermsg.common.d
    public void sendText(int i, TextPowerMessage textPowerMessage, com.taobao.tao.powermsg.common.b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ce819", new Object[]{this, new Integer(i), textPowerMessage, bVar, objArr});
        } else if (!StringUtils.isEmpty(textPowerMessage.text) || (textPowerMessage.value != null && textPowerMessage.value.size() > 0)) {
            sendMessage(i, textPowerMessage, bVar, objArr);
        } else {
            invoke(-3005, null, bVar, objArr);
        }
    }

    @Override // com.taobao.tao.powermsg.common.d
    public void setMsgFetchMode(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d9421b", new Object[]{this, new Integer(i), str, new Integer(i2)});
            return;
        }
        com.taobao.tao.powermsg.managers.a.a("" + i, str, i2);
    }

    @Deprecated
    public void setSubscribeMode(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb3b568", new Object[]{this, new Integer(i), str, new Integer(i2)});
            return;
        }
        com.taobao.tao.powermsg.managers.a.b("" + i, str, i2);
    }

    @Override // com.taobao.tao.powermsg.common.d
    public void subscribe(int i, String str, String str2, String str3, String str4, com.taobao.tao.powermsg.common.b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e40a18f9", new Object[]{this, new Integer(i), str, str2, str3, str4, bVar, objArr});
        } else {
            subscribe(i, str, null, str2, str3, str4, bVar, objArr);
        }
    }

    @Override // com.taobao.tao.powermsg.common.d
    public void subscribe(int i, String str, String str2, String str3, String str4, String str5, com.taobao.tao.powermsg.common.b bVar, f fVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9864d75", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, bVar, fVar, objArr});
        } else {
            subscribeImpl(i, str, str2, str3, str4, str5, bVar, fVar, objArr);
        }
    }

    @Override // com.taobao.tao.powermsg.common.d
    public void subscribe(int i, String str, String str2, String str3, String str4, String str5, com.taobao.tao.powermsg.common.b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6385d3ef", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, bVar, objArr});
        } else {
            subscribeImpl(i, str, str2, str3, str4, str5, bVar, null, objArr);
        }
    }

    @Deprecated
    public void subscribeDirectly(int i, String str, String str2, String str3, com.taobao.tao.powermsg.common.b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ba45d9", new Object[]{this, new Integer(i), str, str2, str3, bVar, objArr});
            return;
        }
        MsgLog.b(TAG, "force subscribe >", str, "biz:", Integer.valueOf(i));
        invoke(-3005, null, bVar, objArr);
    }

    @Override // com.taobao.tao.powermsg.common.d
    public void unRegisterStableDispatcher(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104cf0cf", new Object[]{this, str});
        } else {
            com.taobao.tao.powermsg.managers.a.b(str);
        }
    }

    @Override // com.taobao.tao.powermsg.common.d
    public void unSubscribe(int i, String str, String str2, String str3, String str4, com.taobao.tao.powermsg.common.b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4958a0", new Object[]{this, new Integer(i), str, str2, str3, str4, bVar, objArr});
        } else {
            unSubscribe(i, str, null, str2, str3, str4, bVar, objArr);
        }
    }

    @Override // com.taobao.tao.powermsg.common.d
    public void unSubscribe(int i, String str, String str2, String str3, String str4, String str5, final com.taobao.tao.powermsg.common.b bVar, f fVar, final Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763dd79c", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, bVar, fVar, objArr});
            return;
        }
        MsgLog.c(TAG, "unSubscribe >", str, "biz:", Integer.valueOf(i), "biztag:", str4, str2);
        if (!com.taobao.tao.powermsg.managers.e.d(i, str, str4, str2)) {
            MsgLog.c(TAG, Integer.valueOf(i), "unSubscribe:", str, "biztag:", str4, str2, "biztag not bind");
            invoke(-3005, null, bVar, objArr);
            return;
        }
        com.taobao.tao.messagekit.base.d.a().f().b(i, str, str2, str3, str4);
        Pair<Integer, Integer> b = com.taobao.tao.powermsg.managers.e.b(str, str4);
        if (this.subscribeManager.b(i, str, str2, str3, str4, str5, b.first.intValue(), b.second.intValue(), fVar, new com.taobao.tao.messagekit.core.model.a() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.messagekit.core.model.a
            public void a(int i2, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i2), map});
                } else {
                    PowerMsgServiceImpl.invoke(i2, map, bVar, objArr);
                }
            }
        }) != 1) {
            return;
        }
        this.pullManager.a(i, str, str4, 1, 1);
    }

    @Override // com.taobao.tao.powermsg.common.d
    public void unSubscribe(int i, String str, String str2, String str3, String str4, String str5, com.taobao.tao.powermsg.common.b bVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953917d6", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, bVar, objArr});
        } else {
            unSubscribe(i, str, str2, str3, str4, str5, bVar, null, objArr);
        }
    }
}
