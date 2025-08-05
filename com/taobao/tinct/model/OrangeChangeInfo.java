package com.taobao.tinct.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;

/* loaded from: classes.dex */
public class OrangeChangeInfo extends BaseChangeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_EXPIRE = 2;
    public static final int STATUS_INIT = 0;
    public static final int STATUS_UPDATE = 1;
    @JSONField(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_gray)
    public boolean isGray;
    @JSONField(deserialize = false, name = "used", serialize = false)
    public boolean isUsed;
    @JSONField(name = NotificationStyle.NOTIFICATION_STYLE)
    public String nameSpace;
    @JSONField(name = "status")
    public int status;
    @JSONField(name = MspDBHelper.RecordEntry.COLUMN_NAME_VERSION)
    public String version;

    public static OrangeChangeInfo builder(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OrangeChangeInfo) ipChange.ipc$dispatch("2558dffd", new Object[]{str, str2}) : new OrangeChangeInfo(str, str2);
    }

    public OrangeChangeInfo() {
        this(null, null);
    }

    private OrangeChangeInfo(String str, String str2) {
        super(ChangeType.ORANGE);
        this.nameSpace = str;
        this.version = str2;
        this.isGray = false;
        this.status = 0;
        this.isUsed = false;
    }

    public OrangeChangeInfo setNameSpace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrangeChangeInfo) ipChange.ipc$dispatch("669a6211", new Object[]{this, str});
        }
        this.nameSpace = str;
        return this;
    }

    public OrangeChangeInfo setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrangeChangeInfo) ipChange.ipc$dispatch("34ae2c6e", new Object[]{this, str});
        }
        this.version = str;
        return this;
    }

    public OrangeChangeInfo setGray(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrangeChangeInfo) ipChange.ipc$dispatch("d269f7af", new Object[]{this, new Boolean(z)});
        }
        this.isGray = z;
        return this;
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue() : this.status;
    }

    public void setStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384790e8", new Object[]{this, new Integer(i)});
        } else {
            this.status = i;
        }
    }

    public OrangeChangeInfo setBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrangeChangeInfo) ipChange.ipc$dispatch("566aab54", new Object[]{this, str});
        }
        this.bizName = str;
        return this;
    }

    public boolean update(OrangeChangeInfo orangeChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74c1fb8b", new Object[]{this, orangeChangeInfo})).booleanValue();
        }
        this.bizName = orangeChangeInfo.bizName;
        boolean z = this.isGray;
        boolean z2 = orangeChangeInfo.isGray;
        if (z == z2) {
            return false;
        }
        this.isGray = z2;
        this.updateTime = orangeChangeInfo.updateTime;
        this.status = 1;
        return true;
    }

    public String getNameSpace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3e990d94", new Object[]{this}) : this.nameSpace;
    }

    public boolean isGray() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d71bccb8", new Object[]{this})).booleanValue() : this.isGray;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
    }

    public boolean isUsed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bffdf112", new Object[]{this})).booleanValue() : this.isUsed;
    }

    public void setUsed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5544d34e", new Object[]{this, new Boolean(z)});
        } else {
            this.isUsed = z;
        }
    }

    @JSONField(serialize = false)
    public boolean isExpire() {
        long h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f97d6f4", new Object[]{this})).booleanValue();
        }
        if (this.isGray) {
            h = com.taobao.tinct.impl.config.a.h() + com.taobao.tinct.impl.config.a.i();
        } else {
            h = com.taobao.tinct.impl.config.a.h();
        }
        return System.currentTimeMillis() - this.updateTime > h;
    }

    @Override // com.taobao.tinct.model.BaseChangeInfo
    public String getTinctTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f9becd3", new Object[]{this}) : String.format("o|%s|%s", this.nameSpace, this.version);
    }
}
