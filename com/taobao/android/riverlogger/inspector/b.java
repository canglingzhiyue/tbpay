package com.taobao.android.riverlogger.inspector;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final c[] b;
    private final ConcurrentHashMap<Integer, a> c = new ConcurrentHashMap<>();

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f14906a;
        public final c b;

        static {
            kge.a(-581910987);
        }

        public a(int i, c cVar) {
            this.f14906a = i;
            this.b = cVar;
        }
    }

    static {
        kge.a(1141262944);
    }

    public b(c... cVarArr) {
        this.b = cVarArr;
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public ArrayList<l> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("7153230c", new Object[]{this, str});
        }
        ArrayList<l> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        for (c cVar : this.b) {
            ArrayList<l> a2 = cVar.a(str);
            if (a2 != null) {
                Iterator<l> it = a2.iterator();
                while (it.hasNext()) {
                    l next = it.next();
                    if (hashSet.add(next.f14922a)) {
                        arrayList.add(next);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        for (c cVar : this.b) {
            hashSet.addAll(cVar.a());
        }
        return hashSet;
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        for (c cVar : this.b) {
            if (cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public b a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("25b2bd4f", new Object[]{this, cVar});
        }
        c[] cVarArr = this.b;
        int length = cVarArr.length;
        c[] cVarArr2 = (c[]) Arrays.copyOf(cVarArr, length + 1);
        cVarArr2[length] = cVar;
        return new b(cVarArr2);
    }

    public c b(c cVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("24d94ccd", new Object[]{this, cVar});
        }
        while (true) {
            c[] cVarArr = this.b;
            if (i >= cVarArr.length) {
                return this;
            }
            if (cVarArr[i] != cVar) {
                i++;
            } else if (cVarArr.length == 2) {
                return cVarArr[1 - i];
            } else {
                c[] cVarArr2 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length - 1);
                int i2 = i + 1;
                while (true) {
                    c[] cVarArr3 = this.b;
                    if (i2 < cVarArr3.length) {
                        cVarArr2[i] = cVarArr3[i2];
                        i++;
                        i2++;
                    } else {
                        return new b(cVarArr2);
                    }
                }
            }
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public void a(String str, String str2, String str3, MessagePriority messagePriority, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8072a6d", new Object[]{this, str, str2, str3, messagePriority, hVar});
        } else if (str != null) {
            for (c cVar : this.b) {
                cVar.a(str, str2, str3, messagePriority, hVar);
            }
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public void a(int i, String str, JSONObject jSONObject, MessagePriority messagePriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796682db", new Object[]{this, new Integer(i), str, jSONObject, messagePriority});
            return;
        }
        a remove = this.c.remove(Integer.valueOf(i));
        if (remove == null) {
            return;
        }
        remove.b.a(remove.f14906a, str, jSONObject, messagePriority);
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public void a(String str, MessagePriority messagePriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c3e794", new Object[]{this, str, messagePriority});
            return;
        }
        throw new RuntimeException("AggregatedChannel.sendMessage should unreachable");
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public void a(String str, int i, String str2, JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a84cb96d", new Object[]{this, str, new Integer(i), str2, jSONObject, cVar});
            return;
        }
        int g = g();
        this.c.put(Integer.valueOf(g), new a(i, cVar));
        com.taobao.android.riverlogger.inspector.a.a(str, g, str2, jSONObject);
    }
}
