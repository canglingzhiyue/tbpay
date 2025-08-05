package com.taobao.taolive.sdk.business.interact.comment;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class SendCommentsRequest implements INetDataObject {
    public String accountId;
    public String commodityList;
    public String content;
    public String extraFlag;
    public HashMap<String, String> renders;
    public String topic;
    private String API_NAME = "mtop.taobao.iliad.comment.publish";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public String relatedTopic = null;

    static {
        kge.a(-301763088);
        kge.a(-540945145);
    }
}
