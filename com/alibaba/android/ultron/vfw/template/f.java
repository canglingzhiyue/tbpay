package com.alibaba.android.ultron.vfw.template;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import tb.bny;
import tb.brx;
import tb.kge;

/* loaded from: classes2.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, c> f2735a = new HashMap<>();

    static {
        kge.a(-1199610353);
    }

    public f(bny bnyVar) {
        b bVar = new b(bnyVar);
        a("dinamicx", bVar);
        a("dinamic", bVar);
    }

    public void a(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7093f15f", new Object[]{this, str, cVar});
        } else {
            this.f2735a.put(str, cVar);
        }
    }

    public c a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("850e82b3", new Object[]{this, str}) : this.f2735a.get(str);
    }

    public void a(String str, List<com.taobao.android.ultron.common.model.a> list, d dVar, brx brxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b568e75", new Object[]{this, str, list, dVar, brxVar});
            return;
        }
        c cVar = this.f2735a.get(str);
        if (cVar instanceof b) {
            ((b) cVar).a(list, dVar, brxVar);
        } else if (cVar == null) {
        } else {
            cVar.a(list, dVar);
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (str != null && str2 != null) {
            c cVar = this.f2735a.get("dinamicx");
            if (cVar instanceof a) {
                return ((a) cVar).a(str, str2);
            }
        }
        return false;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c a2 = a("dinamicx");
        if (!(a2 instanceof b)) {
            return;
        }
        ((b) a2).a();
    }
}
