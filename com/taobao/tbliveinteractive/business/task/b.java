package com.taobao.tbliveinteractive.business.task;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(210716172);
    }

    public b(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
        } else {
            UploadFansActionRequest uploadFansActionRequest = new UploadFansActionRequest();
            uploadFansActionRequest.scopeId = str4;
            uploadFansActionRequest.subScope = str5;
            uploadFansActionRequest.action = str;
            uploadFansActionRequest.params = str2;
            uploadFansActionRequest.trackParams = str3;
            a(0, uploadFansActionRequest, (Class<?>) null);
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
        } else {
            MtopTaobaoGiuliaIntimacyActionEventRequest mtopTaobaoGiuliaIntimacyActionEventRequest = new MtopTaobaoGiuliaIntimacyActionEventRequest();
            mtopTaobaoGiuliaIntimacyActionEventRequest.setBizCode("babyCycle");
            mtopTaobaoGiuliaIntimacyActionEventRequest.setSource(str4);
            mtopTaobaoGiuliaIntimacyActionEventRequest.setTargetUid(str2);
            mtopTaobaoGiuliaIntimacyActionEventRequest.setAction(str);
            mtopTaobaoGiuliaIntimacyActionEventRequest.setBabyCycleId(str3);
            a(0, mtopTaobaoGiuliaIntimacyActionEventRequest, MtopTaobaoGiuliaIntimacyActionEventResponse.class);
        }
    }
}
