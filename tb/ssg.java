package tb;

import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import java.util.List;

/* loaded from: classes6.dex */
public class ssg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public static class a {
        public static final ssg INSTANCE;

        static {
            kge.a(-855148575);
            INSTANCE = new ssg();
        }
    }

    static {
        kge.a(1205578510);
    }

    public static /* synthetic */ void a(ssg ssgVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c62ab005", new Object[]{ssgVar, str, str2});
        } else {
            ssgVar.b(str, str2);
        }
    }

    public static ssg a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ssg) ipChange.ipc$dispatch("f0aa7f7", new Object[0]) : a.INSTANCE;
    }

    private ssg() {
    }

    public void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.ssg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ssg.a(ssg.this, str, str2);
                    }
                }
            });
        }
    }

    public void a(final String str, final List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.ssg.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ssg.a(ssg.this, str, JSON.toJSONString(list));
                    }
                }
            });
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        SharedPreferences a2 = kel.a();
        if (a2 == null) {
            kej.a("CacheTaskExecutor", "executeClearTask sp null");
        } else {
            a2.edit().remove(str).apply();
        }
    }

    public void a(final String str, final srm srmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f35b7f4", new Object[]{this, str, srmVar});
            return;
        }
        final SharedPreferences a2 = kel.a();
        if (a2 == null) {
            kej.a("CacheTaskExecutor", "executeLoadCacheTask sp null");
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.ssg.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        srmVar.a(a2.getString(str, null));
                    }
                }
            });
        }
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        SharedPreferences a2 = kel.a();
        if (a2 == null) {
            kej.a("CacheTaskExecutor", "saveData error sharedPreferences null");
            return;
        }
        SharedPreferences.Editor edit = a2.edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
