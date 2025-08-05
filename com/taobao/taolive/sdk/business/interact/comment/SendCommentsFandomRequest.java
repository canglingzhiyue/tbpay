package com.taobao.taolive.sdk.business.interact.comment;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class SendCommentsFandomRequest implements INetDataObject {
    public String accountId;
    public String commodityList;
    public String content;
    public HashMap<String, String> renders;
    public String topic;
    private String API_NAME = "mtop.taobao.iliad.fandom.comment.publish";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    static {
        kge.a(-1278231327);
        kge.a(-540945145);
    }
}
