package com.taobao.accs.data;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.utl.ALog;
import com.taobao.android.launcher.bootstrap.tao.f;
import tb.jyx;
import tb.kge;

/* loaded from: classes.dex */
public class MsgDistributeService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f8226a;
    private Messenger b;

    public static /* synthetic */ Object ipc$super(MsgDistributeService msgDistributeService, String str, Object... objArr) {
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

    public MsgDistributeService() {
        f.a("null", com.taobao.accs.utl.c.msgService);
    }

    static {
        kge.a(1858623662);
        f8226a = false;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        if (this.b == null) {
            this.b = new Messenger(new Handler() { // from class: com.taobao.accs.data.MsgDistributeService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.Handler
                public void handleMessage(android.os.Message message) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                    } else if (message == null) {
                    } else {
                        ALog.i("MsgDistributeService", "handleMessage on receive msg", "msg", message.toString());
                        Intent intent2 = (Intent) message.getData().getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                        if (intent2 == null) {
                            return;
                        }
                        ALog.i("MsgDistributeService", "handleMessage get intent success", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent2.toString());
                        MsgDistributeService.this.onStartCommand(intent2, 0, 0);
                    }
                }
            });
        }
        return this.b.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        try {
            ALog.e("MsgDistributeService", "onStartCommand", "action", intent.getAction());
            String action = intent.getAction();
            if (Constants.ACTION_SEND.equals(action)) {
                com.taobao.accs.common.a.a().execute(new Runnable() { // from class: com.taobao.accs.data.MsgDistributeService.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ALog.i("MsgDistributeService", "onStartCommand send message", new Object[0]);
                        ACCSManager.AccsRequest accsRequest = (ACCSManager.AccsRequest) intent.getSerializableExtra(Constants.KEY_SEND_REQDATA);
                        String stringExtra = intent.getStringExtra("packageName");
                        String stringExtra2 = intent.getStringExtra("appKey");
                        String stringExtra3 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
                        if (TextUtils.isEmpty(stringExtra3)) {
                            stringExtra3 = stringExtra2;
                        }
                        ACCSManager.getAccsInstance(GlobalClientInfo.getContext(), stringExtra2, stringExtra3).sendRequest(GlobalClientInfo.getContext(), accsRequest, stringExtra, false);
                    }
                });
            } else if (Constants.ACTION_SENDMESSAGE_INMAIN.equals(action)) {
                com.taobao.accs.common.a.a().execute(new Runnable() { // from class: com.taobao.accs.data.MsgDistributeService.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            ConnectionServiceManager.getInstance().getConnectionWrapper(intent.getStringExtra("tag")).send((Message) intent.getSerializableExtra("m"), intent.getBooleanExtra(com.taobao.android.msoa.c.TAG, true));
                        } catch (Throwable th) {
                            ALog.e("MsgDistributeService", "exception in send", th, new Object[0]);
                        }
                    }
                });
            } else if (Constants.ACTION_CHANNEL_CONNECTION_CHANGED.equals(action)) {
                com.taobao.accs.common.a.a().execute(new Runnable() { // from class: com.taobao.accs.data.MsgDistributeService.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        boolean booleanExtra = intent.getBooleanExtra(com.taobao.android.msoa.c.TAG, false);
                        ALog.e("MsgDistributeService", "ACTION_CHANNEL_CONNECTION_CHANGED", jyx.a.POINT_NAME, Boolean.valueOf(booleanExtra));
                        ConnectionServiceManager.getInstance().onChannelConnectionChanged(booleanExtra);
                    }
                });
            } else {
                ALog.i("MsgDistributeService", "onStartCommand distribute message", new Object[0]);
                intent.setFlags(0);
                c.a(GlobalClientInfo.getContext(), intent);
            }
        } catch (Throwable th) {
            ALog.e("MsgDistributeService", "onStartCommand", th, new Object[0]);
        }
        return 2;
    }
}
