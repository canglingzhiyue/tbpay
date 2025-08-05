package com.taobao.android.xsearchplugin.weex.weex;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
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
public class e extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final TemplateBean b;
    private final iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> c;

    static {
        kge.a(-1058645806);
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e632142", new Object[]{this, dVar});
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public void a(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421b9086", new Object[]{this, wXSDKInstance});
        }
    }

    public e(Activity activity, imn imnVar, a.InterfaceC0626a interfaceC0626a, d.a aVar, TemplateBean templateBean, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar) {
        super(activity, imnVar, interfaceC0626a, aVar);
        this.b = templateBean;
        this.c = iruVar;
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public jvm.c a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvm.c) ipChange.ipc$dispatch("2535e2b4", new Object[]{this, str});
        }
        iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar = this.c;
        if (iruVar != null) {
            return iruVar.d().getTemplateFile(str);
        }
        return null;
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public TemplateBean a(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("addf7135", new Object[]{this, weexBean}) : this.b;
    }
}
