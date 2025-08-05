package com.alipay.android.msp.core.model;

import android.content.Context;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspExperimentHelper;
import com.alipay.android.msp.pay.CashierSceneDictionary;
import com.alipay.android.msp.utils.ApLinkTokenUtils;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.InstallationUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.OrderStrUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class MspPaySession {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AP_LINK_TOKEN_EXT_INFO_KEY = "ap_link_token";
    public static final String AP_LINK_TOKEN_KEY_FROM_SCAN_CODE = "ap_scan_codec_link_token";
    public static final int DEFAULT_CALLING_ID = -2;

    /* renamed from: a  reason: collision with root package name */
    private String f4551a;
    private String b;
    private final String c;
    private String d;
    private String e;
    private String g;
    private Map<String, String> h;
    private CertPayModel i;
    private SchemePayModel j;
    private String k;
    private boolean r;
    private String s;
    private String t;
    private String v;
    private String w;
    private String x;
    private String y;
    private final List<String> z;
    private Map<String, String> f = new ConcurrentHashMap(12);
    private boolean n = true;
    private boolean l = false;
    private boolean o = false;
    private boolean m = false;
    private int q = -2;
    private int p = -2;
    private int u = 0;

    /* renamed from: com.alipay.android.msp.core.model.MspPaySession$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MspPaySession f4552a;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                String nameForUid = GlobalHelper.getInstance().getContext().getPackageManager().getNameForUid(MspPaySession.a(this.f4552a));
                String orderSuffix = this.f4552a.getOrderSuffix();
                if (!TextUtils.isEmpty(nameForUid) && !TextUtils.isEmpty(orderSuffix)) {
                    this.f4552a.setOuterPackageName(nameForUid, true);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                StringBuilder sb = new StringBuilder("callingUid=");
                sb.append(MspPaySession.a(this.f4552a));
                sb.append(",pkgName=");
                sb.append(nameForUid);
                sb.append(" , costtime=");
                long j = elapsedRealtime2 - elapsedRealtime;
                sb.append(j);
                LogUtil.record(2, "MspPaySession.updateOuterPackageNameByCallingUid", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j);
                EventLogUtil.logPayEvent("10101081", HiAnalyticsConstant.BI_KEY_COST_TIME, sb2.toString(), "content_type", "getSourcePkg");
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class CertPayModel {
        public final String callbackUrl;
        public final String packageName;
        public final String pid;
        public final String session;

        public CertPayModel(String str, String str2, String str3, String str4) {
            this.session = str;
            this.callbackUrl = str2;
            this.pid = str3;
            this.packageName = str4;
        }
    }

    /* loaded from: classes3.dex */
    public static class SchemePayModel {
        public final String desKey;
        public final String packageName;
        public final String session;

        public SchemePayModel(String str, String str2, String str3) {
            this.session = str;
            this.desKey = str2;
            this.packageName = str3;
        }
    }

    private static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : i == -2 || i == -1;
    }

    public void updateOuterPackageNameByCallingUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5aed29", new Object[]{this});
        }
    }

    public static /* synthetic */ int a(MspPaySession mspPaySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c00b4ee", new Object[]{mspPaySession})).intValue() : mspPaySession.p;
    }

    public MspPaySession(String str, String str2, boolean z) {
        this.r = false;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Context context = GlobalHelper.getInstance().getContext();
        FastStartActivityHelper.init(MspExperimentHelper.isGray(FastStartActivityHelper.CONFIG_KEY));
        if (context != null) {
            this.r = FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_NEW_AP_LINK_TOKEN_CREATE_100370);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 > 300) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "np", "readSpSlow", String.valueOf(elapsedRealtime2));
        }
        setOrderSuffix(str);
        this.c = str2;
        setFromWallet(z);
        this.z = InstallationUtil.getInstalledThirdPayTypes(GlobalHelper.getInstance().getContext());
    }

    public void setOrderSuffix(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7666814e", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || TextUtils.equals(str, this.b)) {
        } else {
            this.b = Utils.AliyunSlot(str);
            setBizId(Utils.getBizId(this.b));
            if (TextUtils.isEmpty(this.b)) {
                return;
            }
            Map<String, String> extractExtInfoMapFromExternalInfo = OrderStrUtil.extractExtInfoMapFromExternalInfo(this.b);
            if (extractExtInfoMapFromExternalInfo == null || extractExtInfoMapFromExternalInfo.size() == 0) {
                extractExtInfoMapFromExternalInfo = new HashMap<>();
            }
            String str2 = extractExtInfoMapFromExternalInfo.get("ap_link_token");
            if (!TextUtils.isEmpty(str2)) {
                if (this.r) {
                    this.g = str2 + ApLinkTokenUtils.generateUniqueSuffixForOuterApLinkToken(this.b);
                } else {
                    this.g = str2;
                }
            } else {
                this.g = ApLinkTokenUtils.generateFallbackTradeToken(this.b);
            }
            extractExtInfoMapFromExternalInfo.put("ap_link_token", this.g);
            this.f = extractExtInfoMapFromExternalInfo;
        }
    }

    public String getInvokeFromClientAppId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("681341e0", new Object[]{this}) : this.v;
    }

    public void setInvokeFromClientAppId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b027fe", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    public String getInvokeFromUrlRefer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("399665f0", new Object[]{this}) : this.s;
    }

    public void setInvokeFromUrlRefer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d081386", new Object[]{this, str});
        } else {
            this.s = str;
        }
    }

    public String getInvokeFromAppName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b6c285", new Object[]{this}) : this.x;
    }

    public void setInvokeFromAppName(String str) {
        String signatureString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa095f9", new Object[]{this, str});
            return;
        }
        this.x = str;
        Signature[] rawSignature = Utils.getRawSignature(GlobalHelper.getInstance().getContext(), this.f4551a);
        if (rawSignature == null || rawSignature.length <= 0 || rawSignature[0] == null || (signatureString = Utils.getSignatureString(rawSignature[0], "MD5")) == null || signatureString.length() <= 0) {
            return;
        }
        this.y = signatureString;
    }

    public String getInvokeFromAppSign() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a73eb293", new Object[]{this}) : this.y;
    }

    public Map<String, String> getExtInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a7858875", new Object[]{this}) : this.f;
    }

    public void updateExtInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e51cf8", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            String str = map.get("ap_link_token");
            if (TextUtils.isEmpty(str)) {
                str = map.get("ap_scan_codec_link_token");
            }
            if (!TextUtils.isEmpty(str)) {
                if (this.r && !str.contains("_INR") && !str.startsWith("UK")) {
                    str = str + ApLinkTokenUtils.generateUniqueSuffixForOuterApLinkToken(this.b);
                }
                this.g = str;
            }
            Map<String, String> map2 = this.f;
            if (map2 != null && !map2.isEmpty()) {
                this.f.putAll(map);
            } else {
                this.f = new HashMap(map);
            }
            if (!TextUtils.isEmpty(str)) {
                this.f.put("ap_link_token", this.g);
            }
            Map<String, String> map3 = this.f;
            if (map3 == null || map3.size() == 0) {
                return;
            }
            String str2 = map3.get(MspGlobalDefine.INVOKE_FROM_SOURCE_KEY);
            String str3 = map3.get(MspGlobalDefine.INVOKE_FROM_API_KEY);
            String str4 = map3.get(MspGlobalDefine.INVOKE_FROM_ID_KEY);
            String str5 = map3.get(MspGlobalDefine.INVOKE_FROM_REFER_URL);
            LogUtil.record(2, "parseInvokeFromSuite", "invokeFromSource=" + str2 + " ，invokeFromApi=" + str3 + " ， invokeFromId=" + str4 + " ，invokeFromUrlRefer=" + str5);
            if (!TextUtils.isEmpty(str2)) {
                setFromSource(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                setFromApi(str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                setInvokeFromClientAppId(str4);
            }
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            setInvokeFromUrlRefer(str5);
        }
    }

    public String getApLinkToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd8b99bf", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.g)) {
            setApLinkToken(ApLinkTokenUtils.generateFallbackTradeToken(this.b));
        }
        return this.g;
    }

    public void setApLinkToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9eccff", new Object[]{this, str});
        } else if (TextUtils.equals(str, this.g) || TextUtils.isEmpty(str)) {
        } else {
            this.g = str;
            if (this.f == null) {
                this.f = new ConcurrentHashMap(12);
            }
            this.f.put("ap_link_token", str);
        }
    }

    public String getOrderSuffix() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5de49f90", new Object[]{this}) : this.b;
    }

    public String getEncodeOrderSuffix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a16c1946", new Object[]{this});
        }
        try {
            return !TextUtils.isEmpty(this.b) ? URLEncoder.encode(this.b, "utf8") : "";
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "";
        }
    }

    public String getExtendParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ff4c103", new Object[]{this}) : this.c;
    }

    public void setExternalPkgName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e491e7b", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String getExternalPkgName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79f08ec3", new Object[]{this}) : this.d;
    }

    public void setFromWallet(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa96c08", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public boolean isFromWallet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a09ea318", new Object[]{this})).booleanValue() : this.n;
    }

    public Map<String, String> getLocalInvokeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3af9e297", new Object[]{this});
        }
        if (this.h == null) {
            this.h = new HashMap();
        }
        return this.h;
    }

    public void setLocalInvokeInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e2016f", new Object[]{this, map});
        } else {
            this.h = map;
        }
    }

    public String getOuterPackageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97d9268d", new Object[]{this}) : this.f4551a;
    }

    public void setOuterPackageName(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5239aa6b", new Object[]{this, str, new Boolean(z)});
        } else if (!TextUtils.isEmpty(this.f4551a)) {
        } else {
            this.f4551a = str;
            setInvokeFromAppName(str);
        }
    }

    public CertPayModel getCertPayModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CertPayModel) ipChange.ipc$dispatch("bb335178", new Object[]{this}) : this.i;
    }

    public void setCertPayModel(CertPayModel certPayModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a120c32", new Object[]{this, certPayModel});
        } else {
            this.i = certPayModel;
        }
    }

    public SchemePayModel getSchemePayModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SchemePayModel) ipChange.ipc$dispatch("d38285f6", new Object[]{this}) : this.j;
    }

    public void setSchemePayModel(SchemePayModel schemePayModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b9117d2", new Object[]{this, schemePayModel});
        } else {
            this.j = schemePayModel;
        }
    }

    public String getSceneType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("229325c9", new Object[]{this}) : this.k;
    }

    public void setSceneType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20f4f35", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public boolean isFromWalletH5Pay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d829ad19", new Object[]{this})).booleanValue() : this.o;
    }

    public void setFromWalletH5Pay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d68b97", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public boolean isFromOutScheme() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3ddfea0a", new Object[]{this})).booleanValue() : this.m;
    }

    public void setFromOutScheme(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f75ac6", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public String getSchemeTraceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("39e3fff4", new Object[]{this}) : this.e;
    }

    public void setSchemeTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373be06a", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public boolean isFromEntranceActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84db7c04", new Object[]{this})).booleanValue() : this.l;
    }

    public void setFromEntranceActivity(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6110169c", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public String getFromApi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31462d5f", new Object[]{this}) : this.t;
    }

    public void setFromApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe83075f", new Object[]{this, str});
        } else {
            this.t = str;
        }
    }

    public String getFromSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eb75c97e", new Object[]{this}) : this.w;
    }

    public void setFromSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2cedb8", new Object[]{this, str});
        } else {
            this.w = str;
        }
    }

    public int getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        if (this.u < 0) {
            this.u = Utils.getBizId(this.b);
        }
        return this.u;
    }

    public void setBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ca4090", new Object[]{this, new Integer(i)});
        } else {
            this.u = i;
        }
    }

    public int getCallingPid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aa45a017", new Object[]{this})).intValue() : this.q;
    }

    public void setCallingPid(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54570d3", new Object[]{this, new Integer(i)});
        } else {
            this.q = i;
        }
    }

    public int getCallingUid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b2c4c85c", new Object[]{this})).intValue() : this.p;
    }

    public void setCallingUid(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcab512e", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public void ensureCallingPidUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9144fc12", new Object[]{this});
            return;
        }
        if (a(this.q)) {
            setCallingPid(Binder.getCallingPid());
        }
        if (!a(this.p)) {
            return;
        }
        CashierSceneDictionary.MspSchemePayContext mspSchemePayContext = CashierSceneDictionary.getInstance().getMspSchemePayContext(Utils.AliyunSlot(this.b));
        if (this.n || mspSchemePayContext != null) {
            return;
        }
        setCallingUid(Binder.getCallingUid());
    }

    public List<String> getInstalled3rdAppList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1e16a962", new Object[]{this}) : this.z;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "<MspPaySession orderSuffix=" + this.b + " extendParams=" + this.c + " externalPkgName=" + this.d + " outerPackageName=" + this.f4551a + " fromSource=" + this.w + " fromApi=" + this.t + " apLinkToken=" + this.g + " sceneType=" + this.k + " isFromWallet=" + this.n + " isFromEntranceActivity=" + this.l + " isFromWalletH5Pay=" + this.o + " isFromOutScheme=" + this.m + " callingPid=" + this.q + " callingUid=" + this.p + ">";
    }
}
