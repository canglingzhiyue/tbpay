package com.taobao.taolive.sdk.business.interact.comment;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class FetchCommentRequest implements INetDataObject {
    public long neoRoomType;
    private String API_NAME = "mtop.taobao.iliad.comment.query.latest";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    public long tab = 1;
    public long limit = 20;
    public String topic = null;
    public String anchorSideKey = null;
    public String paginationContext = null;
    public String order = "asc";

    static {
        kge.a(-2059746009);
        kge.a(-540945145);
    }
}
