package com.taobao.desktop.widget.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.manager.g;
import tb.kge;
import tb.kif;

/* loaded from: classes7.dex */
public class DesktopMainService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_WIDGET_PROCESS_DATA_SYNC = 1;

    static {
        kge.a(-1762063521);
    }

    public static /* synthetic */ Object ipc$super(DesktopMainService desktopMainService, String str, Object... objArr) {
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

    public static /* synthetic */ void a(Context context, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("945725b3", new Object[]{context, message});
        } else {
            b(context, message);
        }
    }

    /* loaded from: classes7.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Context f16996a;

        static {
            kge.a(730063740);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(Context context) {
            this.f16996a = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 1) {
                DesktopMainService.a(this.f16996a, message);
            } else {
                super.handleMessage(message);
            }
        }
    }

    private static void b(Context context, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8600cbd2", new Object[]{context, message});
            return;
        }
        try {
            kif.b(message.what + " receiver msg from widget process：" + message.getData());
            Bundle data = message.getData();
            if (data == null || data.get("widget_data") == null) {
                return;
            }
            g.a(context).a(data.getString("widget_data"));
        } catch (Throwable th) {
            kif.b("receiver msg from widget process error" + th.getMessage());
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        kif.a("DesktopMainService onBind");
        return new Messenger(new a(this)).getBinder();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
        }
        kif.a("DesktopMainService onUnbind");
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        kif.a("DesktopMainService onDestroy");
        super.onDestroy();
    }
}
