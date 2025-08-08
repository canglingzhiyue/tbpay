package com.alipay.mobile.verifyidentity.rpc;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBizBase;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.alipay.vi.android.phone.mrpc.core.Config;
import com.alipay.vi.android.phone.mrpc.core.HttpManager;
import com.alipay.vi.android.phone.mrpc.core.RpcFactory;
import com.alipay.vi.android.phone.mrpc.core.RpcParams;
import com.alipay.vi.android.phone.mrpc.core.Transport;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.network.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.apache.http.message.BasicHeader;

/* loaded from: classes3.dex */
public class IRpcServiceImpl implements IRpcService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RpcFactory b;
    private Context c;

    /* renamed from: a  reason: collision with root package name */
    private String f6046a = "IRpcServiceImpl";
    public String ContextClass = "com.alipay.mobile.verifyidentity.engine.MicroModuleContext";
    private String d = "https://mobilegw.alipay.com/mgw.htm";
    private String e = "";
    private String f = "";
    private boolean g = false;
    private String h = MICRpcServiceBizBase.MACAO_GW_URL;
    private String i = MICRpcServiceBizBase.INTERNATIONAL_URL;

    public static /* synthetic */ Context access$000(IRpcServiceImpl iRpcServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("7a3310b1", new Object[]{iRpcServiceImpl}) : iRpcServiceImpl.c;
    }

    public static /* synthetic */ String access$100(IRpcServiceImpl iRpcServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77fe22a6", new Object[]{iRpcServiceImpl}) : iRpcServiceImpl.f6046a;
    }

    @Override // com.alipay.mobile.verifyidentity.rpc.IRpcService
    public <T> T getRpcProxy(Class<T> cls) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("eba1321b", new Object[]{this, cls});
        }
        this.c = a();
        final RpcParams rpcParams = new RpcParams();
        if (!StringUtils.isEmpty(this.e)) {
            str = this.e;
        } else {
            str = ReadSettingServerUrl.getInstance().getGWFURL(a());
        }
        if (StringUtils.isEmpty(str)) {
            str = this.d;
        }
        rpcParams.setGwUrl(str);
        ArrayList arrayList = new ArrayList();
        if (this.g) {
            arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_WORKSPACE_ID, "default"));
            arrayList.add(new BasicHeader("appId", "ALIPAY_WALLET_MO"));
            arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_OPERATION_TYPE, this.f));
        } else {
            Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.mobile.common.info.DeviceInfo", "getInstance");
            if (invokeStaticMethod != null) {
                arrayList.add(new BasicHeader(a.KEY_DID, (String) ReflectUtils.invokeMethod(invokeStaticMethod, "getmDid")));
                arrayList.add(new BasicHeader("clientId", (String) ReflectUtils.invokeMethod(invokeStaticMethod, "getClientId")));
            }
            arrayList.add(new BasicHeader("uuid", UUID.randomUUID().toString()));
            arrayList.add(new BasicHeader("TRACKERID", ""));
            arrayList.add(new BasicHeader("appkey", "23699722"));
            arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_APPID, "VI_SDK_ANDROID"));
        }
        rpcParams.setHeaders(arrayList);
        this.b = new RpcFactory(new Config() { // from class: com.alipay.mobile.verifyidentity.rpc.IRpcServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public String getAppKey() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("49079005", new Object[]{this}) : "23699722";
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public String getUrl() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("de8f0660", new Object[]{this}) : rpcParams.getGwUrl();
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public Transport getTransport() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Transport) ipChange2.ipc$dispatch("36cb0cc1", new Object[]{this}) : HttpManager.getInstance(getApplicationContext());
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public RpcParams getRpcParams() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (RpcParams) ipChange2.ipc$dispatch("cc287401", new Object[]{this}) : rpcParams;
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public Context getApplicationContext() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Context) ipChange2.ipc$dispatch("c5c75d34", new Object[]{this}) : IRpcServiceImpl.access$000(IRpcServiceImpl.this).getApplicationContext();
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public boolean isGzip() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("8b75982f", new Object[]{this})).booleanValue() : rpcParams.isGzip();
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public String sign(Context context, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("2ca88008", new Object[]{this, context, str2, str3});
                }
                try {
                    SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
                    if (securityGuardManager == null) {
                        IRpcServiceImpl.access$100(IRpcServiceImpl.this);
                        return "";
                    }
                    ISecureSignatureComponent secureSignatureComp = securityGuardManager.getSecureSignatureComp();
                    if (secureSignatureComp == null) {
                        IRpcServiceImpl.access$100(IRpcServiceImpl.this);
                        return "";
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("INPUT", str3);
                    SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                    securityGuardParamContext.appKey = str2;
                    securityGuardParamContext.paramMap = hashMap;
                    securityGuardParamContext.requestType = 4;
                    String signRequest = secureSignatureComp.signRequest(securityGuardParamContext, "");
                    StringUtils.isEmpty(signRequest);
                    IRpcServiceImpl.access$100(IRpcServiceImpl.this);
                    StringBuilder sb = new StringBuilder("GET Params: appKey:");
                    sb.append(str2);
                    sb.append("content:");
                    sb.append(str3);
                    sb.append("SecureSignatureDefine.OPEN_KEY_SIGN_INPUT:INPUTSecureSignatureDefine.OPEN_ENUM_SIGN_COMMON_MD5:4");
                    return signRequest;
                } catch (Exception e) {
                    IRpcServiceImpl.access$100(IRpcServiceImpl.this);
                    new StringBuilder("exception:").append(e.getMessage());
                    return "";
                }
            }
        });
        this.b.setContext(this.c);
        return (T) this.b.getRpcProxy(cls);
    }

    @Override // com.alipay.mobile.verifyidentity.rpc.IRpcService
    public void setGW(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523025e3", new Object[]{this, str});
            return;
        }
        this.e = str;
        if (StringUtils.isEmpty(this.e)) {
            return;
        }
        if (!this.e.equals(this.h) && !this.e.equals(this.i)) {
            return;
        }
        this.g = true;
    }

    public void setGwOptionType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17ffb2", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            this.f = "";
        } else if (str.equals("dispatch")) {
            this.f = "alipay.mobile.ic.dispatch.tb";
        } else if (!str.equals("initVerifyTask")) {
        } else {
            this.f = "alipay.mobile.ic.init.tb";
        }
    }

    private Context a() {
        try {
            Class<?> cls = Class.forName(this.ContextClass);
            Method method = cls.getMethod("getInstance", null);
            Method method2 = cls.getMethod("getContext", null);
            method.setAccessible(true);
            method2.setAccessible(true);
            return (Context) method2.invoke(method.invoke(null, null), null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }
}
