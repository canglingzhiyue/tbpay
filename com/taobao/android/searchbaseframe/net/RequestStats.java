package com.taobao.android.searchbaseframe.net;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class RequestStats implements Serializable {
    public long oneWayTime;
    public long recvDataSize;
    public long recvDataTime;
    public int retryTimes;
    public long sendDataSize;
    public long serverRt;

    static {
        kge.a(-1646786160);
        kge.a(1028243835);
    }
}
