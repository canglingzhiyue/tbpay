package com.taobao.avplayer.interactivelifecycle.frontcover.model;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.common.w;
import com.taobao.avplayer.common.y;
import com.taobao.avplayer.core.model.DWResponse;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements w, c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public y f16520a;

    static {
        kge.a(1820749186);
        kge.a(-700117019);
        kge.a(1342737764);
    }

    @Override // com.taobao.avplayer.interactivelifecycle.frontcover.model.c
    public void a(DWContext dWContext, y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21b23c77", new Object[]{this, dWContext, yVar});
            return;
        }
        this.f16520a = yVar;
        if (dWContext == null || StringUtils.isEmpty(dWContext.mFrom) || dWContext.mInteractiveId <= 0 || dWContext.mNetworkAdapter == null) {
            this.f16520a.a(-1, null);
        } else {
            dWContext.queryConfigData(this, false);
        }
    }

    @Override // com.taobao.avplayer.common.w
    public void onSuccess(DWResponse dWResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
        } else if (dWResponse != null && dWResponse.data != null) {
            this.f16520a.a(new DWFrontCoverBean(dWResponse));
        } else {
            this.f16520a.a(-1, null);
        }
    }

    @Override // com.taobao.avplayer.common.w
    public void onError(DWResponse dWResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
        } else {
            this.f16520a.a(-1, dWResponse);
        }
    }
}
