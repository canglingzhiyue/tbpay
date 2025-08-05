package tb;

import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.c;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.FandomPreLiveInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* loaded from: classes8.dex */
public class pez {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BaseActivity f32579a;
    private boolean b;

    static {
        kge.a(-56605614);
    }

    public pez(BaseActivity baseActivity) {
        this.f32579a = baseActivity;
    }

    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
        }
        a a2 = n.a();
        if (poy.J(a2)) {
            FandomPreLiveInfo G = poy.G(a2);
            if (G == null) {
                return null;
            }
            String b = c.b(this.f32579a, G.title);
            String a3 = c.a(G.liveId);
            FandomInfo H = poy.H(a2);
            return pmd.a().p().b(this.f32579a, b, G.coverImg, G.liveId, G.topic, false, a3, H != null ? H.shareWeexUrl : "", "taobaolive_fandom", null);
        }
        VideoInfo u = poy.u(n.a());
        if (u == null || u.broadCaster == null || u.shareUrlDO == null || (aa.cZ() && u.liveId != null && !u.liveId.equals(n.a().d))) {
            return null;
        }
        String str = u.broadCaster.accountName;
        String format = String.format("%1$s的直播简直有毒，快来看！\n%2$s", str, u.title);
        if (!TextUtils.isEmpty(aa.ae())) {
            format = String.format(aa.ae(), str, u.title);
        }
        return pmd.a().p().b(this.f32579a, format, TextUtils.isEmpty(u.shareUrlDO.bgImgUrl) ? u.coverImg : u.shareUrlDO.bgImgUrl, u.liveId, u.topic, false, u.shareUrlDO.shareUrl, u.shareUrlDO.shareCardUrl, "zhibo_normal", null);
    }

    public void a(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2945670", new Object[]{this, menu});
        } else if (menu == null) {
        } else {
            if (menu.findItem(R.id.taolive_menu_register) == null && !this.b) {
                this.f32579a.getMenuInflater().inflate(R.menu.taolive_room_menu, menu);
                this.b = true;
            }
            this.f32579a.getPublicMenu().togglePublicMenu(true);
            this.f32579a.getPublicMenu().onCreateOptionsMenu(this.f32579a.getMenuInflater(), menu);
            this.f32579a.getPublicMenu().removeCustomMenuItemsByType("report");
        }
    }

    public void b(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae95e54f", new Object[]{this, menu});
        } else if (menu == null || menu.findItem(R.id.taolive_menu_register) != null || this.b) {
        } else {
            this.f32579a.getMenuInflater().inflate(R.menu.taolive_room_menu, menu);
            this.b = true;
        }
    }

    public boolean a(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("703c2261", new Object[]{this, menuItem})).booleanValue();
        }
        if (menuItem != null && menuItem.getItemId() == R.id.taolive_menu_register) {
            BaseActivity baseActivity = this.f32579a;
            s.a(baseActivity, aa.a(baseActivity));
            return true;
        } else if (menuItem == null || menuItem.getItemId() != R.id.taolive_menu_report) {
            return false;
        } else {
            if (pmd.a().q() != null && pmd.a().q().c()) {
                a a2 = n.a();
                ddw.a().a(pfd.EVENT_START_REPORT, null, a2 != null ? a2.G() : null);
            } else if (pmd.a().q() != null) {
                try {
                    pmd.a().q().a(this.f32579a, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return true;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f32579a.getPublicMenu();
        }
    }
}
