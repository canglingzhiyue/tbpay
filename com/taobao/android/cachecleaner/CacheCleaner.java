package com.taobao.android.cachecleaner;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.d;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes4.dex */
public class CacheCleaner {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLEAN_ERROR_MULTI = -2;
    public static final String MODULE = "CacheCleaner";
    private static volatile CacheCleaner n;

    /* renamed from: a  reason: collision with root package name */
    private Context f9270a;
    private final AtomicBoolean k = new AtomicBoolean(false);

    static {
        kge.a(-497432900);
        n = null;
    }

    private CacheCleaner() {
    }

    public static CacheCleaner a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheCleaner) ipChange.ipc$dispatch("cc982561", new Object[0]);
        }
        if (n == null) {
            synchronized (CacheCleaner.class) {
                if (n == null) {
                    n = new CacheCleaner();
                }
            }
        }
        return n;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        if (context instanceof Application) {
            this.f9270a = context;
        } else {
            this.f9270a = context.getApplicationContext();
        }
        if (this.k.get()) {
            return;
        }
        this.k.set(true);
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        Context context = this.f9270a;
        if (context == null) {
            return 0L;
        }
        long b = d.b(context);
        a("new", b >> 10);
        return b;
    }

    private void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("user_cache_clean_" + str);
        uTCustomHitBuilder.setEventPage("cache_manager");
        uTCustomHitBuilder.setProperty("size", j + "");
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }
}
