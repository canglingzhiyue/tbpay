package com.uc.webview.export.multiprocess;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes9.dex */
public interface IChildProcessSetup extends IInterface {
    public static final String DESCRIPTOR = "com.uc.webview.export.multiprocess.IChildProcessSetup";

    /* loaded from: classes9.dex */
    public static abstract class Stub extends Binder implements IChildProcessSetup {
        static final int TRANSACTION_preSetupConnection = 1;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes9.dex */
        public static class a implements IChildProcessSetup {

            /* renamed from: a  reason: collision with root package name */
            public static IChildProcessSetup f23831a;
            private IBinder b;

            a(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.b;
            }

            @Override // com.uc.webview.export.multiprocess.IChildProcessSetup
            public final IBinder preSetupConnection(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IChildProcessSetup.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.b.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().preSetupConnection(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IChildProcessSetup.DESCRIPTOR);
        }

        public static IChildProcessSetup asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IChildProcessSetup.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IChildProcessSetup)) ? new a(iBinder) : (IChildProcessSetup) queryLocalInterface;
        }

        public static IChildProcessSetup getDefaultImpl() {
            return a.f23831a;
        }

        public static boolean setDefaultImpl(IChildProcessSetup iChildProcessSetup) {
            if (a.f23831a == null) {
                if (iChildProcessSetup == null) {
                    return false;
                }
                a.f23831a = iChildProcessSetup;
                return true;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IChildProcessSetup.DESCRIPTOR);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(IChildProcessSetup.DESCRIPTOR);
                IBinder preSetupConnection = preSetupConnection(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(preSetupConnection);
                return true;
            }
        }
    }

    IBinder preSetupConnection(Bundle bundle) throws RemoteException;
}
