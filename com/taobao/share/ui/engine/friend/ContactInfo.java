package com.taobao.share.ui.engine.friend;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class ContactInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String bizSubType;
    private String contactType;
    private String displayName;
    private Map<String, String> extendFeatures;
    private String groupId;
    private String groupUserNum;
    private String headUrl;
    private String isFriend;
    private String position;
    private String pvid;
    private String scm;
    private String shareTraceId;
    private String sourceType;
    private String subName;
    private String subPic;
    private String userId;

    static {
        kge.a(-1381071438);
        kge.a(1028243835);
    }

    public String getPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("216f01ba", new Object[]{this}) : this.position;
    }

    public void setPosition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974e8ffc", new Object[]{this, str});
        } else {
            this.position = str;
        }
    }

    public String getSourceType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c62001ee", new Object[]{this}) : this.sourceType;
    }

    public void setSourceType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c9c348", new Object[]{this, str});
        } else {
            this.sourceType = str;
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

    public String getIsFriend() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97636bdb", new Object[]{this}) : this.isFriend;
    }

    public void setIsFriend(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe769fb", new Object[]{this, str});
        } else {
            this.isFriend = str;
        }
    }

    public String getHeadUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4248ad60", new Object[]{this}) : this.headUrl;
    }

    public void setHeadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0877e", new Object[]{this, str});
        } else {
            this.headUrl = str;
        }
    }

    public String getDisplayName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9684a22", new Object[]{this}) : this.displayName;
    }

    public void setDisplayName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5828fc", new Object[]{this, str});
        } else {
            this.displayName = str;
        }
    }

    public String getSubName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("857a5964", new Object[]{this}) : this.subName;
    }

    public void setSubName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d45bfa", new Object[]{this, str});
        } else {
            this.subName = str;
        }
    }

    public String getSubPic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a4a54cd9", new Object[]{this}) : this.subPic;
    }

    public void setSubPic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fae3bbd", new Object[]{this, str});
        } else {
            this.subPic = str;
        }
    }

    public String getGroupUserNum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e94b87", new Object[]{this}) : this.groupUserNum;
    }

    public void setGroupUserNum(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66de99cf", new Object[]{this, str});
        } else {
            this.groupUserNum = str;
        }
    }

    public String getBizSubType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("605761c", new Object[]{this}) : this.bizSubType;
    }

    public void setBizSubType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3192d4da", new Object[]{this, str});
        } else {
            this.bizSubType = str;
        }
    }

    public Map<String, String> getExtendFeatures() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d28cd7a9", new Object[]{this}) : this.extendFeatures;
    }

    public void setExtendFeatures(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c66905", new Object[]{this, map});
        } else {
            this.extendFeatures = map;
        }
    }

    public String getPvid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("813f1942", new Object[]{this}) : this.pvid;
    }

    public void setPvid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b234f74", new Object[]{this, str});
        } else {
            this.pvid = str;
        }
    }

    public String getScm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1429a872", new Object[]{this}) : this.scm;
    }

    public void setScm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9848ac", new Object[]{this, str});
        } else {
            this.scm = str;
        }
    }

    public String getShareTraceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e681dc82", new Object[]{this}) : this.shareTraceId;
    }

    public void setShareTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a582834", new Object[]{this, str});
        } else {
            this.shareTraceId = str;
        }
    }
}
