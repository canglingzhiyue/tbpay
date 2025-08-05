package com.taobao.location.client;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.app.ActivityCompat;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.aidl.ITBLocationService;
import com.taobao.location.common.LocationErrorCode;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.passivelocation.PassiveLocationApplication;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.lang.ref.WeakReference;
import tb.dct;
import tb.kge;

/* loaded from: classes.dex */
public class TBLocationClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG = "TBLocationClient";
    public static final String NAVI_RESULT = "tb_location_navi_result";
    private static TBLocationClient f;

    /* renamed from: a  reason: collision with root package name */
    private ITBLocationService f17824a;
    private WeakReference<Context> b;
    private TBLocationOption d;
    private TBLocationCallbackWrapper e;
    private ServiceConnection c = new ServiceConnection() { // from class: com.taobao.location.client.TBLocationClient.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            } else if (iBinder instanceof ITBLocationService) {
                TBLocationClient.a(TBLocationClient.this, (ITBLocationService) iBinder);
                TBLocationClient tBLocationClient = TBLocationClient.this;
                TBLocationClient.a(tBLocationClient, TBLocationClient.d(tBLocationClient), TBLocationClient.c(TBLocationClient.this));
            } else {
                TBLocationClient.a(TBLocationClient.this, ITBLocationService.Stub.asInterface(iBinder));
                TBLocationClient tBLocationClient2 = TBLocationClient.this;
                TBLocationClient.a(tBLocationClient2, TBLocationClient.d(tBLocationClient2), TBLocationClient.c(TBLocationClient.this));
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            } else {
                TBLocationClient.a(TBLocationClient.this, (ITBLocationService) null);
            }
        }
    };
    private final boolean g = PassiveLocationApplication.useService(Globals.getApplication());

    static {
        kge.a(1126969739);
    }

    public static /* synthetic */ ITBLocationService a(TBLocationClient tBLocationClient, ITBLocationService iTBLocationService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITBLocationService) ipChange.ipc$dispatch("a3395982", new Object[]{tBLocationClient, iTBLocationService});
        }
        tBLocationClient.f17824a = iTBLocationService;
        return iTBLocationService;
    }

    public static /* synthetic */ WeakReference a(TBLocationClient tBLocationClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("ce2aa13c", new Object[]{tBLocationClient}) : tBLocationClient.b;
    }

    public static /* synthetic */ void a(TBLocationClient tBLocationClient, LocationErrorCode locationErrorCode, TBLocationCallbackWrapper tBLocationCallbackWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c6bbf5", new Object[]{tBLocationClient, locationErrorCode, tBLocationCallbackWrapper});
        } else {
            tBLocationClient.a(locationErrorCode, tBLocationCallbackWrapper);
        }
    }

    public static /* synthetic */ void a(TBLocationClient tBLocationClient, TBLocationOption tBLocationOption, TBLocationCallbackWrapper tBLocationCallbackWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a11e92b1", new Object[]{tBLocationClient, tBLocationOption, tBLocationCallbackWrapper});
        } else {
            tBLocationClient.a(tBLocationOption, tBLocationCallbackWrapper);
        }
    }

    public static /* synthetic */ ServiceConnection b(TBLocationClient tBLocationClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ServiceConnection) ipChange.ipc$dispatch("4c0d9301", new Object[]{tBLocationClient}) : tBLocationClient.c;
    }

    public static /* synthetic */ TBLocationCallbackWrapper c(TBLocationClient tBLocationClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLocationCallbackWrapper) ipChange.ipc$dispatch("461da6ab", new Object[]{tBLocationClient}) : tBLocationClient.e;
    }

    public static /* synthetic */ TBLocationOption d(TBLocationClient tBLocationClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLocationOption) ipChange.ipc$dispatch("3e8d8907", new Object[]{tBLocationClient}) : tBLocationClient.d;
    }

    public static /* synthetic */ boolean e(TBLocationClient tBLocationClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1e6f1dee", new Object[]{tBLocationClient})).booleanValue() : tBLocationClient.g;
    }

    /* loaded from: classes7.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1340334044);
        }

        private a() {
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Void doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        public Void a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
            }
            Context context = TBLocationClient.a(TBLocationClient.this) != null ? (Context) TBLocationClient.a(TBLocationClient.this).get() : null;
            if (context != null && TBLocationClient.b(TBLocationClient.this) != null) {
                try {
                    z = Services.bind(context, ITBLocationService.class, TBLocationClient.b(TBLocationClient.this));
                } catch (Throwable th) {
                    TLog.loge(TBLocationClient.LOG, "Services.bind", th);
                }
            } else if (context == null) {
                TBLocationClient.a(TBLocationClient.this, LocationErrorCode.FAIL_BIND_SERVICE_NO_CONTEXT, TBLocationClient.c(TBLocationClient.this));
                return null;
            } else if (TBLocationClient.b(TBLocationClient.this) == null) {
                TBLocationClient.a(TBLocationClient.this, LocationErrorCode.FAIL_BIND_SERVICE_NO_SERVICE_CONNECTION, TBLocationClient.c(TBLocationClient.this));
                return null;
            }
            if (!z) {
                try {
                    com.taobao.location.common.a.a(context);
                    Intent intent = new Intent("com.taobao.location.aidl.ITBLocationService");
                    intent.setPackage(context.getPackageName());
                    z = context.bindService(intent, TBLocationClient.b(TBLocationClient.this), 1);
                    if (z) {
                        AppMonitor.Counter.commit("TBLocation", "SysBindServiceSuccess", 1.0d);
                    }
                } catch (Throwable th2) {
                    AppMonitor.Counter.commit("TBLocation", "SysBindServiceErr", th2.toString(), 1.0d);
                    TLog.loge(TBLocationClient.LOG, "Services enable", th2);
                }
                if (!z) {
                    TBLocationClient.a(TBLocationClient.this, LocationErrorCode.FAIL_UNAVALIABLE_SERVICE, TBLocationClient.c(TBLocationClient.this));
                }
            }
            return null;
        }
    }

    public static synchronized TBLocationClient a() {
        synchronized (TBLocationClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationClient) ipChange.ipc$dispatch("4edbd76e", new Object[0]);
            }
            if (f == null) {
                f = a(Globals.getApplication());
            }
            return f;
        }
    }

    public static TBLocationClient a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLocationClient) ipChange.ipc$dispatch("86f2bb66", new Object[]{context}) : new TBLocationClient(context);
    }

    private TBLocationClient(Context context) {
        this.b = new WeakReference<>(context);
        TLog.loge(LOG, "useService" + this.g);
    }

    public void a(TBLocationOption tBLocationOption, com.taobao.location.client.a aVar, Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac092516", new Object[]{this, tBLocationOption, aVar, looper});
            return;
        }
        AppMonitor.Counter.commit("TBLocation", "onLocationChanged", 1.0d);
        if (tBLocationOption == null) {
            a(LocationErrorCode.FAIL_INVALID_OPTION, aVar);
            return;
        }
        try {
            TBLocationCallbackWrapper tBLocationCallbackWrapper = new TBLocationCallbackWrapper(aVar, looper, this.b, this.c);
            this.d = tBLocationOption;
            this.e = tBLocationCallbackWrapper;
            Context context = this.b.get();
            Application application = Globals.getApplication();
            if (this.g) {
                if (this.f17824a == null && context != null) {
                    new a().execute(new Void[0]);
                    return;
                } else {
                    a(tBLocationOption, tBLocationCallbackWrapper);
                    return;
                }
            }
            dct b = dct.b();
            b.a(application);
            b.a(tBLocationOption, tBLocationCallbackWrapper);
            b(tBLocationOption, tBLocationCallbackWrapper);
        } catch (Exception unused) {
            a(LocationErrorCode.FAIL_INVALID_LOOPER, aVar);
        }
    }

    public static TBLocationDTO b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("d17750dd", new Object[0]);
        }
        AppMonitor.Counter.commit("TBLocation", "getCacheLocation", 1.0d);
        String e = e();
        if (!TextUtils.isEmpty(e)) {
            try {
                TBLocationDTO tBLocationDTO = (TBLocationDTO) JSON.parseObject(e, TBLocationDTO.class);
                AppMonitor.Counter.commit("TBLocation", "getCacheLocation_success", 1.0d);
                return tBLocationDTO;
            } catch (Exception unused) {
                Log.e(LOG, "posInfo invalid!");
            }
        }
        return null;
    }

    public static TBLocationDTO a(TBLocationOption tBLocationOption) {
        String e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("cbcb4482", new Object[]{tBLocationOption});
        }
        if (tBLocationOption == null) {
            return b();
        }
        AppMonitor.Counter.commit("TBLocation", "getCacheLocation-option", 1.0d);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            File file = new File(d());
            if (file.exists() && tBLocationOption.getTimeLimit().matchTimeLimit(file.lastModified(), currentTimeMillis) && com.taobao.location.common.a.b.tryLock()) {
                try {
                    try {
                        e = e();
                    } catch (Throwable th) {
                        try {
                            com.taobao.location.common.a.b.unlock();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    TLog.loge(LOG, "getCacheLocation error = " + e2);
                    AppMonitor.Counter.commit("TBLocation", "getCacheLocation-ERROR", 1.0d);
                }
                if (!TextUtils.isEmpty(e)) {
                    TBLocationDTO tBLocationDTO = (TBLocationDTO) JSON.parseObject(e, TBLocationDTO.class);
                    if (tBLocationOption.getTimeLimit().matchTimeLimit(tBLocationDTO.timeStamp.longValue(), currentTimeMillis) && tBLocationOption.getAccuracy().matchAccuray(tBLocationDTO.accuracy.intValue()) && tBLocationOption.getDataModel().matchAddressModel(tBLocationDTO) && tBLocationOption.getDataModel().matchPoiModel(tBLocationDTO)) {
                        AppMonitor.Counter.commit("TBLocation", "getCacheLocation-option_matched", 1.0d);
                        TLog.loge(LOG, "posInfo matched");
                        try {
                            com.taobao.location.common.a.b.unlock();
                        } catch (Throwable unused2) {
                        }
                        return tBLocationDTO;
                    }
                    com.taobao.location.common.a.b.unlock();
                } else {
                    try {
                        com.taobao.location.common.a.b.unlock();
                    } catch (Throwable unused3) {
                    }
                    return null;
                }
            }
        } catch (Throwable unused4) {
        }
        return null;
    }

    private static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        File filesDir = Globals.getApplication().getFilesDir();
        return filesDir.getPath() + "/tb_location_navi_result";
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String e() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.location.client.TBLocationClient.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L12
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "ca0dcfb4"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L12:
            java.lang.String r0 = ""
            r1 = 0
            java.lang.String r2 = d()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L43
            r3.<init>(r2)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L43
            boolean r3 = r3.exists()     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L43
            if (r3 != 0) goto L25
            return r0
        L25:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            int r1 = r3.available()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L57
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L57
            r3.read(r1)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L57
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L57
            java.lang.String r4 = "utf-8"
            r2.<init>(r1, r4)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L57
            r3.close()     // Catch: java.lang.Throwable -> L3e
        L3e:
            r0 = r2
            goto L56
        L40:
            r1 = move-exception
            goto L49
        L42:
            return r0
        L43:
            r0 = move-exception
            r3 = r1
            goto L58
        L46:
            r2 = move-exception
            r3 = r1
            r1 = r2
        L49:
            java.lang.String r2 = "TBLocationClient"
            java.lang.String r4 = "读缓存异常"
            com.taobao.tao.log.TLog.loge(r2, r4, r1)     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L56
            r3.close()     // Catch: java.lang.Throwable -> L56
        L56:
            return r0
        L57:
            r0 = move-exception
        L58:
            if (r3 == 0) goto L5d
            r3.close()     // Catch: java.lang.Throwable -> L5d
        L5d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.location.client.TBLocationClient.e():java.lang.String");
    }

    public static final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (ActivityCompat.checkSelfPermission(Globals.getApplication().getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            return false;
        }
        if (ActivityCompat.checkSelfPermission(Globals.getApplication().getApplicationContext(), com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION) != 0) {
            return false;
        }
        return ((LocationManager) Globals.getApplication().getSystemService("location")).isProviderEnabled("gps");
    }

    private void a(LocationErrorCode locationErrorCode, TBLocationCallbackWrapper tBLocationCallbackWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c730d3b", new Object[]{this, locationErrorCode, tBLocationCallbackWrapper});
            return;
        }
        String a2 = a(locationErrorCode);
        AppMonitor.Counter.commit("TBLocation", "exeFailCallback", a2, 1.0d);
        TLog.loge(LOG, "exeFailCallback", a2);
        TBLocationDTO tBLocationDTO = new TBLocationDTO();
        tBLocationDTO.isNavSuccess = false;
        tBLocationDTO.errorCode = Integer.valueOf(locationErrorCode.getCode());
        try {
            tBLocationCallbackWrapper.onLocationChanged(tBLocationDTO);
        } catch (RemoteException unused) {
            TLog.loge(LOG, "Wrapper call back fail!");
        }
        if (tBLocationCallbackWrapper.mContext == null || tBLocationCallbackWrapper.mContext.get() == null || tBLocationCallbackWrapper.mServiceConnection == null) {
            return;
        }
        Services.unbind((Context) tBLocationCallbackWrapper.mContext.get(), tBLocationCallbackWrapper.mServiceConnection);
    }

    private String a(LocationErrorCode locationErrorCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b92a0b0c", new Object[]{this, locationErrorCode});
        }
        if (locationErrorCode == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errCode", (Object) Integer.valueOf(locationErrorCode.code));
        jSONObject.put("errmsg", (Object) locationErrorCode.desc);
        try {
            if (locationErrorCode == LocationErrorCode.FAIL_UNAVALIABLE_SERVICE) {
                jSONObject.put("enableTimes", (Object) Integer.valueOf(com.taobao.location.common.a.f17829a.get()));
            }
            return jSONObject.toJSONString();
        } catch (JSONException e) {
            TLog.loge(LOG, "generateArg error " + e.toString());
            return "{\"enableTimes\":" + com.taobao.location.common.a.f17829a.get() + ",\"errCode\":" + locationErrorCode.code + ",\"errmsg\":\"" + locationErrorCode.desc + "\"}";
        }
    }

    private void a(LocationErrorCode locationErrorCode, com.taobao.location.client.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2efc9f", new Object[]{this, locationErrorCode, aVar});
            return;
        }
        AppMonitor.Counter.commit("TBLocation", "exeFailCallback", a(locationErrorCode), 1.0d);
        TBLocationDTO tBLocationDTO = new TBLocationDTO();
        tBLocationDTO.isNavSuccess = false;
        tBLocationDTO.errorCode = Integer.valueOf(locationErrorCode.getCode());
        try {
            aVar.onLocationChanged(tBLocationDTO);
        } catch (Exception unused) {
            TLog.loge(LOG, "Callback call back fail!");
        }
    }

    private void a(TBLocationOption tBLocationOption, TBLocationCallbackWrapper tBLocationCallbackWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a000ab", new Object[]{this, tBLocationOption, tBLocationCallbackWrapper});
            return;
        }
        try {
            if (this.f17824a != null) {
                this.f17824a.onLocationChanged(tBLocationOption, tBLocationCallbackWrapper);
                b(tBLocationOption, tBLocationCallbackWrapper);
            } else if (tBLocationCallbackWrapper == null || tBLocationCallbackWrapper.mContext == null || tBLocationCallbackWrapper.mContext.get() == null || tBLocationCallbackWrapper.mServiceConnection == null) {
            } else {
                Services.unbind((Context) tBLocationCallbackWrapper.mContext.get(), tBLocationCallbackWrapper.mServiceConnection);
            }
        } catch (RemoteException unused) {
            if (tBLocationCallbackWrapper == null || tBLocationCallbackWrapper.mContext == null || tBLocationCallbackWrapper.mContext.get() == null || tBLocationCallbackWrapper.mServiceConnection == null) {
                return;
            }
            Services.unbind((Context) tBLocationCallbackWrapper.mContext.get(), tBLocationCallbackWrapper.mServiceConnection);
        }
    }

    private void b(TBLocationOption tBLocationOption, TBLocationCallbackWrapper tBLocationCallbackWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b81ac", new Object[]{this, tBLocationOption, tBLocationCallbackWrapper});
        } else if (tBLocationOption == null || tBLocationOption.getTimeout() == null || tBLocationOption.getTimeout().getLength() <= 0 || tBLocationCallbackWrapper == null) {
        } else {
            TBLocationDTO tBLocationDTO = new TBLocationDTO();
            tBLocationDTO.isNavSuccess = false;
            tBLocationDTO.errorCode = Integer.valueOf(LocationErrorCode.FAIL_LOCATION_TIMEOUT.code);
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = tBLocationDTO;
            tBLocationCallbackWrapper.mListenerHandler.sendMessageDelayed(obtain, tBLocationOption.getTimeout().getLength());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public final class TBLocationCallbackWrapper extends ITBLocationCallback.Stub {
        private static final int TYPE_LOCATION_CHANGED = 1;
        private com.taobao.location.client.a callback;
        private boolean called = false;
        private WeakReference<Context> mContext;
        final Handler mListenerHandler;
        private ServiceConnection mServiceConnection;

        static {
            kge.a(1656215538);
        }

        TBLocationCallbackWrapper(com.taobao.location.client.a aVar, Looper looper, WeakReference<Context> weakReference, ServiceConnection serviceConnection) {
            this.callback = aVar;
            this.mContext = weakReference;
            this.mServiceConnection = serviceConnection;
            if (looper == null) {
                this.mListenerHandler = new Handler() { // from class: com.taobao.location.client.TBLocationClient.TBLocationCallbackWrapper.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                        } else {
                            TBLocationCallbackWrapper.this.processMessage(message);
                        }
                    }
                };
            } else {
                this.mListenerHandler = new Handler(looper) { // from class: com.taobao.location.client.TBLocationClient.TBLocationCallbackWrapper.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                        } else {
                            TBLocationCallbackWrapper.this.processMessage(message);
                        }
                    }
                };
            }
        }

        @Override // com.taobao.location.aidl.ITBLocationCallback
        public void onLocationChanged(TBLocationDTO tBLocationDTO) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = tBLocationDTO;
            this.mListenerHandler.sendMessage(obtain);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void processMessage(Message message) {
            if (!this.called && message.what == 1) {
                handleLocationChangeMessage(message);
                if (!TBLocationClient.e(TBLocationClient.this)) {
                    return;
                }
                try {
                    if (this.mContext != null && this.mContext.get() != null && this.mServiceConnection != null) {
                        Services.unbind(this.mContext.get(), this.mServiceConnection);
                    }
                } catch (Exception unused) {
                    TLog.loge(TBLocationClient.LOG, "TBLocation unbind service Fail!");
                }
                this.called = true;
            }
        }

        public void handleLocationChangeMessage(Message message) {
            TBLocationDTO tBLocationDTO = (TBLocationDTO) message.obj;
            try {
                if (this.callback == null) {
                    TLog.loge(TBLocationClient.LOG, "call back ignore, Reason [timeout | done] !");
                    return;
                }
                this.callback.onLocationChanged(tBLocationDTO);
                this.callback = null;
                AppMonitor.Counter.commit("TBLocation", "handleLocationChangeMessage_success", 1.0d);
            } catch (Exception unused) {
                TLog.loge(TBLocationClient.LOG, "call back fail!");
            }
        }
    }
}
