package com.taobao.zcache.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.l;
import com.taobao.zcache.network.DownloadRequest;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1797208282);
    }

    public void a(DownloadRequest downloadRequest, l lVar, com.taobao.zcache.network.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8605191", new Object[]{this, downloadRequest, lVar, cVar});
        } else {
            com.taobao.zcache.network.d.a(downloadRequest, lVar, cVar);
        }
    }
}
