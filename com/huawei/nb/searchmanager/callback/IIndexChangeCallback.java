package com.huawei.nb.searchmanager.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SharedMemory;
import com.huawei.nb.searchmanager.client.model.ChangedIndexContent;

/* loaded from: classes4.dex */
public interface IIndexChangeCallback extends IInterface {

    /* loaded from: classes4.dex */
    public static class Default implements IIndexChangeCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.nb.searchmanager.callback.IIndexChangeCallback
        public void onDataChanged(String str, ChangedIndexContent changedIndexContent) throws RemoteException {
        }

        @Override // com.huawei.nb.searchmanager.callback.IIndexChangeCallback
        public void onDataChangedLarge(String str, SharedMemory sharedMemory, int i) throws RemoteException {
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class Stub extends Binder implements IIndexChangeCallback {
        private static final String DESCRIPTOR = "com.huawei.nb.searchmanager.callback.IIndexChangeCallback";
        static final int TRANSACTION_onDataChanged = 1;
        static final int TRANSACTION_onDataChangedLarge = 2;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public static class Proxy implements IIndexChangeCallback {

            /* renamed from: a  reason: collision with root package name */
            public static IIndexChangeCallback f7597a;
            private IBinder b;

            Proxy(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.b;
            }

            @Override // com.huawei.nb.searchmanager.callback.IIndexChangeCallback
            public void onDataChanged(String str, ChangedIndexContent changedIndexContent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (changedIndexContent != null) {
                        obtain.writeInt(1);
                        changedIndexContent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.b.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onDataChanged(str, changedIndexContent);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nb.searchmanager.callback.IIndexChangeCallback
            public void onDataChangedLarge(String str, SharedMemory sharedMemory, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (sharedMemory != null) {
                        obtain.writeInt(1);
                        sharedMemory.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    if (this.b.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onDataChangedLarge(str, sharedMemory, i);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IIndexChangeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IIndexChangeCallback)) ? new Proxy(iBinder) : (IIndexChangeCallback) queryLocalInterface;
        }

        public static IIndexChangeCallback getDefaultImpl() {
            return Proxy.f7597a;
        }

        public static boolean setDefaultImpl(IIndexChangeCallback iIndexChangeCallback) {
            if (Proxy.f7597a == null) {
                if (iIndexChangeCallback == null) {
                    return false;
                }
                Proxy.f7597a = iIndexChangeCallback;
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
            ChangedIndexContent changedIndexContent = null;
            SharedMemory sharedMemory = null;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    changedIndexContent = ChangedIndexContent.CREATOR.createFromParcel(parcel);
                }
                onDataChanged(readString, changedIndexContent);
                return true;
            } else if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    sharedMemory = (SharedMemory) SharedMemory.CREATOR.createFromParcel(parcel);
                }
                onDataChangedLarge(readString2, sharedMemory, parcel.readInt());
                return true;
            }
        }
    }

    void onDataChanged(String str, ChangedIndexContent changedIndexContent) throws RemoteException;

    void onDataChangedLarge(String str, SharedMemory sharedMemory, int i) throws RemoteException;
}
