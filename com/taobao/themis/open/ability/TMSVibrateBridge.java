package com.taobao.themis.open.ability;

import android.app.Application;
import android.os.Vibrator;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.dlu;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/open/ability/TMSVibrateBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "onFinalized", "", "onInitialized", dlu.API_VIBRATE, "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "time", "", "vibrateLong", "vibrateShort", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSVibrateBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(600133138);
        kge.a(-86622547);
        Companion = new a(null);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse vibrateLong(@BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("a6126b7f", new Object[]{this, apiContext});
        }
        q.d(apiContext, "apiContext");
        return a(400);
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse vibrate(@BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("4b6f7663", new Object[]{this, apiContext});
        }
        q.d(apiContext, "apiContext");
        return a(400);
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse vibrateShort(@BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("5f192a41", new Object[]{this, apiContext});
        }
        q.d(apiContext, "apiContext");
        return a(40);
    }

    private final BridgeResponse a(int i) {
        Application applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("69117b8b", new Object[]{this, new Integer(i)});
        }
        try {
            IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
            if (iEnvironmentService != null && (applicationContext = iEnvironmentService.getApplicationContext()) != null) {
                Object systemService = applicationContext.getApplicationContext().getSystemService("vibrator");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
                }
                ((Vibrator) systemService).vibrate(i);
                BridgeResponse bridgeResponse = BridgeResponse.SUCCESS;
                q.b(bridgeResponse, "BridgeResponse.SUCCESS");
                return bridgeResponse;
            }
            BridgeResponse bridgeResponse2 = BridgeResponse.UNKNOWN_ERROR;
            q.b(bridgeResponse2, "BridgeResponse.UNKNOWN_ERROR");
            return bridgeResponse2;
        } catch (Throwable th) {
            TMSLogger.b("TMSVibrateBridge", th.getMessage(), th);
            BridgeResponse bridgeResponse3 = BridgeResponse.UNKNOWN_ERROR;
            q.b(bridgeResponse3, "BridgeResponse.UNKNOWN_ERROR");
            return bridgeResponse3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/taobao/themis/open/ability/TMSVibrateBridge$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "VIBRATE_LONG", "", "VIBRATE_SHORT", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-1784657190);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
