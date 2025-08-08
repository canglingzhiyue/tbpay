package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.c  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1199c extends BaseActionPerform {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RiskShowCustomizedAction";

    /* renamed from: a  reason: collision with root package name */
    public static final String f3295a = "ccrcRiskBlockingPage";

    public C1199c(Context context) {
        super(context);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f3295a;
    }

    @Override // com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform
    public String actionPerformCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d7e06921", new Object[]{this}) : f3295a;
    }

    @Override // com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform
    public void doAccept(String str, InferContext inferContext, String str2, String str3, SampleData sampleData, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6652d13", new Object[]{this, str, inferContext, str2, str3, sampleData, str4});
            return;
        }
        String str5 = null;
        for (JSONArray jSONArray : JSON.parseArray(str2, JSONArray.class)) {
            str5 = (String) BaseActionPerform.getSafely(jSONArray, 1, String.class);
        }
        if (StringUtils.isEmpty(str5)) {
            actionCallbackFail(sampleData, W.a("CCRC url is empty", sampleData.sampleId, sampleData.metaId, false, false));
        } else {
            actionCallbackSuccess(sampleData, W.a(sampleData, true, str5));
        }
    }
}
