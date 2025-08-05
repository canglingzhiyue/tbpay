package com.taobao.aranger.core.wrapper;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.utils.TypeUtils;
import com.taobao.aranger.utils.e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kak;
import tb.kge;

/* loaded from: classes.dex */
public class ParameterWrapper extends a implements Parcelable {
    public static final Parcelable.Creator<ParameterWrapper> CREATOR;
    private static final String TAG;
    private IBinder mClientServiceBinder;
    private Object mData;
    private int mFlowFlag = 0;
    private String mTimeStamp;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        kge.a(1177602826);
        kge.a(1630535278);
        TAG = ParameterWrapper.class.getSimpleName();
        CREATOR = new Parcelable.Creator<ParameterWrapper>() { // from class: com.taobao.aranger.core.wrapper.ParameterWrapper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.aranger.core.wrapper.ParameterWrapper] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ParameterWrapper createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.aranger.core.wrapper.ParameterWrapper[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ParameterWrapper[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public ParameterWrapper a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ParameterWrapper) ipChange.ipc$dispatch("d2c56956", new Object[]{this, parcel});
                }
                ParameterWrapper obtain = ParameterWrapper.obtain();
                obtain.readFromParcel(parcel);
                return obtain;
            }

            public ParameterWrapper[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ParameterWrapper[]) ipChange.ipc$dispatch("d52f5345", new Object[]{this, new Integer(i)}) : new ParameterWrapper[i];
            }
        };
    }

    public static ParameterWrapper obtain() {
        return new ParameterWrapper();
    }

    private ParameterWrapper() {
    }

    @Override // com.taobao.aranger.core.wrapper.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object obj = this.mData;
        if (obj == null || !obj.getClass().getName().equals(getName())) {
            parcel.writeByte((byte) 0);
            super.writeToParcel(parcel, i);
        } else {
            parcel.writeByte((byte) 1);
        }
        parcel.writeByte((byte) this.mFlowFlag);
        if (this.mTimeStamp == null && this.mClientServiceBinder == null) {
            parcel.writeByte((byte) 1);
        } else {
            parcel.writeByte((byte) 0);
            parcel.writeString(this.mTimeStamp);
            parcel.writeStrongBinder(this.mClientServiceBinder);
        }
        e.a(parcel, this.mData, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.taobao.aranger.core.wrapper.a
    public void readFromParcel(Parcel parcel) {
        if (parcel.readByte() == 0) {
            super.readFromParcel(parcel);
        }
        this.mFlowFlag = parcel.readByte();
        if (parcel.readByte() == 0) {
            this.mTimeStamp = parcel.readString();
            this.mClientServiceBinder = parcel.readStrongBinder();
        }
        this.mData = e.a(getClass().getClassLoader(), parcel);
        if (this.mData == null || getName() != null) {
            return;
        }
        setName(this.mData.getClass().getName());
    }

    public Object getData() {
        return this.mData;
    }

    public int getFlowFlag() {
        return this.mFlowFlag;
    }

    public IBinder getClientServiceBinder() {
        return this.mClientServiceBinder;
    }

    public ParameterWrapper setData(Object obj) {
        this.mData = obj;
        Object obj2 = this.mData;
        if (obj2 == null) {
            return this;
        }
        Class<?> cls = obj2.getClass();
        if (this.mFlowFlag == 1) {
            if (cls.isArray()) {
                if (cls.getComponentType() != null) {
                    this.mData = Array.newInstance(cls.getComponentType(), TypeUtils.a(cls.getName(), this.mData));
                } else {
                    this.mData = Array.newInstance(Object.class, TypeUtils.a(cls.getName(), this.mData));
                }
            } else if (List.class.isAssignableFrom(cls)) {
                this.mData = new ArrayList();
            } else if (Map.class.isAssignableFrom(cls)) {
                this.mData = new HashMap();
            } else {
                try {
                    this.mData = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e) {
                    kak.a(TAG, "[setData][newInstance]", e, new Object[0]);
                }
            }
        }
        return this;
    }

    public ParameterWrapper setFlowFlag(int i) {
        this.mFlowFlag = i;
        return this;
    }

    public ParameterWrapper setClientServiceBinder(IBinder iBinder) {
        this.mClientServiceBinder = iBinder;
        return this;
    }

    public ParameterWrapper setParameterName(String str) {
        setName(str);
        return this;
    }

    public ParameterWrapper setTimeStamp(String str) {
        this.mTimeStamp = str;
        return this;
    }

    public String getTimeStamp() {
        return this.mTimeStamp;
    }
}
