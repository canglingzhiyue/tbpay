package com.taobao.login4android.api.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.login4android.api.aidl.ICheckResultCallback;
import com.taobao.login4android.api.aidl.ICommonCallback;
import com.taobao.login4android.api.aidl.ITokenCallback;
import com.taobao.login4android.api.aidl.IUccCallback;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public interface ILogin extends IInterface {

    /* loaded from: classes7.dex */
    public static class Default implements ILogin {
        static {
            kge.a(-52707671);
            kge.a(157216044);
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void alipayAuth(String str) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void applyToken(ITokenCallback iTokenCallback) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void bindAlipay(String str, String str2) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void checkLogoutPanelEnable(ICheckResultCallback iCheckResultCallback) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void checkMultiAccountPageEnable(ICheckResultCallback iCheckResultCallback) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void checkNickModifiable(ICheckResultCallback iCheckResultCallback) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void clearHistoryNames() throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void goTmall(boolean z, String str, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void initInjectVst() throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void loginByKey(String str, int i) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void loginWithBundle(boolean z, Bundle bundle) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void logout(boolean z) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void navByScene(String str) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void openMultiAccountPage() throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public boolean refreshCookies() throws RemoteException {
            return false;
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void showLogoutPanel() throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void triggerLoginBundle() throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void uccBind(String str, Map map, IUccCallback iUccCallback) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void uccTrustLogin(String str, Map map, IUccCallback iUccCallback) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void uccUnbind(String str, IUccCallback iUccCallback) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void userLogin() throws RemoteException {
        }
    }

    void alipayAuth(String str) throws RemoteException;

    void applyToken(ITokenCallback iTokenCallback) throws RemoteException;

    void bindAlipay(String str, String str2) throws RemoteException;

    void checkLogoutPanelEnable(ICheckResultCallback iCheckResultCallback) throws RemoteException;

    void checkMultiAccountPageEnable(ICheckResultCallback iCheckResultCallback) throws RemoteException;

    void checkNickModifiable(ICheckResultCallback iCheckResultCallback) throws RemoteException;

    void clearHistoryNames() throws RemoteException;

    void goTmall(boolean z, String str, ICommonCallback iCommonCallback) throws RemoteException;

    void initInjectVst() throws RemoteException;

    void loginByKey(String str, int i) throws RemoteException;

    void loginWithBundle(boolean z, Bundle bundle) throws RemoteException;

    void logout(boolean z) throws RemoteException;

    void navByScene(String str) throws RemoteException;

    void openMultiAccountPage() throws RemoteException;

    boolean refreshCookies() throws RemoteException;

    void showLogoutPanel() throws RemoteException;

    void triggerLoginBundle() throws RemoteException;

    void uccBind(String str, Map map, IUccCallback iUccCallback) throws RemoteException;

    void uccTrustLogin(String str, Map map, IUccCallback iUccCallback) throws RemoteException;

    void uccUnbind(String str, IUccCallback iUccCallback) throws RemoteException;

    void userLogin() throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements ILogin {
        private static final String DESCRIPTOR = "com.taobao.login4android.api.aidl.ILogin";
        static final int TRANSACTION_alipayAuth = 12;
        static final int TRANSACTION_applyToken = 9;
        static final int TRANSACTION_bindAlipay = 4;
        static final int TRANSACTION_checkLogoutPanelEnable = 19;
        static final int TRANSACTION_checkMultiAccountPageEnable = 18;
        static final int TRANSACTION_checkNickModifiable = 11;
        static final int TRANSACTION_clearHistoryNames = 8;
        static final int TRANSACTION_goTmall = 13;
        static final int TRANSACTION_initInjectVst = 10;
        static final int TRANSACTION_loginByKey = 3;
        static final int TRANSACTION_loginWithBundle = 1;
        static final int TRANSACTION_logout = 5;
        static final int TRANSACTION_navByScene = 6;
        static final int TRANSACTION_openMultiAccountPage = 20;
        static final int TRANSACTION_refreshCookies = 7;
        static final int TRANSACTION_showLogoutPanel = 21;
        static final int TRANSACTION_triggerLoginBundle = 17;
        static final int TRANSACTION_uccBind = 15;
        static final int TRANSACTION_uccTrustLogin = 14;
        static final int TRANSACTION_uccUnbind = 16;
        static final int TRANSACTION_userLogin = 2;

        static {
            kge.a(-618317498);
            kge.a(157216044);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ILogin asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ILogin)) {
                return (ILogin) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    loginWithBundle(z, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    userLogin();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    loginByKey(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    bindAlipay(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    logout(z);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    navByScene(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean refreshCookies = refreshCookies();
                    parcel2.writeNoException();
                    parcel2.writeInt(refreshCookies ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    clearHistoryNames();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    applyToken(ITokenCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    initInjectVst();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    checkNickModifiable(ICheckResultCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    alipayAuth(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    goTmall(z, parcel.readString(), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    uccTrustLogin(parcel.readString(), parcel.readHashMap(getClass().getClassLoader()), IUccCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    uccBind(parcel.readString(), parcel.readHashMap(getClass().getClassLoader()), IUccCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    uccUnbind(parcel.readString(), IUccCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    triggerLoginBundle();
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    checkMultiAccountPageEnable(ICheckResultCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    checkLogoutPanelEnable(ICheckResultCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    openMultiAccountPage();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    showLogoutPanel();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes7.dex */
        public static class Proxy implements ILogin {
            public static ILogin sDefaultImpl;
            private IBinder mRemote;

            static {
                kge.a(664141168);
                kge.a(157216044);
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void loginWithBundle(boolean z, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().loginWithBundle(z, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void userLogin() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().userLogin();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void loginByKey(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().loginByKey(str, i);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void bindAlipay(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().bindAlipay(str, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void logout(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().logout(z);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void navByScene(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().navByScene(str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public boolean refreshCookies() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().refreshCookies();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void clearHistoryNames() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().clearHistoryNames();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void applyToken(ITokenCallback iTokenCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iTokenCallback != null ? iTokenCallback.asBinder() : null);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().applyToken(iTokenCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void initInjectVst() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().initInjectVst();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void checkNickModifiable(ICheckResultCallback iCheckResultCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iCheckResultCallback != null ? iCheckResultCallback.asBinder() : null);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().checkNickModifiable(iCheckResultCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void alipayAuth(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().alipayAuth(str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void goTmall(boolean z, String str, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iCommonCallback != null ? iCommonCallback.asBinder() : null);
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().goTmall(z, str, iCommonCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void uccTrustLogin(String str, Map map, IUccCallback iUccCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    obtain.writeStrongBinder(iUccCallback != null ? iUccCallback.asBinder() : null);
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().uccTrustLogin(str, map, iUccCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void uccBind(String str, Map map, IUccCallback iUccCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    obtain.writeStrongBinder(iUccCallback != null ? iUccCallback.asBinder() : null);
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().uccBind(str, map, iUccCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void uccUnbind(String str, IUccCallback iUccCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iUccCallback != null ? iUccCallback.asBinder() : null);
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().uccUnbind(str, iUccCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void triggerLoginBundle() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(17, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().triggerLoginBundle();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void checkMultiAccountPageEnable(ICheckResultCallback iCheckResultCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iCheckResultCallback != null ? iCheckResultCallback.asBinder() : null);
                    if (!this.mRemote.transact(18, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().checkMultiAccountPageEnable(iCheckResultCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void checkLogoutPanelEnable(ICheckResultCallback iCheckResultCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iCheckResultCallback != null ? iCheckResultCallback.asBinder() : null);
                    if (!this.mRemote.transact(19, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().checkLogoutPanelEnable(iCheckResultCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void openMultiAccountPage() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(20, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().openMultiAccountPage();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ILogin
            public void showLogoutPanel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(21, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().showLogoutPanel();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(ILogin iLogin) {
            if (Proxy.sDefaultImpl != null || iLogin == null) {
                return false;
            }
            Proxy.sDefaultImpl = iLogin;
            return true;
        }

        public static ILogin getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
