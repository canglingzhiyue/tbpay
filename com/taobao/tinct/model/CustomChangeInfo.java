package com.taobao.tinct.model;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class CustomChangeInfo extends BaseChangeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String configType;
    public String customType;
    public long fullExpireTime;
    public Boolean grayFlag;
    public String hashKey;
    @JSONField(serialize = false)
    public boolean isStatistics;
    public String tinctTag;
    public String version;

    public CustomChangeInfo() {
        this("", "", "", "", null);
    }

    public CustomChangeInfo(String str, String str2, String str3, String str4, Boolean bool) {
        super(ChangeType.CUSTOM);
        this.customType = str;
        this.configType = str2;
        this.version = str3;
        this.bizName = str4;
        this.grayFlag = bool;
        this.isStatistics = false;
        this.hashKey = String.format("%s|%s", str, str2);
        this.tinctTag = String.format("%s|%s", this.hashKey, str3);
        this.fullExpireTime = -1L;
    }

    public void setCustomType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d5c71e", new Object[]{this, str});
        } else {
            this.customType = str;
        }
    }

    public void setConfigType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d6abaf", new Object[]{this, str});
        } else {
            this.configType = str;
        }
    }

    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.version = str;
        }
    }

    public void setGrayFlag(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91586555", new Object[]{this, bool});
        } else {
            this.grayFlag = bool;
        }
    }

    public void setTinctTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebf0803", new Object[]{this, str});
        } else {
            this.tinctTag = str;
        }
    }

    public void setHashKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28326900", new Object[]{this, str});
        } else {
            this.hashKey = str;
        }
    }

    public void setBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.bizName = str;
        }
    }

    public String getCustomType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9392b58", new Object[]{this}) : this.customType;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
    }

    public void setStatistics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32d212c", new Object[]{this});
        } else {
            this.isStatistics = true;
        }
    }

    public boolean isStatistics() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d34a73f8", new Object[]{this})).booleanValue() : this.isStatistics;
    }

    public Boolean getGrayFlag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("9d54ca69", new Object[]{this}) : this.grayFlag;
    }

    public String getConfigType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6830f0a7", new Object[]{this}) : this.configType;
    }

    @JSONField(serialize = false)
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : isParamValid(this.customType) && isParamValid(this.configType) && isParamValid(this.version);
    }

    @Override // com.taobao.tinct.model.BaseChangeInfo
    public String getTinctTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f9becd3", new Object[]{this}) : this.tinctTag;
    }

    public String getHashKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c743939e", new Object[]{this}) : this.hashKey;
    }

    @JSONField(serialize = false)
    public boolean isGray() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d71bccb8", new Object[]{this})).booleanValue() : com.taobao.tinct.impl.config.a.d(this);
    }

    @JSONField(serialize = false)
    public boolean isFull() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1ffb6ee4", new Object[]{this})).booleanValue() : com.taobao.tinct.impl.config.a.e(this);
    }

    @JSONField(serialize = false)
    public boolean isExpire() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f97d6f4", new Object[]{this})).booleanValue() : this.fullExpireTime != -1 ? System.currentTimeMillis() > this.fullExpireTime : System.currentTimeMillis() - this.updateTime > com.taobao.tinct.impl.config.a.h(this) + com.taobao.tinct.impl.config.a.i(this);
    }

    public void updateFullExpireTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2bf82b", new Object[]{this});
        } else {
            this.fullExpireTime = System.currentTimeMillis() + com.taobao.tinct.impl.config.a.h(this);
        }
    }

    public long getFullExpireTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("429ba56c", new Object[]{this})).longValue() : this.fullExpireTime;
    }

    public void setFullExpireTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1e3fc0", new Object[]{this, new Long(j)});
        } else {
            this.fullExpireTime = j;
        }
    }

    private static boolean isParamValid(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a362e0e", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && !str.contains("^") && !str.contains("|");
    }
}
