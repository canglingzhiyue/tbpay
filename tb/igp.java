package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.io.File;
import java.util.Map;

/* loaded from: classes6.dex */
public class igp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static SharedPreferences f29015a;
    private static final boolean b;

    public static /* synthetic */ SharedPreferences b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("811fa7d", new Object[0]) : f29015a;
    }

    static {
        kge.a(-857485006);
        b = new File("/data/local/tmp/.tbquality/.test_switch_on").exists();
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        f29015a = context.getSharedPreferences("tb_quality_android", 0);
        OrangeConfig.getInstance().registerListener(new String[]{"tb_quality_android"}, new d() { // from class: tb.igp.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                } else if (!"tb_quality_android".equals(str)) {
                } else {
                    String config = OrangeConfig.getInstance().getConfig("tb_quality_android", "switch_on", "false");
                    igp.b().edit().putString("switch_on", config).apply();
                    igo.a("TBQualitySwitches", "orange config updated, orange update from network", ";namespace:", "tb_quality_android", "; KEY_SWITCH:", config, ";");
                }
            }
        }, false);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = f29015a;
        if (sharedPreferences != null) {
            return Boolean.parseBoolean(sharedPreferences.getString("switch_on", "true"));
        }
        return false;
    }
}
