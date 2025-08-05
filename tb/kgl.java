package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class kgl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Application f30054a;

    static {
        kge.a(-863610031);
    }

    public static kgl a(Application application) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kgl) ipChange.ipc$dispatch("f246169f", new Object[]{application}) : new kgl(application);
    }

    public kgl(Application application) {
        this.f30054a = application;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        OrangeConfig.getInstance().getConfigs("FastSp");
        OrangeConfig.getInstance().registerListener(new String[]{"FastSp"}, new a(this.f30054a), true);
    }

    /* loaded from: classes4.dex */
    public static class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Application f30055a;
        private final Map<String, String> b = new HashMap();

        static {
            kge.a(-1650690347);
            kge.a(-1209827241);
        }

        public a(Application application) {
            this.f30055a = application;
        }

        @Override // com.taobao.orange.d
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("FastSp");
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
                File file = new File(this.f30055a.getFilesDir(), "fastsp.db");
                if (a(kgn.a().a(file), map)) {
                    return;
                }
                kgn.a().a(map, file);
            } catch (Throwable th) {
                tco.a(th);
            }
        }

        private boolean a(Map<String, String> map, Map<String, String> map2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a0efabcc", new Object[]{this, map, map2})).booleanValue();
            }
            if (map.size() != map2.size()) {
                return false;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.equals(entry.getValue(), map2.get(entry.getKey()))) {
                    return false;
                }
            }
            return true;
        }
    }
}
