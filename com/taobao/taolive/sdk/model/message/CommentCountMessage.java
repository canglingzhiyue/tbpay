package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class CommentCountMessage implements INetDataObject {
    public String backgroundImg;
    public String backgroundTitle;
    public CommentCount data;
    public long pushTime;
    public String type;

    /* loaded from: classes8.dex */
    public static class CommentCount implements INetDataObject {
        public String atmosphere;
        public String commentHash;
        public String content;
        public String count;
        public String countShow;

        static {
            kge.a(-923339276);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-59963840);
        kge.a(-540945145);
    }
}
