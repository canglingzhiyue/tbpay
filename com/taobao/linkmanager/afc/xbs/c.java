package com.taobao.linkmanager.afc.xbs;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage;
import com.taobao.application.common.a;
import com.taobao.flowcustoms.afc.model.AfcXbsData;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.flowcustoms.afc.xbs.e;
import com.taobao.linkmanager.afc.xbs.TBFloatingLayer;
import com.taobao.statistic.TBS;
import com.taobao.tao.welcome.Welcome;
import java.math.BigDecimal;
import java.util.HashMap;
import tb.kge;
import tb.koh;
import tb.mbm;

/* loaded from: classes7.dex */
public class c extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLOSE_REASON_BACKGROUND = "background";
    public static final String CLOSE_REASON_CLOSE_BTN = "close_btn";
    public static final String CLOSE_REASON_LEFT_SWIPE = "left_swipe";
    public static final String CLOSE_REASON_SWITCH_PAGE = "switch_page";
    public boolean i = false;
    public boolean j = false;
    private String k = "";

    static {
        kge.a(899901799);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 90991720:
                super.a();
                return null;
            case 94685804:
                super.e();
                return null;
            case 109716922:
                super.a((Activity) objArr[0]);
                return null;
            case 2074472273:
                return super.g();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public c() {
        com.taobao.application.common.c.a(new a.b() { // from class: com.taobao.linkmanager.afc.xbs.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.application.common.IApmEventListener
            public void onEvent(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                } else if (i != 1) {
                } else {
                    try {
                        if (!c.this.f17200a || TBFloatingLayer.f17694a == null || !c.this.j) {
                            return;
                        }
                        com.taobao.flowcustoms.afc.utils.c.a("linkx", "OnApmEventListener  === NOTIFY_FOREGROUND_2_BACKGROUND.退后台，小把手销毁");
                        c.this.a("background");
                    } catch (Throwable unused) {
                        com.taobao.flowcustoms.afc.utils.c.b("linkx", "OnApmEventListener.error.");
                    }
                }
            }
        });
    }

    @Override // com.taobao.flowcustoms.afc.xbs.e
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        mbm.a();
    }

    @Override // com.taobao.flowcustoms.afc.xbs.e
    public boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{this, activity})).booleanValue();
        }
        for (Class<?> cls : new Class[]{Welcome.class}) {
            if (activity.getClass() == cls) {
                return false;
            }
        }
        return !"UserLoginActivity".equals(activity.getClass().getSimpleName());
    }

    @Override // com.taobao.flowcustoms.afc.xbs.e, com.taobao.flowcustoms.afc.xbs.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String str = null;
        if (this.h != null) {
            str = this.h.f17179a;
        }
        TBS.Ext.commitEvent(1013, "applink_back", str, Long.valueOf(System.currentTimeMillis()));
        super.a();
    }

    @Override // com.taobao.flowcustoms.afc.xbs.e, com.taobao.flowcustoms.afc.xbs.d
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        b(str);
        i();
    }

    @Override // com.taobao.flowcustoms.afc.xbs.e
    public void a(AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7350423f", new Object[]{this, afcXbsData});
            return;
        }
        this.f17200a = true;
        if (this.h == null) {
            return;
        }
        this.i = com.taobao.flowcustoms.afc.xbs.a.b(afcXbsData);
        this.j = com.taobao.flowcustoms.afc.xbs.a.c(afcXbsData);
        TBFloatingLayer.a().a(BigDecimal.valueOf(System.currentTimeMillis() + (afcXbsData.expireTime > 0 ? afcXbsData.expireTime * 1000 : 10L))).a(TBFloatingLayer.FloatingType.SHOW_ONCE).a(this.h, afcXbsData).a(this).b();
    }

    @Override // com.taobao.flowcustoms.afc.xbs.e
    public void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{this, activity});
        } else {
            TBFloatingLayer.a().a(activity);
        }
    }

    @Override // com.taobao.flowcustoms.afc.xbs.e
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (TBFloatingLayer.f17694a == null) {
        } else {
            TBFloatingLayer.a().c();
        }
    }

    @Override // com.taobao.flowcustoms.afc.xbs.e, com.taobao.flowcustoms.afc.xbs.d
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        super.a(activity);
        if (activity == null) {
            return;
        }
        String b = AfcUtils.b(activity);
        com.taobao.flowcustoms.afc.utils.c.a("linkx", String.format("TbXbsPluginAdapter.onShow.activityKeyCode=%s.mShowActivityCode=%s.", b, this.k));
        this.k = b;
    }

    @Override // com.taobao.flowcustoms.afc.xbs.e
    public void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27d57fd", new Object[]{this, activity});
        } else if (!this.f17200a || TBFloatingLayer.f17694a == null || !this.i) {
        } else {
            String b = AfcUtils.b(activity);
            if (StringUtils.isEmpty(b) || StringUtils.isEmpty(this.k) || b.equals(this.k)) {
                return;
            }
            com.taobao.flowcustoms.afc.utils.c.a("linkx", String.format("TbXbsPluginAdapter.switchPage.切换页面，小把手销毁.activityKeyCode=%s.mShowActivityCode=%s.", b, this.k));
            a(CLOSE_REASON_SWITCH_PAGE);
        }
    }

    @Override // com.taobao.flowcustoms.afc.xbs.e
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.f17200a = false;
        this.k = "";
        TBFloatingLayer.a().d();
    }

    @Override // com.taobao.flowcustoms.afc.xbs.e
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.flowcustoms.afc.utils.b.a(2201, com.taobao.flowcustoms.afc.utils.b.ARG1_FLOW_EXPOSE, "", "", g());
        }
    }

    @Override // com.taobao.flowcustoms.afc.xbs.e
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            com.taobao.flowcustoms.afc.utils.b.a(2101, com.taobao.flowcustoms.afc.utils.b.ARG1_FLOW_BACK, "", "", g());
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1834032894:
                if (str.equals("left_swipe")) {
                    c = 0;
                    break;
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    c = 2;
                    break;
                }
                break;
            case -482160747:
                if (str.equals(CLOSE_REASON_CLOSE_BTN)) {
                    c = 1;
                    break;
                }
                break;
            case 2129249466:
                if (str.equals(CLOSE_REASON_SWITCH_PAGE)) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            com.taobao.flowcustoms.afc.utils.b.a(1013, "return_refer_app_swipe", "", "", g());
        } else if (c == 1) {
            com.taobao.flowcustoms.afc.utils.b.a(1013, "return_refer_app_close", "", "", g());
        } else if (c == 2) {
            com.taobao.flowcustoms.afc.utils.b.a(1013, "return_refer_app_background", "", "", g());
        } else if (c != 3) {
        } else {
            com.taobao.flowcustoms.afc.utils.b.a(1013, "return_refer_app_switchpage", "", "", g());
        }
    }

    @Override // com.taobao.flowcustoms.afc.xbs.e
    public HashMap<String, String> g() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7ba5ef51", new Object[]{this});
        }
        HashMap<String, String> g = super.g();
        String str = "";
        g.put("sourceAppkey", !StringUtils.isEmpty(this.h.f17179a) ? this.h.f17179a : str);
        g.put("source", !StringUtils.isEmpty(this.h.i) ? this.h.i : str);
        g.put(koh.SOURCE_PACKAGE_NAME, !StringUtils.isEmpty(com.taobao.flowcustoms.afc.a.b) ? com.taobao.flowcustoms.afc.a.b : str);
        g.put(FullPage.PARAM_BACK2Tab2URL, !StringUtils.isEmpty(this.h.h) ? this.h.h : str);
        if (!StringUtils.isEmpty(this.h.o)) {
            str = this.h.o;
        }
        g.put("url", str);
        if (this.h.G != null) {
            i = this.h.G.tipsStrategy;
        }
        g.put("xbsStrategy", String.valueOf(i));
        g.put(MspEventTypes.ACTION_INVOKE_SHOW_PAGE, String.valueOf(this.k));
        return g;
    }
}
