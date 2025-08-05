package com.taobao.taolive.movehighlight.bussiness.highlight.newModel;

import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class HighlightRowResponseData implements INetDataObject {
    public HighlightRow model;
    public String selectedItemId;
    public int selectedItemIndex;

    /* loaded from: classes8.dex */
    public static class HighlightRow implements INetDataObject {
        public String liveId;
        public String liveRoomStatus;
        public List<LiveTimemovingModel> timeMovingList;
        public String traceId;

        static {
            kge.a(938654832);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(304829594);
        kge.a(-540945145);
    }
}
