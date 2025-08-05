package com.taobao.search.musie;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import tb.kge;
import tb.ntr;

/* loaded from: classes7.dex */
public final class MUSObservablePageStorageModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(911765926);
    }

    public static /* synthetic */ Object ipc$super(MUSObservablePageStorageModule mUSObservablePageStorageModule, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MUSObservablePageStorageModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod
    public final void subscribeMapValue(String namespace) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb590630", new Object[]{this, namespace});
            return;
        }
        kotlin.jvm.internal.q.c(namespace, "namespace");
        com.taobao.android.xsearchplugin.muise.t a2 = com.taobao.android.xsearchplugin.muise.t.a(getInstance(), true);
        if (a2 == null) {
            return;
        }
        com.taobao.android.weex_framework.p instance = getInstance();
        kotlin.jvm.internal.q.a((Object) instance, "instance");
        Context uIContext = instance.getUIContext();
        if (!(uIContext instanceof Activity)) {
            uIContext = null;
        }
        Activity activity = (Activity) uIContext;
        if (activity == null) {
            return;
        }
        ntr.INSTANCE.a(activity, namespace, a2);
    }

    @MUSMethod
    public final void unsubscribeMapValue(String namespace) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6a2d77", new Object[]{this, namespace});
            return;
        }
        kotlin.jvm.internal.q.c(namespace, "namespace");
        com.taobao.android.xsearchplugin.muise.t a2 = com.taobao.android.xsearchplugin.muise.t.a(getInstance(), true);
        if (a2 == null) {
            return;
        }
        com.taobao.android.weex_framework.p instance = getInstance();
        kotlin.jvm.internal.q.a((Object) instance, "instance");
        Context uIContext = instance.getUIContext();
        if (!(uIContext instanceof Activity)) {
            uIContext = null;
        }
        Activity activity = (Activity) uIContext;
        if (activity == null) {
            return;
        }
        ntr.INSTANCE.b(activity, namespace, a2);
    }

    @MUSMethod(uiThread = false)
    public final boolean put(JSONObject params) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3612fd9e", new Object[]{this, params})).booleanValue();
        }
        kotlin.jvm.internal.q.c(params, "params");
        com.taobao.android.weex_framework.p instance = getInstance();
        kotlin.jvm.internal.q.a((Object) instance, "instance");
        Context uIContext = instance.getUIContext();
        if (!(uIContext instanceof Activity)) {
            uIContext = null;
        }
        Activity activity = (Activity) uIContext;
        if (activity == null || (obj = params.get("value")) == null) {
            return false;
        }
        kotlin.jvm.internal.q.a(obj, "params[\"value\"] ?: return false");
        String string = params.getString("namespace");
        kotlin.jvm.internal.q.a((Object) string, "params.getString(\"namespace\")");
        String string2 = params.getString("key");
        kotlin.jvm.internal.q.a((Object) string2, "params.getString(\"key\")");
        FutureTask futureTask = new FutureTask(new a(this, activity, string, string2, obj));
        new Handler(Looper.getMainLooper()).post(futureTask);
        Object obj2 = futureTask.get();
        kotlin.jvm.internal.q.a(obj2, "putValueFutureTask.get()");
        return ((Boolean) obj2).booleanValue();
    }

    @MUSMethod
    public final void remove(JSONObject params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6626d45", new Object[]{this, params});
            return;
        }
        kotlin.jvm.internal.q.c(params, "params");
        com.taobao.android.weex_framework.p instance = getInstance();
        kotlin.jvm.internal.q.a((Object) instance, "instance");
        Context uIContext = instance.getUIContext();
        if (!(uIContext instanceof Activity)) {
            uIContext = null;
        }
        Activity activity = (Activity) uIContext;
        if (activity == null) {
            return;
        }
        ntr ntrVar = ntr.INSTANCE;
        String string = params.getString("namespace");
        kotlin.jvm.internal.q.a((Object) string, "params.getString(\"namespace\")");
        String string2 = params.getString("key");
        kotlin.jvm.internal.q.a((Object) string2, "params.getString(\"key\")");
        ntrVar.a(activity, string, string2);
    }

    @MUSMethod
    public final void configNamespace(JSONObject params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd386b0", new Object[]{this, params});
            return;
        }
        kotlin.jvm.internal.q.c(params, "params");
        com.taobao.android.weex_framework.p instance = getInstance();
        kotlin.jvm.internal.q.a((Object) instance, "instance");
        Context uIContext = instance.getUIContext();
        if (!(uIContext instanceof Activity)) {
            uIContext = null;
        }
        Activity activity = (Activity) uIContext;
        if (activity == null) {
            return;
        }
        String namespace = params.getString("namespace");
        if (TextUtils.isEmpty(namespace)) {
            return;
        }
        int intValue = params.getIntValue("maxSize");
        ntr ntrVar = ntr.INSTANCE;
        kotlin.jvm.internal.q.a((Object) namespace, "namespace");
        ntrVar.a(activity, namespace, intValue);
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        com.taobao.android.xsearchplugin.muise.t a2 = com.taobao.android.xsearchplugin.muise.t.a(getInstance(), false);
        if (a2 == null) {
            return;
        }
        a2.a();
    }

    /* loaded from: classes7.dex */
    public final class a implements Callable<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MUSObservablePageStorageModule f19198a;
        private final Activity b;
        private final String c;
        private final String d;
        private final Object e;

        static {
            kge.a(1480957400);
            kge.a(-119797776);
        }

        public a(MUSObservablePageStorageModule mUSObservablePageStorageModule, Activity activity, String namespace, String key, Object value) {
            kotlin.jvm.internal.q.c(activity, "activity");
            kotlin.jvm.internal.q.c(namespace, "namespace");
            kotlin.jvm.internal.q.c(key, "key");
            kotlin.jvm.internal.q.c(value, "value");
            this.f19198a = mUSObservablePageStorageModule;
            this.b = activity;
            this.c = namespace;
            this.d = key;
            this.e = value;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
        @Override // java.util.concurrent.Callable
        public /* synthetic */ Boolean call() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6d249ded", new Object[]{this}) : a();
        }

        public Boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("5b7a33e5", new Object[]{this}) : Boolean.valueOf(ntr.INSTANCE.a(this.b, this.c, this.d, this.e));
        }
    }
}
