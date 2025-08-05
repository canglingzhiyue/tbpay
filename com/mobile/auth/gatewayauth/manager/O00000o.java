package com.mobile.auth.gatewayauth.manager;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.ariver.kernel.RVStartParams;
import com.mobile.auth.BuildConfig;
import com.mobile.auth.O0OOO0O;
import com.mobile.auth.OO0oO;
import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.PnsReporter;
import com.mobile.auth.gatewayauth.model.MonitorStruct;
import com.mobile.auth.gatewayauth.model.UStruct;
import com.mobile.auth.gatewayauth.utils.AESUtils;
import com.mobile.auth.gatewayauth.utils.security.PackageUtils;
import com.taobao.accs.common.Constants;
import com.taobao.android.msoa.c;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.trtc.api.TrtcConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import tb.dal;

/* loaded from: classes4.dex */
public class O00000o {
    public static String O000000o;
    public static String O00000Oo;
    public static String O00000o0;
    private Context O00000o;
    private String O0000OOo;
    private String O0000Oo;
    private String O0000Oo0;
    private Map<String, String> O0000o;
    private Map<String, String> O0000o0O;
    private Map<String, String> O0000o0o;
    private OO0oO O0000oO;
    private Map<String, String> O0000oO0;
    private final String O00000oO = "c78623c22e2f6513";
    private String O00000oo = UUID.randomUUID().toString();
    private boolean O0000O0o = true;
    private String O0000OoO = "";
    private String O0000Ooo = "";
    private O0OOO0O O0000o00 = null;
    private dal O0000o0 = null;

    public O00000o(Context context) {
        this.O00000o = context.getApplicationContext();
        O0000o0O();
    }

    private String O000000o(Context context) {
        try {
            try {
                Object invoke = Class.forName("tb.czs").getDeclaredMethod("getUmaaId", Context.class).invoke(null, context);
                return invoke != null ? invoke.toString() : "";
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private String O000000o(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        try {
            try {
                jSONObject.put(c.TAG, new JSONObject(O000000o(this.O00000o, str2, str4)));
                jSONObject.put("action", str);
                jSONObject.put("apiLevel", str3);
                jSONObject.put(Constants.KEY_OS_TYPE, "Android");
                if (this.O0000oO0 != null && !this.O0000oO0.isEmpty()) {
                    for (String str5 : this.O0000oO0.keySet()) {
                        jSONObject.put(str5, this.O0000oO0.get(str5));
                    }
                }
            } catch (JSONException e) {
                this.O0000oO.O00000o("AssembleMonitorInfoError!", Log.getStackTraceString(e));
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private String O00000Oo(Context context) {
        try {
            try {
                Object invoke = Class.forName("tb.czs").getDeclaredMethod("getDeviceId", Context.class).invoke(null, context);
                return invoke != null ? invoke.toString() : "";
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private boolean O0000o() {
        try {
            return Class.forName("tb.czs") != null;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    private void O0000o0O() {
        try {
            this.O0000oO = OO0oO.O000000o(this.O00000o);
            this.O0000o00 = new O0OOO0O(O000000o(), this);
            this.O0000o0 = new dal(this.O00000o);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private String O0000o0o() {
        try {
            return O0000o() ? O000000o(this.O00000o) : "";
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public OO0oO O000000o() {
        try {
            return this.O0000oO;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public String O000000o(MonitorStruct monitorStruct) {
        try {
            return O000000o(monitorStruct.getVendorKey(), monitorStruct.getAction(), new UStruct(monitorStruct), monitorStruct.getApiLevel(), monitorStruct.getPhoneNumber());
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public String O000000o(String str, String str2, UStruct uStruct, String str3) {
        try {
            return O000000o(str, str2, uStruct, str3, "");
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public String O000000o(String str, String str2, UStruct uStruct, String str3, String str4) {
        String encrypt;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(this.O0000OoO)) {
                uStruct.setEt(this.O0000OoO);
            }
            try {
                JSONObject json = uStruct.toJson();
                if (this.O0000o0O != null && !this.O0000o0O.isEmpty()) {
                    for (String str5 : this.O0000o0O.keySet()) {
                        json.put(str5, this.O0000o0O.get(str5));
                    }
                }
                jSONObject.put(RVStartParams.KEY_URL_SHORT, json);
                jSONObject.put(RVStartParams.KEY_URL_SHORT, uStruct.toJson());
                if (TextUtils.isEmpty(str4)) {
                    Map<String, String> O00000Oo2 = O00000Oo(uStruct.getPrivateIp());
                    if (this.O0000o != null && !this.O0000o.isEmpty()) {
                        O00000Oo2.putAll(this.O0000o);
                    }
                    encrypt = AESUtils.encrypt(new JSONObject(O00000Oo2).toString(), "c78623c22e2f6513");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put(TrtcConstants.TRTC_PARAMS_PHONE_NUMBER, str4);
                    hashMap.putAll(O00000Oo(uStruct.getPrivateIp()));
                    if (this.O0000o != null && !this.O0000o.isEmpty()) {
                        hashMap.putAll(this.O0000o);
                    }
                    encrypt = AESUtils.encrypt(new JSONObject(hashMap).toString(), "c78623c22e2f6513");
                }
                jSONObject.put("s", encrypt);
            } catch (Exception e) {
                this.O0000oO.O00000o("BuildMonitorError!", Log.getStackTraceString(e));
            }
            return O000000o(jSONObject, str2, str, str3, uStruct.getNetworkType());
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public Map<String, Object> O000000o(Context context, String str, String str2) {
        String str3;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("createTime", Long.valueOf(System.currentTimeMillis()));
            hashMap.put("osVersion", com.mobile.auth.gatewayauth.utils.O00000o.O00000Oo());
            hashMap.put("deviceName", com.mobile.auth.gatewayauth.utils.O00000o.O00000o0());
            hashMap.put("deviceBrand", com.mobile.auth.gatewayauth.utils.O00000o.O000000o());
            hashMap.put("packageName", PackageUtils.getPackageName(context));
            hashMap.put("appVersion", PackageUtils.getVersionName(context));
            hashMap.put(SimpleProfile.KEY_SIGNATURE, PackageUtils.getSign(context));
            if (Constant.VENDOR_CUCC.equals(str)) {
                hashMap.put("vendorKey", Constant.VENDOR_CUXZ);
            } else {
                hashMap.put("vendorKey", str);
            }
            hashMap.put("sdkVersion", BuildConfig.VERSION_NAME);
            hashMap.put("networkType", str2);
            hashMap.put("monitorVersion", "2.1");
            hashMap.put("utdid", O0000Ooo());
            hashMap.put("um_aaid", O0000o00());
            hashMap.put("uniqueId", O0000OoO());
            hashMap.put("traceId", this.O00000oo);
            hashMap.put("archiveName", BuildConfig.FLAVOR);
            if (!Constant.VENDOR_CMCC.equals(str)) {
                if (!Constant.VENDOR_CUCC.equals(str)) {
                    if (Constant.VENDOR_CTCC.equals(str)) {
                        str3 = BuildConfig.CTCC_SDK_VERSION;
                    } else if (!Constant.VENDOR_CUXZ.equals(str)) {
                        str3 = "";
                    }
                }
                hashMap.put("carrierSdkVersion", BuildConfig.CUZX_SDK_VERSION);
                if (this.O0000o0o != null && !this.O0000o0o.isEmpty()) {
                    hashMap.putAll(this.O0000o0o);
                }
                return hashMap;
            }
            str3 = BuildConfig.CMCC_SDK_VERSION;
            hashMap.put("carrierSdkVersion", str3);
            if (this.O0000o0o != null) {
                hashMap.putAll(this.O0000o0o);
            }
            return hashMap;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public void O000000o(O0000OOo o0000OOo) {
        try {
            this.O0000o00.O000000o(o0000OOo);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(String str) {
        try {
            this.O0000Ooo = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public PnsReporter O00000Oo() {
        try {
            return this.O0000o00;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public Map<String, String> O00000Oo(String str) {
        try {
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(str)) {
                hashMap.put("innerIP", str);
            }
            hashMap.put(ParamsConstants.Key.PARAM_SCENE_CODE, this.O0000Ooo);
            return hashMap;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public synchronized String O00000o() {
        try {
            if (TextUtils.isEmpty(this.O0000Oo0)) {
                return O0000O0o();
            }
            return this.O0000Oo0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public synchronized String O00000o0() {
        try {
            if (TextUtils.isEmpty(this.O0000OOo)) {
                return O00000oo();
            }
            return this.O0000OOo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public void O00000o0(String str) {
        if (str != null) {
            try {
                this.O0000OoO = str;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public synchronized String O00000oO() {
        try {
            if (TextUtils.isEmpty(this.O0000Oo)) {
                return O0000Oo();
            }
            return this.O0000Oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public synchronized String O00000oo() {
        try {
            this.O0000OOo = UUID.randomUUID().toString();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
        return this.O0000OOo;
    }

    public synchronized String O0000O0o() {
        try {
            this.O0000Oo0 = UUID.randomUUID().toString();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
        return this.O0000Oo0;
    }

    public synchronized void O0000OOo() {
        try {
            this.O0000OOo = null;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public synchronized String O0000Oo() {
        try {
            this.O0000Oo = UUID.randomUUID().toString();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
        return this.O0000Oo;
    }

    public synchronized void O0000Oo0() {
        try {
            this.O0000Oo0 = null;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public String O0000OoO() {
        try {
            if (O000000o == null) {
                O000000o = this.O0000o0.a();
            }
            return O000000o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public String O0000Ooo() {
        try {
            if (!this.O0000O0o) {
                return null;
            }
            if (O00000Oo == null && O0000o()) {
                O00000Oo = O00000Oo(this.O00000o);
            }
            return O00000Oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public void O0000o0() {
        try {
            this.O0000O0o = false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public String O0000o00() {
        try {
            if (O00000o0 == null) {
                O00000o0 = O0000o0o();
            }
            return O00000o0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }
}
