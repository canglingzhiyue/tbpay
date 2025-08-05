package com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.LiveCommonIssueInteractRequest;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import com.taobao.taolive.sdk.utils.l;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1454245328);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(LiveTimemovingModel liveTimemovingModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4c8664", new Object[]{this, liveTimemovingModel});
        } else if (liveTimemovingModel == null || liveTimemovingModel.rightInfo == null || liveTimemovingModel.extendVal == null) {
        } else {
            LiveCommonIssueInteractRequest liveCommonIssueInteractRequest = new LiveCommonIssueInteractRequest();
            liveCommonIssueInteractRequest.liveId = l.b(liveTimemovingModel.extendVal.liveId);
            liveCommonIssueInteractRequest.anchorId = l.b(liveTimemovingModel.extendVal.anchorId);
            liveCommonIssueInteractRequest.asac = liveTimemovingModel.rightInfo.asac;
            LiveCommonIssueInteractRequest.ExtendParams extendParams = new LiveCommonIssueInteractRequest.ExtendParams();
            extendParams.strategyCode = liveTimemovingModel.rightInfo.strategyCode;
            extendParams.channel = liveTimemovingModel.rightInfo.channel;
            extendParams.benefitCode = liveTimemovingModel.rightInfo.benefitCode;
            extendParams.asac = liveTimemovingModel.rightInfo.asac;
            liveCommonIssueInteractRequest.extendParams = extendParams;
            if (extendParams.asac != null && !TextUtils.isEmpty(extendParams.asac)) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("asac", extendParams.asac);
                a(hashMap);
            }
            a(0, liveCommonIssueInteractRequest, LiveCommonIssueInteractResponse.class);
        }
    }
}
