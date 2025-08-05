package com.alibaba.idst.nls.nlsclientsdk.requests;

import com.alibaba.fastjson.JSON;
import com.alibaba.idst.nls.nlsclientsdk.util.IdGen;
import com.alibaba.idst.nls.nlsclientsdk.util.NlsUserTrack;
import com.alibaba.security.realidentity.g4;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class SpeechReqProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String task_id;
    public String accessToken;
    public Map<String, String> header = new HashMap();
    public Map<String, Object> payload = new HashMap();
    public Map<String, Object> context = new HashMap();

    static {
        kge.a(-1315136622);
    }

    public SpeechReqProtocol() {
        this.header.put(Constant.PROP_MESSAGE_ID, IdGen.genId());
        this.context.put(g4.a.f3423a, sdkInfo());
        NlsUserTrack.getInstance().setSpeechRequest(this);
    }

    public void setDeviceInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81325c37", new Object[]{this, str});
        } else if (str == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("uuid", str);
            this.context.put(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, hashMap);
        }
    }

    public String getAppKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49079005", new Object[]{this}) : this.header.get("appkey");
    }

    public void setAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{this, str});
        } else {
            this.header.put("appkey", str);
        }
    }

    public void setTaskId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b05593", new Object[]{this, str});
            return;
        }
        task_id = str;
        this.header.put("task_id", task_id);
    }

    public String getTaskId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54ada043", new Object[]{this}) : task_id;
    }

    public void addCustomedParam(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576ba9", new Object[]{this, str, obj});
        } else {
            this.payload.put(str, obj);
        }
    }

    public void removeCustomParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb0d2109", new Object[]{this, str});
        } else if (!this.payload.containsKey(str)) {
        } else {
            this.payload.remove(str);
        }
    }

    public void addContextParam(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6088c", new Object[]{this, str, obj});
        } else {
            this.context.put(str, obj);
        }
    }

    private Map<String, String> sdkInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4c69484", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", "nui-android-lite");
        hashMap.put(LoggingSPCache.STORAGE_LANGUAGE, "java");
        hashMap.put("version", "2.1.0");
        return hashMap;
    }

    public String serialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5378d419", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("header", this.header);
        hashMap.put("payload", this.payload);
        hashMap.put("context", this.context);
        return JSON.toJSONString(hashMap);
    }
}
