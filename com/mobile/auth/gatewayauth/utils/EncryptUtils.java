package com.mobile.auth.gatewayauth.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.mobile.auth.BuildConfig;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.RStruct;
import com.mobile.auth.gatewayauth.model.TerminalInfo;
import com.mobile.auth.gatewayauth.utils.security.PackageUtils;
import com.nirvana.tools.jsoner.a;
import com.taobao.accs.common.Constants;
import java.lang.reflect.Field;
import java.util.List;
import javax.crypto.KeyGenerator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.czn;
import tb.czu;

/* loaded from: classes4.dex */
public class EncryptUtils {
    public static final String IV_PARAMETER_SPEC = "0000000000000000";

    public static String encrpytAESKey(String str) {
        try {
            try {
                return O0000OOo.O000000o(str, getSecret1() + getSecret2().substring(2) + getSecret3().substring(0, 22) + getSecret4());
            } catch (Exception e) {
                O0000Oo0.O00000o0(e.getMessage());
                return null;
            }
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

    public static String encrpytAESKey(String str, String str2) {
        try {
            try {
                return O0000OOo.O000000o(str2, str);
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
            O0000Oo0.O00000o0(e.getMessage());
            return null;
        }
    }

    private static String encrypt(String str, String str2) {
        try {
            return AESUtils.encryptString2Base64(str, str2, IV_PARAMETER_SPEC);
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

    public static String encryptInfoForCertifyId(Context context, String str, String str2, String str3, String str4, String str5) {
        try {
            TerminalInfo terminalInfo = new TerminalInfo();
            terminalInfo.setOsVersion(O00000o.O00000Oo());
            terminalInfo.setDeviceName(O00000o.O00000o0());
            terminalInfo.setDeviceBrand(O00000o.O000000o());
            terminalInfo.setPackageName(PackageUtils.getPackageName(context));
            terminalInfo.setAppVersion(PackageUtils.getVersionName(context));
            terminalInfo.setSign(PackageUtils.getSign(context));
            terminalInfo.setSdkVersion(BuildConfig.VERSION_NAME);
            terminalInfo.setSceneCode(str);
            terminalInfo.setUniqueId(com.mobile.auth.gatewayauth.manager.O00000o.O000000o);
            terminalInfo.setCustomId(str2);
            terminalInfo.setMetaInfo(str3);
            String jSONObject = a.a(terminalInfo, (List<Field>) null).toString();
            RStruct rStruct = new RStruct();
            rStruct.setC(encrypt(jSONObject, str5));
            rStruct.setK(encrpytAESKey(str5));
            rStruct.setRid(str4);
            return rStruct.toJson().toString();
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

    public static String encryptToken(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9) {
        try {
            String O000000o = O00000o.O000000o(context, str, str2, str4, str6, str7, str8, z);
            if (czu.b() && !TextUtils.isEmpty(str9)) {
                String a2 = czu.a().a(context, O00000Oo.O00000Oo(str7), str9);
                if (!TextUtils.isEmpty(a2)) {
                    try {
                        JSONObject jSONObject = new JSONObject(a2);
                        jSONObject.put("vendor", O00000Oo.O00000Oo(str7));
                        jSONObject.put(Constants.KEY_OS_TYPE, "Android");
                        jSONObject.put("deviceInfo", Build.MODEL);
                        JSONObject jSONObject2 = new JSONObject(O000000o);
                        jSONObject2.put("uaidToken", jSONObject);
                        O000000o = jSONObject2.toString();
                        czu.a().b(context, O00000Oo.O00000Oo(str7), str9);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
            RStruct rStruct = new RStruct();
            rStruct.setC(encrypt(O000000o, str5));
            rStruct.setK(encrpytAESKey(str5));
            rStruct.setRid(str3);
            return rStruct.toJson().toString();
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

    public static String generateAesKey() {
        String str;
        try {
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(128);
                return czn.a.a(keyGenerator.generateKey().getEncoded());
            } catch (Exception e) {
                O0000Oo0.O000000o(e);
                return str;
            }
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

    private static String getSecret1() {
        return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApNuVemkk/wu31vVS0EO21sUIb+16SDKTthNSp9OrNVWCQ2aRT56RB/hfF4IOJqAD/";
    }

    private static String getSecret2() {
        return "MIfAoCjITrE4Mubel9JuRwRQCrXkHdUVELYhkVap8om9yzblMF0YqYapY3+AshwRxyQ/JqWGb13I+V+mwl25/5N+jUUL3pIxFDpIdEOQewFjhZf9RiPtjK9wjVgDq+3A3T2r4pp1iW8kpZE";
    }

    private static String getSecret3() {
        return "JyEU1aXPrIo6vuSJVDULT/MIGfMA0GCSqGSIb3DQEBAQUAA4G";
    }

    private static String getSecret4() {
        return "1UU+dKJp8cpd+K19AR13UUms+8tUbPuSpAXHdmCMmJTFQJqi9+s/cr5w0kYeUPC9RmUu1WdDU4Ul4ZtBe8JhLElfkKXpRQKa9XYf6So8f06yeG2mMQIDAQAB";
    }

    public static String getSecret5() {
        return "4902300012067LMD31182817ACF9533";
    }

    public static String getSecret6() {
        return "70677511UU+dKJp8cpd+ACF9533ADCAFF+LIB8ADCAB89610780AC49D610780AC4+s/cr4638561WdDU4Ul4Z467970tBe8JhLEB";
    }

    public static String noEncryptTinfo(Context context, String str, String str2) {
        try {
            String O000000o = O00000o.O000000o(context, str, str2);
            RStruct rStruct = new RStruct();
            rStruct.setC(O000000o);
            return rStruct.toJson().toString();
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
