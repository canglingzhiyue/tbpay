package com.heytap.msp;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import tb.kge;

/* loaded from: classes4.dex */
public interface a extends IInterface {

    /* renamed from: com.heytap.msp.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractBinderC0258a extends Binder implements a {

        /* renamed from: com.heytap.msp.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0259a implements a {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f7246a;

            static {
                kge.a(1531188508);
                kge.a(-2103638046);
            }

            public C0259a(IBinder iBinder) {
                this.f7246a = iBinder;
            }

            @Override // com.heytap.msp.a
            public void a(String str, Bundle bundle, b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.msp.IMspCoreBinder");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f7246a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7246a;
            }
        }

        static {
            kge.a(1333435423);
            kge.a(-2103638046);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.msp.IMspCoreBinder");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0259a(iBinder) : (a) queryLocalInterface;
        }
    }

    void a(String str, Bundle bundle, b bVar);
}
