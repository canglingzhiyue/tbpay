package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class DynamicPluginInfo implements Parcelable {
    public static final Parcelable.Creator<DynamicPluginInfo> CREATOR = new Parcelable.Creator<DynamicPluginInfo>() { // from class: com.alibaba.ariver.resource.api.models.DynamicPluginInfo.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public DynamicPluginInfo mo194createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DynamicPluginInfo) ipChange.ipc$dispatch("92c7c2c0", new Object[]{this, parcel}) : new DynamicPluginInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public DynamicPluginInfo[] mo195newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DynamicPluginInfo[]) ipChange.ipc$dispatch("8d9c8869", new Object[]{this, new Integer(i)}) : new DynamicPluginInfo[i];
        }
    };
    private List<PluginModel> pluginModels;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DynamicPluginInfo() {
        this.pluginModels = new ArrayList();
    }

    protected DynamicPluginInfo(Parcel parcel) {
        this.pluginModels = new ArrayList();
        this.pluginModels = parcel.createTypedArrayList(PluginModel.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.pluginModels);
    }

    public boolean addPlugin(PluginModel pluginModel) {
        if (pluginModel != null) {
            PluginModel pluginModel2 = null;
            Iterator<PluginModel> it = this.pluginModels.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PluginModel next = it.next();
                if (TextUtils.equals(pluginModel.getAppId(), next.getAppId()) && TextUtils.equals(pluginModel.getVersion(), next.getVersion())) {
                    pluginModel2 = next;
                    break;
                }
            }
            if (pluginModel2 != null) {
                this.pluginModels.remove(pluginModel2);
            }
            return this.pluginModels.add(pluginModel);
        }
        return false;
    }

    public List<PluginModel> getPluginModels() {
        return this.pluginModels;
    }
}
