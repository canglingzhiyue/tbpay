package com.taobao.android.sku.hybrid;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static List<a> f15180a;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final f f15181a;

        static {
            kge.a(1856719879);
        }

        public a(f fVar) {
            this.f15181a = fVar;
        }
    }

    static {
        kge.a(1892290721);
        f15180a = new ArrayList();
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50a13347", new Object[]{aVar});
        } else if (aVar == null) {
        } else {
            if (f15180a.contains(aVar)) {
                f15180a.remove(aVar);
                f15180a.add(aVar);
                return;
            }
            Iterator<a> it = f15180a.iterator();
            while (it.hasNext()) {
                if (it.next().f15181a == aVar.f15181a) {
                    it.remove();
                }
            }
            f15180a.add(aVar);
        }
    }

    public static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7bf2426", new Object[]{aVar});
        } else if (f15180a.isEmpty() || aVar == null) {
        } else {
            if (f15180a.contains(aVar)) {
                f15180a.remove(aVar);
                return;
            }
            Iterator<a> it = f15180a.iterator();
            while (it.hasNext()) {
                if (it.next().f15181a == aVar.f15181a) {
                    it.remove();
                }
            }
        }
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("bd6123c7", new Object[0]);
        }
        if (f15180a.isEmpty()) {
            return null;
        }
        List<a> list = f15180a;
        return list.get(list.size() - 1);
    }
}
