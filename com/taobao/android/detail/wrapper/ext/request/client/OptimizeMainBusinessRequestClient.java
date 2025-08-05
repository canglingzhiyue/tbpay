package com.taobao.android.detail.wrapper.ext.request.client;

import android.app.Activity;
import android.content.Context;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import com.alibaba.android.spindle.stage.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.d;
import com.taobao.android.detail.core.performance.i;
import com.taobao.android.detail.core.request.MtopRequestClient;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.request.main.MainRequestParams;
import com.taobao.android.detail.core.utils.n;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.request.client.newmtop.f;
import com.taobao.android.trade.boost.annotations.MtopParams;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dya;
import tb.ecg;
import tb.ect;
import tb.ecu;
import tb.eip;
import tb.emu;
import tb.epo;
import tb.eps;
import tb.ept;
import tb.epu;
import tb.eqc;
import tb.fek;
import tb.fgq;
import tb.kge;

/* loaded from: classes5.dex */
public class OptimizeMainBusinessRequestClient extends MtopRequestClient<MainRequestParams, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API_NAME = "mtop.taobao.detail.getDetail";
    private static final String API_VERSION = "6.0";
    private static final String TAG;
    private static final String TEXT_BUSINESS_REQUEST_FALSE_ERROR_CODE = "business_request_error";
    private static final String TEXT_BUSINESS_REQUEST_FALSE_ERROR_MESSAGE = "business请求onError";
    private static final String TEXT_BUSINESS_REQUEST_SUCCESS_ERROR_CODE = "business_request_success";
    private static final String TEXT_BUSINESS_REQUEST_SUCCESS_ERROR_MESSAGE = "business请求成功";
    private static final String TEXT_BUSINESS_REQUEST_SYSTEM_FALSE_ERROR_CODE = "business_request_system_error";
    private static final String TEXT_BUSINESS_REQUEST_SYSTEM_FALSE_ERROR_MESSAGE = "business请求onSystemError";
    private static final String TEXT_RESPONSE = "response";
    private static boolean mIsFirstBoot;
    private boolean isFromDownGrade;
    public Context mContext;
    private MainRequestParams mMainRequestParams;
    private String mTraceId;

    public static /* synthetic */ Object ipc$super(OptimizeMainBusinessRequestClient optimizeMainBusinessRequestClient, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -743105213) {
            super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
            return null;
        } else if (hashCode == -662674828) {
            super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
            return null;
        } else if (hashCode != -460605060) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.execute();
            return null;
        }
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : "mtop.taobao.detail.getDetail";
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "6.0";
    }

    static {
        kge.a(-1753970603);
        TAG = i.a("MainRequestClient", BTags.MainRequestTag);
        mIsFirstBoot = true;
    }

    public OptimizeMainBusinessRequestClient(Context context, MainRequestParams mainRequestParams, String str, MtopRequestListener<String> mtopRequestListener, String str2) {
        super(mainRequestParams, str, mtopRequestListener);
        this.isFromDownGrade = false;
        this.mMainRequestParams = mainRequestParams;
        this.mContext = context;
        setOpenTracingContext();
        com.taobao.android.detail.sdk.utils.a.a();
        if (mIsFirstBoot) {
            this.mRemoteBusiness.mo1340setBizId(9999);
        } else {
            this.mRemoteBusiness.mo1340setBizId(9998);
        }
        if (eip.q) {
            this.mRemoteBusiness.mo1296handler(fgq.a().c());
        }
        if (eip.K) {
            this.mRemoteBusiness.mo1330supportStreamJson(true);
            com.taobao.android.detail.core.utils.i.c(d.a(TAG), "getDetail接口使用流式解析");
        }
        mIsFirstBoot = false;
        this.mTraceId = str2;
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.OptimizeMainBusinessRequestClient");
    }

    public void setFromDownGrade(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c988244", new Object[]{this, new Boolean(z)});
        } else {
            this.isFromDownGrade = z;
        }
    }

    private void setOpenTracingContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9f2b80", new Object[]{this});
            return;
        }
        b a2 = com.taobao.android.detail.core.perf.b.a(this.mContext);
        if (a2 == null) {
            return;
        }
        attachOpenTracingContext(a2.b("ProductDetail_FirstScreen"));
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : MtopParams.UnitStrategy.UNIT_TRADE.toString();
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        super.execute();
        eqc.a(this.mContext, "mMtop", "主接口Mtop时间");
        epu.a();
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        final dya y;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        if (!TextUtils.isEmpty(this.mTraceId)) {
            MainRequestParams mainRequestParams = this.mMainRequestParams;
            traceSuccessEvent(mainRequestParams != null ? mainRequestParams.mItemNumId : "", this.mTraceId, mtopResponse);
        }
        eqc.b(this.mContext, "mMtop");
        if (mtopResponse != null && mtopResponse.getMtopStat() != null && mtopResponse.getMtopStat().getNetworkStats() != null) {
            String networkStats = mtopResponse.getMtopStat().getNetworkStats().toString();
            String mtopStatistics = mtopResponse.getMtopStat().toString();
            com.taobao.android.detail.sdk.utils.a.a("network_detail", mtopStatistics);
            com.taobao.android.detail.sdk.utils.a.a("mtop_detail", networkStats);
            com.taobao.android.detail.sdk.utils.a.b();
            ept.a("netWork", mtopStatistics);
            if (mtopResponse.getHeaderFields() != null) {
                String str = TAG;
                com.taobao.android.detail.core.utils.i.d(str, "network_headers " + mtopResponse.getHeaderFields().toString());
            }
            String str2 = TAG;
            com.taobao.android.detail.core.utils.i.d(str2, "network_detail " + mtopStatistics);
            String str3 = TAG;
            com.taobao.android.detail.core.utils.i.d(str3, "mtop_detail " + networkStats);
            com.taobao.android.detail.core.utils.i.d(TAG, "mtop end");
        }
        HashMap<String, String> hashMap = null;
        String str4 = (mtopResponse == null || mtopResponse.getBytedata() == null) ? null : new String(mtopResponse.getBytedata());
        try {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("env", Integer.valueOf(EnvironmentSwitcher.a()));
            hashMap2.put("useId", epo.g().e());
            TStudioHelper a2 = TStudioHelper.a();
            String apiName = getApiName();
            String apiVersion = getApiVersion();
            if (this.mParams != 0) {
                hashMap = ((MainRequestParams) this.mParams).toMap();
            }
            a2.a(hashMap2, apiName, apiVersion, hashMap, str4);
        } catch (Throwable unused) {
        }
        MtopRequestListener mtopRequestListener = (MtopRequestListener) this.mRequestListenerRef.get();
        if (mtopRequestListener == null) {
            ecg.b(this.mContext, TAG);
            Context context = this.mContext;
            if (context != null && (context instanceof Activity) && (y = ((DetailActivity) context).y()) != null && mtopResponse != null && (mtopResponse.isApiLockedResult() || mtopResponse.isNetworkError() || mtopResponse.is41XResult())) {
                ((DetailActivity) this.mContext).A().post(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.request.client.OptimizeMainBusinessRequestClient.1
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
            com.taobao.android.detail.core.utils.i.d(TAG, "mRequestListenerRef == null");
            ecg.b(this.mContext, new Throwable("mRequestListenerRef == null"));
            z = false;
        } else if (str4 == null) {
            mtopRequestListener.a(mtopResponse);
        } else if (mtopRequestListener instanceof com.taobao.android.detail.core.request.d) {
            ((com.taobao.android.detail.core.request.d) mtopRequestListener).a(str4, mtopResponse, mtopResponse.getOriginFastJsonObject());
        } else {
            mtopRequestListener.b(str4);
        }
        n.b("finishedSuccess", z ? "hasRef" : "refDealloc");
        if (!ecu.l) {
            if (mtopResponse != null && mtopResponse.getHeaderFields() != null) {
                String str5 = TAG;
                com.taobao.android.detail.core.utils.i.a(str5, "item-detail-response-headers: " + mtopResponse.getHeaderFields().toString());
            }
            String str6 = TAG;
            com.taobao.android.detail.core.utils.i.a(str6, "item-detail-response:" + str4);
        }
        com.taobao.android.detail.core.debug.b.a(this.mContext, this.mRemoteBusiness, mtopResponse, com.taobao.android.detail.core.debug.b.REQUEST_TYPE_OLD_MTOP);
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        super.onError(i, mtopResponse, obj);
        HashMap hashMap = new HashMap();
        hashMap.put("response", mtopResponse);
        ecg.c(this.mContext, fek.TEXT_FEATURE_TYPE, TEXT_BUSINESS_REQUEST_FALSE_ERROR_CODE, TEXT_BUSINESS_REQUEST_FALSE_ERROR_MESSAGE, hashMap);
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("onError:");
        sb.append(mtopResponse != null ? mtopResponse.toString() : "null");
        com.taobao.android.detail.core.utils.i.a(str, sb.toString());
        com.taobao.android.detail.core.debug.b.a(this.mContext, this.mRemoteBusiness, mtopResponse, com.taobao.android.detail.core.debug.b.REQUEST_TYPE_OLD_MTOP);
        traceErrorEvent();
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        super.onSystemError(i, mtopResponse, obj);
        HashMap hashMap = new HashMap();
        hashMap.put("response", mtopResponse);
        ecg.c(this.mContext, fek.TEXT_FEATURE_TYPE, TEXT_BUSINESS_REQUEST_SYSTEM_FALSE_ERROR_CODE, TEXT_BUSINESS_REQUEST_SYSTEM_FALSE_ERROR_MESSAGE, hashMap);
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("onSystemError:");
        sb.append(mtopResponse != null ? mtopResponse.toString() : "null");
        com.taobao.android.detail.core.utils.i.a(str, sb.toString());
        com.taobao.android.detail.core.debug.b.a(this.mContext, this.mRemoteBusiness, mtopResponse, com.taobao.android.detail.core.debug.b.REQUEST_TYPE_OLD_MTOP);
        traceErrorEvent();
    }

    private void traceErrorEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4edad19e", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("downgrade", String.valueOf(this.isFromDownGrade));
        eps.a(this.mContext, "Page_Detail", 19999, "Page_Detail_SubInterfaceFailed", "", null, ect.a(hashMap));
    }

    private void traceSuccessEvent(String str, String str2, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ba4e5c", new Object[]{this, str, str2, mtopResponse});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("mainTraceId", str2);
        hashMap.put("subTraceId", f.a(mtopResponse));
        eps.a(this.mContext, "Page_Detail", 19999, "Page_Detail_MainErrorRetrySuccess", "", null, ect.a(hashMap));
    }
}
