package com.taobao.live.home.dinamic.ability.business;

import mtopsdk.mtop.domain.IMTOPDataObject;

/* loaded from: classes7.dex */
public class TBLCancelFollowRequest implements IMTOPDataObject {
    public String accountId;
    private String API_NAME = "mtop.tblive.live.follow.relation.cancel";
    private String VERSION = "2.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
}
