package com.taobao.avplayer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.mediaplay.model.MediaVideoResponse;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.kge;
import tb.mjz;
import tb.mka;

/* loaded from: classes6.dex */
public class ag implements mjz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DWContext f16453a;

    static {
        kge.a(-131084192);
        kge.a(1828750134);
    }

    public ag(DWContext dWContext) {
        this.f16453a = dWContext;
    }

    @Override // tb.mjz
    public void a(final mka mkaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a61575", new Object[]{this, mkaVar});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_DWTBVideoSourceAdapter);
        this.f16453a.queryVideoConfigData2(new com.taobao.avplayer.common.w() { // from class: com.taobao.avplayer.ag.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.common.w
            public void onSuccess(DWResponse dWResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
                    return;
                }
                if (dWResponse != null && dWResponse.data != null) {
                    ag.this.f16453a.setDWConfigObject(new d(dWResponse.data));
                }
                if (mkaVar == null) {
                    return;
                }
                MediaVideoResponse mediaVideoResponse = new MediaVideoResponse();
                if (dWResponse != null) {
                    mediaVideoResponse.data = dWResponse.data;
                    mediaVideoResponse.errorCode = dWResponse.errorCode;
                    mediaVideoResponse.errorMsg = dWResponse.errorMsg;
                }
                mkaVar.a(mediaVideoResponse);
            }

            @Override // com.taobao.avplayer.common.w
            public void onError(DWResponse dWResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
                } else if (mkaVar == null) {
                } else {
                    MediaVideoResponse mediaVideoResponse = new MediaVideoResponse();
                    if (dWResponse != null) {
                        mediaVideoResponse.data = dWResponse.data;
                        mediaVideoResponse.errorCode = dWResponse.errorCode;
                        mediaVideoResponse.errorMsg = dWResponse.errorMsg;
                    }
                    mkaVar.b(mediaVideoResponse);
                }
            }
        }, false);
    }
}
