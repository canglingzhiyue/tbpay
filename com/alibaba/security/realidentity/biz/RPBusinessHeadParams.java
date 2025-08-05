package com.alibaba.security.realidentity.biz;

import com.alibaba.security.realidentity.biz.base.chain.BusinessHeadParams;
import com.alibaba.security.realidentity.biz.start.model.StepItem;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class RPBusinessHeadParams extends BusinessHeadParams {
    public boolean bSmallImageMode;
    public List<Integer> bioStepsEx;
    public String bizConf;
    public String fromSource;
    public IdentityInfoBean identityInfo;
    public String livenessConfig;
    public boolean localAccelerateOpen;
    public String localModelPath;
    public int maxRetry;
    public boolean needActionImage;
    public boolean needDisplayWaitingView;
    public boolean needFailVideo;
    public boolean needGaze;
    public boolean needOriginalImage;
    public boolean needSuccessVideo;
    public boolean needUserConfirm;
    public boolean onlyGaze;
    public int poseDetectInterval;
    public int retryCount;
    public int serviceType;
    public boolean sessionless;
    public boolean showNav;
    public int showTip;
    public String skinColor;
    public String statusCode;
    public List<StepItem> steps;
    public int type;
    public String userName;
    public Map<String, String> verifyConf;
    public String verifyToken;

    /* loaded from: classes3.dex */
    public static class IdentityInfoBean implements Serializable {
        public String name;
    }
}
