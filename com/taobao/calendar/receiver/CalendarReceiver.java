package com.taobao.calendar.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.login4android.broadcast.LoginAction;
import tb.kfg;
import tb.kfl;
import tb.kge;

/* loaded from: classes6.dex */
public class CalendarReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    kfg f16860a;

    /* renamed from: com.taobao.calendar.receiver.CalendarReceiver$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16862a = new int[LoginAction.values().length];

        static {
            try {
                f16862a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16862a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final HandlerThread f16863a;
        private static final Handler b;

        static {
            kge.a(588553827);
            HandlerThread handlerThread = new HandlerThread("AsyncHandler");
            f16863a = handlerThread;
            handlerThread.start();
            b = new Handler(f16863a.getLooper());
        }

        public static void a(Runnable runnable) {
            b.post(runnable);
        }
    }

    static {
        kge.a(-1934977681);
    }

    public CalendarReceiver() {
        f.a("null", "com.taobao.calendar.receiver.CalendarReceiver");
    }

    private void a() {
        a.a(new Runnable() { // from class: com.taobao.calendar.receiver.CalendarReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                kfl.a().b();
            }
        });
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f16860a = new kfg(context);
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        LoginAction loginAction = null;
        try {
            loginAction = LoginAction.valueOf(action);
        } catch (Exception unused) {
        }
        if (loginAction == null || AnonymousClass2.f16862a[loginAction.ordinal()] != 1) {
            return;
        }
        a();
    }
}
