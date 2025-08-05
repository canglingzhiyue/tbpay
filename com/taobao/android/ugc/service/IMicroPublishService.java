package com.taobao.android.ugc.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.android.ugc.service.ICallback;
import tb.kge;

/* loaded from: classes6.dex */
public interface IMicroPublishService extends IInterface {

    /* loaded from: classes6.dex */
    public static class Default implements IMicroPublishService {
        static {
            kge.a(2053337129);
            kge.a(-328196436);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taobao.android.ugc.service.IMicroPublishService
        public void dismiss(String str) throws RemoteException {
        }

        @Override // com.taobao.android.ugc.service.IMicroPublishService
        public void onActivityResult(String str, int i, int i2, Intent intent) throws RemoteException {
        }

        @Override // com.taobao.android.ugc.service.IMicroPublishService
        public void showView(String str, String str2, String str3, ICallback iCallback) throws RemoteException {
        }
    }

    void dismiss(String str) throws RemoteException;

    void onActivityResult(String str, int i, int i2, Intent intent) throws RemoteException;

    void showView(String str, String str2, String str3, ICallback iCallback) throws RemoteException;

    /* loaded from: classes6.dex */
    public static abstract class Stub extends Binder implements IMicroPublishService {
        private static final String DESCRIPTOR = "com.taobao.android.ugc.service.IMicroPublishService";
        static final int TRANSACTION_dismiss = 3;
        static final int TRANSACTION_onActivityResult = 2;
        static final int TRANSACTION_showView = 1;

        static {
            kge.a(-1298729018);
            kge.a(-328196436);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMicroPublishService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IMicroPublishService)) {
                return (IMicroPublishService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                showView(parcel.readString(), parcel.readString(), parcel.readString(), ICallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onActivityResult(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 3) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                dismiss(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static class Proxy implements IMicroPublishService {
            public static IMicroPublishService b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f15718a;

            static {
                kge.a(962518000);
                kge.a(-328196436);
            }

            Proxy(IBinder iBinder) {
                this.f15718a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15718a;
            }

            @Override // com.taobao.android.ugc.service.IMicroPublishService
            public void showView(String str, String str2, String str3, ICallback iCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeStrongBinder(iCallback != null ? iCallback.asBinder() : null);
                    if (!this.f15718a.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().showView(str, str2, str3, iCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.ugc.service.IMicroPublishService
            public void onActivityResult(String str, int i, int i2, Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f15718a.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onActivityResult(str, i, i2, intent);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.ugc.service.IMicroPublishService
            public void dismiss(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.f15718a.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().dismiss(str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IMicroPublishService iMicroPublishService) {
            if (Proxy.b != null || iMicroPublishService == null) {
                return false;
            }
            Proxy.b = iMicroPublishService;
            return true;
        }

        public static IMicroPublishService getDefaultImpl() {
            return Proxy.b;
        }
    }
}
