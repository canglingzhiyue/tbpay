package com.alibaba.android.ultron.trade.presenter;

import android.content.Context;
import com.alibaba.android.ultron.trade.data.request.DataInfo;
import com.alibaba.android.ultron.trade.data.request.PageInfo;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.LinkageType;
import com.taobao.android.ultron.datamodel.imp.g;
import java.util.ArrayList;
import java.util.List;
import tb.bmi;
import tb.bmz;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f2675a;
    public c b;
    public jny c;
    public bmi d;
    public List<b> h = new ArrayList();
    public List<InterfaceC0095a> i = new ArrayList();

    /* renamed from: com.alibaba.android.ultron.trade.presenter.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0095a {
        void a();
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(PageInfo pageInfo, DataInfo dataInfo);
    }

    static {
        kge.a(1836594054);
    }

    public a(c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("param presenter can not be null");
        }
        this.b = cVar;
        this.f2675a = cVar.m();
    }

    public void b(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de3fc184", new Object[]{this, jnyVar});
        } else {
            this.c = jnyVar;
        }
    }

    public jny w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jny) ipChange.ipc$dispatch("b84ab633", new Object[]{this}) : this.c;
    }

    public bmi x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bmi) ipChange.ipc$dispatch("bff8b2e9", new Object[]{this}) : this.d;
    }

    public void a(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e200989a", new Object[]{this, bmiVar});
        } else {
            this.d = bmiVar;
        }
    }

    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f79045", new Object[]{this, bVar});
        } else {
            this.h.add(bVar);
        }
    }

    public List<b> z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("143f826", new Object[]{this}) : this.h;
    }

    public List<InterfaceC0095a> A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6e3b3cff", new Object[]{this}) : this.i;
    }

    public void b(InterfaceC0095a interfaceC0095a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f71be6", new Object[]{this, interfaceC0095a});
        } else {
            this.i.add(interfaceC0095a);
        }
    }

    public void b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73527f0b", new Object[]{this, iDMComponent});
        } else {
            a(iDMComponent, null);
        }
    }

    public void a(IDMComponent iDMComponent, bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d71f8a6d", new Object[]{this, iDMComponent, bmzVar});
        } else {
            b(iDMComponent, bmzVar, true, null, null);
        }
    }

    public void b(IDMComponent iDMComponent, bmz bmzVar, boolean z, jnv jnvVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5576da2", new Object[]{this, iDMComponent, bmzVar, new Boolean(z), jnvVar, obj});
        } else if (iDMComponent == null || iDMComponent.getLinkageType() != LinkageType.REFRESH) {
        } else {
            this.b.y().m();
        }
    }

    public void a(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && list.size() > 0) {
            for (JSONObject jSONObject : list) {
                g gVar = new g();
                jny jnyVar = this.c;
                if (jnyVar instanceof com.taobao.android.ultron.datamodel.imp.b) {
                    gVar.a((com.taobao.android.ultron.datamodel.imp.b) jnyVar, jSONObject, null);
                }
            }
            com.alibaba.android.ultron.trade.data.request.a.a(this, this.c, this.f2675a, false);
        }
    }
}
