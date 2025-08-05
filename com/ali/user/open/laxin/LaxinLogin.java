package com.ali.user.open.laxin;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ali.user.open.laxin.LaxinDataCallback;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public interface LaxinLogin extends IInterface {

    /* loaded from: classes2.dex */
    public static class Default implements LaxinLogin {
        static {
            kge.a(-202033787);
            kge.a(31129608);
        }

        @Override // com.ali.user.open.laxin.LaxinLogin
        public void applyLaxinInfo(Map map, LaxinDataCallback laxinDataCallback) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    void applyLaxinInfo(Map map, LaxinDataCallback laxinDataCallback) throws RemoteException;

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements LaxinLogin {
        private static final String DESCRIPTOR = "com.ali.user.open.laxin.LaxinLogin";
        static final int TRANSACTION_applyLaxinInfo = 1;

        static {
            kge.a(-20017174);
            kge.a(31129608);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static LaxinLogin asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof LaxinLogin)) {
                return (LaxinLogin) queryLocalInterface;
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
            applyLaxinInfo(parcel.readHashMap(getClass().getClassLoader()), LaxinDataCallback.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static class Proxy implements LaxinLogin {
            public static LaxinLogin sDefaultImpl;
            private IBinder mRemote;

            static {
                kge.a(1675938068);
                kge.a(31129608);
            }

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

            @Override // com.ali.user.open.laxin.LaxinLogin
            public void applyLaxinInfo(Map map, LaxinDataCallback laxinDataCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    obtain.writeStrongBinder(laxinDataCallback != null ? laxinDataCallback.asBinder() : null);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().applyLaxinInfo(map, laxinDataCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(LaxinLogin laxinLogin) {
            if (Proxy.sDefaultImpl != null || laxinLogin == null) {
                return false;
            }
            Proxy.sDefaultImpl = laxinLogin;
            return true;
        }

        public static LaxinLogin getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
