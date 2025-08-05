package com.taobao.android.weex_framework.devtool;

import android.os.SystemClock;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.weex.bridge.WeexPlatformInspectorBridge;
import com.taobao.android.weex_framework.util.r;
import com.taobao.themis.kernel.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f15989a;
    private String c;
    private String f;
    private int d = -1;
    private NetworkResourceType e = NetworkResourceType.Other;
    private int g = 0;
    private int h = 0;
    private boolean i = false;
    private final boolean b = com.taobao.android.weex.inspector.b.c();

    static {
        kge.a(-1462041304);
    }

    private static JSONObject a(Map<String, ?> map) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7fc9528b", new Object[]{map});
        }
        JSONObject jSONObject = new JSONObject();
        if (map == null) {
            return jSONObject;
        }
        try {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                if (entry.getKey() != null && (a2 = a(entry.getValue())) != null) {
                    jSONObject.put(entry.getKey(), a2);
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof List)) {
            return null;
        }
        List list = (List) obj;
        if (list.size() <= 0) {
            return null;
        }
        return (String) list.get(0);
    }

    private static double c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b58", new Object[0])).doubleValue() : SystemClock.elapsedRealtime() / 1000.0d;
    }

    private static double d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2d9", new Object[0])).doubleValue() : System.currentTimeMillis() / 1000.0d;
    }

    public void a(com.taobao.android.weex_framework.common.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265fa2fe", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.c = aVar.f15985a;
            this.f = aVar.c;
            if (aVar.g != null) {
                this.d = aVar.g.f15986a;
                this.e = aVar.g.b;
            }
            com.taobao.android.riverlogger.b a2 = r.a(this.d, LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "request", this.c).a("url", (Object) aVar.c).a("method", (Object) aVar.d).a("header", aVar.b);
            if (aVar.e != null) {
                a2.a("bodySize", Integer.valueOf(aVar.e.length()));
            }
            a2.a();
            if (!this.b) {
                return;
            }
            WeexPlatformInspectorBridge.networkRequestWillBeSent(this.d, this.c, aVar.c, aVar.d, a((Map<String, ?>) aVar.b), aVar.e, c(), d(), this.e.value);
        }
    }

    public void a(com.taobao.android.weex_framework.common.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2660175d", new Object[]{this, bVar});
        } else if (bVar == null) {
            a(-1001, "response is null");
        } else {
            if (!this.i) {
                boolean equals = "cache".equals(bVar.e.get(i.CDN_REQUEST_TYPE));
                if (equals) {
                    a();
                }
                int i = 200;
                try {
                    i = Integer.parseInt(bVar.f15987a);
                } catch (NumberFormatException unused) {
                }
                a(i, equals, bVar.f);
                a(bVar.b);
            }
            b();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.b) {
        } else {
            WeexPlatformInspectorBridge.networkRequestServedFromCache(this.d, this.c);
        }
    }

    public void a(int i, boolean z, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d7a3cc", new Object[]{this, new Integer(i), new Boolean(z), map});
            return;
        }
        this.i = true;
        r.a(((i < 200 || i > 304) && i != 307) ? RVLLevel.Warn : RVLLevel.Info, this.d, LogStrategyManager.SP_STRATEGY_KEY_NETWORK, InputFrame3.TYPE_RESPONSE, this.c).a("url", (Object) this.f).a("statusCode", Integer.valueOf(i)).a("header", map).a("zcacheInfo", (Object) this.f15989a).a();
        if (!this.b) {
            return;
        }
        String a2 = com.taobao.android.weex_framework.module.builtin.stream.a.a(String.valueOf(i));
        if (this.f15989a != null) {
            HashMap hashMap = new HashMap(map);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f15989a);
            hashMap.put("X-ZCache-Info", arrayList);
            map = hashMap;
        }
        WeexPlatformInspectorBridge.networkResponseReceived(this.d, this.c, this.f, i, a2, a((Map<String, ?>) map), z, c(), this.e.value);
    }

    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else if (bArr == null) {
        } else {
            this.g += bArr.length;
            this.h++;
            if (!this.b) {
                return;
            }
            WeexPlatformInspectorBridge.networkDataReceived(this.d, this.c, c(), bArr);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        r.a(this.d, LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "finished", this.c).a("dataSize", Integer.valueOf(this.g)).a("chunkCount", Integer.valueOf(this.h)).a();
        if (!this.b) {
            return;
        }
        WeexPlatformInspectorBridge.networkLoadingFinished(this.d, this.c, c(), this.g);
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        r.b(this.d, LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "finished", this.c).a(i, str).a("dataSize", Integer.valueOf(this.g)).a("chunkCount", Integer.valueOf(this.h)).a();
        if (!this.b) {
            return;
        }
        WeexPlatformInspectorBridge.networkLoadingFailed(this.d, this.c, c(), this.e.value, str, false);
    }
}
