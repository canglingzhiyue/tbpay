package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes4.dex */
public class LiveItemPersonalityGetResponseData implements INetDataObject {
    public ArrayList<LiveItemPersonalityData> personalities;

    /* loaded from: classes4.dex */
    public static class LiveItemPersonalityData implements INetDataObject {
        public String itemId;
        public JSONObject personalityData;

        static {
            kge.a(573738928);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(1483992667);
        kge.a(-540945145);
    }
}
