package com.taobao.android.live.plugin.atype.flexalocal.profile;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class LiveAvatarInfoCardRequest implements INetDataObject {
    private String API_NAME = "mtop.mediaplatform.new.anchor.info.card";
    private String VERSION = "2.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public long anchorId = 0;
    public long liveId = 0;
    public String encodeAccountId = "";
    public String sourceType = "";
    public boolean isFandom = false;
    public boolean isPublic = false;

    static {
        kge.a(1753568122);
        kge.a(-540945145);
    }
}
