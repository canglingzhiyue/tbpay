package com.huawei.nb.searchmanager.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SharedMemory;
import com.huawei.nb.searchmanager.client.model.IndexData;
import com.huawei.nb.searchmanager.client.model.Recommendation;
import com.huawei.nb.searchmanager.client.model.Token;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface ISearchSession extends IInterface {

    /* loaded from: classes4.dex */
    public static class Default implements ISearchSession {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.nb.searchmanager.client.ISearchSession
        public Map coverSearch(String str, List<String> list, int i) throws RemoteException {
            return null;
        }

        @Override // com.huawei.nb.searchmanager.client.ISearchSession
        public Map coverSearchWithTimeout(String str, List<String> list, int i, long j) throws RemoteException {
            return null;
        }

        @Override // com.huawei.nb.searchmanager.client.ISearchSession
        public int getSearchHitCount(String str) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.nb.searchmanager.client.ISearchSession
        public int getSearchHitCountWithTimeout(String str, long j) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.nb.searchmanager.client.ISearchSession
        public List<String> getTopFieldValues(String str, int i) throws RemoteException {
            return null;
        }

        @Override // com.huawei.nb.searchmanager.client.ISearchSession
        public List<String> getTopFieldValuesWithTimeout(String str, int i, long j) throws RemoteException {
            return null;
        }

        @Override // com.huawei.nb.searchmanager.client.ISearchSession
        public List<Recommendation> groupSearch(String str, int i) throws RemoteException {
            return null;
        }

        @Override // com.huawei.nb.searchmanager.client.ISearchSession
        public List<Recommendation> groupSearchWithTimeout(String str, int i, long j) throws RemoteException {
            return null;
        }

        @Override // com.huawei.nb.searchmanager.client.ISearchSession
        public List<Recommendation> groupTimeline(String str, String str2, Token token) throws RemoteException {
            return null;
        }

        @Override // com.huawei.nb.searchmanager.client.ISearchSession
        public List<Recommendation> groupTimelineWithTimeout(String str, String str2, Token token, long j) throws RemoteException {
            return null;
        }

        @Override // com.huawei.nb.searchmanager.client.ISearchSession
        public List<IndexData> search(String str, int i, int i2) throws RemoteException {
            return null;
        }

        @Override // com.huawei.nb.searchmanager.client.ISearchSession
        public List<IndexData> searchLarge(String str, int i, int i2, SharedMemory sharedMemory) throws RemoteException {
            return null;
        }

        @Override // com.huawei.nb.searchmanager.client.ISearchSession
        public List<IndexData> searchLargeWithTimeout(String str, int i, int i2, SharedMemory sharedMemory, long j) throws RemoteException {
            return null;
        }

        @Override // com.huawei.nb.searchmanager.client.ISearchSession
        public List<IndexData> searchWithTimeout(String str, int i, int i2, long j) throws RemoteException {
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class Stub extends Binder implements ISearchSession {
        private static final String DESCRIPTOR = "com.huawei.nb.searchmanager.client.ISearchSession";
        static final int TRANSACTION_coverSearch = 6;
        static final int TRANSACTION_coverSearchWithTimeout = 13;
        static final int TRANSACTION_getSearchHitCount = 2;
        static final int TRANSACTION_getSearchHitCountWithTimeout = 9;
        static final int TRANSACTION_getTopFieldValues = 1;
        static final int TRANSACTION_getTopFieldValuesWithTimeout = 8;
        static final int TRANSACTION_groupSearch = 4;
        static final int TRANSACTION_groupSearchWithTimeout = 11;
        static final int TRANSACTION_groupTimeline = 5;
        static final int TRANSACTION_groupTimelineWithTimeout = 12;
        static final int TRANSACTION_search = 3;
        static final int TRANSACTION_searchLarge = 7;
        static final int TRANSACTION_searchLargeWithTimeout = 14;
        static final int TRANSACTION_searchWithTimeout = 10;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public static class Proxy implements ISearchSession {

            /* renamed from: a  reason: collision with root package name */
            public static ISearchSession f7598a;
            private IBinder b;

            Proxy(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.b;
            }

            @Override // com.huawei.nb.searchmanager.client.ISearchSession
            public Map coverSearch(String str, List<String> list, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStringList(list);
                    obtain.writeInt(i);
                    if (!this.b.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().coverSearch(str, list, i);
                    }
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nb.searchmanager.client.ISearchSession
            public Map coverSearchWithTimeout(String str, List<String> list, int i, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStringList(list);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    if (!this.b.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().coverSearchWithTimeout(str, list, i, j);
                    }
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nb.searchmanager.client.ISearchSession
            public int getSearchHitCount(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.b.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSearchHitCount(str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nb.searchmanager.client.ISearchSession
            public int getSearchHitCountWithTimeout(String str, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    if (!this.b.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSearchHitCountWithTimeout(str, j);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nb.searchmanager.client.ISearchSession
            public List<String> getTopFieldValues(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (!this.b.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTopFieldValues(str, i);
                    }
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nb.searchmanager.client.ISearchSession
            public List<String> getTopFieldValuesWithTimeout(String str, int i, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    if (!this.b.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTopFieldValuesWithTimeout(str, i, j);
                    }
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nb.searchmanager.client.ISearchSession
            public List<Recommendation> groupSearch(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (!this.b.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().groupSearch(str, i);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(Recommendation.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nb.searchmanager.client.ISearchSession
            public List<Recommendation> groupSearchWithTimeout(String str, int i, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    if (!this.b.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().groupSearchWithTimeout(str, i, j);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(Recommendation.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nb.searchmanager.client.ISearchSession
            public List<Recommendation> groupTimeline(String str, String str2, Token token) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (token != null) {
                        obtain.writeInt(1);
                        token.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.b.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().groupTimeline(str, str2, token);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(Recommendation.CREATOR);
                    if (obtain2.readInt() != 0) {
                        token.readFromParcel(obtain2);
                    }
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nb.searchmanager.client.ISearchSession
            public List<Recommendation> groupTimelineWithTimeout(String str, String str2, Token token, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (token != null) {
                        obtain.writeInt(1);
                        token.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                    if (!this.b.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().groupTimelineWithTimeout(str, str2, token, j);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(Recommendation.CREATOR);
                    if (obtain2.readInt() != 0) {
                        token.readFromParcel(obtain2);
                    }
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nb.searchmanager.client.ISearchSession
            public List<IndexData> search(String str, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.b.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().search(str, i, i2);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(IndexData.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nb.searchmanager.client.ISearchSession
            public List<IndexData> searchLarge(String str, int i, int i2, SharedMemory sharedMemory) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (sharedMemory != null) {
                        obtain.writeInt(1);
                        sharedMemory.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.b.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().searchLarge(str, i, i2, sharedMemory);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(IndexData.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nb.searchmanager.client.ISearchSession
            public List<IndexData> searchLargeWithTimeout(String str, int i, int i2, SharedMemory sharedMemory, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (sharedMemory != null) {
                        obtain.writeInt(1);
                        sharedMemory.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.b.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        List<IndexData> searchLargeWithTimeout = Stub.getDefaultImpl().searchLargeWithTimeout(str, i, i2, sharedMemory, j);
                        obtain2.recycle();
                        obtain.recycle();
                        return searchLargeWithTimeout;
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(IndexData.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.huawei.nb.searchmanager.client.ISearchSession
            public List<IndexData> searchWithTimeout(String str, int i, int i2, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    if (!this.b.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().searchWithTimeout(str, i, i2, j);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(IndexData.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISearchSession asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISearchSession)) ? new Proxy(iBinder) : (ISearchSession) queryLocalInterface;
        }

        public static ISearchSession getDefaultImpl() {
            return Proxy.f7598a;
        }

        public static boolean setDefaultImpl(ISearchSession iSearchSession) {
            if (Proxy.f7598a == null) {
                if (iSearchSession == null) {
                    return false;
                }
                Proxy.f7598a = iSearchSession;
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
            Token token = null;
            SharedMemory sharedMemory = null;
            Token token2 = null;
            SharedMemory sharedMemory2 = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<String> topFieldValues = getTopFieldValues(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStringList(topFieldValues);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int searchHitCount = getSearchHitCount(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(searchHitCount);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<IndexData> search = search(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(search);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<Recommendation> groupSearch = groupSearch(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(groupSearch);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        token = Token.CREATOR.createFromParcel(parcel);
                    }
                    List<Recommendation> groupTimeline = groupTimeline(readString, readString2, token);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(groupTimeline);
                    if (token != null) {
                        parcel2.writeInt(1);
                        token.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    Map coverSearch = coverSearch(parcel.readString(), parcel.createStringArrayList(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeMap(coverSearch);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString3 = parcel.readString();
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        sharedMemory2 = (SharedMemory) SharedMemory.CREATOR.createFromParcel(parcel);
                    }
                    List<IndexData> searchLarge = searchLarge(readString3, readInt, readInt2, sharedMemory2);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(searchLarge);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<String> topFieldValuesWithTimeout = getTopFieldValuesWithTimeout(parcel.readString(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeStringList(topFieldValuesWithTimeout);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    int searchHitCountWithTimeout = getSearchHitCountWithTimeout(parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(searchHitCountWithTimeout);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<IndexData> searchWithTimeout = searchWithTimeout(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(searchWithTimeout);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<Recommendation> groupSearchWithTimeout = groupSearchWithTimeout(parcel.readString(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(groupSearchWithTimeout);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        token2 = Token.CREATOR.createFromParcel(parcel);
                    }
                    Token token3 = token2;
                    List<Recommendation> groupTimelineWithTimeout = groupTimelineWithTimeout(readString4, readString5, token3, parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(groupTimelineWithTimeout);
                    if (token3 != null) {
                        parcel2.writeInt(1);
                        token3.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    Map coverSearchWithTimeout = coverSearchWithTimeout(parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeMap(coverSearchWithTimeout);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString6 = parcel.readString();
                    int readInt3 = parcel.readInt();
                    int readInt4 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        sharedMemory = (SharedMemory) SharedMemory.CREATOR.createFromParcel(parcel);
                    }
                    List<IndexData> searchLargeWithTimeout = searchLargeWithTimeout(readString6, readInt3, readInt4, sharedMemory, parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(searchLargeWithTimeout);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    Map coverSearch(String str, List<String> list, int i) throws RemoteException;

    Map coverSearchWithTimeout(String str, List<String> list, int i, long j) throws RemoteException;

    int getSearchHitCount(String str) throws RemoteException;

    int getSearchHitCountWithTimeout(String str, long j) throws RemoteException;

    List<String> getTopFieldValues(String str, int i) throws RemoteException;

    List<String> getTopFieldValuesWithTimeout(String str, int i, long j) throws RemoteException;

    List<Recommendation> groupSearch(String str, int i) throws RemoteException;

    List<Recommendation> groupSearchWithTimeout(String str, int i, long j) throws RemoteException;

    List<Recommendation> groupTimeline(String str, String str2, Token token) throws RemoteException;

    List<Recommendation> groupTimelineWithTimeout(String str, String str2, Token token, long j) throws RemoteException;

    List<IndexData> search(String str, int i, int i2) throws RemoteException;

    List<IndexData> searchLarge(String str, int i, int i2, SharedMemory sharedMemory) throws RemoteException;

    List<IndexData> searchLargeWithTimeout(String str, int i, int i2, SharedMemory sharedMemory, long j) throws RemoteException;

    List<IndexData> searchWithTimeout(String str, int i, int i2, long j) throws RemoteException;
}
