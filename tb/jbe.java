package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;

/* loaded from: classes6.dex */
public class jbe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        if (jar.a() == null) {
            jar.a(application);
        }
        OrangeConfig.getInstance().getConfigs("TBExecutor");
        OrangeConfig.getInstance().registerListener(new String[]{"TBExecutor"}, new a(), true);
    }

    /* loaded from: classes6.dex */
    public static class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        @Override // com.taobao.orange.d
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("TBExecutor");
            if (configs == null || configs.size() <= 0) {
                return;
            }
            a(configs);
        }

        private void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else if (map == null || map.size() <= 0) {
            } else {
                a(map.get("ex_thread_pool"));
                b(map);
                jax.a(map);
            }
        }

        private void b(Map<String, String> map) {
            FileWriter fileWriter;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
                return;
            }
            FileWriter fileWriter2 = null;
            try {
                try {
                    fileWriter = new FileWriter(new File(jar.a().getFilesDir(), ".orange_fake.txt"));
                    try {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            fileWriter.write(entry.getKey());
                            fileWriter.write("=");
                            fileWriter.write(entry.getValue());
                            fileWriter.write("\n");
                        }
                        jaz.a(fileWriter);
                    } catch (Exception e) {
                        e = e;
                        fileWriter2 = fileWriter;
                        jay.a(e);
                        jaz.a(fileWriter2);
                    } catch (Throwable th) {
                        th = th;
                        jaz.a(fileWriter);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                fileWriter = null;
            }
        }

        private void a(String str) {
            FileWriter fileWriter;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            File file = new File(jar.a().getFilesDir(), "ex_thread_pool.txt");
            if (TextUtils.isEmpty(str)) {
                file.delete();
                return;
            }
            FileWriter fileWriter2 = null;
            try {
                try {
                    fileWriter = new FileWriter(file);
                    try {
                        for (String str2 : str.split(";")) {
                            fileWriter.write(str2);
                            fileWriter.write("\n");
                        }
                        jaz.a(fileWriter);
                    } catch (Exception e) {
                        e = e;
                        fileWriter2 = fileWriter;
                        jay.a(e);
                        jaz.a(fileWriter2);
                    } catch (Throwable th) {
                        th = th;
                        jaz.a(fileWriter);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                fileWriter = null;
            }
        }
    }
}
