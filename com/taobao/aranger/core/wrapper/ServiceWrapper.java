package com.taobao.aranger.core.wrapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class ServiceWrapper extends a implements Parcelable {
    public static final Parcelable.Creator<ServiceWrapper> CREATOR;
    private String mTimeStamp;
    private int mType;
    private Class serviceInterfaceClass;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        kge.a(-745305474);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<ServiceWrapper>() { // from class: com.taobao.aranger.core.wrapper.ServiceWrapper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.aranger.core.wrapper.ServiceWrapper, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ServiceWrapper createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.aranger.core.wrapper.ServiceWrapper[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ServiceWrapper[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public ServiceWrapper a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ServiceWrapper) ipChange.ipc$dispatch("c2c0da2", new Object[]{this, parcel});
                }
                ServiceWrapper serviceWrapper = new ServiceWrapper();
                serviceWrapper.readFromParcel(parcel);
                return serviceWrapper;
            }

            public ServiceWrapper[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ServiceWrapper[]) ipChange.ipc$dispatch("295a751", new Object[]{this, new Integer(i)}) : new ServiceWrapper[i];
            }
        };
    }

    public static ServiceWrapper obtain() {
        return new ServiceWrapper();
    }

    private ServiceWrapper() {
    }

    @Override // com.taobao.aranger.core.wrapper.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTimeStamp);
        parcel.writeByte((byte) this.mType);
        if (this.mType != 3) {
            super.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.taobao.aranger.core.wrapper.a
    public void readFromParcel(Parcel parcel) {
        this.mTimeStamp = parcel.readString();
        this.mType = parcel.readByte();
        if (this.mType != 3) {
            super.readFromParcel(parcel);
        }
    }

    public String getTimeStamp() {
        return this.mTimeStamp;
    }

    public ServiceWrapper setType(int i) {
        this.mType = i;
        return this;
    }

    public ServiceWrapper setServiceInterfaceClass(Class<?> cls) {
        this.serviceInterfaceClass = cls;
        return this;
    }

    public ServiceWrapper setServiceName(String str) {
        super.setName(str);
        return this;
    }

    public Class getServiceInterfaceClass() {
        return this.serviceInterfaceClass;
    }

    public int getType() {
        return this.mType;
    }

    public ServiceWrapper setTimeStamp(String str) {
        this.mTimeStamp = str;
        return this;
    }
}
