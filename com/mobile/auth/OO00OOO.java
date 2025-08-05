package com.mobile.auth;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.taobao.search.common.util.k;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes4.dex */
public class OO00OOO {
    private static volatile OO00OOO O000000o;
    private OO00O O00000oO;
    private int O00000Oo = 0;
    private int O00000o0 = 3000;
    private int O00000o = 3000;

    public static OO00OOO O000000o() {
        try {
            if (O000000o == null) {
                synchronized (OO00OOO.class) {
                    if (O000000o == null) {
                        O000000o = new OO00OOO();
                    }
                }
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

    public OO00OOO O000000o(OO00O oo00o) {
        try {
            this.O00000oO = oo00o;
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

    public OO00Oo0 O00000Oo() {
        OO00Oo0 oO00Oo0;
        try {
            oO00Oo0 = new OO00Oo0();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
        if (this.O00000oO == null) {
            oO00Oo0.O000000o("100008");
            oO00Oo0.O00000Oo("请求参数为空");
            oO00Oo0.O000000o(false);
            return oO00Oo0;
        } else if (TextUtils.isEmpty(this.O00000oO.getBaseUrl())) {
            oO00Oo0.O000000o("100004");
            oO00Oo0.O00000Oo("url 为空");
            oO00Oo0.O000000o(false);
            return oO00Oo0;
        } else {
            try {
                if (TextUtils.isEmpty(new URL(this.O00000oO.getBaseUrl()).getHost())) {
                    oO00Oo0.O000000o("100001");
                    oO00Oo0.O00000Oo("host 为空");
                    oO00Oo0.O000000o(false);
                    return oO00Oo0;
                } else if (TextUtils.isEmpty(this.O00000oO.getMethod()) && TextUtils.isEmpty(this.O00000oO.getAction())) {
                    oO00Oo0.O000000o("100002");
                    oO00Oo0.O00000Oo("api 为空");
                    oO00Oo0.O000000o(false);
                    return oO00Oo0;
                } else if (this.O00000oO.isSign() && TextUtils.isEmpty(this.O00000oO.getAccessKeySecret())) {
                    oO00Oo0.O000000o("100003");
                    oO00Oo0.O00000Oo("未设置secretkey");
                    oO00Oo0.O000000o(false);
                    return oO00Oo0;
                } else {
                    try {
                        this.O00000oO.setRequestMethod("POST");
                        this.O00000Oo = 0;
                        String O000000o2 = this.O00000oO.getBaseUrl().startsWith(k.HTTPS_PREFIX) ? OO00O0.O000000o(this.O00000oO, this.O00000o0, this.O00000o) : OO00O0.O000000o(this.O00000oO, this.O00000o0, this.O00000o, this.O00000Oo);
                        if (!TextUtils.isEmpty(O000000o2) && !"{}".equals(O000000o2)) {
                            oO00Oo0.O000000o("100000");
                            oO00Oo0.O00000Oo("请求成功");
                            oO00Oo0.O000000o(true);
                            oO00Oo0.O00000o0(O000000o2);
                            return oO00Oo0;
                        }
                        oO00Oo0.O000000o("100007");
                        oO00Oo0.O00000Oo("数据返回错误");
                        oO00Oo0.O000000o(false);
                        return oO00Oo0;
                    } catch (IOException e) {
                        e.printStackTrace();
                        oO00Oo0.O000000o("100006");
                        oO00Oo0.O00000Oo(e.getLocalizedMessage());
                        oO00Oo0.O000000o(false);
                        return oO00Oo0;
                    }
                }
            } catch (MalformedURLException e2) {
                e2.printStackTrace();
                oO00Oo0.O000000o("100001");
                oO00Oo0.O00000Oo("host 为空");
                oO00Oo0.O000000o(false);
                return oO00Oo0;
            }
            ExceptionProcessor.processException(th);
            return null;
        }
    }
}
