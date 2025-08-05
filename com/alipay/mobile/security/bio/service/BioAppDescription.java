package com.alipay.mobile.security.bio.service;

import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class BioAppDescription implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int APP_TYPE_ACTIVITY = 0;
    public static final int APP_TYPE_BROADCAST_RECIEVER = 3;
    public static final int APP_TYPE_CONTENT_PROVIDER = 4;
    public static final int APP_TYPE_SERVICE = 1;
    private static final long serialVersionUID = 1;
    private String appInterfaceName;
    private String appName;
    private int bioAction;
    private int bioType;
    private String bistoken;
    private Bundle bundle;
    private String cfg;
    private int detectorId;
    private String headImageDir;
    private JSONObject mFcSpecialData;
    private String remoteURL;
    private String tag;
    private int appType = 0;
    private boolean signed = true;
    public Map<String, String> extProperty = new HashMap();
    public Map<String, String> extMetaInfo = new HashMap();
    private long productID = -1;
    private boolean autoClose = true;

    public int getAppType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("de085abf", new Object[]{this})).intValue() : this.appType;
    }

    public void setAppType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("194c6cc3", new Object[]{this, new Integer(i)});
        } else {
            this.appType = i;
        }
    }

    public String getRemoteURL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d2394446", new Object[]{this}) : this.remoteURL;
    }

    public void setRemoteURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72d0058", new Object[]{this, str});
        } else {
            this.remoteURL = str;
        }
    }

    public String getHeadImageURL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6019c6af", new Object[]{this}) : this.headImageDir;
    }

    public void setHeadImageURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33bd83a7", new Object[]{this, str});
        } else {
            this.headImageDir = str;
        }
    }

    public String getAppName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this}) : this.appName;
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this}) : this.tag;
    }

    public void setTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
        } else {
            this.tag = str;
        }
    }

    public int getDetectorId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("405ff071", new Object[]{this})).intValue() : this.detectorId;
    }

    public void setDetectorId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2752bb9", new Object[]{this, new Integer(i)});
        } else {
            this.detectorId = i;
        }
    }

    public void setAppName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b790109b", new Object[]{this, str});
        } else {
            this.appName = str;
        }
    }

    public String getAppInterfaceName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cdea8a60", new Object[]{this}) : this.appInterfaceName;
    }

    public void setAppInterfaceName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba95016", new Object[]{this, str});
        } else {
            this.appInterfaceName = str;
        }
    }

    public int getBioType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("30a686a6", new Object[]{this})).intValue() : this.bioType;
    }

    public void setBioType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a73bdbc", new Object[]{this, new Integer(i)});
        } else {
            this.bioType = i;
        }
    }

    public int getBioAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a7af6322", new Object[]{this})).intValue() : this.bioAction;
    }

    public void setBioAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1633ddc0", new Object[]{this, new Integer(i)});
        } else {
            this.bioAction = i;
        }
    }

    public String getCfg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b83268b", new Object[]{this}) : this.cfg;
    }

    public void setCfg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("536e8db3", new Object[]{this, str});
        } else {
            this.cfg = str;
        }
    }

    public Map<String, String> getExtProperty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ecd485c", new Object[]{this}) : this.extProperty;
    }

    public void addExtProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6f4d0", new Object[]{this, str, str2});
        } else {
            this.extProperty.put(str, str2);
        }
    }

    public boolean isSigned() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46f10271", new Object[]{this})).booleanValue() : this.signed;
    }

    public void setSigned(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b771bcf", new Object[]{this, new Boolean(z)});
        } else {
            this.signed = z;
        }
    }

    public String getBistoken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cba288f6", new Object[]{this}) : this.bistoken;
    }

    public void setBistoken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338bf040", new Object[]{this, str});
        } else {
            this.bistoken = str;
        }
    }

    public JSONObject getFcSpecialData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("6fc87af7", new Object[]{this}) : this.mFcSpecialData;
    }

    public void setFcSpecialData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871eb805", new Object[]{this, jSONObject});
        } else {
            this.mFcSpecialData = jSONObject;
        }
    }

    public boolean isAutoClose() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("232c348a", new Object[]{this})).booleanValue() : this.autoClose;
    }

    public void setAutoClose(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523dbc46", new Object[]{this, new Boolean(z)});
        } else {
            this.autoClose = z;
        }
    }

    public long getProductID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e7bb620f", new Object[]{this})).longValue() : this.productID;
    }

    public void setProductID(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7a7c015", new Object[]{this, new Long(j)});
        } else {
            this.productID = j;
        }
    }

    public Map<String, String> getExtMetaInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("49676b5a", new Object[]{this}) : this.extMetaInfo;
    }

    public void setExtMetaInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c164770c", new Object[]{this, map});
        } else {
            this.extMetaInfo = map;
        }
    }

    public Bundle getBundle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("673e5703", new Object[]{this}) : this.bundle;
    }

    public void setBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb69b0e9", new Object[]{this, bundle});
        } else {
            this.bundle = bundle;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" appType:" + this.appType);
        sb.append(" bioType:" + this.bioType);
        sb.append(" bioAction:" + this.bioAction);
        sb.append(" appName:" + this.appName);
        sb.append(" cfg:" + this.cfg);
        sb.append(" signed:" + this.signed);
        sb.append(" bistoken:" + this.bistoken);
        sb.append(" autoClose:" + this.autoClose);
        sb.append(" appInterfaceName:" + this.appInterfaceName);
        sb.append(" productID:" + this.productID);
        sb.append(" detectorId:" + this.detectorId);
        return sb.toString();
    }
}
