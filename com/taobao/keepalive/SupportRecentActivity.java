package com.taobao.keepalive;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.Window;
import android.view.WindowManager;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.uc.webview.export.media.MessageID;
import java.util.Calendar;
import tb.dcd;
import tb.iao;
import tb.kat;
import tb.kge;
import tb.mto;
import tb.rtx;
import tb.rty;
import tb.rtz;

/* loaded from: classes7.dex */
public class SupportRecentActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean c;

    /* renamed from: a */
    public boolean f17642a = true;
    public boolean b = false;
    public BroadcastReceiver d = new a();

    /* loaded from: classes7.dex */
    public class a extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1665046044);
        }

        public a() {
            SupportRecentActivity.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent == null ? "" : intent.getAction();
            rty.f33380a.d("SupportRecentActivity", iao.NEXT_TAG_RECEIVER, "action", action);
            if (!"tb.alive.recent.finish".equals(action)) {
                return;
            }
            SupportRecentActivity.a(SupportRecentActivity.this);
        }
    }

    static {
        kge.a(1713462559);
    }

    public static /* synthetic */ void a(SupportRecentActivity supportRecentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b4f318", new Object[]{supportRecentActivity});
        } else {
            supportRecentActivity.a();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.c) {
        } else {
            try {
                unregisterReceiver(this.d);
            } catch (Throwable th) {
                rty.f33380a.b("SupportRecentActivity", "onDestroy err", th, new Object[0]);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            registerReceiver(this.d, new IntentFilter("tb.alive.recent.finish"));
            this.c = true;
        } catch (Throwable th) {
            rty.f33380a.b("SupportRecentActivity", "registerReceiver err", th, new Object[0]);
        }
    }

    public static /* synthetic */ Object ipc$super(SupportRecentActivity supportRecentActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* renamed from: lambda$Is2Xd-0FP1LYP9qtHXSAI0bPah8 */
    public static /* synthetic */ void m1109lambda$Is2Xd0FP1LYP9qtHXSAI0bPah8(SupportRecentActivity supportRecentActivity) {
        supportRecentActivity.c();
    }

    public static /* synthetic */ void lambda$bfXWr9vK1Ih39SkSCXIwX5T0J5Q(SupportRecentActivity supportRecentActivity) {
        supportRecentActivity.b();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        rty.f33380a.d("SupportRecentActivity", i.b.MEASURE_ONCREATE, new Object[0]);
        Window window = getWindow();
        window.setGravity(51);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        attributes.height = 1;
        attributes.width = 1;
        window.setAttributes(attributes);
        int i = Calendar.getInstance().get(6);
        Context applicationContext = getApplicationContext();
        rtx.a(applicationContext, KeepAliveManager.FILE_RECENT_ENTRANCE, i + "");
        rtz.a().execute(new Runnable() { // from class: com.taobao.keepalive.-$$Lambda$SupportRecentActivity$Is2Xd-0FP1LYP9qtHXSAI0bPah8
            {
                SupportRecentActivity.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SupportRecentActivity.m1109lambda$Is2Xd0FP1LYP9qtHXSAI0bPah8(SupportRecentActivity.this);
            }
        });
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        rty.f33380a.d("SupportRecentActivity", MessageID.onDestroy, new Object[0]);
        rtz.a().execute(new Runnable() { // from class: com.taobao.keepalive.-$$Lambda$SupportRecentActivity$bfXWr9vK1Ih39SkSCXIwX5T0J5Q
            {
                SupportRecentActivity.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SupportRecentActivity.lambda$bfXWr9vK1Ih39SkSCXIwX5T0J5Q(SupportRecentActivity.this);
            }
        });
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        rty.f33380a.d("SupportRecentActivity", "onNewIntent", new Object[0]);
        this.b = true;
    }

    @Override // android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        rty.f33380a.d("SupportRecentActivity", "onStart", new Object[0]);
        moveTaskToBack(false);
    }

    @Override // android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        rty.f33380a.d("SupportRecentActivity", MessageID.onStop, "isFirstStart", Boolean.valueOf(this.f17642a), "hasNewIntent", Boolean.valueOf(this.b));
        if (this.f17642a) {
            this.f17642a = false;
            if (SystemClock.elapsedRealtime() - getIntent().getLongExtra("time", 0L) < 60000) {
                Context applicationContext = getApplicationContext();
                rty.f33380a.d("SupportRecentActivity", "startTinyProcess", new Object[0]);
                Intent intent = new Intent();
                intent.setPackage(applicationContext.getPackageName());
                intent.setClassName(applicationContext, "com.taobao.adaemon.TriggerService");
                intent.putExtra("type", 8);
                dcd.a(applicationContext, intent);
                return;
            }
            rty.f33380a.d("SupportRecentActivity", "first start from recent task", new Object[0]);
        }
        if (this.b) {
            this.b = false;
            return;
        }
        try {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            launchIntentForPackage.putExtra("afcTriggerType", 1);
            launchIntentForPackage.addFlags(268435456);
            startActivity(launchIntentForPackage);
            kat.a("keepalive", "full_verify", "recent click", mto.a.GEO_NOT_SUPPORT);
        } catch (Throwable th) {
            rty.f33380a.b("SupportRecentActivity", "onStop, start launch err", th, new Object[0]);
            kat.a("keepalive", "full_verify", "recent click err", mto.a.GEO_NOT_SUPPORT);
        }
        a();
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            finish();
            Process.killProcess(Process.myPid());
        } catch (Throwable th) {
            rty.f33380a.b("SupportRecentActivity", "finishSelf err", th, new Object[0]);
            kat.a("keepalive", "full_verify", "finishSelf err", mto.a.GEO_NOT_SUPPORT);
        }
    }
}
