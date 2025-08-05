package com.taobao.interact.upload.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.interact.upload.service.FileUploadBaseListener;
import com.taobao.interact.upload.service.UploadCallBack;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public interface IUploadService extends IInterface {
    void cancelAll() throws RemoteException;

    void registerCallback(UploadCallBack uploadCallBack) throws RemoteException;

    void uploadFile(String str, MtopInfo mtopInfo, FileUploadBaseListener fileUploadBaseListener) throws RemoteException;

    void uploadFiles(List<String> list, MtopInfo mtopInfo) throws RemoteException;

    void uploadNewFiles(List<String> list, MtopInfo mtopInfo, UploadCallBack uploadCallBack) throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements IUploadService {
        private static final String DESCRIPTOR = "com.taobao.interact.upload.service.IUploadService";
        static final int TRANSACTION_cancelAll = 2;
        static final int TRANSACTION_registerCallback = 3;
        static final int TRANSACTION_uploadFile = 5;
        static final int TRANSACTION_uploadFiles = 1;
        static final int TRANSACTION_uploadNewFiles = 4;

        static {
            kge.a(1368367909);
            kge.a(792957933);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IUploadService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IUploadService)) {
                return (IUploadService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            MtopInfo mtopInfo = null;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() != 0) {
                    mtopInfo = MtopInfo.CREATOR.createFromParcel(parcel);
                }
                uploadFiles(createStringArrayList, mtopInfo);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                cancelAll();
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                registerCallback(UploadCallBack.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                if (parcel.readInt() != 0) {
                    mtopInfo = MtopInfo.CREATOR.createFromParcel(parcel);
                }
                uploadNewFiles(createStringArrayList2, mtopInfo, UploadCallBack.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 5) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    mtopInfo = MtopInfo.CREATOR.createFromParcel(parcel);
                }
                uploadFile(readString, mtopInfo, FileUploadBaseListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
        }

        /* loaded from: classes7.dex */
        private static class Proxy implements IUploadService {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f17621a;

            static {
                kge.a(693847055);
                kge.a(792957933);
            }

            Proxy(IBinder iBinder) {
                this.f17621a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17621a;
            }

            @Override // com.taobao.interact.upload.service.IUploadService
            public void uploadFiles(List<String> list, MtopInfo mtopInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringList(list);
                    if (mtopInfo != null) {
                        obtain.writeInt(1);
                        mtopInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17621a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.upload.service.IUploadService
            public void cancelAll() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f17621a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.upload.service.IUploadService
            public void registerCallback(UploadCallBack uploadCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(uploadCallBack != null ? uploadCallBack.asBinder() : null);
                    this.f17621a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.upload.service.IUploadService
            public void uploadNewFiles(List<String> list, MtopInfo mtopInfo, UploadCallBack uploadCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringList(list);
                    if (mtopInfo != null) {
                        obtain.writeInt(1);
                        mtopInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(uploadCallBack != null ? uploadCallBack.asBinder() : null);
                    this.f17621a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.upload.service.IUploadService
            public void uploadFile(String str, MtopInfo mtopInfo, FileUploadBaseListener fileUploadBaseListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (mtopInfo != null) {
                        obtain.writeInt(1);
                        mtopInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(fileUploadBaseListener != null ? fileUploadBaseListener.asBinder() : null);
                    this.f17621a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
