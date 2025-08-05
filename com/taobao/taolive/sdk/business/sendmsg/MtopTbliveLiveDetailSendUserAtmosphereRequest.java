package com.taobao.taolive.sdk.business.sendmsg;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTbliveLiveDetailSendUserAtmosphereRequest implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String API_NAME = "mtop.tblive.live.detail.sendUserAtmosphere";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String data = null;
    private long subtype = 0;
    private String topic = null;
    private String anchorId = null;
    private String liveId = null;

    static {
        kge.a(-2014943841);
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

    public String getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this}) : this.data;
    }

    public void setData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427970bd", new Object[]{this, str});
        } else {
            this.data = str;
        }
    }

    public long getSubtype() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fbf3abbf", new Object[]{this})).longValue() : this.subtype;
    }

    public void setSubtype(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8cb3f65", new Object[]{this, new Long(j)});
        } else {
            this.subtype = j;
        }
    }

    public String getTopic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this}) : this.topic;
    }

    public void setTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.topic = str;
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
}
