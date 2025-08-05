package com.taobao.android.detail2.core.framework.floatwindow.permission;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fjt;
import tb.fkt;
import tb.fky;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_PERMISSION_RESULT = "newdetail_float_permission_result";

    /* renamed from: a */
    private InterfaceC0461a f11560a;
    private boolean b;
    private BroadcastReceiver c = new BroadcastReceiver() { // from class: com.taobao.android.detail2.core.framework.floatwindow.permission.FloatPermissionManager$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !a.ACTION_PERMISSION_RESULT.equals(intent.getAction()) || a.a(a.this) == null) {
            } else {
                if (a.a(a.this, context)) {
                    a.a(a.this).a(true);
                    return;
                }
                a.a(a.this).b(true);
                fky.a(context, System.currentTimeMillis());
            }
        }
    };

    /* renamed from: com.taobao.android.detail2.core.framework.floatwindow.permission.a$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC0461a {
        void a();

        void a(boolean z);

        void b(boolean z);
    }

    static {
        kge.a(1896626719);
    }

    public static /* synthetic */ InterfaceC0461a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0461a) ipChange.ipc$dispatch("c4ab2931", new Object[]{aVar}) : aVar.f11560a;
    }

    public static /* synthetic */ boolean a(a aVar, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c6056039", new Object[]{aVar, context})).booleanValue() : aVar.d(context);
    }

    public void a(Context context, InterfaceC0461a interfaceC0461a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8238b84e", new Object[]{this, context, interfaceC0461a});
        } else if (interfaceC0461a == null || context == null) {
        } else {
            this.f11560a = interfaceC0461a;
            if (d(context)) {
                interfaceC0461a.a(false);
            } else if (a(context)) {
                b(context);
                c(context);
                interfaceC0461a.a();
            } else {
                interfaceC0461a.b(false);
            }
        }
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        long f = fky.f(context);
        fjt.b("PermissionManager", "lastDenyTime: " + f);
        if (f <= 0) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long D = fkt.D();
        StringBuilder sb = new StringBuilder();
        sb.append("canRequestPermission lastDenyTime:");
        sb.append(f);
        sb.append(",nowTime:");
        sb.append(currentTimeMillis);
        sb.append(",permissionInterval:");
        sb.append(D);
        sb.append(",result:");
        int i = ((currentTimeMillis - f) > D ? 1 : ((currentTimeMillis - f) == D ? 0 : -1));
        sb.append(i >= 0);
        fjt.b("PermissionManager", sb.toString());
        return i >= 0;
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent(context, PermissionActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
        } else if (this.b) {
        } else {
            LocalBroadcastManager.getInstance(context).registerReceiver(this.c, new IntentFilter(ACTION_PERMISSION_RESULT));
            this.b = true;
        }
    }

    private boolean d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{this, context})).booleanValue() : Build.VERSION.SDK_INT < 24 || Settings.canDrawOverlays(context);
    }
}
