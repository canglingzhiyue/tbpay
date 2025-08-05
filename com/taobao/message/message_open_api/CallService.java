package com.taobao.message.message_open_api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.kit.util.BundleSplitUtil;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jb\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\t0\u0014H\u0016Jv\u0010\u0015\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\t0\u0014H\u0002J\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0\u0010J\u0012\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/taobao/message/message_open_api/CallService;", "Lcom/taobao/message/message_open_api/ICallService;", "()V", "CALL_CLAZZ", "", RPCDataItems.SWITCH_TAG_LOG, "mService", "call", "", "T", "context", "Landroid/content/Context;", "api", "data", "Lcom/alibaba/fastjson/JSONObject;", "options", "", "", "ext", "observer", "Lcom/taobao/message/kit/core/IObserver;", "callImpl", "handler", "Landroid/os/Handler;", "clazz", "Ljava/lang/Class;", "getVersions", "", "unsubscribe", "tag", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class CallService implements ICallService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CALL_CLAZZ = "com.taobao.message.message_open_api.core.CallManager";
    public static final CallService INSTANCE;
    private static final String TAG = "CallService";
    private static ICallService mService;

    static {
        kge.a(58768608);
        kge.a(-13121275);
        INSTANCE = new CallService();
    }

    private CallService() {
    }

    public static final /* synthetic */ void access$callImpl(CallService callService, Handler handler, Class cls, Context context, String str, JSONObject jSONObject, Map map, Map map2, IObserver iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d40ffef", new Object[]{callService, handler, cls, context, str, jSONObject, map, map2, iObserver});
        } else {
            callService.callImpl(handler, cls, context, str, jSONObject, map, map2, iObserver);
        }
    }

    public static final /* synthetic */ void access$setMService$p(CallService callService, ICallService iCallService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644a1cae", new Object[]{callService, iCallService});
        } else {
            mService = iCallService;
        }
    }

    @Override // com.taobao.message.message_open_api.ICallService
    public <T> void call(Context context, String api, JSONObject jSONObject, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, IObserver<T> observer) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("967aacfb", new Object[]{this, context, api, jSONObject, map, map2, observer});
            return;
        }
        q.c(context, "context");
        q.c(api, "api");
        q.c(observer, "observer");
        Handler handler = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
        ICallService iCallService = mService;
        if (iCallService instanceof ICallService) {
            if (iCallService == null) {
                q.a();
            }
            iCallService.call(context, api, jSONObject, map, map2, observer);
            return;
        }
        if (map2 == null || !map2.containsKey("disableInit") || !Boolean.parseBoolean(String.valueOf(map2.get("disableInit")))) {
            z = false;
        }
        if (BundleSplitUtil.INSTANCE.isMsgBundleReady()) {
            Class<?> cls = Class.forName(CALL_CLAZZ);
            q.a((Object) cls, "Class.forName(CALL_CLAZZ)");
            callImpl(handler, cls, context, api, jSONObject, map, map2, observer);
        } else if (!z) {
            BundleSplitUtil.INSTANCE.checkClazzReady(CALL_CLAZZ, false, new CallService$call$1(handler, context, api, jSONObject, map, map2, observer), new CallService$call$2(observer));
        } else {
            observer.onError(new RuntimeException("msg bundle is not ready"));
        }
    }

    private final <T> void callImpl(Handler handler, Class<?> cls, Context context, String str, JSONObject jSONObject, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, IObserver<T> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86beed38", new Object[]{this, handler, cls, context, str, jSONObject, map, map2, iObserver});
        } else {
            Coordinator.doBackGroundTask(new CallService$callImpl$1(handler, cls, context, str, jSONObject, map, map2, iObserver));
        }
    }

    public final Map<String, Integer> getVersions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2e27d84d", new Object[]{this});
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("dataSDK", 2);
        return hashMap;
    }

    @Override // com.taobao.message.message_open_api.ICallService
    public void unsubscribe(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844202a2", new Object[]{this, str});
            return;
        }
        ICallService iCallService = mService;
        if (iCallService == null) {
            return;
        }
        iCallService.unsubscribe(str);
    }
}
