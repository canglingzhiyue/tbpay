package com.taobao.android.live.plugin.atype.flexalocal.good.business.topOperate;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1188374118);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        TopOperateRequest topOperateRequest = new TopOperateRequest();
        topOperateRequest.anchorId = str2;
        topOperateRequest.liveId = str;
        a(1, topOperateRequest, TopOperateResponse.class);
    }
}
