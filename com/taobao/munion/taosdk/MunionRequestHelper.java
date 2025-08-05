package com.taobao.munion.taosdk;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.net.pojo.request.AlimamaZzAdGetRequest;
import com.taobao.alimama.net.pojo.request.SendCpcInfoRequest;
import com.taobao.alimama.net.pojo.request.SendCpmInfoRequest;
import com.taobao.alimama.net.pojo.request.SendCpsNewInfoRequest;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.utils.Global;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class MunionRequestHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(681349182);
    }

    public static SendCpcInfoRequest getCpcInfoRequest(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SendCpcInfoRequest) ipChange.ipc$dispatch("d2d134c1", new Object[]{context, str, str2});
        }
        SendCpcInfoRequest sendCpcInfoRequest = new SendCpcInfoRequest();
        sendCpcInfoRequest.setCna("");
        sendCpcInfoRequest.setExt("");
        sendCpcInfoRequest.setReferer("");
        sendCpcInfoRequest.setUtkey("");
        sendCpcInfoRequest.setUtsid("");
        sendCpcInfoRequest.setHost("");
        sendCpcInfoRequest.setE(str2);
        sendCpcInfoRequest.setUtdid(MunionDeviceUtil.getUtdid(context));
        sendCpcInfoRequest.setAccept(MunionDeviceUtil.getAccept(context, str));
        sendCpcInfoRequest.setClickid(str);
        return sendCpcInfoRequest;
    }

    public static SendCpmInfoRequest getCpmInfoRequest(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SendCpmInfoRequest) ipChange.ipc$dispatch("7a02a181", new Object[]{context, str, str2});
        }
        SendCpmInfoRequest sendCpmInfoRequest = new SendCpmInfoRequest();
        sendCpmInfoRequest.setCna("");
        sendCpmInfoRequest.setE(str2);
        sendCpmInfoRequest.setExt("");
        sendCpmInfoRequest.setReferer("");
        sendCpmInfoRequest.setUtdid(MunionDeviceUtil.getUtdid(context));
        sendCpmInfoRequest.setAccept(MunionDeviceUtil.getAccept(context, str));
        sendCpmInfoRequest.setUseragent(MunionDeviceUtil.getUserAgent());
        sendCpmInfoRequest.setClickid(str);
        return sendCpmInfoRequest;
    }

    public static SendCpsNewInfoRequest getCpsNewInfoRequest(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SendCpsNewInfoRequest) ipChange.ipc$dispatch("3549b0f3", new Object[]{context, str, str2});
        }
        SendCpsNewInfoRequest sendCpsNewInfoRequest = new SendCpsNewInfoRequest();
        sendCpsNewInfoRequest.eUrl = str;
        sendCpsNewInfoRequest.eParam = str2;
        return sendCpsNewInfoRequest;
    }

    public static AlimamaZzAdGetRequest getZzAdGetRequest(Context context, String str, String[] strArr, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlimamaZzAdGetRequest) ipChange.ipc$dispatch("d95afa4b", new Object[]{context, str, strArr, map});
        }
        AlimamaZzAdGetRequest alimamaZzAdGetRequest = new AlimamaZzAdGetRequest();
        alimamaZzAdGetRequest.pid = TextUtils.join(",", Arrays.asList(strArr));
        alimamaZzAdGetRequest.pvid = UUID.randomUUID().toString().replaceAll("-", "");
        alimamaZzAdGetRequest.st = "android_native";
        if (str == null) {
            str = "";
        }
        alimamaZzAdGetRequest.userid = str;
        alimamaZzAdGetRequest.app_version = Global.getVersionName();
        alimamaZzAdGetRequest.utdid = MunionDeviceUtil.getUtdid(context);
        alimamaZzAdGetRequest.X_Client_Scheme = "https";
        return (AlimamaZzAdGetRequest) addExInfoForRequest(alimamaZzAdGetRequest, map);
    }

    private static IMTOPDataObject addExInfoForRequest(IMTOPDataObject iMTOPDataObject, Map<String, String> map) {
        Field[] fields;
        if (map != null && !map.isEmpty()) {
            try {
                for (Field field : iMTOPDataObject.getClass().getFields()) {
                    String name = field.getName();
                    JSONField jSONField = (JSONField) field.getAnnotation(JSONField.class);
                    if (jSONField != null && !TextUtils.isEmpty(jSONField.name())) {
                        name = jSONField.name();
                    }
                    String str = map.get(name);
                    if (str != null) {
                        try {
                            field.set(iMTOPDataObject, str);
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return iMTOPDataObject;
    }
}
