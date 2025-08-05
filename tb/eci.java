package tb;

import android.support.v4.view.PagerAdapter;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.widget.DetailViewPager;
import com.taobao.android.nav.Nav;

/* loaded from: classes4.dex */
public class eci {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailViewPager f27191a;
    private DetailCoreActivity b;
    private String c;

    static {
        kge.a(1336886306);
    }

    public eci(DetailCoreActivity detailCoreActivity) {
        this.b = detailCoreActivity;
        this.f27191a = (DetailViewPager) this.b.U();
        emu.a("com.taobao.android.detail.core.detail.shop.NavBarShopController");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        DetailViewPager detailViewPager = this.f27191a;
        detailViewPager.setEdgePageListener(new ech(this.b, this, (ViewGroup) detailViewPager.getParent()));
        this.c = str;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c = null;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a();
        this.f27191a.setEdgePageListener(null);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c == null) {
        } else {
            Nav.from(this.b).toUri(this.c);
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        DetailViewPager detailViewPager = this.f27191a;
        if (detailViewPager != null && detailViewPager.getAdapter() != null) {
            PagerAdapter adapter = this.f27191a.getAdapter();
            if (adapter.getCount() == 1) {
                return "宝贝";
            }
            if (adapter.getCount() == 2) {
                return "内容";
            }
        }
        return "";
    }
}
