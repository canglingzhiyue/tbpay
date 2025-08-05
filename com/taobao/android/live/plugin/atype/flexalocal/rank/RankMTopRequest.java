package com.taobao.android.live.plugin.atype.flexalocal.rank;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class RankMTopRequest implements INetDataObject {
    public String liveId;
    private String API_NAME = "mtop.iliad.interact.userscenerank";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    public String rankType = "liveUser";
    public int limitNum = 3;

    static {
        kge.a(-1029414236);
        kge.a(-540945145);
    }
}
