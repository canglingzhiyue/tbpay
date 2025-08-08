package mtopsdk.common.util;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import tb.kge;

/* loaded from: classes.dex */
public abstract class AsyncServiceBinder<T extends IInterface> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "mtopsdk.AsyncServiceBinder";
    public Class<? extends IInterface> interfaceCls;
    public String interfaceName;
    public Class<? extends Service> serviceCls;
    public volatile T service = null;
    public final byte[] lock = new byte[0];
    public volatile boolean mBindFailed = false;
    public volatile boolean mBinding = false;
    private ServiceConnection conn = new ServiceConnection() { // from class: mtopsdk.common.util.AsyncServiceBinder.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            synchronized (AsyncServiceBinder.this.lock) {
                try {
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                        if (StringUtils.isEmpty(AsyncServiceBinder.this.interfaceName)) {
                            AsyncServiceBinder.this.interfaceName = AsyncServiceBinder.this.interfaceCls.getSimpleName();
                        }
                        TBSdkLog.w(AsyncServiceBinder.TAG, "[onServiceDisconnected] Service disconnected called,interfaceName=" + AsyncServiceBinder.this.interfaceName);
                    }
                } catch (Exception unused) {
                }
                AsyncServiceBinder.this.service = null;
                AsyncServiceBinder.this.mBinding = false;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Class<?>[] declaredClasses;
            synchronized (AsyncServiceBinder.this.lock) {
                try {
                    if (StringUtils.isEmpty(AsyncServiceBinder.this.interfaceName)) {
                        AsyncServiceBinder.this.interfaceName = AsyncServiceBinder.this.interfaceCls.getSimpleName();
                    }
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.i(AsyncServiceBinder.TAG, "[onServiceConnected] Service connected called. interfaceName =" + AsyncServiceBinder.this.interfaceName);
                    }
                    for (Class<?> cls : AsyncServiceBinder.this.interfaceCls.getDeclaredClasses()) {
                        if (cls.getSimpleName().equals("Stub")) {
                            AsyncServiceBinder.this.service = (T) cls.getDeclaredMethod("asInterface", IBinder.class).invoke(cls, iBinder);
                        }
                    }
                } catch (Exception unused) {
                    AsyncServiceBinder.this.mBindFailed = true;
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                        TBSdkLog.w(AsyncServiceBinder.TAG, "[onServiceConnected] Service bind failed. mBindFailed=" + AsyncServiceBinder.this.mBindFailed + ",interfaceName=" + AsyncServiceBinder.this.interfaceName);
                    }
                }
                if (AsyncServiceBinder.this.service != null) {
                    AsyncServiceBinder.this.mBindFailed = false;
                    AsyncServiceBinder.this.afterAsyncBind();
                }
                AsyncServiceBinder.this.mBinding = false;
            }
        }
    };

    static {
        kge.a(-337928439);
    }

    public abstract void afterAsyncBind();

    public AsyncServiceBinder(Class<? extends IInterface> cls, Class<? extends Service> cls2) {
        this.interfaceCls = cls;
        this.serviceCls = cls2;
    }

    public void asyncBind(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64905ae8", new Object[]{this, context});
        } else if (this.service != null || context == null || this.mBindFailed || this.mBinding) {
        } else {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, "[asyncBind] mContext=" + context + ",mBindFailed= " + this.mBindFailed + ",mBinding=" + this.mBinding);
            }
            this.mBinding = true;
            try {
                if (StringUtils.isEmpty(this.interfaceName)) {
                    this.interfaceName = this.interfaceCls.getSimpleName();
                }
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i(TAG, "[asyncBind]try to bind service for " + this.interfaceName);
                }
                Intent intent = new Intent(context.getApplicationContext(), this.serviceCls);
                intent.setAction(this.interfaceCls.getName());
                intent.setPackage(context.getPackageName());
                intent.addCategory("android.intent.category.DEFAULT");
                boolean bindService = context.bindService(intent, this.conn, 1);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i(TAG, "[asyncBind]use intent bind service ret=" + bindService + " for interfaceName=" + this.interfaceName);
                }
                this.mBindFailed = !bindService;
            } catch (Throwable th) {
                this.mBindFailed = true;
                TBSdkLog.e(TAG, "[asyncBind] use intent bind service failed. mBindFailed=" + this.mBindFailed + ",interfaceName = " + this.interfaceName, th);
            }
            if (!this.mBindFailed) {
                return;
            }
            this.mBinding = false;
        }
    }

    public T getService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("accdadbc", new Object[]{this}) : this.service;
    }
}
