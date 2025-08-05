package com.taobao.interact.publish.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public interface IServiceCallBack extends IInterface {
    void onResult(List<Image> list) throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements IServiceCallBack {
        private static final String DESCRIPTOR = "com.taobao.interact.publish.service.IServiceCallBack";
        static final int TRANSACTION_onResult = 1;

        static {
            kge.a(1508837857);
            kge.a(-2099910735);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IServiceCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IServiceCallBack)) {
                return (IServiceCallBack) queryLocalInterface;
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
            onResult(parcel.createTypedArrayList(Image.CREATOR));
            parcel2.writeNoException();
            return true;
        }

        /* loaded from: classes7.dex */
        private static class Proxy implements IServiceCallBack {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f17608a;

            static {
                kge.a(-1020678709);
                kge.a(-2099910735);
            }

            Proxy(IBinder iBinder) {
                this.f17608a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17608a;
            }

            @Override // com.taobao.interact.publish.service.IServiceCallBack
            public void onResult(List<Image> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedList(list);
                    this.f17608a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
