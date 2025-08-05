package com.alipay.mobile.security.bio.workspace;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisClientConfig;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisClientConfigContent;
import com.alipay.mobile.security.bio.common.statistics.RecordExtAction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class JsonBioParameterToBioApp extends BaseBioParameterToBioApp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(JsonBioParameterToBioApp jsonBioParameterToBioApp, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public JsonBioParameterToBioApp(Context context, BioTransfer bioTransfer) {
        super(context, bioTransfer);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    @Override // com.alipay.mobile.security.bio.workspace.BaseBioParameterToBioApp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.mobile.security.bio.service.BioAppDescription toBioApp(com.alipay.mobile.security.bio.api.BioParameter r13) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.workspace.JsonBioParameterToBioApp.toBioApp(com.alipay.mobile.security.bio.api.BioParameter):com.alipay.mobile.security.bio.service.BioAppDescription");
    }

    private String a(String str) {
        BisClientConfigContent bisClientConfigContent;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        BisClientConfig bisClientConfig = (BisClientConfig) JSON.parseObject(str, BisClientConfig.class);
        if (bisClientConfig == null || (bisClientConfigContent = (BisClientConfigContent) JSON.parseObject(bisClientConfig.getContent(), BisClientConfigContent.class)) == null || bisClientConfigContent.getType() != 200 || (parseObject = JSONObject.parseObject(bisClientConfigContent.getAndroidcfg())) == null) {
            return "";
        }
        if (this.f5827a.fcStep != 0) {
            return this.f5827a.fcStep == 1 ? b(parseObject, false) : "";
        }
        HashMap hashMap = new HashMap();
        this.f5827a.fcToken = bisClientConfigContent.getToken();
        hashMap.put("fcToken", this.f5827a.fcToken);
        this.f5827a.mRecordExtService.write(RecordExtAction.RECORD_FC_ENTRY_SDK, hashMap);
        hashMap.put("params", str);
        this.f5827a.mRecordExtService.write(RecordExtAction.RECORD_FC_GET_PARAM, hashMap);
        return a(parseObject, false);
    }
}
