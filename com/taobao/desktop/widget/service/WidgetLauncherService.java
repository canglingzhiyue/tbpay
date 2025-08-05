package com.taobao.desktop.widget.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.manager.g;
import com.taobao.desktop.widget.manager.i;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.monitor.a;
import java.util.Map;
import tb.kge;
import tb.khn;
import tb.khp;
import tb.khw;
import tb.kif;

/* loaded from: classes7.dex */
public class WidgetLauncherService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_MAIN_PROCESS = 1;
    public static final int MSG_MAIN_WIDGET_DATA_SYNC = 2;
    public static final int MSG_WIDGET_PROCESS_REPLY = 3;

    static {
        kge.a(704987474);
    }

    public static /* synthetic */ Object ipc$super(WidgetLauncherService widgetLauncherService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 1256323805) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.onUnbind((Intent) objArr[0]));
        }
    }

    public static /* synthetic */ void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            b(context);
        }
    }

    public static /* synthetic */ void a(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f53e474", new Object[]{context, bundle});
        } else {
            b(context, bundle);
        }
    }

    /* loaded from: classes7.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Context f16997a;

        static {
            kge.a(1547825641);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(Context context) {
            this.f16997a = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1) {
                try {
                    kif.b("MSG_MAIN_PROCESS receiver msg from main process " + message.getData());
                    if (message.getData() != null) {
                        WidgetLauncherService.a(this.f16997a, message.getData());
                    }
                    WidgetLauncherService.a(this.f16997a);
                } catch (Throwable th) {
                    kif.b("receiver msg from main process error" + th.getMessage());
                }
            } else if (i == 2) {
                try {
                    kif.b("MSG_MAIN_WIDGET_DATA_SYNC receiver msg from main process " + message.getData());
                    if (message.getData() == null) {
                        return;
                    }
                    WidgetLauncherService.a(this.f16997a, message.getData());
                } catch (Throwable th2) {
                    kif.b("receiver msg from main process error" + th2.getMessage());
                }
            } else {
                if (i == 3) {
                    try {
                        kif.b("MSG_MAIN_REPLY receiver msg from main process " + message.getData());
                        Bundle data = message.getData();
                        if (data.getString("widget_id") != null && data.getString("widget_type_id") != null) {
                            String string = data.getString("widget_id");
                            String string2 = data.getString("widget_type_id");
                            if (g.a(this.f16997a).c(string, string2)) {
                                Messenger messenger = message.replyTo;
                                Message obtain = Message.obtain((Handler) null, 3);
                                Bundle bundle = new Bundle();
                                bundle.putString("result", "success");
                                obtain.setData(bundle);
                                messenger.send(obtain);
                            }
                            com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_STATE, new a.C0652a().a(string2).d("widget_state_default_receive"));
                        }
                        return;
                    } catch (Throwable th3) {
                        kif.a("MSG_MAIN_REPLY receiver msg from main process error" + th3.getMessage());
                    }
                }
                super.handleMessage(message);
            }
        }
    }

    private static void b(Context context, Bundle bundle) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9edd7e75", new Object[]{context, bundle});
            return;
        }
        if (bundle.getString("login_uid") != null) {
            String string = bundle.getString("login_uid");
            kif.b("receiver msg from main process uid: " + string);
            khn.a(context).c(string);
        }
        if (bundle.getString("login_encrypt_uid") != null) {
            String string2 = bundle.getString("login_encrypt_uid");
            kif.b("receiver msg from main process eUid: " + string2);
            khn.a(context).d(string2);
        }
        if (bundle.getString("process_share_orange") != null && (map = (Map) JSON.parseObject(bundle.getString("process_share_orange"), new TypeReference<Map<String, String>>() { // from class: com.taobao.desktop.widget.service.WidgetLauncherService.1
        }, new Feature[0])) != null) {
            kif.b("receiver msg from main process orange: " + map);
            khw.a(context).a(khp.SP_ORANGE_MANUFACTURER_REACH, map);
        }
        if (bundle.get("mockSet") != null) {
            String string3 = bundle.getString("mockSet");
            kif.b("receiver msg from main process mock data: " + string3);
            khn.a(context).b(string3);
        }
        if (bundle.get("widget_data") == null) {
            return;
        }
        String string4 = bundle.getString("widget_data");
        kif.b("receiver msg from main process widget data: " + string4);
        g.a(context).b(string4);
    }

    private static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            i.a(context).a(true);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        kif.a("WidgetLauncherService onBind");
        return new Messenger(new a(this)).getBinder();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
        }
        kif.a("WidgetLauncherService onUnbind");
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        kif.a("WidgetLauncherService onDestroy");
        super.onDestroy();
    }
}
