package com.taobao.calendar.bridge.listener;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes6.dex */
public interface CalendarListener extends IInterface {

    /* loaded from: classes6.dex */
    public static abstract class Stub extends Binder implements CalendarListener {
        private static final String DESCRIPTOR = "com.taobao.calendar.bridge.listener.CalendarListener";
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* loaded from: classes6.dex */
        private static class Proxy implements CalendarListener {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f16854a;

            static {
                kge.a(-95081993);
                kge.a(1920880389);
            }

            Proxy(IBinder iBinder) {
                this.f16854a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16854a;
            }

            @Override // com.taobao.calendar.bridge.listener.CalendarListener
            public void onError(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f16854a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.calendar.bridge.listener.CalendarListener
            public void onSuccess(boolean z, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str);
                    this.f16854a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        static {
            kge.a(1170609933);
            kge.a(1920880389);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static CalendarListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof CalendarListener)) ? new Proxy(iBinder) : (CalendarListener) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSuccess(parcel.readInt() != 0, parcel.readString());
            } else if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                onError(parcel.readString(), parcel.readString());
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onError(String str, String str2) throws RemoteException;

    void onSuccess(boolean z, String str) throws RemoteException;
}
