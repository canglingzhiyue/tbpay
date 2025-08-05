package com.taobao.alilive.aliliveframework.context.atmo.bean;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class AtmosphereResListResponseData implements INetDataObject {
    public List<AtmosphereResItem> result;

    /* loaded from: classes4.dex */
    public static class AtmosphereResItem implements INetDataObject {
        public String file;
        public String groupId;
        public String matchKey;
        public String resUrl;
        public Rule rule;
        public String stickerType;
        public String title;
        public String type;
        public String version;

        static {
            kge.a(-1449080404);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes4.dex */
    public static class Rule implements INetDataObject {
        public String effective;
        public String endTime;
        public HashMap<Integer, String> fanLevels;
        public String startTime;

        static {
            kge.a(2036178369);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-1065734433);
        kge.a(-540945145);
    }
}
