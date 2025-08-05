package com.taobao.android.tschedule.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes6.dex */
public interface ITScheduleStatus extends IInterface {
    void addConfigUrl(String str, String str2) throws RemoteException;

    void addRenderUrl(String str, String str2) throws RemoteException;

    void finishChange(String str) throws RemoteException;

    String getChangeFlags() throws RemoteException;

    String getPageKeys() throws RemoteException;

    String getPageUrl(String str) throws RemoteException;

    String getRenderUrl(String str) throws RemoteException;

    String getRenderUrls() throws RemoteException;

    boolean isConfigrUrl(String str) throws RemoteException;

    boolean isRenderUrl(String str) throws RemoteException;

    void removeRenderUrlByKey(String str) throws RemoteException;

    String removeRenderUrlByValue(String str) throws RemoteException;

    void reset() throws RemoteException;

    void updatePageUrl(String str, String str2) throws RemoteException;

    /* loaded from: classes6.dex */
    public static abstract class Stub extends Binder implements ITScheduleStatus {
        private static final String DESCRIPTOR = "com.taobao.android.tschedule.aidl.ITScheduleStatus";
        static final int TRANSACTION_addConfigUrl = 13;
        static final int TRANSACTION_addRenderUrl = 7;
        static final int TRANSACTION_finishChange = 6;
        static final int TRANSACTION_getChangeFlags = 5;
        static final int TRANSACTION_getPageKeys = 3;
        static final int TRANSACTION_getPageUrl = 2;
        static final int TRANSACTION_getRenderUrl = 10;
        static final int TRANSACTION_getRenderUrls = 12;
        static final int TRANSACTION_isConfigrUrl = 14;
        static final int TRANSACTION_isRenderUrl = 11;
        static final int TRANSACTION_removeRenderUrlByKey = 8;
        static final int TRANSACTION_removeRenderUrlByValue = 9;
        static final int TRANSACTION_reset = 1;
        static final int TRANSACTION_updatePageUrl = 4;

        static {
            kge.a(1543008438);
            kge.a(1868746684);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITScheduleStatus asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ITScheduleStatus)) {
                return (ITScheduleStatus) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    reset();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    String pageUrl = getPageUrl(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(pageUrl);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    String pageKeys = getPageKeys();
                    parcel2.writeNoException();
                    parcel2.writeString(pageKeys);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    updatePageUrl(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    String changeFlags = getChangeFlags();
                    parcel2.writeNoException();
                    parcel2.writeString(changeFlags);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    finishChange(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    addRenderUrl(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    removeRenderUrlByKey(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    String removeRenderUrlByValue = removeRenderUrlByValue(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(removeRenderUrlByValue);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    String renderUrl = getRenderUrl(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(renderUrl);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isRenderUrl = isRenderUrl(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(isRenderUrl ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    String renderUrls = getRenderUrls();
                    parcel2.writeNoException();
                    parcel2.writeString(renderUrls);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    addConfigUrl(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isConfigrUrl = isConfigrUrl(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(isConfigrUrl ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* loaded from: classes6.dex */
        private static class Proxy implements ITScheduleStatus {
            private IBinder mRemote;

            static {
                kge.a(429777120);
                kge.a(1868746684);
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

            @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
            public void reset() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
            public String getPageUrl(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
            public String getPageKeys() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
            public void updatePageUrl(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
            public String getChangeFlags() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
            public void finishChange(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
            public void addRenderUrl(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
            public void removeRenderUrlByKey(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
            public String removeRenderUrlByValue(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
            public String getRenderUrl(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
            public boolean isRenderUrl(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(11, obtain, obtain2, 0);
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

            @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
            public String getRenderUrls() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
            public void addConfigUrl(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
            public boolean isConfigrUrl(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(14, obtain, obtain2, 0);
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
