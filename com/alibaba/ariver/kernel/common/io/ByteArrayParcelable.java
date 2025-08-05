package com.alibaba.ariver.kernel.common.io;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class ByteArrayParcelable implements Parcelable {
    public static final Parcelable.Creator<ByteArrayParcelable> CREATOR;
    private byte[] bytes;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ByteArrayParcelable(byte[] bArr) {
        this.bytes = bArr;
    }

    protected ByteArrayParcelable(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.bytes = new byte[readInt];
            parcel.readByteArray(this.bytes);
        }
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.bytes;
        int length = bArr == null ? 0 : bArr.length;
        parcel.writeInt(length);
        if (length > 0) {
            parcel.writeByteArray(this.bytes);
        }
    }

    static {
        kge.a(-545547456);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<ByteArrayParcelable>() { // from class: com.alibaba.ariver.kernel.common.io.ByteArrayParcelable.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public ByteArrayParcelable mo172createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ByteArrayParcelable) ipChange.ipc$dispatch("84c422a8", new Object[]{this, parcel}) : new ByteArrayParcelable(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public ByteArrayParcelable[] mo173newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ByteArrayParcelable[]) ipChange.ipc$dispatch("8cdb83df", new Object[]{this, new Integer(i)}) : new ByteArrayParcelable[i];
            }
        };
    }
}
