package com.alipay.mobile.alertsentry;

import android.content.Context;
import com.alipay.mobile.alertsentry.engine.Engine;
import com.alipay.mobile.alertsentry.module.ManifestParser;
import com.alipay.mobile.alertsentry.module.SentryModule;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class Sentry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Context f5332a;
    private static volatile Sentry b;
    private final Engine c;

    public Sentry(Engine engine) {
        this.c = engine;
    }

    public static Sentry a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sentry) ipChange.ipc$dispatch("15c7e89c", new Object[]{context});
        }
        if (b == null) {
            synchronized (Sentry.class) {
                if (b == null) {
                    if (context != null) {
                        Context applicationContext = context.getApplicationContext();
                        f5332a = applicationContext;
                        SentryBuilder sentryBuilder = new SentryBuilder(applicationContext);
                        for (SentryModule sentryModule : new ManifestParser(applicationContext).a()) {
                            sentryModule.applyOptions(applicationContext, sentryBuilder);
                        }
                        b = sentryBuilder.a();
                    } else {
                        b = new SentryBuilder(context).a();
                    }
                }
            }
        }
        return b;
    }
}
