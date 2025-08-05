package com.taobao.taolive.sdk.model.common;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class ImportantEventItem implements INetDataObject {
    public JSONObject configInfo;
    public JSONObject dataMessage;
    public long disappearTime;
    public FatigueInfo fatigueInfo;
    public String isHighestPriority;
    public int priority;
    public String templateName;
    public String type;
    public UTParams utParams;

    /* loaded from: classes8.dex */
    public static class FatigueInfo implements INetDataObject {
        public String fatigueKey;
        public long showNums;
        public long startTime;
        public long timeoutTime;

        static {
            kge.a(957586321);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class UTParams implements INetDataObject {
        public String clickParams;
        public String showParams;

        static {
            kge.a(-1601499415);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-695446976);
        kge.a(-540945145);
    }
}
