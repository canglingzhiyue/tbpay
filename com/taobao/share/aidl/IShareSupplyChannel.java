package com.taobao.share.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.share.aidl.IShareSupplyChannelCallBack;
import tb.kge;

/* loaded from: classes8.dex */
public interface IShareSupplyChannel extends IInterface {
    void supplyChannel(IShareSupplyChannelCallBack iShareSupplyChannelCallBack) throws RemoteException;

    /* loaded from: classes8.dex */
    public static abstract class Stub extends Binder implements IShareSupplyChannel {
        private static final String DESCRIPTOR = "com.taobao.share.aidl.IShareSupplyChannel";
        static final int TRANSACTION_supplyChannel = 1;

        static {
            kge.a(-848129200);
            kge.a(439350498);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IShareSupplyChannel asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IShareSupplyChannel)) {
                return (IShareSupplyChannel) queryLocalInterface;
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
            supplyChannel(IShareSupplyChannelCallBack.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }

        /* loaded from: classes8.dex */
        private static class Proxy implements IShareSupplyChannel {
            private IBinder mRemote;

            static {
                kge.a(1844848634);
                kge.a(439350498);
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

            @Override // com.taobao.share.aidl.IShareSupplyChannel
            public void supplyChannel(IShareSupplyChannelCallBack iShareSupplyChannelCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iShareSupplyChannelCallBack != null ? iShareSupplyChannelCallBack.asBinder() : null);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
