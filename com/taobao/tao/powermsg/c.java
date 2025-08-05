package com.taobao.tao.powermsg;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.d;
import com.taobao.tao.messagekit.core.model.AccsConnInfo;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.Monitor;
import com.taobao.tao.messagekit.core.model.b;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.common.g;
import com.taobao.tao.powermsg.common.h;
import com.taobao.tao.powermsg.managers.e;
import java.util.HashMap;
import tao.reactivex.e;
import tb.jgn;
import tb.jrg;
import tb.kge;
import tb.njw;
import tb.olt;
import tb.olu;
import tb.olv;
import tb.omg;
import tb.onc;
import tb.one;

/* loaded from: classes8.dex */
public class c implements d.a, d.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONF_SEND_SWITCH = "send_switch";
    public static final String CONF_SEND_SWITCH_OPEN = "0";

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, b<BaseMessage>> f20831a = new HashMap<>();

    static {
        kge.a(1629702660);
        kge.a(389679621);
        kge.a(287428300);
    }

    public static /* synthetic */ int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : b(i);
    }

    public static /* synthetic */ HashMap a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("72e1374c", new Object[]{cVar}) : cVar.f20831a;
    }

    private void a(b<BaseMessage> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6724eb", new Object[]{this, bVar});
        } else if (bVar.f20780a.header.g == 402 || bVar.f20780a.header.g == 403 || bVar.f20780a.type == 2 || bVar.f20780a.type == 1) {
            this.f20831a.put(bVar.f20780a.getID(), bVar);
        } else {
            olu a2 = com.taobao.tao.messagekit.base.network.b.a(bVar.k);
            if (a2 != null && a2.e()) {
                return;
            }
            MsgLog.b("Strategy", bVar.f20780a.getID(), Integer.valueOf(bVar.k), "connection is broken");
            bVar.k = b(bVar.k);
        }
    }

    public static /* synthetic */ void a(c cVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348fdac", new Object[]{cVar, bVar});
        } else {
            cVar.a(bVar);
        }
    }

    private boolean a(int i, b<BaseMessage> bVar) {
        Ack a2;
        Ack a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e91dd22", new Object[]{this, new Integer(i), bVar})).booleanValue();
        }
        olv a4 = com.taobao.tao.messagekit.base.d.a().j().a(i);
        if (a4 != null && bVar != null) {
            if (i == 301 && (a4 instanceof onc) && (a3 = ((onc) a4).a(bVar)) != null) {
                bVar.f20780a = a3;
                bVar.b = a3.sysCode;
                e.a(bVar).b(com.taobao.tao.messagekit.base.d.a().d());
                MsgLog.c("Strategy", "addBlackList", bVar.f20780a.getID());
                return true;
            } else if (i == 303 && (a4 instanceof one) && (a2 = ((one) a4).a(bVar)) != null) {
                bVar.f20780a = a2;
                bVar.b = a2.sysCode;
                e.a(bVar).b(com.taobao.tao.messagekit.base.d.a().d());
                MsgLog.c("Strategy", "flowLimit", bVar.f20780a.getID());
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean a(c cVar, int i, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41eb1c81", new Object[]{cVar, new Integer(i), bVar})).booleanValue() : cVar.a(i, bVar);
    }

    private static int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue() : i == 1 ? 0 : 1;
    }

    @Override // com.taobao.tao.messagekit.base.d.a
    public tao.reactivex.c<b> a(tao.reactivex.c<b> cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tao.reactivex.c) ipChange.ipc$dispatch("461c937e", new Object[]{this, cVar}) : cVar.a(new jrg<b>() { // from class: com.taobao.tao.powermsg.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public boolean a(b bVar) {
                b bVar2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("da6724ef", new Object[]{this, bVar})).booleanValue();
                }
                if (bVar.f20780a instanceof AccsConnInfo) {
                    for (e.a aVar : com.taobao.tao.powermsg.managers.e.a()) {
                        if (aVar.f20858a == 2) {
                            try {
                                int parseInt = Integer.parseInt(aVar.j.keyAt(0).split("c:")[0]);
                                aVar.g = true;
                                h a2 = com.taobao.tao.powermsg.managers.e.a(parseInt, aVar.b);
                                if (a2 == null) {
                                    g.a(parseInt, aVar.b, aVar.d, aVar.e, aVar.c, aVar.f, null, new Object[0]);
                                } else if (a2.a() != null && olt.b()) {
                                    g.a(parseInt, aVar.b, aVar.d, aVar.e, aVar.c, aVar.f, null, a2.a(), new Object[0]);
                                }
                            } catch (Exception e) {
                                MsgLog.c("Strategy", "buildResponseStrategy err", e);
                            }
                            MsgLog.a("Strategy", "buildResponseStrategy AccsConnInfo:" + aVar);
                        }
                    }
                } else if (1000 != bVar.f20780a.statusCode() && (bVar2 = (b) c.a(c.this).remove(bVar.f20780a.getID())) != null) {
                    MsgLog.c("Strategy", ((BaseMessage) bVar2.f20780a).getID(), Integer.valueOf(bVar2.k), "failed retry another connection");
                    bVar2.k = c.a(bVar2.k);
                    tao.reactivex.e.a(bVar2).c(com.taobao.tao.messagekit.base.d.a().i());
                    return false;
                }
                return true;
            }

            @Override // tb.jrg
            public /* synthetic */ boolean test(b bVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("5a0eabb9", new Object[]{this, bVar})).booleanValue() : a(bVar);
            }
        });
    }

    @Override // com.taobao.tao.messagekit.base.d.b
    public tao.reactivex.c<b> b(tao.reactivex.c<b> cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tao.reactivex.c) ipChange.ipc$dispatch("a76f301d", new Object[]{this, cVar}) : cVar.a(new jrg<b>() { // from class: com.taobao.tao.powermsg.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public boolean a(b bVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("da6724ef", new Object[]{this, bVar})).booleanValue() : !c.a(c.this, 303, bVar) && !c.a(c.this, 301, bVar);
            }

            @Override // tb.jrg
            public /* synthetic */ boolean test(b bVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("5a0eabb9", new Object[]{this, bVar})).booleanValue() : a(bVar);
            }
        }).a(new jgn<b, b>() { // from class: com.taobao.tao.powermsg.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b a(b bVar) {
                njw.h body;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (b) ipChange2.ipc$dispatch("e14ac20e", new Object[]{this, bVar});
                }
                if (omg.f == 0 || omg.f == 1) {
                    bVar.k = omg.f;
                    return bVar;
                } else if (bVar.m) {
                    bVar.k = 0;
                    return bVar;
                } else {
                    boolean z = ((BaseMessage) bVar.f20780a).type == 7;
                    if (z) {
                        try {
                            if ((bVar.f20780a instanceof Monitor) && (body = ((Monitor) bVar.f20780a).getBody()) != null) {
                                if (body.d == 1) {
                                    z = false;
                                }
                            }
                        } catch (Throwable th) {
                            MsgLog.c("Strategy", th, "isMonitorByMtop err");
                        }
                    }
                    if (((BaseMessage) bVar.f20780a).msgType == 8 || ((BaseMessage) bVar.f20780a).msgType == 10 || z || ((BaseMessage) bVar.f20780a).header.g == 405) {
                        bVar.k = 1;
                    } else {
                        if (((BaseMessage) bVar.f20780a).type == 6 || ((BaseMessage) bVar.f20780a).header.g == 402 || ((BaseMessage) bVar.f20780a).header.g == 403 || ((BaseMessage) bVar.f20780a).type == 2 || ((BaseMessage) bVar.f20780a).type == 1) {
                            bVar.k = 0;
                        }
                        if ("0".equals(com.taobao.tao.messagekit.base.c.a(c.CONF_SEND_SWITCH, "0"))) {
                            c.a(c.this, bVar);
                        }
                    }
                    MsgLog.a("Strategy", ((BaseMessage) bVar.f20780a).getID(), Integer.valueOf(((BaseMessage) bVar.f20780a).type()), Integer.valueOf(((BaseMessage) bVar.f20780a).subType()), "connection use", Integer.valueOf(bVar.k));
                    return bVar;
                }
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.tao.messagekit.core.model.b, java.lang.Object] */
            @Override // tb.jgn
            public /* synthetic */ b apply(b bVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("7a74adc1", new Object[]{this, bVar}) : a(bVar);
            }
        });
    }
}
