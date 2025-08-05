package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ContainerModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ContainerModel> CREATOR = new Parcelable.Creator<ContainerModel>() { // from class: com.alibaba.ariver.resource.api.models.ContainerModel.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public ContainerModel mo192createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ContainerModel) ipChange.ipc$dispatch("b0b8198e", new Object[]{this, parcel}) : new ContainerModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public ContainerModel[] mo193newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ContainerModel[]) ipChange.ipc$dispatch("ced45c85", new Object[]{this, new Integer(i)}) : new ContainerModel[i];
        }
    };
    private static final long serialVersionUID = 4709959887517039667L;
    @JSONField
    private int downloadType;
    @JSONField
    private JSONObject launchParams;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ContainerModel() {
    }

    protected ContainerModel(Parcel parcel) {
        this.launchParams = (JSONObject) parcel.readSerializable();
        this.downloadType = parcel.readInt();
    }

    public JSONObject getLaunchParams() {
        return this.launchParams;
    }

    public void setLaunchParams(JSONObject jSONObject) {
        this.launchParams = jSONObject;
    }

    public int getDownloadType() {
        return this.downloadType;
    }

    public void setDownloadType(int i) {
        this.downloadType = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.launchParams);
        parcel.writeInt(this.downloadType);
    }

    public String toString() {
        return "ContainerModel{launchParams=" + this.launchParams + ", downloadType=" + this.downloadType + '}';
    }
}
