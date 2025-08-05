package com.taobao.aranger.core.wrapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class MethodWrapper extends a implements Parcelable {
    public static final Parcelable.Creator<MethodWrapper> CREATOR;
    private boolean isVoid;
    private String mReturnType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static MethodWrapper obtain() {
        return new MethodWrapper();
    }

    static {
        kge.a(1322169874);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<MethodWrapper>() { // from class: com.taobao.aranger.core.wrapper.MethodWrapper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.aranger.core.wrapper.MethodWrapper] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MethodWrapper createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.aranger.core.wrapper.MethodWrapper[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MethodWrapper[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public MethodWrapper a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MethodWrapper) ipChange.ipc$dispatch("a6daba4", new Object[]{this, parcel});
                }
                MethodWrapper obtain = MethodWrapper.obtain();
                obtain.readFromParcel(parcel);
                return obtain;
            }

            public MethodWrapper[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MethodWrapper[]) ipChange.ipc$dispatch("1aa2a015", new Object[]{this, new Integer(i)}) : new MethodWrapper[i];
            }
        };
    }

    private MethodWrapper() {
    }

    public String getReturnType() {
        return this.mReturnType;
    }

    @Override // com.taobao.aranger.core.wrapper.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        if (!this.isVoid) {
            parcel.writeByte((byte) 0);
            parcel.writeString(this.mReturnType);
            return;
        }
        parcel.writeByte((byte) 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.taobao.aranger.core.wrapper.a
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        if (parcel.readByte() == 0) {
            this.mReturnType = parcel.readString();
        } else {
            this.isVoid = true;
        }
    }

    public void setReturnType(String str) {
        this.mReturnType = str;
    }

    public MethodWrapper setMethodName(String str) {
        setName(str);
        return this;
    }

    public boolean isVoid() {
        return this.isVoid;
    }

    public MethodWrapper setVoid(boolean z) {
        this.isVoid = z;
        return this;
    }
}
