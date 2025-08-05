package com.taobao.search.sf.widgets.list.listcell.weex;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.xsearchplugin.weex.weex.a;
import com.taobao.android.xsearchplugin.weex.weex.d;
import com.taobao.weex.RenderContainer;
import tb.imn;
import tb.iru;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends com.taobao.android.xsearchplugin.weex.weex.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-797349147);
    }

    public b(Activity activity, imn imnVar, a.InterfaceC0626a interfaceC0626a, d.a aVar, TemplateBean templateBean, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar) {
        super(activity, imnVar, interfaceC0626a, aVar, templateBean, iruVar);
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public RenderContainer a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderContainer) ipChange.ipc$dispatch("c2864e81", new Object[]{this, context});
        }
        RenderContainer renderContainer = new RenderContainer(context);
        renderContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return renderContainer;
    }
}
