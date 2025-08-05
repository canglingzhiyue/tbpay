package com.taobao.aranger.core.ipc.provider;

import android.app.Application;
import android.content.AttributionSource;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.IContentProvider;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.ipc.entity.AttributionSourceState;
import com.taobao.aranger.core.ipc.provider.ARangerProvider;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IRemoteService;
import com.taobao.aranger.utils.b;
import com.taobao.aranger.utils.c;
import com.taobao.aranger.utils.f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.jzv;
import tb.jzy;
import tb.kak;
import tb.kge;

/* loaded from: classes.dex */
public class ARangerProvider extends ContentProvider implements IRemoteService {

    /* renamed from: a  reason: collision with root package name */
    private static final String f16359a;
    private static final AtomicBoolean b;
    private final HookIContentProvider c = new HookIContentProvider();

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public boolean isRemote() {
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    static {
        kge.a(-376347840);
        kge.a(1037527378);
        f16359a = ARangerProvider.class.getSimpleName();
        b = new AtomicBoolean(false);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (getContext() != null) {
            jzv.a((Application) getContext().getApplicationContext());
        }
        connect();
        return false;
    }

    public IContentProvider getIContentProvider() {
        return this.c;
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        char c;
        Bundle bundle2 = new Bundle();
        int hashCode = str.hashCode();
        if (hashCode != 3045982) {
            if (hashCode == 1930954610 && str.equals(Constants.METHOD_RECYCLE_REMOTE)) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("call")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            bundle.setClassLoader(jzv.class.getClassLoader());
            Call call = (Call) bundle.getParcelable("call");
            try {
                Reply sendCall = sendCall(call);
                if (!call.getMethodWrapper().isVoid() || sendCall.isError() || sendCall.getFlowParameterWrappers() != null) {
                    bundle2.putParcelable(Constants.PARAM_REPLY, sendCall);
                }
            } catch (Exception e) {
                kak.a(f16359a, "[call][sendCall]", e, new Object[0]);
                bundle2.putParcelable(Constants.PARAM_REPLY, Reply.obtain().setErrorCode(10).setErrorMessage(e.getMessage()));
            }
        } else if (c == 1) {
            final ArrayList<String> stringArrayList = bundle.getStringArrayList("keys");
            b.a(false, false, new Runnable() { // from class: com.taobao.aranger.core.ipc.provider.ARangerProvider.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (stringArrayList == null) {
                            return;
                        }
                        ARangerProvider.this.recycle(stringArrayList);
                    } catch (Exception e2) {
                        kak.a(ARangerProvider.f16359a, "[call][recycle]", e2, new Object[0]);
                    }
                }
            });
        }
        return bundle2;
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public Reply sendCall(Call call) {
        try {
            return jzy.a(call).a();
        } catch (Exception e) {
            kak.a(f16359a, "[sendCall][handleReply]", e, new Object[0]);
            if (e instanceof IPCException) {
                return Reply.obtain().setErrorCode(((IPCException) e).getErrorCode()).setErrorMessage(e.getMessage());
            }
            return Reply.obtain().setErrorCode(11).setErrorMessage(e.getMessage());
        }
    }

    @Override // com.taobao.aranger.intf.IService
    public void recycle(List<String> list) {
        f.a().a(list);
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public void connect() {
        if (b.compareAndSet(false, true)) {
            b.a(false, false, new Runnable() { // from class: com.taobao.aranger.core.ipc.provider.ARangerProvider.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Intent intent = new Intent();
                        intent.setAction(Constants.ACTION_CONNECT);
                        intent.putExtra("processName", c.a());
                        intent.setPackage(jzv.a().getPackageName());
                        jzv.a().sendBroadcast(intent);
                    } catch (Throwable th) {
                        kak.a(ARangerProvider.f16359a, "[connect][sendBroadcast]", th, new Object[0]);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class HookIContentProvider extends Binder implements IContentProvider {
        static {
            kge.a(982925352);
            kge.a(1559869559);
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        HookIContentProvider() {
            attachInterface(this, Constants.DEFAULT_CONTENT_DESCRIPTOR);
        }

        public Bundle call(String str, String str2, String str3, Bundle bundle) {
            return ARangerProvider.this.call(str2, str3, bundle);
        }

        public Bundle call(String str, String str2, String str3, String str4, Bundle bundle) {
            return ARangerProvider.this.call(str3, str4, bundle);
        }

        public Bundle call(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
            return ARangerProvider.this.call(str4, str5, bundle);
        }

        public Bundle call(AttributionSource attributionSource, String str, String str2, String str3, Bundle bundle) {
            return ARangerProvider.this.call(str2, str3, bundle);
        }

        public String getProviderName() {
            return ARangerProvider.this.getClass().getName();
        }

        public /* synthetic */ void lambda$onTransact$8$ARangerProvider$HookIContentProvider(Call call) {
            try {
                ARangerProvider.this.sendCall(call);
            } catch (Exception e) {
                kak.a(ARangerProvider.f16359a, "[onTransact][sendCall] oneway", e, new Object[0]);
            }
        }

        @Override // android.os.Binder
        protected boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Bundle bundle;
            if (i == 0) {
                boolean z = i2 == 17 || i2 == 1;
                try {
                    final Call createFromParcel = Call.CREATOR.createFromParcel(parcel);
                    if (z) {
                        b.a(false, false, new Runnable() { // from class: com.taobao.aranger.core.ipc.provider.-$$Lambda$ARangerProvider$HookIContentProvider$vkH-CVDx00QePjawW2fJv5_EHLM
                            @Override // java.lang.Runnable
                            public final void run() {
                                ARangerProvider.HookIContentProvider.this.lambda$onTransact$8$ARangerProvider$HookIContentProvider(createFromParcel);
                            }
                        });
                    } else {
                        Reply sendCall = ARangerProvider.this.sendCall(createFromParcel);
                        if (!createFromParcel.getMethodWrapper().isVoid() || sendCall.isError() || sendCall.getFlowParameterWrappers() != null) {
                            sendCall.writeToParcel(parcel2, 0);
                        }
                    }
                } catch (Exception e) {
                    String str = ARangerProvider.f16359a;
                    kak.a(str, "[onTransact][oneway:" + z + "][sendCall]", e, new Object[0]);
                    if (!z) {
                        Reply.obtain().setErrorCode(10).setErrorMessage(e.getMessage()).writeToParcel(parcel2, i2);
                    }
                }
                return true;
            } else if (i == 1) {
                try {
                    final ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    b.a(false, false, new Runnable() { // from class: com.taobao.aranger.core.ipc.provider.ARangerProvider.HookIContentProvider.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                if (createStringArrayList == null) {
                                    return;
                                }
                                ARangerProvider.this.recycle(createStringArrayList);
                            } catch (Exception e2) {
                                kak.a(ARangerProvider.f16359a, "[onTransact][recycle]", e2, new Object[0]);
                            }
                        }
                    });
                } catch (Exception e2) {
                    kak.a(ARangerProvider.f16359a, "[onTransact][recycle] create string array list error", e2, new Object[0]);
                }
                return true;
            } else if (i != 21) {
                return true;
            } else {
                try {
                    parcel.enforceInterface(Constants.DEFAULT_CONTENT_DESCRIPTOR);
                    if (Build.VERSION.SDK_INT >= 31) {
                        AttributionSourceState.CREATOR.createFromParcel(parcel);
                        parcel.readString();
                    } else {
                        if (Build.VERSION.SDK_INT > 17) {
                            parcel.readString();
                        }
                        if (Build.VERSION.SDK_INT == 29) {
                            parcel.readString();
                        }
                        if (Build.VERSION.SDK_INT == 30) {
                            parcel.readString();
                            parcel.readString();
                        }
                    }
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
                    if (readString != null) {
                        bundle = ARangerProvider.this.call(readString, readString2, readBundle);
                    } else {
                        bundle = new Bundle();
                        bundle.putParcelable(Constants.PARAM_REPLY, Reply.obtain().setErrorCode(40).setErrorMessage("read method null from default call parcel."));
                    }
                } catch (Exception e3) {
                    kak.a(ARangerProvider.f16359a, "[onTransact][callTransaction]", e3, new Object[0]);
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable(Constants.PARAM_REPLY, Reply.obtain().setErrorCode(41).setErrorMessage(e3.toString()));
                    bundle = bundle2;
                }
                parcel2.writeNoException();
                parcel2.writeBundle(bundle);
                return true;
            }
        }
    }
}
