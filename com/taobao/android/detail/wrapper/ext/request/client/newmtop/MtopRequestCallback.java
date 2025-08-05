package com.taobao.android.detail.wrapper.ext.request.client.newmtop;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.request.main.MainRequestParams;
import com.taobao.android.detail.core.utils.n;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.request.client.newmtop.d;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;
import tb.bgc;
import tb.dya;
import tb.ecb;
import tb.ecg;
import tb.ect;
import tb.ecu;
import tb.eip;
import tb.emu;
import tb.eps;
import tb.ept;
import tb.eqc;
import tb.fek;
import tb.god;
import tb.its;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class MtopRequestCallback implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    public Context mContext;
    public String mIntentFlag;
    public WeakReference<MtopRequestListener<String>> mListenerRef;
    public d.a mOnDowngrade;
    public MainRequestParams mParams;
    public RemoteBusiness mRemoteBusiness;
    public String mRequestID;
    public String mTTID;

    public boolean hitPrefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fb5635", new Object[]{this})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(1808315958);
        kge.a(-525336021);
        TAG = i.a("MtopRequestCallback", BTags.MainRequestTag);
    }

    public MtopRequestCallback(Context context, MainRequestParams mainRequestParams, RemoteBusiness remoteBusiness, String str, WeakReference<MtopRequestListener<String>> weakReference, String str2) {
        this.mContext = context;
        this.mParams = mainRequestParams;
        this.mRemoteBusiness = remoteBusiness;
        this.mListenerRef = weakReference;
        this.mTTID = str;
        this.mIntentFlag = str2;
        if (mainRequestParams.mExParams != null) {
            this.mRequestID = mainRequestParams.mExParams.get("NAV_TO_URL_START_UPTIME");
        }
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.newmtop.MtopRequestCallback");
    }

    public void setOnDowngrade(d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8bfeff", new Object[]{this, aVar});
        } else {
            this.mOnDowngrade = aVar;
        }
    }

    public void mtopSuccess(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("393a6b67", new Object[]{this, mtopResponse});
            return;
        }
        eqc.b(this.mContext, "mMtop");
        reportMtopStat(mtopResponse);
        String mtopData = getMtopData(mtopResponse);
        boolean callSuccessListener = callSuccessListener(mtopData, mtopResponse);
        if (!callSuccessListener) {
            mtopCallLinkBroken(mtopResponse);
            com.taobao.android.detail.core.utils.i.d(TAG, "mRequestListenerRef == null");
            ecg.b(this.mContext, new Throwable("mRequestListenerRef == null"));
        }
        n.b("finishedSuccess", callSuccessListener ? "hasRef" : "refDealloc");
        reportMtopResult(mtopData, mtopResponse);
        com.taobao.android.detail.core.debug.b.a(this.mContext, this.mRemoteBusiness, mtopResponse, com.taobao.android.detail.core.debug.b.REQUEST_TYPE_NEW_MTOP);
    }

    public void mtopError(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a037ac", new Object[]{this, mtopResponse});
            return;
        }
        n.b("error", callFailureListener(mtopResponse) ? "hasRef" : "refDealloc");
        reportMtopError(false, mtopResponse);
        com.taobao.android.detail.core.debug.b.a(this.mContext, this.mRemoteBusiness, mtopResponse, com.taobao.android.detail.core.debug.b.REQUEST_TYPE_NEW_MTOP);
    }

    public void mtopSystemError(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581d3fd", new Object[]{this, mtopResponse});
            return;
        }
        n.b("systemError", callFailureListener(mtopResponse) ? "hasRef" : "refDealloc");
        reportMtopError(true, mtopResponse);
        com.taobao.android.detail.core.debug.b.a(this.mContext, this.mRemoteBusiness, mtopResponse, com.taobao.android.detail.core.debug.b.REQUEST_TYPE_NEW_MTOP);
    }

    private boolean callSuccessListener(String str, MtopResponse mtopResponse) {
        d.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3745eb3", new Object[]{this, str, mtopResponse})).booleanValue();
        }
        MtopRequestListener<String> mtopRequestListener = this.mListenerRef.get();
        if (mtopRequestListener == null) {
            ecg.b(this.mContext, TAG);
            return false;
        }
        if (str == null) {
            if (this.mOnDowngrade != null && god.l) {
                com.taobao.android.detail.core.utils.i.a(i.a(TAG, BTags.DowngradeTag), "mtopSuccess data empty onDowngrade");
                this.mOnDowngrade.a(this.mContext, this.mParams, this.mTTID, mtopRequestListener, "");
                HashMap hashMap = new HashMap();
                hashMap.put("feature", "dataIsNull");
                eps.a(this.mContext, "Page_Detail", 19999, "Page_Detail_MainInterfaceServerDegrade", "", null, ect.a(hashMap));
            } else {
                if (mtopResponse != null && !mtopResponse.isApiLockedResult() && !mtopResponse.isNetworkError() && !mtopResponse.is41XResult()) {
                    mtopResponse.setRetCode("ANDROID_SYS_NETWORK_ERROR");
                }
                com.taobao.android.detail.core.utils.i.a(TAG, "mtopSuccess data empty onFailure");
                mtopRequestListener.a(mtopResponse);
            }
        } else if (god.l) {
            JSONObject originJsonObject = getOriginJsonObject(mtopResponse, str);
            boolean isDegradeToErrorPage = isDegradeToErrorPage(originJsonObject);
            boolean isDegradeToBaseDetail = isDegradeToBaseDetail(originJsonObject);
            boolean isDowngradeToOldMtop = isDowngradeToOldMtop(originJsonObject);
            if (isDegradeToErrorPage || isDegradeToBaseDetail) {
                handleSuccess(str, mtopResponse, mtopRequestListener, originJsonObject);
                return true;
            } else if (isDowngradeToOldMtop && (aVar = this.mOnDowngrade) != null) {
                aVar.a(this.mContext, this.mParams, this.mTTID, mtopRequestListener, "");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("feature", "degradeToOldMtop");
                eps.a(this.mContext, "Page_Detail", 19999, "Page_Detail_MainInterfaceServerDegrade", "", null, ect.a(hashMap2));
            } else {
                handleSuccess(str, mtopResponse, mtopRequestListener, originJsonObject);
            }
        } else {
            handleDowngrade(str, mtopResponse, mtopRequestListener);
        }
        return true;
    }

    private void handleSuccess(String str, MtopResponse mtopResponse, MtopRequestListener<String> mtopRequestListener, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a830baa6", new Object[]{this, str, mtopResponse, mtopRequestListener, jSONObject});
        } else if (mtopRequestListener instanceof com.taobao.android.detail.core.request.d) {
            ((com.taobao.android.detail.core.request.d) mtopRequestListener).a(str, mtopResponse, jSONObject);
        } else {
            mtopRequestListener.b(str);
        }
    }

    private JSONObject getOriginJsonObject(MtopResponse mtopResponse, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("551bc8f9", new Object[]{this, mtopResponse, str});
        }
        if (mtopResponse == null) {
            return null;
        }
        try {
            if (eip.K) {
                jSONObject = mtopResponse.getOriginFastJsonObject();
                com.taobao.android.detail.core.utils.i.c(TAG, "主接口数据使用json流式解析");
            } else {
                jSONObject = null;
            }
            if (jSONObject == null) {
                JSONObject parseObject = JSONObject.parseObject(str);
                com.taobao.android.detail.core.utils.i.c(TAG, "json解析数据为空，直接parseObject获取json");
                return parseObject;
            }
            com.taobao.android.detail.core.utils.i.c(TAG, "主接口数据使用json流式解析成功");
            return jSONObject;
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a(TAG, "获取json数据异常", e);
            return null;
        }
    }

    private void handleDowngrade(String str, MtopResponse mtopResponse, MtopRequestListener<String> mtopRequestListener) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923976fc", new Object[]{this, str, mtopResponse, mtopRequestListener});
            return;
        }
        try {
            JSONObject originJsonObject = getOriginJsonObject(mtopResponse, str);
            if (originJsonObject == null) {
                if (callFailureListener(mtopResponse)) {
                    return;
                }
                mtopRequestListener.a(mtopResponse);
                return;
            }
            JSONObject jSONObject = originJsonObject.getJSONObject("data");
            if (jSONObject != null && !jSONObject.isEmpty()) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("feature");
                if (jSONObject2 != null) {
                    boolean parseBoolean = Boolean.parseBoolean(jSONObject2.getString("degradeToOldMtop"));
                    boolean parseBoolean2 = Boolean.parseBoolean(jSONObject2.getString("degradeToErrorPage"));
                    z = Boolean.parseBoolean(jSONObject2.getString("degradeToBaseDetail"));
                    z2 = parseBoolean;
                    z3 = parseBoolean2;
                } else {
                    z = false;
                    z2 = false;
                }
                if (!z3 && !z) {
                    if (z2 && this.mOnDowngrade != null) {
                        this.mOnDowngrade.a(this.mContext, this.mParams, this.mTTID, mtopRequestListener, "");
                        HashMap hashMap = new HashMap();
                        hashMap.put("feature", "degradeToOldMtop");
                        eps.a(this.mContext, "Page_Detail", 19999, "Page_Detail_MainInterfaceServerDegrade", "", null, ect.a(hashMap));
                        return;
                    }
                    handleSuccess(str, mtopResponse, mtopRequestListener, originJsonObject);
                    return;
                }
                handleSuccess(str, mtopResponse, mtopRequestListener, originJsonObject);
                return;
            }
            if (callFailureListener(mtopResponse)) {
                return;
            }
            mtopRequestListener.a(mtopResponse);
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a(TAG, "mtopSuccess data downgrade parser error", e);
            if (callFailureListener(mtopResponse)) {
                return;
            }
            mtopRequestListener.a(mtopResponse);
        }
    }

    private boolean isDegradeToErrorPage(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e32b4fdd", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            if (jSONObject3 != null && !jSONObject3.isEmpty() && (jSONObject2 = jSONObject3.getJSONObject("feature")) != null) {
                return Boolean.parseBoolean(jSONObject2.getString("degradeToErrorPage"));
            }
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a(i.a(TAG, BTags.DowngradeTag), "isDegradeToErrorPage", e);
        }
        return false;
    }

    private boolean isDegradeToBaseDetail(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0dc4404", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            if (jSONObject3 != null && !jSONObject3.isEmpty() && (jSONObject2 = jSONObject3.getJSONObject("feature")) != null) {
                return Boolean.parseBoolean(jSONObject2.getString("degradeToBaseDetail"));
            }
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a(i.a(TAG, BTags.DowngradeTag), "degradeToBaseDetail", e);
        }
        return false;
    }

    private boolean isDowngradeToOldMtop(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("713b2d84", new Object[]{this, jSONObject})).booleanValue();
        }
        String str = "emptyItemId";
        if (jSONObject == null) {
            if (!TextUtils.isEmpty("data json parse error")) {
                String str2 = this.mParams.mItemNumId;
                if (TextUtils.isEmpty(str2)) {
                    str2 = str;
                }
                ecb.d(this.mContext, str2, "data json parse error");
                com.taobao.android.detail.core.utils.i.a(i.a(TAG, BTags.DowngradeTag), "isDowngradeToOldMtop downgradeReason data json parse error");
            }
            return true;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("feature");
                if (jSONObject3 == null) {
                    if (!TextUtils.isEmpty("")) {
                        String str3 = this.mParams.mItemNumId;
                        if (TextUtils.isEmpty(str3)) {
                            str3 = str;
                        }
                        ecb.d(this.mContext, str3, "");
                        com.taobao.android.detail.core.utils.i.a(i.a(TAG, BTags.DowngradeTag), "isDowngradeToOldMtop downgradeReason ");
                    }
                    return false;
                }
                boolean parseBoolean = Boolean.parseBoolean(jSONObject3.getString("degradeToOldMtop"));
                if (!TextUtils.isEmpty("")) {
                    String str4 = this.mParams.mItemNumId;
                    if (!TextUtils.isEmpty(str4)) {
                        str = str4;
                    }
                    ecb.d(this.mContext, str, "");
                    com.taobao.android.detail.core.utils.i.a(i.a(TAG, BTags.DowngradeTag), "isDowngradeToOldMtop downgradeReason ");
                }
                return parseBoolean;
            }
            if (!TextUtils.isEmpty("data node is empty")) {
                String str5 = this.mParams.mItemNumId;
                if (TextUtils.isEmpty(str5)) {
                    str5 = str;
                }
                ecb.d(this.mContext, str5, "data node is empty");
                com.taobao.android.detail.core.utils.i.a(i.a(TAG, BTags.DowngradeTag), "isDowngradeToOldMtop downgradeReason data node is empty");
            }
            return true;
        } catch (Throwable th) {
            try {
                String str6 = "exception: " + th.toString();
                if (!TextUtils.isEmpty(str6)) {
                    String str7 = this.mParams.mItemNumId;
                    if (TextUtils.isEmpty(str7)) {
                        str7 = str;
                    }
                    ecb.d(this.mContext, str7, str6);
                    com.taobao.android.detail.core.utils.i.a(i.a(TAG, BTags.DowngradeTag), "isDowngradeToOldMtop downgradeReason " + str6);
                }
                return true;
            } catch (Throwable th2) {
                if (!TextUtils.isEmpty("")) {
                    String str8 = this.mParams.mItemNumId;
                    if (!TextUtils.isEmpty(str8)) {
                        str = str8;
                    }
                    ecb.d(this.mContext, str, "");
                    com.taobao.android.detail.core.utils.i.a(i.a(TAG, BTags.DowngradeTag), "isDowngradeToOldMtop downgradeReason ");
                }
                throw th2;
            }
        }
    }

    private void reportMtopStat(MtopResponse mtopResponse) {
        MainRequestParams mainRequestParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0c95c1c", new Object[]{this, mtopResponse});
        } else if (mtopResponse == null || mtopResponse.getMtopStat() == null || mtopResponse.getMtopStat().getNetworkStats() == null) {
        } else {
            String networkStats = mtopResponse.getMtopStat().getNetworkStats().toString();
            MtopStatistics mtopStat = mtopResponse.getMtopStat();
            String mtopStatistics = mtopStat.toString();
            com.taobao.android.detail.sdk.utils.a.a("network_detail", mtopStatistics);
            com.taobao.android.detail.sdk.utils.a.a("mtop_detail", networkStats);
            com.taobao.android.detail.sdk.utils.a.b();
            ept.a("netWork", mtopStatistics);
            if (mtopResponse.getHeaderFields() != null) {
                String str = TAG;
                com.taobao.android.detail.core.utils.i.d(str, "network_headers " + mtopResponse.getHeaderFields().toString());
            }
            String str2 = TAG;
            com.taobao.android.detail.core.utils.i.d(str2, "new mtop end, network_detail " + mtopStatistics + ", mtop_detail " + networkStats);
            ecb.a(this.mContext, this.mParams.mItemNumId);
            if (mtopStat.getRbStatData().mtopReqTime <= 10000 || (mainRequestParams = this.mParams) == null) {
                return;
            }
            ecb.a(this.mContext, mainRequestParams.mItemNumId, mtopStatistics);
        }
    }

    private String getMtopData(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cebab8c", new Object[]{this, mtopResponse});
        }
        if (mtopResponse != null && mtopResponse.getBytedata() != null) {
            return new String(mtopResponse.getBytedata());
        }
        return null;
    }

    private void mtopCallLinkBroken(MtopResponse mtopResponse) {
        DetailActivity detailActivity;
        final dya y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efcbfc21", new Object[]{this, mtopResponse});
            return;
        }
        Context context = this.mContext;
        if (!(context instanceof DetailActivity) || (y = (detailActivity = (DetailActivity) context).y()) == null || mtopResponse == null) {
            return;
        }
        if (!mtopResponse.isApiLockedResult() && !mtopResponse.isNetworkError() && !mtopResponse.is41XResult()) {
            return;
        }
        detailActivity.A().post(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.request.client.newmtop.MtopRequestCallback.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    y.s();
                }
            }
        });
    }

    private boolean callFailureListener(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d372cb0", new Object[]{this, mtopResponse})).booleanValue();
        }
        MtopRequestListener<String> mtopRequestListener = this.mListenerRef.get();
        if (mtopRequestListener == null) {
            return false;
        }
        if (isNetErrorToErrorPage(mtopResponse)) {
            mtopRequestListener.a(mtopResponse);
            return true;
        }
        eps.a(this.mContext, "Page_Detail", 19999, "Page_Detail_MainInterfaceFailed", "", null, new String[0]);
        if (this.mOnDowngrade != null && god.l) {
            this.mOnDowngrade.a(this.mContext, this.mParams, this.mTTID, mtopRequestListener, f.a(mtopResponse));
            return true;
        }
        if (mtopResponse != null && !mtopResponse.isApiLockedResult() && !mtopResponse.isNetworkError() && !mtopResponse.is41XResult()) {
            mtopResponse.setRetCode("ANDROID_SYS_NETWORK_ERROR");
        }
        mtopRequestListener.a(mtopResponse);
        return true;
    }

    private boolean isNetErrorToErrorPage(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24b56cd7", new Object[]{this, mtopResponse})).booleanValue();
        }
        if (mtopResponse == null) {
            return false;
        }
        return (499 == mtopResponse.getResponseCode() || mtopResponse.isApiLockedResult() || its.TRAFFIC_LIMIT_STATUS.equals(mtopResponse.getRetCode())) && god.s;
    }

    private void reportMtopError(boolean z, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6709be6", new Object[]{this, new Boolean(z), mtopResponse});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("requestParam", this.mParams);
        ecg.a(this.mContext, mtopResponse, hashMap);
        bgc.a("detail", mtopResponse);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(InputFrame3.TYPE_RESPONSE, mtopResponse);
        ecg.c(this.mContext, fek.TEXT_FEATURE_TYPE, z ? "new_business_request_system_error" : "new_business_request_error", z ? "new_business请求onSystemError" : "new_business请求onError", hashMap2);
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("onError:");
        sb.append(mtopResponse != null ? mtopResponse.toString() : "null");
        com.taobao.android.detail.core.utils.i.a(str, sb.toString());
    }

    private void reportMtopResult(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f13bf6f", new Object[]{this, str, mtopResponse});
        } else if (ecu.l) {
        } else {
            if (mtopResponse != null && mtopResponse.getHeaderFields() != null) {
                String str2 = TAG;
                com.taobao.android.detail.core.utils.i.a(str2, "item-detail-response-headers:" + mtopResponse.getHeaderFields().toString());
            }
            String str3 = TAG;
            com.taobao.android.detail.core.utils.i.a(str3, "item-detail-response:" + str);
        }
    }
}
