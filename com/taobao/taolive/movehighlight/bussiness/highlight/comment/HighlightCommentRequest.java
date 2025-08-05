package com.taobao.taolive.movehighlight.bussiness.highlight.comment;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class HighlightCommentRequest implements INetDataObject {
    public String API_NAME = "mtop.tblive.timemoving.query.comment";
    public String VERSION = "1.0";
    public String anchorId;
    public String itemId;
    public String liveId;
    public String timeMovingId;
    public String topic;

    static {
        kge.a(1227303255);
        kge.a(-540945145);
    }
}
