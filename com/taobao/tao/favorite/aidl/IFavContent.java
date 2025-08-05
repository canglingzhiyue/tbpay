package com.taobao.tao.favorite.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.tao.favorite.aidl.IFavContentCallBack;
import tb.kge;

/* loaded from: classes8.dex */
public interface IFavContent extends IInterface {
    void addFavContent(Bundle bundle, IFavContentCallBack iFavContentCallBack) throws RemoteException;

    void deleteFavContent(Bundle bundle, IFavContentCallBack iFavContentCallBack) throws RemoteException;

    void isFavContent(Bundle bundle, IFavContentCallBack iFavContentCallBack) throws RemoteException;

    void newAddFavoriteContent(int i, long j, String str, String str2, String str3, String str4, boolean z, IFavContentCallBack iFavContentCallBack) throws RemoteException;

    void newDeleteFavoriteContent(int i, long j, String str, boolean z, IFavContentCallBack iFavContentCallBack) throws RemoteException;

    void newIsFavoriteContent(int i, long j, String str, boolean z, IFavContentCallBack iFavContentCallBack) throws RemoteException;

    /* loaded from: classes8.dex */
    public static abstract class Stub extends Binder implements IFavContent {
        private static final String DESCRIPTOR = "com.taobao.tao.fav.aidl.IFavContent";
        static final int TRANSACTION_addFavContent = 1;
        static final int TRANSACTION_deleteFavContent = 3;
        static final int TRANSACTION_isFavContent = 2;
        static final int TRANSACTION_newAddFavoriteContent = 4;
        static final int TRANSACTION_newDeleteFavoriteContent = 5;
        static final int TRANSACTION_newIsFavoriteContent = 6;

        static {
            kge.a(-463563753);
            kge.a(-2024123461);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IFavContent asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IFavContent)) {
                return (IFavContent) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            Bundle bundle = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    addFavContent(bundle, IFavContentCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    isFavContent(bundle, IFavContentCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    deleteFavContent(bundle, IFavContentCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    newAddFavoriteContent(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, IFavContentCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    newDeleteFavoriteContent(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0, IFavContentCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    newIsFavoriteContent(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0, IFavContentCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* loaded from: classes8.dex */
        private static class Proxy implements IFavContent {
            private IBinder mRemote;

            static {
                kge.a(-1025886335);
                kge.a(-2024123461);
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

            @Override // com.taobao.tao.favorite.aidl.IFavContent
            public void addFavContent(Bundle bundle, IFavContentCallBack iFavContentCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iFavContentCallBack != null ? iFavContentCallBack.asBinder() : null);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.tao.favorite.aidl.IFavContent
            public void isFavContent(Bundle bundle, IFavContentCallBack iFavContentCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iFavContentCallBack != null ? iFavContentCallBack.asBinder() : null);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.tao.favorite.aidl.IFavContent
            public void deleteFavContent(Bundle bundle, IFavContentCallBack iFavContentCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iFavContentCallBack != null ? iFavContentCallBack.asBinder() : null);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.tao.favorite.aidl.IFavContent
            public void newAddFavoriteContent(int i, long j, String str, String str2, String str3, String str4, boolean z, IFavContentCallBack iFavContentCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeStrongBinder(iFavContentCallBack != null ? iFavContentCallBack.asBinder() : null);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.tao.favorite.aidl.IFavContent
            public void newDeleteFavoriteContent(int i, long j, String str, boolean z, IFavContentCallBack iFavContentCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeStrongBinder(iFavContentCallBack != null ? iFavContentCallBack.asBinder() : null);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.tao.favorite.aidl.IFavContent
            public void newIsFavoriteContent(int i, long j, String str, boolean z, IFavContentCallBack iFavContentCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeStrongBinder(iFavContentCallBack != null ? iFavContentCallBack.asBinder() : null);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
