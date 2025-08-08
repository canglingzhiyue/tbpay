package com.taobao.android.detail.datasdk.factory.manager;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import java.util.ArrayList;
import tb.eni;
import tb.eok;
import tb.eol;
import tb.eom;
import tb.eoo;
import tb.eop;
import tb.eoq;
import tb.epe;
import tb.epf;
import tb.epi;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class b extends AbsFactoryManager<eop> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<Pair<Integer, eoo>> b = new ArrayList<>();
    public ArrayList<Pair<Integer, eoq>> c = new ArrayList<>();
    public ArrayList<Pair<Integer, eok>> d = new ArrayList<>();
    public ArrayList<Pair<Integer, eom>> e = new ArrayList<>();
    public ArrayList<Pair<Integer, eol>> f = new ArrayList<>();

    static {
        kge.a(1059159078);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void a(eop eopVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f531", new Object[]{this, eopVar, new Integer(i)});
        } else if (eopVar instanceof eoo) {
            a((b) ((eoo) eopVar), i, (ArrayList<Pair<Integer, b>>) this.b);
        } else if (eopVar instanceof eok) {
            a((b) ((eok) eopVar), i, (ArrayList<Pair<Integer, b>>) this.d);
        } else if (eopVar instanceof eoq) {
            a((b) ((eoq) eopVar), i, (ArrayList<Pair<Integer, b>>) this.c);
        } else if (eopVar instanceof eom) {
            a((b) ((eom) eopVar), i, (ArrayList<Pair<Integer, b>>) this.e);
        } else if (!(eopVar instanceof eol)) {
        } else {
            a((b) ((eol) eopVar), i, (ArrayList<Pair<Integer, b>>) this.f);
        }
    }

    public com.taobao.android.detail.datasdk.model.viewmodel.main.b a(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("6761af4c", new Object[]{this, componentModel, bVar}) : a(this.b, componentModel, bVar);
    }

    public epi b(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (epi) ipChange.ipc$dispatch("1cefa7b7", new Object[]{this, componentModel, bVar}) : (epi) a(this.c, componentModel, bVar);
    }

    public com.taobao.android.detail.datasdk.model.viewmodel.main.b c(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("df6a86ce", new Object[]{this, componentModel, bVar}) : a(this.d, componentModel, bVar);
    }

    public epf a(ComponentModel componentModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (epf) ipChange.ipc$dispatch("c2d17533", new Object[]{this, componentModel}) : a(this.e, componentModel);
    }

    public epe d(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epe) ipChange.ipc$dispatch("8e01433d", new Object[]{this, componentModel, bVar});
        }
        if (componentModel == null) {
            return null;
        }
        for (int size = this.f.size() - 1; size >= 0; size--) {
            epe b = ((eol) this.f.get(size).second).b(componentModel, bVar);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    private <E extends eop<T>, T extends com.taobao.android.detail.datasdk.model.viewmodel.main.b> T a(ArrayList<Pair<Integer, E>> arrayList, ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("5083ffa6", new Object[]{this, arrayList, componentModel, bVar});
        }
        if (componentModel == null) {
            return null;
        }
        if (!StringUtils.isEmpty(componentModel.filter) && eni.a(epo.a(), componentModel.filter, bVar.a())) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t = (T) ((eop) arrayList.get(size).second).b(componentModel, bVar);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    private epf a(ArrayList<Pair<Integer, eom>> arrayList, ComponentModel componentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epf) ipChange.ipc$dispatch("f341b48d", new Object[]{this, arrayList, componentModel});
        }
        if (componentModel == null) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            epf b = ((eom) arrayList.get(size).second).b(componentModel, null);
            if (b != null) {
                return b;
            }
        }
        return null;
    }
}
