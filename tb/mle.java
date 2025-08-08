package tb;

import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.context.c;
import com.taobao.metrickit.event.b;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class mle extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final float f31087a;

    public static /* synthetic */ Object ipc$super(mle mleVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: lambda$DgIpIVJbZ5MCE1vm-mlWp2BlKGk */
    public static /* synthetic */ void m2465lambda$DgIpIVJbZ5MCE1vmmlWp2BlKGk(mle mleVar, String str, Map map) {
        mleVar.b(str, map);
    }

    /* renamed from: lambda$pb6qKY9SDM86p-u_fJM4P3SfWcg */
    public static /* synthetic */ void m2466lambda$pb6qKY9SDM86pu_fJM4P3SfWcg(mle mleVar, Map map) {
        mleVar.b(map);
    }

    @Override // com.taobao.metrickit.event.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ConfigEventSource";
    }

    @Override // com.taobao.metrickit.event.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public mle(Handler handler) {
        super(handler);
        this.f31087a = new Random(System.currentTimeMillis()).nextFloat();
    }

    @Override // com.taobao.metrickit.event.b
    public int[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[]{this}) : new int[]{3};
    }

    @Override // com.taobao.metrickit.event.b
    public void a(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee74df14", new Object[]{this, metricContext});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"metrickit"}, new d() { // from class: tb.-$$Lambda$mle$DgIpIVJbZ5MCE1vm-mlWp2BlKGk
                @Override // com.taobao.orange.d
                public final void onConfigUpdate(String str, Map map) {
                    mle.m2465lambda$DgIpIVJbZ5MCE1vmmlWp2BlKGk(mle.this, str, map);
                }
            }, true);
        }
    }

    public /* synthetic */ void b(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            return;
        }
        final Map<String, String> configs = OrangeConfig.getInstance().getConfigs("metrickit");
        if (configs == null) {
            return;
        }
        a(3, configs);
        f().post(new Runnable() { // from class: tb.-$$Lambda$mle$pb6qKY9SDM86p-u_fJM4P3SfWcg
            @Override // java.lang.Runnable
            public final void run() {
                mle.m2466lambda$pb6qKY9SDM86pu_fJM4P3SfWcg(mle.this, configs);
            }
        });
    }

    public /* synthetic */ void b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            a((Map<String, String>) map);
        }
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        try {
            TLog.loge("ConfigEventSource", new JSONObject(map).toString());
        } catch (NullPointerException e) {
            TLog.loge("ConfigEventSource", e.toString());
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(c.SWITCH_UPLOAD, a("upload_sample", map));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!StringUtils.isEmpty(entry.getKey()) && !StringUtils.isEmpty(entry.getValue())) {
                if ("on".equals(entry.getValue())) {
                    hashMap.put(entry.getKey(), true);
                    TLog.loge("ConfigEventSource", entry.getKey() + "=true");
                }
                if ("off".equals(entry.getValue())) {
                    hashMap.put(entry.getKey(), false);
                    TLog.loge("ConfigEventSource", entry.getKey() + "=false");
                }
                if (entry.getValue().startsWith("long_")) {
                    long a2 = mqe.a((Object) entry.getValue().replace("long_", ""), 9223372036854775806L);
                    if (a2 != 9223372036854775806L) {
                        hashMap2.put(entry.getKey(), Long.valueOf(a2));
                        TLog.loge("ConfigEventSource", entry.getKey() + "=" + a2);
                    }
                }
                if (entry.getValue().startsWith("0") || entry.getValue().startsWith("1")) {
                    float a3 = mqe.a((Object) entry.getValue(), -1.0f);
                    if (a3 >= 0.0f && a3 <= 1.0f) {
                        hashMap.put(entry.getKey(), Boolean.valueOf(this.f31087a < a3));
                        StringBuilder sb = new StringBuilder();
                        sb.append(entry.getKey());
                        sb.append("=");
                        sb.append(this.f31087a < a3);
                        TLog.loge("ConfigEventSource", sb.toString());
                    }
                }
            }
        }
        c.a(hashMap, hashMap2);
        c.a(map);
    }

    private Boolean a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("a35677d0", new Object[]{this, str, map});
        }
        float a2 = mqe.a((Object) map.get(str), -1.0f);
        if (a2 == -1.0f) {
            return null;
        }
        if (this.f31087a >= a2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
