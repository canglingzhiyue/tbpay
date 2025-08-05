package com.taobao.taolive.uikit.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class TaoliveDXFollowRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.social.follow.weitao.add";
    private String VERSION = "3.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public String originBiz = "taoliveSearch";
    public String originFlag = "";
    public String originPage = "Page_TaoLiveSearch";
    public String accountType = "2";
    public String pubAccountId = "";
    public String option = "1";

    static {
        kge.a(-164553598);
        kge.a(-350052935);
    }
}
