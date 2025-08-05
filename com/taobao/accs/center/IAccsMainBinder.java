package com.taobao.accs.center;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.aranger.annotation.type.Callback;
import tb.kge;

@Callback
/* loaded from: classes.dex */
public interface IAccsMainBinder extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IAccsMainBinder {
        static {
            kge.a(1552703851);
            kge.a(-604540434);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taobao.accs.center.IAccsMainBinder
        public void onMessage(Intent intent) throws RemoteException {
        }
    }

    void onMessage(Intent intent) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IAccsMainBinder {
        private static final String DESCRIPTOR = "com.taobao.accs.center.IAccsMainBinder";
        static final int TRANSACTION_onMessage = 1;

        static {
            kge.a(1917541828);
            kge.a(-604540434);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAccsMainBinder asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAccsMainBinder)) {
                return (IAccsMainBinder) queryLocalInterface;
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
            onMessage(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements IAccsMainBinder {

            /* renamed from: a  reason: collision with root package name */
            public static IAccsMainBinder f8199a;
            private IBinder b;

            static {
                kge.a(-1277015186);
                kge.a(-604540434);
            }

            Proxy(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.b;
            }

            @Override // com.taobao.accs.center.IAccsMainBinder
            public void onMessage(Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.b.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onMessage(intent);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IAccsMainBinder iAccsMainBinder) {
            if (Proxy.f8199a == null) {
                if (iAccsMainBinder == null) {
                    return false;
                }
                Proxy.f8199a = iAccsMainBinder;
                return true;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        public static IAccsMainBinder getDefaultImpl() {
            return Proxy.f8199a;
        }
    }
}
