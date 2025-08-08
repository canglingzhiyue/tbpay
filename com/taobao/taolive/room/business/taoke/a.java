package com.taobao.taolive.room.business.taoke;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import tb.cgl;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1266688838);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa210a1c", new Object[]{this, str, new Long(j), str2});
            return;
        }
        if (StringUtils.isEmpty(str2)) {
            str2 = "taolive";
        }
        TaokeRequest taokeRequest = new TaokeRequest();
        taokeRequest.accountId = str;
        taokeRequest.bizType = str2;
        taokeRequest.itemId = j;
        taokeRequest.utdid = cgl.f().a(pmd.a().u().c().getApplicationContext());
        taokeRequest.platform = "phone";
        taokeRequest.sourceType = 2L;
        a(0, taokeRequest, (Class<?>) null);
    }
}
