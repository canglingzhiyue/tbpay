package com.taobao.location.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.TBLocationOption;
import tb.kge;

/* loaded from: classes7.dex */
public interface ITBLocationService extends IInterface {
    void onLocationChanged(TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback) throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements ITBLocationService {
        private static final String DESCRIPTOR = "com.taobao.location.aidl.ITBLocationService";
        static final int TRANSACTION_onLocationChanged = 1;

        static {
            kge.a(-2015432655);
            kge.a(-930918559);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITBLocationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ITBLocationService)) {
                return (ITBLocationService) queryLocalInterface;
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
            onLocationChanged(parcel.readInt() != 0 ? TBLocationOption.CREATOR.createFromParcel(parcel) : null, ITBLocationCallback.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }

        /* loaded from: classes7.dex */
        private static class Proxy implements ITBLocationService {
            private IBinder mRemote;

            static {
                kge.a(-486041573);
                kge.a(-930918559);
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

            @Override // com.taobao.location.aidl.ITBLocationService
            public void onLocationChanged(TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (tBLocationOption != null) {
                        obtain.writeInt(1);
                        tBLocationOption.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iTBLocationCallback != null ? iTBLocationCallback.asBinder() : null);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
