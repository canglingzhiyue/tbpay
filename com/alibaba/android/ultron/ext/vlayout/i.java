package com.alibaba.android.ultron.ext.vlayout;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import tb.kge;

/* loaded from: classes2.dex */
public class i extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<a> f2649a = new LinkedList();
    private List<c> b = new LinkedList();
    private List<c> c = new LinkedList();
    private a[] d = null;
    private Comparator<a> e = new Comparator<a>() { // from class: com.alibaba.android.ultron.ext.vlayout.i.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public /* synthetic */ int compare(a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, aVar, aVar2})).intValue() : a(aVar, aVar2);
        }

        public int a(a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c22751b", new Object[]{this, aVar, aVar2})).intValue() : aVar.a() - aVar2.a();
        }
    };

    static {
        kge.a(-959006268);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.d
    public List<c> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.c;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.d
    public void a(List<c> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.b.clear();
        this.c.clear();
        this.f2649a.clear();
        if (list == null) {
            return;
        }
        ListIterator<c> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            c next = listIterator.next();
            this.b.add(next);
            this.f2649a.add(new a(next));
        }
        while (listIterator.hasPrevious()) {
            this.c.add(listIterator.previous());
        }
        List<a> list2 = this.f2649a;
        this.d = (a[]) list2.toArray(new a[list2.size()]);
        Arrays.sort(this.d, this.e);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.d
    public List<c> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.d
    public c a(int i) {
        a aVar;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("5b19541e", new Object[]{this, new Integer(i)});
        }
        a[] aVarArr = this.d;
        if (aVarArr == null || aVarArr.length == 0) {
            return null;
        }
        int length = aVarArr.length - 1;
        while (true) {
            if (i2 > length) {
                aVar = null;
                break;
            }
            int i3 = (i2 + length) / 2;
            aVar = this.d[i3];
            if (aVar.a() <= i) {
                if (aVar.b() >= i) {
                    if (aVar.a() <= i && aVar.b() >= i) {
                        break;
                    }
                } else {
                    i2 = i3 + 1;
                }
            } else {
                length = i3 - 1;
            }
        }
        if (aVar != null) {
            return aVar.f2651a;
        }
        return null;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public c f2651a;

        static {
            kge.a(1307633067);
        }

        public a(c cVar) {
            this.f2651a = cVar;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f2651a.e().a().intValue();
        }

        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f2651a.e().b().intValue();
        }
    }
}
