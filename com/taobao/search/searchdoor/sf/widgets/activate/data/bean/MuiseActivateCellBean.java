package com.taobao.search.searchdoor.sf.widgets.activate.data.bean;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class MuiseActivateCellBean extends ActivateCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MuiseBean muiseBean;

    static {
        kge.a(-861019719);
    }

    public final MuiseBean getMuiseBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseBean) ipChange.ipc$dispatch("f9f9182d", new Object[]{this});
        }
        MuiseBean muiseBean = this.muiseBean;
        if (muiseBean == null) {
            q.b("muiseBean");
        }
        return muiseBean;
    }

    public final void setMuiseBean(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f11d3621", new Object[]{this, muiseBean});
            return;
        }
        q.c(muiseBean, "<set-?>");
        this.muiseBean = muiseBean;
    }
}
