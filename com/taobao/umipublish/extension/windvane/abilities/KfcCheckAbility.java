package com.taobao.umipublish.extension.windvane.abilities;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

/* loaded from: classes9.dex */
public class KfcCheckAbility extends MTopAbility implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_INVALID = 0;
    public static final int STATE_VALID = 1;

    static {
        kge.a(1970623500);
        kge.a(-525336021);
    }

    public static /* synthetic */ Object ipc$super(KfcCheckAbility kfcCheckAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.MTopAbility
    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this}) : "7001";
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            successCallback();
        } else {
            KFCRequest kFCRequest = new KFCRequest();
            kFCRequest.params = jSONObject.toJSONString();
            MtopBusiness.build(Mtop.instance(null), kFCRequest).registerListener((IRemoteListener) this).mo1305reqMethod(MethodEnum.POST).mo1312setConnectionTimeoutMilliSecond(5000).startRequest();
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.MTopAbility, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
        try {
            if (dataJsonObject.optBoolean("hit")) {
                org.json.JSONObject optJSONObject = dataJsonObject.optJSONObject("hitData");
                invalidCallback(optJSONObject == null ? null : JSONObject.parseObject(optJSONObject.toString()));
                return;
            }
            successCallback();
        } catch (Throwable th) {
            errorCallback("7001", Log.getStackTraceString(th));
        }
    }

    private void successCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb7a1ef", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", (Object) String.valueOf(1));
        successCallback(jSONObject);
    }

    private void invalidCallback(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9adabd6d", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", (Object) String.valueOf(0));
        jSONObject2.put("invalidData", (Object) jSONObject);
        successCallback(jSONObject2);
    }

    /* loaded from: classes9.dex */
    private static class KFCRequest implements IMTOPDataObject {
        public String API_NAME;
        public boolean NEED_ECODE;
        public boolean NEED_SESSION;
        public String VERSION;
        public String params;

        static {
            kge.a(-2032412993);
            kge.a(-350052935);
        }

        private KFCRequest() {
            this.API_NAME = "mtop.taobao.media.guang.publish.kfcCheck";
            this.VERSION = "1.0";
            this.NEED_ECODE = true;
            this.NEED_SESSION = true;
            this.params = null;
        }
    }
}
