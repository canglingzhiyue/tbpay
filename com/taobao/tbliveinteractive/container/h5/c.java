package com.taobao.tbliveinteractive.container.h5;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.taobao.util.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolivecontainer.TBLiveH5Container;
import com.taobao.tbliveinteractive.container.h5.TaoLiveWebBottomFragment;
import java.util.HashMap;
import java.util.Map;
import tb.ddw;
import tb.kge;
import tb.phg;
import tb.pmd;
import tb.psn;
import tb.pso;
import tb.qnh;
import tb.sem;
import tb.xkw;

/* loaded from: classes8.dex */
public final class c implements sem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Boolean i;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.taolivecontainer.b f22119a;
    private final Context b;
    private Map<String, String> c;
    private String d;
    private com.taobao.tbliveinteractive.e e;
    private boolean f;
    private String g;
    private com.taobao.tbliveinteractive.jsbridge.e h;
    private boolean j;
    public String k;

    static {
        kge.a(112025494);
        kge.a(-1972053169);
        i = null;
    }

    public c(Context context, Map<String, String> map, final com.taobao.tbliveinteractive.e eVar) {
        this.b = context;
        this.e = eVar;
        this.c = map;
        this.f22119a = new com.taobao.taolivecontainer.b(this.b, "LiveRoomHalf", new pso() { // from class: com.taobao.tbliveinteractive.container.h5.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pso
            public void a(String str, String str2, HashMap<String, String> hashMap) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a507bab7", new Object[]{this, str, str2, hashMap});
                } else {
                    qnh.a(eVar, str, str2, hashMap);
                }
            }

            @Override // tb.pso
            public void b(String str, String str2, HashMap<String, String> hashMap) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ab0b8616", new Object[]{this, str, str2, hashMap});
                } else {
                    qnh.b(eVar, str, str2, hashMap);
                }
            }

            @Override // tb.pso
            public void a(String str, String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                    return;
                }
                k.a(str + "_" + str2, str3);
            }
        }, new psn() { // from class: com.taobao.tbliveinteractive.container.h5.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.psn
            public String a(String str, String str2, String str3) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3}) : pmd.a().d().a(str, str2, str3);
            }
        }, new String[]{d.a()});
    }

    private FragmentManager e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("b40c0b5b", new Object[]{this});
        }
        Context context = this.b;
        if (!(context instanceof FragmentActivity)) {
            return null;
        }
        return ((FragmentActivity) context).getSupportFragmentManager();
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.j;
    }

    public void bg_() {
        String orDefault;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5361441", new Object[]{this});
            return;
        }
        TaoLiveWebBottomFragment.a a2 = new TaoLiveWebBottomFragment.a().a(this.b).a(this.e.r()).a(this.f22119a).a(this);
        if (this.c.containsKey("showLoading")) {
            try {
                a2.b(Boolean.parseBoolean(this.c.get("showLoading")));
            } catch (Throwable unused) {
                pmd.a().m().a("H5ContainerV2", "tlHalfContainerShowLoading解析失败");
            }
        }
        if (this.c.containsKey("maxHeight")) {
            try {
                a2.c(Float.parseFloat(this.c.get("maxHeight")));
            } catch (Throwable unused2) {
                k.a("H5ContainerV2", "parse height error, default height: 0.725f");
            }
        }
        if (this.c.containsKey("supportUpScrollPage")) {
            try {
                a2.c(Boolean.parseBoolean(this.c.get("supportUpScrollPage")));
            } catch (Throwable unused3) {
                k.a("H5ContainerV2", "parse scroll page fail");
            }
        }
        if (this.c.containsKey("contentBackColor")) {
            a2.b(this.c.get("contentBackColor"));
        }
        if (this.c.containsKey("backgroundColor")) {
            a2.a(this.c.get("backgroundColor"));
        }
        if (this.c.containsKey("panEnable")) {
            try {
                boolean parseBoolean = Boolean.parseBoolean(this.c.get("panEnable"));
                a2.a(parseBoolean);
                if (parseBoolean && (orDefault = this.c.getOrDefault("panOffsetToClose", null)) != null) {
                    a2.a(Float.parseFloat(orDefault));
                }
            } catch (Throwable unused4) {
                k.a("H5ContainerV2", "parse pan fail, default pan enable: true, pan offset to close: 0.2f");
            }
        }
        if (this.c.containsKey("cornerRadius")) {
            try {
                a2.b(Float.parseFloat(this.c.get("cornerRadius")));
            } catch (Throwable unused5) {
                k.a("H5ContainerV2", "parse corner radius fail, default corner radius: 27f(dp)");
            }
        }
        if (this.c.containsKey("expandHeightPercent")) {
            try {
                a2.d(Float.parseFloat(this.c.get("expandHeightPercent")));
            } catch (Throwable unused6) {
                k.a("H5ContainerV2", "parse expand height percent fail, default expand height percent: 0.9f");
            }
        }
        if (this.c.containsKey("hideScrollGuide")) {
            try {
                a2.d(Boolean.parseBoolean(this.c.get("hideScrollGuide")));
            } catch (Throwable unused7) {
                k.a("H5ContainerV2", "parse hide scroll guide fail");
            }
        }
        if (this.c.containsKey("hideLiveCloseBtn")) {
            try {
                a2.e(Boolean.parseBoolean(this.c.get("hideLiveCloseBtn")));
            } catch (Throwable unused8) {
                k.a("H5ContainerV2", "parse hide live close btn fail");
            }
        }
        if (this.c.containsKey("transparentTopMargin")) {
            try {
                a2.a(Integer.parseInt(this.c.get("transparentTopMargin")));
            } catch (Throwable unused9) {
                k.a("H5ContainerV2", "parse transparent top margin fail");
            }
        }
        if (this.c.containsKey("usePlaceholderLoading")) {
            try {
                a2.f(Boolean.parseBoolean(this.c.get("usePlaceholderLoading")));
            } catch (Throwable unused10) {
                k.a("H5ContainerV2", "parse use placeholder loading fail");
            }
        }
        TaoLiveWebBottomFragment a3 = a2.a();
        this.j = true;
        FragmentManager e = e();
        if (e != null) {
            a3.show(e, TaoLiveWebBottomFragment.tag());
        }
        if (phg.d().a()) {
            ddw.a().a(xkw.EVENT_CLEAR_SCREEN_NEW, true);
            return;
        }
        ddw.a().a(xkw.EVENT_CLEAR_SCREEN_IMMERSIVE, "H5ContainerV2");
        HashMap hashMap = new HashMap();
        hashMap.put("scene", "H5ContainerV2");
        hashMap.put("isMoveUp", "true");
        hashMap.put("containerHeight", String.valueOf((int) (a2.b() * com.taobao.taolive.room.utils.d.f())));
        ddw.a().a(xkw.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.d = str;
        this.f22119a.b(str);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.j = false;
        this.f = true;
        this.g = null;
        com.taobao.taolivecontainer.b bVar = this.f22119a;
        if (bVar != null && bVar.b() != null) {
            TBLiveH5Container b = this.f22119a.b();
            if (!b.isDestroied()) {
                b.destroy();
            }
        }
        com.taobao.tbliveinteractive.e eVar = this.e;
        if (eVar != null) {
            eVar.a(this);
            this.e = null;
        }
        if (phg.d().a()) {
            ddw.a().a(xkw.EVENT_CLEAR_SCREEN_NEW, false);
        } else {
            ddw.a().a(xkw.EVENT_CLEAR_SCREEN_IMMERSIVE_RECOVER, "H5ContainerV2");
            HashMap hashMap = new HashMap();
            hashMap.put("isMoveUp", "false");
            hashMap.put("scene", "H5ContainerV2");
            ddw.a().a(xkw.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap);
        }
        ddw.a().a(xkw.EVENT_H5_CONTAINER_DESTROY);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.c = map;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        this.f22119a.a(str);
        this.g = str;
    }

    public Uri c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("eb8a50a1", new Object[]{this});
        }
        String str = this.g;
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f;
    }

    @Override // tb.sem
    public com.taobao.tbliveinteractive.jsbridge.e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tbliveinteractive.jsbridge.e) ipChange.ipc$dispatch("a55c7557", new Object[]{this}) : this.h;
    }

    public void a(com.taobao.tbliveinteractive.jsbridge.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c755e97", new Object[]{this, eVar});
            return;
        }
        this.h = eVar;
        com.taobao.taolivecontainer.b bVar = this.f22119a;
        if (bVar == null) {
            return;
        }
        bVar.a(this);
    }
}
