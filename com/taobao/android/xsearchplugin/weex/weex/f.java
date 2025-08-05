package com.taobao.android.xsearchplugin.weex.weex;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.xsearchplugin.weex.weex.a;
import com.taobao.android.xsearchplugin.weex.weex.d;
import com.taobao.weex.WXSDKInstance;
import java.util.Map;
import tb.imn;
import tb.iru;
import tb.jvm;
import tb.kge;

/* loaded from: classes6.dex */
public class f extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, TemplateBean> b;
    private final iru<?> c;

    static {
        kge.a(674813246);
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

    public f(Activity activity, imn imnVar, a.InterfaceC0626a interfaceC0626a, d.a aVar, Map<String, TemplateBean> map, iru<?> iruVar) {
        super(activity, imnVar, interfaceC0626a, aVar);
        this.b = map;
        this.c = iruVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.android.searchbaseframe.datasource.impl.a] */
    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public jvm.c a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm.c) ipChange.ipc$dispatch("2535e2b4", new Object[]{this, str}) : this.c.d().getTemplateFile(str);
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public TemplateBean a(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("addf7135", new Object[]{this, weexBean}) : this.b.get(weexBean.type);
    }
}
