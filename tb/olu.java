package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.d;
import com.taobao.tao.messagekit.base.f;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.common.StreamFullLinkMonitor;
import com.taobao.tao.powermsg.model.MessageFrame;
import java.util.List;
import java.util.Map;
import tao.reactivex.e;
import tao.reactivex.f.k;
import tao.reactivex.i;

/* loaded from: classes8.dex */
public abstract class olu<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONNECTION_CODE = "ConnectionCode";
    public static final String CONNECTION_TYPE = "ConnectionType";

    /* renamed from: a  reason: collision with root package name */
    private a<List<com.taobao.tao.messagekit.core.model.b>, T> f32161a;
    public int b;
    public int c;
    private b<c<R>, List<com.taobao.tao.messagekit.core.model.b>> d;

    /* loaded from: classes8.dex */
    public interface a<T, R> extends i<T, R> {
    }

    /* loaded from: classes8.dex */
    public interface b<T, R> extends i<T, R> {
        Ack a(int i, Map<String, Object> map);
    }

    /* loaded from: classes8.dex */
    public static class c<R> {
        public static final int MSG_FULL_LINK_KEY = 30;
        public static final int MSG_FULL_LINK_KEY_NEW = 0;

        /* renamed from: a  reason: collision with root package name */
        public String f32167a;
        public int b;
        public String c;
        public R d;
        public long e;
        public StreamFullLinkMonitor f;
        public Map<Integer, String> g;

        static {
            kge.a(-1872419374);
        }

        public c(String str, int i, String str2, R r) {
            this.f32167a = str;
            this.b = i;
            this.c = str2;
            this.d = r;
        }

        public c(String str, int i, String str2, R r, Map<Integer, String> map) {
            this.f32167a = str;
            this.b = i;
            this.c = str2;
            this.d = r;
            this.g = map;
        }
    }

    static {
        kge.a(2052554163);
    }

    public static String a(BaseMessage baseMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8a55743", new Object[]{baseMessage, new Boolean(z)});
        }
        String a2 = a(baseMessage.routerId, baseMessage.sysCode, baseMessage.bizCode, baseMessage.header.f31524a);
        if (baseMessage.type != 7 && !z) {
            return a2;
        }
        return a2 + "id:" + baseMessage.getID();
    }

    public static String a(String str, int i, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e82ee6c4", new Object[]{str, new Integer(i), new Integer(i2), str2});
        }
        String str3 = "sys:" + i + "biz:" + i2 + "t:" + str2;
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return "ip:" + str + str3;
    }

    public abstract int a(int i, String str);

    public void a(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
        }
    }

    public abstract void a(com.taobao.tao.messagekit.core.model.b bVar);

    public void a(final String str, final int i, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6e4a54", new Object[]{this, str, new Integer(i), map});
            return;
        }
        Object[] objArr = new Object[7];
        objArr[0] = "type:";
        objArr[1] = Integer.valueOf(this.b);
        objArr[2] = str;
        objArr[3] = "response:";
        objArr[4] = Integer.valueOf(i);
        objArr[5] = "service:";
        objArr[6] = map != null ? map.get("service_id") : null;
        MsgLog.b("BaseConnection", objArr);
        e.a(str).b(k.a()).a((jgn) new jgn<String, e<f.a>>() { // from class: tb.olu.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public e<f.a> a(String str2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (e) ipChange2.ipc$dispatch("90c7655b", new Object[]{this, str2}) : e.a((Iterable) d.a().g().a(str));
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [tao.reactivex.e<com.taobao.tao.messagekit.base.f$a>, java.lang.Object] */
            @Override // tb.jgn
            public /* synthetic */ e<f.a> apply(String str2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("7a74adc1", new Object[]{this, str2}) : a(str2);
            }
        }).c(new jew<f.a>() { // from class: tb.olu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void a(f.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77641af2", new Object[]{this, aVar});
                } else if (aVar == null) {
                } else {
                    Ack ack = new Ack(aVar.f20755a.f20780a);
                    olu oluVar = olu.this;
                    int i2 = i;
                    Map map2 = map;
                    int a2 = oluVar.a(i2, (String) (map2 != null ? map2.get("re_msg") : null));
                    ack.setStatus(a2);
                    com.taobao.tao.messagekit.core.model.b bVar = new com.taobao.tao.messagekit.core.model.b(ack);
                    bVar.c = str;
                    bVar.n = aVar.f20755a.n;
                    e.a(bVar).b(aVar);
                    if (-30000 == a2 || 1000 == a2) {
                        olu.this.c = 0;
                        com.taobao.tao.messagekit.core.utils.d.a("MKT", "MKT_ACCS_RATE");
                        return;
                    }
                    if (olu.this.c < 3) {
                        olu.this.c++;
                    }
                    com.taobao.tao.messagekit.core.utils.d.a("MKT", "MKT_ACCS_RATE", "" + i, (String) null);
                }
            }

            @Override // tb.jew
            public /* synthetic */ void accept(f.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b028bfab", new Object[]{this, aVar});
                } else {
                    a(aVar);
                }
            }
        });
        if (map == null) {
            return;
        }
        try {
            StreamFullLinkMonitor b2 = com.taobao.tao.powermsg.managers.c.b(str);
            if (b2 == null) {
                return;
            }
            if (map.containsKey("accsUpTime")) {
                b2.setAccsUpTime(Long.parseLong(map.get("accsUpTime") + ""));
            }
            if (map.containsKey("send2NetworkStartTime")) {
                b2.setSend2NetworkStartTime(Long.parseLong(map.get("send2NetworkStartTime") + ""));
            }
            if (!map.containsKey("send2NetworkEndTime")) {
                return;
            }
            b2.setSend2NetworkEndTime(Long.parseLong(map.get("send2NetworkEndTime") + ""));
        } catch (Throwable unused) {
        }
    }

    public void a(a<List<com.taobao.tao.messagekit.core.model.b>, T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891505c3", new Object[]{this, aVar});
        } else {
            this.f32161a = aVar;
        }
    }

    public void a(b<c<R>, List<com.taobao.tao.messagekit.core.model.b>> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89157a22", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }

    public void a(final c<R> cVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8915ee81", new Object[]{this, cVar});
        } else if (cVar != null && c() != null) {
            ols.a(ols.POINT_PARSE_MESSAGE, "");
            MsgLog.b("BaseConnection", "receive >>>", cVar.c, cVar.f32167a, Integer.valueOf(cVar.b));
            cVar.e = SystemClock.elapsedRealtime();
            e.a(cVar).b(k.a()).a((i) c()).a(new jgn<List<com.taobao.tao.messagekit.core.model.b>, e<com.taobao.tao.messagekit.core.model.b>>() { // from class: tb.olu.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public e<com.taobao.tao.messagekit.core.model.b> a(List<com.taobao.tao.messagekit.core.model.b> list) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (e) ipChange2.ipc$dispatch("d6ad1482", new Object[]{this, list});
                    }
                    for (com.taobao.tao.messagekit.core.model.b bVar : list) {
                        if (bVar.o != null) {
                            bVar.o.parseMapTime = SystemClock.elapsedRealtime();
                        }
                        if (bVar.f20780a instanceof MessageFrame) {
                            bVar.p = cVar.f;
                            if (bVar.p != null) {
                                bVar.p.setPmReceivedTime(com.taobao.tao.messagekit.core.utils.a.a());
                            }
                        }
                    }
                    return e.a((Iterable) list);
                }

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, tao.reactivex.e<com.taobao.tao.messagekit.core.model.b>] */
                @Override // tb.jgn
                public /* synthetic */ e<com.taobao.tao.messagekit.core.model.b> apply(List<com.taobao.tao.messagekit.core.model.b> list) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("7a74adc1", new Object[]{this, list}) : a(list);
                }
            }).a(new jrg<com.taobao.tao.messagekit.core.model.b>() { // from class: tb.olu.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public boolean a(com.taobao.tao.messagekit.core.model.b bVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("da6724ef", new Object[]{this, bVar})).booleanValue();
                    }
                    if (MsgLog.a(MsgLog.Level.D)) {
                        MsgLog.a("BaseConnection", bVar);
                    }
                    if (bVar.f20780a instanceof Ack) {
                        f.a a2 = d.a().g().a((String) null, bVar.f20780a.getID());
                        if (a2 != null) {
                            bVar.n = a2.f20755a.n;
                            e.a(bVar).b(a2);
                        }
                        olx.a().b(bVar, 99);
                        return false;
                    } else if (bVar.f20780a.type() != 3) {
                        if (bVar.o != null) {
                            bVar.o.upFilterTime = SystemClock.elapsedRealtime();
                        }
                        return true;
                    } else {
                        e.a(bVar).b(d.a().d());
                        com.taobao.tao.messagekit.core.utils.d.a("MKT", ErrorType.CRASH, 1.0d);
                        olx.a().a(bVar, 99);
                        return false;
                    }
                }

                @Override // tb.jrg
                public /* synthetic */ boolean test(com.taobao.tao.messagekit.core.model.b bVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("5a0eabb9", new Object[]{this, bVar})).booleanValue() : a(bVar);
                }
            }).a(new jew<Throwable>() { // from class: tb.olu.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void a(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                    } else {
                        MsgLog.c("BaseConnection", "onReceive error", th.toString());
                    }
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
            }).b(d.a().c());
        } else if (omg.c()) {
            throw new Error("Converter2Msg " + this.b + " not set");
        } else {
            Object[] objArr = new Object[5];
            objArr[0] = "receive >>> receive is null";
            objArr[1] = "type:";
            objArr[2] = Integer.valueOf(this.b);
            objArr[3] = "receive is null?";
            if (cVar != null) {
                z = false;
            }
            objArr[4] = Boolean.valueOf(z);
            MsgLog.c("BaseConnection", objArr);
            ols.a(ols.POINT_PARSE_MESSAGE, "", "", "receive is null");
        }
    }

    public a<List<com.taobao.tao.messagekit.core.model.b>, T> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("51ae5ba8", new Object[]{this}) : this.f32161a;
    }

    public b<c<R>, List<com.taobao.tao.messagekit.core.model.b>> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("338c2566", new Object[]{this}) : this.d;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.b;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.c < 3;
    }
}
