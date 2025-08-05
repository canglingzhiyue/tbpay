package com.taobao.taolive.sdk.business.interact.favor.fandom;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class FavorFandomRequest implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String API_NAME = "mtop.taobao.iliad.fandom.recommend.publish";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private long count = 0;
    private String topic = null;

    static {
        kge.a(1395926750);
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

    public long getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2754", new Object[]{this})).longValue() : this.count;
    }

    public void setCount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbdc8970", new Object[]{this, new Long(j)});
        } else {
            this.count = j;
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
}
