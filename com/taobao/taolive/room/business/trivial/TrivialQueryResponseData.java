package com.taobao.taolive.room.business.trivial;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class TrivialQueryResponseData implements INetDataObject {
    public String encryptAnchorId;
    public String encryptUserId;
    public ResultVoData resultVO;

    /* loaded from: classes8.dex */
    public static class ChatItemCommonData implements INetDataObject {
        public String bizType;
        public JSONObject data;
        public boolean isFirstShow;
        public String showType;
        public String templateName;
        public String voName;

        static {
            kge.a(-141919003);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class CommonPMV0 implements INetDataObject {
        public List<ChatItemCommonData> pmlist;

        static {
            kge.a(919778951);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class ResultVoData implements INetDataObject {
        public CommonPMV0 commonPMVO;

        static {
            kge.a(-584340475);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(1512568095);
        kge.a(-540945145);
    }
}
