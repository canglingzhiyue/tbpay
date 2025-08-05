package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1199202707);
    }

    public abstract List<String> a();

    public abstract void a(List<DXTemplateItem> list);

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
