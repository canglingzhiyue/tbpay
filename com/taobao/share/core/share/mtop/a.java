package com.taobao.share.core.share.mtop;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.core.share.interceptor.b;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.ut.share.business.ShareBusiness;
import java.util.HashMap;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.kge;
import tb.nyl;
import tb.nyy;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.share.core.share.mtop.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0805a {
        void a(TBShareContent tBShareContent);
    }

    static {
        kge.a(-155876815);
    }

    public void a(final InterfaceC0805a interfaceC0805a, final TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427513aa", new Object[]{this, interfaceC0805a, tBShareContent});
        } else if (!nyl.c(tBShareContent.businessId)) {
            interfaceC0805a.a(tBShareContent);
        } else {
            e.b().a(true);
            ShareBusiness.sShareUTArgs.put(ShareBusiness.ACTIVITY_INFO_START_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
            try {
                GetSharePanelBizActivityInfoRequest getSharePanelBizActivityInfoRequest = new GetSharePanelBizActivityInfoRequest();
                getSharePanelBizActivityInfoRequest.setBizCode(tBShareContent.businessId);
                getSharePanelBizActivityInfoRequest.setTargetUrl(tBShareContent.url);
                getSharePanelBizActivityInfoRequest.setTitle(tBShareContent.description);
                HashMap hashMap = new HashMap();
                String f = e.b().f();
                if (!TextUtils.isEmpty(f)) {
                    hashMap.put("itemId", f);
                    getSharePanelBizActivityInfoRequest.setBizParams(JSON.toJSONString((Object) hashMap, true));
                }
                RemoteBusiness registeListener = ((RemoteBusiness) RemoteBusiness.build((IMTOPDataObject) getSharePanelBizActivityInfoRequest).mo1305reqMethod(MethodEnum.POST)).registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.share.core.share.mtop.TBShareActivityInfoService$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        interfaceC0805a.a(tBShareContent);
                        e.b().a(false);
                        nyy.c("TBShareActivityInfoService", mtopResponse.toString());
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        try {
                            GetBizActivityInfoResponseData getBizActivityInfoResponseData = ((GetBizActivityInfoResponse) baseOutDo).data;
                            if (getBizActivityInfoResponseData.showActivity) {
                                if (tBShareContent.extraParams == null) {
                                    tBShareContent.extraParams = new HashMap();
                                }
                                JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                                dataJsonObject.put("originBizCode", tBShareContent.businessId);
                                dataJsonObject.put("originUrl", tBShareContent.url);
                                dataJsonObject.put("originTitle", tBShareContent.description);
                                tBShareContent._shareBizActivityInfo = dataJsonObject.toString();
                                if (getBizActivityInfoResponseData.isChangeParams) {
                                    if (!TextUtils.isEmpty(tBShareContent.businessId)) {
                                        tBShareContent.originBizCode = tBShareContent.businessId;
                                    }
                                    if (!TextUtils.isEmpty(getBizActivityInfoResponseData.bizcode)) {
                                        tBShareContent.businessId = getBizActivityInfoResponseData.bizcode;
                                    }
                                    if (!TextUtils.isEmpty(getBizActivityInfoResponseData.targetUrl)) {
                                        tBShareContent.url = getBizActivityInfoResponseData.targetUrl;
                                    }
                                    if (!TextUtils.isEmpty(getBizActivityInfoResponseData.title)) {
                                        tBShareContent.description = getBizActivityInfoResponseData.title;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                th.printStackTrace();
                                nyy.c("TBShareActivityInfoService", th.toString());
                            } finally {
                                ShareBusiness.sShareUTArgs.put(ShareBusiness.ACTIVITY_INFO_END_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
                                interfaceC0805a.a(tBShareContent);
                                e.b().a(false);
                            }
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        nyy.c("TBShareActivityInfoService", mtopResponse.toString());
                        interfaceC0805a.a(tBShareContent);
                        e.b().a(false);
                    }
                });
                registeListener.mo1340setBizId(67);
                registeListener.startRequest(GetBizActivityInfoResponse.class);
                nyy.c(b.TAG, "doGetSharePanelBizActivityInfoRequest");
            } catch (Throwable th) {
                th.printStackTrace();
                nyy.c("TBShareActivityInfoService", th.toString());
                interfaceC0805a.a(tBShareContent);
                e.b().a(false);
            }
        }
    }
}
