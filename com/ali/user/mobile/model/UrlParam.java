package com.ali.user.mobile.model;

import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UrlParam implements Serializable {
    public boolean closeIfLoadFailed;
    public Map<String, Object> ext;
    public int flags;
    public boolean isTransparent;
    public String ivScene;
    public String loginId;
    public LoginBaseParam loginParam;
    public String loginType;
    public int requestCode;
    public String scene;
    public boolean showSkipButton;
    public int site;
    public String snsToken;
    public String token;
    public String tokenType;
    public String url;
    public String userid;
    public boolean needTitle = true;
    public String uccNeedSession = "1";

    static {
        kge.a(2022727628);
        kge.a(1028243835);
    }
}
