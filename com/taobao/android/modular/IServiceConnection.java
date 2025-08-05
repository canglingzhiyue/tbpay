package com.taobao.android.modular;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes6.dex */
public interface IServiceConnection extends IInterface {
    void connected(ComponentName componentName, IBinder iBinder) throws RemoteException;

    /* loaded from: classes6.dex */
    public static abstract class Stub extends Binder implements IServiceConnection {
        private static final String DESCRIPTOR = "com.taobao.android.modular.IServiceConnection";
        static final int TRANSACTION_connected = 1;

        static {
            kge.a(823728592);
            kge.a(-986751390);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IServiceConnection asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IServiceConnection)) {
                return (IServiceConnection) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                connected(parcel.readInt() != 0 ? (ComponentName) ComponentName.CREATOR.createFromParcel(parcel) : null, parcel.readStrongBinder());
                return true;
            } else if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* loaded from: classes6.dex */
        private static class Proxy implements IServiceConnection {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f14413a;

            static {
                kge.a(-214053254);
                kge.a(-986751390);
            }

            Proxy(IBinder iBinder) {
                this.f14413a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14413a;
            }

            @Override // com.taobao.android.modular.IServiceConnection
            public void connected(ComponentName componentName, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (componentName != null) {
                        obtain.writeInt(1);
                        componentName.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f14413a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
