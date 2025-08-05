package com.taobao.taolive.taolivemorelive.morelive.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.c;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;

/* loaded from: classes8.dex */
public class TabMenuRequest implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String anchorId;
    private String liveId;
    private String useWelfareCenterEntry;
    private String API_NAME = "mtop.mediaplatform.live.slide.tabinfo";
    public String VERSION = "3.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public String appVersion = c.a();

    public String getAnchorId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("308bb293", new Object[]{this}) : this.anchorId;
    }

    public void setAnchorId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc7fa43", new Object[]{this, str});
        } else {
            this.anchorId = str;
        }
    }

    public String getLiveId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this}) : this.liveId;
    }

    public void setLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.liveId = str;
        }
    }

    public String getUseWelfareCenterEntry() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6952eb17", new Object[]{this}) : this.useWelfareCenterEntry;
    }

    public void setUseWelfareCenterEntry(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1765a5a7", new Object[]{this, str});
        } else {
            this.useWelfareCenterEntry = str;
        }
    }
}
