package com.mobile.auth.gatewayauth.network;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.ali.user.open.core.util.ParamsConstants;
import com.mobile.auth.OO00OOO;
import com.mobile.auth.OO00Oo0;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.ConfigRule;
import com.mobile.auth.gatewayauth.model.DowngradeConfig;
import com.mobile.auth.gatewayauth.model.DowngradeInfoList;
import com.mobile.auth.gatewayauth.model.LimitConfig;
import com.mobile.auth.gatewayauth.model.RStruct;
import com.mobile.auth.gatewayauth.model.TopErrorResponse;
import com.mobile.auth.gatewayauth.model.UploadLog;
import com.mobile.auth.gatewayauth.model.pns_vendor_query.PscInfoUploadResponse;
import com.mobile.auth.gatewayauth.model.pns_vendor_query.UploadRB;
import com.mobile.auth.gatewayauth.model.popsdkconfig.ConfigData;
import com.mobile.auth.gatewayauth.model.popsdkconfig.DownGradleConfig;
import com.mobile.auth.gatewayauth.model.popsdkconfig.SDKConfigData;
import com.mobile.auth.gatewayauth.model.popsdkconfig.SDKConfigRespone;
import com.mobile.auth.gatewayauth.model.popsdkconfig.UploadData;
import com.mobile.auth.gatewayauth.model.psc_info_upload.AllRBInfo;
import com.mobile.auth.gatewayauth.model.psc_info_upload.Module;
import com.mobile.auth.gatewayauth.model.psc_info_upload.ModuleList;
import com.mobile.auth.gatewayauth.model.psc_info_upload.PnsVendorQueryResponse;
import com.mobile.auth.gatewayauth.model.psc_sdk_config.ConfigRB;
import com.mobile.auth.gatewayauth.model.psc_sdk_config.PscQueryConfigResponse;
import com.mobile.auth.gatewayauth.model.psc_sdk_config.Result;
import com.mobile.auth.gatewayauth.utils.AESUtils;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import com.mobile.auth.gatewayauth.utils.O0000Oo0;
import com.mobile.auth.gatewayauth.utils.security.PackageUtils;
import com.nirvana.tools.jsoner.a;
import com.nirvana.tools.jsoner.d;
import com.taobao.accs.common.Constants;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.czn;
import tb.icf;

/* loaded from: classes4.dex */
public class RequestUtil {
    public static final String PUBLIC_SECKEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCLShWjAtxJv3g2VPIYOOAv4rnVDdLkdseKm7+KOkCBLV9SKY5oqksFaXcLZ+nRnjnczhze5eGKhevwliUyag6x96GyXI2WagKIoB7Uwl2byl0xB5bNvYzf+x/DKHTSoGJshU6shXWXcjGFq+mUiPhM3WGZoqdY+vvqOWD+tga8XQIDAQAB";
    private static final String SERVEL_URL = "https://dypnsapi.aliyuncs.com/?";

    private static String assembleCustomizeToken(Context context, String str, String str2) {
        try {
            try {
                String packageName = PackageUtils.getPackageName(context);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ParamsConstants.Key.PARAM_SCENE_CODE, str);
                jSONObject.put("packageName", packageName);
                jSONObject.put("packageSign", PackageUtils.getSign(context));
                jSONObject.put(Constants.KEY_OS_TYPE, "Android");
                String generateAesKey = EncryptUtils.generateAesKey();
                RStruct rStruct = new RStruct();
                rStruct.setC(AESUtils.encryptString2Base64(jSONObject.toString(), generateAesKey, EncryptUtils.IV_PARAMETER_SPEC));
                rStruct.setK(EncryptUtils.encrpytAESKey(PUBLIC_SECKEY, generateAesKey));
                rStruct.setRid(str2);
                return czn.a.a(a.a(rStruct, (List<Field>) null).toString().getBytes());
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
            return null;
        }
    }

    private static LimitConfig getConfig(ConfigData configData) {
        try {
            LimitConfig limitConfig = new LimitConfig();
            if (configData == null) {
                return null;
            }
            limitConfig.setIs_limited(configData.getIsLimited());
            limitConfig.setLimit_count(configData.getLimitCount());
            limitConfig.setLimit_time_hour(configData.getLimitTimeHour());
            limitConfig.setMsg(configData.getMsg());
            return limitConfig;
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

    public static OO00Oo0 getPrivateKey(Context context, String str, String str2) {
        try {
            PrivacteKeyRequest privacteKeyRequest = new PrivacteKeyRequest();
            privacteKeyRequest.setSign(false);
            privacteKeyRequest.setAction("GetStsToken");
            privacteKeyRequest.setBaseUrl(SERVEL_URL);
            privacteKeyRequest.setRequestMethod("POST");
            privacteKeyRequest.setTerminalInfo(assembleCustomizeToken(context, str, str2));
            OO00Oo0 O00000Oo = OO00OOO.O000000o().O000000o(privacteKeyRequest).O00000Oo();
            RequestState.getInstance().setUseRequest(false);
            O0000Oo0.O000000o("getPrivateKey result:" + O00000Oo.O000000o());
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

    public static String getSDKConfigByPop(String str, String str2) {
        JSONObject jSONObject;
        try {
            O0000Oo0.O000000o("getSDKConfig:" + str2);
            SDKConfigRequest sDKConfigRequest = new SDKConfigRequest();
            sDKConfigRequest.setTerminalInfo(str2);
            sDKConfigRequest.setSign(true);
            sDKConfigRequest.setAction("QuerySdkConfig");
            sDKConfigRequest.setBaseUrl(SERVEL_URL);
            sDKConfigRequest.setAccessKeySecret(str);
            sDKConfigRequest.setSecurityToken(RequestState.getInstance().getKeyRespone().getStsToken());
            sDKConfigRequest.setAccessKeyId(RequestState.getInstance().getKeyRespone().getAk());
            sDKConfigRequest.setRequestMethod("POST");
            OO00Oo0 O00000Oo = OO00OOO.O000000o().O000000o(sDKConfigRequest).O00000Oo();
            ConfigRB configRB = new ConfigRB();
            if (!O00000Oo.O00000Oo() || StringUtils.isEmpty(O00000Oo.O000000o())) {
                TopErrorResponse topErrorResponse = new TopErrorResponse();
                topErrorResponse.setCode(-1);
                topErrorResponse.setMsg("result is ermpty");
                configRB.setErrorResponse(topErrorResponse);
            } else {
                try {
                    jSONObject = new JSONObject(O00000Oo.O000000o());
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject = null;
                }
                SDKConfigRespone sDKConfigRespone = (SDKConfigRespone) a.a(jSONObject, (d<Object>) new d<SDKConfigRespone>() { // from class: com.mobile.auth.gatewayauth.network.RequestUtil.2
                }, (List<Field>) null);
                if (icf.a.CONTROL_NAME_OK.equals(sDKConfigRespone.getCode())) {
                    ArrayList arrayList = new ArrayList();
                    SDKConfigData data = sDKConfigRespone.getData();
                    if (data.getDownGradeInfoList() != null && data.getDownGradeInfoList().size() > 0) {
                        for (int i = 0; i < data.getDownGradeInfoList().size(); i++) {
                            DownGradleConfig downGradleConfig = data.getDownGradeInfoList().get(i);
                            DowngradeConfig downgradeConfig = new DowngradeConfig();
                            downgradeConfig.setDowngrade(downGradleConfig.isDownGrade());
                            downgradeConfig.setDowngrade_name(downGradleConfig.getDownGradeName());
                            arrayList.add(downgradeConfig);
                        }
                    }
                    ConfigRule configRule = new ConfigRule();
                    if (arrayList.size() > 0) {
                        DowngradeInfoList downgradeInfoList = new DowngradeInfoList();
                        downgradeInfoList.setDowngradeInfo(arrayList);
                        configRule.setDowngradeInfoList(downgradeInfoList);
                    }
                    configRule.setIs_auth_demoted(data.getIsAuthDemoted());
                    configRule.setIs_crash_demoted(data.getIsCrashDemoted());
                    configRule.setIs_demoted(data.getIsDemoted());
                    configRule.setIs_login_demoted(data.getIsLoginDemoted());
                    configRule.setIs_sls_demoted(data.getIsSLSDemoted());
                    UploadLog uploadLog = new UploadLog();
                    uploadLog.setEnd_time(data.getUploadLog().getEndTime());
                    uploadLog.setLevel(data.getUploadLog().getLevel());
                    uploadLog.setStart_time(data.getUploadLog().getStartTime());
                    configRule.setUpload_log(uploadLog);
                    configRule.setAuth_token(getConfig(data.getAuthToken()));
                    configRule.setGet_config(getConfig(data.getGetConfig()));
                    configRule.setGet_vendor_list(getConfig(data.getGetVendorList()));
                    configRule.setLogin_page(getConfig(data.getLoginPage()));
                    configRule.setLogin_phone(getConfig(data.getLoginPhone()));
                    configRule.setLogin_token(getConfig(data.getLoginToken()));
                    configRule.setSls(getConfig(data.getSls()));
                    Result result = new Result();
                    result.setModel(configRule);
                    result.setCode(sDKConfigRespone.getCode());
                    result.setMsg(sDKConfigRespone.getMessage());
                    PscQueryConfigResponse pscQueryConfigResponse = new PscQueryConfigResponse();
                    pscQueryConfigResponse.setRequest_id(sDKConfigRespone.getRequestId());
                    pscQueryConfigResponse.setResult(result);
                    configRB.setResponse(pscQueryConfigResponse);
                } else {
                    TopErrorResponse topErrorResponse2 = new TopErrorResponse();
                    topErrorResponse2.setCode(-1);
                    String str3 = "";
                    topErrorResponse2.setMsg(sDKConfigRespone == null ? str3 : sDKConfigRespone.getMessage());
                    if (sDKConfigRespone != null) {
                        str3 = sDKConfigRespone.getRequestId();
                    }
                    topErrorResponse2.setRequestId(str3);
                    configRB.setErrorResponse(topErrorResponse2);
                }
            }
            JSONObject jsonControlPop = configRB.toJsonControlPop();
            if (configRB.getErrorResponse() == null) {
                jsonControlPop.remove("error_response");
            }
            if (configRB.getResponse() == null) {
                jsonControlPop.remove(InputFrame3.TYPE_RESPONSE);
            }
            return jsonControlPop.toString();
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

    public static String getVendorListByPop(String str, String str2) {
        JSONObject jSONObject;
        try {
            O0000Oo0.O000000o("getVendorList:" + str2);
            VendorListRequest vendorListRequest = new VendorListRequest();
            vendorListRequest.setTerminalInfo(str2);
            vendorListRequest.setSign(true);
            vendorListRequest.setAction("QuerySceneVendorInfoList");
            vendorListRequest.setBaseUrl(SERVEL_URL);
            vendorListRequest.setAccessKeySecret(str);
            vendorListRequest.setSecurityToken(RequestState.getInstance().getKeyRespone().getSk());
            vendorListRequest.setAccessKeyId(RequestState.getInstance().getKeyRespone().getSk());
            vendorListRequest.setRequestMethod("POST");
            OO00Oo0 O00000Oo = OO00OOO.O000000o().O000000o(vendorListRequest).O00000Oo();
            AllRBInfo allRBInfo = new AllRBInfo();
            if (!O00000Oo.O00000Oo() || StringUtils.isEmpty(O00000Oo.O000000o())) {
                TopErrorResponse topErrorResponse = new TopErrorResponse();
                topErrorResponse.setCode(-1);
                topErrorResponse.setMsg("result is ermpty");
                allRBInfo.setErrorResponse(topErrorResponse);
            } else {
                try {
                    jSONObject = new JSONObject(O00000Oo.O000000o());
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject = null;
                }
                VendorRespone vendorRespone = (VendorRespone) a.a(jSONObject, (d<Object>) new d<VendorRespone>() { // from class: com.mobile.auth.gatewayauth.network.RequestUtil.1
                }, (List<Field>) null);
                if (icf.a.CONTROL_NAME_OK.equals(vendorRespone.getCode())) {
                    ArrayList arrayList = new ArrayList();
                    if (vendorRespone.getData() != null && vendorRespone.getData().size() > 0) {
                        for (int i = 0; i < vendorRespone.getData().size(); i++) {
                            VendorListRespone vendorListRespone = vendorRespone.getData().get(i);
                            Module module = new Module();
                            module.setVendor_access_id(vendorListRespone.getVendorAccessId());
                            module.setVendor_access_secret(vendorListRespone.getVendorAccessSecret());
                            module.setVendor_key(vendorListRespone.getVendorKey());
                            arrayList.add(module);
                        }
                    }
                    ModuleList moduleList = new ModuleList();
                    moduleList.setModule(arrayList);
                    com.mobile.auth.gatewayauth.model.psc_info_upload.Result result = new com.mobile.auth.gatewayauth.model.psc_info_upload.Result();
                    result.setCode(vendorRespone.getCode());
                    result.setMessage(vendorRespone.getMessage());
                    result.setModule_list(moduleList);
                    PnsVendorQueryResponse pnsVendorQueryResponse = new PnsVendorQueryResponse();
                    pnsVendorQueryResponse.setRequest_id(vendorRespone.getRequestId());
                    pnsVendorQueryResponse.setResult(result);
                    allRBInfo.setResponse(pnsVendorQueryResponse);
                } else {
                    TopErrorResponse topErrorResponse2 = new TopErrorResponse();
                    topErrorResponse2.setCode(-1);
                    String str3 = "";
                    topErrorResponse2.setMsg(vendorRespone == null ? str3 : vendorRespone.getMessage());
                    if (vendorRespone != null) {
                        str3 = vendorRespone.getRequestId();
                    }
                    topErrorResponse2.setRequestId(str3);
                    allRBInfo.setErrorResponse(topErrorResponse2);
                }
            }
            return allRBInfo.toJson().toString();
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

    public static String uploadUserTrackInfoByPop(String str, String str2) throws IOException {
        JSONObject jSONObject;
        try {
            O0000Oo0.O000000o("uploadUserTrackInfoByPop:" + str2);
            UploadRequest uploadRequest = new UploadRequest();
            uploadRequest.setUploadInfo(str2);
            uploadRequest.setSign(true);
            uploadRequest.setAction("UploadMonitorInfo");
            uploadRequest.setBaseUrl(SERVEL_URL);
            uploadRequest.setAccessKeySecret(str);
            uploadRequest.setSecurityToken(RequestState.getInstance().getKeyRespone().getStsToken());
            uploadRequest.setAccessKeyId(RequestState.getInstance().getKeyRespone().getAk());
            uploadRequest.setRequestMethod("POST");
            OO00Oo0 O00000Oo = OO00OOO.O000000o().O000000o(uploadRequest).O00000Oo();
            UploadRB uploadRB = new UploadRB();
            if (O00000Oo.O00000Oo() && !StringUtils.isEmpty(O00000Oo.O000000o())) {
                try {
                    jSONObject = new JSONObject(O00000Oo.O000000o());
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject = null;
                }
                UploadData uploadData = (UploadData) a.a(jSONObject, (d<Object>) new d<UploadData>() { // from class: com.mobile.auth.gatewayauth.network.RequestUtil.3
                }, (List<Field>) null);
                O0000Oo0.O000000o("uploadUserTrackInfoByPop respone:" + uploadData.getCode() + "  " + uploadData.getMessage());
                if (icf.a.CONTROL_NAME_OK.equals(uploadData.getCode())) {
                    PscInfoUploadResponse pscInfoUploadResponse = new PscInfoUploadResponse();
                    com.mobile.auth.gatewayauth.model.pns_vendor_query.Result result = new com.mobile.auth.gatewayauth.model.pns_vendor_query.Result();
                    result.setCode(uploadData.getCode());
                    result.setMessage(uploadData.getMessage());
                    pscInfoUploadResponse.setRequest_id(uploadData.getRequestId());
                    pscInfoUploadResponse.setResult(result);
                    uploadRB.setAlibaba_aliqin_psc_info_upload_response(pscInfoUploadResponse);
                }
            }
            O0000Oo0.O000000o("uploadUserTrackInfoByPop result:" + uploadRB.toJson().toString());
            return uploadRB.toJson().toString();
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
