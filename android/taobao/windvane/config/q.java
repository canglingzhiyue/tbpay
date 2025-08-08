package android.taobao.windvane.config;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.GlobalSettings;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class q implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile q f1569a;
    public static final r configData;
    private AtomicBoolean b = new AtomicBoolean(false);

    static {
        kge.a(-1360700809);
        kge.a(638153698);
        f1569a = null;
        configData = new r();
    }

    public static q a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("f82547f5", new Object[0]);
        }
        if (f1569a == null) {
            synchronized (q.class) {
                if (f1569a == null) {
                    f1569a = new q();
                }
            }
        }
        return f1569a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.b.compareAndSet(false, true)) {
        } else {
            b(android.taobao.windvane.util.b.b(WVConfigManager.SPNAME_CONFIG, "uc_corewv-data"));
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b.get();
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
        }
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                configData.f1570a = jSONObject.optInt("webMultiPolicy", configData.f1570a);
                configData.b = jSONObject.optInt("gpuMultiPolicy", configData.b);
                configData.c = jSONObject.optBoolean("openUCExperiment", configData.c);
                while (keys != null) {
                    if (!keys.hasNext()) {
                        break;
                    }
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    android.taobao.windvane.util.m.e("WVUCCoreConfig", "WVUCCoreConfig key=" + next + " value=" + optString);
                    GlobalSettings.set(next, optString);
                }
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    @Override // android.taobao.windvane.config.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        b(str);
        android.taobao.windvane.util.b.a(WVConfigManager.SPNAME_CONFIG, "uc_corewv-data", str);
    }
}
