package com.alipay.mobile.accountauthbiz;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface IAlipayLoginService extends IInterface {
    String getLoginInfo() throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IAlipayLoginService {
        private static final String DESCRIPTOR = "com.alipay.mobile.accountauthbiz.IAlipayLoginService";
        static final int TRANSACTION_getLoginInfo = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAlipayLoginService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAlipayLoginService)) {
                return (IAlipayLoginService) queryLocalInterface;
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
            String loginInfo = getLoginInfo();
            parcel2.writeNoException();
            parcel2.writeString(loginInfo);
            return true;
        }

        /* loaded from: classes3.dex */
        private static class Proxy implements IAlipayLoginService {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f5331a;

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.f5331a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5331a;
            }

            @Override // com.alipay.mobile.accountauthbiz.IAlipayLoginService
            public String getLoginInfo() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f5331a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
