package com.taobao.monitor.procedure;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.mqi;
import tb.mqj;
import tb.mqk;

/* loaded from: classes.dex */
public class u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f18242a;
    private final String b;
    private String c;
    private long d = SystemClock.uptimeMillis();
    private List<u> e;
    private List<Map<String, Object>> f;
    private List<mqj> g;
    private List<mqk> h;
    private Map<String, Object> i;
    private Map<String, Object> j;
    private List<mqi> k;
    private Map<String, mqi> l;
    private Map<String, Integer> m;
    private final boolean n;
    private final boolean o;

    public u(String str, boolean z, boolean z2) {
        int i;
        this.f18242a = str;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1 && str.length() > (i = lastIndexOf + 1)) {
            this.b = str.substring(i);
        } else {
            this.b = str;
        }
        this.n = z;
        this.o = z2;
        n();
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.e = new LinkedList();
        this.f = new LinkedList();
        this.g = new LinkedList();
        this.h = new LinkedList();
        this.i = new ConcurrentHashMap();
        this.m = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new LinkedList();
        this.l = new ConcurrentHashMap();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f18242a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public u a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("5ccf4742", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public u a(mqj mqjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("d9d125a2", new Object[]{this, mqjVar});
        }
        if (mqjVar != null) {
            synchronized (this.g) {
                this.g.add(mqjVar);
            }
        }
        return this;
    }

    public u a(mqk mqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("40a9e563", new Object[]{this, mqkVar});
        }
        if (mqkVar != null) {
            synchronized (this.h) {
                this.h.add(mqkVar);
            }
        }
        return this;
    }

    public u a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("5d55466", new Object[]{this, str, obj});
        }
        if (obj != null && str != null) {
            this.j.put(str, obj);
        }
        return this;
    }

    public u b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("88200945", new Object[]{this, str, obj});
        }
        if (obj != null && str != null) {
            this.i.put(str, obj);
        }
        return this;
    }

    public u a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("14735241", new Object[]{this, str, map});
        }
        if (str != null) {
            mqi mqiVar = this.l.get(str);
            if (mqiVar == null) {
                mqiVar = new mqi(str, map);
                this.l.put(str, mqiVar);
                synchronized (this.k) {
                    this.k.add(mqiVar);
                }
            }
            mqiVar.a(map);
        }
        return this;
    }

    public u b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("5c4e1c2", new Object[]{this, str, map});
        }
        if (str != null) {
            mqi mqiVar = this.l.get(str);
            if (mqiVar == null) {
                mqiVar = new mqi(str, null);
                this.l.put(str, mqiVar);
                synchronized (this.k) {
                    this.k.add(mqiVar);
                }
            }
            mqiVar.b(map);
        }
        return this;
    }

    public u c(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("f7167143", new Object[]{this, str, map});
        }
        if (str != null) {
            mqi mqiVar = this.l.get(str);
            if (mqiVar == null) {
                mqiVar = new mqi(str, null);
                this.l.put(str, mqiVar);
                synchronized (this.k) {
                    this.k.add(mqiVar);
                }
            }
            mqiVar.c(map);
        }
        return this;
    }

    public u a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("84583f7", new Object[]{this, map});
        }
        if (map != null && this.f.size() <= 200) {
            this.f.add(map);
        }
        return this;
    }

    public u a(u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("38c0096e", new Object[]{this, uVar});
        }
        if (uVar != null) {
            String str = uVar.b;
            if (StringUtils.isEmpty(str)) {
                return this;
            }
            Integer num = this.m.get(str);
            if (num == null) {
                this.m.put(str, 1);
            } else {
                this.m.put(str, Integer.valueOf(num.intValue() + 1));
            }
            if (uVar.o) {
                for (mqk mqkVar : uVar.h) {
                    char[] charArray = mqkVar.a().toCharArray();
                    if (charArray[0] >= 'a') {
                        charArray[0] = (char) (charArray[0] - ' ');
                    }
                    String str2 = str + String.valueOf(charArray);
                    Integer num2 = this.m.get(str2);
                    if (num2 == null) {
                        this.m.put(str2, 1);
                    } else {
                        this.m.put(str2, Integer.valueOf(num2.intValue() + 1));
                    }
                }
            }
            synchronized (this.e) {
                if (!uVar.n) {
                    this.e.add(uVar);
                }
            }
        }
        return this;
    }

    public u c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("3cf1110a", new Object[]{this});
        }
        u uVar = new u(this.b, this.n, this.o);
        uVar.h = this.h;
        uVar.j = this.j;
        return uVar;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.c;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.d;
    }

    public List<u> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.e;
    }

    public List<Map<String, Object>> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this}) : this.f;
    }

    public List<mqj> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.g;
    }

    public List<mqk> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this}) : this.h;
    }

    public List<mqi> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("87269236", new Object[]{this}) : this.k;
    }

    public Map<String, Object> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a8bc7a27", new Object[]{this}) : this.i;
    }

    public Map<String, Object> l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7666dbe8", new Object[]{this}) : this.j;
    }

    public Map<String, Integer> m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("44113da9", new Object[]{this}) : this.m;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.f18242a;
    }
}
