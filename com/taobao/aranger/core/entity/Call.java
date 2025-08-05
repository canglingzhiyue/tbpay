package com.taobao.aranger.core.entity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.core.wrapper.ServiceWrapper;
import com.taobao.aranger.utils.e;
import tb.kge;

/* loaded from: classes.dex */
public class Call implements Parcelable {
    public static final Parcelable.Creator<Call> CREATOR;
    private boolean isAutoRecover;
    private boolean isOneWay;
    private boolean isSameApp;
    private long mDataSize;
    private MethodWrapper mMethodWrapper;
    private ParameterWrapper[] mParameterWrappers;
    private Uri mRemoteProviderUri;
    private ServiceWrapper mServiceWrapper;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static Call obtain() {
        return new Call();
    }

    static {
        kge.a(-1517819290);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<Call>() { // from class: com.taobao.aranger.core.entity.Call.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.aranger.core.entity.Call, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Call createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.aranger.core.entity.Call[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Call[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public Call a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Call) ipChange.ipc$dispatch("b2a2bf90", new Object[]{this, parcel});
                }
                Call obtain = Call.obtain();
                obtain.readFromParcel(parcel);
                return obtain;
            }

            public Call[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Call[]) ipChange.ipc$dispatch("ad585d41", new Object[]{this, new Integer(i)}) : new Call[i];
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.mServiceWrapper.writeToParcel(parcel, i);
        this.mMethodWrapper.writeToParcel(parcel, i);
        this.mDataSize = e.a(parcel, this.mParameterWrappers, i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readFromParcel(Parcel parcel) {
        this.mServiceWrapper = ServiceWrapper.CREATOR.createFromParcel(parcel);
        this.mMethodWrapper = MethodWrapper.CREATOR.createFromParcel(parcel);
        this.mParameterWrappers = (ParameterWrapper[]) e.a(getClass().getClassLoader(), parcel);
    }

    private Call() {
    }

    public ServiceWrapper getServiceWrapper() {
        return this.mServiceWrapper;
    }

    public MethodWrapper getMethodWrapper() {
        return this.mMethodWrapper;
    }

    public ParameterWrapper[] getParameterWrappers() {
        return this.mParameterWrappers;
    }

    public long getDataSize() {
        return this.mDataSize;
    }

    public Call setServiceWrapper(ServiceWrapper serviceWrapper) {
        this.mServiceWrapper = serviceWrapper;
        return this;
    }

    public Call setMethodWrapper(MethodWrapper methodWrapper) {
        this.mMethodWrapper = methodWrapper;
        return this;
    }

    public Call setParameterWrappers(ParameterWrapper[] parameterWrapperArr) {
        this.mParameterWrappers = parameterWrapperArr;
        return this;
    }

    public boolean isOneWay() {
        return this.isOneWay;
    }

    public Call setOneWay(boolean z) {
        this.isOneWay = z;
        return this;
    }

    public boolean isAutoRecover() {
        return this.isAutoRecover;
    }

    public Call setAutoRecover(boolean z) {
        this.isAutoRecover = z;
        return this;
    }

    public boolean isSameApp() {
        return this.isSameApp;
    }

    public Call setSameApp(boolean z) {
        this.isSameApp = z;
        return this;
    }

    public Uri getRemoteProviderUri() {
        return this.mRemoteProviderUri;
    }

    public Call setRemoteProviderUri(Uri uri) {
        this.mRemoteProviderUri = uri;
        return this;
    }
}
