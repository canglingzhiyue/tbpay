package com.taobao.android.virtual_thread.adapter.tb;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.jre;
import tb.jrh;
import tb.jrj;
import tb.jrk;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1363200870);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else if (!jrh.a()) {
        } else {
            OrangeConfig.getInstance().getConfigs("VirtualThread");
            OrangeConfig.getInstance().registerListener(new String[]{"VirtualThread"}, new a(application), true);
        }
    }

    /* loaded from: classes6.dex */
    public static class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Application f15804a;
        private final Map<String, String> b = new HashMap();

        static {
            kge.a(531315232);
            kge.a(-1209827241);
        }

        public a(Application application) {
            this.f15804a = application;
        }

        @Override // com.taobao.orange.d
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("VirtualThread");
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
                File file = new File(this.f15804a.getFilesDir(), "virtual_thread_config.txt");
                if (a(jre.a().a(file), map)) {
                    return;
                }
                jre.a().a(map, file);
                com.taobao.android.virtual_thread.adapter.tb.a.a().a(new jrj(map));
            } catch (Throwable th) {
                jrk.a(th);
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
                if (!StringUtils.equals(entry.getValue(), map2.get(entry.getKey()))) {
                    return false;
                }
            }
            return true;
        }
    }
}
