package com.taobao.android.interactive_sdk;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_sdk.adapter.ILikeAdapter;
import com.taobao.avplayer.DWNetworkAdapter;
import com.taobao.avplayer.common.w;
import com.taobao.avplayer.core.model.DWRequest;
import com.taobao.social.sdk.net.ISocialBusinessListener;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.och;
import tb.oci;

/* loaded from: classes5.dex */
public enum LikeAdapter implements ILikeAdapter {
    INSTANCE;

    public void cancelDislike(String str, String str2, w wVar) {
        DWRequest dWRequest = new DWRequest();
        dWRequest.apiName = "mtop.taobao.social.dislike.remove";
        dWRequest.apiVersion = "1.0";
        dWRequest.needLogin = true;
        if (dWRequest.paramMap == null) {
            dWRequest.paramMap = new HashMap();
        }
        dWRequest.paramMap.put("namespace", String.valueOf(str));
        dWRequest.paramMap.put("targetId", String.valueOf(str2));
        new DWNetworkAdapter().sendRequest(wVar, dWRequest);
    }

    public void cancelLike(long j, long j2, final ILikeAdapter.a aVar) {
        och.getInstance().cancelLike(j, j2, new ISocialBusinessListener() { // from class: com.taobao.android.interactive_sdk.LikeAdapter.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.social.sdk.net.ISocialBusinessListener
            public void onSuccess(MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
                } else {
                    aVar.onSuccess(mtopResponse, obj);
                }
            }

            @Override // com.taobao.social.sdk.net.ISocialBusinessListener
            public void onError(ISocialBusinessListener.ErrorType errorType, String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str, str2});
                } else {
                    aVar.onError(ILikeAdapter.ErrorType.valueOf(errorType.name()), str, str2);
                }
            }
        });
    }

    public void checkLikeState(long j, long j2, final ILikeAdapter.a aVar) {
        och.getInstance().getCountAndStatus(new oci(new oci.a().setTargetIds(new String[]{String.valueOf(j)}).setLikeNamespace(j2).setLikeCount(true).setLikeStatus(true)), new ISocialBusinessListener() { // from class: com.taobao.android.interactive_sdk.LikeAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.social.sdk.net.ISocialBusinessListener
            public void onSuccess(MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
                } else {
                    aVar.onSuccess(mtopResponse, obj);
                }
            }

            @Override // com.taobao.social.sdk.net.ISocialBusinessListener
            public void onError(ISocialBusinessListener.ErrorType errorType, String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str, str2});
                } else {
                    aVar.onError(ILikeAdapter.ErrorType.valueOf(errorType.name()), str, str2);
                }
            }
        });
    }

    public void dislike(String str, String str2, String str3, w wVar) {
        DWRequest dWRequest = new DWRequest();
        dWRequest.apiName = "mtop.taobao.social.dislike.add";
        dWRequest.apiVersion = "1.0";
        dWRequest.needLogin = true;
        if (dWRequest.paramMap == null) {
            dWRequest.paramMap = new HashMap();
        }
        dWRequest.paramMap.put("namespace", String.valueOf(str));
        dWRequest.paramMap.put("targetId", String.valueOf(str2));
        new DWNetworkAdapter().sendRequest(wVar, dWRequest);
    }

    public void like(long j, long j2, String str, final ILikeAdapter.a aVar) {
        och.getInstance().like(j, j2, str, new ISocialBusinessListener() { // from class: com.taobao.android.interactive_sdk.LikeAdapter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.social.sdk.net.ISocialBusinessListener
            public void onSuccess(MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
                } else {
                    aVar.onSuccess(mtopResponse, obj);
                }
            }

            @Override // com.taobao.social.sdk.net.ISocialBusinessListener
            public void onError(ISocialBusinessListener.ErrorType errorType, String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str2, str3});
                } else {
                    aVar.onError(ILikeAdapter.ErrorType.valueOf(errorType.name()), str2, str3);
                }
            }
        });
    }
}
