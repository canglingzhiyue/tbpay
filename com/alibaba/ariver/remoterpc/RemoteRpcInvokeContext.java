package com.alibaba.ariver.remoterpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class RemoteRpcInvokeContext extends InnerRpcInvokeContext implements Parcelable {
    public static final Parcelable.Creator<RemoteRpcInvokeContext> CREATOR;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RemoteRpcInvokeContext(InnerRpcInvokeContext innerRpcInvokeContext) {
        this.appId = innerRpcInvokeContext.appId;
        this.timeout = innerRpcInvokeContext.timeout;
        this.gwUrl = innerRpcInvokeContext.gwUrl;
        this.requestHeaders = innerRpcInvokeContext.requestHeaders;
        this.compress = innerRpcInvokeContext.compress;
        this.appKey = innerRpcInvokeContext.appKey;
        this.resetCookie = innerRpcInvokeContext.resetCookie;
        this.bgRpc = innerRpcInvokeContext.bgRpc;
        this.responseHeader = innerRpcInvokeContext.responseHeader;
        this.allowRetry = innerRpcInvokeContext.allowRetry;
        this.isUrgent = innerRpcInvokeContext.isUrgent;
        this.isRpcV2 = innerRpcInvokeContext.isRpcV2;
        this.allowBgLogin = innerRpcInvokeContext.allowBgLogin;
        this.allowNonNet = innerRpcInvokeContext.allowNonNet;
        this.rpcInterceptorList = innerRpcInvokeContext.getRpcInterceptorList();
        setExtParams(innerRpcInvokeContext.getExtParams());
        this.workspaceId = innerRpcInvokeContext.workspaceId;
        this.protocolVersion = innerRpcInvokeContext.protocolVersion;
        this.isCustGwUrl = innerRpcInvokeContext.isCustGwUrl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appId);
        parcel.writeLong(this.timeout);
        parcel.writeString(this.gwUrl);
        if (this.requestHeaders == null) {
            this.requestHeaders = new HashMap();
        }
        parcel.writeInt(this.requestHeaders.size());
        for (Map.Entry<String, String> entry : this.requestHeaders.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeValue(this.compress);
        parcel.writeString(this.appKey);
        parcel.writeValue(this.resetCookie);
        parcel.writeValue(this.bgRpc);
        if (this.responseHeader == null) {
            this.responseHeader = new HashMap();
        }
        parcel.writeInt(this.responseHeader.size());
        for (Map.Entry<String, String> entry2 : this.responseHeader.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
        parcel.writeValue(this.allowRetry);
        parcel.writeByte(this.isUrgent ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isRpcV2 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.allowBgLogin ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.allowNonNet ? (byte) 1 : (byte) 0);
        parcel.writeInt(getExtParams() == null ? 0 : getExtParams().size());
        if (getExtParams() != null) {
            for (Map.Entry<String, String> entry3 : getExtParams().entrySet()) {
                parcel.writeString(entry3.getKey());
                parcel.writeString(entry3.getValue());
            }
        }
        parcel.writeString(this.workspaceId);
        parcel.writeString(this.protocolVersion);
        parcel.writeByte(this.isCustGwUrl ? (byte) 1 : (byte) 0);
    }

    public RemoteRpcInvokeContext() {
    }

    protected RemoteRpcInvokeContext(Parcel parcel) {
        this.appId = parcel.readString();
        this.timeout = parcel.readLong();
        this.gwUrl = parcel.readString();
        int readInt = parcel.readInt();
        this.requestHeaders = new HashMap(readInt);
        boolean z = false;
        for (int i = 0; i < readInt; i++) {
            this.requestHeaders.put(parcel.readString(), parcel.readString());
        }
        this.compress = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.appKey = parcel.readString();
        this.resetCookie = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.bgRpc = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        int readInt2 = parcel.readInt();
        this.responseHeader = new HashMap(readInt2);
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.responseHeader.put(parcel.readString(), parcel.readString());
        }
        this.allowRetry = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.isUrgent = parcel.readByte() != 0;
        this.isRpcV2 = parcel.readByte() != 0;
        this.allowBgLogin = parcel.readByte() != 0;
        this.allowNonNet = parcel.readByte() != 0;
        int readInt3 = parcel.readInt();
        if (readInt3 > 0) {
            HashMap hashMap = new HashMap(readInt3);
            for (int i3 = 0; i3 < readInt3; i3++) {
                hashMap.put(parcel.readString(), parcel.readString());
            }
            setExtParams(hashMap);
        }
        this.workspaceId = parcel.readString();
        this.protocolVersion = parcel.readString();
        this.isCustGwUrl = parcel.readByte() != 0 ? true : z;
    }

    static {
        kge.a(-870158357);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<RemoteRpcInvokeContext>() { // from class: com.alibaba.ariver.remoterpc.RemoteRpcInvokeContext.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public RemoteRpcInvokeContext mo182createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (RemoteRpcInvokeContext) ipChange.ipc$dispatch("f3b7c1dd", new Object[]{this, parcel}) : new RemoteRpcInvokeContext(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public RemoteRpcInvokeContext[] mo183newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (RemoteRpcInvokeContext[]) ipChange.ipc$dispatch("33265694", new Object[]{this, new Integer(i)}) : new RemoteRpcInvokeContext[i];
            }
        };
    }
}
