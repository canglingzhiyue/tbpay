package mtopsdk.network.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;
import tb.kge;

/* loaded from: classes.dex */
public class ParcelableRequestBodyImpl extends a implements Parcelable {
    public static final Parcelable.Creator<ParcelableRequestBodyImpl> CREATOR;
    private byte[] content;
    private String contentType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableRequestBodyImpl(String str, byte[] bArr) {
        this.content = bArr;
        this.contentType = str;
    }

    @Override // mtopsdk.network.domain.a
    public String contentType() {
        return this.contentType;
    }

    @Override // mtopsdk.network.domain.a
    public long contentLength() {
        byte[] bArr = this.content;
        return bArr != null ? bArr.length : super.contentLength();
    }

    @Override // mtopsdk.network.domain.a
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.content);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.contentType);
        parcel.writeByteArray(this.content);
    }

    protected ParcelableRequestBodyImpl(Parcel parcel) {
        this.contentType = parcel.readString();
        this.content = parcel.createByteArray();
    }

    static {
        kge.a(937769281);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<ParcelableRequestBodyImpl>() { // from class: mtopsdk.network.domain.ParcelableRequestBodyImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [mtopsdk.network.domain.ParcelableRequestBodyImpl, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ParcelableRequestBodyImpl createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [mtopsdk.network.domain.ParcelableRequestBodyImpl[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ParcelableRequestBodyImpl[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public ParcelableRequestBodyImpl a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ParcelableRequestBodyImpl) ipChange.ipc$dispatch("179ec1ff", new Object[]{this, parcel}) : new ParcelableRequestBodyImpl(parcel);
            }

            public ParcelableRequestBodyImpl[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ParcelableRequestBodyImpl[]) ipChange.ipc$dispatch("1a08abee", new Object[]{this, new Integer(i)}) : new ParcelableRequestBodyImpl[i];
            }
        };
    }
}
