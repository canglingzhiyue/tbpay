package com.taobao.location.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.location.common.TBLocationDTO;
import tb.kge;

/* loaded from: classes7.dex */
public interface ITBLocationCallback extends IInterface {
    void onLocationChanged(TBLocationDTO tBLocationDTO) throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements ITBLocationCallback {
        private static final String DESCRIPTOR = "com.taobao.location.aidl.ITBLocationCallback";
        static final int TRANSACTION_onLocationChanged = 1;

        static {
            kge.a(-1813879431);
            kge.a(-345133799);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITBLocationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ITBLocationCallback)) {
                return (ITBLocationCallback) queryLocalInterface;
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
            TBLocationDTO createFromParcel = parcel.readInt() != 0 ? TBLocationDTO.CREATOR.createFromParcel(parcel) : null;
            onLocationChanged(createFromParcel);
            parcel2.writeNoException();
            if (createFromParcel != null) {
                parcel2.writeInt(1);
                createFromParcel.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }

        /* loaded from: classes7.dex */
        private static class Proxy implements ITBLocationCallback {
            private IBinder mRemote;

            static {
                kge.a(-1163921565);
                kge.a(-345133799);
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

            @Override // com.taobao.location.aidl.ITBLocationCallback
            public void onLocationChanged(TBLocationDTO tBLocationDTO) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (tBLocationDTO != null) {
                        obtain.writeInt(1);
                        tBLocationDTO.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        tBLocationDTO.readFromParcel(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
