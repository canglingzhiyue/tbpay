package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.engine.a;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0007J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/taobao/android/icart/broadcast/wvprocessor/CartWVProcessor;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "mProcessorMap", "", "Ljava/lang/Class;", "Lcom/taobao/android/icart/broadcast/wvprocessor/ICartWVProcessor;", "sCartEngines", "Ljava/util/Stack;", "Lcom/taobao/android/icart/engine/CartVEngine;", "process", "", "action", "params", "callback", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "register", "", "engine", MiPushClient.COMMAND_UNREGISTER, "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class tpg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tpg INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final String f34248a;
    private static final Stack<a> b;
    private static final Map<String, Class<? extends tph>> c;

    static {
        kge.a(1346920496);
        INSTANCE = new tpg();
        f34248a = "CartWVProcessor";
        b = new Stack<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c = linkedHashMap;
        linkedHashMap.put(tpi.actionType, tpi.class);
        c.put(tpj.actionType, tpj.class);
    }

    private tpg() {
    }

    @JvmStatic
    public static final void a(a engine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff342f4c", new Object[]{engine});
            return;
        }
        q.d(engine, "engine");
        b.push(engine);
    }

    @JvmStatic
    public static final void b(a engine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5652202b", new Object[]{engine});
            return;
        }
        q.d(engine, "engine");
        b.remove(engine);
    }

    @JvmStatic
    public static final boolean a(String str, String str2, WVCallBackContext callback) {
        a aVar;
        bbz h;
        q.d(callback, "callback");
        String str3 = str;
        boolean z = true;
        if (!(str3 == null || n.a((CharSequence) str3))) {
            String str4 = str2;
            if (str4 != null && !n.a((CharSequence) str4)) {
                z = false;
            }
            if (!z) {
                String str5 = f34248a;
                try {
                    JSONObject paramsJson = JSON.parseObject(str2);
                    String string = paramsJson.getString("type");
                    if (string == null) {
                        return false;
                    }
                    Map<String, Class<? extends tph>> map = c;
                    Class<? extends tph> cls = map.get(str + '#' + string);
                    if (cls != null && (aVar = (a) ipm.a(b)) != null && (h = aVar.h()) != null) {
                        String str6 = f34248a;
                        jqg.b(str6, "process#" + string);
                        String string2 = paramsJson.getString("filterItem");
                        if (string2 == null) {
                            string2 = "";
                        }
                        bcb n = h.n();
                        if (n != null) {
                            n.b(string2);
                        }
                        tph newInstance = cls.newInstance();
                        if (newInstance != null) {
                            q.b(paramsJson, "paramsJson");
                            return newInstance.a(h, paramsJson, callback);
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    jqg.a(str5, th.getMessage());
                }
            }
        }
        return false;
    }
}
