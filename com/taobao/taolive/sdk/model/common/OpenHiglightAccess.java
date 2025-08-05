package com.taobao.taolive.sdk.model.common;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class OpenHiglightAccess implements INetDataObject {
    public String accountId;
    public HighlightSkipParams highlightSkipParams;
    public String liveId;

    /* loaded from: classes8.dex */
    public static class HighlightSkipParams implements INetDataObject {
        public String id;
        public String keyPointId;
        public String productType;
        public String sjsdItemId;

        static {
            kge.a(462561448);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(1587495731);
        kge.a(-540945145);
    }
}
