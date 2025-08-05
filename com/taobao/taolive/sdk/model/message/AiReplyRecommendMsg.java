package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class AiReplyRecommendMsg implements INetDataObject {
    public List<ItemList> itemList;
    public String title;

    /* loaded from: classes8.dex */
    public static class ItemList implements INetDataObject {
        public String href;
        public String id;
        public String image;
        public LiveItem info;
        public int number;

        static {
            kge.a(-748057499);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-950368208);
        kge.a(-540945145);
    }
}
