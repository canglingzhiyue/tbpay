package com.taobao.android.xsearchplugin.muise;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import tb.imn;
import tb.iru;
import tb.jvm;
import tb.kge;

/* loaded from: classes6.dex */
public class p extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TemplateBean f16267a;
    private final iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> b;

    static {
        kge.a(1781456768);
    }

    @Override // com.taobao.android.xsearchplugin.muise.a
    public void c(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b31f63", new Object[]{this, pVar});
        }
    }

    public p(Activity activity, imn imnVar, com.taobao.android.weex_framework.g gVar, com.taobao.android.xsearchplugin.weex.weex.h hVar, TemplateBean templateBean, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar) {
        super(activity, imnVar, gVar, hVar);
        this.f16267a = templateBean;
        this.b = iruVar;
    }

    @Override // com.taobao.android.xsearchplugin.muise.a
    public void d() {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar = this.b;
        if (iruVar == null) {
            return;
        }
        b(iruVar.d().getTrackingPageName());
        String c = this.b.e().c();
        if (c == null && (intent = a().getIntent()) != null && intent.getData() != null) {
            c = intent.getData().toString();
        }
        a(c);
    }

    @Override // com.taobao.android.xsearchplugin.muise.a
    public jvm.c c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvm.c) ipChange.ipc$dispatch("35966272", new Object[]{this, str});
        }
        iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar = this.b;
        if (iruVar != null) {
            return iruVar.d().getTemplateFile(str);
        }
        return null;
    }

    @Override // com.taobao.android.xsearchplugin.muise.a
    public TemplateBean a(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("27bcb6cf", new Object[]{this, muiseBean}) : this.f16267a;
    }
}
