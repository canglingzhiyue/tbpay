package com.alibaba.android.ultron.vfw.weex2;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import tb.alz;
import tb.jpr;
import tb.jpt;
import tb.jqg;
import tb.jqm;
import tb.kge;
import tb.spk;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f2760a = new HashMap();
    private final Map<String, String> b = new HashMap();
    private String c;
    private boolean d;
    private long e;
    private boolean f;
    private JSONObject g;

    static {
        kge.a(-1907981723);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (str == null || str2 == null) {
        } else {
            this.f2760a.put(str, str2);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (str == null || str2 == null) {
        } else {
            this.b.put(str, str2);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.g = jSONObject;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = System.currentTimeMillis();
        this.f = false;
        this.d = false;
        this.c = "";
        this.f2760a.clear();
        this.b.clear();
    }

    public void b(String str) {
        String c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!this.f) {
            this.f = true;
            if (str == null || (c = c(str)) == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.e;
            if (((float) currentTimeMillis) < e(c)) {
                return;
            }
            String str2 = "容器白屏";
            if (!this.d) {
                HashMap hashMap = new HashMap();
                hashMap.put("url", str);
                hashMap.put("message", str2);
                jqg.a(c, "whiteMonitor", "混合容器白屏", hashMap);
            }
            HashMap hashMap2 = new HashMap();
            Object obj = this.g;
            if (obj == null) {
                obj = "no preRenderData";
            }
            hashMap2.put("preRenderData", obj);
            hashMap2.put("url", str);
            jqg.b("whiteMonitor", "混合容器白屏监控", hashMap2);
            jpt a2 = jpt.a(str, "tradeHybridContainerWhiteScreen", "28927-tracker", "");
            a2.a(this.d);
            if (this.d) {
                str2 = "渲染完成";
            } else if (!TextUtils.isEmpty(this.c)) {
                str2 = this.c;
            }
            a2.a(str2);
            a2.c("c1", String.valueOf(currentTimeMillis));
            a2.a(jqm.a() ? 1.0f : a(this.d, c));
            for (Map.Entry<String, String> entry : this.f2760a.entrySet()) {
                a2.c(entry.getKey(), entry.getValue());
            }
            for (Map.Entry<String, String> entry2 : this.b.entrySet()) {
                a2.d(entry2.getKey(), entry2.getValue());
            }
            jpr.a(a2);
        }
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        char c = 1;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        try {
            URI uri = new URI(str);
            String path = uri.getPath();
            switch (path.hashCode()) {
                case -1727974879:
                    if (path.equals("/app/tb-trade/supercart/cart")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1379086885:
                    if (path.equals("/app/tb-trade/odetail/home")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -888062291:
                    if (path.equals("/app/mtb/app-success-new/success")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 579613507:
                    if (path.equals("/app/mtb/pay-success-v2/confirm-success")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1601597570:
                    if (path.equals("/app/mtb/logisticsV2/detail")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1753068588:
                    if (path.equals("/app/tb-trade/light-buy/home")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 2124169781:
                    if (path.equals("/app/mtb/pay-success-v3/simple-pay-success")) {
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    return alz.BizKeyPaysuccess;
                case 2:
                    return "supercart";
                case 3:
                    return "confirmsuccess";
                case 4:
                    return alz.BizKeyOrderDetail;
                case 5:
                    return "logisticsDetail";
                case 6:
                    return "lightbuy";
                default:
                    if (!TextUtils.equals(uri.getHost(), "go") || !TextUtils.equals(uri.getScheme(), "taobao")) {
                        return null;
                    }
                    if (!TextUtils.equals(uri.getPath(), "/alipay")) {
                        return null;
                    }
                    return "alipay";
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    private float a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7197a26", new Object[]{this, new Boolean(z), str})).floatValue();
        }
        String format = String.format("%s%s", str, "_weex_container");
        if (z) {
            return spk.a(format, "whiteSamplingInSuccess", 0.01f);
        }
        return spk.a(format, "whiteSampling", 1.0f);
    }

    private float e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1c6cb126", new Object[]{this, str})).floatValue() : spk.a(String.format("%s%s", str, "_weex_container"), "whiteMonitorGap", 0.0f);
    }
}
