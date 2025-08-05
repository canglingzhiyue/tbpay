package com.taobao.taolive.sdk.model.message;

import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class ExplainBehaviorReportMessage {
    public String explainType;
    public List<Segment> segmentList;

    /* loaded from: classes8.dex */
    public static class Segment {
        public String explainEndTime;
        public long explainItemId;
        public String explainStartTime;
        public String explainTopicId;
        public long liveId;

        static {
            kge.a(1622864784);
        }
    }

    static {
        kge.a(-1721819615);
    }
}
