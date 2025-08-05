package com.alibaba.security.realidentity.biz.biometrics;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.security.common.http.MTopManager;
import com.alibaba.security.common.http.interfaces.OnHttpCallBack;
import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.realidentity.RPResult;
import com.alibaba.security.realidentity.algo.wrapper.entity.params.LivenessInnerConfig;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ALBiometricsResult;
import com.alibaba.security.realidentity.biz.RPBusinessHeadParams;
import com.alibaba.security.realidentity.biz.base.chain.BusinessHeadParams;
import com.alibaba.security.realidentity.biz.biometrics.model.RiskActionMaterial;
import com.alibaba.security.realidentity.biz.bucket.BucketParams;
import com.alibaba.security.realidentity.biz.config.BiometricsConfig;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.start.StartHttpResponse;
import com.alibaba.security.realidentity.biz.start.model.StartExtraInfo;
import com.alibaba.security.realidentity.biz.start.model.StepItem;
import com.alibaba.security.realidentity.biz.start.model.StepType;
import com.alibaba.security.realidentity.d;
import com.alibaba.security.realidentity.e2;
import com.alibaba.security.realidentity.g2;
import com.alibaba.security.realidentity.h1;
import com.alibaba.security.realidentity.k0;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.v1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.common.util.SymbolExpUtil;

/* loaded from: classes3.dex */
public class BiometricsBucketParams extends BucketParams {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String l = "BiometricsBucketParams";
    public v1 e;
    public boolean f;
    public final Handler g;
    public ALBiometricsResult h;
    public boolean i;
    public ALBiometricsCallBackBean j;
    public final MTopManager k;

    /* loaded from: classes3.dex */
    public static class ALBiometricsCallBackBean implements Serializable {
        public int errorCode;
        public String errorMsg;
        public byte[] faceImage;
        public int faceImageHeight;
        public int faceImageWidth;
    }

    /* loaded from: classes3.dex */
    public class a implements OnHttpCallBack<EventHttpResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k0 f3368a;

        public a(k0 k0Var) {
            this.f3368a = k0Var;
        }

        public void a(HttpRequest httpRequest, EventHttpResponse eventHttpResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d802c2e6", new Object[]{this, httpRequest, eventHttpResponse});
            } else if (eventHttpResponse == null) {
                BiometricsBucketParams.a(BiometricsBucketParams.this, e2.A, true, String.valueOf((int) e2.A), "Null response");
                BiometricsBucketParams.a(BiometricsBucketParams.this, this.f3368a, false);
            } else if (!eventHttpResponse.isSuccessful()) {
                BiometricsBucketParams.a(BiometricsBucketParams.this, e2.A, true, eventHttpResponse.retCode, eventHttpResponse.retMsg);
                BiometricsBucketParams.a(BiometricsBucketParams.this, this.f3368a, false);
            } else {
                boolean booleanValue = BiometricsBucketParams.a(BiometricsBucketParams.this, eventHttpResponse.result.get("verifyLimitedFlag"), true).booleanValue();
                BiometricsBucketParams.a(BiometricsBucketParams.this, 0, false, eventHttpResponse.retCode, eventHttpResponse.retMsg);
                BiometricsBucketParams.a(BiometricsBucketParams.this, this.f3368a, !booleanValue);
            }
        }

        @Override // com.alibaba.security.common.http.interfaces.OnHttpCallBack
        public void onFail(HttpRequest httpRequest, Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7806fd23", new Object[]{this, httpRequest, exc});
                return;
            }
            BiometricsBucketParams.a(BiometricsBucketParams.this, e2.A, true, String.valueOf((int) e2.A), d.a(exc));
            BiometricsBucketParams.a(BiometricsBucketParams.this, this.f3368a, false);
        }

        @Override // com.alibaba.security.common.http.interfaces.OnHttpCallBack
        public /* synthetic */ void onSuccess(HttpRequest httpRequest, EventHttpResponse eventHttpResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66498457", new Object[]{this, httpRequest, eventHttpResponse});
            } else {
                a(httpRequest, eventHttpResponse);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k0 f3369a;
        public final /* synthetic */ boolean b;

        public b(k0 k0Var, boolean z) {
            this.f3369a = k0Var;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            k0 k0Var = this.f3369a;
            if (k0Var == null) {
                return;
            }
            k0Var.a(!this.b ? 1 : 0);
        }
    }

    public BiometricsBucketParams(Context context, RPBizConfig rPBizConfig) {
        super(context, rPBizConfig);
        this.e = null;
        this.f = false;
        this.i = false;
        this.k = new MTopManager(context);
        this.g = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ void a(BiometricsBucketParams biometricsBucketParams, int i, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e67ec0", new Object[]{biometricsBucketParams, new Integer(i), new Boolean(z), str, str2});
        } else {
            biometricsBucketParams.a(i, z, str, str2);
        }
    }

    private String b(List<StepItem> list) {
        StepItem.JsonAssist jsonAssistBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2162506", new Object[]{this, list});
        }
        StepItem a2 = a(list);
        if (a2 != null && (jsonAssistBean = a2.getJsonAssistBean()) != null) {
            return jsonAssistBean.bioColorfulConf;
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(BiometricsBucketParams biometricsBucketParams, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.realidentity.biz.bucket.BucketParams
    public HttpRequest a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpRequest) ipChange.ipc$dispatch("1def818d", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.security.realidentity.biz.bucket.BucketParams
    public BucketParams.ErrorCode c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BucketParams.ErrorCode) ipChange.ipc$dispatch("838b0e76", new Object[]{this});
        }
        ALBiometricsCallBackBean aLBiometricsCallBackBean = this.j;
        if (aLBiometricsCallBackBean == null) {
            return new BucketParams.ErrorCode(RPResult.AUDIT_NOT, String.valueOf(-10000), "biometrics bean is null", -10000);
        }
        int i = aLBiometricsCallBackBean.errorCode;
        if (i == 0) {
            RPResult rPResult = RPResult.AUDIT_PASS;
            String valueOf = String.valueOf(i);
            ALBiometricsCallBackBean aLBiometricsCallBackBean2 = this.j;
            return new BucketParams.ErrorCode(rPResult, valueOf, aLBiometricsCallBackBean2.errorMsg, aLBiometricsCallBackBean2.errorCode);
        }
        RPResult rPResult2 = RPResult.AUDIT_NOT;
        String valueOf2 = String.valueOf(i);
        ALBiometricsCallBackBean aLBiometricsCallBackBean3 = this.j;
        return new BucketParams.ErrorCode(rPResult2, valueOf2, aLBiometricsCallBackBean3.errorMsg, aLBiometricsCallBackBean3.errorCode);
    }

    public static /* synthetic */ void a(BiometricsBucketParams biometricsBucketParams, k0 k0Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d40ecb4", new Object[]{biometricsBucketParams, k0Var, new Boolean(z)});
        } else {
            biometricsBucketParams.a(k0Var, z);
        }
    }

    public static /* synthetic */ Boolean a(BiometricsBucketParams biometricsBucketParams, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("488dc89a", new Object[]{biometricsBucketParams, obj, new Boolean(z)}) : biometricsBucketParams.a(obj, z);
    }

    public void a(ALBiometricsResult aLBiometricsResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce5069d", new Object[]{this, aLBiometricsResult});
        } else {
            this.h = aLBiometricsResult;
        }
    }

    public void a(ALBiometricsCallBackBean aLBiometricsCallBackBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22056816", new Object[]{this, aLBiometricsCallBackBean});
        } else {
            this.j = aLBiometricsCallBackBean;
        }
    }

    private StepItem a(List<StepItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StepItem) ipChange.ipc$dispatch("b09e90b9", new Object[]{this, list});
        }
        if (list != null && !list.isEmpty()) {
            for (StepItem stepItem : list) {
                StepType stepType = stepItem.stepType;
                if (stepType != null && "BIOMETRIC_CHECK".equals(stepType.name)) {
                    return stepItem;
                }
            }
        }
        return null;
    }

    private ArrayList<Integer> b(RPBusinessHeadParams rPBusinessHeadParams) {
        StartHttpResponse.StepProperty stepProperty;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("28f394ed", new Object[]{this, rPBusinessHeadParams});
        }
        StepItem a2 = a(rPBusinessHeadParams.steps);
        if (a2 == null) {
            return new ArrayList<>();
        }
        List<StartHttpResponse.Property> list = a2.properties;
        if (list != null && list.size() != 0) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (StartHttpResponse.Property property : a2.properties) {
                if (this.d.getDegradeConfig().isDazzleBioOpen && (stepProperty = property.property) != null && "BIOMETRIC_COLORFUL".equals(stepProperty.name)) {
                    arrayList.add(2);
                }
                StartHttpResponse.StepProperty stepProperty2 = property.property;
                if (stepProperty2 != null && "Biometric".equals(stepProperty2.name)) {
                    arrayList.add(1);
                }
            }
            return arrayList;
        }
        return new ArrayList<>();
    }

    private void a(RPBusinessHeadParams rPBusinessHeadParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56804092", new Object[]{this, rPBusinessHeadParams});
        } else if (rPBusinessHeadParams != null) {
            this.d.getBiometricsConfig().secToken = this.b;
            this.d.getBiometricsConfig().isSessionless = rPBusinessHeadParams.sessionless;
            this.d.getBiometricsConfig().needOriginalImage = rPBusinessHeadParams.needOriginalImage;
            if (!TextUtils.isEmpty(rPBusinessHeadParams.userName)) {
                this.d.getBiometricsConfig().userName = rPBusinessHeadParams.userName;
            }
            List<Integer> list = rPBusinessHeadParams.bioStepsEx;
            if (list != null) {
                this.d.getBiometricsConfig().actionCount = list.size();
                if (list.size() > 0) {
                    int[] iArr = new int[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        iArr[i] = list.get(i).intValue();
                    }
                    this.d.getBiometricsConfig().strategy = iArr;
                }
            }
            this.d.getBiometricsConfig().stepNav = rPBusinessHeadParams.showNav;
            this.d.getBiometricsConfig().isLessImageMode = true;
            this.d.getBiometricsConfig().stepAdjust = rPBusinessHeadParams.needGaze;
            this.d.getBiometricsConfig().needSuccessVideo = rPBusinessHeadParams.needSuccessVideo;
            this.d.getBiometricsConfig().needFailVideo = rPBusinessHeadParams.needFailVideo;
            this.d.getBiometricsConfig().bizConf = b(rPBusinessHeadParams.steps);
            this.d.getBiometricsConfig().bioSteps = b(rPBusinessHeadParams);
            if (rPBusinessHeadParams.onlyGaze) {
                this.d.getBiometricsConfig().actionCount = 0;
                this.d.getBiometricsConfig().stepAdjust = true;
            }
            a(com.alibaba.security.realidentity.b.a(rPBusinessHeadParams.livenessConfig) ? rPBusinessHeadParams.livenessConfig : null);
        }
    }

    @Override // com.alibaba.security.realidentity.biz.bucket.BucketParams
    public boolean b(h1 h1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87f3572e", new Object[]{this, h1Var})).booleanValue();
        }
        v1 v1Var = h1Var.c;
        if (v1Var != null) {
            this.e = v1Var;
            a(v1Var.g, v1Var.m);
            return true;
        }
        BusinessHeadParams businessHeadParams = h1Var.b;
        if (businessHeadParams != null) {
            v1 v1Var2 = new v1(this.c, this.d);
            RPBusinessHeadParams rPBusinessHeadParams = (RPBusinessHeadParams) businessHeadParams;
            this.f = rPBusinessHeadParams.sessionless;
            v1Var2.o = rPBusinessHeadParams.needActionImage;
            v1Var2.p = rPBusinessHeadParams.needGaze;
            v1Var2.r = rPBusinessHeadParams.verifyConf;
            v1Var2.s = rPBusinessHeadParams.bizConf;
            List<Integer> list = rPBusinessHeadParams.bioStepsEx;
            if (list != null) {
                v1Var2.n = list.size();
            }
            v1Var2.i = rPBusinessHeadParams.livenessConfig;
            v1Var2.l = rPBusinessHeadParams.showNav;
            v1Var2.q = rPBusinessHeadParams.needOriginalImage;
            new StepItem.JsonAssist().bioStepsEx = rPBusinessHeadParams.bioStepsEx;
            h1Var.c = v1Var2;
            a(rPBusinessHeadParams);
        }
        return true;
    }

    public void b(Context context, k0 k0Var, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156b210c", new Object[]{this, context, k0Var, str, str2, str3, str4});
        } else {
            a(context, k0Var, str3, str, str2, str4);
        }
    }

    private void a(StartHttpResponse startHttpResponse, boolean z) {
        StartExtraInfo.IdentityInfo identityInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a67378", new Object[]{this, startHttpResponse, new Boolean(z)});
        } else if (startHttpResponse != null && startHttpResponse.getBiometricsStepItem() != null) {
            StartExtraInfo extraInfoBean = startHttpResponse.getExtraInfoBean();
            StepItem biometricsStepItem = startHttpResponse.getBiometricsStepItem();
            this.d.getBiometricsConfig().reachBusinessRetryLimit = startHttpResponse.isLimited();
            this.d.getBiometricsConfig().secToken = this.b;
            if (extraInfoBean != null && (identityInfo = extraInfoBean.identityInfo) != null && !TextUtils.isEmpty(identityInfo.name)) {
                this.d.getBiometricsConfig().userName = extraInfoBean.identityInfo.name;
            }
            this.d.getBiometricsConfig().bizConf = startHttpResponse.obtainDazzleConfig();
            this.d.getBiometricsConfig().bioSteps = startHttpResponse.obtainBioSteps(this.d);
            StepItem.JsonAssist jsonAssistBean = biometricsStepItem.getJsonAssistBean();
            List<Integer> list = jsonAssistBean.bioStepsEx;
            if (list != null) {
                this.d.getBiometricsConfig().actionCount = list.size();
                if (list.size() > 0) {
                    int[] iArr = new int[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        iArr[i] = list.get(i).intValue();
                    }
                    this.d.getBiometricsConfig().strategy = iArr;
                }
            }
            this.d.getBiometricsConfig().stepNav = jsonAssistBean.showNav;
            this.d.getBiometricsConfig().isLessImageMode = true;
            this.d.getBiometricsConfig().stepAdjust = jsonAssistBean.needGaze;
            this.d.getBiometricsConfig().needSuccessVideo = jsonAssistBean.needSuccessVideo;
            this.d.getBiometricsConfig().needFailVideo = jsonAssistBean.needFailVideo;
            this.d.getBiometricsConfig().needOriginalImage = jsonAssistBean.needOriginalImage;
            this.d.getBiometricsConfig().stepResult = z;
            if (jsonAssistBean.onlyGaze) {
                this.d.getBiometricsConfig().actionCount = 0;
                this.d.getBiometricsConfig().stepAdjust = true;
            }
            a(com.alibaba.security.realidentity.b.a(jsonAssistBean.livenessConfig) ? jsonAssistBean.livenessConfig : null);
        }
    }

    private void a(Context context, k0 k0Var, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("892e6bad", new Object[]{this, context, k0Var, str, str2, str3, str4});
            return;
        }
        RiskActionMaterial riskActionMaterial = new RiskActionMaterial();
        riskActionMaterial.flActionLog = str2;
        riskActionMaterial.sensorActionLog = str3;
        EventRequest eventRequest = new EventRequest(this.b, "", this.f);
        eventRequest.eventCode = str4;
        eventRequest.eventData = com.alibaba.security.realidentity.b.a(riskActionMaterial);
        eventRequest.name = str;
        a(str2, str3, str4);
        this.k.asyncRequest(eventRequest, new a(k0Var));
    }

    private Boolean a(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3174d68d", new Object[]{this, obj, new Boolean(z)});
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if ("true".equalsIgnoreCase(str)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(str)) {
                return Boolean.FALSE;
            }
        }
        return Boolean.valueOf(z);
    }

    private void a(int i, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de12f2d", new Object[]{this, new Integer(i), new Boolean(z), str, str2});
            return;
        }
        TrackLog createRiskEndLog = TrackLog.createRiskEndLog(i, z, str, str2);
        createRiskEndLog.setVerifyToken(this.b);
        createRiskEndLog.addTag9(g2.f3421a + "/" + g2.b);
        createRiskEndLog.addTag10("Android");
        RPTrack.a(createRiskEndLog);
        RPTrack.c();
    }

    private void a(k0 k0Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b89c49e7", new Object[]{this, k0Var, new Boolean(z)});
        } else {
            this.g.post(new b(k0Var, z));
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add("flActionLog");
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add("sensorActionLog");
        }
        TrackLog createRiskStartLog = TrackLog.createRiskStartLog(this.f, arrayList, str3);
        createRiskStartLog.setVerifyToken(this.b);
        createRiskStartLog.addTag9(g2.f3421a + "/" + g2.b);
        createRiskStartLog.addTag10("Android");
        RPTrack.a(createRiskStartLog);
        RPTrack.c();
    }

    private void a(String str) {
        LivenessInnerConfig livenessInnerConfig;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (livenessInnerConfig = (LivenessInnerConfig) com.alibaba.security.realidentity.b.a(str, LivenessInnerConfig.class, true)) != null) {
            if (livenessInnerConfig.adjustStep >= 0) {
                this.d.getBiometricsConfig().stepAdjust = livenessInnerConfig.adjustStep == 1;
            }
            if (livenessInnerConfig.actionCount >= 0) {
                this.d.getBiometricsConfig().actionCount = livenessInnerConfig.actionCount;
            }
            String str2 = livenessInnerConfig.actions;
            if (str2 != null) {
                try {
                    String[] split = str2.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                    int[] iArr = new int[split.length];
                    for (int i = 0; i < split.length; i++) {
                        iArr[i] = Integer.parseInt(split[i]);
                    }
                    this.d.getBiometricsConfig().strategy = iArr;
                } catch (Throwable unused) {
                }
            }
            if (livenessInnerConfig.lessImageMode >= 0) {
                this.d.getBiometricsConfig().isLessImageMode = livenessInnerConfig.lessImageMode == 1;
            }
            if (livenessInnerConfig.bigImageSize >= 0) {
                this.d.getBiometricsConfig().bigImageSize = livenessInnerConfig.bigImageSize;
            }
            if (livenessInnerConfig.detectWrongAction >= 0) {
                this.d.getBiometricsConfig().isDetectWrongAction = livenessInnerConfig.detectWrongAction == 1;
            }
            if (livenessInnerConfig.detectOcclusion >= 0) {
                this.d.getBiometricsConfig().isDetectOcclusion = livenessInnerConfig.detectOcclusion == 1;
            }
            if (livenessInnerConfig.imageCount >= 0) {
                this.d.getBiometricsConfig().imageCount = livenessInnerConfig.imageCount;
            }
            if (livenessInnerConfig.imageIntervals >= 0) {
                this.d.getBiometricsConfig().imageIntervals = livenessInnerConfig.imageIntervals;
            }
            if (livenessInnerConfig.enableRecap >= 0) {
                this.d.getBiometricsConfig().isRecapEnable = livenessInnerConfig.enableRecap == 1;
            }
            if (livenessInnerConfig.recapMode >= 0) {
                this.d.getBiometricsConfig().recapMode = livenessInnerConfig.recapMode;
            }
            if (livenessInnerConfig.recapThreshold > -1.0f) {
                this.d.getBiometricsConfig().recapThreshold = livenessInnerConfig.recapThreshold;
            }
            if (livenessInnerConfig.displayWaitingView >= 0) {
                this.d.getBiometricsConfig().needDisplayWaitingView = livenessInnerConfig.displayWaitingView == 1;
            }
            if (livenessInnerConfig.reflectILThreshold >= 0) {
                this.d.getBiometricsConfig().reflectILThreshold = livenessInnerConfig.reflectILThreshold;
            }
            if (livenessInnerConfig.actionWhileCheckFail >= 0) {
                this.d.getBiometricsConfig().actionWhileCheckFail = livenessInnerConfig.actionWhileCheckFail;
            }
            String str3 = livenessInnerConfig.strategyWhileCheckFail;
            if (str3 != null) {
                try {
                    String[] split2 = str3.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                    int[] iArr2 = new int[split2.length];
                    for (int i2 = 0; i2 < split2.length; i2++) {
                        iArr2[i2] = Integer.parseInt(split2[i2]);
                    }
                    this.d.getBiometricsConfig().strategyWhileCheckFail = iArr2;
                } catch (Throwable unused2) {
                }
            }
            if (livenessInnerConfig.bgDetectTimeIntervals >= 0) {
                this.d.getBiometricsConfig().bgDetectTimeIntervals = livenessInnerConfig.bgDetectTimeIntervals;
            }
            if (livenessInnerConfig.bgDetectColorThreshold >= 0) {
                this.d.getBiometricsConfig().bgDetectColorThreshold = livenessInnerConfig.bgDetectColorThreshold;
            }
            if (livenessInnerConfig.needSuccessVideo >= 0) {
                this.d.getBiometricsConfig().needSuccessVideo = livenessInnerConfig.needSuccessVideo == 1;
            }
            if (livenessInnerConfig.needFailVideo < 0) {
                return;
            }
            BiometricsConfig biometricsConfig = this.d.getBiometricsConfig();
            if (livenessInnerConfig.needFailVideo == 1) {
                z = true;
            }
            biometricsConfig.needFailVideo = z;
        }
    }
}
