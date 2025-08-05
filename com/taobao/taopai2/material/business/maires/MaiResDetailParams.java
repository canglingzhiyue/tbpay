package com.taobao.taopai2.material.business.maires;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.MaterialBaseRequestParams;
import tb.kge;

/* loaded from: classes8.dex */
public class MaiResDetailParams extends MaterialBaseRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int materialGroup;
    public int materialType;
    public String tag;

    static {
        kge.a(-1208653735);
    }

    @Override // com.taobao.taopai2.material.base.b
    public String getAPI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef90fe95", new Object[]{this}) : "mtop.alibaba.tspeditor.material.byTag";
    }

    public MaiResDetailParams(int i, int i2, String str) {
        this.materialGroup = i;
        this.materialType = i2;
        this.tag = str;
    }
}
