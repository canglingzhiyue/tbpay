package com.hihonor.cloudservice.oaid;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes4.dex */
public interface IOAIDCallBack extends IInterface {

    /* loaded from: classes4.dex */
    public static abstract class Stub extends Binder implements IOAIDCallBack {
        private static final String DESCRIPTOR = "com.hihonor.cloudservice.oaid.IOAIDCallBack";
        static final int TRANSACTION_basicTypes = 1;
        static final int TRANSACTION_handleResult = 2;

        /* loaded from: classes4.dex */
        private static class Proxy implements IOAIDCallBack {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f7256a;

            static {
                kge.a(642024968);
                kge.a(-613428332);
            }

            Proxy(IBinder iBinder) {
                this.f7256a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7256a;
            }

            @Override // com.hihonor.cloudservice.oaid.IOAIDCallBack
            public void basicTypes(int i, long j, boolean z, float f, double d, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeFloat(f);
                    obtain.writeDouble(d);
                    obtain.writeString(str);
                    this.f7256a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.hihonor.cloudservice.oaid.IOAIDCallBack
            public void handleResult(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7256a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        static {
            kge.a(-13888546);
            kge.a(-613428332);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IOAIDCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOAIDCallBack)) ? new Proxy(iBinder) : (IOAIDCallBack) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                basicTypes(parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readFloat(), parcel.readDouble(), parcel.readString());
            } else if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                handleResult(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void basicTypes(int i, long j, boolean z, float f, double d, String str) throws RemoteException;

    void handleResult(int i, Bundle bundle) throws RemoteException;
}
