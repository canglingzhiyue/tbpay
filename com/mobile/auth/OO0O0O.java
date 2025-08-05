package com.mobile.auth;

import android.content.Context;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.pns_vendor_query.UploadRB;
import com.mobile.auth.gatewayauth.network.RequestState;
import com.mobile.auth.gatewayauth.network.RequestUtil;
import com.mobile.auth.gatewayauth.sdktools.upload.pns.model.PnsUploadRequest;
import com.mobile.auth.gatewayauth.sdktools.upload.pns.model.UploadMonitorDTO;
import com.nirvana.tools.jsoner.a;
import com.nirvana.tools.jsoner.d;
import org.json.JSONObject;
import tb.czp;
import tb.icf;

/* loaded from: classes4.dex */
public class OO0O0O implements com.mobile.auth.gatewayauth.O000000o {
    @Override // com.mobile.auth.gatewayauth.O000000o
    public boolean O000000o(String str) {
        try {
            if (!com.mobile.auth.gatewayauth.utils.O0000Oo0.O00000Oo()) {
                czp.a().a(new Runnable() { // from class: com.mobile.auth.OO0O0O.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            OO0oO.O000000o((Context) null).O00000o0();
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, 1500L);
                return true;
            } else if (!RequestState.getInstance().checkTokenValied(1)) {
                czp.a().a(new Runnable() { // from class: com.mobile.auth.OO0O0O.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            OO0oO.O000000o((Context) null).O00000o0();
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, 1500L);
                return true;
            } else {
                PnsUploadRequest pnsUploadRequest = new PnsUploadRequest();
                try {
                    pnsUploadRequest.setUploadMonitorDTOList(a.a(str, new d<UploadMonitorDTO>() { // from class: com.mobile.auth.OO0O0O.3
                    }));
                    JSONObject json = pnsUploadRequest.toJson();
                    UploadRB fromJson = UploadRB.fromJson(RequestUtil.uploadUserTrackInfoByPop(RequestState.getInstance().getKeyRespone().getSk(), json.toString()));
                    OO0oO O000000o = OO0oO.O000000o((Context) null);
                    if (O000000o != null) {
                        O000000o.O000000o(fromJson);
                    }
                    czp.a().a(new Runnable() { // from class: com.mobile.auth.OO0O0O.4
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                OO0oO.O000000o((Context) null).O00000o0();
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }
                    }, 1500L);
                    if (fromJson == null || fromJson.getAlibaba_aliqin_psc_info_upload_response() == null || fromJson.getAlibaba_aliqin_psc_info_upload_response().getResult() == null || !icf.a.CONTROL_NAME_OK.equals(fromJson.getAlibaba_aliqin_psc_info_upload_response().getResult().getCode())) {
                        json.put("uploadResult2_0", "failed");
                        return false;
                    }
                    json.put("uploadResult2_0", "success");
                    return true;
                } catch (Exception e) {
                    com.mobile.auth.gatewayauth.utils.O0000Oo0.O000000o(e);
                    czp.a().a(new Runnable() { // from class: com.mobile.auth.OO0O0O.5
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                OO0oO.O000000o((Context) null).O00000o0();
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }
                    }, 1500L);
                    return false;
                }
            }
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
}
