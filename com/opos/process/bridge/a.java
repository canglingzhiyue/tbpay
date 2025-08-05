package com.opos.process.bridge;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import tb.kge;

/* loaded from: classes4.dex */
public interface a extends IInterface {

    /* renamed from: com.opos.process.bridge.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractBinderC0304a extends Binder implements a {

        /* renamed from: com.opos.process.bridge.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0305a implements a {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f8108a;

            static {
                kge.a(-244971279);
                kge.a(-1877725641);
            }

            public C0305a(IBinder iBinder) {
                this.f8108a = iBinder;
            }

            @Override // com.opos.process.bridge.a
            public Bundle a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.opos.process.bridge.IBridgeInterface");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f8108a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8108a;
            }
        }

        static {
            kge.a(-608075468);
            kge.a(-1877725641);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.opos.process.bridge.IBridgeInterface");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0305a(iBinder) : (a) queryLocalInterface;
        }
    }

    Bundle a(Bundle bundle);
}
