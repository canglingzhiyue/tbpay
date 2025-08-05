package com.taobao.avplayer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.social.sdk.net.ISocialBusinessListener;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.och;
import tb.oci;

/* loaded from: classes6.dex */
public class ae implements com.taobao.avplayer.common.r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1970293967);
        kge.a(511622426);
    }

    @Override // com.taobao.avplayer.common.r
    public void a(long j, long j2, String str, final com.taobao.avplayer.common.s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa0b96c", new Object[]{this, new Long(j), new Long(j2), str, sVar});
        } else {
            och.getInstance().like(j, j2, str, new ISocialBusinessListener() { // from class: com.taobao.avplayer.ae.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.social.sdk.net.ISocialBusinessListener
                public void onSuccess(MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
                        return;
                    }
                    com.taobao.avplayer.common.s sVar2 = sVar;
                    if (sVar2 == null) {
                        return;
                    }
                    sVar2.a(obj);
                }

                @Override // com.taobao.social.sdk.net.ISocialBusinessListener
                public void onError(ISocialBusinessListener.ErrorType errorType, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str2, str3});
                        return;
                    }
                    com.taobao.avplayer.common.s sVar2 = sVar;
                    if (sVar2 == null) {
                        return;
                    }
                    sVar2.a(str2);
                }
            });
        }
    }

    @Override // com.taobao.avplayer.common.r
    public void a(long j, long j2, final com.taobao.avplayer.common.s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16dbb722", new Object[]{this, new Long(j), new Long(j2), sVar});
        } else {
            och.getInstance().cancelLike(j, j2, new ISocialBusinessListener() { // from class: com.taobao.avplayer.ae.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.social.sdk.net.ISocialBusinessListener
                public void onSuccess(MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
                        return;
                    }
                    com.taobao.avplayer.common.s sVar2 = sVar;
                    if (sVar2 == null) {
                        return;
                    }
                    sVar2.a(obj);
                }

                @Override // com.taobao.social.sdk.net.ISocialBusinessListener
                public void onError(ISocialBusinessListener.ErrorType errorType, String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str, str2});
                        return;
                    }
                    com.taobao.avplayer.common.s sVar2 = sVar;
                    if (sVar2 == null) {
                        return;
                    }
                    sVar2.a(str);
                }
            });
        }
    }

    @Override // com.taobao.avplayer.common.r
    public void a(long j, String str, final com.taobao.avplayer.common.s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c24de0", new Object[]{this, new Long(j), str, sVar});
        } else {
            och.getInstance().getCountAndStatus(new oci(new oci.a().setTargetIds(new String[]{str}).setLikeNamespace(j).setLikeCount(true).setLikeStatus(true)), new ISocialBusinessListener() { // from class: com.taobao.avplayer.ae.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.social.sdk.net.ISocialBusinessListener
                public void onSuccess(MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
                        return;
                    }
                    com.taobao.avplayer.common.s sVar2 = sVar;
                    if (sVar2 == null) {
                        return;
                    }
                    sVar2.a(mtopResponse.getDataJsonObject());
                }

                @Override // com.taobao.social.sdk.net.ISocialBusinessListener
                public void onError(ISocialBusinessListener.ErrorType errorType, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str2, str3});
                        return;
                    }
                    com.taobao.avplayer.common.s sVar2 = sVar;
                    if (sVar2 == null) {
                        return;
                    }
                    sVar2.a(str2);
                }
            });
        }
    }
}
