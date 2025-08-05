package com.taobao.taolive.movehighlight.bussiness.highlight.comment;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class HighlightCommentResponseData implements INetDataObject {
    public List<CommentBean> model;

    /* loaded from: classes8.dex */
    public static class CommentBean implements INetDataObject {
        public String commentType;
        public String content;
        public String publisherId;
        public String publisherNick;
        public String timestamp;

        static {
            kge.a(-37174994);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-270256701);
        kge.a(-540945145);
    }
}
