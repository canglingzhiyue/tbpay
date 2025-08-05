package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.taobao.R;

/* loaded from: classes7.dex */
public class ohu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Integer f32073a;

    static {
        kge.a(1180084467);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        TBFragmentTabHost fragmentTabHost = TBMainHost.a().getFragmentTabHost();
        if (fragmentTabHost == null) {
            lap.a("BottomTabBar", "TabBarChangeUtil", "hideTBFragmentTabHost tbFragmentTabHost == null");
            return;
        }
        fragmentTabHost.setVisibility(8);
        View findViewById = TBMainHost.a().findViewById(R.id.tbTabFragment);
        if (findViewById == null) {
            lap.a("BottomTabBar", "TabBarChangeUtil", "hideTBFragmentTabHost tabBarContent == null");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        f32073a = Integer.valueOf(marginLayoutParams.bottomMargin);
        marginLayoutParams.bottomMargin = 0;
        findViewById.setLayoutParams(marginLayoutParams);
        lap.a("BottomTabBar", "TabBarChangeUtil", "hideTBFragmentTabHost");
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        TBFragmentTabHost fragmentTabHost = TBMainHost.a().getFragmentTabHost();
        if (fragmentTabHost == null || f32073a == null) {
            lap.a("BottomTabBar", "TabBarChangeUtil", "showTBFragmentTabHost tbFragmentTabHost == null");
            return;
        }
        fragmentTabHost.setVisibility(0);
        View findViewById = TBMainHost.a().findViewById(R.id.tbTabFragment);
        if (findViewById == null) {
            lap.a("BottomTabBar", "TabBarChangeUtil", "showTBFragmentTabHost tabBarContent == null");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.bottomMargin = f32073a.intValue();
        findViewById.setLayoutParams(marginLayoutParams);
        lap.a("BottomTabBar", "TabBarChangeUtil", "showTBFragmentTabHost");
    }
}
