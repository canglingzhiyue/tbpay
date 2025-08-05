package org.ifaa.aidl.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes9.dex */
public interface IfaaManagerService extends IInterface {
    public static final String KEY_FINGERPRINT_FULLVIEW = "org.ifaa.ext.key.CUSTOM_VIEW";
    public static final String KEY_GET_SENSOR_LOCATION = "org.ifaa.ext.key.GET_SENSOR_LOCATION";
    public static final int TYPE_FACE = 4;
    public static final int TYPE_FINGERPRINT = 1;

    /* loaded from: classes9.dex */
    public static abstract class Stub extends Binder implements IfaaManagerService {
        private static final String DESCRIPTOR = "org.ifaa.aidl.manager.IfaaManagerService";
        static final int TRANSACTION_getDeviceModel = 3;
        static final int TRANSACTION_getEnabled = 8;
        static final int TRANSACTION_getExtInfo = 6;
        static final int TRANSACTION_getIDList = 9;
        static final int TRANSACTION_getSupportBIOTypes = 1;
        static final int TRANSACTION_getVersion = 5;
        static final int TRANSACTION_processCmd = 4;
        static final int TRANSACTION_setExtInfo = 7;
        static final int TRANSACTION_startBIOManager = 2;

        /* loaded from: classes9.dex */
        private static class Proxy implements IfaaManagerService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // org.ifaa.aidl.manager.IfaaManagerService
            public String getDeviceModel() throws RemoteException {
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

            @Override // org.ifaa.aidl.manager.IfaaManagerService
            public int getEnabled(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.ifaa.aidl.manager.IfaaManagerService
            public String getExtInfo(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.ifaa.aidl.manager.IfaaManagerService
            public int[] getIDList(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createIntArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // org.ifaa.aidl.manager.IfaaManagerService
            public int getSupportBIOTypes() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.ifaa.aidl.manager.IfaaManagerService
            public int getVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.ifaa.aidl.manager.IfaaManagerService
            public byte[] processCmd(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    byte[] createByteArray = obtain2.createByteArray();
                    obtain2.readByteArray(bArr);
                    return createByteArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.ifaa.aidl.manager.IfaaManagerService
            public void setExtInfo(int i, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.ifaa.aidl.manager.IfaaManagerService
            public int startBIOManager(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IfaaManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IfaaManagerService)) ? new Proxy(iBinder) : (IfaaManagerService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
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
                    int supportBIOTypes = getSupportBIOTypes();
                    parcel2.writeNoException();
                    parcel2.writeInt(supportBIOTypes);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int startBIOManager = startBIOManager(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(startBIOManager);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    String deviceModel = getDeviceModel();
                    parcel2.writeNoException();
                    parcel2.writeString(deviceModel);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray = parcel.createByteArray();
                    byte[] processCmd = processCmd(createByteArray);
                    parcel2.writeNoException();
                    parcel2.writeByteArray(processCmd);
                    parcel2.writeByteArray(createByteArray);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int version = getVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(version);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    String extInfo = getExtInfo(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(extInfo);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    setExtInfo(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    int enabled = getEnabled(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(enabled);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    int[] iDList = getIDList(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeIntArray(iDList);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    String getDeviceModel() throws RemoteException;

    int getEnabled(int i) throws RemoteException;

    String getExtInfo(int i, String str) throws RemoteException;

    int[] getIDList(int i) throws RemoteException;

    int getSupportBIOTypes() throws RemoteException;

    int getVersion() throws RemoteException;

    byte[] processCmd(byte[] bArr) throws RemoteException;

    void setExtInfo(int i, String str, String str2) throws RemoteException;

    int startBIOManager(int i) throws RemoteException;
}
