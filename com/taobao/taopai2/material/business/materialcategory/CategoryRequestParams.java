package com.taobao.taopai2.material.business.materialcategory;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.MaterialBaseRequestParams;
import tb.izj;
import tb.kge;
import tb.qbs;

/* loaded from: classes8.dex */
public class CategoryRequestParams extends MaterialBaseRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long materialGroupId;
    public int materialType;

    static {
        kge.a(-1291689734);
    }

    @Override // com.taobao.taopai2.material.base.b
    public String getAPI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef90fe95", new Object[]{this}) : "mtop.alibaba.tspeditor.material.extend.category.list";
    }

    public CategoryRequestParams(long j, int i) {
        this.materialGroupId = j;
        this.materialType = i;
    }

    public CategoryRequestParams(String str, String str2, int i, long j, int i2) {
        super(str, str2, i);
        this.materialGroupId = j;
        this.materialType = i2;
    }

    @Override // com.taobao.taopai2.material.base.MaterialBaseRequestParams, com.taobao.taopai2.material.base.a
    public String getCachePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97112b88", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(qbs.b());
        sb.append("material_category_");
        sb.append(this.materialGroupId);
        sb.append("_");
        sb.append(this.materialType);
        sb.append("_");
        sb.append(izj.a() ? "1" : "0");
        return sb.toString();
    }
}
