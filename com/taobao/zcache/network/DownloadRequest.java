package com.taobao.zcache.network;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.k;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class DownloadRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String url = null;
    public int timeout = 0;
    public String tempFilePath = null;
    public HashMap<String, String> header = null;
    public String traceId = null;
    public int progressId = 0;
    public boolean fetchAllResponseHeader = false;

    static {
        kge.a(1259491346);
    }

    public k getNetworkRequst() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("cdce20d1", new Object[]{this}) : new k(this.url, this.timeout, this.header, this.traceId);
    }
}
