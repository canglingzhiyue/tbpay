package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveEndMessage implements INetDataObject {
    public String messageText;
    public String replayUrl;
    public String type;

    /* loaded from: classes8.dex */
    public static class MessageText implements INetDataObject {
        public String nextLiveId;
        public boolean nextLiveIsIntelligence;

        static {
            kge.a(902804831);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(1071983823);
        kge.a(-540945145);
    }
}
