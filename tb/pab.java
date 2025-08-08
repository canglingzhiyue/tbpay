package tb;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.taolive.room.utils.n;
import java.util.Map;

/* loaded from: classes8.dex */
public class pab implements pmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-807042089);
        kge.a(-1976708749);
    }

    @Override // tb.pmi
    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        if (psm.H()) {
            String a2 = a(str, str2);
            if (!StringUtils.isEmpty(a2)) {
                plx.b("TBOrangeConfig", "orange使用测试工具持久化值 " + str + "_" + str2 + " value " + a2);
                return a2;
            }
        }
        if (!StringUtils.isEmpty(poy.ak(n.b()))) {
            OrangeConfig orangeConfig = OrangeConfig.getInstance();
            return orangeConfig.getConfig(str + "_" + poy.ak(n.b()), str2, OrangeConfig.getInstance().getConfig(str, str2, str3));
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }

    @Override // tb.pmi
    public String b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87942679", new Object[]{this, str, str2, str3});
        }
        String a2 = psl.a(str2);
        return StringUtils.isEmpty(a2) ? a(str, str2, str3) : a2;
    }

    @Override // tb.pmi
    public void a(final String str, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{str}, new d() { // from class: tb.pab.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str2, Map<String, String> map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str2, map2});
                        return;
                    }
                    OrangeConfig.getInstance().unregisterListener(new String[]{str}, this);
                    Map map3 = map;
                    if (map3 == null) {
                        return;
                    }
                    for (String str3 : map3.keySet()) {
                        psl.a(str3, pab.this.a(str, str3, (String) map.get(str3)));
                    }
                }
            }, true);
        }
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        try {
            SharedPreferences sharedPreferences = pmd.a().u().c().getSharedPreferences("orange_mock_value", 0);
            return sharedPreferences.getString(str + "_" + str2, "");
        } catch (Throwable unused) {
            return null;
        }
    }
}
