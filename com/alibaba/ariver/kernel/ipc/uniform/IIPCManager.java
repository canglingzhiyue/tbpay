package com.alibaba.ariver.kernel.ipc.uniform;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes2.dex */
public interface IIPCManager extends IInterface {
    IPCResult call(IPCParameter iPCParameter) throws RemoteException;

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IIPCManager {
        private static final String DESCRIPTOR = "com.alibaba.ariver.kernel.ipc.uniform.IIPCManager";
        static final int TRANSACTION_call = 1;

        static {
            kge.a(-1446010283);
            kge.a(191682237);
        }

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
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
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
        }

        /* loaded from: classes2.dex */
        private static class Proxy implements IIPCManager {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f2914a;

            static {
                kge.a(1451958079);
                kge.a(191682237);
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.f2914a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2914a;
            }

            @Override // com.alibaba.ariver.kernel.ipc.uniform.IIPCManager
            public IPCResult call(IPCParameter iPCParameter) throws RemoteException {
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
                    this.f2914a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? IPCResult.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
