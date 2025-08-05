package com.taobao.android.trade.locator.callback;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.jkc;
import tb.jkd;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private jkc b;
    private d c;
    private d d;
    private String[] e;

    /* renamed from: a  reason: collision with root package name */
    private int f15630a = 0;
    private b f = new b() { // from class: com.taobao.android.trade.locator.callback.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.trade.locator.callback.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            c.a(c.this);
            c cVar = c.this;
            c.a(cVar, c.b(cVar));
            c.c(c.this);
        }
    };

    public static /* synthetic */ int a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a65fc3c", new Object[]{cVar})).intValue();
        }
        int i = cVar.f15630a;
        cVar.f15630a = i + 1;
        return i;
    }

    public static /* synthetic */ d a(c cVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("5401d4a7", new Object[]{cVar, dVar});
        }
        cVar.c = dVar;
        return dVar;
    }

    public static /* synthetic */ d b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("d7b97f28", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db94887", new Object[]{cVar});
        } else {
            cVar.a();
        }
    }

    public void a(String str, jkc jkcVar, d dVar) {
        jkd a2;
        List<String> a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6034ddf0", new Object[]{this, str, jkcVar, dVar});
            return;
        }
        this.b = jkcVar;
        this.c = dVar;
        if (this.b == null || (a2 = jkcVar.a(str)) == null || (a3 = a(a2)) == null || a3.size() <= 0) {
            return;
        }
        System.out.println(a3.toString());
        this.e = a3.get(0).split("/");
        a();
    }

    private void a() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c == null || (strArr = this.e) == null || strArr.length <= 0) {
        } else {
            int i = this.f15630a + 1;
            Object obj = null;
            jkd a2 = i < strArr.length ? this.b.a(strArr[i]) : null;
            a a3 = this.c.a(a2 == null ? null : a2.c());
            this.d = a3 == null ? null : a3.a();
            d dVar = this.c;
            if (a2 != null) {
                obj = a2.b();
            }
            dVar.a(obj, a3, this.f);
        }
    }

    public static List<String> a(jkd jkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd31c8f2", new Object[]{jkdVar});
        }
        if (jkdVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (jkdVar.a() == null || jkdVar.a().isEmpty()) {
            arrayList.add(jkdVar.c());
        } else {
            for (jkd jkdVar2 : jkdVar.a()) {
                Iterator<String> it = a(jkdVar2).iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next() + "/" + jkdVar.c());
                }
            }
        }
        return arrayList;
    }
}
