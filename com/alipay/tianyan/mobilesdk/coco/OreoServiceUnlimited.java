package com.alipay.tianyan.mobilesdk.coco;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingStatus;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.UUID;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class OreoServiceUnlimited {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CODE_START_SERVICE = 16707567;
    public static final String DESCRIPTOR_START_SERVICE = "OreoServiceUnlimited-startService";
    public static final int ERROR_CODE_NO_TARGET_SERVICE = -1;
    public static final int ERROR_CODE_UNKNOWN_ERROR = -2;
    public static final String KEY_MONITOR_TRACE_OREO_UNLIMITED_SERVICE = "monitor_trace_oreo_unlimited_service";
    public static final String TAG = "OreoServiceUnlimited";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6188a = false;

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class WrappedBinder extends Binder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private IBinder f6190a;
        private WeakReference<Service> b;

        public WrappedBinder(IBinder iBinder, Service service) {
            this.f6190a = iBinder;
            this.b = new WeakReference<>(service);
        }

        public static /* synthetic */ Object ipc$super(WrappedBinder wrappedBinder, String str, Object... objArr) {
            if (str.hashCode() == 94517172) {
                return new Boolean(super.onTransact(((Number) objArr[0]).intValue(), (Parcel) objArr[1], (Parcel) objArr[2], ((Number) objArr[3]).intValue()));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.Binder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.tianyan.mobilesdk.coco.OreoServiceUnlimited.WrappedBinder.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L2f
                r1 = 5
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r4
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r5)
                r1[r2] = r3
                r5 = 2
                r1[r5] = r6
                r5 = 3
                r1[r5] = r7
                r5 = 4
                java.lang.Integer r6 = new java.lang.Integer
                r6.<init>(r8)
                r1[r5] = r6
                java.lang.String r5 = "5a237b4"
                java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                return r5
            L2f:
                r0 = 16707567(0xfeefef, float:2.3412288E-38)
                if (r5 != r0) goto L3b
                java.lang.String r0 = "OreoServiceUnlimited-startService"
                r6.enforceInterface(r0)     // Catch: java.lang.SecurityException -> L3b
                r0 = 1
                goto L3c
            L3b:
                r0 = 0
            L3c:
                if (r0 == 0) goto L81
                r7.writeNoException()     // Catch: java.lang.Exception -> L6b
                android.os.Parcelable$Creator r5 = android.content.Intent.CREATOR     // Catch: java.lang.Exception -> L6b
                java.lang.Object r5 = r5.createFromParcel(r6)     // Catch: java.lang.Exception -> L6b
                android.content.Intent r5 = (android.content.Intent) r5     // Catch: java.lang.Exception -> L6b
                java.lang.ref.WeakReference<android.app.Service> r6 = r4.b     // Catch: java.lang.Exception -> L6b
                java.lang.Object r6 = r6.get()     // Catch: java.lang.Exception -> L6b
                android.app.Service r6 = (android.app.Service) r6     // Catch: java.lang.Exception -> L6b
                r8 = -1
                if (r6 != 0) goto L5d
                r7.writeInt(r8)     // Catch: java.lang.Exception -> L6b
                java.lang.String r5 = ""
                r7.writeString(r5)     // Catch: java.lang.Exception -> L6b
                return r2
            L5d:
                java.lang.ClassLoader r0 = r6.getClassLoader()     // Catch: java.lang.Exception -> L6b
                r5.setExtrasClassLoader(r0)     // Catch: java.lang.Exception -> L6b
                r6.onStartCommand(r5, r3, r8)     // Catch: java.lang.Exception -> L6b
                r7.writeInt(r3)     // Catch: java.lang.Exception -> L6b
                return r2
            L6b:
                r5 = move-exception
                com.alipay.mobile.common.logging.api.trace.TraceLogger r6 = com.alipay.mobile.common.logging.api.LoggerFactory.getTraceLogger()
                java.lang.String r8 = "OreoServiceUnlimited"
                r6.error(r8, r5)
                r6 = -2
                r7.writeInt(r6)
                java.lang.String r5 = r5.getMessage()
                r7.writeString(r5)
                return r2
            L81:
                android.os.IBinder r0 = r4.f6190a
                if (r0 == 0) goto L8a
                boolean r5 = r0.transact(r5, r6, r7, r8)
                return r5
            L8a:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.tianyan.mobilesdk.coco.OreoServiceUnlimited.WrappedBinder.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class StartServiceServiceConnection implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Context> f6189a;
        private Intent b;
        private String c;

        public StartServiceServiceConnection(Context context, Intent intent, String str) {
            this.f6189a = new WeakReference<>(context);
            this.b = intent;
            this.c = str;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            Context context = this.f6189a.get();
            if (context == null) {
                return;
            }
            try {
                if (this.b == null) {
                    try {
                        context.unbindService(this);
                        return;
                    } catch (Throwable th) {
                        LoggerFactory.getTraceLogger().error(OreoServiceUnlimited.TAG, th);
                        return;
                    }
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                obtain.writeInterfaceToken(OreoServiceUnlimited.DESCRIPTOR_START_SERVICE);
                this.b.writeToParcel(obtain, 0);
                iBinder.transact(OreoServiceUnlimited.CODE_START_SERVICE, obtain, obtain2, 0);
                obtain2.readException();
                int readInt = obtain2.readInt();
                if (readInt < 0) {
                    String readString = obtain2.readString();
                    TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                    traceLogger.error(OreoServiceUnlimited.TAG, "Call Oreo startService error, code: " + readInt + ", error: " + readString);
                }
                OreoServiceUnlimitedTracker.trackAfterCall(this.c);
                obtain.recycle();
                obtain2.recycle();
                try {
                    context.unbindService(this);
                } catch (Throwable th2) {
                    LoggerFactory.getTraceLogger().error(OreoServiceUnlimited.TAG, th2);
                }
            } catch (Throwable th3) {
                try {
                    LoggerFactory.getTraceLogger().error(OreoServiceUnlimited.TAG, th3);
                    try {
                        context.unbindService(this);
                    } catch (Throwable th4) {
                        LoggerFactory.getTraceLogger().error(OreoServiceUnlimited.TAG, th4);
                    }
                } catch (Throwable th5) {
                    try {
                        context.unbindService(this);
                    } catch (Throwable th6) {
                        LoggerFactory.getTraceLogger().error(OreoServiceUnlimited.TAG, th6);
                    }
                    throw th5;
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            try {
                Context context = this.f6189a.get();
                if (context == null) {
                    return;
                }
                context.unbindService(this);
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error(OreoServiceUnlimited.TAG, th);
            }
        }
    }

    public static ComponentName startService(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentName) ipChange.ipc$dispatch("c167cc2a", new Object[]{context, intent});
        }
        if (intent == null) {
            return null;
        }
        try {
            if (!shouldUseIt(context)) {
                return context.startService(intent);
            }
            ComponentName a2 = a(context, intent);
            if (a2 != null) {
                LoggerFactory.getTraceLogger().info(TAG, "Start service in foreground");
                return a2;
            }
            Context applicationContext = context.getApplicationContext();
            ResolveInfo resolveService = applicationContext.getPackageManager().resolveService(intent, 0);
            if (resolveService == null) {
                LoggerFactory.getTraceLogger().error(TAG, "Can't find target service");
                return null;
            } else if (!TextUtils.equals(resolveService.serviceInfo.packageName, applicationContext.getPackageName())) {
                LoggerFactory.getTraceLogger().error(TAG, "Can't support outer package");
                return null;
            } else if (!IOreoServiceUnlimited.class.isAssignableFrom(Class.forName(resolveService.serviceInfo.name))) {
                LoggerFactory.getTraceLogger().error(TAG, "Target service not implement IOreoServiceUnlimited");
                return null;
            } else {
                if (!f6188a) {
                    f6188a = true;
                    if ("true".equals(TianyanLoggingStatus.getConfigValueByKey(KEY_MONITOR_TRACE_OREO_UNLIMITED_SERVICE, null))) {
                        OreoServiceUnlimitedTracker.startTrack();
                        LoggerFactory.getTraceLogger().info(TAG, "Start log track");
                    } else {
                        LoggerFactory.getTraceLogger().info(TAG, "Disable log track");
                    }
                }
                String str = LoggerFactory.getProcessInfo().getProcessId() + ":" + UUID.randomUUID().toString();
                applicationContext.bindService(intent, new StartServiceServiceConnection(applicationContext, intent, str), 1);
                OreoServiceUnlimitedTracker.trackBeforeCall(str);
                return new ComponentName(resolveService.serviceInfo.packageName, resolveService.serviceInfo.name);
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error(TAG, "Fail to startService, intent: " + intent + ", error: " + th.getMessage());
            return null;
        }
    }

    private static ComponentName a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentName) ipChange.ipc$dispatch("74d7a0fc", new Object[]{context, intent});
        }
        try {
            if (!TianyanLoggingStatus.isMonitorBackground()) {
                return context.startService(intent);
            }
            return null;
        } catch (Throwable th) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error(TAG, "Start service in foreground error, msg: " + th.getMessage());
            return null;
        }
    }

    public static boolean shouldUseIt(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6081ea66", new Object[]{context})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                if (context.getApplicationInfo().targetSdkVersion >= 26) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
