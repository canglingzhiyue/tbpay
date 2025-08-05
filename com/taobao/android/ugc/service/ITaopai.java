package com.taobao.android.ugc.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes6.dex */
public interface ITaopai extends IInterface {

    /* loaded from: classes6.dex */
    public static class Default implements ITaopai {
        static {
            kge.a(-1236576303);
            kge.a(921579092);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taobao.android.ugc.service.ITaopai
        public boolean isPhoneSupport() throws RemoteException {
            return false;
        }
    }

    boolean isPhoneSupport() throws RemoteException;

    /* loaded from: classes6.dex */
    public static abstract class Stub extends Binder implements ITaopai {
        private static final String DESCRIPTOR = "com.taobao.android.ugc.service.ITaopai";
        static final int TRANSACTION_isPhoneSupport = 1;

        static {
            kge.a(-29855458);
            kge.a(921579092);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITaopai asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ITaopai)) {
                return (ITaopai) queryLocalInterface;
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
            boolean isPhoneSupport = isPhoneSupport();
            parcel2.writeNoException();
            parcel2.writeInt(isPhoneSupport ? 1 : 0);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static class Proxy implements ITaopai {
            public static ITaopai b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f15719a;

            static {
                kge.a(-1989807288);
                kge.a(921579092);
            }

            Proxy(IBinder iBinder) {
                this.f15719a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15719a;
            }

            @Override // com.taobao.android.ugc.service.ITaopai
            public boolean isPhoneSupport() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.f15719a.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isPhoneSupport();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(ITaopai iTaopai) {
            if (Proxy.b != null || iTaopai == null) {
                return false;
            }
            Proxy.b = iTaopai;
            return true;
        }

        public static ITaopai getDefaultImpl() {
            return Proxy.b;
        }
    }
}
