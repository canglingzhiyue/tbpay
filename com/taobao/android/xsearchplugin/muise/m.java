package com.taobao.android.xsearchplugin.muise;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import tb.imn;
import tb.iru;
import tb.jvm;
import tb.kge;

/* loaded from: classes6.dex */
public class m extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private iru<?> f16261a;

    static {
        kge.a(1445064848);
    }

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
        if (str.hashCode() == 95609329) {
            return new Boolean(super.f());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.xsearchplugin.muise.a
    public void c(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b31f63", new Object[]{this, pVar});
        }
    }

    public m(Activity activity, imn imnVar, iru<?> iruVar, com.taobao.android.weex_framework.g gVar, com.taobao.android.xsearchplugin.weex.weex.h hVar) {
        super(activity, imnVar, gVar, hVar);
        this.f16261a = iruVar;
    }

    @Override // com.taobao.android.xsearchplugin.muise.a
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (!super.f()) {
            return false;
        }
        if (this.f16261a != null) {
            return true;
        }
        b().b().b("NxMuiseDatasourceRenderer", "model is null");
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.android.searchbaseframe.datasource.impl.a] */
    @Override // com.taobao.android.xsearchplugin.muise.a
    public void d() {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        b(this.f16261a.d().getTrackingPageName());
        String c = this.f16261a.e().c();
        if (c == null && (intent = a().getIntent()) != null && intent.getData() != null) {
            c = intent.getData().toString();
        }
        a(c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.android.searchbaseframe.datasource.impl.a] */
    @Override // com.taobao.android.xsearchplugin.muise.a
    public jvm.c c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm.c) ipChange.ipc$dispatch("35966272", new Object[]{this, str}) : this.f16261a.d().getTemplateFile(str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.android.searchbaseframe.datasource.impl.a] */
    @Override // com.taobao.android.xsearchplugin.muise.a
    public TemplateBean a(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("27bcb6cf", new Object[]{this, muiseBean}) : this.f16261a.d().getTemplate(muiseBean.type);
    }
}
