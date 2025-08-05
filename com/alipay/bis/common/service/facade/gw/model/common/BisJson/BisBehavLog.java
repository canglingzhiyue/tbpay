package com.alipay.bis.common.service.facade.gw.model.common.BisJson;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class BisBehavLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BisBehavCommon behavCommon;
    public List<BisBehavTask> behavTask;
    public BisBehavToken behavToken;
    public BisClientInfo clientInfo;
    public Map<String, String> extAttr;

    public BisClientInfo getClientInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BisClientInfo) ipChange.ipc$dispatch("d5cead15", new Object[]{this}) : this.clientInfo;
    }

    public void setClientInfo(BisClientInfo bisClientInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af76437", new Object[]{this, bisClientInfo});
        } else {
            this.clientInfo = bisClientInfo;
        }
    }

    public BisBehavToken getBehavToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BisBehavToken) ipChange.ipc$dispatch("4931a09", new Object[]{this}) : this.behavToken;
    }

    public void setBehavToken(BisBehavToken bisBehavToken) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1b37277", new Object[]{this, bisBehavToken});
        } else {
            this.behavToken = bisBehavToken;
        }
    }

    public BisBehavCommon getBehavCommon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BisBehavCommon) ipChange.ipc$dispatch("eeea4223", new Object[]{this}) : this.behavCommon;
    }

    public void setBehavCommon(BisBehavCommon bisBehavCommon) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee526e53", new Object[]{this, bisBehavCommon});
        } else {
            this.behavCommon = bisBehavCommon;
        }
    }

    public List<BisBehavTask> getBehavTask() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("809ad2d7", new Object[]{this}) : this.behavTask;
    }

    public void setBehavTask(List<BisBehavTask> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbc9cd5", new Object[]{this, list});
        } else {
            this.behavTask = list;
        }
    }

    public Map<String, String> getExtAttr() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d2c652f8", new Object[]{this}) : this.extAttr;
    }

    public void setExtAttr(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d84692e", new Object[]{this, map});
        } else {
            this.extAttr = map;
        }
    }
}
