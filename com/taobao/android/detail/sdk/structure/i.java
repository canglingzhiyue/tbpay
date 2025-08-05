package com.taobao.android.detail.sdk.structure;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.vmodel.main.MainViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f10340a;

    static {
        kge.a(-1354061344);
    }

    public i(Context context) {
        this.f10340a = context;
        tpc.a("com.taobao.android.detail.sdk.structure.ViewModelFilter");
    }

    public e a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("af42a5b8", new Object[]{this, eVar});
        }
        List<T> list = eVar.f10331a;
        if (list != 0 && !list.isEmpty()) {
            ArrayList<MainViewModel> arrayList = new ArrayList<>();
            for (T t : list) {
                if (t.isValid()) {
                    arrayList.add(t);
                }
            }
            eVar.f10331a = a(arrayList);
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.taobao.android.detail.sdk.vmodel.main.MainViewModel, java.lang.Object] */
    private ArrayList<MainViewModel> a(ArrayList<MainViewModel> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a85ead1c", new Object[]{this, arrayList});
        }
        if (arrayList == null || arrayList.size() <= 2) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        com.taobao.android.detail.sdk.vmodel.main.i iVar = null;
        Iterator<MainViewModel> it = arrayList.iterator();
        while (it.hasNext()) {
            MainViewModel next = it.next();
            if ((next instanceof com.taobao.android.detail.sdk.vmodel.main.i) && (iVar instanceof com.taobao.android.detail.sdk.vmodel.main.i)) {
                iVar = a(iVar, (com.taobao.android.detail.sdk.vmodel.main.i) next);
                arrayList2.remove(arrayList2.size() - 1);
                arrayList2.add(iVar);
            } else {
                arrayList2.add(next);
                iVar = next;
            }
        }
        return arrayList2;
    }

    private com.taobao.android.detail.sdk.vmodel.main.i a(com.taobao.android.detail.sdk.vmodel.main.i iVar, com.taobao.android.detail.sdk.vmodel.main.i iVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.sdk.vmodel.main.i) ipChange.ipc$dispatch("5ba1538a", new Object[]{this, iVar, iVar2}) : iVar.f10428a == 5 ? iVar : (iVar2.f10428a == 2 || iVar2.f10428a == 3 || iVar2.f10428a == 4 || iVar2.f10428a == 5) ? iVar2 : (iVar.f10428a == 2 || iVar.f10428a == 3 || iVar.f10428a == 4 || iVar.b > iVar2.b) ? iVar : iVar2;
    }
}
