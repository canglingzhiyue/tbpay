package com.taobao.android.tbuprofen.adapter.anr;

import android.os.Message;
import android.os.MessageQueue;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AtomicLong f15463a;
    private final long b;
    private int c;
    private int d;
    private final long e;
    private long f;
    private long g;
    private long h;
    private long i;
    private String j;
    private int k;
    private Object l;
    private HashMap<String, Integer> m;

    static {
        kge.a(-1529142990);
        f15463a = new AtomicLong(0L);
    }

    private d(int i, long j, long j2, long j3, long j4) {
        this.b = f15463a.getAndIncrement();
        this.c = i;
        this.d = 1;
        this.g = j;
        this.h = j2;
        this.e = j3;
        this.f = j4;
        this.i = 0L;
        this.j = null;
        this.k = -1;
        this.l = null;
        this.m = new HashMap<>();
    }

    public d(d dVar) {
        this.b = dVar.b;
        this.c = dVar.c;
        this.d = dVar.d;
        this.g = dVar.g;
        this.h = dVar.h;
        this.e = dVar.e;
        this.f = dVar.f;
        this.i = dVar.i;
        this.j = dVar.j;
        this.k = dVar.k;
        this.l = dVar.l;
        this.m = dVar.m;
    }

    public static d a(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("9bc473bc", new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        }
        d dVar = new d(5, 0L, j2, j3, j4);
        dVar.i = j;
        return dVar;
    }

    public static d b(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("c99d0e1b", new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4)}) : new d(0, j, j2, j3, j4);
    }

    public static d a(Message message, long j, long j2, boolean z, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("426cb8b", new Object[]{message, new Long(j), new Long(j2), new Boolean(z), new Long(j3), new Long(j4)});
        }
        d dVar = new d(z ? 4 : 3, j, j2, j3, j4);
        dVar.k = message.what;
        dVar.j = "ActivityThread$H";
        if (message.what == 0) {
            dVar.j += " " + message.getCallback().getClass().getName();
        }
        dVar.l = message.obj;
        return dVar;
    }

    public static d a(String str, long j, long j2, boolean z, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("d4bdd402", new Object[]{str, new Long(j), new Long(j2), new Boolean(z), new Long(j3), new Long(j4)});
        }
        d dVar = new d(z ? 4 : 3, j, j2, j3, j4);
        a(str, dVar);
        return dVar;
    }

    public static d a(int i, Object obj, long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("d9a4218d", new Object[]{new Integer(i), obj, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        }
        d dVar = new d(2, j, j2, j3, j4);
        if (i == 1) {
            Message message = (Message) obj;
            dVar.k = message.what;
            if (message.getTarget() != null) {
                dVar.j = message.getTarget().getClass().getName();
            }
            if (message.getCallback() != null) {
                dVar.j += " " + message.getCallback().getClass().getName();
            }
        } else if (i == 2) {
            dVar.j = ((MessageQueue.IdleHandler) obj).getClass().getName();
        } else if (i == 3) {
            a((String) obj, dVar);
        }
        return dVar;
    }

    public void a(long j, long j2, long j3, long j4, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e62932", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4), str});
            return;
        }
        this.d++;
        this.g += j;
        this.h += j2;
        this.i += j4;
        this.f = j3;
        if (this.c != 1) {
            this.c = 1;
        }
        if (StringUtils.isEmpty(str)) {
            return;
        }
        Integer num = this.m.get(str);
        if (num == null) {
            num = 0;
        }
        this.m.put(str, Integer.valueOf(num.intValue() + 1));
    }

    private static void a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6320b140", new Object[]{str, dVar});
        } else if (str == null) {
        } else {
            String[] split = str.split(ResponseProtocolType.COMMENT);
            if (split.length < 2) {
                return;
            }
            dVar.j = split[0].substring(21, split[0].length() - 1);
            dVar.k = Integer.parseInt(split[1]);
            dVar.l = null;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        int i = this.c;
        return i == 1 || i == 0;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.f;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%10s:[%d][%s-%s] ==> Cpu:%d, ", d(), Long.valueOf(this.b), com.taobao.android.tbuprofen.common.a.b(this.e), com.taobao.android.tbuprofen.common.a.b(this.f), Long.valueOf(this.h)));
        if (this.c == 5) {
            sb.append("Idle:");
            sb.append(this.i);
        } else {
            sb.append("Execute:");
            sb.append(this.g);
            int i = this.c;
            if (i == 1) {
                sb.append(", Count:");
                sb.append(this.d);
                sb.append(", TotalIdle:");
                sb.append(this.i);
                HashMap<String, Integer> hashMap = this.m;
                if (hashMap != null && !hashMap.isEmpty()) {
                    sb.append("\n MessageInfo:");
                    for (Map.Entry<String, Integer> entry : this.m.entrySet()) {
                        sb.append("\n");
                        sb.append(entry.getKey());
                        sb.append(":");
                        sb.append(entry.getValue());
                    }
                }
            } else if (i == 2 || i == 3 || i == 4) {
                sb.append(" (");
                if (this.k != -1) {
                    sb.append(" what:");
                    sb.append(this.k);
                }
                if (this.j != null) {
                    sb.append(" target:");
                    sb.append(this.j);
                }
                Object obj = this.l;
                if (obj != null && this.c != 2) {
                    String a2 = f.a(obj, this.k);
                    if (!StringUtils.isEmpty(a2)) {
                        sb.append(" obj:");
                        sb.append(a2);
                    }
                }
                sb.append(" )");
            }
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.b == this.b && dVar.e == this.e && dVar.c == this.c && dVar.k == this.k && Objects.equals(dVar.j, this.j);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : Configuration.IDLE : "*LARGE SYS" : "SYSTEM" : "*LARGE" : "AGGREGATE" : "COMMON";
    }
}
