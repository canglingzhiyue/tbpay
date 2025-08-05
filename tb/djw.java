package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.c;
import com.taobao.android.ab.jsbridge.WVABGlobalApi;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class djw implements dkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<SharedPreferences> f26796a = new AtomicReference<>(null);

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "JSBridge";
    }

    @Override // tb.dkf
    public void a(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
        }
    }

    static {
        q.a(WVABGlobalApi.PLUGIN_NAME, (Class<? extends e>) WVABGlobalApi.class);
    }

    @Override // tb.dkf
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.f26796a.get() != null) {
        } else {
            this.f26796a.compareAndSet(null, context.getSharedPreferences("ABGlobalBridgeSwitches", 0));
        }
    }

    @Override // tb.dkf
    public Boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3961d127", new Object[]{this, context, str});
        }
        a(context);
        SharedPreferences sharedPreferences = this.f26796a.get();
        if (sharedPreferences != null && sharedPreferences.contains(str)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
        }
        return null;
    }

    @Override // tb.dkf
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        a(context);
        SharedPreferences sharedPreferences = this.f26796a.get();
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean(str, z).apply();
    }

    @Override // tb.dkf
    public c b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("be53a6fd", new Object[]{this, context});
        }
        a(context);
        SharedPreferences sharedPreferences = this.f26796a.get();
        if (sharedPreferences != null) {
            try {
                Map<String, ?> all = sharedPreferences.getAll();
                dkk a2 = dko.a(a(), -1L, -1L, -1L, -1L);
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    a2.a(dko.a(entry.getKey(), entry.getValue().toString(), a()));
                }
                return a2;
            } catch (NullPointerException unused) {
            }
        }
        return dkl.EMPTY;
    }

    @Override // tb.dkf
    public Map<String, dkl> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ab12153", new Object[]{this, context});
        }
        throw new UnsupportedOperationException("unsupported operation");
    }
}
