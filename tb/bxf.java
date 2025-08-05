package tb;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightbuy.LightBuyFragment;
import com.taobao.android.purchase.aura.render.fragment.TBBuyHalfScreenFragment;
import com.taobao.android.weex_framework.g;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class bxf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1395537133);
    }

    public static void a(FragmentActivity fragmentActivity, Map<String, String> map, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8951cb0c", new Object[]{fragmentActivity, map, gVar});
            return;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                bundle.putString(str, map.get(str));
            }
        }
        LightBuyFragment lightBuyFragment = new LightBuyFragment();
        lightBuyFragment.setMUSInstanceRenderListener(gVar);
        lightBuyFragment.setArguments(bundle);
        try {
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("fragment_general_purchase_container");
            if (findFragmentByTag == null) {
                List<Fragment> fragments = supportFragmentManager.getFragments();
                StringBuilder sb = new StringBuilder();
                sb.append("当前fragment size：");
                sb.append(fragments != null ? Integer.valueOf(fragments.size()) : "0");
                afk.b("EXCEPTION_FRAGMENT_EMPTY", sb.toString());
                if (fragments != null && fragments.size() > 0) {
                    findFragmentByTag = fragments.get(0);
                }
            }
            beginTransaction.replace(findFragmentByTag.getId(), lightBuyFragment, "fragment_light_buy_container");
            beginTransaction.commitAllowingStateLoss();
        } catch (Throwable th) {
            afk.b("EXCEPTION_FRAGMENT_REPLACE", th.toString());
        }
    }

    public static void a(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831e55bb", new Object[]{fragmentActivity});
            return;
        }
        try {
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.replace(supportFragmentManager.findFragmentByTag("fragment_light_buy_container").getId(), new TBBuyHalfScreenFragment(), "fragment_general_purchase_container");
            beginTransaction.commitAllowingStateLoss();
        } catch (Throwable th) {
            afk.b("EXCEPTION_FRAGMENT_REPLACE", th.toString());
        }
    }
}
