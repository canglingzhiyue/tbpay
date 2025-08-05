package mtopsdk.network.impl;

import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.request.BodyEntry;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;
import mtopsdk.network.domain.ParcelableRequestBodyImpl;
import tb.kge;

/* loaded from: classes.dex */
public class ParcelableRequestBodyEntry implements BodyEntry {
    public static final Parcelable.Creator<ParcelableRequestBodyEntry> CREATOR;
    ParcelableRequestBodyImpl requestBody;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableRequestBodyEntry(ParcelableRequestBodyImpl parcelableRequestBodyImpl) {
        this.requestBody = parcelableRequestBodyImpl;
    }

    @Override // anet.channel.request.BodyEntry
    public String getContentType() {
        return this.requestBody.contentType();
    }

    @Override // anet.channel.request.BodyEntry
    public int writeTo(OutputStream outputStream) throws IOException {
        this.requestBody.writeTo(outputStream);
        return (int) this.requestBody.contentLength();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.requestBody, i);
    }

    protected ParcelableRequestBodyEntry(Parcel parcel) {
        this.requestBody = (ParcelableRequestBodyImpl) parcel.readParcelable(ParcelableRequestBodyImpl.class.getClassLoader());
    }

    static {
        kge.a(866526997);
        kge.a(-748837999);
        CREATOR = new Parcelable.Creator<ParcelableRequestBodyEntry>() { // from class: mtopsdk.network.impl.ParcelableRequestBodyEntry.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [mtopsdk.network.impl.ParcelableRequestBodyEntry, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ParcelableRequestBodyEntry createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [mtopsdk.network.impl.ParcelableRequestBodyEntry[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ParcelableRequestBodyEntry[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public ParcelableRequestBodyEntry a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ParcelableRequestBodyEntry) ipChange.ipc$dispatch("7d997841", new Object[]{this, parcel}) : new ParcelableRequestBodyEntry(parcel);
            }

            public ParcelableRequestBodyEntry[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ParcelableRequestBodyEntry[]) ipChange.ipc$dispatch("54631472", new Object[]{this, new Integer(i)}) : new ParcelableRequestBodyEntry[i];
            }
        };
    }
}
