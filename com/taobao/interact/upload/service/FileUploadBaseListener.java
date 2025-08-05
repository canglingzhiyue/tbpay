package com.taobao.interact.upload.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes7.dex */
public interface FileUploadBaseListener extends IInterface {
    void onError(String str, String str2, String str3) throws RemoteException;

    void onFinish(String str, String str2) throws RemoteException;

    void onProgress(long j, long j2) throws RemoteException;

    void onStart() throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements FileUploadBaseListener {
        private static final String DESCRIPTOR = "com.taobao.interact.upload.service.FileUploadBaseListener";
        static final int TRANSACTION_onError = 4;
        static final int TRANSACTION_onFinish = 3;
        static final int TRANSACTION_onProgress = 2;
        static final int TRANSACTION_onStart = 1;

        static {
            kge.a(-1975230162);
            kge.a(1745908804);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static FileUploadBaseListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof FileUploadBaseListener)) {
                return (FileUploadBaseListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onStart();
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onProgress(parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onFinish(parcel.readString(), parcel.readString());
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
                onError(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
        }

        /* loaded from: classes7.dex */
        private static class Proxy implements FileUploadBaseListener {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f17620a;

            static {
                kge.a(-954099880);
                kge.a(1745908804);
            }

            Proxy(IBinder iBinder) {
                this.f17620a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17620a;
            }

            @Override // com.taobao.interact.upload.service.FileUploadBaseListener
            public void onStart() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f17620a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.upload.service.FileUploadBaseListener
            public void onProgress(long j, long j2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.f17620a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.upload.service.FileUploadBaseListener
            public void onFinish(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f17620a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.upload.service.FileUploadBaseListener
            public void onError(String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f17620a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
