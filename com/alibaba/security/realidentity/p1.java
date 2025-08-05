package com.alibaba.security.realidentity;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.common.http.MTopManager;
import com.alibaba.security.common.http.interfaces.IHttpRequest;
import com.alibaba.security.common.http.interfaces.OnHttpCallBack;
import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.realidentity.biz.config.DegradeConfig;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.dynamic.DynamicHttpRequest;
import com.alibaba.security.realidentity.biz.dynamic.DynamicHttpResponse;
import com.alibaba.security.realidentity.biz.dynamic.model.DynamicResponse;
import com.alibaba.security.realidentity.biz.dynamic.model.PureWirelessConfHttpResponse;
import com.alibaba.security.realidentity.biz.entity.ClientInfo;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.sft;

/* loaded from: classes3.dex */
public class p1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String d = "p1";
    public static final String e = "1";
    public static final String h = "BC";

    /* renamed from: a  reason: collision with root package name */
    public final Context f3484a;
    public final IHttpRequest b;
    public final c4 c;
    public static final String g = "BASIC";
    public static final String i = "CTID";
    public static final String j = "SC";
    public static final String f = "H5_DOMAIN";
    public static final String k = "WUKONG";
    public static final String l = "OSS_SDK";
    public static final String[] m = {g, i, j, f, k, l};

    /* loaded from: classes3.dex */
    public class a implements OnHttpCallBack<DynamicHttpResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DynamicHttpRequest f3485a;
        public final /* synthetic */ long b;
        public final /* synthetic */ RPBizConfig c;
        public final /* synthetic */ q1 d;

        public a(DynamicHttpRequest dynamicHttpRequest, long j, RPBizConfig rPBizConfig, q1 q1Var) {
            this.f3485a = dynamicHttpRequest;
            this.b = j;
            this.c = rPBizConfig;
            this.d = q1Var;
        }

        public void a(HttpRequest httpRequest, DynamicHttpResponse dynamicHttpResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc9374a3", new Object[]{this, httpRequest, dynamicHttpResponse});
            } else {
                p1.a(p1.this, p1.a(p1.this, this.f3485a, dynamicHttpResponse, this.b, this.c), this.c, this.d);
            }
        }

        @Override // com.alibaba.security.common.http.interfaces.OnHttpCallBack
        public void onFail(HttpRequest httpRequest, Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7806fd23", new Object[]{this, httpRequest, exc});
                return;
            }
            com.alibaba.security.realidentity.a.a(p1.a(), "upload dynamic fail: ", exc);
            p1.a(p1.this, this.f3485a, "response is error", "onNetError:" + d.a(exc), null, this.b, this.c);
            q1 q1Var = this.d;
            if (q1Var == null) {
                return;
            }
            q1Var.onRequestEnd(false);
        }

        @Override // com.alibaba.security.common.http.interfaces.OnHttpCallBack
        public /* synthetic */ void onSuccess(HttpRequest httpRequest, DynamicHttpResponse dynamicHttpResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66498457", new Object[]{this, httpRequest, dynamicHttpResponse});
            } else {
                a(httpRequest, dynamicHttpResponse);
            }
        }
    }

    public p1(Context context, c4 c4Var) {
        this.f3484a = context;
        this.c = c4Var;
        this.b = new MTopManager(context);
    }

    public static /* synthetic */ DynamicResponse a(p1 p1Var, DynamicHttpRequest dynamicHttpRequest, DynamicHttpResponse dynamicHttpResponse, long j2, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DynamicResponse) ipChange.ipc$dispatch("ba98092d", new Object[]{p1Var, dynamicHttpRequest, dynamicHttpResponse, new Long(j2), rPBizConfig}) : p1Var.a(dynamicHttpRequest, dynamicHttpResponse, j2, rPBizConfig);
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            Map map = (Map) b.b(str, Map.class);
            if (map != null && !map.isEmpty() && map.containsKey("closeBeautyEffect")) {
                return map.get("closeBeautyEffect").toString().equals("1");
            }
            return false;
        } catch (Exception unused) {
        }
        return false;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            Map map = (Map) b.b(str, Map.class);
            if (map != null && !map.isEmpty() && map.containsKey("isOpen")) {
                return map.get("isOpen").toString().equals("1");
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static /* synthetic */ void a(p1 p1Var, DynamicResponse dynamicResponse, RPBizConfig rPBizConfig, q1 q1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e02abef5", new Object[]{p1Var, dynamicResponse, rPBizConfig, q1Var});
        } else {
            p1Var.a(dynamicResponse, rPBizConfig, q1Var);
        }
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : d;
    }

    public static /* synthetic */ void a(p1 p1Var, DynamicHttpRequest dynamicHttpRequest, String str, Object obj, DynamicResponse dynamicResponse, long j2, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0ce67d", new Object[]{p1Var, dynamicHttpRequest, str, obj, dynamicResponse, new Long(j2), rPBizConfig});
        } else {
            p1Var.a(dynamicHttpRequest, str, obj, dynamicResponse, j2, rPBizConfig);
        }
    }

    private DynamicHttpRequest a(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicHttpRequest) ipChange.ipc$dispatch("7ee103a9", new Object[]{this, list, str});
        }
        String a2 = c.a(r.a().a(this.f3484a, str));
        ClientInfo clientInfo = new ClientInfo(this.f3484a);
        clientInfo.setVersionTag(a2);
        DynamicHttpRequest dynamicHttpRequest = new DynamicHttpRequest(str, b.a(clientInfo));
        dynamicHttpRequest.keys = b.a(list);
        return dynamicHttpRequest;
    }

    private DynamicResponse a(DynamicHttpRequest dynamicHttpRequest, DynamicHttpResponse dynamicHttpResponse, long j2, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicResponse) ipChange.ipc$dispatch("1e421da4", new Object[]{this, dynamicHttpRequest, dynamicHttpResponse, new Long(j2), rPBizConfig});
        }
        if (dynamicHttpResponse != null && dynamicHttpResponse.isSuccessful()) {
            DynamicResponse dynamicResponse = (DynamicResponse) b.a(a(dynamicHttpResponse.result), DynamicResponse.class, true);
            a(dynamicHttpRequest, "success", dynamicHttpResponse, dynamicResponse, j2, rPBizConfig);
            return dynamicResponse;
        }
        a(dynamicHttpRequest, sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR, dynamicHttpResponse, null, j2, rPBizConfig);
        return null;
    }

    private String a(DynamicResponse dynamicResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("512e5bb0", new Object[]{this, dynamicResponse});
        }
        if (dynamicResponse == null) {
            return null;
        }
        return dynamicResponse.H5_DOMAIN;
    }

    public void a(RPBizConfig rPBizConfig, q1 q1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0f15ad6", new Object[]{this, rPBizConfig, q1Var});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(m));
        DynamicHttpRequest a2 = a(arrayList, rPBizConfig.getBasicsConfig().verifyToken);
        a(a2, rPBizConfig);
        this.b.asyncRequest(a2, new a(a2, currentTimeMillis, rPBizConfig, q1Var));
    }

    private void a(DynamicResponse dynamicResponse, RPBizConfig rPBizConfig, q1 q1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde6e55e", new Object[]{this, dynamicResponse, rPBizConfig, q1Var});
        } else if (dynamicResponse == null) {
            if (q1Var == null) {
                return;
            }
            q1Var.onRequestEnd(false);
        } else {
            String a2 = a(dynamicResponse);
            if (!TextUtils.isEmpty(a2)) {
                rPBizConfig.setDynamicWebUrl(a2);
            }
            rPBizConfig.setScConfig(dynamicResponse.SC);
            rPBizConfig.setCtidConfigResponse(dynamicResponse.CTID);
            rPBizConfig.setWukongConfig(dynamicResponse.WUKONG);
            rPBizConfig.setOssConfig(dynamicResponse.OSS_SDK);
            rPBizConfig.getBasicsConfig().modelInfo = dynamicResponse.BASIC.rpsdkModelInfo;
            a(rPBizConfig.getDegradeConfig(), dynamicResponse.BASIC);
            if (q1Var == null) {
                return;
            }
            q1Var.onRequestEnd(true);
        }
    }

    private void a(DegradeConfig degradeConfig, PureWirelessConfHttpResponse pureWirelessConfHttpResponse) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226d51c0", new Object[]{this, degradeConfig, pureWirelessConfHttpResponse});
            return;
        }
        degradeConfig.isUseLiteVm = TextUtils.isEmpty(pureWirelessConfHttpResponse.rpsdkUseLiteVM) || "1".equals(pureWirelessConfHttpResponse.rpsdkUseLiteVM);
        degradeConfig.isUseHwMagicWindow = TextUtils.isEmpty(pureWirelessConfHttpResponse.rpsdkUseHwMagicWindow) || "1".equals(pureWirelessConfHttpResponse.rpsdkUseHwMagicWindow);
        degradeConfig.isHonorMagicWindowOff = TextUtils.isEmpty(pureWirelessConfHttpResponse.rpsdkHonorMagicWinOff) || "1".equals(pureWirelessConfHttpResponse.rpsdkHonorMagicWinOff);
        degradeConfig.setUploadTimeOut(pureWirelessConfHttpResponse.rpArupTimeOut);
        String str = pureWirelessConfHttpResponse.rpsdkCollectLocalImage;
        degradeConfig.needCollectLocalImage = str == null || "1".equals(str);
        degradeConfig.isUseNewCameraSwitchPreview = TextUtils.isEmpty(pureWirelessConfHttpResponse.rpCameraPreview) || "1".equals(pureWirelessConfHttpResponse.rpCameraPreview);
        degradeConfig.isForceCameraSizeChange = TextUtils.isEmpty(pureWirelessConfHttpResponse.rpsdkCameraSizeChange) || "1".equals(pureWirelessConfHttpResponse.rpsdkCameraSizeChange);
        degradeConfig.isBeautyOpen = b(pureWirelessConfHttpResponse.rpsdkBiometricsBeautyEffect);
        degradeConfig.isDazzleBioOpen = c(pureWirelessConfHttpResponse.rpsdkColorfulBioSwitch);
        degradeConfig.isWukongEnabled = TextUtils.isEmpty(pureWirelessConfHttpResponse.rpsdkWukongSwitch) || "1".equals(pureWirelessConfHttpResponse.rpsdkWukongSwitch);
        degradeConfig.setWukongCallbackTimeout(pureWirelessConfHttpResponse.rpsdkWukongCallbackTimeout);
        degradeConfig.isUseLosslessCertImage = TextUtils.isEmpty(pureWirelessConfHttpResponse.rpsdkUseLosslessCertImage) || "1".equals(pureWirelessConfHttpResponse.rpsdkUseLosslessCertImage);
        if (!TextUtils.isEmpty(pureWirelessConfHttpResponse.rpsdkCtidRetrySwitch) && !"1".equals(pureWirelessConfHttpResponse.rpsdkCtidRetrySwitch)) {
            z = false;
        }
        degradeConfig.isCtidRetrySwitchOn = z;
    }

    private void a(HttpRequest httpRequest, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e03912b", new Object[]{this, httpRequest, rPBizConfig});
        } else {
            this.c.a(rPBizConfig.getBasicsConfig().verifyToken, TrackLog.createDynamicBegin("", b.a(httpRequest), ""));
        }
    }

    private void a(DynamicHttpRequest dynamicHttpRequest, String str, Object obj, DynamicResponse dynamicResponse, long j2, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f845534", new Object[]{this, dynamicHttpRequest, str, obj, dynamicResponse, new Long(j2), rPBizConfig});
            return;
        }
        TrackLog createDynamicEnd = TrackLog.createDynamicEnd(str, b.a(dynamicHttpRequest), dynamicResponse == null ? b.a(obj) : b.a(dynamicResponse));
        createDynamicEnd.setRt(System.currentTimeMillis() - j2);
        this.c.a(rPBizConfig.getBasicsConfig().verifyToken, createDynamicEnd);
    }

    private String a(String str) {
        byte[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (a2 = c.a(str)) == null) {
            return null;
        }
        String a3 = r.a().a(a2);
        if (!TextUtils.isEmpty(a3)) {
            return a3;
        }
        return null;
    }
}
