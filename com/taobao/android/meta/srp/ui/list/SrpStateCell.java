package com.taobao.android.meta.srp.ui.list;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import tb.kge;

/* loaded from: classes6.dex */
public class SrpStateCell extends BaseCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1610984973);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean
    /* renamed from: copyCellBean */
    public SrpStateCell mo1014copyCellBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SrpStateCell) ipChange.ipc$dispatch("f07ffc8a", new Object[]{this}) : new SrpStateCell();
    }
}
