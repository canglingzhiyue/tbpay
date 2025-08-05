package com.huawei.searchservice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SharedMemory;
import com.huawei.nb.searchmanager.callback.IIndexChangeCallback;
import com.huawei.nb.searchmanager.client.ISearchSession;
import com.huawei.nb.searchmanager.client.model.IndexData;
import com.huawei.nb.searchmanager.client.model.IndexForm;
import com.huawei.nb.searchmanager.client.model.SearchableEntity;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface IHOSPSearchServiceCall extends IInterface {

    /* loaded from: classes4.dex */
    public static class Default implements IHOSPSearchServiceCall {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public ISearchSession beginSearch(String str, String str2, String str3) throws RemoteException {
            return null;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public int clearIndex(String str, String str2, Map map, String str3) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public int clearIndexForm(String str, String str2) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public List<IndexData> delete(String str, String str2, List<IndexData> list, String str3) throws RemoteException {
            return null;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public int deleteByQuery(String str, String str2, String str3, String str4) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public List<String> deleteByTerm(String str, String str2, String str3, List<String> list, String str4) throws RemoteException {
            return null;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public int deleteLarge(String str, String str2, SharedMemory sharedMemory, SharedMemory sharedMemory2, String str3) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public void endSearch(String str, String str2, ISearchSession iSearchSession, String str3) throws RemoteException {
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public List<IndexForm> getIndexForm(String str, String str2) throws RemoteException {
            return null;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public int getIndexFormVersion(String str, String str2) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public SearchableEntity getSearchableEntity(String str, String str2) throws RemoteException {
            return null;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public List<SearchableEntity> getSearchableEntityList(String str) throws RemoteException {
            return null;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public List<IndexData> insert(String str, String str2, List<IndexData> list, String str3) throws RemoteException {
            return null;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public int insertLarge(String str, String str2, SharedMemory sharedMemory, SharedMemory sharedMemory2, String str3) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public void registerClientDeathBinder(IBinder iBinder, String str) throws RemoteException {
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public void registerIndexChangeListener(String str, String str2, IIndexChangeCallback iIndexChangeCallback, String str3) throws RemoteException {
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public int setIndexForm(String str, int i, List<IndexForm> list, String str2) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public int setIndexFormSchema(String str, int i, List<IndexForm> list, int i2, String str2) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public int setSearchableEntity(SearchableEntity searchableEntity, String str) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public void unRegisterClientDeathBinder(IBinder iBinder, String str) throws RemoteException {
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public void unRegisterIndexChangeListener(String str, String str2, IIndexChangeCallback iIndexChangeCallback, String str3) throws RemoteException {
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public List<IndexData> update(String str, String str2, List<IndexData> list, String str3) throws RemoteException {
            return null;
        }

        @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
        public int updateLarge(String str, String str2, SharedMemory sharedMemory, SharedMemory sharedMemory2, String str3) throws RemoteException {
            return 0;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class Stub extends Binder implements IHOSPSearchServiceCall {
        private static final String DESCRIPTOR = "com.huawei.searchservice.service.IHOSPSearchServiceCall";
        static final int TRANSACTION_beginSearch = 11;
        static final int TRANSACTION_clearIndex = 10;
        static final int TRANSACTION_clearIndexForm = 4;
        static final int TRANSACTION_delete = 7;
        static final int TRANSACTION_deleteByQuery = 9;
        static final int TRANSACTION_deleteByTerm = 8;
        static final int TRANSACTION_deleteLarge = 22;
        static final int TRANSACTION_endSearch = 12;
        static final int TRANSACTION_getIndexForm = 2;
        static final int TRANSACTION_getIndexFormVersion = 3;
        static final int TRANSACTION_getSearchableEntity = 18;
        static final int TRANSACTION_getSearchableEntityList = 19;
        static final int TRANSACTION_insert = 5;
        static final int TRANSACTION_insertLarge = 20;
        static final int TRANSACTION_registerClientDeathBinder = 15;
        static final int TRANSACTION_registerIndexChangeListener = 13;
        static final int TRANSACTION_setIndexForm = 1;
        static final int TRANSACTION_setIndexFormSchema = 23;
        static final int TRANSACTION_setSearchableEntity = 17;
        static final int TRANSACTION_unRegisterClientDeathBinder = 16;
        static final int TRANSACTION_unRegisterIndexChangeListener = 14;
        static final int TRANSACTION_update = 6;
        static final int TRANSACTION_updateLarge = 21;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public static class Proxy implements IHOSPSearchServiceCall {

            /* renamed from: a  reason: collision with root package name */
            public static IHOSPSearchServiceCall f7604a;
            private IBinder b;

            Proxy(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.b;
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public ISearchSession beginSearch(String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (!this.b.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().beginSearch(str, str2, str3);
                    }
                    obtain2.readException();
                    return ISearchSession.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public int clearIndex(String str, String str2, Map map, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeMap(map);
                    obtain.writeString(str3);
                    if (!this.b.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().clearIndex(str, str2, map, str3);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public int clearIndexForm(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.b.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().clearIndexForm(str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public List<IndexData> delete(String str, String str2, List<IndexData> list, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeTypedList(list);
                    obtain.writeString(str3);
                    if (!this.b.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().delete(str, str2, list, str3);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(IndexData.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public int deleteByQuery(String str, String str2, String str3, String str4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    if (!this.b.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().deleteByQuery(str, str2, str3, str4);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public List<String> deleteByTerm(String str, String str2, String str3, List<String> list, String str4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeStringList(list);
                    obtain.writeString(str4);
                    if (!this.b.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().deleteByTerm(str, str2, str3, list, str4);
                    }
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public int deleteLarge(String str, String str2, SharedMemory sharedMemory, SharedMemory sharedMemory2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (sharedMemory != null) {
                        obtain.writeInt(1);
                        sharedMemory.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (sharedMemory2 != null) {
                        obtain.writeInt(1);
                        sharedMemory2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str3);
                    if (!this.b.transact(22, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().deleteLarge(str, str2, sharedMemory, sharedMemory2, str3);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public void endSearch(String str, String str2, ISearchSession iSearchSession, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(iSearchSession != null ? iSearchSession.asBinder() : null);
                    obtain.writeString(str3);
                    if (this.b.transact(12, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().endSearch(str, str2, iSearchSession, str3);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public List<IndexForm> getIndexForm(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.b.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getIndexForm(str, str2);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(IndexForm.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public int getIndexFormVersion(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.b.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getIndexFormVersion(str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public SearchableEntity getSearchableEntity(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.b.transact(18, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSearchableEntity(str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? SearchableEntity.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public List<SearchableEntity> getSearchableEntityList(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.b.transact(19, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSearchableEntityList(str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(SearchableEntity.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public List<IndexData> insert(String str, String str2, List<IndexData> list, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeTypedList(list);
                    obtain.writeString(str3);
                    if (!this.b.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().insert(str, str2, list, str3);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(IndexData.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public int insertLarge(String str, String str2, SharedMemory sharedMemory, SharedMemory sharedMemory2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (sharedMemory != null) {
                        obtain.writeInt(1);
                        sharedMemory.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (sharedMemory2 != null) {
                        obtain.writeInt(1);
                        sharedMemory2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str3);
                    if (!this.b.transact(20, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().insertLarge(str, str2, sharedMemory, sharedMemory2, str3);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public void registerClientDeathBinder(IBinder iBinder, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (this.b.transact(15, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerClientDeathBinder(iBinder, str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public void registerIndexChangeListener(String str, String str2, IIndexChangeCallback iIndexChangeCallback, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(iIndexChangeCallback != null ? iIndexChangeCallback.asBinder() : null);
                    obtain.writeString(str3);
                    if (this.b.transact(13, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerIndexChangeListener(str, str2, iIndexChangeCallback, str3);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public int setIndexForm(String str, int i, List<IndexForm> list, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    obtain.writeString(str2);
                    if (!this.b.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setIndexForm(str, i, list, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public int setIndexFormSchema(String str, int i, List<IndexForm> list, int i2, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (!this.b.transact(23, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setIndexFormSchema(str, i, list, i2, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public int setSearchableEntity(SearchableEntity searchableEntity, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (searchableEntity != null) {
                        obtain.writeInt(1);
                        searchableEntity.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (!this.b.transact(17, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setSearchableEntity(searchableEntity, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public void unRegisterClientDeathBinder(IBinder iBinder, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (this.b.transact(16, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unRegisterClientDeathBinder(iBinder, str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public void unRegisterIndexChangeListener(String str, String str2, IIndexChangeCallback iIndexChangeCallback, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(iIndexChangeCallback != null ? iIndexChangeCallback.asBinder() : null);
                    obtain.writeString(str3);
                    if (this.b.transact(14, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unRegisterIndexChangeListener(str, str2, iIndexChangeCallback, str3);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public List<IndexData> update(String str, String str2, List<IndexData> list, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeTypedList(list);
                    obtain.writeString(str3);
                    if (!this.b.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().update(str, str2, list, str3);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(IndexData.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.searchservice.service.IHOSPSearchServiceCall
            public int updateLarge(String str, String str2, SharedMemory sharedMemory, SharedMemory sharedMemory2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (sharedMemory != null) {
                        obtain.writeInt(1);
                        sharedMemory.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (sharedMemory2 != null) {
                        obtain.writeInt(1);
                        sharedMemory2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str3);
                    if (!this.b.transact(21, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().updateLarge(str, str2, sharedMemory, sharedMemory2, str3);
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
            attachInterface(this, DESCRIPTOR);
        }

        public static IHOSPSearchServiceCall asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IHOSPSearchServiceCall)) ? new Proxy(iBinder) : (IHOSPSearchServiceCall) queryLocalInterface;
        }

        public static IHOSPSearchServiceCall getDefaultImpl() {
            return Proxy.f7604a;
        }

        public static boolean setDefaultImpl(IHOSPSearchServiceCall iHOSPSearchServiceCall) {
            if (Proxy.f7604a == null) {
                if (iHOSPSearchServiceCall == null) {
                    return false;
                }
                Proxy.f7604a = iHOSPSearchServiceCall;
                return true;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
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
            IBinder iBinder = null;
            SharedMemory sharedMemory = null;
            SharedMemory sharedMemory2 = null;
            SharedMemory sharedMemory3 = null;
            SearchableEntity searchableEntity = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    int indexForm = setIndexForm(parcel.readString(), parcel.readInt(), parcel.createTypedArrayList(IndexForm.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(indexForm);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<IndexForm> indexForm2 = getIndexForm(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(indexForm2);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    int indexFormVersion = getIndexFormVersion(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(indexFormVersion);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int clearIndexForm = clearIndexForm(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(clearIndexForm);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<IndexData> insert = insert(parcel.readString(), parcel.readString(), parcel.createTypedArrayList(IndexData.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(insert);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<IndexData> update = update(parcel.readString(), parcel.readString(), parcel.createTypedArrayList(IndexData.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(update);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<IndexData> delete = delete(parcel.readString(), parcel.readString(), parcel.createTypedArrayList(IndexData.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(delete);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<String> deleteByTerm = deleteByTerm(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStringList(deleteByTerm);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    int deleteByQuery = deleteByQuery(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(deleteByQuery);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    int clearIndex = clearIndex(parcel.readString(), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(clearIndex);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    ISearchSession beginSearch = beginSearch(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (beginSearch != null) {
                        iBinder = beginSearch.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    endSearch(parcel.readString(), parcel.readString(), ISearchSession.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    registerIndexChangeListener(parcel.readString(), parcel.readString(), IIndexChangeCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    unRegisterIndexChangeListener(parcel.readString(), parcel.readString(), IIndexChangeCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    registerClientDeathBinder(parcel.readStrongBinder(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    unRegisterClientDeathBinder(parcel.readStrongBinder(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        searchableEntity = SearchableEntity.CREATOR.createFromParcel(parcel);
                    }
                    int searchableEntity2 = setSearchableEntity(searchableEntity, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(searchableEntity2);
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    SearchableEntity searchableEntity3 = getSearchableEntity(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (searchableEntity3 != null) {
                        parcel2.writeInt(1);
                        searchableEntity3.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<SearchableEntity> searchableEntityList = getSearchableEntityList(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(searchableEntityList);
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    SharedMemory sharedMemory4 = parcel.readInt() != 0 ? (SharedMemory) SharedMemory.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        sharedMemory3 = (SharedMemory) SharedMemory.CREATOR.createFromParcel(parcel);
                    }
                    int insertLarge = insertLarge(readString, readString2, sharedMemory4, sharedMemory3, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(insertLarge);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    SharedMemory sharedMemory5 = parcel.readInt() != 0 ? (SharedMemory) SharedMemory.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        sharedMemory2 = (SharedMemory) SharedMemory.CREATOR.createFromParcel(parcel);
                    }
                    int updateLarge = updateLarge(readString3, readString4, sharedMemory5, sharedMemory2, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(updateLarge);
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    SharedMemory sharedMemory6 = parcel.readInt() != 0 ? (SharedMemory) SharedMemory.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        sharedMemory = (SharedMemory) SharedMemory.CREATOR.createFromParcel(parcel);
                    }
                    int deleteLarge = deleteLarge(readString5, readString6, sharedMemory6, sharedMemory, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(deleteLarge);
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    int indexFormSchema = setIndexFormSchema(parcel.readString(), parcel.readInt(), parcel.createTypedArrayList(IndexForm.CREATOR), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(indexFormSchema);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    ISearchSession beginSearch(String str, String str2, String str3) throws RemoteException;

    int clearIndex(String str, String str2, Map map, String str3) throws RemoteException;

    int clearIndexForm(String str, String str2) throws RemoteException;

    List<IndexData> delete(String str, String str2, List<IndexData> list, String str3) throws RemoteException;

    int deleteByQuery(String str, String str2, String str3, String str4) throws RemoteException;

    List<String> deleteByTerm(String str, String str2, String str3, List<String> list, String str4) throws RemoteException;

    int deleteLarge(String str, String str2, SharedMemory sharedMemory, SharedMemory sharedMemory2, String str3) throws RemoteException;

    void endSearch(String str, String str2, ISearchSession iSearchSession, String str3) throws RemoteException;

    List<IndexForm> getIndexForm(String str, String str2) throws RemoteException;

    int getIndexFormVersion(String str, String str2) throws RemoteException;

    SearchableEntity getSearchableEntity(String str, String str2) throws RemoteException;

    List<SearchableEntity> getSearchableEntityList(String str) throws RemoteException;

    List<IndexData> insert(String str, String str2, List<IndexData> list, String str3) throws RemoteException;

    int insertLarge(String str, String str2, SharedMemory sharedMemory, SharedMemory sharedMemory2, String str3) throws RemoteException;

    void registerClientDeathBinder(IBinder iBinder, String str) throws RemoteException;

    void registerIndexChangeListener(String str, String str2, IIndexChangeCallback iIndexChangeCallback, String str3) throws RemoteException;

    int setIndexForm(String str, int i, List<IndexForm> list, String str2) throws RemoteException;

    int setIndexFormSchema(String str, int i, List<IndexForm> list, int i2, String str2) throws RemoteException;

    int setSearchableEntity(SearchableEntity searchableEntity, String str) throws RemoteException;

    void unRegisterClientDeathBinder(IBinder iBinder, String str) throws RemoteException;

    void unRegisterIndexChangeListener(String str, String str2, IIndexChangeCallback iIndexChangeCallback, String str3) throws RemoteException;

    List<IndexData> update(String str, String str2, List<IndexData> list, String str3) throws RemoteException;

    int updateLarge(String str, String str2, SharedMemory sharedMemory, SharedMemory sharedMemory2, String str3) throws RemoteException;
}
