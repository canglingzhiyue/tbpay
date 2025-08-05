package com.heytap.msp.keychain;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import tb.kge;

/* loaded from: classes4.dex */
public interface a extends IInterface {

    /* renamed from: com.heytap.msp.keychain.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractBinderC0260a extends Binder implements a {
        static {
            kge.a(536700656);
            kge.a(407261939);
        }

        public AbstractBinderC0260a() {
            attachInterface(this, "com.heytap.msp.keychain.ICallback");
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
                parcel2.writeString("com.heytap.msp.keychain.ICallback");
                return true;
            }
            parcel.enforceInterface("com.heytap.msp.keychain.ICallback");
            ((com.heytap.mspsdk.keychain.impl.a) this).a(parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }
}
