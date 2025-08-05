package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.TBTVProgramInfo;
import tb.kge;

/* loaded from: classes8.dex */
public class TBTVProgramMessage implements INetDataObject {
    public long endTime;
    public boolean inTime;
    public TBTVProgramInfo liveDO;
    public String liveId;
    public long startTime;
    public String title;

    static {
        kge.a(670063338);
        kge.a(-540945145);
    }
}
