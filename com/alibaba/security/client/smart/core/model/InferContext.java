package com.alibaba.security.client.smart.core.model;

import android.os.Build;
import android.os.Process;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.build.C1262xa;
import com.alibaba.security.ccrc.service.build.Ta;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.constants.BaseConfigKey;
import com.alibaba.security.wukong.model.meta.Data;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.weex_framework.util.a;
import com.taobao.avplayer.TBPlayerConst;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class InferContext implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "appKey")
    public String appKey;
    @JSONField(name = "appName")
    public String appName;
    @JSONField(name = "bizFeatures")
    public Map<String, Object> bizFeatures;
    @JSONField(name = Ta.h)
    public String ccrcCode;
    @JSONField(name = "ccrcResults")
    public Map<String, Object> ccrcResults;
    @JSONField(name = ChangeAppIconBridge.KEY_DEVICEMODEL)
    public String deviceModel;
    @JSONField(name = "metaId")
    public String metaId;
    @JSONField(name = "osName")
    public String osName;
    @JSONField(name = "osVersion")
    public String osVersion;
    @JSONField(name = MspDBHelper.BizEntry.COLUMN_NAME_PID)
    public String pid;
    @JSONField(name = "prepareID")
    public String prepareID;
    @JSONField(name = a.ATOM_raw)
    public Map<String, Object> raw;
    @JSONField(name = TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName)
    public String sceneName;
    @JSONField(name = "sdkVersion")
    public String sdkVersion;
    @JSONField(name = "sgBizId")
    public int sgBizId;
    @JSONField(name = "utdid")
    public String utdid;
    @JSONField(name = "wukong_uuid")
    public String wukong_uuid;

    public InferContext() {
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return UUID.randomUUID().toString() + "_ANDROID_WUKONG_" + System.currentTimeMillis() + "_" + Process.myPid();
    }

    @JSONField(serialize = false)
    public Map<String, Object> getAlgoResults() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b37ca29", new Object[]{this});
        }
        HashMap hashMap = new HashMap(getCcrcResults());
        hashMap.remove("dataId");
        hashMap.remove("metaId");
        hashMap.remove("riskId");
        return hashMap;
    }

    public Map<String, Object> getCcrcResults() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("76ca23ab", new Object[]{this});
        }
        if (this.ccrcResults == null) {
            this.ccrcResults = new HashMap();
        }
        return this.ccrcResults;
    }

    @JSONField(serialize = false)
    public Map<String, Object> getExtras() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("cf016b95", new Object[]{this}) : (Map) getCcrcResults().get("extras");
    }

    @JSONField(serialize = false)
    public String getMetaId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("76fc2fc3", new Object[]{this}) : (String) getCcrcResults().get("metaId");
    }

    @JSONField(serialize = false)
    public String getRiskId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f0d617b9", new Object[]{this}) : (String) getCcrcResults().get("riskId");
    }

    @JSONField(serialize = false)
    public SampleData getSampleData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SampleData) ipChange.ipc$dispatch("81723e78", new Object[]{this}) : (SampleData) getCcrcResults().get(BaseConfigKey.KEY_SAMPLE_DATA);
    }

    @JSONField(serialize = false)
    public String getSampleID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("25281e", new Object[]{this}) : (String) getCcrcResults().get("dataId");
    }

    public void removeSample() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462914d5", new Object[]{this});
        } else {
            getCcrcResults().remove(BaseConfigKey.KEY_SAMPLE_DATA);
        }
    }

    public InferContext(String str, String str2, String str3, int i, String str4, Map<String, Object> map) {
        Data data;
        this.ccrcCode = str;
        this.pid = str2;
        this.deviceModel = Build.MODEL;
        this.prepareID = str3;
        this.osName = "Android";
        this.osVersion = Build.VERSION.RELEASE;
        this.appKey = CcrcContextImpl.getInstance().getAppKey();
        this.appName = CcrcContextImpl.getInstance().getAppName();
        this.sdkVersion = "1.16.1";
        this.wukong_uuid = a();
        this.sceneName = str4;
        this.utdid = UTDevice.getUtdid(CcrcContextImpl.getContext());
        this.ccrcResults = map;
        this.bizFeatures = C1262xa.a(str);
        this.sgBizId = i;
        SampleData sampleData = getSampleData();
        if (sampleData == null || (data = sampleData.mRawData) == null) {
            return;
        }
        this.raw = data.getRawMap();
    }
}
