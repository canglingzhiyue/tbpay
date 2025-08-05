package anet.channel.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;
import tb.kge;

/* loaded from: classes2.dex */
public class ByteArrayEntry implements BodyEntry {
    public static final Parcelable.Creator<ByteArrayEntry> CREATOR;
    private byte[] bytes;
    private String contentType;
    private int count;
    private int offset;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ByteArrayEntry(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ByteArrayEntry(byte[] bArr, int i, int i2) {
        this.offset = 0;
        this.count = 0;
        this.contentType = null;
        this.bytes = bArr;
        this.offset = i;
        this.count = i2;
    }

    private ByteArrayEntry() {
        this.offset = 0;
        this.count = 0;
        this.contentType = null;
    }

    @Override // anet.channel.request.BodyEntry
    public String getContentType() {
        return this.contentType;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    @Override // anet.channel.request.BodyEntry
    public int writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.bytes, this.offset, this.count);
        return this.count;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.bytes.length);
        parcel.writeByteArray(this.bytes);
        parcel.writeInt(this.offset);
        parcel.writeInt(this.count);
        parcel.writeString(this.contentType);
    }

    static {
        kge.a(928601536);
        kge.a(-748837999);
        CREATOR = new Parcelable.Creator<ByteArrayEntry>() { // from class: anet.channel.request.ByteArrayEntry.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public ByteArrayEntry mo71createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ByteArrayEntry) ipChange.ipc$dispatch("539d90a8", new Object[]{this, parcel});
                }
                ByteArrayEntry byteArrayEntry = new ByteArrayEntry();
                byteArrayEntry.bytes = new byte[parcel.readInt()];
                parcel.readByteArray(byteArrayEntry.bytes);
                byteArrayEntry.offset = parcel.readInt();
                byteArrayEntry.count = parcel.readInt();
                byteArrayEntry.contentType = parcel.readString();
                return byteArrayEntry;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public ByteArrayEntry[] mo72newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ByteArrayEntry[]) ipChange.ipc$dispatch("7ba2735f", new Object[]{this, new Integer(i)}) : new ByteArrayEntry[i];
            }
        };
    }
}
