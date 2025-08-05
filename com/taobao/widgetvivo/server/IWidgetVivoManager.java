package com.taobao.widgetvivo.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.widgetvivo.server.IDataRequestListener;
import tb.kge;

/* loaded from: classes9.dex */
public interface IWidgetVivoManager extends IInterface {
    void postOrderRequest() throws RemoteException;

    void postRequest() throws RemoteException;

    void postTaoGoldRequest() throws RemoteException;

    void registerListener(IDataRequestListener iDataRequestListener) throws RemoteException;

    void unregisterListener(IDataRequestListener iDataRequestListener) throws RemoteException;

    /* loaded from: classes9.dex */
    public static abstract class Stub extends Binder implements IWidgetVivoManager {
        private static final String DESCRIPTOR = "com.taobao.widgetvivo.server.IWidgetVivoManager";
        static final int TRANSACTION_postOrderRequest = 5;
        static final int TRANSACTION_postRequest = 3;
        static final int TRANSACTION_postTaoGoldRequest = 4;
        static final int TRANSACTION_registerListener = 1;
        static final int TRANSACTION_unregisterListener = 2;

        static {
            kge.a(1279150494);
            kge.a(1237517780);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IWidgetVivoManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IWidgetVivoManager)) {
                return (IWidgetVivoManager) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                registerListener(IDataRequestListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                unregisterListener(IDataRequestListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                postRequest();
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                postTaoGoldRequest();
                parcel2.writeNoException();
                return true;
            } else if (i != 5) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                postOrderRequest();
                parcel2.writeNoException();
                return true;
            }
        }

        /* loaded from: classes9.dex */
        private static class Proxy implements IWidgetVivoManager {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f23567a;

            static {
                kge.a(885484488);
                kge.a(1237517780);
            }

            Proxy(IBinder iBinder) {
                this.f23567a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23567a;
            }

            @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
            public void registerListener(IDataRequestListener iDataRequestListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iDataRequestListener != null ? iDataRequestListener.asBinder() : null);
                    this.f23567a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
            public void unregisterListener(IDataRequestListener iDataRequestListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iDataRequestListener != null ? iDataRequestListener.asBinder() : null);
                    this.f23567a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
            public void postRequest() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f23567a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
            public void postTaoGoldRequest() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f23567a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
            public void postOrderRequest() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f23567a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
