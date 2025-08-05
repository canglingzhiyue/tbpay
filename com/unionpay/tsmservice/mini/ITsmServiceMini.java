package com.unionpay.tsmservice.mini;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.unionpay.tsmservice.mini.ITsmCallback;
import com.unionpay.tsmservice.mini.ITsmProgressCallback;

/* loaded from: classes9.dex */
public interface ITsmServiceMini extends IInterface {

    /* loaded from: classes9.dex */
    public abstract class Stub extends Binder implements ITsmServiceMini {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes9.dex */
        public final class a implements ITsmServiceMini {

            /* renamed from: a  reason: collision with root package name */
            public static ITsmServiceMini f24043a;
            private IBinder b;

            a(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.b;
            }

            @Override // com.unionpay.tsmservice.mini.ITsmServiceMini
            public final int commonInterface(String str, String str2, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.unionpay.tsmservice.mini.ITsmServiceMini");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(iTsmCallback != null ? iTsmCallback.asBinder() : null);
                    if (iTsmProgressCallback != null) {
                        iBinder = iTsmProgressCallback.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.b.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().commonInterface(str, str2, iTsmCallback, iTsmProgressCallback);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.unionpay.tsmservice.mini.ITsmServiceMini");
        }

        public static ITsmServiceMini asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.unionpay.tsmservice.mini.ITsmServiceMini");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITsmServiceMini)) ? new a(iBinder) : (ITsmServiceMini) queryLocalInterface;
        }

        public static ITsmServiceMini getDefaultImpl() {
            return a.f24043a;
        }

        public static boolean setDefaultImpl(ITsmServiceMini iTsmServiceMini) {
            if (a.f24043a == null) {
                if (iTsmServiceMini == null) {
                    return false;
                }
                a.f24043a = iTsmServiceMini;
                return true;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.unionpay.tsmservice.mini.ITsmServiceMini");
                return true;
            }
            parcel.enforceInterface("com.unionpay.tsmservice.mini.ITsmServiceMini");
            int commonInterface = commonInterface(parcel.readString(), parcel.readString(), ITsmCallback.Stub.asInterface(parcel.readStrongBinder()), ITsmProgressCallback.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            parcel2.writeInt(commonInterface);
            return true;
        }
    }

    int commonInterface(String str, String str2, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback);
}
