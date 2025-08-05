package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.utils.io.i;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class PluginModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<PluginModel> CREATOR = new Parcelable.Creator<PluginModel>() { // from class: com.alibaba.ariver.resource.api.models.PluginModel.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public PluginModel mo198createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PluginModel) ipChange.ipc$dispatch("a6f5e1aa", new Object[]{this, parcel}) : new PluginModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public PluginModel[] mo199newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PluginModel[]) ipChange.ipc$dispatch("fb965a13", new Object[]{this, new Integer(i)}) : new PluginModel[i];
        }
    };
    private static final long serialVersionUID = 5268600696037076004L;
    @JSONField
    private String appId;
    @JSONField
    private String appKey;
    @JSONField
    private String bytePackageUrl;
    @JSONField
    private String developerVersion;
    @JSONField
    private JSONObject extendInfo;
    @JSONField
    private String fallbackBaseUrl;
    @JSONField
    private String newFallbackBaseUrl;
    @JSONField
    private String newPackageSize;
    @JSONField
    private String newPackageUrl;
    @JSONField
    private String packageSize;
    @JSONField
    private String packageUrl;
    @JSONField
    private JSONObject permission;
    @JSONField
    private JSONObject permissionControl;
    @JSONField
    private String pluginScene;
    @JSONField
    private String pluginType;
    @JSONField
    private String requireVersion;
    private ConcurrentHashMap<String, String> startInfoData;
    @JSONField(name = "deployVersion")
    private String version;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PluginModel() {
        this.startInfoData = new ConcurrentHashMap<>();
    }

    protected PluginModel(Parcel parcel) {
        this.appId = parcel.readString();
        this.pluginType = parcel.readString();
        this.appKey = parcel.readString();
        this.packageUrl = parcel.readString();
        this.newPackageUrl = parcel.readString();
        this.bytePackageUrl = parcel.readString();
        this.packageSize = parcel.readString();
        this.newPackageSize = parcel.readString();
        this.fallbackBaseUrl = parcel.readString();
        this.newFallbackBaseUrl = parcel.readString();
        this.developerVersion = parcel.readString();
        this.requireVersion = parcel.readString();
        this.pluginScene = parcel.readString();
        this.version = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] a2 = i.a(readInt);
            parcel.readByteArray(a2);
            this.permission = com.taobao.themis.utils.i.b(a2);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            byte[] a3 = i.a(readInt2);
            parcel.readByteArray(a3);
            this.extendInfo = com.taobao.themis.utils.i.b(a3);
        }
        int readInt3 = parcel.readInt();
        if (readInt3 > 0) {
            byte[] a4 = i.a(readInt3);
            parcel.readByteArray(a4);
            this.permissionControl = com.taobao.themis.utils.i.b(a4);
        }
        Serializable readSerializable = parcel.readSerializable();
        if (readSerializable instanceof ConcurrentHashMap) {
            this.startInfoData = (ConcurrentHashMap) readSerializable;
        } else {
            this.startInfoData = new ConcurrentHashMap<>();
        }
    }

    public String getPluginScene() {
        return this.pluginScene;
    }

    public void setPluginScene(String str) {
        this.pluginScene = str;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public String getPluginType() {
        return this.pluginType;
    }

    public void setPluginType(String str) {
        this.pluginType = str;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public String getPackageUrl() {
        return this.packageUrl;
    }

    public void setPackageUrl(String str) {
        this.packageUrl = str;
    }

    public String getPackageSize() {
        return this.packageSize;
    }

    public void setPackageSize(String str) {
        this.packageSize = str;
    }

    public String getDeveloperVersion() {
        return this.developerVersion;
    }

    public void setDeveloperVersion(String str) {
        this.developerVersion = str;
    }

    public String getFallbackBaseUrl() {
        return this.fallbackBaseUrl;
    }

    public void setFallbackBaseUrl(String str) {
        this.fallbackBaseUrl = str;
    }

    public String getNewFallbackBaseUrl() {
        return this.newFallbackBaseUrl;
    }

    public void setNewFallbackBaseUrl(String str) {
        this.newFallbackBaseUrl = str;
    }

    public String getRequireVersion() {
        return this.requireVersion;
    }

    public void setRequireVersion(String str) {
        this.requireVersion = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public JSONObject getPermission() {
        return this.permission;
    }

    public void setPermission(JSONObject jSONObject) {
        this.permission = jSONObject;
    }

    public JSONObject getExtendInfo() {
        return this.extendInfo;
    }

    public void setExtendInfo(JSONObject jSONObject) {
        this.extendInfo = jSONObject;
    }

    public String getNewPackageUrl() {
        return this.newPackageUrl;
    }

    public void setNewPackageUrl(String str) {
        this.newPackageUrl = str;
    }

    public String getBytePackageUrl() {
        return this.bytePackageUrl;
    }

    public void setBytePackageUrl(String str) {
        this.bytePackageUrl = str;
    }

    public String getNewPackageSize() {
        return this.newPackageSize;
    }

    public void setNewPackageSize(String str) {
        this.newPackageSize = str;
    }

    public JSONObject getPermissionControl() {
        return this.permissionControl;
    }

    public void setPermissionControl(JSONObject jSONObject) {
        this.permissionControl = jSONObject;
    }

    public String toString() {
        return "PluginModel{appId='" + this.appId + "'pluginType='" + this.pluginType + "', appKey='" + this.appKey + "', packageUrl='" + this.packageUrl + "', packageSize='" + this.packageSize + "', newPackageUrl='" + this.newPackageUrl + "', newPackageSize='" + this.newPackageSize + "', fallbackBaseUrl='" + this.fallbackBaseUrl + "', newFallbackBaseUrl='" + this.newFallbackBaseUrl + "', developerVersion='" + this.developerVersion + "', requireVersion='" + this.requireVersion + "', pluginScene='" + this.pluginScene + "', version='" + this.version + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appId);
        parcel.writeString(this.pluginType);
        parcel.writeString(this.appKey);
        parcel.writeString(this.packageUrl);
        parcel.writeString(this.newPackageUrl);
        parcel.writeString(this.bytePackageUrl);
        parcel.writeString(this.packageSize);
        parcel.writeString(this.newPackageSize);
        parcel.writeString(this.fallbackBaseUrl);
        parcel.writeString(this.newFallbackBaseUrl);
        parcel.writeString(this.developerVersion);
        parcel.writeString(this.requireVersion);
        parcel.writeString(this.pluginScene);
        parcel.writeString(this.version);
        byte[] b = com.taobao.themis.utils.i.b(this.permission);
        int i2 = 0;
        int length = b == null ? 0 : b.length;
        parcel.writeInt(length);
        if (length > 0) {
            parcel.writeByteArray(b);
        }
        byte[] b2 = com.taobao.themis.utils.i.b(this.extendInfo);
        int length2 = b2 == null ? 0 : b2.length;
        parcel.writeInt(length2);
        if (length2 > 0) {
            parcel.writeByteArray(b2);
        }
        byte[] b3 = com.taobao.themis.utils.i.b(this.permissionControl);
        if (b3 != null) {
            i2 = b3.length;
        }
        parcel.writeInt(i2);
        if (i2 > 0) {
            parcel.writeByteArray(b3);
        }
        ConcurrentHashMap<String, String> concurrentHashMap = this.startInfoData;
        if (concurrentHashMap != null) {
            parcel.writeSerializable(concurrentHashMap);
        }
    }

    public String getData(String str) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (str == null || (concurrentHashMap = this.startInfoData) == null || concurrentHashMap.isEmpty()) {
            return null;
        }
        return this.startInfoData.get(str);
    }

    public void setData(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        if (this.startInfoData == null) {
            this.startInfoData = new ConcurrentHashMap<>();
        }
        this.startInfoData.put(str, str2);
    }
}
