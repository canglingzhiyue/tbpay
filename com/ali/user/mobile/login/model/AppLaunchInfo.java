package com.ali.user.mobile.login.model;

import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class AppLaunchInfo implements Serializable {
    public boolean biometricOpen;
    public BottomFloatingBarInfo bottomFloatingBarInfo;
    public String checkPattern;
    public String countryCode;
    public List<String> deviceMaskMobiles;
    public boolean displayOverseaEntrance;
    public int expireTime;
    public boolean fromOversea = false;
    public boolean locatedUmidAccount;
    public LoginPageInfo loginPageInfo;
    public String loginTrackInfo;
    public LoginValidator loginValidators;
    public boolean mobileAvailable;
    public boolean openFloatingBarPersonalize;
    public String otherLoginType;
    public boolean pad;
    public String phoneCode;
    public LoginPopInfo popInfo;
    public String popLoginType;
    public String regCheckPattern;
    public String regCountryCode;
    public String regPhoneCode;
    public boolean showPop;
    public List<String> sortedRecommendLoginTypes;
    public boolean supportOverseaSimLogin;
    public ABTestValue testValue;
    public String umidLoginToken;
    public boolean userNotFound;

    static {
        kge.a(-528872530);
        kge.a(1028243835);
    }
}
