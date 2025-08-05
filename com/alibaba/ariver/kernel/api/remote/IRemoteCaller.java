package com.alibaba.ariver.kernel.api.remote;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes2.dex */
public interface IRemoteCaller extends IInterface {
    RemoteCallResult remoteCall(RemoteCallArgs remoteCallArgs) throws RemoteException;

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IRemoteCaller {
        private static final String DESCRIPTOR = "com.alibaba.ariver.kernel.api.remote.IRemoteCaller";
        static final int TRANSACTION_remoteCall = 1;

        static {
            kge.a(1060406461);
            kge.a(281940821);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteCaller asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IRemoteCaller)) {
                return (IRemoteCaller) queryLocalInterface;
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
            RemoteCallResult remoteCall = remoteCall(parcel.readInt() != 0 ? RemoteCallArgs.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            if (remoteCall != null) {
                parcel2.writeInt(1);
                remoteCall.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }

        /* loaded from: classes2.dex */
        private static class Proxy implements IRemoteCaller {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f2905a;

            static {
                kge.a(247894951);
                kge.a(281940821);
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.f2905a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2905a;
            }

            @Override // com.alibaba.ariver.kernel.api.remote.IRemoteCaller
            public RemoteCallResult remoteCall(RemoteCallArgs remoteCallArgs) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (remoteCallArgs != null) {
                        obtain.writeInt(1);
                        remoteCallArgs.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2905a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? RemoteCallResult.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
