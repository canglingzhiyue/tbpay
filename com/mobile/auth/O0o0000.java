package com.mobile.auth;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.ResultCode;
import com.mobile.auth.gatewayauth.manager.O000000o;
import com.mobile.auth.gatewayauth.manager.RequestCallback;
import com.mobile.auth.gatewayauth.model.MonitorStruct;
import com.mobile.auth.gatewayauth.model.ctcctoken.CTCCTokenRet;
import com.mobile.auth.gatewayauth.model.ctcctoken.Data;
import tb.czp;

/* loaded from: classes4.dex */
public class O0o0000 extends com.mobile.auth.gatewayauth.manager.O000000o {
    private O00000o0 O0000Oo0;

    public O0o0000(Context context, com.mobile.auth.gatewayauth.manager.O00000o o00000o) {
        super(context, o00000o, Constant.VENDOR_CTCC, null);
        this.O0000Oo0 = new O00000o0() { // from class: com.mobile.auth.O0o0000.1
            @Override // com.mobile.auth.O00000o0
            public void O000000o(String str, String str2) {
                try {
                    O0o0000.O000000o(O0o0000.this).O000000o(str, str2);
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                    }
                }
            }

            @Override // com.mobile.auth.O00000o0
            public void O000000o(String str, String str2, Throwable th) {
                try {
                    if (th != null) {
                        O0o0000.O00000Oo(O0o0000.this).O00000o0(str, str2, czp.a(th));
                    } else {
                        O0o0000.O00000o0(O0o0000.this).O00000o0(str, str2);
                    }
                } catch (Throwable th2) {
                    try {
                        ExceptionProcessor.processException(th2);
                    } catch (Throwable th3) {
                        ExceptionProcessor.processException(th3);
                    }
                }
            }
        };
    }

    static /* synthetic */ OO0oO O000000o(O0o0000 o0o0000) {
        try {
            return o0o0000.O0000OOo;
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

    static /* synthetic */ void O000000o(O0o0000 o0o0000, RequestCallback requestCallback, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, String str5) {
        try {
            o0o0000.O000000o(requestCallback, str, str2, str3, str4, monitorStruct, str5);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O000000o(O0o0000 o0o0000, String str, String str2, String str3, boolean z, String str4, MonitorStruct monitorStruct) {
        try {
            o0o0000.O000000o(str, str2, str3, z, str4, monitorStruct);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private synchronized void O000000o(final RequestCallback<O000000o.C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, final MonitorStruct monitorStruct, final String str) {
        try {
            O000000o.O000000o((int) this.O00000o0, (int) this.O00000o0, (int) this.O00000o0, this.O0000Oo0);
            O000000o.O000000o(this.O00000o, this.O000000o, this.O00000Oo, new O00000Oo() { // from class: com.mobile.auth.O0o0000.2
                @Override // com.mobile.auth.O00000Oo
                public void O000000o(String str2) {
                    try {
                        monitorStruct.setCarrierReturnTime(System.currentTimeMillis());
                        O0o0000.O00000o(O0o0000.this).O000000o("ctcc：", "getLoginInfo:", str2);
                        if (StringUtils.isEmpty(str2)) {
                            O0o0000.O000000o(O0o0000.this, requestCallback, Constant.CODE_ERROR_UNKNOWN_FAIL, "CTCC 获得的手机授权码结果为空", "", Constant.VENDOR_CTCC, monitorStruct, str);
                            return;
                        }
                        try {
                            CTCCTokenRet fromJson = CTCCTokenRet.fromJson(str2);
                            if (fromJson == null) {
                                return;
                            }
                            monitorStruct.setCarrierTraceId(fromJson.getReqId());
                            if (fromJson.getResult() != 0 || fromJson.getData() == null) {
                                O0o0000.O00000o(O0o0000.this, requestCallback, String.valueOf(fromJson.getResult()), fromJson.getMsg(), str2, Constant.VENDOR_CTCC, monitorStruct, str);
                                return;
                            }
                            Data data = fromJson.getData();
                            String number = data.getNumber();
                            String accessCode = data.getAccessCode();
                            if (StringUtils.isEmpty(number)) {
                                O0o0000.O00000o0(O0o0000.this, requestCallback, String.valueOf(fromJson.getResult()), fromJson.getMsg(), str2, Constant.VENDOR_CTCC, monitorStruct, str);
                                return;
                            }
                            requestCallback.onSuccess(O000000o.C0294O000000o.O000000o().O000000o(number).O00000o0(Constant.CTCC_PROTOCOL).O00000o(Constant.CTCC_PROTOCOL_URL).O00000Oo(accessCode).O000000o(System.currentTimeMillis() + (data.getExpiredTime() * 1000)).O000000o());
                            monitorStruct.setPhoneNumber(number);
                            monitorStruct.setAccessCode(accessCode);
                            O0o0000.O000000o(O0o0000.this, String.valueOf(fromJson.getResult()), "", "", true, Constant.VENDOR_CTCC, monitorStruct);
                        } catch (Exception e) {
                            O0o0000.O00000oO(O0o0000.this).O00000o("CTCCValidManager init exception:", czp.a(e));
                            O0o0000.O00000Oo(O0o0000.this, requestCallback, Constant.CODE_ERROR_UNKNOWN_FAIL, "JSON转换失败", str2, Constant.VENDOR_CTCC, monitorStruct, str);
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ OO0oO O00000Oo(O0o0000 o0o0000) {
        try {
            return o0o0000.O0000OOo;
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

    static /* synthetic */ void O00000Oo(O0o0000 o0o0000, RequestCallback requestCallback, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, String str5) {
        try {
            o0o0000.O000000o(requestCallback, str, str2, str3, str4, monitorStruct, str5);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O00000Oo(O0o0000 o0o0000, String str, String str2, String str3, boolean z, String str4, MonitorStruct monitorStruct) {
        try {
            o0o0000.O000000o(str, str2, str3, z, str4, monitorStruct);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ OO0oO O00000o(O0o0000 o0o0000) {
        try {
            return o0o0000.O0000OOo;
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

    static /* synthetic */ void O00000o(O0o0000 o0o0000, RequestCallback requestCallback, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, String str5) {
        try {
            o0o0000.O000000o(requestCallback, str, str2, str3, str4, monitorStruct, str5);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ OO0oO O00000o0(O0o0000 o0o0000) {
        try {
            return o0o0000.O0000OOo;
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

    static /* synthetic */ void O00000o0(O0o0000 o0o0000, RequestCallback requestCallback, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, String str5) {
        try {
            o0o0000.O000000o(requestCallback, str, str2, str3, str4, monitorStruct, str5);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ OO0oO O00000oO(O0o0000 o0o0000) {
        try {
            return o0o0000.O0000OOo;
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

    static /* synthetic */ void O00000oO(O0o0000 o0o0000, RequestCallback requestCallback, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, String str5) {
        try {
            o0o0000.O000000o(requestCallback, str, str2, str3, str4, monitorStruct, str5);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ OO0oO O00000oo(O0o0000 o0o0000) {
        try {
            return o0o0000.O0000OOo;
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

    static /* synthetic */ void O00000oo(O0o0000 o0o0000, RequestCallback requestCallback, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, String str5) {
        try {
            o0o0000.O000000o(requestCallback, str, str2, str3, str4, monitorStruct, str5);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ OO0oO O0000O0o(O0o0000 o0o0000) {
        try {
            return o0o0000.O0000OOo;
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

    static /* synthetic */ void O0000O0o(O0o0000 o0o0000, RequestCallback requestCallback, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, String str5) {
        try {
            o0o0000.O000000o(requestCallback, str, str2, str3, str4, monitorStruct, str5);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O0000OOo(O0o0000 o0o0000, RequestCallback requestCallback, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, String str5) {
        try {
            o0o0000.O000000o(requestCallback, str, str2, str3, str4, monitorStruct, str5);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // com.mobile.auth.gatewayauth.manager.O000000o
    public void O000000o(boolean z) {
    }

    @Override // com.mobile.auth.gatewayauth.manager.O000000o
    protected String O00000Oo(String str, String str2) {
        try {
            if (StringUtils.isEmpty(str)) {
                return str;
            }
            try {
                Integer valueOf = Integer.valueOf(Integer.parseInt(str));
                if (valueOf.intValue() >= 10000) {
                    if (valueOf.intValue() <= 40000) {
                        return str2;
                    }
                }
            } catch (Exception unused) {
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1389750326:
                    if (str.equals("-720002")) {
                        c = 5;
                        break;
                    }
                    break;
                case 43274408:
                    if (str.equals("-8003")) {
                        c = 4;
                        break;
                    }
                    break;
                case 43274409:
                    if (str.equals("-8004")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 43275366:
                    if (str.equals("-8100")) {
                        c = 6;
                        break;
                    }
                    break;
                case 53194808:
                    if (str.equals("80000")) {
                        c = 1;
                        break;
                    }
                    break;
                case 53194811:
                    if (str.equals("80003")) {
                        c = 7;
                        break;
                    }
                    break;
                case 53194812:
                    if (str.equals("80004")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 53194813:
                    if (str.equals("80005")) {
                        c = 2;
                        break;
                    }
                    break;
                case 53202496:
                    if (str.equals("80800")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1335041958:
                    if (str.equals(Constant.CODE_ERROR_GET_CONFIG_FAIL)) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return "600025";
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return ResultCode.CODE_ERROR_FUNCTION_TIME_OUT;
                case 6:
                case 7:
                case '\b':
                case '\t':
                    return Constant.CODE_ERROR_NO_MOBILE_NETWORK_FAIL;
                default:
                    return str2;
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

    @Override // com.mobile.auth.gatewayauth.manager.O000000o
    public synchronized void O00000o(RequestCallback<O000000o.C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, O000000o.O00000Oo o00000Oo) {
        try {
            MonitorStruct monitorStruct = new MonitorStruct();
            monitorStruct.putApiParam("timeout", String.valueOf(this.O00000o0));
            monitorStruct.setSessionId(o00000Oo.O00000o0());
            monitorStruct.setRequestId(o00000Oo.O00000Oo());
            monitorStruct.setStartTime(System.currentTimeMillis());
            monitorStruct.setAction(Constant.ACTION_CTCC_LOGIN_CODE);
            monitorStruct.setNetworkType(com.mobile.auth.gatewayauth.utils.O00000Oo.O000000o(this.O00000o, true));
            O000000o(requestCallback, monitorStruct, ResultCode.CODE_GET_MASK_FAIL);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // com.mobile.auth.gatewayauth.manager.O000000o
    public void O00000o0() {
    }

    @Override // com.mobile.auth.gatewayauth.manager.O000000o
    public synchronized void O00000oO(RequestCallback<O000000o.C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, O000000o.O00000Oo o00000Oo) {
        try {
            MonitorStruct monitorStruct = new MonitorStruct();
            monitorStruct.putApiParam("timeout", String.valueOf(this.O00000o0));
            monitorStruct.setSessionId(o00000Oo.O00000o0());
            monitorStruct.setRequestId(o00000Oo.O00000Oo());
            monitorStruct.setStartTime(System.currentTimeMillis());
            monitorStruct.setAction(Constant.ACTION_CTCC_LOGIN_TOKEN);
            monitorStruct.setNetworkType(com.mobile.auth.gatewayauth.utils.O00000Oo.O000000o(this.O00000o, true));
            O000000o(requestCallback, monitorStruct, ResultCode.CODE_GET_TOKEN_FAIL);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // com.mobile.auth.gatewayauth.manager.O000000o
    public synchronized void O00000oo(final RequestCallback<O000000o.C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, O000000o.O00000Oo o00000Oo) {
        try {
            final MonitorStruct monitorStruct = new MonitorStruct();
            monitorStruct.putApiParam("timeout", String.valueOf(this.O00000o0));
            monitorStruct.setSessionId(o00000Oo.O00000o0());
            monitorStruct.setRequestId(o00000Oo.O00000Oo());
            monitorStruct.setStartTime(System.currentTimeMillis());
            monitorStruct.setAction(Constant.ACTION_CTCC_AUTH_TOKEN);
            monitorStruct.setNetworkType(com.mobile.auth.gatewayauth.utils.O00000Oo.O000000o(this.O00000o, true));
            O000000o.O000000o((int) this.O00000o0, (int) this.O00000o0, (int) this.O00000o0, this.O0000Oo0);
            O000000o.O000000o(this.O00000o, this.O000000o, this.O00000Oo, new O00000Oo() { // from class: com.mobile.auth.O0o0000.3
                @Override // com.mobile.auth.O00000Oo
                public void O000000o(String str) {
                    try {
                        monitorStruct.setCarrierReturnTime(System.currentTimeMillis());
                        O0o0000.O00000oo(O0o0000.this).O000000o("ctcc：", "getVerifyInfo:", str);
                        if (StringUtils.isEmpty(str)) {
                            O0o0000.O00000oO(O0o0000.this, requestCallback, Constant.CODE_ERROR_UNKNOWN_FAIL, "CTCC 获得认证Token结果为空", "", Constant.VENDOR_CTCC, monitorStruct, ResultCode.CODE_GET_TOKEN_FAIL);
                            return;
                        }
                        try {
                            CTCCTokenRet fromJson = CTCCTokenRet.fromJson(str);
                            if (fromJson == null) {
                                return;
                            }
                            monitorStruct.setCarrierTraceId(fromJson.getReqId());
                            if (fromJson.getResult() != 0 || fromJson.getData() == null) {
                                O0o0000.O0000OOo(O0o0000.this, requestCallback, String.valueOf(fromJson.getResult()), fromJson.getMsg(), str, Constant.VENDOR_CTCC, monitorStruct, ResultCode.CODE_GET_TOKEN_FAIL);
                                return;
                            }
                            Data data = fromJson.getData();
                            String accessCode = data.getAccessCode();
                            if (StringUtils.isEmpty(accessCode)) {
                                O0o0000.O0000O0o(O0o0000.this, requestCallback, String.valueOf(fromJson.getResult()), fromJson.getMsg(), str, Constant.VENDOR_CTCC, monitorStruct, ResultCode.CODE_GET_TOKEN_FAIL);
                                return;
                            }
                            monitorStruct.setAccessCode(accessCode);
                            O0o0000.O00000Oo(O0o0000.this, String.valueOf(fromJson.getResult()), fromJson.getMsg(), "", true, Constant.VENDOR_CTCC, monitorStruct);
                            requestCallback.onSuccess(O000000o.C0294O000000o.O000000o().O00000Oo(accessCode).O000000o(System.currentTimeMillis() + (data.getExpiredTime() * 1000)).O000000o());
                        } catch (Exception e) {
                            O0o0000.O0000O0o(O0o0000.this).O00000o("CTCCValidManager init exception:", czp.a(e));
                            O0o0000.O00000oo(O0o0000.this, requestCallback, Constant.CODE_ERROR_UNKNOWN_FAIL, "JSON转换失败", str, Constant.VENDOR_CTCC, monitorStruct, ResultCode.CODE_GET_TOKEN_FAIL);
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
