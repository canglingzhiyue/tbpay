package com.alipay.android.msp.network.model;

import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class RpcRequestDataV2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String action;
    public String api_nm;
    public String api_nsp;
    public String app_key;
    public String certpay;
    public String decay;
    public String dispatchType;
    public String external_info;
    public String extinfo;
    public String hasAlipay;
    public String locLoginOnce;
    public String mqp_apiver;
    public String mqp_bp;
    public String mqp_pa;
    public String mqp_tid;
    public String mqp_ua;
    public String mqp_uac;
    public String mspParam;
    public String secData;
    public String session;
    public String subua1;
    public String subua2;
    public String subua3;
    public String synch;
    public String trdfrom;
    public String trid;
    public String user_id;

    public Map<String, String> getKeyValueMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ca78bdf0", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("api_nsp", this.api_nsp);
        hashMap.put("api_nm", this.api_nm);
        hashMap.put("action", this.action);
        hashMap.put("synch", this.synch);
        hashMap.put(MspGlobalDefine.DECAY, this.decay);
        hashMap.put(MspGlobalDefine.EXTERNAL_INFO, this.external_info);
        hashMap.put("secData", this.secData);
        hashMap.put("user_id", this.user_id);
        hashMap.put(MspGlobalDefine.SESSION, this.session);
        hashMap.put(MspGlobalDefine.TRID, this.trid);
        hashMap.put(MspGlobalDefine.APP_KEY, this.app_key);
        hashMap.put(MspFlybirdDefine.EXTINFO, this.extinfo);
        hashMap.put(MspFlybirdDefine.TRDFROM, this.trdfrom);
        hashMap.put(MspFlybirdDefine.FLYBIRD_LOGIN, this.locLoginOnce);
        hashMap.put("hasAlipay", this.hasAlipay);
        hashMap.put("subua1", this.subua1);
        hashMap.put("subua2", this.subua2);
        hashMap.put("subua3", this.subua3);
        hashMap.put("mqp_apiver", this.mqp_apiver);
        hashMap.put("mqp_bp", this.mqp_bp);
        hashMap.put("mqp_tid", this.mqp_tid);
        hashMap.put("mqp_uac", this.mqp_uac);
        hashMap.put("mqp_ua", this.mqp_ua);
        hashMap.put("mqp_pa", this.mqp_pa);
        hashMap.put("mspParam", this.mspParam);
        hashMap.put("dispatchType", this.dispatchType);
        hashMap.put(MspGlobalDefine.CERTPAY, this.certpay);
        return hashMap;
    }
}
