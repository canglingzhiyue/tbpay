package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anetwork.channel.NetworkEvent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class DefaultProgressEvent implements Parcelable, NetworkEvent.ProgressEvent {
    public static final Parcelable.Creator<DefaultProgressEvent> CREATOR;
    private static final String TAG = "anet.DefaultProgressEvent";
    Object context;
    int fragmentIndex;
    int index;
    byte[] out;
    int size;
    int total;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public String getDesc() {
        return "";
    }

    public DefaultProgressEvent() {
    }

    public DefaultProgressEvent(int i, int i2, int i3, byte[] bArr) {
        this.index = i;
        this.size = i2;
        this.total = i3;
        this.out = bArr;
    }

    public DefaultProgressEvent(int i, int i2, int i3, byte[] bArr, int i4) {
        this.index = i;
        this.size = i2;
        this.total = i3;
        this.out = bArr;
        this.fragmentIndex = i4;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public int getSize() {
        return this.size;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public int getTotal() {
        return this.total;
    }

    public Object getContext() {
        return this.context;
    }

    public void setContext(Object obj) {
        this.context = obj;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public byte[] getBytedata() {
        return this.out;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public int getIndex() {
        return this.index;
    }

    @Override // anetwork.channel.NetworkEvent.ProgressEvent
    public int getFragmentIndex() {
        return this.fragmentIndex;
    }

    public String toString() {
        return "DefaultProgressEvent [index=" + this.index + ", size=" + this.size + ", total=" + this.total + riy.ARRAY_END_STR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeInt(this.size);
        parcel.writeInt(this.total);
        byte[] bArr = this.out;
        parcel.writeInt(bArr != null ? bArr.length : 0);
        parcel.writeByteArray(this.out);
        parcel.writeInt(this.fragmentIndex);
    }

    public static DefaultProgressEvent readFromParcel(Parcel parcel) {
        DefaultProgressEvent defaultProgressEvent = new DefaultProgressEvent();
        try {
            defaultProgressEvent.index = parcel.readInt();
            defaultProgressEvent.size = parcel.readInt();
            defaultProgressEvent.total = parcel.readInt();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                defaultProgressEvent.out = bArr;
            }
            defaultProgressEvent.fragmentIndex = parcel.readInt();
        } catch (Exception unused) {
        }
        return defaultProgressEvent;
    }

    static {
        kge.a(-1468192547);
        kge.a(-1337521661);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<DefaultProgressEvent>() { // from class: anetwork.channel.aidl.DefaultProgressEvent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public DefaultProgressEvent mo75createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (DefaultProgressEvent) ipChange.ipc$dispatch("6280e831", new Object[]{this, parcel}) : DefaultProgressEvent.readFromParcel(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public DefaultProgressEvent[] mo76newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (DefaultProgressEvent[]) ipChange.ipc$dispatch("f990d99a", new Object[]{this, new Integer(i)}) : new DefaultProgressEvent[i];
            }
        };
    }
}
