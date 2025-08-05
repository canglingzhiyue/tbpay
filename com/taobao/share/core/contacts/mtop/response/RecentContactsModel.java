package com.taobao.share.core.contacts.mtop.response;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes8.dex */
public class RecentContactsModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int bizType;
    private String ccode;
    private String contactType;
    private String groupId;
    private long lastContactTime;
    private String userId;

    static {
        kge.a(-804798683);
        kge.a(1028243835);
    }

    public String getGroupId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99b7d9b5", new Object[]{this}) : this.groupId;
    }

    public void setGroupId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a446e5c9", new Object[]{this, str});
        } else {
            this.groupId = str;
        }
    }

    public int getBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8f974bb1", new Object[]{this})).intValue() : this.bizType;
    }

    public void setBizType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999b9a11", new Object[]{this, new Integer(i)});
        } else {
            this.bizType = i;
        }
    }

    public String getCcode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f01981f", new Object[]{this}) : this.ccode;
    }

    public void setCcode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e0a019f", new Object[]{this, str});
        } else {
            this.ccode = str;
        }
    }

    public String getContactType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38d12335", new Object[]{this}) : this.contactType;
    }

    public void setContactType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90a7249", new Object[]{this, str});
        } else {
            this.contactType = str;
        }
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : this.userId;
    }

    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.userId = str;
        }
    }

    public long getLastContactTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1028d45c", new Object[]{this})).longValue() : this.lastContactTime;
    }

    public void setLastContactTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f455e68", new Object[]{this, new Long(j)});
        } else {
            this.lastContactTime = j;
        }
    }
}
