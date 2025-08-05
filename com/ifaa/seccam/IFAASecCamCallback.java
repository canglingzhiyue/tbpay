package com.ifaa.seccam;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public interface IFAASecCamCallback extends IInterface {

    /* loaded from: classes4.dex */
    public static class Default implements IFAASecCamCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ifaa.seccam.IFAASecCamCallback
        public void onFrameEvent(int i, int i2) throws RemoteException {
        }
    }

    void onFrameEvent(int i, int i2) throws RemoteException;

    /* loaded from: classes4.dex */
    public static abstract class Stub extends Binder implements IFAASecCamCallback {
        private static final String DESCRIPTOR = "com.ifaa.seccam.IFAASecCamCallback";
        static final int TRANSACTION_onFrameEvent = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IFAASecCamCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IFAASecCamCallback)) {
                return (IFAASecCamCallback) queryLocalInterface;
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
            onFrameEvent(parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public static class Proxy implements IFAASecCamCallback {

            /* renamed from: a  reason: collision with root package name */
            public static IFAASecCamCallback f7621a;
            private IBinder b;

            Proxy(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.b;
            }

            @Override // com.ifaa.seccam.IFAASecCamCallback
            public void onFrameEvent(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.b.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onFrameEvent(i, i2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IFAASecCamCallback iFAASecCamCallback) {
            if (Proxy.f7621a == null) {
                if (iFAASecCamCallback == null) {
                    return false;
                }
                Proxy.f7621a = iFAASecCamCallback;
                return true;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        public static IFAASecCamCallback getDefaultImpl() {
            return Proxy.f7621a;
        }
    }
}
