package com.taobao.orange.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.orange.aidl.IOrangeApiService;
import tb.kge;

/* loaded from: classes7.dex */
public interface IOrangeBindService extends IInterface {
    boolean isBind() throws RemoteException;

    void setRemoteService(IOrangeApiService iOrangeApiService) throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements IOrangeBindService {
        private static final String DESCRIPTOR = "com.taobao.orange.aidl.IOrangeBindService";
        static final int TRANSACTION_isBind = 1;
        static final int TRANSACTION_setRemoteService = 2;

        static {
            kge.a(1762461440);
            kge.a(-1066929358);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IOrangeBindService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IOrangeBindService)) {
                return (IOrangeBindService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean isBind = isBind();
                parcel2.writeNoException();
                parcel2.writeInt(isBind ? 1 : 0);
                return true;
            } else if (i != 2) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                setRemoteService(IOrangeApiService.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
        }

        /* loaded from: classes7.dex */
        private static class Proxy implements IOrangeBindService {
            private IBinder mRemote;

            static {
                kge.a(955717546);
                kge.a(-1066929358);
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.taobao.orange.aidl.IOrangeBindService
            public boolean isBind() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.orange.aidl.IOrangeBindService
            public void setRemoteService(IOrangeApiService iOrangeApiService) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iOrangeApiService != null ? iOrangeApiService.asBinder() : null);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
