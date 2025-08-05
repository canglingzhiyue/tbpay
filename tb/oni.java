package tb;

import android.support.v4.util.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.c;
import com.taobao.tao.messagekit.core.model.ErrorMessage;
import com.taobao.tao.messagekit.core.model.a;
import com.taobao.tao.messagekit.core.model.b;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.d;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import java.util.HashMap;
import java.util.Map;
import tao.reactivex.e;
import tao.reactivex.f.k;
import tb.oms;

/* loaded from: classes8.dex */
public class oni implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f32206a = c.a("pull_retry_error", 5);
    private ong b;

    static {
        kge.a(-306209028);
        kge.a(612839925);
    }

    public oni(ong ongVar) {
        this.b = ongVar;
    }

    public static /* synthetic */ ong a(oni oniVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ong) ipChange.ipc$dispatch("c5fed530", new Object[]{oniVar}) : oniVar.b;
    }

    public static /* synthetic */ int b(oni oniVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e6c0b6a2", new Object[]{oniVar})).intValue() : oniVar.f32206a;
    }

    @Override // com.taobao.tao.messagekit.core.model.a
    public void a(final int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Object obj = map.get("context");
        if ((obj instanceof Long) && !obj.equals(this.b.g)) {
            return;
        }
        e.a(map).b(k.a()).c(new jew<Map<String, Object>>() { // from class: tb.oni.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void a(Map<String, Object> map2) {
                int i2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map2});
                    return;
                }
                oni.a(oni.this).m.set(0);
                int i3 = -1;
                long j = -1;
                if (map2 == null || !(map2.get("data") instanceof oms.c)) {
                    i2 = 0;
                } else {
                    oms.c cVar = (oms.c) map2.get("data");
                    i2 = cVar.b;
                    j = cVar.f32183a;
                    i3 = cVar.c;
                }
                d.a("POWERMSG", "pullCost", new ArrayMap<String, String>() { // from class: tb.oni.1.1
                    {
                        put("POWERMSG_DIMENS_BIZ", "" + oni.a(oni.this).f32202a);
                        put("MKT_DIMENS_TOPIC", oni.a(oni.this).b);
                        put("code", "" + i);
                        put("mode", "" + oni.a(oni.this).d);
                        put("time", "" + oni.a(oni.this).e);
                    }
                }, new ArrayMap<String, Double>() { // from class: tb.oni.1.2
                    {
                        put("POWERMSG_MEASURE_DURATION", Double.valueOf((System.nanoTime() - oni.a(oni.this).g.longValue()) / 1000.0d));
                    }
                });
                if (j > 0) {
                    oni.a(oni.this).f = j;
                }
                if (i == 1000) {
                    oni.a(oni.this).i = 0;
                    com.taobao.tao.powermsg.managers.e.a(oni.a(oni.this).b, oni.a(oni.this).c, i2, i3);
                    MsgLog.b("PullManager", "receivePullMsg >", Integer.valueOf(oni.a(oni.this).d), "role:", Integer.valueOf(i2), "period", Integer.valueOf(i3), "offset:", Long.valueOf(oni.a(oni.this).f), "topic:", oni.a(oni.this).b, com.taobao.tao.powermsg.model.a.COL_BTAG, oni.a(oni.this).c);
                    if (-2 == oni.a(oni.this).k.get()) {
                        com.taobao.tao.powermsg.managers.e.b(oni.a(oni.this).b, oni.a(oni.this).c, i2, i3);
                    }
                    oni.a(oni.this).k.set(1);
                    d.a("MKT", "pcs", 1.0d);
                    d.a("MKT", "pull");
                    return;
                }
                ong a2 = oni.a(oni.this);
                int i4 = a2.i + 1;
                a2.i = i4;
                if (i4 % oni.b(oni.this) == 0 && (oni.a(oni.this).d == 2 || 1 != oni.a(oni.this).j.get())) {
                    ErrorMessage create = ErrorMessage.create();
                    create.bizCode = oni.a(oni.this).f32202a;
                    create.header.f31524a = oni.a(oni.this).b;
                    create.header.c = PowerMsgType.MSG_ERROR;
                    create.sysCode = 1;
                    MsgLog.a("PullManager", "notify pull Error >", Integer.valueOf(i), "type", Integer.valueOf(oni.a(oni.this).d), "topic:", oni.a(oni.this).b, com.taobao.tao.powermsg.model.a.COL_BTAG, oni.a(oni.this).c);
                    e.a(new b(create)).b(com.taobao.tao.messagekit.base.d.a().c());
                }
                oni.a(oni.this).j.set(0);
                String str = (String) (map2 != null ? map2.get("re_msg") : null);
                d.a("MKT", "pcf", 1.0d);
                d.a("MKT", "pull", "" + i, str);
                int i5 = i;
                if (i5 == -3001) {
                    oni.a(oni.this).k.set(2);
                    d.a("MKT", "pcft", 1.0d);
                    MsgLog.c("PullManager", "PullMsg Timeout >", Integer.valueOf(oni.a(oni.this).d), "offset:", Long.valueOf(oni.a(oni.this).f), "topic:", oni.a(oni.this).b, com.taobao.tao.powermsg.model.a.COL_BTAG, oni.a(oni.this).c);
                } else if (i5 != 4001) {
                    oni.a(oni.this).k.set(1);
                    MsgLog.c("PullManager", "pullMsg Mtop Error >", Integer.valueOf(i), str, "type", Integer.valueOf(oni.a(oni.this).d), "offset:", Long.valueOf(oni.a(oni.this).f), "duration:", Integer.valueOf(oni.a(oni.this).e), "topic:", oni.a(oni.this).b, com.taobao.tao.powermsg.model.a.COL_BTAG, oni.a(oni.this).c);
                    com.taobao.tao.powermsg.managers.e.b(oni.a(oni.this).b, oni.a(oni.this).c, i2, i3);
                } else if (-2 == oni.a(oni.this).k.get()) {
                    return;
                } else {
                    oni.a(oni.this).k.set(-2);
                    MsgLog.c("PullManager", "PullMsg flow limit >", Integer.valueOf(oni.a(oni.this).d), "offset:", Long.valueOf(oni.a(oni.this).f), "pullConf.topic:", oni.a(oni.this).b);
                    int a3 = c.a("pull_time_limit", 20);
                    String str2 = oni.a(oni.this).b;
                    String str3 = oni.a(oni.this).c;
                    int i6 = oni.a(oni.this).d;
                    if (oni.a(oni.this).e > a3) {
                        a3 = (int) (oni.a(oni.this).e * 1.5d);
                    }
                    com.taobao.tao.powermsg.managers.e.b(str2, str3, i6, a3);
                }
                if (oni.a(oni.this).i > 600) {
                    oni.a(oni.this).i = 0;
                    return;
                }
                com.taobao.tao.powermsg.model.a aVar = new com.taobao.tao.powermsg.model.a(com.taobao.tao.messagekit.base.monitor.c.a((String) null, (String) null), 2, oni.a(oni.this).f32202a, oni.a(oni.this).b, oni.a(oni.this).c, i, oni.a(oni.this).d);
                aVar.f = 2;
                aVar.h = "" + oni.a(oni.this).f;
                com.taobao.tao.messagekit.base.monitor.c.a(aVar);
            }

            @Override // tb.jew
            public /* synthetic */ void accept(Map<String, Object> map2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b028bfab", new Object[]{this, map2});
                } else {
                    a(map2);
                }
            }
        });
    }
}
