package com.taobao.interact.publish.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.interact.publish.service.IServiceCallBack;
import tb.kge;

/* loaded from: classes7.dex */
public interface IPublishService extends IInterface {
    void callCamera() throws RemoteException;

    void callGallery() throws RemoteException;

    void editImage(String str, PublishConfig publishConfig) throws RemoteException;

    void initConfig(PublishConfig publishConfig) throws RemoteException;

    void registerCallback(IServiceCallBack iServiceCallBack) throws RemoteException;

    void showChoiceDialog() throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements IPublishService {
        private static final String DESCRIPTOR = "com.taobao.interact.publish.service.IPublishService";
        static final int TRANSACTION_callCamera = 2;
        static final int TRANSACTION_callGallery = 3;
        static final int TRANSACTION_editImage = 6;
        static final int TRANSACTION_initConfig = 5;
        static final int TRANSACTION_registerCallback = 4;
        static final int TRANSACTION_showChoiceDialog = 1;

        static {
            kge.a(1347541507);
            kge.a(517343823);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IPublishService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IPublishService)) {
                return (IPublishService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            PublishConfig publishConfig = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    showChoiceDialog();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    callCamera();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    callGallery();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    registerCallback(IServiceCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        publishConfig = PublishConfig.CREATOR.createFromParcel(parcel);
                    }
                    initConfig(publishConfig);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        publishConfig = PublishConfig.CREATOR.createFromParcel(parcel);
                    }
                    editImage(readString, publishConfig);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes7.dex */
        public static class Proxy implements IPublishService {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f17607a;

            static {
                kge.a(-20685715);
                kge.a(517343823);
            }

            Proxy(IBinder iBinder) {
                this.f17607a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17607a;
            }

            @Override // com.taobao.interact.publish.service.IPublishService
            public void showChoiceDialog() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f17607a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.publish.service.IPublishService
            public void callCamera() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f17607a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.publish.service.IPublishService
            public void callGallery() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f17607a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.publish.service.IPublishService
            public void registerCallback(IServiceCallBack iServiceCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iServiceCallBack != null ? iServiceCallBack.asBinder() : null);
                    this.f17607a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.publish.service.IPublishService
            public void initConfig(PublishConfig publishConfig) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (publishConfig != null) {
                        obtain.writeInt(1);
                        publishConfig.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17607a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.publish.service.IPublishService
            public void editImage(String str, PublishConfig publishConfig) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (publishConfig != null) {
                        obtain.writeInt(1);
                        publishConfig.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17607a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
