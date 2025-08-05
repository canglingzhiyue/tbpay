package com.taobao.accs.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.a;
import com.taobao.accs.connection.d;
import com.taobao.accs.data.Message;
import com.taobao.accs.net.e;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import org.android.agoo.service.IMessageService;
import tb.kge;
import tb.mto;
import tb.orq;

/* loaded from: classes.dex */
public class ServiceImpl extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ServiceImpl";
    private Service mBaseService;
    private Context mContext;
    private String mLastNetWorkType;
    private final IMessageService.Stub messageServiceBinder;
    private long startTime;

    static {
        kge.a(-1192859379);
    }

    private void initUt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b970d6", new Object[]{this});
        }
    }

    public static /* synthetic */ Object ipc$super(ServiceImpl serviceImpl, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 413640386) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate();
            return null;
        }
    }

    private final void onPingIpp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0df3da9", new Object[]{this, context});
        }
    }

    @Override // com.taobao.accs.connection.d, com.taobao.accs.base.IBaseService
    public boolean onUnbind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ Context access$000(ServiceImpl serviceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("8b781b71", new Object[]{serviceImpl}) : serviceImpl.mContext;
    }

    public ServiceImpl(Service service) {
        super(service);
        this.mBaseService = null;
        this.mLastNetWorkType = "unknown";
        this.messageServiceBinder = new IMessageService.Stub() { // from class: com.taobao.accs.internal.ServiceImpl.1
            @Override // org.android.agoo.service.IMessageService
            public boolean ping() throws RemoteException {
                return true;
            }

            @Override // org.android.agoo.service.IMessageService
            public void probe() throws RemoteException {
                ALog.d(ServiceImpl.TAG, "ReceiverImpl probeTaoBao begin......messageServiceBinder [probe]", new Object[0]);
                a.a(new Runnable() { // from class: com.taobao.accs.internal.ServiceImpl.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (ServiceImpl.access$000(ServiceImpl.this) == null || !UtilityImpl.getServiceEnabled(ServiceImpl.access$000(ServiceImpl.this))) {
                                Process.killProcess(Process.myPid());
                            } else {
                                Intent intent = new Intent();
                                intent.setAction("org.agoo.android.intent.action.PING_V4");
                                intent.setClassName(ServiceImpl.access$000(ServiceImpl.this).getPackageName(), c.channelService);
                                ServiceImpl.access$000(ServiceImpl.this).startService(intent);
                                ALog.d(ServiceImpl.TAG, "ReceiverImpl probeTaoBao........mContext.startService(intent) [probe][successfully]", new Object[0]);
                            }
                            ALog.d(ServiceImpl.TAG, "ReceiverImpl probeTaoBao........messageServiceBinder [probe][end]", new Object[0]);
                        } catch (Throwable th) {
                            ALog.d(ServiceImpl.TAG, "ReceiverImpl probeTaoBao error........e=" + th, new Object[0]);
                        }
                    }
                });
            }
        };
        this.mBaseService = service;
        this.mContext = service.getApplicationContext();
    }

    @Override // com.taobao.accs.connection.d, com.taobao.accs.base.IBaseService
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        init();
    }

    @Override // com.taobao.accs.connection.d
    public int onHostStartCommand(Intent intent, int i, int i2) {
        String action;
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0ac7ce7", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(TAG, "onHostStartCommand", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent);
        }
        try {
            if (ALog.isPrintLog(ALog.Level.D) && intent != null && (extras = intent.getExtras()) != null) {
                for (String str : extras.keySet()) {
                    ALog.d(TAG, "onHostStartCommand", "key", str, " value", extras.get(str));
                }
            }
            action = intent == null ? null : intent.getAction();
        } finally {
            try {
                return 1;
            } finally {
            }
        }
        if (TextUtils.isEmpty(action)) {
            tryConnect();
            pingOnAllConns(false, false);
            return 1;
        }
        handleAction(intent, action);
        return 1;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ALog.d(TAG, "init start", new Object[0]);
        GlobalClientInfo.getInstance(this.mContext);
        com.taobao.accs.client.a.g.incrementAndGet();
        this.startTime = System.currentTimeMillis();
        this.mLastNetWorkType = UtilityImpl.getNetworkTypeExt(this.mContext);
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(TAG, "init", "sdkVersion", Integer.valueOf(Constants.SDK_VERSION_CODE), "procStart", Integer.valueOf(com.taobao.accs.client.a.g.intValue()));
        }
        initUt();
        onPingIpp(this.mContext);
        long serviceAliveTime = UtilityImpl.getServiceAliveTime(this.mContext);
        ALog.d(TAG, "getServiceAliveTime", "aliveTime", Long.valueOf(serviceAliveTime));
        if (serviceAliveTime > orq.FRAME_CHECK_TIMEOUT) {
            com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_SERVICE_ALIVE, "", serviceAliveTime / 1000);
        }
        UtilityImpl.setServiceTime(this.mContext, Constants.SP_KEY_SERVICE_START, System.currentTimeMillis());
    }

    private void handleAction(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252ff60c", new Object[]{this, intent, str});
            return;
        }
        ALog.d(TAG, "handleAction", "action", str);
        try {
            if ("org.agoo.android.intent.action.PING_V4".equals(str)) {
                String stringExtra = intent.getStringExtra("source");
                ALog.i(TAG, "org.agoo.android.intent.action.PING_V4,start channel by brothers", "serviceStart", Integer.valueOf(com.taobao.accs.client.a.g.intValue()), "source" + stringExtra);
                com.taobao.accs.utl.d.a("accs", "startChannel", stringExtra, mto.a.GEO_NOT_SUPPORT);
                if (com.taobao.accs.client.a.a()) {
                    com.taobao.accs.utl.d.a("accs", "createChannel", stringExtra, mto.a.GEO_NOT_SUPPORT);
                }
            }
            if (Constants.ACTION_CLOSE_CONNECTION.equals(str)) {
                com.taobao.accs.net.c connection = getConnection(this.mContext, intent.getStringExtra(Constants.KEY_CONFIG_TAG), false, -1);
                if (connection instanceof e) {
                    ((e) connection).v();
                }
            } else {
                tryConnect();
            }
            if (TextUtils.equals(str, "android.net.conn.CONNECTIVITY_CHANGE")) {
                String networkTypeExt = UtilityImpl.getNetworkTypeExt(this.mContext);
                boolean isNetworkConnected = UtilityImpl.isNetworkConnected(this.mContext);
                String str2 = "network change:" + this.mLastNetWorkType + " to " + networkTypeExt;
                ALog.i(TAG, str2, new Object[0]);
                if (isNetworkConnected) {
                    this.mLastNetWorkType = networkTypeExt;
                    notifyNetChangeOnAllConns(str2);
                    pingOnAllConns(true, false);
                }
                if (!networkTypeExt.equals("unknown")) {
                    return;
                }
                notifyNetChangeOnAllConns(str2);
                this.mLastNetWorkType = networkTypeExt;
            } else if (TextUtils.equals(str, "android.intent.action.USER_PRESENT")) {
                ALog.d(TAG, "action android.intent.action.USER_PRESENT", new Object[0]);
                pingOnAllConns(true, false);
            } else if (str.equals(Constants.ACTION_COMMAND)) {
                handleCommand(intent);
            } else if (!str.equals(Constants.ACTION_START_FROM_AGOO)) {
            } else {
                ALog.i(TAG, "ACTION_START_FROM_AGOO", new Object[0]);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "handleAction", th, new Object[0]);
        }
    }

    private void handleCommand(Intent intent) {
        com.taobao.accs.net.c cVar;
        Message.ReqType reqType;
        URL url;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3516a0c7", new Object[]{this, intent});
            return;
        }
        int intExtra = intent.getIntExtra("command", -1);
        ALog.i(TAG, "handleCommand", "command", Integer.valueOf(intExtra));
        String stringExtra = intent.getStringExtra("packageName");
        String stringExtra2 = intent.getStringExtra("serviceId");
        String stringExtra3 = intent.getStringExtra("userInfo");
        String stringExtra4 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
        if (intExtra <= 0 || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        com.taobao.accs.net.c connection = getConnection(this.mContext, stringExtra4, true, intExtra);
        if (connection == null) {
            ALog.e(TAG, "no connection", Constants.KEY_CONFIG_TAG, stringExtra4, "command", Integer.valueOf(intExtra));
            return;
        }
        connection.c();
        Message message = null;
        if (intExtra == 100) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("data");
            String stringExtra5 = intent.getStringExtra("dataId");
            String stringExtra6 = intent.getStringExtra("target");
            String stringExtra7 = intent.getStringExtra("businessId");
            String stringExtra8 = intent.getStringExtra(Constants.KEY_EXT_TAG);
            try {
                reqType = (Message.ReqType) intent.getSerializableExtra(Constants.KEY_SEND_TYPE);
            } catch (Exception unused) {
                reqType = null;
            }
            if (byteArrayExtra != null) {
                try {
                    url = new URL(connection.c(null));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    url = null;
                }
                Message.ReqType reqType2 = reqType;
                cVar = connection;
                ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(stringExtra3, stringExtra2, byteArrayExtra, stringExtra5, stringExtra6, url, stringExtra7);
                accsRequest.setTag(stringExtra8);
                if (reqType2 == null) {
                    message = Message.buildSendData(cVar.c(null), stringExtra4, cVar.j.getStoreId(), this.mContext, stringExtra, accsRequest, false);
                } else if (reqType2 == Message.ReqType.REQ) {
                    message = Message.buildRequest(this.mContext, cVar.c(null), stringExtra4, cVar.j.getStoreId(), stringExtra, Constants.TARGET_SERVICE_PRE, accsRequest, false);
                }
            } else {
                cVar = connection;
            }
        } else {
            cVar = connection;
            if (intExtra == 106) {
                intent.setAction(Constants.ACTION_RECEIVE);
                intent.putExtra("command", -1);
                com.taobao.accs.data.c.a().b(this.mContext, intent);
                return;
            }
        }
        if (message != null) {
            ALog.d(TAG, "try send message", new Object[0]);
            if (message.getNetPermanceMonitor() != null) {
                message.getNetPermanceMonitor().onSend();
            }
            cVar.b(message, true);
            return;
        }
        ALog.e(TAG, "message is null", new Object[0]);
        cVar.b(Message.buildParameterError(stringExtra, intExtra), -2);
    }

    @Override // com.taobao.accs.connection.d, com.taobao.accs.base.IBaseService
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        String action = intent.getAction();
        ALog.d(TAG, "accs probeTaoBao begin......action=" + action, new Object[0]);
        if (TextUtils.isEmpty(action) || !TextUtils.equals(action, "org.agoo.android.intent.action.PING_V4")) {
            return null;
        }
        intent.getStringExtra("source");
        return this.messageServiceBinder;
    }

    @Override // com.taobao.accs.connection.d, com.taobao.accs.base.IBaseService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ALog.e(TAG, "Service onDestroy", new Object[0]);
        UtilityImpl.setServiceTime(this.mContext, Constants.SP_KEY_SERVICE_END, System.currentTimeMillis());
        this.mBaseService = null;
        this.mContext = null;
        shutdownAllConns();
        Process.killProcess(Process.myPid());
    }

    private void shouldStopSelf(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c369ce8c", new Object[]{this, new Boolean(z)});
            return;
        }
        ALog.e(TAG, "shouldStopSelf, kill:" + z, new Object[0]);
        Service service = this.mBaseService;
        if (service != null) {
            service.stopSelf();
        }
        if (!z) {
            return;
        }
        Process.killProcess(Process.myPid());
    }

    private synchronized void tryConnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe88bb6", new Object[]{this});
            return;
        }
        if (mConnections != null && mConnections.size() != 0) {
            for (Map.Entry<String, com.taobao.accs.net.c> entry : mConnections.entrySet()) {
                com.taobao.accs.net.c value = entry.getValue();
                if (value == null) {
                    ALog.e(TAG, "tryConnect connection null", "appkey", value.k());
                    return;
                }
                ALog.i(TAG, "tryConnect", "appkey", value.k(), Constants.KEY_CONFIG_TAG, entry.getKey());
                if (value.n() && TextUtils.isEmpty(value.j.getAppSecret())) {
                    ALog.e(TAG, "tryConnect secret is null", new Object[0]);
                } else {
                    value.c();
                }
            }
            return;
        }
        ALog.w(TAG, "tryConnect no connections", new Object[0]);
    }

    private void pingOnAllConns(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb077be", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (mConnections != null && mConnections.size() != 0) {
            for (Map.Entry<String, com.taobao.accs.net.c> entry : mConnections.entrySet()) {
                com.taobao.accs.net.c value = entry.getValue();
                value.a(z, z2);
                ALog.i(TAG, "ping connection", "appkey", value.k());
            }
        }
    }

    private void notifyNetChangeOnAllConns(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e872bfa", new Object[]{this, str});
        } else if (mConnections != null && mConnections.size() != 0) {
            for (Map.Entry<String, com.taobao.accs.net.c> entry : mConnections.entrySet()) {
                entry.getValue().a(str);
            }
        }
    }

    private void shutdownAllConns() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53d74a3", new Object[]{this});
        } else if (mConnections != null && mConnections.size() != 0) {
            for (Map.Entry<String, com.taobao.accs.net.c> entry : mConnections.entrySet()) {
                entry.getValue().h();
            }
        }
    }

    private String getVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a58234d", new Object[]{this, str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "null";
            }
            String str2 = this.mContext.getPackageManager().getPackageInfo(str, 0).versionName;
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(TAG, "getVersion###版本号为 : " + str2, new Object[0]);
            }
            return str2;
        } catch (Throwable unused) {
            return "null";
        }
    }

    public void startConnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ded2aaf", new Object[]{this});
            return;
        }
        ALog.i(TAG, "startConnect", new Object[0]);
        try {
            tryConnect();
            pingOnAllConns(false, false);
        } catch (Throwable th) {
            ALog.e(TAG, "tryConnect is error,e=" + th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.connection.d
    public void onVotedHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eae5f6a", new Object[]{this});
        } else {
            startConnect();
        }
    }
}
