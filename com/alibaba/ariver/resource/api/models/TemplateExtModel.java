package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class TemplateExtModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<TemplateExtModel> CREATOR = new Parcelable.Creator<TemplateExtModel>() { // from class: com.alibaba.ariver.resource.api.models.TemplateExtModel.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public TemplateExtModel mo202createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TemplateExtModel) ipChange.ipc$dispatch("d15f6914", new Object[]{this, parcel}) : new TemplateExtModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public TemplateExtModel[] mo203newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TemplateExtModel[]) ipChange.ipc$dispatch("d976ca4b", new Object[]{this, new Integer(i)}) : new TemplateExtModel[i];
        }
    };
    private static final long serialVersionUID = 3025278248169103192L;
    @JSONField(name = "extEnable")
    private boolean extEnable;
    @JSONField(name = "ext")
    private JSONObject extObj;
    @JSONField(name = "extPages")
    private JSONObject extPages;
    @JSONField(name = "tabBar")
    private JSONObject tabBarObject;
    @JSONField(name = a.ATOM_EXT_window)
    private JSONObject window;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TemplateExtModel() {
    }

    protected TemplateExtModel(Parcel parcel) {
        this.extObj = (JSONObject) parcel.readSerializable();
        this.window = (JSONObject) parcel.readSerializable();
        this.tabBarObject = (JSONObject) parcel.readSerializable();
        this.extPages = (JSONObject) parcel.readSerializable();
        this.extEnable = parcel.readByte() != 1 ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.extObj);
        parcel.writeSerializable(this.window);
        parcel.writeSerializable(this.tabBarObject);
        parcel.writeSerializable(this.extPages);
        parcel.writeByte(this.extEnable ? (byte) 1 : (byte) 0);
    }

    public JSONObject getExtObj() {
        return this.extObj;
    }

    public void setExtObj(JSONObject jSONObject) {
        this.extObj = jSONObject;
    }

    public boolean isExtEnable() {
        return this.extEnable;
    }

    public void setExtEnable(boolean z) {
        this.extEnable = z;
    }

    public JSONObject getWindow() {
        return this.window;
    }

    public void setWindow(JSONObject jSONObject) {
        this.window = jSONObject;
    }

    public JSONObject getTabBarObject() {
        return this.tabBarObject;
    }

    public void setTabBarObject(JSONObject jSONObject) {
        this.tabBarObject = jSONObject;
    }

    public JSONObject getExtPages() {
        return this.extPages;
    }

    public void setExtPages(JSONObject jSONObject) {
        this.extPages = jSONObject;
    }

    public String toString() {
        return "TemplateExtModel{extObj=" + this.extObj + ", extEnable=" + this.extEnable + ", window=" + this.window + '}';
    }
}
