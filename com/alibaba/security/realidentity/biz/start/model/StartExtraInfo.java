package com.alibaba.security.realidentity.biz.start.model;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class StartExtraInfo implements Serializable {
    public IdentityInfo identityInfo;
    public String livenessConfig;
    public boolean localAccelerateOpen;
    public boolean needGuidePage;
    public boolean needLogin;
    public boolean needPrivacyPage;
    public boolean needQueryPage;
    public boolean needStatusPage;
    public boolean needUserInfo;
    public StartStatusResult rpStatusResult;
    public String skinColor;
    public boolean useNewProcess;
    public boolean useOCR;

    /* loaded from: classes3.dex */
    public static class IdentityInfo implements Serializable {
        public String name;
    }
}
