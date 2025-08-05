package com.taobao.taolive.taolivemorelive.moreliveguide.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.c;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;

/* loaded from: classes8.dex */
public class MoreGuideSlideTipsRequest implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String anchorId;
    public String entryLiveId;
    public String entryLiveSource;
    public String entrySpm;
    public String extendParams;
    public String liveId;
    public String liveSource;
    public boolean needRec;
    public String tppParam;
    private String API_NAME = "mtop.mediaplatform.live.slide.entry";
    public String VERSION = "1.0";
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

    public String getLiveSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd7f76fc", new Object[]{this}) : this.liveSource;
    }

    public void setLiveSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2958effa", new Object[]{this, str});
        } else {
            this.liveSource = str;
        }
    }

    public String getEntryLiveId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48e5b1d6", new Object[]{this}) : this.entryLiveId;
    }

    public void setEntryLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb87b7c8", new Object[]{this, str});
        } else {
            this.entryLiveId = str;
        }
    }

    public String getEntrySpm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("649f3e25", new Object[]{this}) : this.entrySpm;
    }

    public void setEntrySpm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba25e0f1", new Object[]{this, str});
        } else {
            this.entrySpm = str;
        }
    }

    public String getEntryLiveSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d835ead6", new Object[]{this}) : this.entryLiveSource;
    }

    public void setEntryLiveSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8af44c8", new Object[]{this, str});
        } else {
            this.entryLiveSource = str;
        }
    }

    public void setNeedRec(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00164d5", new Object[]{this, new Boolean(z)});
        } else {
            this.needRec = z;
        }
    }

    public boolean getNeedRec() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ebab166f", new Object[]{this})).booleanValue() : this.needRec;
    }

    public void setTppParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83d8a4c", new Object[]{this, str});
        } else {
            this.tppParam = str;
        }
    }

    public String getTppParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("548f7d6a", new Object[]{this}) : this.tppParam;
    }

    public String getExtendParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ff4c103", new Object[]{this}) : this.extendParams;
    }

    public void setExtendParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f41d3d3", new Object[]{this, str});
        } else {
            this.extendParams = str;
        }
    }
}
