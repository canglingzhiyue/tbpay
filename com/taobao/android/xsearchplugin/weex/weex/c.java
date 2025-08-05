package com.taobao.android.xsearchplugin.weex.weex;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.xsearchplugin.weex.weex.a;
import com.taobao.android.xsearchplugin.weex.weex.d;
import com.taobao.weex.WXSDKInstance;
import tb.imn;
import tb.iru;
import tb.jvm;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private iru<?> b;

    static {
        kge.a(682333794);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 93762287) {
            return new Boolean(super.d());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public c(Activity activity, imn imnVar, iru<?> iruVar, a.InterfaceC0626a interfaceC0626a, d.a aVar) {
        super(activity, imnVar, interfaceC0626a, aVar);
        this.b = iruVar;
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (!super.d()) {
            return false;
        }
        if (this.b != null) {
            return true;
        }
        a().b().b("NxWeexDatasourceRenderer", "model is null");
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.android.searchbaseframe.datasource.impl.a] */
    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public void a(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421b9086", new Object[]{this, wXSDKInstance});
        } else {
            this.b.d().removeWeexInstance(wXSDKInstance);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.android.searchbaseframe.datasource.impl.a] */
    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public TemplateBean a(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("addf7135", new Object[]{this, weexBean}) : this.b.d().getTemplate(weexBean.type);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.android.searchbaseframe.datasource.impl.a] */
    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public jvm.c a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm.c) ipChange.ipc$dispatch("2535e2b4", new Object[]{this, str}) : this.b.d().getTemplateFile(str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.android.searchbaseframe.datasource.impl.a] */
    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e632142", new Object[]{this, dVar});
        } else {
            this.b.d().addWeexInstance(dVar);
        }
    }
}
