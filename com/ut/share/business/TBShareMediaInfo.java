package com.ut.share.business;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes9.dex */
public class TBShareMediaInfo implements Parcelable {
    public static final Parcelable.Creator<TBShareMediaInfo> CREATOR;
    private float height;
    @TBShareMediaContentType
    private int type;
    private float width;

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes9.dex */
    public @interface TBShareMediaContentType {
        public static final int TYPE_IMAGE = 1;
        public static final int TYPE_NONE = 0;
        public static final int TYPE_VIDEO = 2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float f) {
        this.width = f;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeFloat(this.width);
        parcel.writeFloat(this.height);
    }

    public TBShareMediaInfo() {
    }

    protected TBShareMediaInfo(Parcel parcel) {
        this.type = parcel.readInt();
        this.width = parcel.readFloat();
        this.height = parcel.readFloat();
    }

    static {
        kge.a(1986124734);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<TBShareMediaInfo>() { // from class: com.ut.share.business.TBShareMediaInfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public TBShareMediaInfo mo1608createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TBShareMediaInfo) ipChange.ipc$dispatch("278b22f0", new Object[]{this, parcel}) : new TBShareMediaInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public TBShareMediaInfo[] mo1609newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TBShareMediaInfo[]) ipChange.ipc$dispatch("381630d9", new Object[]{this, new Integer(i)}) : new TBShareMediaInfo[i];
            }
        };
    }
}
