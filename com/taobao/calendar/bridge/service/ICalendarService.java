package com.taobao.calendar.bridge.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.calendar.bridge.listener.CalendarListener;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import tb.kge;

/* loaded from: classes6.dex */
public interface ICalendarService extends IInterface {

    /* loaded from: classes6.dex */
    public static abstract class Stub extends Binder implements ICalendarService {
        private static final String DESCRIPTOR = "com.taobao.calendar.bridge.service.ICalendarService";
        static final int TRANSACTION_addCalendar = 2;
        static final int TRANSACTION_cancelCalendar = 3;
        static final int TRANSACTION_checkReminderExist = 4;
        static final int TRANSACTION_registerListener = 1;

        /* loaded from: classes6.dex */
        private static class Proxy implements ICalendarService {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f16859a;

            static {
                kge.a(652219852);
                kge.a(-1678739888);
            }

            Proxy(IBinder iBinder) {
                this.f16859a = iBinder;
            }

            @Override // com.taobao.calendar.bridge.service.ICalendarService
            public void addCalendar(ScheduleDTOModule scheduleDTOModule) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (scheduleDTOModule != null) {
                        obtain.writeInt(1);
                        scheduleDTOModule.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16859a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16859a;
            }

            @Override // com.taobao.calendar.bridge.service.ICalendarService
            public void cancelCalendar(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f16859a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.calendar.bridge.service.ICalendarService
            public void checkReminderExist(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f16859a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.calendar.bridge.service.ICalendarService
            public void registerListener(CalendarListener calendarListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(calendarListener != null ? calendarListener.asBinder() : null);
                    this.f16859a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        static {
            kge.a(1083164322);
            kge.a(-1678739888);
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ICalendarService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICalendarService)) ? new Proxy(iBinder) : (ICalendarService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                registerListener(CalendarListener.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                addCalendar(parcel.readInt() != 0 ? ScheduleDTOModule.CREATOR.createFromParcel(parcel) : null);
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                cancelCalendar(parcel.readString(), parcel.readString());
            } else if (i != 4) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                checkReminderExist(parcel.readString());
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addCalendar(ScheduleDTOModule scheduleDTOModule) throws RemoteException;

    void cancelCalendar(String str, String str2) throws RemoteException;

    void checkReminderExist(String str) throws RemoteException;

    void registerListener(CalendarListener calendarListener) throws RemoteException;
}
