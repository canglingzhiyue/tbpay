package com.mobile.auth.gatewayauth.manager.compat;

import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.ResultCode;
import com.mobile.auth.gatewayauth.model.TokenRet;

/* loaded from: classes4.dex */
public class O000000o implements ResultCodeProcessor {
    private String O000000o(String str) {
        if (str == null) {
            return ResultCode.CODE_GET_TOKEN_FAIL;
        }
        try {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 1656378) {
                if (hashCode != 1715960) {
                    if (hashCode != 1335041987) {
                        switch (hashCode) {
                            case 1335041957:
                                if (str.equals(Constant.CODE_ERROR_START_AUTH_PAGE_FAIL)) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 1335041958:
                                if (str.equals(Constant.CODE_ERROR_GET_CONFIG_FAIL)) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case 1335041959:
                                if (str.equals(Constant.CODE_ERROR_PHONE_UNSAFE_FAIL)) {
                                    c = 5;
                                    break;
                                }
                                break;
                            case 1335041960:
                                if (str.equals(Constant.CODE_ERROR_NO_PERMISSION_FAIL)) {
                                    c = 6;
                                    break;
                                }
                                break;
                            case 1335041961:
                                if (str.equals(Constant.CODE_ERROR_NO_SIM_FAIL)) {
                                    c = 7;
                                    break;
                                }
                                break;
                            case 1335041962:
                                if (str.equals(Constant.CODE_ERROR_NO_MOBILE_NETWORK_FAIL)) {
                                    c = '\b';
                                    break;
                                }
                                break;
                            case 1335041963:
                                if (str.equals(Constant.CODE_ERROR_OPERATOR_UNKNOWN_FAIL)) {
                                    c = '\t';
                                    break;
                                }
                                break;
                            case 1335041964:
                                if (str.equals(Constant.CODE_ERROR_UNKNOWN_FAIL)) {
                                    c = '\n';
                                    break;
                                }
                                break;
                            case 1335041965:
                                if (str.equals(Constant.CODE_ERROR_FUNCTION_DEMOTE)) {
                                    c = 11;
                                    break;
                                }
                                break;
                            default:
                                switch (hashCode) {
                                    case 1340651407:
                                        if (str.equals(Constant.CODE_ERROR_USER_CANCEL)) {
                                            c = 3;
                                            break;
                                        }
                                        break;
                                    case 1340651408:
                                        if (str.equals(Constant.CODE_ERROR_USER_SWITCH)) {
                                            c = '\r';
                                            break;
                                        }
                                        break;
                                }
                        }
                    } else if (str.equals(Constant.CODE_ERROR_FUNCTION_LIMIT)) {
                        c = '\f';
                    }
                } else if (str.equals(Constant.CODE_GET_TOKEN_SUCCESS)) {
                    c = 0;
                }
            } else if (str.equals("6000")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    return "600000";
                case 1:
                    return ResultCode.CODE_START_AUTHPAGE_SUCCESS;
                case 2:
                    return ResultCode.CODE_ERROR_START_AUTHPAGE_FAIL;
                case 3:
                    return ResultCode.CODE_ERROR_USER_CANCEL;
                case 4:
                    return ResultCode.CODE_ERROR_GET_CONFIG_FAIL;
                case 5:
                    return ResultCode.CODE_ERROR_PHONE_UNSAFE_FAIL;
                case 6:
                    return ResultCode.CODE_ERROR_NO_PERMISSION_FAIL;
                case 7:
                    return ResultCode.CODE_ERROR_NO_SIM_FAIL;
                case '\b':
                    return ResultCode.CODE_ERROR_NO_MOBILE_NETWORK_FAIL;
                case '\t':
                    return ResultCode.CODE_ERROR_OPERATOR_UNKNOWN_FAIL;
                case '\n':
                    return ResultCode.CODE_ERROR_UNKNOWN_FAIL;
                case 11:
                    return ResultCode.CODE_ERROR_FUNCTION_DEMOTE;
                case '\f':
                    return ResultCode.CODE_ERROR_FUNCTION_LIMIT;
                case '\r':
                    return ResultCode.CODE_ERROR_USER_SWITCH;
                default:
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

    @Override // com.mobile.auth.gatewayauth.manager.compat.ResultCodeProcessor
    public String convertCode(String str) {
        try {
            return O000000o(str);
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

    @Override // com.mobile.auth.gatewayauth.manager.compat.ResultCodeProcessor
    public TokenRet convertErrorInfo(String str, String str2, String str3) {
        try {
            TokenRet tokenRet = new TokenRet();
            tokenRet.setCode(O000000o(str));
            tokenRet.setMsg(str2);
            tokenRet.setVendorName(str3);
            return tokenRet;
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

    @Override // com.mobile.auth.gatewayauth.manager.compat.ResultCodeProcessor
    public String getApiLevel() {
        try {
            return String.valueOf(1);
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
