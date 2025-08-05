package com.taobao.taolive.room.pre;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.core.impl.TBLiveDataProvider;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class PreRequestInfo implements INetDataObject {
    public static final int RESPONSE_FAIL = 2;
    public static final int RESPONSE_HEADER_FAIL = -1;
    public static final int RESPONSE_HEADER_SUCCESS = 1;
    public static final int RESPONSE_INVALID = 0;
    public static final int RESPONSE_SUCCESS = 1;
    public String errCode;
    public FandomInfo fandomInfo;
    public String fandomResponse;
    public Map<String, List<String>> headerMap;
    public int headerResponseStatus;
    public VideoInfo info;
    public LiveDetailPreRequestParams params;
    public PreRequestImpl preRequest;
    public String rawData;
    public int responseStatus;
    public TBLiveDataProvider tbLiveDataProvider;

    static {
        kge.a(40618982);
        kge.a(-540945145);
    }
}
