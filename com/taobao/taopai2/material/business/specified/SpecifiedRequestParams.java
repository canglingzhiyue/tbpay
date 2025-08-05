package com.taobao.taopai2.material.business.specified;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.MaterialBaseRequestParams;
import tb.kge;

/* loaded from: classes8.dex */
public class SpecifiedRequestParams extends MaterialBaseRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int clientVersion;
    public String materialId;

    static {
        kge.a(-1426493903);
    }

    @Override // com.taobao.taopai2.material.base.b
    public String getAPI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef90fe95", new Object[]{this}) : "mtop.alibaba.tspeditor.material.extend.specified.get";
    }

    public SpecifiedRequestParams(String str, String str2, int i, String str3) {
        super(str, str2, i);
        this.materialId = str3;
        this.clientVersion = i;
    }
}
