package com.taobao.accs;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.state.StateMachine;
import com.taobao.accs.utl.ALog;
import tb.dcf;
import tb.dch;
import tb.dck;
import tb.kge;

/* loaded from: classes.dex */
public class AccsMainService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CHANNEL_STARTUP = "com.taobao.accs.main.action_channel_startup";
    public static final String className = "com.taobao.accs.AccsMainService";

    /* renamed from: a  reason: collision with root package name */
    private Messenger f8167a;

    static {
        kge.a(-598066720);
    }

    public static /* synthetic */ Object ipc$super(AccsMainService accsMainService, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-318254604);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message == null) {
            } else {
                try {
                    ALog.i("AccsMainService", "handleMessage on receive msg", "msg", message.toString());
                    AccsMainService.a((Intent) message.getData().getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK), GlobalClientInfo.getContext());
                } catch (Throwable th) {
                    ALog.e("AccsMainService", "handleMessage err", th, new Object[0]);
                }
            }
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        GlobalClientInfo.setContext(getApplicationContext());
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        if (this.f8167a == null) {
            this.f8167a = new Messenger(new a());
        }
        return this.f8167a.getBinder();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        a(intent, GlobalClientInfo.getContext());
        return 2;
    }

    public static void a(final Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7efd343", new Object[]{intent, context});
        } else {
            com.taobao.accs.common.a.a(new Runnable() { // from class: com.taobao.accs.AccsMainService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String str = "";
                        if (intent != null) {
                            str = intent.getAction();
                            if (!StringUtils.isEmpty(str)) {
                                ALog.e("AccsMainService", "onStartCommand", "action", str);
                                if (AccsMainService.ACTION_CHANNEL_STARTUP.equals(str)) {
                                    com.taobao.accs.connection.state.a.a().b((StateMachine.Event) intent.getSerializableExtra("event"));
                                    return;
                                } else if (!Constants.ACTION_RECEIVE.equals(str) || intent.getIntExtra("command", -1) != 101) {
                                    return;
                                } else {
                                    AccsMainService.a(intent);
                                    return;
                                }
                            }
                        }
                        ALog.e("AccsMainService", "onStartCommandImpl lost", "action", str);
                    } catch (Throwable th) {
                        ALog.e("AccsMainService", "onStartCommandImpl err", th, new Object[0]);
                    }
                }
            });
        }
    }

    public static void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{intent});
            return;
        }
        String stringExtra = intent.getStringExtra("serviceId");
        String stringExtra2 = intent.getStringExtra(Constants.KEY_STREAM_ID);
        int intExtra = intent.getIntExtra(Constants.KEY_STREAM_SEQ, 0);
        if (StringUtils.isEmpty(stringExtra2) || intExtra <= 0) {
            ALog.e("AccsMainService", "inputSyncMessage drop", "serviceId", stringExtra, "streamId", stringExtra2, dck.COL_SEQ, Integer.valueOf(intExtra));
            return;
        }
        dch dchVar = new dch(stringExtra, stringExtra2, intExtra);
        dchVar.a(intent);
        dcf.a().a(dchVar);
    }
}
