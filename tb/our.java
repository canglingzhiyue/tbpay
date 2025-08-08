package tb;

import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.e;
import com.taobao.tao.shop.rule.b;
import com.taobao.tao.shop.rule.data.TBBundleUrlRuleInfo;
import com.taobao.tao.shop.rule.util.c;

/* loaded from: classes8.dex */
public class our implements ouq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static our f32437a;

    static {
        kge.a(1503637964);
        kge.a(-1515083481);
        f32437a = new our();
    }

    private our() {
    }

    public static our a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (our) ipChange.ipc$dispatch("f08df52", new Object[0]) : f32437a;
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("com.taobao.tao.shop.ruleversion.cache.key");
        if (!StringUtils.isEmpty(str)) {
            sb.append("-");
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // tb.ouq
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        PreferenceManager.getDefaultSharedPreferences(e.b).edit().putString(b(str), str2).apply();
        return false;
    }

    @Override // tb.ouq
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        TBBundleUrlRuleInfo a2 = b.a(str);
        if (a2 != null && !StringUtils.isEmpty(a2.mRuleFileName)) {
            return c.a(str2, a2.mRuleFileName);
        }
        return false;
    }

    @Override // tb.ouq
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        TBBundleUrlRuleInfo a2 = b.a(str);
        if (a2 == null || StringUtils.isEmpty(a2.mRuleFileName)) {
            return null;
        }
        Log.e("TBSR", "getRuleFromFile=" + a2.mRuleFileName);
        return c.d(a2.mRuleFileName);
    }
}
