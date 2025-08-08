package com.taobao.accs.connection;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.IBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.SymbolExpUtil;
import tb.kge;

/* loaded from: classes.dex */
public abstract class d implements IBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ElectionServiceImpl";
    public static ConcurrentHashMap<String, com.taobao.accs.net.c> mConnections;
    private Service mBaseService;
    private Context mContext;

    @Override // com.taobao.accs.base.IBaseService
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    public abstract int onHostStartCommand(Intent intent, int i, int i2);

    @Override // com.taobao.accs.base.IBaseService
    public boolean onUnbind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
        }
        return false;
    }

    public abstract void onVotedHost();

    static {
        kge.a(-1320726955);
        kge.a(1453876815);
        mConnections = new ConcurrentHashMap<>(2);
    }

    public d(Service service) {
        this.mBaseService = null;
        this.mBaseService = service;
        this.mContext = service.getApplicationContext();
    }

    @Override // com.taobao.accs.base.IBaseService
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            ALog.i(TAG, "onCreate,", "sdkVersion", Integer.valueOf(Constants.SDK_VERSION_CODE));
        }
    }

    @Override // com.taobao.accs.base.IBaseService
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        ALog.i(TAG, "onStartCommand begin", "action", action);
        if (StringUtils.equals(action, Constants.ACTION_START_SERVICE)) {
            handleStartCommand(intent);
        }
        return onHostStartCommand(intent, i, i2);
    }

    @Override // com.taobao.accs.base.IBaseService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ALog.e(TAG, "Service onDestroy", new Object[0]);
        this.mContext = null;
        this.mBaseService = null;
    }

    private void handleStartCommand(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("965a95", new Object[]{this, intent});
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("packageName");
            String stringExtra2 = intent.getStringExtra("appKey");
            String stringExtra3 = intent.getStringExtra("ttid");
            String stringExtra4 = intent.getStringExtra("app_sercet");
            String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
            boolean booleanExtra = intent.getBooleanExtra("start", false);
            int intExtra = intent.getIntExtra("mode", 0);
            ALog.i(TAG, "handleStartCommand", Constants.KEY_CONFIG_TAG, stringExtra5, "appkey", stringExtra2, "appSecret", stringExtra4, "ttid", stringExtra3, "pkg", stringExtra);
            if (StringUtils.isEmpty(stringExtra) || StringUtils.isEmpty(stringExtra2) || !stringExtra.equals(this.mContext.getPackageName())) {
                return;
            }
            o.a(this.mContext, intExtra);
            com.taobao.accs.net.c connection = getConnection(this.mContext, stringExtra5, booleanExtra, -1);
            if (connection != null) {
                connection.f8266a = stringExtra3;
            } else {
                ALog.e(TAG, "handleStartCommand start action, no connection", Constants.KEY_CONFIG_TAG, stringExtra5);
            }
            UtilityImpl.saveAppKey(this.mContext, stringExtra2);
        } catch (Throwable th) {
            ALog.e(TAG, "handleStartCommand", th, new Object[0]);
        }
    }

    public static com.taobao.accs.net.c getConnection(Context context, String str, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.accs.net.c) ipChange.ipc$dispatch("9b5d9da7", new Object[]{context, str, new Boolean(z), new Integer(i), new Integer(i2)});
        }
        com.taobao.accs.net.c cVar = null;
        try {
        } catch (Throwable th) {
            ALog.e(TAG, "getConnection", th, new Object[0]);
        }
        if (StringUtils.isEmpty(str)) {
            ALog.e(TAG, "getConnection configTag null or env invalid", "conns.size", Integer.valueOf(mConnections.size()));
            if (mConnections.size() <= 0) {
                return null;
            }
            return mConnections.elements().nextElement();
        }
        ALog.i(TAG, "getConnection", Constants.KEY_CONFIG_TAG, str, "start", Boolean.valueOf(z));
        int b = o.b(context);
        String str2 = str + "|" + b;
        synchronized (d.class) {
            try {
                com.taobao.accs.net.c cVar2 = mConnections.get(str2);
                if (cVar2 == null) {
                    try {
                        ALog.e(TAG, "new app connection", "key", str2);
                        AccsClientConfig.mEnv = b;
                        cVar = new com.taobao.accs.net.e(context, 1, str, i2);
                        mConnections.put(str2, cVar);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    cVar = cVar2;
                }
                if (z) {
                    cVar.c();
                }
                return cVar;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static com.taobao.accs.net.c getConnection(Context context, String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.accs.net.c) ipChange.ipc$dispatch("92e1a5b0", new Object[]{context, str, new Boolean(z), new Integer(i)});
        }
        boolean isForeground = UtilityImpl.isForeground(context);
        if (isForeground && UtilityImpl.isChannelProcess(context) && !UtilityImpl.isMainProcessAlive(context)) {
            isForeground = false;
        }
        int i2 = isForeground ? 1 : 0;
        int i3 = isForeground ? 1 : 0;
        return getConnection(context, str, z, i, i2);
    }

    public static void removeConnection(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e029d5e9", new Object[]{context, str});
            return;
        }
        int b = o.b(context);
        mConnections.remove(str + "|" + b);
    }

    public static synchronized void resetAllConnections(Context context) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4044f3de", new Object[]{context});
                return;
            }
            try {
                HashSet hashSet = new HashSet();
                for (Map.Entry<String, com.taobao.accs.net.c> entry : mConnections.entrySet()) {
                    hashSet.add(entry.getKey().split(SymbolExpUtil.SYMBOL_VERTICALBAR)[0]);
                    entry.getValue().h();
                }
                mConnections.clear();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    getConnection(context, (String) it.next(), false, 0).c();
                }
            } catch (Exception e) {
                ALog.e(TAG, "resetAllConnections", e, new Object[0]);
            }
        }
    }
}
