package com.taobao.themis.inside.Initializer;

import android.app.Application;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.s;
import com.taobao.themis.inside.adapter.TMSOrangeProxy;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.utils.f;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2.\u0010\f\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rj\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/inside/Initializer/TMSForegroundInitializer;", "", "()V", "NAME", "", RPCDataItems.SWITCH_TAG_LOG, "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "init", "", "application", "Landroid/app/Application;", "params", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSForegroundInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final TMSForegroundInitializer INSTANCE;
    private static final String NAME = "tms-launcher-5";
    private static final String TAG = "TMSInitializer:tms-launcher-5";
    private static final AtomicBoolean isInitialized;

    static {
        kge.a(-877295409);
        INSTANCE = new TMSForegroundInitializer();
        isInitialized = new AtomicBoolean(false);
    }

    private TMSForegroundInitializer() {
    }

    @JvmStatic
    public static final void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        q.d(application, "application");
        TMSLogger.d(TAG, "TMSForegroundInitializer start");
        if ((!q.a((Object) TMSOrangeProxy.INSTANCE.getConfigByGroupAndNameFromLocal(i.GROUP_THEMIS_COMMON_CONFIG, "enableTMSForegroundInitializer", "true"), (Object) "true")) || isInitialized.get()) {
            return;
        }
        t.e.compareAndSet(-1L, System.currentTimeMillis());
        s sVar = s.f18233a;
        q.b(sVar, "ProcedureManagerProxy.PROXY");
        sVar.d().a("tmsForegroundTime", Long.valueOf(f.a(t.e.get())));
        if (t.f.get() == -1) {
            TMSResumedInitializer.init(application, hashMap);
        }
        isInitialized.set(true);
    }
}
