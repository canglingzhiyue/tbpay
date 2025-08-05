package com.hihonor.cloudservice.oaid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.hihonor.cloudservice.oaid.IOAIDCallBack;
import tb.kge;

/* loaded from: classes4.dex */
public interface IOAIDService extends IInterface {

    /* loaded from: classes4.dex */
    public static abstract class Stub extends Binder implements IOAIDService {
        private static final String DESCRIPTOR = "com.hihonor.cloudservice.oaid.IOAIDService";
        static final int TRANSACTION_basicTypes = 1;
        static final int TRANSACTION_getOAID = 2;
        static final int TRANSACTION_isOAIDTrackingLimited = 3;

        /* loaded from: classes4.dex */
        private static class Proxy implements IOAIDService {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f7257a;

            static {
                kge.a(-257076042);
                kge.a(-1632279130);
            }

            Proxy(IBinder iBinder) {
                this.f7257a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7257a;
            }

            @Override // com.hihonor.cloudservice.oaid.IOAIDService
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
                    this.f7257a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.hihonor.cloudservice.oaid.IOAIDService
            public void getOAID(IOAIDCallBack iOAIDCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iOAIDCallBack != null ? iOAIDCallBack.asBinder() : null);
                    this.f7257a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.hihonor.cloudservice.oaid.IOAIDService
            public void isOAIDTrackingLimited(IOAIDCallBack iOAIDCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iOAIDCallBack != null ? iOAIDCallBack.asBinder() : null);
                    this.f7257a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        static {
            kge.a(-1052181236);
            kge.a(-1632279130);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IOAIDService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOAIDService)) ? new Proxy(iBinder) : (IOAIDService) queryLocalInterface;
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
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                getOAID(IOAIDCallBack.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                isOAIDTrackingLimited(IOAIDCallBack.Stub.asInterface(parcel.readStrongBinder()));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void basicTypes(int i, long j, boolean z, float f, double d, String str) throws RemoteException;

    void getOAID(IOAIDCallBack iOAIDCallBack) throws RemoteException;

    void isOAIDTrackingLimited(IOAIDCallBack iOAIDCallBack) throws RemoteException;
}
