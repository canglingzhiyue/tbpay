package com.alibaba.android.split.service;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.alibaba.android.split.api.ISplitInstallService;
import com.alibaba.android.split.api.SplitInstallResultCallback;
import com.alibaba.android.split.service.callback.SplitInstallServiceCallBack;
import java.util.ArrayList;
import tb.bfx;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class SplitInstallServiceStub extends Stub implements ISplitInstallService {
    static {
        kge.a(-1055768174);
        kge.a(-2137992842);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SplitInstallServiceStub() {
        super("com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallService");
    }

    @Override // com.alibaba.android.split.service.Stub
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            String readString = parcel.readString();
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
            Parcelable a2 = bfx.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallServiceCallback");
            if (!(queryLocalInterface instanceof SplitInstallResultCallback)) {
                queryLocalInterface = new SplitInstallServiceCallBack(readStrongBinder);
            }
            try {
                startInstall(readString, createTypedArrayList, (Bundle) a2, (SplitInstallResultCallback) queryLocalInterface);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } else if (i == 13) {
            String readString2 = parcel.readString();
            ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Bundle.CREATOR);
            Parcelable a3 = bfx.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallServiceCallback");
            if (!(queryLocalInterface2 instanceof SplitInstallResultCallback)) {
                queryLocalInterface2 = new SplitInstallServiceCallBack(readStrongBinder2);
            }
            try {
                deferredLanguageInstall(readString2, createTypedArrayList2, (Bundle) a3, (SplitInstallResultCallback) queryLocalInterface2);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        } else if (i != 14) {
            switch (i) {
                case 4:
                    String readString3 = parcel.readString();
                    int readInt = parcel.readInt();
                    Parcelable a4 = bfx.a(parcel, Bundle.CREATOR);
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallServiceCallback");
                    if (!(queryLocalInterface3 instanceof SplitInstallResultCallback)) {
                        queryLocalInterface3 = new SplitInstallServiceCallBack(readStrongBinder3);
                    }
                    try {
                        cancelInstall(readString3, readInt, (Bundle) a4, (SplitInstallResultCallback) queryLocalInterface3);
                        break;
                    } catch (RemoteException e3) {
                        e3.printStackTrace();
                        break;
                    }
                case 5:
                    String readString4 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallServiceCallback");
                    if (!(queryLocalInterface4 instanceof SplitInstallResultCallback)) {
                        queryLocalInterface4 = new SplitInstallServiceCallBack(readStrongBinder4);
                    }
                    try {
                        getSessionState(readString4, readInt2, (SplitInstallResultCallback) queryLocalInterface4);
                        break;
                    } catch (RemoteException e4) {
                        e4.printStackTrace();
                        break;
                    }
                case 6:
                    String readString5 = parcel.readString();
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallServiceCallback");
                    if (!(queryLocalInterface5 instanceof SplitInstallResultCallback)) {
                        queryLocalInterface5 = new SplitInstallServiceCallBack(readStrongBinder5);
                    }
                    try {
                        getSessionStates(readString5, (SplitInstallResultCallback) queryLocalInterface5);
                        break;
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                        break;
                    }
                case 7:
                    String readString6 = parcel.readString();
                    ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Bundle.CREATOR);
                    Parcelable a5 = bfx.a(parcel, Bundle.CREATOR);
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallServiceCallback");
                    if (!(queryLocalInterface6 instanceof SplitInstallResultCallback)) {
                        queryLocalInterface6 = new SplitInstallServiceCallBack(readStrongBinder6);
                    }
                    try {
                        deferredUninstall(readString6, createTypedArrayList3, (Bundle) a5, (SplitInstallResultCallback) queryLocalInterface6);
                        break;
                    } catch (RemoteException e6) {
                        e6.printStackTrace();
                        break;
                    }
                case 8:
                    String readString7 = parcel.readString();
                    ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Bundle.CREATOR);
                    Parcelable a6 = bfx.a(parcel, Bundle.CREATOR);
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallServiceCallback");
                    if (!(queryLocalInterface7 instanceof SplitInstallResultCallback)) {
                        queryLocalInterface7 = new SplitInstallServiceCallBack(readStrongBinder7);
                    }
                    try {
                        deferredInstall(readString7, createTypedArrayList4, (Bundle) a6, (SplitInstallResultCallback) queryLocalInterface7);
                        break;
                    } catch (RemoteException e7) {
                        e7.printStackTrace();
                        break;
                    }
            }
        } else {
            String readString8 = parcel.readString();
            ArrayList createTypedArrayList5 = parcel.createTypedArrayList(Bundle.CREATOR);
            Parcelable a7 = bfx.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder8 = parcel.readStrongBinder();
            IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallServiceCallback");
            if (!(queryLocalInterface8 instanceof SplitInstallResultCallback)) {
                queryLocalInterface8 = new SplitInstallServiceCallBack(readStrongBinder8);
            }
            try {
                deferredLanguageUninstall(readString8, createTypedArrayList5, (Bundle) a7, (SplitInstallResultCallback) queryLocalInterface8);
            } catch (RemoteException e8) {
                e8.printStackTrace();
            }
        }
        return super.dispatchTransaction(i, parcel, parcel2, i2);
    }
}
