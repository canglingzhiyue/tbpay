package com.taobao.android.fluid.remote.collectionpoplayer.Request;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class RelatedCollectionResult implements Serializable {
    private static final long serialVersionUID = 7111032895441618969L;
    @JSONField(name = "result")
    public List<RelatedCollectionResultItem> result;

    /* loaded from: classes5.dex */
    public static class Collection implements Serializable {
        private static final long serialVersionUID = 7605585939904730504L;
        @JSONField(name = "collectionName")
        public String collectionName;
        @JSONField(name = "collectionType")
        public String collectionType;
        @JSONField(name = "count")
        public String count;
        @JSONField(name = "extra")
        public String extra;
        @JSONField(name = "updateTo")
        public String updateTo;

        static {
            kge.a(313442268);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class Content implements Serializable {
        private static final long serialVersionUID = -285308884191333190L;
        @JSONField(name = "collectionCoverUrl")
        public String collectionCoverUrl;
        @JSONField(name = PopupDialog.COLLECTION_ID)
        public String collectionId;
        @JSONField(name = "id")
        public String id;
        @JSONField(name = "targetUrl")
        public String targetUrl;

        static {
            kge.a(-891036677);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class RelatedCollectionResultItem implements Serializable {
        private static final long serialVersionUID = 8203151540352945710L;
        @JSONField(name = "collection")
        public Collection collection;
        @JSONField(name = "content")
        public Content content;

        static {
            kge.a(1642175835);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(760833606);
        kge.a(1028243835);
    }
}
