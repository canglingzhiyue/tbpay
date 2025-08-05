package com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class MtopRoomstudioLiveDisplayDetailRequest implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String API_NAME = "mtop.roomstudio.live.display.detail";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String appVersion = null;
    private String liveSource = null;
    private String bizCode = null;
    private String contentId = null;
    private String channel = null;
    private String urlParams = null;
    private String previousVersionIdList = null;
    private String anchorId = null;
    private String targetAliveId = null;
    private boolean queryCheckPop = false;
    private boolean isRecommendLive = false;
    private String sjsdParams = null;
    private long subType = 0;
    private boolean hasSjsdParams = false;
    private String entryLiveSource = null;
    private String contentType = null;
    private String displayExtParams = null;
    private String features = null;

    static {
        kge.a(-1439883781);
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

    public String getContentId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8392bcfb", new Object[]{this}) : this.contentId;
    }

    public void setContentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71029e43", new Object[]{this, str});
        } else {
            this.contentId = str;
        }
    }

    public String getChannel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3babe84c", new Object[]{this}) : this.channel;
    }

    public void setChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d4aa12", new Object[]{this, str});
        } else {
            this.channel = str;
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

    public String getPreviousVersionIdList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48010195", new Object[]{this}) : this.previousVersionIdList;
    }

    public void setPreviousVersionIdList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a5ee9", new Object[]{this, str});
        } else {
            this.previousVersionIdList = str;
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

    public String getTargetAliveId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("447c158", new Object[]{this}) : this.targetAliveId;
    }

    public void setTargetAliveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9504b86", new Object[]{this, str});
        } else {
            this.targetAliveId = str;
        }
    }

    public boolean isQueryCheckPop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f8a88d12", new Object[]{this})).booleanValue() : this.queryCheckPop;
    }

    public void setQueryCheckPop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44318be", new Object[]{this, new Boolean(z)});
        } else {
            this.queryCheckPop = z;
        }
    }

    public boolean isIsRecommendLive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7cc28abf", new Object[]{this})).booleanValue() : this.isRecommendLive;
    }

    public void setIsRecommendLive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625962b1", new Object[]{this, new Boolean(z)});
        } else {
            this.isRecommendLive = z;
        }
    }

    public String getSjsdParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5687f6f5", new Object[]{this}) : this.sjsdParams;
    }

    public void setSjsdParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1606f21", new Object[]{this, str});
        } else {
            this.sjsdParams = str;
        }
    }

    public long getSubType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ffce0fdf", new Object[]{this})).longValue() : this.subType;
    }

    public void setSubType(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303d5f45", new Object[]{this, new Long(j)});
        } else {
            this.subType = j;
        }
    }

    public boolean isHasSjsdParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c213d49", new Object[]{this})).booleanValue() : this.hasSjsdParams;
    }

    public void setHasSjsdParams(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe06f67", new Object[]{this, new Boolean(z)});
        } else {
            this.hasSjsdParams = z;
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

    public String getContentType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7290f8fc", new Object[]{this}) : this.contentType;
    }

    public void setContentType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7455562", new Object[]{this, str});
        } else {
            this.contentType = str;
        }
    }

    public String getDisplayExtParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3cecf9fe", new Object[]{this}) : this.displayExtParams;
    }

    public void setDisplayExtParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf4d438", new Object[]{this, str});
        } else {
            this.displayExtParams = str;
        }
    }

    public String getFeatures() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43b42b26", new Object[]{this}) : this.features;
    }

    public void setFeatures(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdae9410", new Object[]{this, str});
        } else {
            this.features = str;
        }
    }
}
