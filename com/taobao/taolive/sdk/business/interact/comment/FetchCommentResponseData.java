package com.taobao.taolive.sdk.business.interact.comment;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.interact.Comment;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class FetchCommentResponseData implements INetDataObject {
    public ArrayList<Comment> comments;
    public long delay;
    public String paginationContext;

    static {
        kge.a(701070323);
        kge.a(-540945145);
    }
}
