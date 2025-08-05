package com.alipay.mobile.alertsentry;

import android.content.Context;
import com.alipay.mobile.alertsentry.engine.Engine;
import com.alipay.mobile.alertsentry.engine.cache.MapCache;
import com.alipay.mobile.alertsentry.engine.cache.MemoryCache;
import com.alipay.mobile.alertsentry.engine.model.Journal;
import com.alipay.mobile.alertsentry.engine.source.DataSource;
import com.alipay.mobile.alertsentry.engine.source.DefaultDataSource;
import com.alipay.mobile.alertsentry.engine.source.local.LocalDataSource;
import com.alipay.mobile.alertsentry.trace.WatchDog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SentryBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f5333a;
    private Engine b;
    private MemoryCache<String, Journal> c;
    private MemoryCache<String, Journal> d;
    private MemoryCache<String, WatchDog> e;
    private DataSource f;

    public SentryBuilder(Context context) {
        this.f5333a = context;
    }

    public final Sentry a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sentry) ipChange.ipc$dispatch("352c594", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new MapCache();
        }
        if (this.d == null) {
            this.d = new MapCache();
        }
        if (this.e == null) {
            this.e = new MapCache();
        }
        if (this.f == null) {
            this.f = this.f5333a != null ? new LocalDataSource() : new DefaultDataSource();
        }
        return new Sentry(this.b);
    }
}
