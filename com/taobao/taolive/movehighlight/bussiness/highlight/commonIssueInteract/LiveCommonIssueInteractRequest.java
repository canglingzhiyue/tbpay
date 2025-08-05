package com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveCommonIssueInteractRequest implements INetDataObject {
    public long anchorId;
    public String asac;
    public ExtendParams extendParams;
    public long liveId;
    public String API_NAME = "mtop.iliad.interact.commonIssueInteract";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public String interactType = "highlightCoupon";
    public String rightsType = "lafite";

    /* loaded from: classes8.dex */
    public static class ExtendParams implements INetDataObject {
        public String appName = "iliad";
        public String asac;
        public String benefitCode;
        public String channel;
        public String encryptedDynamicInfo;
        public String extraData;
        public String interactEntrance;
        public String selectedBenefitCode;
        public String strategyCode;

        static {
            kge.a(637027173);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-67327361);
        kge.a(-540945145);
    }
}
