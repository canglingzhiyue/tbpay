package org.android.agoo.control;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.common.a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.c;
import com.taobao.aranger.constant.Constants;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.honor.HonorRegister;
import org.android.agoo.intent.IntentUtil;
import org.android.agoo.message.MessageService;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public abstract class BaseIntentService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BaseIntentService";
    private static boolean isBinded = false;
    private static final String msgStatus = "4";
    private AgooFactory agooFactory;
    private MessageService messageService;
    private NotifManager notifyManager;
    private Context mContext = null;
    private Messenger messenger = new Messenger(new Handler() { // from class: org.android.agoo.control.BaseIntentService.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message == null) {
            } else {
                ALog.i(BaseIntentService.TAG, "handleMessage on receive msg", "msg", message.toString());
                final Intent intent = (Intent) message.getData().getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                if (intent == null) {
                    return;
                }
                ALog.i(BaseIntentService.TAG, "handleMessage get intent success", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent.toString());
                a.a(new Runnable() { // from class: org.android.agoo.control.BaseIntentService.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            BaseIntentService.this.onHandleIntent(intent);
                        }
                    }
                });
            }
        }
    });

    public static /* synthetic */ Object ipc$super(BaseIntentService baseIntentService, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void onError(Context context, String str);

    public abstract void onMessage(Context context, Intent intent);

    public abstract void onRegistered(Context context, String str);

    public void onUserCommand(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba4ecadd", new Object[]{this, context, intent});
        }
    }

    public static /* synthetic */ NotifManager access$000(BaseIntentService baseIntentService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NotifManager) ipChange.ipc$dispatch("d14cdf72", new Object[]{baseIntentService}) : baseIntentService.notifyManager;
    }

    public static /* synthetic */ NotifManager access$002(BaseIntentService baseIntentService, NotifManager notifManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotifManager) ipChange.ipc$dispatch("8c276e28", new Object[]{baseIntentService, notifManager});
        }
        baseIntentService.notifyManager = notifManager;
        return notifManager;
    }

    public static /* synthetic */ MessageService access$100(BaseIntentService baseIntentService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MessageService) ipChange.ipc$dispatch("ceccd5ac", new Object[]{baseIntentService}) : baseIntentService.messageService;
    }

    public static /* synthetic */ MessageService access$102(BaseIntentService baseIntentService, MessageService messageService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageService) ipChange.ipc$dispatch("7a00b79", new Object[]{baseIntentService, messageService});
        }
        baseIntentService.messageService = messageService;
        return messageService;
    }

    public static /* synthetic */ AgooFactory access$200(BaseIntentService baseIntentService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AgooFactory) ipChange.ipc$dispatch("d7e14061", new Object[]{baseIntentService}) : baseIntentService.agooFactory;
    }

    public static /* synthetic */ AgooFactory access$202(BaseIntentService baseIntentService, AgooFactory agooFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AgooFactory) ipChange.ipc$dispatch("f0e2c144", new Object[]{baseIntentService, agooFactory});
        }
        baseIntentService.agooFactory = agooFactory;
        return agooFactory;
    }

    static {
        kge.a(-1665573448);
        isBinded = false;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        if (!isBinded) {
            isBinded = true;
            if (!com.taobao.accs.utl.a.a(Constants.INTENT_KEY_SERVICE)) {
                getApplicationContext().bindService(new Intent(getApplication(), getClass()), new ServiceConnection() { // from class: org.android.agoo.control.BaseIntentService.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.ServiceConnection
                    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                        }
                    }

                    @Override // android.content.ServiceConnection
                    public void onServiceDisconnected(ComponentName componentName) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                        }
                    }
                }, 1);
            }
        }
        return this.messenger.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        a.a(new Runnable() { // from class: org.android.agoo.control.BaseIntentService.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                com.taobao.accs.client.a.g.incrementAndGet();
                BaseIntentService.access$002(BaseIntentService.this, new NotifManager());
                BaseIntentService.access$000(BaseIntentService.this).init(BaseIntentService.this.getApplicationContext());
                BaseIntentService.access$102(BaseIntentService.this, new MessageService());
                BaseIntentService.access$100(BaseIntentService.this).init(BaseIntentService.this.getApplicationContext());
                BaseIntentService.access$202(BaseIntentService.this, new AgooFactory());
                BaseIntentService.access$200(BaseIntentService.this).init(BaseIntentService.this.getApplicationContext(), BaseIntentService.access$000(BaseIntentService.this), BaseIntentService.access$100(BaseIntentService.this));
            }
        });
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        a.a(new Runnable() { // from class: org.android.agoo.control.BaseIntentService.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    BaseIntentService.this.onHandleIntent(intent);
                }
            }
        });
        return 2;
    }

    public void onHandleIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1253e327", new Object[]{this, intent});
            return;
        }
        this.mContext = getApplicationContext();
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        String agooCommand = IntentUtil.getAgooCommand(this.mContext);
        String thirdPushCommand = IntentUtil.getThirdPushCommand(this.mContext);
        ALog.i(TAG, "onHandleIntent,action=" + action + ",agooCommand=" + agooCommand + ",mipushCommand=" + thirdPushCommand, new Object[0]);
        try {
            if (TextUtils.equals(action, agooCommand)) {
                String stringExtra = intent.getStringExtra("command");
                ALog.d(TAG, "actionCommand --->[" + stringExtra + riy.ARRAY_END_STR, new Object[0]);
                if (TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_READED) || TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_DELETED)) {
                    onUserCommand(this.mContext, intent);
                }
            } else if (TextUtils.equals(action, thirdPushCommand)) {
                String stringExtra2 = intent.getStringExtra("command");
                String stringExtra3 = intent.getStringExtra(AgooConstants.THIRD_PUSH_ID);
                if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_MIPUSHID_REPORT)) {
                    this.notifyManager.reportThirdPushToken(stringExtra3, "MI_TOKEN", false);
                } else if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_HUAWEIPUSHID_REPORT)) {
                    ALog.d(TAG, "HW_TOKEN report begin..regid=" + stringExtra3, new Object[0]);
                    this.notifyManager.reportThirdPushToken(stringExtra3, "HW_TOKEN", false);
                } else if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_GCMIPUSHID_REPORT)) {
                    ALog.i(TAG, "GCM_TOKEN report begin..regid=" + stringExtra3, new Object[0]);
                    this.notifyManager.reportThirdPushToken(stringExtra3, "gcm", false);
                } else if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_HONORPUSHID_REPORT)) {
                    ALog.i(TAG, "HONOR_TOKEN report begin..regid=" + stringExtra3, new Object[0]);
                    this.notifyManager.reportThirdPushToken(stringExtra3, HonorRegister.HONOR_TOKEN, false);
                }
            } else if (action.equals(AgooConstants.INTENT_FROM_AGOO_MESSAGE)) {
                handleRemoteMessage(this.mContext, intent);
            } else if (TextUtils.equals(action, AgooConstants.INTENT_FROM_AGOO_REPORT) || TextUtils.equals(action, "android.net.conn.CONNECTIVITY_CHANGE") || TextUtils.equals(action, "android.intent.action.USER_PRESENT") || TextUtils.equals(action, "android.intent.action.ACTION_POWER_CONNECTED") || TextUtils.equals(action, "android.intent.action.ACTION_POWER_DISCONNECTED")) {
                ALog.i(TAG, "is report cache msg,Config.isReportCacheMsg(mContext)=" + Config.isReportCacheMsg(this.mContext), new Object[0]);
                if (Config.isReportCacheMsg(this.mContext) && c.e(this.mContext)) {
                    Config.clearReportTimes(this.mContext);
                    this.agooFactory.reportCacheMsg();
                    this.messageService.deleteCacheMessage();
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.i(TAG, "is clear all msg=" + Config.isClearTime(this.mContext, currentTimeMillis), new Object[0]);
                }
                if (Config.isClearTime(this.mContext, currentTimeMillis)) {
                    Config.setClearTimes(this.mContext, currentTimeMillis);
                    this.messageService.deleteCacheMessage();
                }
            }
        } catch (Throwable th) {
            try {
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.e(TAG, "onHandleIntent deal error", th, new Object[0]);
                }
            } finally {
                com.taobao.accs.client.a.g.incrementAndGet();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:29:0x00b7
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:82)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private final void handleRemoteMessage(android.content.Context r28, android.content.Intent r29) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.control.BaseIntentService.handleRemoteMessage(android.content.Context, android.content.Intent):void");
    }

    private final String getTrace(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c2509ce", new Object[]{this, context, new Long(j)});
        }
        String str = null;
        String str2 = TextUtils.isEmpty(null) ? "unknow" : null;
        if (TextUtils.isEmpty(null)) {
            str = "unknow";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("appkey");
        stringBuffer.append("|");
        stringBuffer.append(j);
        stringBuffer.append("|");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("|");
        stringBuffer.append(str2);
        stringBuffer.append("|");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public static final void runIntentInService(Context context, Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9992cf7f", new Object[]{context, intent, str});
            return;
        }
        try {
            intent.setClassName(context, str);
            context.startService(intent);
        } catch (Throwable th) {
            ALog.w(TAG, "runIntentInService", th, new Object[0]);
        }
    }
}
