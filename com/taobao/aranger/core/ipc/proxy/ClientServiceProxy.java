package com.taobao.aranger.core.ipc.proxy;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IClientService;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class ClientServiceProxy extends Binder implements IClientService {
    private final IBinder mRemote;

    static {
        kge.a(-960178596);
        kge.a(942366253);
    }

    public static IClientService getProxy(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(Constants.CLIENT_SERVICE_DESCRIPTOR);
        if (queryLocalInterface instanceof IClientService) {
            return (IClientService) queryLocalInterface;
        }
        return new ClientServiceProxy(iBinder);
    }

    private ClientServiceProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.taobao.aranger.intf.IService
    public void recycle(List<String> list) throws Exception {
        if (this.mRemote.isBinderAlive()) {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeStringList(list);
                this.mRemote.transact(4, obtain, null, 1);
                return;
            } finally {
                obtain.recycle();
            }
        }
        throw new IPCException(5, "the remote binder is not alive");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    @Override // com.taobao.aranger.intf.IClientService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.aranger.core.entity.Reply sendCallback(com.taobao.aranger.core.entity.Callback r8) throws java.lang.Exception {
        /*
            r7 = this;
            android.os.IBinder r0 = r7.mRemote
            boolean r0 = r0.isBinderAlive()
            if (r0 == 0) goto L68
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            com.taobao.aranger.core.wrapper.MethodWrapper r2 = r8.getMethodWrapper()     // Catch: java.lang.Throwable -> L5d
            boolean r2 = r2.isVoid()     // Catch: java.lang.Throwable -> L5d
            if (r2 != 0) goto L1c
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L5d
            goto L1d
        L1c:
            r2 = r1
        L1d:
            r3 = 0
            r8.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L5b
            android.os.IBinder r4 = r7.mRemote     // Catch: java.lang.Throwable -> L5b
            r5 = 3
            boolean r6 = r8.isOneWay()     // Catch: java.lang.Throwable -> L5b
            if (r6 == 0) goto L35
            com.taobao.aranger.core.wrapper.MethodWrapper r8 = r8.getMethodWrapper()     // Catch: java.lang.Throwable -> L5b
            boolean r8 = r8.isVoid()     // Catch: java.lang.Throwable -> L5b
            if (r8 == 0) goto L35
            r3 = 1
        L35:
            r4.transact(r5, r0, r2, r3)     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L4a
            int r8 = r2.dataSize()     // Catch: java.lang.Throwable -> L5b
            if (r8 != 0) goto L41
            goto L4a
        L41:
            android.os.Parcelable$Creator<com.taobao.aranger.core.entity.Reply> r8 = com.taobao.aranger.core.entity.Reply.CREATOR     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r8 = r8.createFromParcel(r2)     // Catch: java.lang.Throwable -> L5b
            com.taobao.aranger.core.entity.Reply r8 = (com.taobao.aranger.core.entity.Reply) r8     // Catch: java.lang.Throwable -> L5b
            goto L52
        L4a:
            com.taobao.aranger.core.entity.Reply r8 = com.taobao.aranger.core.entity.Reply.obtain()     // Catch: java.lang.Throwable -> L5b
            com.taobao.aranger.core.entity.Reply r8 = r8.setResult(r1)     // Catch: java.lang.Throwable -> L5b
        L52:
            r0.recycle()
            if (r2 == 0) goto L5a
            r2.recycle()
        L5a:
            return r8
        L5b:
            r8 = move-exception
            goto L5f
        L5d:
            r8 = move-exception
            r2 = r1
        L5f:
            r0.recycle()
            if (r2 == 0) goto L67
            r2.recycle()
        L67:
            throw r8
        L68:
            com.taobao.aranger.exception.IPCException r8 = new com.taobao.aranger.exception.IPCException
            r0 = 5
            java.lang.String r1 = "the remote binder is not alive"
            r8.<init>(r0, r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.aranger.core.ipc.proxy.ClientServiceProxy.sendCallback(com.taobao.aranger.core.entity.Callback):com.taobao.aranger.core.entity.Reply");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.mRemote;
    }
}
