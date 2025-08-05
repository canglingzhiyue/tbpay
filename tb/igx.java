package tb;

import android.app.Application;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class igx implements igy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_NAMESPACE = "BadTokenOrangeCommand";

    @Override // tb.igy
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        OrangeConfig.getInstance().getConfigs(ORANGE_NAMESPACE);
        OrangeConfig.getInstance().registerListener(new String[]{ORANGE_NAMESPACE}, new a(application), true);
    }

    /* loaded from: classes6.dex */
    public static class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Application f29016a;
        private final Map<String, String> b = new HashMap();

        public a(Application application) {
            this.f29016a = application;
        }

        @Override // com.taobao.orange.d
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(igx.ORANGE_NAMESPACE);
            if (configs == null || configs.size() <= 0) {
                return;
            }
            this.b.putAll(configs);
            a(this.b);
        }

        private void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else if (map == null || map.size() <= 0) {
            } else {
                b(map);
            }
        }

        private void b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
                return;
            }
            try {
                SharedPreferences.Editor edit = this.f29016a.getSharedPreferences(igx.ORANGE_NAMESPACE, 0).edit();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    edit.putString(entry.getKey(), entry.getValue());
                }
                edit.apply();
            } catch (Throwable th) {
                ihc.a(th);
            }
        }
    }
}
