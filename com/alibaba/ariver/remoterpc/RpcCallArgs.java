package com.alibaba.ariver.remoterpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class RpcCallArgs implements Parcelable {
    public static final Parcelable.Creator<RpcCallArgs> CREATOR;
    public byte[] argsBody;
    public String className;
    public RemoteRpcInvokeContext invokeContext;
    public String methodName;
    public byte protoType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "RpcCallArgs{className='" + this.className + "', methodName='" + this.methodName + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.className);
        parcel.writeString(this.methodName);
        parcel.writeByteArray(this.argsBody);
        parcel.writeByte(this.protoType);
        parcel.writeParcelable(this.invokeContext, i);
    }

    public RpcCallArgs() {
    }

    protected RpcCallArgs(Parcel parcel) {
        this.className = parcel.readString();
        this.methodName = parcel.readString();
        this.argsBody = parcel.createByteArray();
        this.protoType = parcel.readByte();
        this.invokeContext = (RemoteRpcInvokeContext) parcel.readParcelable(InnerRpcInvokeContext.class.getClassLoader());
    }

    static {
        kge.a(1461756909);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<RpcCallArgs>() { // from class: com.alibaba.ariver.remoterpc.RpcCallArgs.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public RpcCallArgs mo184createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (RpcCallArgs) ipChange.ipc$dispatch("b85e7fe1", new Object[]{this, parcel}) : new RpcCallArgs(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public RpcCallArgs[] mo185newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (RpcCallArgs[]) ipChange.ipc$dispatch("d25db78a", new Object[]{this, new Integer(i)}) : new RpcCallArgs[i];
            }
        };
    }
}
