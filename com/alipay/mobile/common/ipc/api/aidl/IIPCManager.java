package com.alipay.mobile.common.ipc.api.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.alipay.mobile.common.ipc.api.aidl.IIPCCallBack;

/* loaded from: classes3.dex */
public interface IIPCManager extends IInterface {
    IPCResult call(IPCParameter iPCParameter);

    boolean hashRegister();

    void registerCallBack(IIPCCallBack iIPCCallBack);

    void unregisterCallBack(IIPCCallBack iIPCCallBack);

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IIPCManager {
        private static final String DESCRIPTOR = "com.alipay.mobile.common.ipc.api.aidl.IIPCManager";
        static final int TRANSACTION_call = 1;
        static final int TRANSACTION_hashRegister = 4;
        static final int TRANSACTION_registerCallBack = 2;
        static final int TRANSACTION_unregisterCallBack = 3;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IIPCManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IIPCManager)) {
                return (IIPCManager) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                IPCResult call = call(parcel.readInt() != 0 ? IPCParameter.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (call != null) {
                    parcel2.writeInt(1);
                    call.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                registerCallBack(IIPCCallBack.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                unregisterCallBack(IIPCCallBack.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 4) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                boolean hashRegister = hashRegister();
                parcel2.writeNoException();
                parcel2.writeInt(hashRegister ? 1 : 0);
                return true;
            }
        }

        /* loaded from: classes3.dex */
        private static class Proxy implements IIPCManager {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.alipay.mobile.common.ipc.api.aidl.IIPCManager
            public IPCResult call(IPCParameter iPCParameter) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iPCParameter != null) {
                        obtain.writeInt(1);
                        iPCParameter.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? IPCResult.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.mobile.common.ipc.api.aidl.IIPCManager
            public void registerCallBack(IIPCCallBack iIPCCallBack) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iIPCCallBack != null ? iIPCCallBack.asBinder() : null);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.mobile.common.ipc.api.aidl.IIPCManager
            public void unregisterCallBack(IIPCCallBack iIPCCallBack) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iIPCCallBack != null ? iIPCCallBack.asBinder() : null);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.mobile.common.ipc.api.aidl.IIPCManager
            public boolean hashRegister() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    this.mRemote.transact(4, obtain, obtain2, 0);
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
    }
}
