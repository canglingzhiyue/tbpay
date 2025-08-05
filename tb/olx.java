package tb;

import android.os.SystemClock;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.message.kit.util.MsgMonitor;
import com.taobao.tao.messagekit.base.c;
import com.taobao.tao.messagekit.base.monitor.e;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.Monitor;
import com.taobao.tao.messagekit.core.model.b;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.mto;
import tb.njw;
import tb.njx;

/* loaded from: classes8.dex */
public class olx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static olx f32168a;
    private boolean b = true;
    private Map<String, Map<String, Object>> c = Collections.synchronizedMap(new HashMap());
    private int d = -1;

    static {
        kge.a(-1567866336);
        f32168a = new olx();
    }

    public static /* synthetic */ Map a(olx olxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a6e05632", new Object[]{olxVar}) : olxVar.c;
    }

    public static olx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (olx) ipChange.ipc$dispatch("f08be43", new Object[0]) : f32168a;
    }

    private void a(e eVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6665a9f", new Object[]{this, eVar, new Long(j)});
            return;
        }
        try {
            int i = eVar.b;
            b(eVar);
            Monitor create = Monitor.create();
            njw.h body = create.getBody();
            body.d = 1;
            body.e = 0;
            body.c = 2;
            body.g = new njw.a();
            njw.d dVar = new njw.d();
            if (eVar.h == 5) {
                body.g.b = new njw.d[1];
                body.g.b[0] = dVar;
            } else {
                body.g.f31509a = new njw.d[1];
                body.g.f31509a[0] = dVar;
            }
            njw.o oVar = new njw.o();
            oVar.b = eVar.g == null ? "" : eVar.g;
            oVar.f31523a = eVar.i;
            oVar.g = com.taobao.tao.powermsg.managers.e.a(eVar.g) ? 1 : 2;
            dVar.f31512a = oVar;
            njw.e eVar2 = new njw.e();
            dVar.b = new njw.e[1];
            dVar.b[0] = eVar2;
            eVar2.f31513a = eVar.e;
            eVar2.f = true;
            eVar2.h = 1;
            eVar2.i = i + "";
            eVar2.d = a.a();
            eVar2.e = (int) (eVar2.d - eVar.f);
            MsgLog.c("PowerMsgFullLinkMgr", "fullLinkMonitor >", "oriMsgId", eVar.e, "accsMsgId", create.header.f, "delay", Integer.valueOf(eVar2.e));
            b bVar = new b(create);
            bVar.k = 0;
            byte[] protocol = ((Monitor) bVar.f20780a).toProtocol();
            AccsConnection.DataPackage dataPackage = new AccsConnection.DataPackage(((Monitor) bVar.f20780a).routerId, bVar.b, ((Monitor) bVar.f20780a).header.f31524a);
            dataPackage.a(bVar);
            dataPackage.d().write(protocol);
            ((AccsConnection) com.taobao.tao.messagekit.base.network.b.a(bVar.k)).a(dataPackage);
            MsgLog.c("PowerMsgFullLinkMgr", "sendAccsData", create.header.f);
        } catch (Exception e) {
            MsgLog.c("PowerMsgFullLinkMgr", e, "accsMonitor err");
            ols.a(ols.POINT_ACCS_EXCEPTION, e.toString(), mto.a.GEO_NOT_SUPPORT);
        }
    }

    private void a(final e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66696af", new Object[]{this, eVar, new Boolean(z)});
            return;
        }
        try {
            int i = eVar.b;
            if (i <= 1 || i >= 99) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                com.taobao.tao.messagekit.base.monitor.monitorthread.b.a().execute(new Runnable() { // from class: tb.olx.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            olx.a(olx.this, eVar, elapsedRealtime);
                        }
                    }
                });
                return;
            }
            MsgLog.a("PowerMsgFullLinkMgr", "skip step: " + i);
        } catch (Throwable th) {
            MsgLog.c("PowerMsgFullLinkMgr", th, "fullLinkMonitor exception");
        }
    }

    private void a(b bVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3ff68b", new Object[]{this, bVar, new Integer(i), new Integer(i2)});
        } else if (!b()) {
        } else {
            if (bVar == null || bVar.f20780a == 0) {
                MsgLog.c("PowerMsgFullLinkMgr", "commitMsgFullLink illegal param p=" + bVar);
                if (bVar == null) {
                    return;
                }
                MsgLog.c("PowerMsgFullLinkMgr", "commitMsgFullLink illegal param =" + bVar.toString());
            } else if (bVar.q != 1) {
            } else {
                e eVar = new e();
                eVar.b = i;
                eVar.e = bVar.f20780a.getID();
                eVar.f20763a = i2;
                if (bVar.f20780a instanceof BaseMessage) {
                    try {
                        BaseMessage baseMessage = (BaseMessage) bVar.f20780a;
                        eVar.h = baseMessage.type;
                        eVar.i = baseMessage.bizCode;
                        njx.a aVar = baseMessage.header;
                        eVar.f = Long.parseLong(aVar.n.get(RemoteMessageConst.SEND_TIME));
                        eVar.g = aVar.f31524a;
                    } catch (Exception e) {
                        MsgLog.c("PowerMsgFullLinkMgr", e, "fullLinkParam header err");
                    }
                }
                eVar.d = bVar.d == 2 ? 200 : 100;
                a(eVar);
            }
        }
    }

    public static /* synthetic */ void a(olx olxVar, e eVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf5b12a", new Object[]{olxVar, eVar, new Long(j)});
        } else {
            olxVar.a(eVar, j);
        }
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : (c.a("debug_full_link", 1) == 1 || i == 1 || i == 70 || i == 99 || i >= 100) ? false : true;
    }

    private Map<String, Object> b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("68662abb", new Object[]{this, eVar});
        }
        final String d = d(eVar);
        Map<String, Object> map = this.c.get(d);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        this.c.put(d, hashMap);
        tao.reactivex.e.a(10L, TimeUnit.SECONDS).a(new jew<Long>() { // from class: tb.olx.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void a(Long l) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ed6d4a7", new Object[]{this, l});
                } else if (olx.a(olx.this).remove(d) == null) {
                } else {
                    MsgLog.c("PowerMsgFullLinkMgr", "has object key=" + d);
                    MsgMonitor.commitCount("MKT", "c_full_link_cache_ERR", 1.0d);
                }
            }

            @Override // tb.jew
            public /* synthetic */ void accept(Long l) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b028bfab", new Object[]{this, l});
                } else {
                    a(l);
                }
            }
        }, new jew<Throwable>() { // from class: tb.olx.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void a(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                    return;
                }
                MsgLog.c("PowerMsgFullLinkMgr", "has object throwable=" + Log.getStackTraceString(th));
            }

            @Override // tb.jew
            public /* synthetic */ void accept(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b028bfab", new Object[]{this, th});
                } else {
                    a(th);
                }
            }
        });
        return hashMap;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.d == -1) {
            this.d = c.a("enable_full_link", 1);
            MsgLog.c("PowerMsgFullLinkMgr", "enableFullLink=" + this.d);
        }
        if (this.d == 0) {
            return false;
        }
        if (this.b) {
            return true;
        }
        MsgLog.c("PowerMsgFullLinkMgr", "commitMsgFullLink hasFullLink= false");
        return false;
    }

    private Map<String, Object> c(e eVar) {
        IpChange ipChange = $ipChange;
        return (Map) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("22dbcb3c", new Object[]{this, eVar}) : this.c.remove(d(eVar)));
    }

    private String d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1edce18", new Object[]{this, eVar});
        }
        return eVar.e + eVar.d + eVar.c;
    }

    private boolean e(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d5994dcd", new Object[]{this, eVar})).booleanValue() : this.c.containsKey(d(eVar));
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb0b4c5", new Object[]{this, eVar});
        } else if (!b() || a(eVar.b)) {
        } else {
            MsgLog.c("PowerMsgFullLinkMgr", "commitMsgFullLink, msgid:", eVar.e, "stepid:", Integer.valueOf(eVar.b));
            try {
                if (eVar.b != 1 && eVar.b != 101 && eVar.b != 99) {
                    if (!e(eVar)) {
                        MsgLog.c("PowerMsgFullLinkMgr", "not have context param=" + eVar.toString());
                        MsgMonitor.commitCount("MKT", "c_full_link_ERR", 1.0d);
                        return;
                    }
                    a(eVar, false);
                    if (eVar.b != 99 && eVar.b != 199 && eVar.f20763a == 1000) {
                        return;
                    }
                    c(eVar);
                    return;
                }
                a(eVar, true);
            } catch (Throwable th) {
                if (th instanceof NoClassDefFoundError) {
                    this.b = false;
                }
                MsgLog.c("PowerMsgFullLinkMgr", "commitMsgFullLink exception=" + th.getMessage());
            }
        }
    }

    public void a(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("727deb78", new Object[]{this, bVar, new Integer(i)});
        } else {
            a(bVar, i, 1000);
        }
    }

    public void b(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf57917", new Object[]{this, bVar, new Integer(i)});
        } else {
            a(bVar, i, 2000);
        }
    }
}
