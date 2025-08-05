package com.taobao.calendar.aidl.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.calendar.aidl.listener.CalendarListener;
import com.taobao.calendar.aidl.model.ScheduleDTO;

/* loaded from: classes6.dex */
public interface ICalendarService extends IInterface {

    /* loaded from: classes6.dex */
    public static abstract class Stub extends Binder implements ICalendarService {
        private static final String DESCRIPTOR = "com.taobao.calendar.aidl.service.ICalendarService";
        static final int TRANSACTION_cancelReminder = 3;
        static final int TRANSACTION_cancelReminderNew = 8;
        static final int TRANSACTION_checkReminderExist = 4;
        static final int TRANSACTION_getReminds = 5;
        static final int TRANSACTION_getRemindsNew = 6;
        static final int TRANSACTION_queryAllReminds = 9;
        static final int TRANSACTION_queryAllRemindsCount = 10;
        static final int TRANSACTION_registerListener = 1;
        static final int TRANSACTION_setReminder = 2;
        static final int TRANSACTION_setReminderNew = 7;

        /* loaded from: classes6.dex */
        private static class Proxy implements ICalendarService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.taobao.calendar.aidl.service.ICalendarService
            public void cancelReminder(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.calendar.aidl.service.ICalendarService
            public void cancelReminderNew(int i, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.calendar.aidl.service.ICalendarService
            public void checkReminderExist(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.taobao.calendar.aidl.service.ICalendarService
            public void getReminds(int i, String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.calendar.aidl.service.ICalendarService
            public void getRemindsNew(int i, String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.calendar.aidl.service.ICalendarService
            public void queryAllReminds(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.calendar.aidl.service.ICalendarService
            public void queryAllRemindsCount(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.calendar.aidl.service.ICalendarService
            public void registerListener(CalendarListener calendarListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(calendarListener != null ? calendarListener.asBinder() : null);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.calendar.aidl.service.ICalendarService
            public void setReminder(ScheduleDTO scheduleDTO) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (scheduleDTO != null) {
                        obtain.writeInt(1);
                        scheduleDTO.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.calendar.aidl.service.ICalendarService
            public void setReminderNew(ScheduleDTO scheduleDTO, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (scheduleDTO != null) {
                        obtain.writeInt(1);
                        scheduleDTO.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
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
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            ScheduleDTO scheduleDTO = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    registerListener(CalendarListener.Stub.asInterface(parcel.readStrongBinder()));
                    break;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        scheduleDTO = ScheduleDTO.CREATOR.createFromParcel(parcel);
                    }
                    setReminder(scheduleDTO);
                    break;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    cancelReminder(parcel.readInt(), parcel.readString());
                    break;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    checkReminderExist(parcel.readInt(), parcel.readString());
                    break;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    getReminds(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                    break;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    getRemindsNew(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                    break;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        scheduleDTO = ScheduleDTO.CREATOR.createFromParcel(parcel);
                    }
                    setReminderNew(scheduleDTO, parcel.readString());
                    break;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    cancelReminderNew(parcel.readInt(), parcel.readString(), parcel.readString());
                    break;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    queryAllReminds(parcel.readString());
                    break;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    queryAllRemindsCount(parcel.readString());
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void cancelReminder(int i, String str) throws RemoteException;

    void cancelReminderNew(int i, String str, String str2) throws RemoteException;

    void checkReminderExist(int i, String str) throws RemoteException;

    void getReminds(int i, String str, String str2, String str3) throws RemoteException;

    void getRemindsNew(int i, String str, String str2, String str3) throws RemoteException;

    void queryAllReminds(String str) throws RemoteException;

    void queryAllRemindsCount(String str) throws RemoteException;

    void registerListener(CalendarListener calendarListener) throws RemoteException;

    void setReminder(ScheduleDTO scheduleDTO) throws RemoteException;

    void setReminderNew(ScheduleDTO scheduleDTO, String str) throws RemoteException;
}
