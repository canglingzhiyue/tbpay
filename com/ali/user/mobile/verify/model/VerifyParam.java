package com.ali.user.mobile.verify.model;

import com.ali.user.mobile.model.FingerInfo;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class VerifyParam {
    public String actionType;
    public String biometricId;
    public String biometricType;
    public String deviceTokenKey;
    public int fromSite;
    public String ivToken;
    public List<FingerInfo> list;
    public String loginId;
    public String loginToken;
    public String requestScene;
    public String userId;

    static {
        kge.a(-200498528);
    }
}
