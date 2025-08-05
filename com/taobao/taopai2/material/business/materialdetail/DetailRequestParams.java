package com.taobao.taopai2.material.business.materialdetail;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.MaterialBaseRequestParams;
import tb.kge;

/* loaded from: classes8.dex */
public class DetailRequestParams extends MaterialBaseRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long id;

    static {
        kge.a(2061326874);
    }

    @Override // com.taobao.taopai2.material.base.b
    public String getAPI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef90fe95", new Object[]{this}) : "mtop.alibaba.tspeditor.material.detail";
    }

    public DetailRequestParams(long j) {
        this.id = j;
    }

    public DetailRequestParams(String str, String str2, int i, long j) {
        super(str, str2, i);
        this.id = j;
    }
}
