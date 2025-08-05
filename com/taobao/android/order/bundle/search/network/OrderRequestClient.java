package com.taobao.android.order.bundle.search.network;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.hyn;
import tb.kge;

/* loaded from: classes6.dex */
public class OrderRequestClient implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG;
    private static int mBizId;
    private static int retryTime;
    private RemoteBusiness mBusiness;
    private Map<String, String> mBusinessParam;
    private a mQueryListener;

    static {
        kge.a(40201691);
        kge.a(154389131);
        kge.a(-525336021);
        TAG = OrderRequestClient.class.getSimpleName();
        retryTime = 1;
        mBizId = 20;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        a aVar = this.mQueryListener;
        if (aVar != null) {
            aVar.a(mtopResponse, obj, this.mBusinessParam);
        }
        String str = "";
        if (mtopResponse != null) {
            String str2 = TAG;
            String[] strArr = new String[3];
            strArr[0] = mtopResponse.getApi();
            strArr[1] = mtopResponse.getRetCode();
            StringBuilder sb = new StringBuilder();
            sb.append("mBusinessParam:");
            Map<String, String> map = this.mBusinessParam;
            if (map != null) {
                str = map.toString();
            }
            sb.append(str);
            strArr[2] = sb.toString();
            hyn.a(str2, "onError", strArr);
            return;
        }
        String str3 = TAG;
        String[] strArr2 = new String[1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mBusinessParam:");
        Map<String, String> map2 = this.mBusinessParam;
        if (map2 != null) {
            str = map2.toString();
        }
        sb2.append(str);
        strArr2[0] = sb2.toString();
        hyn.a(str3, "onError", strArr2);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        a aVar = this.mQueryListener;
        if (aVar != null) {
            aVar.a(mtopResponse, baseOutDo, obj, this.mBusinessParam);
        }
        String str = "";
        if (mtopResponse != null) {
            String str2 = TAG;
            String[] strArr = new String[3];
            strArr[0] = mtopResponse.getApi();
            strArr[1] = mtopResponse.getRetCode();
            StringBuilder sb = new StringBuilder();
            sb.append("mBusinessParam:");
            Map<String, String> map = this.mBusinessParam;
            if (map != null) {
                str = map.toString();
            }
            sb.append(str);
            strArr[2] = sb.toString();
            hyn.a(str2, "onSuccess", strArr);
            return;
        }
        String str3 = TAG;
        String[] strArr2 = new String[1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mBusinessParam:");
        Map<String, String> map2 = this.mBusinessParam;
        if (map2 != null) {
            str = map2.toString();
        }
        sb2.append(str);
        strArr2[0] = sb2.toString();
        hyn.a(str3, "onSuccess", strArr2);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        a aVar = this.mQueryListener;
        if (aVar != null) {
            aVar.b(mtopResponse, obj, this.mBusinessParam);
        }
        String str = "";
        if (mtopResponse != null) {
            String str2 = TAG;
            String[] strArr = new String[3];
            strArr[0] = mtopResponse.getApi();
            strArr[1] = mtopResponse.getRetCode();
            if (("mBusinessParam:" + this.mBusinessParam) != null) {
                str = this.mBusinessParam.toString();
            }
            strArr[2] = str;
            hyn.a(str2, "onSystemError", strArr);
            return;
        }
        String str3 = TAG;
        String[] strArr2 = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("mBusinessParam:");
        Map<String, String> map = this.mBusinessParam;
        if (map != null) {
            str = map.toString();
        }
        sb.append(str);
        strArr2[0] = sb.toString();
        hyn.a(str3, "onSystemError", strArr2);
    }

    public void initParam(String str, String str2, String str3, Map<String, String> map, a aVar) {
        a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ceb2a0", new Object[]{this, str, str2, str3, map, aVar});
            return;
        }
        this.mQueryListener = aVar;
        this.mBusinessParam = map;
        MtopRequest a2 = b.a(str, str2, map);
        if (a2 == null && (aVar2 = this.mQueryListener) != null) {
            aVar2.a(str, str2, map);
            return;
        }
        this.mBusiness = RemoteBusiness.build(a2, str3);
        this.mBusiness.mo1340setBizId(20);
        this.mBusiness.mo1305reqMethod(MethodEnum.POST);
        this.mBusiness.mo1328setUnitStrategy("UNIT_TRADE");
        this.mBusiness.mo1339retryTime(retryTime);
        this.mBusiness.registeListener((IRemoteListener) this);
    }

    public void onStartRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbafdd3", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.mBusiness;
        if (remoteBusiness != null) {
            remoteBusiness.startRequest();
        }
        a aVar = this.mQueryListener;
        if (aVar != null) {
            aVar.a(this.mBusinessParam);
        }
        String str = TAG;
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("mBusinessParam:");
        Map<String, String> map = this.mBusinessParam;
        sb.append(map == null ? "" : map.toString());
        strArr[0] = sb.toString();
        hyn.a(str, "onStartRequest", strArr);
    }

    public void onCancelRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dddec9d", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.mBusiness;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
        if (this.mQueryListener != null) {
            this.mQueryListener = null;
        }
        Map<String, String> map = this.mBusinessParam;
        if (map == null) {
            return;
        }
        map.clear();
        this.mBusiness = null;
    }
}
