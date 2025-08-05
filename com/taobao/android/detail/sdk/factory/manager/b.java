package com.taobao.android.detail.sdk.factory.manager;

import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.structure.h;
import com.taobao.android.detail.sdk.vmodel.desc.e;
import com.taobao.android.detail.sdk.vmodel.main.MainViewModel;
import com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import tb.euz;
import tb.evu;
import tb.evv;
import tb.evw;
import tb.evx;
import tb.evz;
import tb.ewa;
import tb.ewb;
import tb.ewc;
import tb.ewd;
import tb.ewf;
import tb.ewh;
import tb.ewi;
import tb.ewj;
import tb.exb;
import tb.exl;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class b extends AbsFactoryManager<ewa> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<Pair<Integer, evz>> b;
    public ArrayList<Pair<Integer, ewb>> c;
    public ArrayList<Pair<Integer, evv>> d;
    public HashMap<ewa, evu> e;
    public ArrayList<Pair<Integer, evx>> f;
    public ArrayList<Pair<Integer, evw>> g;

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f10247a;

        static {
            kge.a(1966302981);
            f10247a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("b6d195be", new Object[0]) : f10247a;
        }
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-1256995616);
        b a2 = a();
        a2.a(new ewi(), 5, new ewh());
        a2.a(new ewc(), 5);
        a2.a(new ewj(), 5);
        a2.a(new ewf(), 5);
        a2.a(new ewd(), 5);
    }

    private b() {
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.d = new ArrayList<>();
        this.e = new HashMap<>();
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        tpc.a("com.taobao.android.detail.sdk.factory.manager.ViewModelFactoryManager");
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("b6d195be", new Object[0]) : a.a();
    }

    public void a(ewa ewaVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d65599a", new Object[]{this, ewaVar, new Integer(i)});
        } else {
            a(ewaVar, i, (evu) null);
        }
    }

    public void a(ewa ewaVar, int i, evu evuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7bd05a6", new Object[]{this, ewaVar, new Integer(i), evuVar});
            return;
        }
        if (ewaVar instanceof evz) {
            a((b) ((evz) ewaVar), i, (ArrayList<Pair<Integer, b>>) this.b);
        } else if (ewaVar instanceof evv) {
            a((b) ((evv) ewaVar), i, (ArrayList<Pair<Integer, b>>) this.d);
        } else if (ewaVar instanceof ewb) {
            a((b) ((ewb) ewaVar), i, (ArrayList<Pair<Integer, b>>) this.c);
        } else if (ewaVar instanceof evx) {
            a((b) ((evx) ewaVar), i, (ArrayList<Pair<Integer, b>>) this.f);
        } else if (ewaVar instanceof evw) {
            a((b) ((evw) ewaVar), i, (ArrayList<Pair<Integer, b>>) this.g);
        }
        if (evuVar == null) {
            return;
        }
        this.e.put(ewaVar, evuVar);
    }

    public MainViewModel a(ComponentModel componentModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MainViewModel) ipChange.ipc$dispatch("ac99d18", new Object[]{this, componentModel, nodeBundle}) : a(this.b, componentModel, nodeBundle);
    }

    public WidgetViewModel b(ComponentModel componentModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WidgetViewModel) ipChange.ipc$dispatch("5077b1f9", new Object[]{this, componentModel, nodeBundle}) : (WidgetViewModel) a(this.c, componentModel, nodeBundle);
    }

    public exb c(ComponentModel componentModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (exb) ipChange.ipc$dispatch("b56ecc5d", new Object[]{this, componentModel, nodeBundle}) : (exb) a(this.d, componentModel, nodeBundle);
    }

    public e a(ComponentModel componentModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("a90e16c", new Object[]{this, componentModel}) : a(this.f, componentModel);
    }

    public exl d(ComponentModel componentModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (exl) ipChange.ipc$dispatch("a8a0c532", new Object[]{this, componentModel, nodeBundle});
        }
        if (componentModel == null) {
            return null;
        }
        for (int size = this.g.size() - 1; size >= 0; size--) {
            exl a2 = ((evw) this.g.get(size).second).a(componentModel, nodeBundle);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    private <E extends ewa<T>, T extends MainViewModel> T a(ArrayList<Pair<Integer, E>> arrayList, ComponentModel componentModel, NodeBundle nodeBundle) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("41701e72", new Object[]{this, arrayList, componentModel, nodeBundle});
        }
        if (componentModel == null) {
            return null;
        }
        if (!TextUtils.isEmpty(componentModel.filter) && h.a(euz.a(), componentModel.filter, nodeBundle.root)) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ewa ewaVar = (ewa) arrayList.get(size).second;
            if (a(ewaVar, componentModel, nodeBundle) && (t = (T) ewaVar.a(componentModel, nodeBundle)) != null) {
                return t;
            }
        }
        return null;
    }

    private e a(ArrayList<Pair<Integer, evx>> arrayList, ComponentModel componentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("56d5fcd2", new Object[]{this, arrayList, componentModel});
        }
        if (componentModel == null) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e a2 = ((evx) arrayList.get(size).second).a(componentModel, null);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    private boolean a(ewa ewaVar, ComponentModel componentModel, NodeBundle nodeBundle) {
        evu evuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14e08e1d", new Object[]{this, ewaVar, componentModel, nodeBundle})).booleanValue();
        }
        if (componentModel == null) {
            return false;
        }
        return this.e.isEmpty() || (evuVar = this.e.get(ewaVar)) == null || evuVar.a(componentModel.key, nodeBundle);
    }
}
