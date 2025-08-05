package com.taobao.taobao.scancode.encode.aidlservice;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class BitmapHolder implements Parcelable {
    public static final Parcelable.Creator<BitmapHolder> CREATOR;
    public Bitmap encodeResult;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BitmapHolder(Bitmap bitmap) {
        this.encodeResult = bitmap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.encodeResult.writeToParcel(parcel, i);
    }

    public void readFromParcel(Parcel parcel) {
        this.encodeResult = (Bitmap) Bitmap.CREATOR.createFromParcel(parcel);
    }

    static {
        kge.a(1471108743);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<BitmapHolder>() { // from class: com.taobao.taobao.scancode.encode.aidlservice.BitmapHolder.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.taobao.scancode.encode.aidlservice.BitmapHolder, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ BitmapHolder createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.taobao.scancode.encode.aidlservice.BitmapHolder[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ BitmapHolder[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public BitmapHolder[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (BitmapHolder[]) ipChange.ipc$dispatch("d4ab3e68", new Object[]{this, new Integer(i)}) : new BitmapHolder[i];
            }

            public BitmapHolder a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (BitmapHolder) ipChange.ipc$dispatch("d94db339", new Object[]{this, parcel}) : new BitmapHolder((Bitmap) Bitmap.CREATOR.createFromParcel(parcel));
            }
        };
    }
}
