package com.taobao.aranger.core.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.utils.e;
import tb.kge;

/* loaded from: classes.dex */
public class Callback implements Parcelable {
    public static final Parcelable.Creator<Callback> CREATOR;
    private boolean isOneWay;
    private long mDataSize;
    private MethodWrapper mMethodWrapper;
    private ParameterWrapper[] mParameterWrappers;
    private String mTimeStamp;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static Callback obtain() {
        return new Callback();
    }

    static {
        kge.a(1900956749);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<Callback>() { // from class: com.taobao.aranger.core.entity.Callback.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.aranger.core.entity.Callback, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Callback createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.aranger.core.entity.Callback[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Callback[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public Callback a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Callback) ipChange.ipc$dispatch("1f6ba509", new Object[]{this, parcel});
                }
                Callback obtain = Callback.obtain();
                obtain.readFromParcel(parcel);
                return obtain;
            }

            public Callback[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Callback[]) ipChange.ipc$dispatch("65c9023a", new Object[]{this, new Integer(i)}) : new Callback[i];
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTimeStamp);
        this.mMethodWrapper.writeToParcel(parcel, i);
        this.mDataSize = e.a(parcel, this.mParameterWrappers, i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readFromParcel(Parcel parcel) {
        this.mTimeStamp = parcel.readString();
        this.mMethodWrapper = MethodWrapper.CREATOR.createFromParcel(parcel);
        this.mParameterWrappers = (ParameterWrapper[]) e.a(getClass().getClassLoader(), parcel);
    }

    private Callback() {
    }

    public ParameterWrapper[] getParameterWrappers() {
        return this.mParameterWrappers;
    }

    public MethodWrapper getMethodWrapper() {
        return this.mMethodWrapper;
    }

    public long getDataSize() {
        return this.mDataSize;
    }

    public Callback setMethodWrapper(MethodWrapper methodWrapper) {
        this.mMethodWrapper = methodWrapper;
        return this;
    }

    public Callback setParameterWrappers(ParameterWrapper[] parameterWrapperArr) {
        this.mParameterWrappers = parameterWrapperArr;
        return this;
    }

    public String getTimeStamp() {
        return this.mTimeStamp;
    }

    public Callback setTimeStamp(String str) {
        this.mTimeStamp = str;
        return this;
    }

    public boolean isOneWay() {
        return this.isOneWay;
    }

    public Callback setOneWay(boolean z) {
        this.isOneWay = z;
        return this;
    }
}
