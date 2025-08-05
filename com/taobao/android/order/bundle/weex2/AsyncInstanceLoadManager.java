package com.taobao.android.order.bundle.weex2;

import android.app.Activity;
import android.content.res.Resources;
import com.alibaba.android.ultron.vfw.weex2.c;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.e;
import com.taobao.android.weex.q;
import com.taobao.android.weex.s;
import com.taobao.android.weex_framework.p;
import kotlin.Metadata;
import tb.cup;
import tb.jqg;
import tb.jvb;
import tb.kge;
import tb.tbt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0006\u0010\u0016\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/android/order/bundle/weex2/AsyncInstanceLoadManager;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "callback", "Lcom/taobao/android/order/bundle/weex2/AsyncInstanceLoadManager$Callback;", "getCallback", "()Lcom/taobao/android/order/bundle/weex2/AsyncInstanceLoadManager$Callback;", "setCallback", "(Lcom/taobao/android/order/bundle/weex2/AsyncInstanceLoadManager$Callback;)V", "loadState", "Lcom/taobao/android/order/bundle/weex2/AsyncInstanceLoadManager$LoadState;", "result", "Lcom/taobao/android/weex_framework/MUSInstance;", Baggage.Linkage.RPT_TICKET, "Lcom/taobao/android/weex/WeexInstanceAsyncBuilder$Ticket;", "asyncCreateWxInstance", "", "context", "Landroid/app/Activity;", "getWeexInstance", "stealTicket", "Callback", "LoadState", "taobao-order-bundle_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class AsyncInstanceLoadManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AsyncInstanceLoadManager INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static LoadState f14575a;
    private static q.a b;
    private static p c;
    private static a d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/order/bundle/weex2/AsyncInstanceLoadManager$LoadState;", "", "(Ljava/lang/String;I)V", "INIT", "LOADING", "SUCCESS", "FAIL", "taobao-order-bundle_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public enum LoadState {
        INIT,
        LOADING,
        SUCCESS,
        FAIL
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/taobao/android/order/bundle/weex2/AsyncInstanceLoadManager$Callback;", "", "onResult", "", "success", "", "wxInstance", "Lcom/taobao/android/weex_framework/MUSInstance;", "taobao-order-bundle_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public interface a {
        void a(boolean z, p pVar);
    }

    static {
        kge.a(571673741);
        INSTANCE = new AsyncInstanceLoadManager();
        f14575a = LoadState.INIT;
    }

    private AsyncInstanceLoadManager() {
    }

    public static final /* synthetic */ void a(AsyncInstanceLoadManager asyncInstanceLoadManager, LoadState loadState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d5dc85", new Object[]{asyncInstanceLoadManager, loadState});
        } else {
            f14575a = loadState;
        }
    }

    public static final /* synthetic */ void a(AsyncInstanceLoadManager asyncInstanceLoadManager, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53765363", new Object[]{asyncInstanceLoadManager, pVar});
        } else {
            c = pVar;
        }
    }

    public final a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("59b72ed3", new Object[]{this}) : d;
    }

    public final void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffdad0d", new Object[]{this, aVar});
        } else {
            d = aVar;
        }
    }

    public final void a(Activity context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, context});
            return;
        }
        kotlin.jvm.internal.q.d(context, "context");
        jqg.b("TBRefundInstanceManager", "step1 ---------异步创建预热实例");
        f14575a = LoadState.LOADING;
        String d2 = cup.Companion.d();
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        if (cup.Companion.a()) {
            weexUnicornConfig.a(WeexUnicornConfig.RenderMode.surface);
        } else {
            weexUnicornConfig.a(WeexUnicornConfig.RenderMode.texture);
        }
        weexUnicornConfig.a(true);
        com.taobao.android.weex.config.b bVar = new com.taobao.android.weex.config.b();
        bVar.a(weexUnicornConfig);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "bizName", "refund_" + System.currentTimeMillis());
        jSONObject2.put((JSONObject) "bundleUrl", d2);
        jSONObject2.put((JSONObject) tbt.PRE_RENDER, (String) true);
        q b2 = e.b(context, d2, WeexInstanceMode.DOM, WeexRenderType.UNICORN, jSONObject, bVar);
        Resources resources = context.getResources();
        kotlin.jvm.internal.q.b(resources, "context.resources");
        int i = resources.getDisplayMetrics().widthPixels;
        Resources resources2 = context.getResources();
        kotlin.jvm.internal.q.b(resources2, "context.resources");
        b2.a(i, resources2.getDisplayMetrics().heightPixels);
        b2.a(d2);
        b2.a((WeexValue) null);
        b = b2.a(new b(context));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "instance", "Lcom/taobao/android/weex/WeexInstanceCreateCallback$Result;", "kotlin.jvm.PlatformType", "onInstanceCreatedInMain"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class b implements s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f14576a;

        public b(Activity activity) {
            this.f14576a = activity;
        }

        @Override // com.taobao.android.weex.s
        public final void a(s.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8d89384", new Object[]{this, aVar});
                return;
            }
            jvb jvbVar = null;
            WeexInstance a2 = aVar != null ? aVar.a(this.f14576a) : null;
            if (!(a2 instanceof WeexInstanceImpl)) {
                a2 = null;
            }
            WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) a2;
            if (weexInstanceImpl != null) {
                jvbVar = weexInstanceImpl.getAdapterMUSInstance();
            }
            jvb jvbVar2 = jvbVar;
            a aVar2 = new a(jvbVar2);
            if (jvbVar2 == null) {
                return;
            }
            jvbVar2.setTag("bizLifecycleListener", aVar2);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/taobao/android/order/bundle/weex2/AsyncInstanceLoadManager$asyncCreateWxInstance$1$listener$1", "Lcom/alibaba/android/ultron/vfw/weex2/UltronWeex2BizLifecycleListener;", "onBizFailed", "", "p0", "", p1.d, "onBizReady", "taobao-order-bundle_release"}, k = 1, mv = {1, 4, 1})
        /* loaded from: classes6.dex */
        public static final class a implements c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ p f14577a;

            public a(p pVar) {
                this.f14577a = pVar;
            }

            @Override // com.alibaba.android.ultron.vfw.weex2.c
            public void onBizReady() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1a730856", new Object[]{this});
                    return;
                }
                AsyncInstanceLoadManager.a(AsyncInstanceLoadManager.INSTANCE, this.f14577a);
                AsyncInstanceLoadManager.a(AsyncInstanceLoadManager.INSTANCE, LoadState.SUCCESS);
                if (AsyncInstanceLoadManager.INSTANCE.a() != null) {
                    jqg.b("TBRefundInstanceManager", "step4 ---------实例创建成功  有callback  回调");
                    a a2 = AsyncInstanceLoadManager.INSTANCE.a();
                    if (a2 != null) {
                        a2.a(true, this.f14577a);
                    }
                    AsyncInstanceLoadManager.INSTANCE.a((a) null);
                    return;
                }
                jqg.b("TBRefundInstanceManager", "step4 ---------实例创建成功  没有callback");
            }

            @Override // com.alibaba.android.ultron.vfw.weex2.c
            public void onBizFailed(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1435fd2c", new Object[]{this, str, str2});
                } else {
                    AsyncInstanceLoadManager.a(AsyncInstanceLoadManager.INSTANCE, LoadState.FAIL);
                }
            }
        }
    }

    public final void b(a callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f329604e", new Object[]{this, callback});
            return;
        }
        kotlin.jvm.internal.q.d(callback, "callback");
        jqg.b("TBRefundInstanceManager", "step2 ---------获取异步预热实例");
        if (b == null) {
            jqg.b("TBRefundInstanceManager", "step3 ---------获取异步预热实例失败  ticket == null  ");
            callback.a(false, null);
            return;
        }
        b();
        int i = com.taobao.android.order.bundle.weex2.a.$EnumSwitchMapping$0[f14575a.ordinal()];
        if (i == 1) {
            jqg.b("TBRefundInstanceManager", "step3 ---------获取异步预热实例失败  LoadState.INIT ");
            callback.a(false, null);
        } else if (i == 2) {
            jqg.b("TBRefundInstanceManager", "step3 ---------获取异步预热实例失败  LoadState.LOADING  赋值callback ");
            d = callback;
        } else if (i == 3) {
            jqg.b("TBRefundInstanceManager", "step3 ---------获取异步预热实例成功");
            callback.a(true, c);
        } else {
            jqg.b("TBRefundInstanceManager", "step3 ---------获取异步预热实例失败  LoadState.Fail ");
            callback.a(false, null);
        }
        b = null;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        q.a aVar = b;
        if (aVar == null) {
            return;
        }
        aVar.c();
    }
}
