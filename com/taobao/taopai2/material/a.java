package com.taobao.taopai2.material;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.MaterialBaseRequestParams;
import com.taobao.taopai2.material.base.MaterialRequestPolicy;
import com.taobao.taopai2.material.business.materialcategory.CategoryInfo;
import com.taobao.taopai2.material.business.materialcategory.CategoryRequestParams;
import com.taobao.taopai2.material.business.materialcategory.CategoryResponseModel;
import com.taobao.taopai2.material.business.materiallist.MaterialListRequestParams;
import com.taobao.taopai2.material.business.materiallist.MaterialListResponse;
import com.taobao.taopai2.material.request.Response;
import io.reactivex.ad;
import java.util.List;
import tb.izj;
import tb.kge;
import tb.qbs;
import tb.qfh;
import tb.riy;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f22081a = "taopai";
    private String b = "taopai";

    static {
        kge.a(-570555296);
    }

    public static a a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("19708c66", new Object[]{context, str, str2});
        }
        a aVar = new a();
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            if (!izj.a()) {
                throw new IllegalArgumentException("bizLine or bizScene is empty");
            }
        } else {
            aVar.f22081a = str;
            aVar.b = str2;
        }
        qbs.a(context);
        return aVar;
    }

    public ad<List<CategoryInfo>> a(long j, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ad) ipChange.ipc$dispatch("3d96f6fc", new Object[]{this, new Long(j), new Integer(i)}) : a(j, i, MaterialRequestPolicy.CACHE_NET, 300L);
    }

    public ad<List<CategoryInfo>> a(long j, int i, MaterialRequestPolicy materialRequestPolicy, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ad) ipChange.ipc$dispatch("c7dca8e1", new Object[]{this, new Long(j), new Integer(i), materialRequestPolicy, new Long(j2)});
        }
        CategoryRequestParams categoryRequestParams = new CategoryRequestParams(j, i);
        categoryRequestParams.setRequestPolicy(materialRequestPolicy);
        categoryRequestParams.setCacheTime(j2);
        a(categoryRequestParams);
        return new qfh(categoryRequestParams, CategoryResponseModel.class).a().map($$Lambda$a$EqyHyWCeYlJqkiv7Qxusw8290_8.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List b(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("33d3f6d2", new Object[]{response}) : ((CategoryResponseModel) response.data).categoryList;
    }

    public ad<MaterialListResponse> a(long j, String str, int i, int i2, int i3, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ad) ipChange.ipc$dispatch("c1edc71c", new Object[]{this, new Long(j), str, new Integer(i), new Integer(i2), new Integer(i3), str2}) : a(j, str, i, i2, i3, str2, MaterialRequestPolicy.CACHE_NET, 300L);
    }

    public ad<MaterialListResponse> a(long j, String str, int i, int i2, int i3, String str2, MaterialRequestPolicy materialRequestPolicy, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ad) ipChange.ipc$dispatch("c8b2bcc1", new Object[]{this, new Long(j), str, new Integer(i), new Integer(i2), new Integer(i3), str2, materialRequestPolicy, new Long(j2)});
        }
        StringBuilder sb = new StringBuilder();
        if (!StringUtils.isEmpty(str2)) {
            sb.append(riy.ARRAY_START_STR);
            sb.append(str2);
            sb.append(riy.ARRAY_END_STR);
        }
        MaterialListRequestParams materialListRequestParams = new MaterialListRequestParams(j, str, i, i2, i3, sb.toString());
        materialListRequestParams.setRequestPolicy(materialRequestPolicy);
        materialListRequestParams.setCacheTime(j2);
        a(materialListRequestParams);
        return new qfh(materialListRequestParams, MaterialListResponse.class).a().map($$Lambda$a$CB8wjVoTvQ6KSudRmBGHKWJwg3c.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MaterialListResponse a(Response response) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MaterialListResponse) ipChange.ipc$dispatch("299da4ee", new Object[]{response}) : (MaterialListResponse) response.data;
    }

    private final void a(MaterialBaseRequestParams materialBaseRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db543416", new Object[]{this, materialBaseRequestParams});
            return;
        }
        if (StringUtils.isEmpty(materialBaseRequestParams.bizLine)) {
            materialBaseRequestParams.bizLine = this.f22081a;
        }
        if (!StringUtils.isEmpty(materialBaseRequestParams.bizScene)) {
            return;
        }
        materialBaseRequestParams.bizScene = this.b;
    }
}
