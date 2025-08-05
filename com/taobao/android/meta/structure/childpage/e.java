package com.taobao.android.meta.structure.childpage;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.q;
import tb.hte;
import tb.iru;
import tb.isu;
import tb.iue;
import tb.kge;

/* loaded from: classes6.dex */
public class e extends iue<c, g> implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashSet<Object> f14284a;
    private final hte b;

    static {
        kge.a(250449209);
        kge.a(-1538766476);
    }

    public e(hte metaConfig) {
        q.c(metaConfig, "metaConfig");
        this.b = metaConfig;
        this.f14284a = new HashSet<>(1);
    }

    @Override // com.taobao.android.meta.structure.childpage.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        g widget = getWidget();
        q.a((Object) widget, "widget");
        iru iruVar = (iru) widget.getModel();
        q.a((Object) iruVar, "widget.model");
        MetaResult metaResult = (MetaResult) ((com.taobao.android.meta.data.b) iruVar.d()).getTotalSearchResult();
        if (metaResult != null) {
            if (!metaResult.getHeaderChange()) {
                getWidget().f(false);
                return;
            }
            getWidget().z();
            int size = metaResult.getHeaders().size();
            for (int i = 0; i < size; i++) {
                com.taobao.android.meta.data.c cVar = metaResult.getHeaders().get(i);
                q.a((Object) cVar, "it.headers[i]");
                getWidget().a(cVar, metaResult.getHeaderPartialRefresh());
            }
            getWidget().f(true);
            getIView().bJ_().commit();
            metaResult.setHeaderChange(false);
            metaResult.setHeaderPartialRefresh(false);
        }
        getWidget().C();
    }

    @Override // com.taobao.android.meta.structure.childpage.b
    public void an_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc41c559", new Object[]{this});
            return;
        }
        g widget = getWidget();
        q.a((Object) widget, "widget");
        iru iruVar = (iru) widget.getModel();
        q.a((Object) iruVar, "widget.model");
        MetaResult metaResult = (MetaResult) ((com.taobao.android.meta.data.b) iruVar.d()).getTotalSearchResult();
        if (metaResult == null || !metaResult.getFooterChanged()) {
            return;
        }
        getWidget().B();
        int size = metaResult.getFooters().size();
        for (int i = 0; i < size; i++) {
            BaseTypedBean baseTypedBean = metaResult.getFooters().get(i);
            q.a((Object) baseTypedBean, "it.footers[i]");
            getWidget().a(baseTypedBean);
        }
        metaResult.setFooterChanged(false);
    }

    @Override // tb.iuh
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        g widget = getWidget();
        q.a((Object) widget, "widget");
        iru iruVar = (iru) widget.getModel();
        q.a((Object) iruVar, "widget.model");
        ((com.taobao.android.meta.data.b) iruVar.d()).subscribe(this);
    }

    public void onEventMainThread(isu.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485717ad", new Object[]{this, aVar});
        } else {
            getIView().bJ_().unfold();
        }
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Iterator<Object> it = this.f14284a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
