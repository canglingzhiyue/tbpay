package com.alibaba.ariver.engine.api.bridge.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes2.dex */
public class CreateParams implements Parcelable {
    public static final Parcelable.Creator<CreateParams> CREATOR;
    public int containerHeight;
    public int containerWidth;
    public String createUrl;
    public ArrayList<String> resourceUrls;
    public Bundle startParams;
    public URLVisitListener urlVisitListener;
    public boolean useForEmbed;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CreateParams() {
    }

    protected CreateParams(Parcel parcel) {
        this.startParams = parcel.readBundle(CreateParams.class.getClassLoader());
        this.createUrl = parcel.readString();
        this.containerWidth = parcel.readInt();
        this.containerHeight = parcel.readInt();
        this.useForEmbed = parcel.readByte() != 0;
        this.resourceUrls = parcel.readArrayList(String.class.getClassLoader());
    }

    static {
        kge.a(760264175);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<CreateParams>() { // from class: com.alibaba.ariver.engine.api.bridge.model.CreateParams.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public CreateParams mo160createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (CreateParams) ipChange.ipc$dispatch("f1925dd9", new Object[]{this, parcel}) : new CreateParams(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public CreateParams[] mo161newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (CreateParams[]) ipChange.ipc$dispatch("f9a9bf10", new Object[]{this, new Integer(i)}) : new CreateParams[i];
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.startParams);
        parcel.writeString(this.createUrl);
        parcel.writeInt(this.containerWidth);
        parcel.writeInt(this.containerHeight);
        parcel.writeByte(this.useForEmbed ? (byte) 1 : (byte) 0);
        parcel.writeList(this.resourceUrls);
    }
}
