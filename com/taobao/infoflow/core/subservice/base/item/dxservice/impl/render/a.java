package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.home.component.utils.e;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import tb.kge;
import tb.ldf;
import tb.ldz;
import tb.leb;
import tb.lec;
import tb.leh;
import tb.lix;
import tb.ljs;
import tb.nuw;

/* loaded from: classes.dex */
public class a implements com.taobao.infoflow.protocol.view.item.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f17365a;
    private final lec b = new lec();
    private final leh c;
    private final b d;

    static {
        kge.a(393370810);
        kge.a(756269225);
    }

    public a(ljs ljsVar, DinamicXEngine dinamicXEngine) {
        this.f17365a = ljsVar;
        this.d = new b(ljsVar, dinamicXEngine);
        this.c = new leh(ljsVar, dinamicXEngine, this.d);
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public void preRender(Context context, BaseSectionModel<?> baseSectionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23eb059f", new Object[]{this, context, baseSectionModel, new Boolean(z), new Integer(i)});
            return;
        }
        int a2 = this.d.a(baseSectionModel.mo1099getTemplate());
        e.e("DXCardRender", "preRender...viewType:" + a2 + " , name:" + baseSectionModel.getSectionBizCode());
        ldz a3 = this.d.a(a2);
        if (a3 == null || !a3.a()) {
            return;
        }
        this.c.a(context, a3.f(), baseSectionModel, z, i, new InfoFlowDxUserContext(this.f17365a, baseSectionModel));
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public View createView(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("97790b1e", new Object[]{this, viewGroup, new Integer(i)});
        }
        e.e("DXCardRender", "createView...viewType:" + i);
        ldz a2 = this.d.a(i);
        if (a2 == null) {
            return null;
        }
        String b = a2.b();
        long currentTimeMillis = System.currentTimeMillis();
        nuw.a("InfoFlowDxRender", "createView_" + b);
        View a3 = a(viewGroup, a2);
        nuw.b("InfoFlowDxRender", "createView_" + b);
        ldf.e("DXCardRender", "卡片 " + a2.b() + " createView 耗时：" + (System.currentTimeMillis() - currentTimeMillis));
        return a3;
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public void bindData(View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43424acc", new Object[]{this, view, baseSectionModel});
            return;
        }
        ldz a2 = leb.a(lix.b(baseSectionModel));
        String b = a2.b();
        long currentTimeMillis = System.currentTimeMillis();
        InfoFlowDxUserContext infoFlowDxUserContext = new InfoFlowDxUserContext(this.f17365a, baseSectionModel);
        nuw.a("InfoFlowDxRender", "bindData_" + b);
        if (a2.a()) {
            this.c.a(view, baseSectionModel, infoFlowDxUserContext);
        } else {
            this.b.a(view, baseSectionModel, infoFlowDxUserContext);
        }
        nuw.b("InfoFlowDxRender", "bindData_" + b);
        ldf.e("DXCardRender", "卡片 " + a2.b() + " bindData 耗时：" + (System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public int getViewType(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c9fbda37", new Object[]{this, baseSectionModel})).intValue() : this.d.a(baseSectionModel, lix.b(baseSectionModel));
    }

    private View a(ViewGroup viewGroup, ldz ldzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3c10a7d7", new Object[]{this, viewGroup, ldzVar});
        }
        if (ldzVar.a()) {
            return this.c.a(viewGroup.getContext(), viewGroup, ldzVar.f());
        }
        return this.b.a(viewGroup.getContext(), viewGroup, ldzVar.e());
    }
}
