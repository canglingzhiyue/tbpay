package com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class MtopTbliveGrowthApiPopCheckPopRequest implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String API_NAME = "mtop.tblive.growth.api.pop.checkPop";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String bizCode = null;
    private String urlParams = null;
    private String entryLiveSource = null;
    private String liveSource = null;
    private String liveId = null;
    private String anchorId = null;
    private String appVersion = null;

    static {
        kge.a(-1214752052);
        kge.a(-540945145);
    }

    public String getAPI_NAME() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ad3bbbb3", new Object[]{this}) : this.API_NAME;
    }

    public void setAPI_NAME(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85191523", new Object[]{this, str});
        } else {
            this.API_NAME = str;
        }
    }

    public String getVERSION() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a81d7b97", new Object[]{this}) : this.VERSION;
    }

    public void setVERSION(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62958027", new Object[]{this, str});
        } else {
            this.VERSION = str;
        }
    }

    public boolean isNEED_ECODE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35834a7e", new Object[]{this})).booleanValue() : this.NEED_ECODE;
    }

    public void setNEED_ECODE(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6759b162", new Object[]{this, new Boolean(z)});
        } else {
            this.NEED_ECODE = z;
        }
    }

    public boolean isNEED_SESSION() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64348f02", new Object[]{this})).booleanValue() : this.NEED_SESSION;
    }

    public void setNEED_SESSION(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf9ab5e", new Object[]{this, new Boolean(z)});
        } else {
            this.NEED_SESSION = z;
        }
    }

    public String getBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this}) : this.bizCode;
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.bizCode = str;
        }
    }

    public String getUrlParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c0abdb3a", new Object[]{this}) : this.urlParams;
    }

    public void setUrlParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d70d47e4", new Object[]{this, str});
        } else {
            this.urlParams = str;
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

    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this}) : this.appVersion;
    }

    public void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
        } else {
            this.appVersion = str;
        }
    }
}
