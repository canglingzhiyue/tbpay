package com.taobao.widgetvivo.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes9.dex */
public interface IDataRequestListener extends IInterface {
    void dataRequestFailure(String str) throws RemoteException;

    void dataRequestSuccess(String str) throws RemoteException;

    /* loaded from: classes9.dex */
    public static abstract class Stub extends Binder implements IDataRequestListener {
        private static final String DESCRIPTOR = "com.taobao.widgetvivo.server.IDataRequestListener";
        static final int TRANSACTION_dataRequestFailure = 2;
        static final int TRANSACTION_dataRequestSuccess = 1;

        static {
            kge.a(-1882733054);
            kge.a(-254911760);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IDataRequestListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IDataRequestListener)) {
                return (IDataRequestListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                dataRequestSuccess(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 2) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                dataRequestFailure(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
        }

        /* loaded from: classes9.dex */
        private static class Proxy implements IDataRequestListener {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f23566a;

            static {
                kge.a(473107756);
                kge.a(-254911760);
            }

            Proxy(IBinder iBinder) {
                this.f23566a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23566a;
            }

            @Override // com.taobao.widgetvivo.server.IDataRequestListener
            public void dataRequestSuccess(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f23566a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.widgetvivo.server.IDataRequestListener
            public void dataRequestFailure(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f23566a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
