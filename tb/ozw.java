package tb;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ozw implements pmf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(123308565);
        kge.a(668129862);
    }

    @Override // tb.pmf
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            UTABTest.activateServer(str, obj);
        }
    }

    @Override // tb.pmf
    public String a(String str, String str2, String str3, String str4) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{this, str, str2, str3, str4});
        }
        try {
            if (psm.G()) {
                String a2 = a(str, str2, str3);
                if (!StringUtils.isEmpty(a2)) {
                    plx.b("UTABTestAdapter", "debug包测试逻辑 activateDebug ab使用测试工具持久化值 " + str + "_" + str2 + "_" + str3 + " value " + a2);
                    return a2;
                }
            }
            VariationSet activate = UTABTest.activate(str, str2);
            if (activate != null && (variation = activate.getVariation(str3)) != null) {
                String valueAsString = variation.getValueAsString(str4);
                pqi a3 = pqi.a();
                a3.b("AB", str + " " + str2 + " " + str3 + " " + str4 + " return:" + valueAsString);
                return valueAsString;
            }
        } catch (Throwable unused) {
        }
        return str4;
    }

    @Override // tb.pmf
    public String b(String str, String str2, String str3, String str4) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f6525af", new Object[]{this, str, str2, str3, str4});
        }
        try {
            if (psm.G()) {
                String a2 = a(str, str2, str3);
                if (!StringUtils.isEmpty(a2)) {
                    plx.b("UTABTestAdapter", "debug包测试逻辑 activateDebug ab使用测试工具持久化值 " + str + "_" + str2 + "_" + str3 + " value " + a2);
                    return a2;
                }
            }
            VariationSet activateSync = EVO.activateSync(str, str2, null, null);
            if (activateSync != null && (variation = activateSync.getVariation(str3)) != null) {
                return variation.getValueAsString(str4);
            }
        } catch (Throwable unused) {
        }
        return str4;
    }

    private String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        try {
            SharedPreferences sharedPreferences = pmd.a().u().c().getSharedPreferences("ab_mock_value", 0);
            return sharedPreferences.getString(str + "_" + str2 + "_" + str3, "");
        } catch (Throwable unused) {
            return null;
        }
    }
}
