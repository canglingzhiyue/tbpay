package com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveCommonIssueInteractResponseData implements INetDataObject {
    public BenefitVO benefitVO;
    public String rightsType;
    public String winning;

    /* loaded from: classes8.dex */
    public static class BenefitVO implements INetDataObject {
        public String rightSubStatus;
        public String rightSubStatusDes;
        public String toastTips;

        static {
            kge.a(-1960696409);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(530132379);
        kge.a(-540945145);
    }
}
