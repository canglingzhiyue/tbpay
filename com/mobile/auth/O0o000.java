package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.ResultCode;
import com.mobile.auth.gatewayauth.manager.O000000o;
import com.mobile.auth.gatewayauth.manager.RequestCallback;
import com.mobile.auth.gatewayauth.model.MonitorStruct;
import com.unicom.online.account.shield.ResultListener;
import com.unicom.online.account.shield.UniAccountHelper;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class O0o000 extends com.mobile.auth.gatewayauth.manager.O000000o {
    public O0o000(Context context, com.mobile.auth.gatewayauth.manager.O00000o o00000o) {
        super(context, o00000o, Constant.VENDOR_CUCC, null);
    }

    static /* synthetic */ void O000000o(O0o000 o0o000, RequestCallback requestCallback, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, String str5) {
        try {
            o0o000.O000000o(requestCallback, str, str2, str3, str4, monitorStruct, str5);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O000000o(O0o000 o0o000, String str, String str2, String str3, boolean z, String str4, MonitorStruct monitorStruct) {
        try {
            o0o000.O000000o(str, str2, str3, z, str4, monitorStruct);
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
            UniAccountHelper.getInstance().cuGetToken((int) this.O00000o0, new ResultListener() { // from class: com.mobile.auth.O0o000.1
                @Override // com.unicom.online.account.shield.ResultListener
                public void onResult(String str2) {
                    try {
                        try {
                            TextUtils.isEmpty("");
                            JSONObject jSONObject = new JSONObject(str2);
                            int optInt = jSONObject.optInt("resultCode");
                            String optString = jSONObject.optString("resultMsg");
                            JSONObject optJSONObject = jSONObject.optJSONObject("resultData");
                            if (optInt != 100) {
                                if ("1202".equals(Integer.valueOf(optInt))) {
                                    O0o000.O00000o0(O0o000.this, requestCallback, String.valueOf(optInt), ResultCode.MSG_ERROR_ANALYZE_SDK_BLACKLIST_INFO, str2, Constant.VENDOR_CUCC, monitorStruct, str);
                                } else {
                                    O0o000.O00000o(O0o000.this, requestCallback, String.valueOf(optInt), optString, str2, Constant.VENDOR_CUCC, monitorStruct, str);
                                }
                            } else if (optJSONObject == null) {
                            } else {
                                String optString2 = optJSONObject.optString("fakeMobile");
                                String optString3 = optJSONObject.optString("accessCode");
                                long optLong = optJSONObject.optLong("exp");
                                if (TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
                                    if ("1202".equals(Integer.valueOf(optInt))) {
                                        O0o000.O000000o(O0o000.this, requestCallback, String.valueOf(optInt), ResultCode.MSG_ERROR_ANALYZE_SDK_BLACKLIST_INFO, str2, Constant.VENDOR_CUCC, monitorStruct, str);
                                        return;
                                    } else {
                                        O0o000.O00000Oo(O0o000.this, requestCallback, String.valueOf(optInt), optString, str2, Constant.VENDOR_CUCC, monitorStruct, str);
                                        return;
                                    }
                                }
                                requestCallback.onSuccess(O000000o.C0294O000000o.O000000o().O000000o(optString2).O00000o0(Constant.CUCC_WOPROTOCOL).O00000o(Constant.CUCC_WOPROTOCOL_URL).O00000Oo(optString3).O000000o(optLong).O000000o());
                                monitorStruct.setAccessCode(optString3);
                                monitorStruct.setPhoneNumber(optString2);
                                O0o000.O000000o(O0o000.this, String.valueOf(optInt), "", "", true, Constant.VENDOR_CUCC, monitorStruct);
                            }
                        } catch (Exception e) {
                            O0o000.O00000oO(O0o000.this, requestCallback, Constant.CODE_ERROR_UNKNOWN_FAIL, "JSON转换失败", e.toString(), Constant.VENDOR_CUCC, monitorStruct, str);
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

    static /* synthetic */ void O00000Oo(O0o000 o0o000, RequestCallback requestCallback, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, String str5) {
        try {
            o0o000.O000000o(requestCallback, str, str2, str3, str4, monitorStruct, str5);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O00000o(O0o000 o0o000, RequestCallback requestCallback, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, String str5) {
        try {
            o0o000.O000000o(requestCallback, str, str2, str3, str4, monitorStruct, str5);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O00000o0(O0o000 o0o000, RequestCallback requestCallback, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, String str5) {
        try {
            o0o000.O000000o(requestCallback, str, str2, str3, str4, monitorStruct, str5);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O00000oO(O0o000 o0o000, RequestCallback requestCallback, String str, String str2, String str3, String str4, MonitorStruct monitorStruct, String str5) {
        try {
            o0o000.O000000o(requestCallback, str, str2, str3, str4, monitorStruct, str5);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // com.mobile.auth.gatewayauth.manager.O000000o
    public void O000000o(String str, String str2) {
        try {
            super.O000000o(str, str2);
            UniAccountHelper.getInstance().setLogEnable(com.mobile.auth.gatewayauth.utils.O0000Oo0.O00000Oo());
            UniAccountHelper.getInstance().init(this.O00000o, str);
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
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case 1535446013:
                    if (str.equals("410000")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1535446014:
                    if (str.equals("410001")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1535446015:
                    if (str.equals("410002")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1535446016:
                    if (str.equals("410003")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1535446017:
                    if (str.equals("410004")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1535446018:
                    if (str.equals("410005")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            return c != 0 ? (c == 1 || c == 2) ? "600025" : (c == 3 || c == 4 || c == 5) ? Constant.CODE_ERROR_NO_MOBILE_NETWORK_FAIL : str2 : ResultCode.CODE_ERROR_FUNCTION_TIME_OUT;
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
            monitorStruct.setAction(Constant.ACTION_CUCC_LOGIN_CODE);
            monitorStruct.setUrgency(1);
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
    public synchronized void O00000oO(final RequestCallback<O000000o.C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, O000000o.O00000Oo o00000Oo) {
        try {
            MonitorStruct monitorStruct = new MonitorStruct();
            monitorStruct.putApiParam("timeout", String.valueOf(this.O00000o0));
            monitorStruct.setSessionId(o00000Oo.O00000o0());
            monitorStruct.setRequestId(o00000Oo.O00000Oo());
            monitorStruct.setStartTime(System.currentTimeMillis());
            monitorStruct.setAction(Constant.ACTION_CUCC_LOGIN_TOKEN);
            monitorStruct.setNetworkType(com.mobile.auth.gatewayauth.utils.O00000Oo.O000000o(this.O00000o, true));
            O000000o(new RequestCallback<O000000o.C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo>() { // from class: com.mobile.auth.O0o000.2
                public void O000000o(O000000o.C0294O000000o c0294O000000o) {
                    try {
                        requestCallback.onSuccess(c0294O000000o);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                public void O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                    try {
                        requestCallback.onError(o00000Oo2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                    try {
                        O000000o(o00000Oo2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                public /* synthetic */ void onSuccess(O000000o.C0294O000000o c0294O000000o) {
                    try {
                        O000000o(c0294O000000o);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, monitorStruct, ResultCode.CODE_GET_TOKEN_FAIL);
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
            MonitorStruct monitorStruct = new MonitorStruct();
            monitorStruct.putApiParam("timeout", String.valueOf(this.O00000o0));
            monitorStruct.setSessionId(o00000Oo.O00000o0());
            monitorStruct.setRequestId(o00000Oo.O00000Oo());
            monitorStruct.setStartTime(System.currentTimeMillis());
            monitorStruct.setAction(Constant.ACTION_CUCC_AUTH_TOKEN);
            monitorStruct.setNetworkType(com.mobile.auth.gatewayauth.utils.O00000Oo.O000000o(this.O00000o, true));
            O000000o(new RequestCallback<O000000o.C0294O000000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo>() { // from class: com.mobile.auth.O0o000.3
                public void O000000o(O000000o.C0294O000000o c0294O000000o) {
                    try {
                        requestCallback.onSuccess(c0294O000000o);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                public void O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                    try {
                        requestCallback.onError(o00000Oo2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo2) {
                    try {
                        O000000o(o00000Oo2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                public /* synthetic */ void onSuccess(O000000o.C0294O000000o c0294O000000o) {
                    try {
                        O000000o(c0294O000000o);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, monitorStruct, ResultCode.CODE_GET_TOKEN_FAIL);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
