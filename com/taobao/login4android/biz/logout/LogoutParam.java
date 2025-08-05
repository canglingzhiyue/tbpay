package com.taobao.login4android.biz.logout;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class LogoutParam implements Serializable {
    public String autologinToken;
    public boolean emptyAll;
    public int loggedUserNum = 1;
    public String sid;
    public int site;
    public String subSid;
    public String userid;

    static {
        kge.a(-1402636424);
        kge.a(1028243835);
    }
}
