package com.taobao.taopai2.material.business.materiallist;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.MaterialBaseRequestParams;
import java.io.Serializable;
import tb.izj;
import tb.kge;
import tb.qbs;

/* loaded from: classes8.dex */
public class MaterialListRequestParams extends MaterialBaseRequestParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int clientVersion;
    public String materialCategoryId;
    public long materialGroupId;
    public int page;
    public int pageSize;
    public String topRankIdList;

    static {
        kge.a(2019396371);
        kge.a(1028243835);
    }

    @Override // com.taobao.taopai2.material.base.b
    public String getAPI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef90fe95", new Object[]{this}) : "mtop.alibaba.tspeditor.material.extend.material.list";
    }

    public MaterialListRequestParams(long j, String str, int i, int i2, int i3, String str2) {
        this.clientVersion = 720;
        this.materialGroupId = j;
        this.materialCategoryId = str;
        this.page = i;
        this.pageSize = i2;
        this.clientVersion = i3;
        this.topRankIdList = str2;
    }

    @Override // com.taobao.taopai2.material.base.MaterialBaseRequestParams, com.taobao.taopai2.material.base.a
    public String getCachePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97112b88", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.materialGroupId);
        sb.append("_");
        sb.append(this.materialCategoryId);
        sb.append("_");
        sb.append(this.page);
        sb.append("_");
        sb.append(this.pageSize);
        sb.append("_");
        sb.append(this.topRankIdList);
        sb.append("_");
        sb.append(izj.a() ? "1" : "0");
        return qbs.b() + "material_list_" + sb.toString();
    }
}
