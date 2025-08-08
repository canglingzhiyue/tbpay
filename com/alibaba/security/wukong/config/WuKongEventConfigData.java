package com.alibaba.security.wukong.config;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class WuKongEventConfigData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int bizId;
    public String ccrcCode;
    public ArrayList<String> crc32Hashs;
    public String defaultRiskData;
    public String event;
    public String eventCode;
    public long lastModifyTime;
    public ArrayList<String> mtops;
    public String notHitRiskData;
    public List<RiskSceneInfo> sceneList;
    public String versionInfo;

    @JSONField(serialize = false)
    private List<Algo> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        List<RiskSceneInfo> list = this.sceneList;
        if (list != null) {
            for (RiskSceneInfo riskSceneInfo : list) {
                arrayList.addAll(riskSceneInfo.algoList);
            }
        }
        return arrayList;
    }

    public Map<String, Object> getAlgoConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8e9178f1", new Object[]{this, str});
        }
        for (Algo algo : a()) {
            if (StringUtils.equals(algo.code, str)) {
                return algo.config;
            }
        }
        return null;
    }

    public List<Algo> getBehaviorList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ca74149a", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (Algo algo : a()) {
            if (algo.isBehavior()) {
                arrayList.add(algo);
            }
        }
        return arrayList;
    }

    public List<Algo> getPythonList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d7a6c550", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (Algo algo : a()) {
            if (algo.isPython()) {
                arrayList.add(algo);
            }
        }
        return arrayList;
    }

    @JSONField(serialize = false)
    public boolean isAlgoListIsEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e83d5973", new Object[]{this})).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        for (Algo algo : a()) {
            if (algo.isPython() || algo.isCpp()) {
                arrayList.add(algo);
            }
        }
        return arrayList.isEmpty();
    }

    public boolean isHaveCppAlgo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b9c570f", new Object[]{this})).booleanValue();
        }
        List<RiskSceneInfo> list = this.sceneList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Algo algo : a()) {
            if (algo.isCpp()) {
                arrayList.add(algo);
            }
        }
        return arrayList.isEmpty();
    }

    @JSONField(serialize = false)
    public boolean isValid(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77e5607", new Object[]{this, str})).booleanValue() : !StringUtils.isEmpty(this.ccrcCode) && this.ccrcCode.equals(str) && !StringUtils.isEmpty(this.eventCode) && this.sceneList != null;
    }
}
