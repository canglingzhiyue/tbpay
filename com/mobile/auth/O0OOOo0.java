package com.mobile.auth;

import android.content.Context;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.ResultCode;
import com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager;
import com.mobile.auth.gatewayauth.model.psc_info_upload.AllRBInfo;
import com.mobile.auth.gatewayauth.model.psc_info_upload.PnsVendorQueryResponse;
import com.mobile.auth.gatewayauth.model.psc_info_upload.Result;
import com.mobile.auth.gatewayauth.network.RequestState;
import com.mobile.auth.gatewayauth.network.RequestUtil;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;

/* loaded from: classes4.dex */
public class O0OOOo0 extends O0OOOOO<OO0000o> {
    private OO0oO O000000o;
    private VendorSdkInfoManager O00000Oo;

    public O0OOOo0(Context context, VendorSdkInfoManager vendorSdkInfoManager, com.mobile.auth.gatewayauth.manager.O00000Oo o00000Oo, OO0oO oO0oO) {
        super(context, o00000Oo);
        this.O000000o = oO0oO;
        this.O00000Oo = vendorSdkInfoManager;
    }

    @Override // com.mobile.auth.O0OOOOO
    public /* synthetic */ OO0000o O000000o() {
        try {
            return O00000o();
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

    @Override // com.mobile.auth.O0OOOOO
    public /* synthetic */ OO0000o O000000o(String str) {
        try {
            return O00000Oo(str);
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

    public OO0000o O00000Oo(String str) {
        String str2 = "";
        try {
            try {
                if (RequestState.getInstance().checkTokenValied(1)) {
                    str2 = RequestUtil.getVendorListByPop(RequestState.getInstance().getKeyRespone().getSk(), EncryptUtils.encryptToken(O00000o0(), null, null, null, this.O00000Oo.O00000o0(), str, null, null, null, false, null));
                }
                OO0oO oO0oO = this.O000000o;
                oO0oO.O000000o("PopRequest-GetVendorList:" + str2);
            } catch (Exception unused) {
            }
            return new OO0000o(false, str2, str);
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

    public OO0000o O00000o() {
        try {
            AllRBInfo allRBInfo = new AllRBInfo();
            PnsVendorQueryResponse pnsVendorQueryResponse = new PnsVendorQueryResponse();
            Result result = new Result();
            result.setCode(ResultCode.CODE_ERROR_FUNCTION_LIMIT);
            result.setMessage("GetVendorList Limited");
            pnsVendorQueryResponse.setResult(result);
            allRBInfo.setResponse(pnsVendorQueryResponse);
            return new OO0000o(false, allRBInfo.toJson().toString(), "");
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

    public OO0000 O00000oO() {
        try {
            return new OO0000o(true, "{}", "");
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

    @Override // tb.dbc
    public /* synthetic */ OO0000 onTimeout() {
        try {
            return O00000oO();
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
