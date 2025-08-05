package com.taobao.android.fluid.framework.permission;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.framework.permission.a;
import tb.kge;
import tb.occ;
import tb.spz;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_OVERLAY_PERMISSION_DENY_TIMESTAMP = "overlay_permission_deny_timestamp";
    private InterfaceC0496a b;

    /* renamed from: a */
    private boolean f12619a = false;
    private final BroadcastReceiver c = new BroadcastReceiver() { // from class: com.taobao.android.fluid.framework.permission.PermissionManager$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !PermissionActivity.ACTION_PERMISSION_RESULT.equals(intent.getAction()) || a.a(a.this) == null) {
            } else {
                if (a.a(a.this, context)) {
                    b.a();
                    spz.b("ShortVideo_Permission", "checkPermission granted");
                    a.a(a.this).b();
                } else {
                    a.b(a.this, context);
                    b.b();
                    spz.b("ShortVideo_Permission", "checkPermission denied");
                    a.a(a.this).c();
                }
                a.a(a.this, (a.InterfaceC0496a) null);
            }
        }
    };

    /* renamed from: com.taobao.android.fluid.framework.permission.a$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC0496a {
        void a();

        void b();

        void c();
    }

    static {
        kge.a(1556921127);
    }

    public static /* synthetic */ InterfaceC0496a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0496a) ipChange.ipc$dispatch("9bb3f019", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ InterfaceC0496a a(a aVar, InterfaceC0496a interfaceC0496a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InterfaceC0496a) ipChange.ipc$dispatch("13d82335", new Object[]{aVar, interfaceC0496a});
        }
        aVar.b = interfaceC0496a;
        return interfaceC0496a;
    }

    public static /* synthetic */ boolean a(a aVar, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e804ab5d", new Object[]{aVar, context})).booleanValue() : aVar.b(context);
    }

    public static /* synthetic */ void b(a aVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2d8d9a", new Object[]{aVar, context});
        } else {
            aVar.d(context);
        }
    }

    private static boolean a(int i, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c11568d", new Object[]{new Integer(i), new Long(j)})).booleanValue() : System.currentTimeMillis() - j > (((long) i) * 60) * 1000;
    }

    public void a(Context context, InterfaceC0496a interfaceC0496a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1bfcba", new Object[]{this, context, interfaceC0496a});
            return;
        }
        this.b = interfaceC0496a;
        if (a() && !b(context)) {
            spz.b("ShortVideo_Permission", "preCheckPermission ");
            long c = occ.c(context, KEY_OVERLAY_PERMISSION_DENY_TIMESTAMP);
            if (c <= 0 || a(b(), c)) {
                spz.b("ShortVideo_Permission", "checkPermission startRequest:" + c);
                c(context);
                if (!this.f12619a) {
                    LocalBroadcastManager.getInstance(context).registerReceiver(this.c, new IntentFilter(PermissionActivity.ACTION_PERMISSION_RESULT));
                    this.f12619a = true;
                }
                if (interfaceC0496a == null) {
                    return;
                }
                interfaceC0496a.a();
                return;
            }
            spz.b("ShortVideo_Permission", "checkPermission deny time is between 0 & thresh hold :" + c);
            if (interfaceC0496a == null) {
                return;
            }
            interfaceC0496a.c();
            return;
        }
        spz.b("ShortVideo_Permission", "checkPermission already granted");
        if (interfaceC0496a == null) {
            return;
        }
        interfaceC0496a.b();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!this.f12619a) {
        } else {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.c);
            this.f12619a = false;
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        try {
            return Boolean.valueOf(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("enablePermissionCheck", "true")).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    private int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        try {
            return Integer.parseInt(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("checkPermissionInterval", "1440"));
        } catch (Exception unused) {
            return 1440;
        }
    }

    private boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue() : Build.VERSION.SDK_INT < 24 || Settings.canDrawOverlays(context);
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent(context, PermissionActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
        } else {
            occ.a(context, KEY_OVERLAY_PERMISSION_DENY_TIMESTAMP, System.currentTimeMillis());
        }
    }
}
