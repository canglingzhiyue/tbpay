package com.taobao.android.live.plugin.atype.flexalocal.profile.joingroup;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class JoingroupRequest implements INetDataObject {
    private String API_NAME = "mtop.taobao.chatting.group.user.joingroup";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public String groupId = null;
    public Map properties = null;

    static {
        kge.a(2138643046);
        kge.a(-540945145);
    }
}
