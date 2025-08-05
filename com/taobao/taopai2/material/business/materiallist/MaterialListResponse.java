package com.taobao.taopai2.material.business.materiallist;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.qfg;

/* loaded from: classes8.dex */
public class MaterialListResponse implements Serializable, qfg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String filterInfoMap;
    public boolean hasNext;
    public List<MaterialDetailBean> materialList;
    public int page;
    public int pageSize;
    public int total;
    public int totalPage;

    static {
        kge.a(498704227);
        kge.a(1028243835);
        kge.a(-1137413742);
    }

    @Override // tb.qfg
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.materialList != null;
    }
}
