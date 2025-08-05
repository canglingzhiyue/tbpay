package com.alibaba.ut.abtest.internal.database;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<f> f4191a = new ArrayList<>();

    static {
        kge.a(2031800106);
    }

    public g a(f fVar, f... fVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("a44cb8b0", new Object[]{this, fVar, fVarArr});
        }
        this.f4191a.add(fVar);
        if (fVarArr != null && fVarArr.length > 0) {
            Collections.addAll(this.f4191a, fVarArr);
        }
        return this;
    }

    public g a(f fVar, f fVar2, f... fVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("acf1e016", new Object[]{this, fVar, fVar2, fVarArr});
        }
        this.f4191a.add(b(fVar, fVar2, fVarArr));
        return this;
    }

    public f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("d3bcb682", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        if (this.f4191a.size() > 0) {
            sb.append(riy.BRACKET_START_STR);
        }
        ListIterator<f> listIterator = this.f4191a.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.hasPrevious()) {
                sb.append(" AND ");
            }
            a(sb, arrayList, listIterator.next());
        }
        if (this.f4191a.size() > 0) {
            sb.append(riy.BRACKET_END_STR);
        }
        return new f(sb.toString(), arrayList.toArray());
    }

    public f b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("4936dcc3", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        ListIterator<f> listIterator = this.f4191a.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.hasPrevious()) {
                sb.append(" AND ");
            }
            a(sb, arrayList, listIterator.next());
        }
        return new f(sb.toString(), arrayList.toArray());
    }

    public static f b(f fVar, f fVar2, f... fVarArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("dc9a69f8", new Object[]{fVar, fVar2, fVarArr}) : a(" OR ", fVar, fVar2, fVarArr);
    }

    public static f a(String str, f fVar, f fVar2, f... fVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("c51c18c1", new Object[]{str, fVar, fVar2, fVarArr});
        }
        StringBuilder sb = new StringBuilder(riy.BRACKET_START_STR);
        ArrayList arrayList = new ArrayList();
        a(sb, arrayList, fVar);
        sb.append(str);
        a(sb, arrayList, fVar2);
        for (f fVar3 : fVarArr) {
            sb.append(str);
            a(sb, arrayList, fVar3);
        }
        sb.append(')');
        return new f(sb.toString(), arrayList.toArray());
    }

    public static void a(StringBuilder sb, List<Object> list, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6b9d76", new Object[]{sb, list, fVar});
            return;
        }
        fVar.a(sb);
        fVar.a(list);
    }
}
