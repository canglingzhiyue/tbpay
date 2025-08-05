package com.taobao.relationship.mtop.addfollow;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class AddFollowWelcomeRequest implements IMTOPDataObject {
    public long accountId;
    public int accountType;
    public String origin;
    public String API_NAME = "mtop.cybertron.follow.welcome";
    public String VERSION = "2.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;

    static {
        kge.a(-393187937);
        kge.a(-350052935);
    }
}
