package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.AttributionReporter;
import com.taobao.themis.utils.f;
import java.io.Serializable;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class AppModel implements Parcelable, Serializable {
    @JSONField(serialize = false)
    public static final Comparator<AppModel> COMPARATOR = new Comparator<AppModel>() { // from class: com.alibaba.ariver.resource.api.models.AppModel.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public int compare(AppModel appModel, AppModel appModel2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8aedcebf", new Object[]{this, appModel, appModel2})).intValue();
            }
            if (appModel == null) {
                return appModel2 == null ? 0 : -1;
            } else if (appModel2 != null) {
                return f.a(appModel.getAppVersion(), appModel2.getAppVersion());
            } else {
                return 1;
            }
        }
    };
    public static final Parcelable.Creator<AppModel> CREATOR = new Parcelable.Creator<AppModel>() { // from class: com.alibaba.ariver.resource.api.models.AppModel.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public AppModel mo190createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AppModel) ipChange.ipc$dispatch("5354876e", new Object[]{this, parcel}) : new AppModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public AppModel[] mo191newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AppModel[]) ipChange.ipc$dispatch("c0c00fa5", new Object[]{this, new Integer(i)}) : new AppModel[i];
        }
    };
    private static final long serialVersionUID = 435160091756780155L;
    @JSONField(serialize = false)
    private String appId;
    @JSONField(name = RVConstants.EXTRA_APPINFO)
    private AppInfoModel appInfoModel;
    @JSONField(serialize = false)
    private String appVersion;
    @JSONField(name = "container")
    private ContainerModel containerInfo;
    @JSONField(name = MspGlobalDefine.EXTENDINFO)
    private JSONObject extendInfos;
    @JSONField(name = "permissionControl")
    private JSONObject permissionControl;
    @JSONField(name = AttributionReporter.SYSTEM_PERMISSION)
    private PermissionModel permissionModel;
    private ConcurrentHashMap<String, String> startInfoData;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AppModel() {
        this.startInfoData = new ConcurrentHashMap<>();
    }

    protected AppModel(Parcel parcel) {
        this.appId = parcel.readString();
        this.appVersion = parcel.readString();
        this.appInfoModel = (AppInfoModel) parcel.readParcelable(AppModel.class.getClassLoader());
        this.containerInfo = (ContainerModel) parcel.readParcelable(AppModel.class.getClassLoader());
        this.extendInfos = (JSONObject) parcel.readSerializable();
        this.permissionModel = (PermissionModel) parcel.readParcelable(AppModel.class.getClassLoader());
        this.permissionControl = (JSONObject) parcel.readSerializable();
        Serializable readSerializable = parcel.readSerializable();
        if (readSerializable instanceof ConcurrentHashMap) {
            this.startInfoData = (ConcurrentHashMap) readSerializable;
        } else {
            this.startInfoData = new ConcurrentHashMap<>();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appId);
        parcel.writeString(this.appVersion);
        parcel.writeParcelable(this.appInfoModel, 0);
        parcel.writeParcelable(this.containerInfo, 0);
        parcel.writeSerializable(this.extendInfos);
        parcel.writeParcelable(this.permissionModel, 0);
        parcel.writeSerializable(this.permissionControl);
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

    public AppInfoModel getAppInfoModel() {
        return this.appInfoModel;
    }

    public void setAppInfoModel(AppInfoModel appInfoModel) {
        this.appInfoModel = appInfoModel;
        this.appId = appInfoModel.getAppId();
        this.appVersion = appInfoModel.getVersion();
    }

    public ContainerModel getContainerInfo() {
        return this.containerInfo;
    }

    public void setContainerInfo(ContainerModel containerModel) {
        this.containerInfo = containerModel;
    }

    public JSONObject getExtendInfos() {
        return this.extendInfos;
    }

    public void setExtendInfos(JSONObject jSONObject) {
        this.extendInfos = jSONObject;
    }

    public PermissionModel getPermissionModel() {
        return this.permissionModel;
    }

    public void setPermissionModel(PermissionModel permissionModel) {
        this.permissionModel = permissionModel;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public JSONObject getPermissionControl() {
        return this.permissionControl;
    }

    public void setPermissionControl(JSONObject jSONObject) {
        this.permissionControl = jSONObject;
    }

    public String toString() {
        return "AppModel{appId='" + this.appId + "', appVersion='" + this.appVersion + "', appInfoModel=" + this.appInfoModel + ", containerInfo=" + this.containerInfo + ", extendInfos=" + this.extendInfos + '}';
    }
}
