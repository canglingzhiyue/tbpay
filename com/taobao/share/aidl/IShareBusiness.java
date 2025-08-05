package com.taobao.share.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public interface IShareBusiness extends IInterface {
    boolean share(List<String> list, String str) throws RemoteException;

    /* loaded from: classes8.dex */
    public static abstract class Stub extends Binder implements IShareBusiness {
        private static final String DESCRIPTOR = "com.taobao.share.aidl.IShareBusiness";
        static final int TRANSACTION_share = 1;

        static {
            kge.a(1503823616);
            kge.a(677540658);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IShareBusiness asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IShareBusiness)) {
                return (IShareBusiness) queryLocalInterface;
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
            boolean share = share(parcel.createStringArrayList(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(share ? 1 : 0);
            return true;
        }

        /* loaded from: classes8.dex */
        private static class Proxy implements IShareBusiness {
            private IBinder mRemote;

            static {
                kge.a(-1016293462);
                kge.a(677540658);
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

            @Override // com.taobao.share.aidl.IShareBusiness
            public boolean share(List<String> list, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringList(list);
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(1, obtain, obtain2, 0);
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
