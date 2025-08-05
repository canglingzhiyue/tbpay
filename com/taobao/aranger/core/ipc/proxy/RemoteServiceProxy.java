package com.taobao.aranger.core.ipc.proxy;

import android.os.IBinder;
import android.os.Parcel;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.ipc.provider.ARangerProvider;
import com.taobao.aranger.intf.IRemoteService;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class RemoteServiceProxy implements IRemoteService {

    /* renamed from: a  reason: collision with root package name */
    private static volatile IRemoteService f16366a;
    private final IBinder b;

    static {
        kge.a(1896544855);
        kge.a(1037527378);
    }

    public static IRemoteService a(IBinder iBinder) {
        if (iBinder.queryLocalInterface(Constants.DEFAULT_CONTENT_DESCRIPTOR) != null) {
            if (f16366a == null) {
                synchronized (RemoteServiceProxy.class) {
                    if (f16366a == null) {
                        f16366a = new ARangerProvider();
                    }
                }
            }
            return f16366a;
        }
        return new RemoteServiceProxy(iBinder);
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public boolean isRemote() {
        return this.b.queryLocalInterface(Constants.DEFAULT_CONTENT_DESCRIPTOR) == null;
    }

    private RemoteServiceProxy(IBinder iBinder) {
        this.b = iBinder;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    @Override // com.taobao.aranger.intf.IRemoteService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.aranger.core.entity.Reply sendCall(com.taobao.aranger.core.entity.Call r6) throws java.lang.Exception {
        /*
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            com.taobao.aranger.core.wrapper.MethodWrapper r2 = r6.getMethodWrapper()     // Catch: java.lang.Throwable -> L56
            boolean r2 = r2.isVoid()     // Catch: java.lang.Throwable -> L56
            if (r2 != 0) goto L14
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L56
            goto L15
        L14:
            r2 = r1
        L15:
            r3 = 0
            r6.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L54
            boolean r4 = r6.isOneWay()     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L2b
            com.taobao.aranger.core.wrapper.MethodWrapper r6 = r6.getMethodWrapper()     // Catch: java.lang.Throwable -> L54
            boolean r6 = r6.isVoid()     // Catch: java.lang.Throwable -> L54
            if (r6 == 0) goto L2b
            r6 = 1
            goto L2c
        L2b:
            r6 = 0
        L2c:
            android.os.IBinder r4 = r5.b     // Catch: java.lang.Throwable -> L54
            r4.transact(r3, r0, r2, r6)     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L43
            int r6 = r2.dataSize()     // Catch: java.lang.Throwable -> L54
            if (r6 != 0) goto L3a
            goto L43
        L3a:
            android.os.Parcelable$Creator<com.taobao.aranger.core.entity.Reply> r6 = com.taobao.aranger.core.entity.Reply.CREATOR     // Catch: java.lang.Throwable -> L54
            java.lang.Object r6 = r6.createFromParcel(r2)     // Catch: java.lang.Throwable -> L54
            com.taobao.aranger.core.entity.Reply r6 = (com.taobao.aranger.core.entity.Reply) r6     // Catch: java.lang.Throwable -> L54
            goto L4b
        L43:
            com.taobao.aranger.core.entity.Reply r6 = com.taobao.aranger.core.entity.Reply.obtain()     // Catch: java.lang.Throwable -> L54
            com.taobao.aranger.core.entity.Reply r6 = r6.setResult(r1)     // Catch: java.lang.Throwable -> L54
        L4b:
            r0.recycle()
            if (r2 == 0) goto L53
            r2.recycle()
        L53:
            return r6
        L54:
            r6 = move-exception
            goto L58
        L56:
            r6 = move-exception
            r2 = r1
        L58:
            r0.recycle()
            if (r2 == 0) goto L60
            r2.recycle()
        L60:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.aranger.core.ipc.proxy.RemoteServiceProxy.sendCall(com.taobao.aranger.core.entity.Call):com.taobao.aranger.core.entity.Reply");
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public void connect() throws Exception {
        Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.taobao.aranger.intf.IService
    public void recycle(List<String> list) throws Exception {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeStringList(list);
            this.b.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.b;
    }
}
