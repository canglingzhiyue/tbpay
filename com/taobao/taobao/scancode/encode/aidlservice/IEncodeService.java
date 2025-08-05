package com.taobao.taobao.scancode.encode.aidlservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.taobao.scancode.encode.aidlservice.DecodeCallback;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback;
import tb.kge;

/* loaded from: classes8.dex */
public interface IEncodeService extends IInterface {
    void decodeBitmap(byte[] bArr, int i, DecodeCallback decodeCallback) throws RemoteException;

    String decodeLocalPath(String str) throws RemoteException;

    String decodeLocalPathWithType(String str, int i) throws RemoteException;

    void encode(String str, String str2, int i, MaSizeType maSizeType, boolean z, EncodeCallback encodeCallback) throws RemoteException;

    void encodeMa2(int i, byte[] bArr, int i2, int i3, String str, int i4, int i5, int i6, char c, int i7, EncodeCallback encodeCallback) throws RemoteException;

    void encodeMa3(int i, byte[] bArr, int i2, int i3, String str, int i4, int i5, int i6, char c, int i7, EncodeCallback encodeCallback, int i8) throws RemoteException;

    /* loaded from: classes8.dex */
    public static abstract class Stub extends Binder implements IEncodeService {
        private static final String DESCRIPTOR = "com.taobao.taobao.scancode.encode.aidlservice.IEncodeService";
        static final int TRANSACTION_decodeBitmap = 6;
        static final int TRANSACTION_decodeLocalPath = 4;
        static final int TRANSACTION_decodeLocalPathWithType = 5;
        static final int TRANSACTION_encode = 1;
        static final int TRANSACTION_encodeMa2 = 2;
        static final int TRANSACTION_encodeMa3 = 3;

        static {
            kge.a(1235671696);
            kge.a(633087394);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IEncodeService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IEncodeService)) {
                return (IEncodeService) queryLocalInterface;
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
                    encode(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? MaSizeType.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, EncodeCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    encodeMa2(parcel.readInt(), parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (char) parcel.readInt(), parcel.readInt(), EncodeCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    encodeMa3(parcel.readInt(), parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (char) parcel.readInt(), parcel.readInt(), EncodeCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    String decodeLocalPath = decodeLocalPath(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(decodeLocalPath);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    String decodeLocalPathWithType = decodeLocalPathWithType(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(decodeLocalPathWithType);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    decodeBitmap(parcel.createByteArray(), parcel.readInt(), DecodeCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* loaded from: classes8.dex */
        private static class Proxy implements IEncodeService {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f21237a;

            static {
                kge.a(120061754);
                kge.a(633087394);
            }

            Proxy(IBinder iBinder) {
                this.f21237a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21237a;
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
            public void encode(String str, String str2, int i, MaSizeType maSizeType, boolean z, EncodeCallback encodeCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    if (maSizeType != null) {
                        obtain.writeInt(1);
                        maSizeType.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeStrongBinder(encodeCallback != null ? encodeCallback.asBinder() : null);
                    this.f21237a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
            public void encodeMa2(int i, byte[] bArr, int i2, int i3, String str, int i4, int i5, int i6, char c, int i7, EncodeCallback encodeCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeInt(c);
                    obtain.writeInt(i7);
                    obtain.writeStrongBinder(encodeCallback != null ? encodeCallback.asBinder() : null);
                    this.f21237a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
            public void encodeMa3(int i, byte[] bArr, int i2, int i3, String str, int i4, int i5, int i6, char c, int i7, EncodeCallback encodeCallback, int i8) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeInt(c);
                    obtain.writeInt(i7);
                    obtain.writeStrongBinder(encodeCallback != null ? encodeCallback.asBinder() : null);
                    obtain.writeInt(i8);
                    this.f21237a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
            public String decodeLocalPath(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f21237a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
            public String decodeLocalPathWithType(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f21237a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
            public void decodeBitmap(byte[] bArr, int i, DecodeCallback decodeCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(decodeCallback != null ? decodeCallback.asBinder() : null);
                    this.f21237a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
