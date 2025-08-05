package com.taobao.social.sdk.net;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.social.sdk.net.ISocialBusinessListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<Integer, RemoteBusiness> f19702a = new HashMap<>();
    private AtomicInteger b = new AtomicInteger();

    static {
        kge.a(879536763);
    }

    public int getBusinessId(RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e4ed30b", new Object[]{this, remoteBusiness})).intValue();
        }
        if (remoteBusiness != null && (remoteBusiness.requestContext instanceof a)) {
            return ((a) remoteBusiness.requestContext).businessId;
        }
        return -1;
    }

    public RemoteBusiness createRemoteBusiness(MtopRequest mtopRequest, ISocialBusinessListener<?> iSocialBusinessListener, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("50dcf7fe", new Object[]{this, mtopRequest, iSocialBusinessListener, hashMap});
        }
        if (mtopRequest == null) {
            return null;
        }
        a aVar = new a();
        aVar.setRequestParams(hashMap);
        aVar.businessId = this.b.getAndIncrement();
        aVar.listener = iSocialBusinessListener;
        mtopRequest.setData(JSONObject.toJSONString(mtopRequest.dataParams));
        mtopRequest.dataParams = null;
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        build.mo1305reqMethod(MethodEnum.POST);
        build.mo1339retryTime(1);
        build.requestContext = aVar;
        this.f19702a.put(Integer.valueOf(aVar.businessId), build);
        return build;
    }

    public <T> void notifyListener(Object obj, boolean z, MtopResponse mtopResponse, T t, String str, String str2) {
        ISocialBusinessListener<?> iSocialBusinessListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f70fc9", new Object[]{this, obj, new Boolean(z), mtopResponse, t, str, str2});
        } else if (!(obj instanceof a)) {
        } else {
            a aVar = (a) obj;
            if (this.f19702a.remove(Integer.valueOf(aVar.businessId)) == null || (iSocialBusinessListener = aVar.listener) == null) {
                return;
            }
            if (z) {
                iSocialBusinessListener.onSuccess(mtopResponse, t);
            } else {
                iSocialBusinessListener.onError(ISocialBusinessListener.ErrorType.ERROR_OTHER, str, str2);
            }
        }
    }
}
