package com.alibaba.ariver.remoterpc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes2.dex */
public interface IRpcCaller extends IInterface {
    RpcCallRet call(RpcCallArgs rpcCallArgs) throws RemoteException;

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IRpcCaller {
        private static final String DESCRIPTOR = "com.alibaba.ariver.remoterpc.IRpcCaller";
        static final int TRANSACTION_call = 1;

        static {
            kge.a(520801272);
            kge.a(-38735046);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRpcCaller asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IRpcCaller)) {
                return (IRpcCaller) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            RpcCallRet call = call(parcel.readInt() != 0 ? RpcCallArgs.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            if (call != null) {
                parcel2.writeInt(1);
                call.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }

        /* loaded from: classes2.dex */
        private static class Proxy implements IRpcCaller {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f2915a;

            static {
                kge.a(1100694178);
                kge.a(-38735046);
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.f2915a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2915a;
            }

            @Override // com.alibaba.ariver.remoterpc.IRpcCaller
            public RpcCallRet call(RpcCallArgs rpcCallArgs) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (rpcCallArgs != null) {
                        obtain.writeInt(1);
                        rpcCallArgs.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2915a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? RpcCallRet.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
