package com.taobao.interact.mediaplayer.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes7.dex */
public interface OnCompletionListener extends IInterface {
    void onCompletion(String str) throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements OnCompletionListener {
        private static final String DESCRIPTOR = "com.taobao.interact.mediaplayer.service.OnCompletionListener";
        static final int TRANSACTION_onCompletion = 1;

        static {
            kge.a(-1262059911);
            kge.a(-1331825639);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static OnCompletionListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof OnCompletionListener)) {
                return (OnCompletionListener) queryLocalInterface;
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
            onCompletion(parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        /* loaded from: classes7.dex */
        private static class Proxy implements OnCompletionListener {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f17597a;

            static {
                kge.a(474828899);
                kge.a(-1331825639);
            }

            Proxy(IBinder iBinder) {
                this.f17597a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17597a;
            }

            @Override // com.taobao.interact.mediaplayer.service.OnCompletionListener
            public void onCompletion(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f17597a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
