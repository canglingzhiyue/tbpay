package com.taobao.search.musie;

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
import tb.ntn;

/* loaded from: classes7.dex */
public final class MUSObservableValueModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(431881451);
    }

    public static /* synthetic */ Object ipc$super(MUSObservableValueModule mUSObservableValueModule, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MUSObservableValueModule(String str, MUSDKInstance mUSDKInstance) {
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
        ntn.INSTANCE.a(namespace, a2);
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
        ntn.INSTANCE.b(namespace, a2);
    }

    @MUSMethod(uiThread = false)
    public final boolean put(JSONObject params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3612fd9e", new Object[]{this, params})).booleanValue();
        }
        kotlin.jvm.internal.q.c(params, "params");
        Object obj = params.get("value");
        if (obj == null) {
            return false;
        }
        kotlin.jvm.internal.q.a(obj, "params[\"value\"] ?: return false");
        String string = params.getString("namespace");
        kotlin.jvm.internal.q.a((Object) string, "params.getString(\"namespace\")");
        String string2 = params.getString("key");
        kotlin.jvm.internal.q.a((Object) string2, "params.getString(\"key\")");
        FutureTask futureTask = new FutureTask(new a(this, string, string2, obj));
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
        ntn ntnVar = ntn.INSTANCE;
        String string = params.getString("namespace");
        kotlin.jvm.internal.q.a((Object) string, "params.getString(\"namespace\")");
        String string2 = params.getString("key");
        kotlin.jvm.internal.q.a((Object) string2, "params.getString(\"key\")");
        ntnVar.a(string, string2);
    }

    @MUSMethod
    public final void configNamespace(JSONObject params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd386b0", new Object[]{this, params});
            return;
        }
        kotlin.jvm.internal.q.c(params, "params");
        String namespace = params.getString("namespace");
        if (TextUtils.isEmpty(namespace)) {
            return;
        }
        int intValue = params.getIntValue("maxSize");
        ntn ntnVar = ntn.INSTANCE;
        kotlin.jvm.internal.q.a((Object) namespace, "namespace");
        ntnVar.a(namespace, intValue);
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
        public final /* synthetic */ MUSObservableValueModule f19199a;
        private final String b;
        private final String c;
        private final Object d;

        static {
            kge.a(1016685875);
            kge.a(-119797776);
        }

        public a(MUSObservableValueModule mUSObservableValueModule, String namespace, String key, Object value) {
            kotlin.jvm.internal.q.c(namespace, "namespace");
            kotlin.jvm.internal.q.c(key, "key");
            kotlin.jvm.internal.q.c(value, "value");
            this.f19199a = mUSObservableValueModule;
            this.b = namespace;
            this.c = key;
            this.d = value;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
        @Override // java.util.concurrent.Callable
        public /* synthetic */ Boolean call() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6d249ded", new Object[]{this}) : a();
        }

        public Boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("5b7a33e5", new Object[]{this}) : Boolean.valueOf(ntn.INSTANCE.a(this.b, this.c, this.d));
        }
    }
}
