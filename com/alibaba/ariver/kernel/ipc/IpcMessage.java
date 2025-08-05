package com.alibaba.ariver.kernel.ipc;

import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class IpcMessage implements Parcelable {
    public static final Parcelable.Creator<IpcMessage> CREATOR;
    public String biz;
    public Message bizMsg;
    public String clientId;
    public int lpid;
    public int pid;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static byte[] marshall(IpcMessage ipcMessage) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.writeValue(ipcMessage);
                return obtain.marshall();
            } catch (Exception e) {
                RVLogger.e(RVConstants.TAG, "IpcMsg marshall error " + Log.getStackTraceString(e));
                obtain.recycle();
                return null;
            }
        } finally {
            obtain.recycle();
        }
    }

    public static IpcMessage unmarshall(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (IpcMessage) obtain.readValue(IpcMessage.class.getClassLoader());
        } catch (Exception e) {
            RVLogger.e(RVConstants.TAG, "IpcMsg unmarshall error " + Log.getStackTraceString(e));
            return null;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.pid);
        parcel.writeInt(this.lpid);
        parcel.writeString(this.clientId);
        parcel.writeString(this.biz);
        parcel.writeParcelable(this.bizMsg, i);
    }

    public IpcMessage() {
    }

    protected IpcMessage(Parcel parcel) {
        this.pid = parcel.readInt();
        this.lpid = parcel.readInt();
        this.clientId = parcel.readString();
        this.biz = parcel.readString();
        this.bizMsg = (Message) parcel.readParcelable(Message.class.getClassLoader());
    }

    static {
        kge.a(1857143085);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<IpcMessage>() { // from class: com.alibaba.ariver.kernel.ipc.IpcMessage.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public IpcMessage mo174createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (IpcMessage) ipChange.ipc$dispatch("92f10aa1", new Object[]{this, parcel}) : new IpcMessage(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public IpcMessage[] mo175newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (IpcMessage[]) ipChange.ipc$dispatch("acf0424a", new Object[]{this, new Integer(i)}) : new IpcMessage[i];
            }
        };
    }
}
