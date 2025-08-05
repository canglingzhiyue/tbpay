package com.heytap.msp;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import tb.cwn;
import tb.kge;

/* loaded from: classes4.dex */
public interface b extends IInterface {

    /* loaded from: classes4.dex */
    public static abstract class a extends Binder implements b {
        static {
            kge.a(1333436384);
            kge.a(-2103638045);
        }

        public a() {
            attachInterface(this, "com.heytap.msp.IResult");
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
                parcel2.writeString("com.heytap.msp.IResult");
                return true;
            }
            parcel.enforceInterface("com.heytap.msp.IResult");
            parcel.readInt();
            Collection<CountDownLatch> values = com.heytap.mspsdk.proxy.b.this.f7250a.values();
            cwn.b("ApiProxy", "onResult latches size " + values.size());
            if (!values.isEmpty() && values.size() > 0) {
                for (CountDownLatch countDownLatch : values) {
                    countDownLatch.countDown();
                    cwn.b("ApiProxy", "onResult latches countDown()");
                }
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
