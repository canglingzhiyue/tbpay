package tb;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.avmp.IAVMPGenericComponent;
import com.alibaba.wireless.security.open.middletier.IMiddleTierGenericComponent;
import com.alibaba.wireless.security.open.middletier.IUnifiedSecurityComponent;
import com.alibaba.wireless.security.open.middletier.fc.IFCComponent;
import com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent;
import com.alibaba.wireless.security.open.umid.IUMIDComponent;
import com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import com.taobao.tao.remotebusiness.login.h;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.security.util.SignStatistics;
import mtopsdk.security.util.b;
import mtopsdk.xstate.a;
import tb.ryv;

/* loaded from: classes.dex */
public class ryw extends ryu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile IAVMPGenericComponent.IAVMPGenericInstance d;
    private SecurityGuardManager c = null;
    private IMiddleTierGenericComponent e = null;
    private IUnifiedSecurityComponent f = null;

    static {
        kge.a(1927868033);
    }

    public static /* synthetic */ Object ipc$super(ryw rywVar, String str, Object... objArr) {
        if (str.hashCode() == -878196309) {
            super.a((MtopConfig) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ryu, tb.ryv
    public void a(MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba7c9ab", new Object[]{this, mtopConfig});
            return;
        }
        super.a(mtopConfig);
        String c = c();
        try {
            SignStatistics.a(mtopConfig.uploadStats);
            long currentTimeMillis = System.currentTimeMillis();
            this.c = SecurityGuardManager.getInstance(this.f33427a.context);
            b(StringUtils.isEmpty(mtopConfig.appKey) ? a(mtopConfig.appKeyIndex, b()) : mtopConfig.appKey, b());
            b(mtopConfig);
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i("mtopsdk.InnerSignImpl", c + " [init]ISign init SecurityGuard succeed.init time=" + (System.currentTimeMillis() - currentTimeMillis));
        } catch (SecException e) {
            int errorCode = e.getErrorCode();
            SignStatistics.a(SignStatistics.SignStatsType.TYPE_SG_MANAGER, String.valueOf(errorCode), "");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [init]ISign init SecurityGuard error.errorCode=" + errorCode, e);
        } catch (Exception e2) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [init]ISign init SecurityGuard error.", e2);
        }
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        final String c = c();
        try {
            IUMIDComponent uMIDComp = this.c.getUMIDComp();
            if (uMIDComp == null) {
                return;
            }
            int a2 = a();
            if (str2 == null) {
                str2 = "";
            }
            uMIDComp.initUMID(str, a2, str2, new IUMIDInitListenerEx() { // from class: tb.ryw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx
                public void onUMIDInitFinishedEx(String str3, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1c2fc40b", new Object[]{this, str3, new Integer(i)});
                    } else if (i != 200) {
                        TBSdkLog.w("mtopsdk.InnerSignImpl", c + " [initUmidToken]IUMIDComponent initUMID error,resultCode :" + i);
                    } else {
                        a.a(c, "umt", str3);
                        TBSdkLog.i("mtopsdk.InnerSignImpl", c + " [initUmidToken]IUMIDComponent initUMID succeed,UMID token=" + str3);
                    }
                }
            });
        } catch (SecException e) {
            int errorCode = e.getErrorCode();
            SignStatistics.a(SignStatistics.SignStatsType.TYPE_INIT_UMID, String.valueOf(errorCode), "");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + "[initUmidToken]IUMIDComponent initUMID error,errorCode=" + errorCode, e);
        } catch (Exception e2) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + "[initUmidToken]IUMIDComponent initUMID error.", e2);
        }
    }

    @Override // tb.ryv
    public String a(ryv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4258ed4", new Object[]{this, aVar});
        }
        if (aVar != null) {
            return a(aVar.f33429a, aVar.b);
        }
        return null;
    }

    @Override // tb.ryv
    public String a(HashMap<String, String> hashMap, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78ece6a1", new Object[]{this, hashMap, str, str2});
        }
        String c = c();
        String str3 = null;
        if (hashMap == null) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getMtopApiSign] params is null.appKey=" + str);
            return null;
        } else if (str == null) {
            hashMap.put("SG_ERROR_CODE", "AppKey is null");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getMtopApiSign] AppKey is null.");
            return null;
        } else if (this.c == null) {
            hashMap.put("SG_ERROR_CODE", "SGManager is null");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getMtopApiSign]SecurityGuardManager is null,please call ISign init()");
            return null;
        } else {
            try {
                if ((SwitchConfig.getInstance().getUseSecurityAdapter() & 1) == 1) {
                    str3 = a(hashMap, str);
                }
                if (!StringUtils.isBlank(str3)) {
                    return str3;
                }
                SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                securityGuardParamContext.appKey = str;
                securityGuardParamContext.requestType = 7;
                Map<String, String> a2 = a((Map<String, String>) hashMap, str, false);
                if (a2 != null && 2 == a()) {
                    a2.put("ATLAS", "daily");
                }
                securityGuardParamContext.paramMap = a2;
                return this.c.getSecureSignatureComp().signRequest(securityGuardParamContext, str2);
            } catch (SecException e) {
                int errorCode = e.getErrorCode();
                SignStatistics.a(SignStatistics.SignStatsType.TYPE_SIGN_MTOP_REQUEST, String.valueOf(errorCode), "");
                hashMap.put("SG_ERROR_CODE", String.valueOf(errorCode));
                TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getMtopApiSign] ISecureSignatureComponent signRequest error,errorCode=" + errorCode, e);
                return str3;
            } catch (Exception e2) {
                TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getMtopApiSign] ISecureSignatureComponent signRequest error", e2);
                return str3;
            }
        }
    }

    public Map<String, String> a(Map<String, String> map, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("61e57082", new Object[]{this, map, str, new Boolean(z)});
        }
        if (map == null || map.size() <= 0) {
            return null;
        }
        String str2 = map.get(HttpHeaderConstant.KEY_EXTDATA);
        String str3 = map.get(HttpHeaderConstant.X_FEATURES);
        String str4 = map.get("routerId");
        String str5 = map.get("placeId");
        String str6 = map.get("open-biz");
        String str7 = map.get("mini-appkey");
        String str8 = map.get("req-appkey");
        String str9 = map.get("accessToken");
        String str10 = map.get("open-biz-data");
        StringBuilder sb = new StringBuilder(64);
        sb.append(b.a(map.get("utdid")));
        sb.append("&");
        sb.append(b.a(map.get("uid")));
        sb.append("&");
        sb.append(b.a(map.get("reqbiz-ext")));
        sb.append("&");
        sb.append(str);
        sb.append("&");
        sb.append(b.b(map.get("data")));
        sb.append("&");
        sb.append(map.get("t"));
        sb.append("&");
        sb.append(map.get("api"));
        sb.append("&");
        sb.append(map.get("v"));
        sb.append("&");
        sb.append(b.a(map.get("sid")));
        sb.append("&");
        sb.append(b.a(map.get("ttid")));
        sb.append("&");
        sb.append(b.a(map.get("deviceId")));
        sb.append("&");
        sb.append(b.a(map.get(DispatchConstants.LATITUDE)));
        sb.append("&");
        sb.append(b.a(map.get(DispatchConstants.LONGTITUDE)));
        sb.append("&");
        if (z) {
            sb.append(b.a(str2));
            sb.append("&");
        } else if (StringUtils.isNotBlank(str2)) {
            sb.append(str2);
            sb.append("&");
        }
        sb.append(str3);
        sb.append("&");
        sb.append(b.a(str4));
        sb.append("&");
        sb.append(b.a(str5));
        sb.append("&");
        sb.append(b.a(str6));
        sb.append("&");
        sb.append(b.a(str7));
        sb.append("&");
        sb.append(b.a(str8));
        sb.append("&");
        sb.append(b.a(str9));
        sb.append("&");
        sb.append(b.a(str10));
        HashMap hashMap = new HashMap(2);
        hashMap.put("INPUT", sb.toString());
        return hashMap;
    }

    public Map<String, String> a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("85c7b09c", new Object[]{this, map, str});
        }
        if (map == null || map.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append(b.a(map.get("utdid")));
        sb.append("&");
        sb.append(b.a(map.get("uid")));
        sb.append("&");
        sb.append("");
        sb.append("&");
        sb.append(str);
        sb.append("&");
        sb.append(b.b(map.get("data")));
        sb.append("&");
        sb.append(map.get("t"));
        sb.append("&");
        sb.append("");
        sb.append("&");
        sb.append("");
        sb.append("&");
        sb.append(b.a(map.get("sid")));
        sb.append("&");
        sb.append(b.a(map.get("ttid")));
        sb.append("&");
        sb.append("");
        sb.append("&");
        sb.append("");
        sb.append("&");
        sb.append("");
        sb.append("&");
        sb.append("");
        sb.append("&");
        sb.append("");
        sb.append("&");
        sb.append("");
        sb.append("&");
        sb.append("");
        sb.append("&");
        sb.append("");
        sb.append("&");
        sb.append("");
        sb.append("&");
        sb.append("");
        sb.append("&");
        sb.append("");
        sb.append("&");
        sb.append("");
        HashMap hashMap = new HashMap(2);
        hashMap.put("INPUT", sb.toString());
        return hashMap;
    }

    @Override // tb.ryv
    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        String c = c();
        if (str == null || str2 == null) {
            return null;
        }
        if (this.c == null) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getCommonHmacSha1Sign]SecurityGuardManager is null,please call ISign init()");
            return null;
        }
        try {
            HashMap hashMap = new HashMap(1);
            hashMap.put("INPUT", str);
            SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
            securityGuardParamContext.appKey = str2;
            securityGuardParamContext.requestType = 3;
            securityGuardParamContext.paramMap = hashMap;
            return this.c.getSecureSignatureComp().signRequest(securityGuardParamContext, b());
        } catch (SecException e) {
            int errorCode = e.getErrorCode();
            SignStatistics.a(SignStatistics.SignStatsType.TYPE_SIGN_HMAC_SHA1, String.valueOf(errorCode), "");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getCommonHmacSha1Sign] ISecureSignatureComponent signRequest error,errorCode=" + errorCode, e);
            return null;
        } catch (Exception e2) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getCommonHmacSha1Sign] ISecureSignatureComponent signRequest error", e2);
            return null;
        }
    }

    @Override // tb.ryu, tb.ryv
    public String a(String str, String str2, String str3, HashMap<String, String> hashMap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90aa366a", new Object[]{this, str, str2, str3, hashMap, new Integer(i)});
        }
        try {
            return ((ISecurityBodyComponent) this.c.getInterface(ISecurityBodyComponent.class)).getSecurityBodyDataEx(str, str2, str3, hashMap, i, a());
        } catch (SecException e) {
            SignStatistics.a(SignStatistics.SignStatsType.TYPE_GET_SECBODY, String.valueOf(e.getErrorCode()), String.valueOf(i));
            TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getSecBodyDataEx] ISecurityBodyComponent getSecurityBodyDataEx  error.errorCode=" + e.getErrorCode() + ", flag=" + i, e);
            return null;
        } catch (Exception e2) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getSecBodyDataEx] ISecurityBodyComponent getSecurityBodyDataEx  error,flag=" + i, e2);
            return null;
        }
    }

    @Override // tb.ryu, tb.ryv
    public String a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f592e79", new Object[]{this, str, str2, new Integer(i)});
        }
        String a2 = a(str);
        if (!StringUtils.isBlank(a2)) {
            return a2;
        }
        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getAvmpSign] call avmpSign return null.degrade call getSecBodyDataEx ");
        return a("", "", str2, null, i);
    }

    private synchronized String a(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String str2 = null;
        byte[] bArr = new byte[4];
        if (str == null) {
            try {
                str = "";
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [avmpSign] input is null");
            } catch (Exception e) {
                try {
                    i = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt();
                    SignStatistics.a(SignStatistics.SignStatsType.TYPE_INVOKE_AVMP, String.valueOf(i), "");
                } catch (Throwable unused) {
                }
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [avmpSign] call avmpInstance.invokeAVMP error.errorCode=" + i, e);
            }
        }
        IAVMPGenericComponent.IAVMPGenericInstance a2 = a(this.f33427a != null ? this.f33427a.context : MtopUtils.getContext());
        if (a2 == null) {
            return null;
        }
        byte[] bArr2 = (byte[]) a2.invokeAVMP("sign", new byte[0].getClass(), 0, str.getBytes(), Integer.valueOf(str.getBytes().length), "", bArr, Integer.valueOf(a()));
        if (bArr2 != null) {
            str2 = new String(bArr2);
        }
        return str2;
    }

    public IAVMPGenericComponent.IAVMPGenericInstance a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAVMPGenericComponent.IAVMPGenericInstance) ipChange.ipc$dispatch("69fc80c", new Object[]{this, context});
        }
        if (this.d == null) {
            synchronized (ryw.class) {
                if (this.d == null) {
                    try {
                        this.d = ((IAVMPGenericComponent) SecurityGuardManager.getInstance(context).getInterface(IAVMPGenericComponent.class)).createAVMPInstance("mwua", "sgcipher");
                        if (this.d == null) {
                            TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getAVMPInstance] call createAVMPInstance return null.");
                        }
                    } catch (SecException e) {
                        int errorCode = e.getErrorCode();
                        SignStatistics.a(SignStatistics.SignStatsType.TYPE_AVMP_INSTANCE, String.valueOf(errorCode), "");
                        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getAVMPInstance] call createAVMPInstance error,errorCode=" + errorCode, e);
                    } catch (Exception e2) {
                        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getAVMPInstance] call createAVMPInstance error.", e2);
                    }
                }
            }
        }
        return this.d;
    }

    private String a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd4d069b", new Object[]{this, new Integer(i), str});
        }
        String str2 = null;
        String c = c();
        try {
            str2 = this.c.getStaticDataStoreComp().getAppKeyByIndex(i, str);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.InnerSignImpl", c + " [getAppKeyByIndex]getAppKeyByIndex  appKey=" + str2 + ",appKeyIndex=" + i + ",authCode=" + str);
            }
        } catch (SecException e) {
            int errorCode = e.getErrorCode();
            SignStatistics.a(SignStatistics.SignStatsType.TYPE_GET_APPKEY, String.valueOf(errorCode), "");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getAppKeyByIndex]getAppKeyByIndex error.errorCode=" + errorCode + ",appKeyIndex=" + i + ",authCode=" + str, e);
        } catch (Exception e2) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getAppKeyByIndex]getAppKeyByIndex error.appKeyIndex=" + i + ",authCode=" + str, e2);
        }
        return str2;
    }

    private void b(MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4f9d2c", new Object[]{this, mtopConfig});
        } else if (mtopConfig == null) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(AlipayConstant.LOGIN_ALIPAY_AUTH_CODE_KEY, b());
                if (this.e == null) {
                    this.e = (IMiddleTierGenericComponent) SecurityGuardManager.getInstance(mtopConfig.context).getInterface(IMiddleTierGenericComponent.class);
                    if (this.e != null && !this.e.init(hashMap) && TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [initMiddleTier]init middle tier failed");
                    }
                }
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put("authCode", b());
                if (this.f == null) {
                    this.f = (IUnifiedSecurityComponent) SecurityGuardManager.getInstance(mtopConfig.context).getInterface(IUnifiedSecurityComponent.class);
                    if (this.f != null) {
                        this.f.init(hashMap2);
                    } else if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [initMiddleTier]init sign failed");
                    }
                }
            } catch (SecException e) {
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [initMiddleTier]init middleTier failed with errorCode " + e.getErrorCode() + ",appKeyIndex=" + mtopConfig.appKeyIndex + ",authCode=" + mtopConfig.authCode, e);
            } catch (Exception e2) {
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [initMiddleTier]init middleTier failed with unknown exception, appKeyIndex=" + mtopConfig.appKeyIndex + ",authCode=" + mtopConfig.authCode, e2);
            }
            try {
                HashMap hashMap3 = new HashMap();
                if (h.a(mtopConfig.mtopInstance) == null) {
                    z = false;
                }
                hashMap3.put(IFCComponent.KEY_LOGIN_MODULE, Boolean.valueOf(z));
                IFCComponent iFCComponent = (IFCComponent) SecurityGuardManager.getInstance(mtopConfig.context).getInterface(IFCComponent.class);
                if (iFCComponent != null) {
                    iFCComponent.setUp(mtopConfig.context, hashMap3);
                    mtopConfig.mtopGlobalHeaders.put("x-bx-version", iFCComponent.getFCPluginVersion());
                }
            } catch (SecException e3) {
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [initMiddleTier]init ifcComponent failed with errorCode " + e3.getErrorCode() + ",appKeyIndex=" + mtopConfig.appKeyIndex + ",authCode=" + mtopConfig.authCode, e3);
            } catch (Exception e4) {
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [initMiddleTier]init ifcComponent failed with unknown exception, appKeyIndex=" + mtopConfig.appKeyIndex + ",authCode=" + mtopConfig.authCode, e4);
            }
            TBSdkLog.e("mtopsdk.InnerSignImpl", "[initMiddleTier] execute initMiddleTier cost time ", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // tb.ryu
    public String a(HashMap<String, String> hashMap, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8089feb", new Object[]{this, hashMap, str});
        }
        String str3 = a((Map<String, String>) hashMap, str, false).get("INPUT");
        try {
        } catch (SecException e) {
            e = e;
            str2 = "";
        } catch (UnsupportedEncodingException e2) {
            e = e2;
            str2 = "";
        }
        if (this.e != null && !StringUtils.isBlank(str3)) {
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("data", str3.getBytes("UTF-8"));
            hashMap2.put("env", Integer.valueOf(d()));
            hashMap2.put("appkey", str);
            HashMap<String, String> sign = this.e.getSign(hashMap2);
            if (sign != null && !sign.isEmpty()) {
                str2 = sign.remove(HttpHeaderConstant.X_SIGN);
                try {
                    if (StringUtils.isNotBlank(str2)) {
                        hashMap.putAll(sign);
                    }
                } catch (SecException e3) {
                    e = e3;
                    TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getSign]get sign failed and SecException errorCode " + e.getErrorCode() + ",appKeyIndex=" + this.f33427a.appKeyIndex + ",authCode=" + this.f33427a.authCode, e);
                    return str2;
                } catch (UnsupportedEncodingException e4) {
                    e = e4;
                    TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getSign]your input data transfer to byte utf-8 failed ", "appKeyIndex=" + this.f33427a.appKeyIndex + ",authCode=" + this.f33427a.authCode, e);
                    return str2;
                }
                return str2;
            }
            TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getSign]get sign failed with no output ", "appKeyIndex=" + this.f33427a.appKeyIndex + ",authCode=" + this.f33427a.authCode);
            return "";
        }
        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getSign]middleTier null or data data ", "appKeyIndex=" + this.f33427a.appKeyIndex + ",authCode=" + this.f33427a.authCode);
        return "";
    }

    @Override // tb.ryu, tb.ryv
    public String b(HashMap<String, String> hashMap, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18be6cac", new Object[]{this, hashMap, str});
        }
        String str3 = hashMap.get("sign");
        try {
        } catch (SecException e) {
            e = e;
            str2 = "";
        } catch (UnsupportedEncodingException e2) {
            e = e2;
            str2 = "";
        }
        if (this.e != null && !StringUtils.isBlank(str3)) {
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("data", str3.getBytes("UTF-8"));
            hashMap2.put("env", Integer.valueOf(d()));
            HashMap<String, String> wua = this.e.getWua(hashMap2);
            if (wua != null && !wua.isEmpty()) {
                str2 = wua.remove("wua");
                try {
                    if (StringUtils.isNotBlank(str2)) {
                        hashMap.putAll(wua);
                    }
                } catch (SecException e3) {
                    e = e3;
                    TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getWua]get wua failed and SecException errorCode " + e.getErrorCode() + ",appKeyIndex=" + this.f33427a.appKeyIndex + ",authCode=" + this.f33427a.authCode, e);
                    return str2;
                } catch (UnsupportedEncodingException e4) {
                    e = e4;
                    TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getWua]your input data transfer to byte utf-8 failed ", "appKeyIndex=" + this.f33427a.appKeyIndex + ",authCode=" + this.f33427a.authCode, e);
                    return str2;
                }
                return str2;
            }
            TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getWua]get wua failed with no output ", "appKeyIndex=" + this.f33427a.appKeyIndex + ",authCode=" + this.f33427a.authCode);
            return "";
        }
        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getWua]middleTier null or data data ", "appKeyIndex=" + this.f33427a.appKeyIndex + ",authCode=" + this.f33427a.authCode);
        return "";
    }

    @Override // tb.ryu, tb.ryv
    public String a(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("848f5218", new Object[]{this, hashMap, hashMap2});
        }
        try {
        } catch (SecException e) {
            e = e;
            str = "";
        }
        if (this.e == null) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getMiniWua]middleTier ", "appKeyIndex=" + this.f33427a.appKeyIndex + ",authCode=" + this.f33427a.authCode);
            return "";
        }
        HashMap<String, Object> hashMap3 = new HashMap<>();
        hashMap3.put("env", Integer.valueOf(d()));
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        hashMap2.put("api_name", hashMap.get("api"));
        hashMap3.put("extend_paras", hashMap2);
        HashMap<String, String> miniWua = this.e.getMiniWua(hashMap3);
        if (miniWua != null && !miniWua.isEmpty()) {
            str = miniWua.remove("x-miniwua");
            try {
                if (StringUtils.isNotBlank(str)) {
                    hashMap.putAll(miniWua);
                }
            } catch (SecException e2) {
                e = e2;
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getMiniWua]get miniwua failed and SecException errorCode " + e.getErrorCode() + ",appKeyIndex=" + this.f33427a.appKeyIndex + ",authCode=" + this.f33427a.authCode, e);
                return str;
            }
            return str;
        }
        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getMiniWua]get miniwua failed with no output ", "appKeyIndex=" + this.f33427a.appKeyIndex + ",authCode=" + this.f33427a.authCode);
        return "";
    }

    @Override // tb.ryu, tb.ryv
    public HashMap<String, String> a(HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str, String str2, boolean z, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a6a0d665", new Object[]{this, hashMap, hashMap2, str, str2, new Boolean(z), str3});
        }
        String c = c();
        if (str == null) {
            hashMap.put("SG_ERROR_CODE", "AppKey is null");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getUnifiedSign] AppKey is null.");
            return null;
        } else if (hashMap == null) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getUnifiedSign] params is null.appKey=" + str);
            return null;
        } else if (this.f == null) {
            hashMap.put("SG_ERROR_CODE", "unified is null");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getUnifiedSign]sg unified sign is null, please call ISign init()");
            return null;
        } else {
            try {
                HashMap<String, Object> hashMap3 = new HashMap<>();
                if (TextUtils.isEmpty(hashMap.get("ssr-pv"))) {
                    str4 = a((Map<String, String>) hashMap, str, true).get("INPUT");
                } else {
                    str4 = a((Map<String, String>) hashMap, str).get("INPUT");
                }
                if (StringUtils.isBlank(str4)) {
                    TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getUnifiedSign]get sign failed with sign data empty ", "appKeyIndex=" + this.f33427a.appKeyIndex + ",authCode=" + this.f33427a.authCode);
                    return null;
                }
                hashMap3.put("appkey", str);
                hashMap3.put("data", str4);
                hashMap3.put("useWua", Boolean.valueOf(z));
                hashMap3.put("env", Integer.valueOf(d()));
                hashMap3.put("authCode", str2);
                hashMap3.put("extendParas", hashMap2);
                hashMap3.put(e.REQUEST_ID, str3);
                hashMap3.put("api", hashMap.get("api"));
                hashMap3.put("mtopBusiness", hashMap.get("mtopBusiness"));
                try {
                    String str5 = hashMap.get("bizId");
                    if (!TextUtils.isEmpty(str5)) {
                        hashMap3.put("bizId", Integer.valueOf(Integer.parseInt(str5)));
                    }
                } catch (Throwable unused) {
                }
                HashMap<String, String> securityFactors = this.f.getSecurityFactors(hashMap3);
                if (securityFactors != null && !securityFactors.isEmpty()) {
                    return securityFactors;
                }
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getUnifiedSign]get sign failed with no output ", "appKeyIndex=" + this.f33427a.appKeyIndex + ",authCode=" + this.f33427a.authCode);
                return null;
            } catch (SecException e) {
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getUnifiedSign]get sign failed and SecException errorCode " + e.getErrorCode() + ",appKeyIndex=" + this.f33427a.appKeyIndex + ",authCode=" + this.f33427a.authCode, e);
                return null;
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getUnifiedSign]get sign failed exception ,appKeyIndex=" + this.f33427a.appKeyIndex + ",authCode=" + this.f33427a.authCode, th);
                return null;
            }
        }
    }

    private int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        if (a() == EnvModeEnum.PREPARE.getEnvMode()) {
            return 1;
        }
        return (a() == EnvModeEnum.TEST.getEnvMode() || a() == EnvModeEnum.TEST_SANDBOX.getEnvMode()) ? 2 : 0;
    }
}
