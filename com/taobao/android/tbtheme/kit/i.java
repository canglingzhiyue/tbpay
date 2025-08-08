package com.taobao.android.tbtheme.kit;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.util.HashMap;
import tb.kge;
import tb.mxw;
import tb.nom;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ThemeData c;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, ThemeData> f15439a = new HashMap<>();
    private HashMap<String, Integer> b = new HashMap<>();
    private h e = new h();

    /* loaded from: classes6.dex */
    public interface a {
        void a(int i);
    }

    static {
        kge.a(-177314780);
    }

    public static /* synthetic */ HashMap a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("43251c11", new Object[]{iVar}) : iVar.b;
    }

    public ThemeData a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("325e6660", new Object[]{this, str});
        }
        ThemeData b = b();
        if (!StringUtils.isEmpty(str) && this.f15439a.containsKey(str)) {
            if (b == null) {
                b = new ThemeData();
            }
            b.mergeData(this.f15439a.get(str));
        }
        return b;
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        String str3 = null;
        if (StringUtils.isEmpty(str2)) {
            return null;
        }
        ThemeData a2 = a(str);
        if (a2 != null) {
            if (mxw.KEY_SKIN_PIC.equalsIgnoreCase(str2)) {
                str3 = a2.skinPic;
            } else if (mxw.KEY_SKIN_COLOR.equalsIgnoreCase(str2)) {
                str3 = a2.skinColor;
            } else if ("actionBarBackgroundColor".equalsIgnoreCase(str2)) {
                str3 = a2.actionBarBackgroundColor;
            } else if ("actionBarBackgroundImage".equalsIgnoreCase(str2)) {
                str3 = a2.actionBarBackgroundImage;
            } else if ("actionbarTextColor".equalsIgnoreCase(str2)) {
                str3 = a2.actionbarTextColor;
            } else if ("statusBarStyle".equalsIgnoreCase(str2)) {
                str3 = a2.statusBarStyle;
            } else if (nom.KEY_NAVI_STYLE.equalsIgnoreCase(str2)) {
                str3 = a2.naviStyle;
            } else if ("isDarkText".equals(str2)) {
                str3 = "0".equalsIgnoreCase(a2.naviStyle) ? "false" : "true";
            } else if (com.taobao.homepage.view.widgets.bgcontainer.a.IS_COMPLEX_TEXTURE.equalsIgnoreCase(str2)) {
                str3 = a2.isComplexTexture;
            }
        }
        m.a("DXDataParserTaobaoGetTheme", "getThemePicOrColor:" + str, str2 + str3);
        return str3;
    }

    private ThemeData b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("46cd0889", new Object[]{this});
        }
        ThemeData themeData = null;
        if (f.a(f.IS_DARK_MODE_ADAPTER_OPEN, false) && this.e.a()) {
            themeData = c();
            a(themeData, "3");
        } else {
            if (e.a()) {
                themeData = a();
            }
            if (e.b()) {
                a(themeData, "2");
            } else if (e.c()) {
                a(themeData, "1");
            }
        }
        if (themeData != null && (!StringUtils.isEmpty(themeData.skinPic) || !StringUtils.isEmpty(themeData.skinColor))) {
            return themeData;
        }
        ThemeData e = e();
        a(e, "0");
        return e;
    }

    private void a(ThemeData themeData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f06b1f2e", new Object[]{this, themeData, str});
        } else if (themeData == null) {
        } else {
            themeData.themeLevel = str;
        }
    }

    private ThemeData c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("449628", new Object[]{this});
        }
        if (e.b()) {
            return a();
        }
        if (l.c()) {
            return d();
        }
        if (!e.c()) {
            return null;
        }
        return a();
    }

    public void a(String str, ThemeData themeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b1c9ae", new Object[]{this, str, themeData});
        } else if (StringUtils.isEmpty(str) || themeData == null) {
        } else {
            this.f15439a.put(str, themeData);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.f15439a.remove(str);
        }
    }

    public void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58913d9b", new Object[]{this, str, aVar});
        } else if (aVar == null) {
        } else {
            Integer num = this.b.get(str);
            if (num != null) {
                aVar.a(num.intValue());
            } else {
                com.taobao.phenix.intf.b.h().a(str).succListener(new AnonymousClass1(str, aVar)).fetch();
            }
        }
    }

    /* renamed from: com.taobao.android.tbtheme.kit.i$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass1 implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15440a;
        public final /* synthetic */ a b;

        public AnonymousClass1(String str, a aVar) {
            this.f15440a = str;
            this.b = aVar;
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public boolean a(final SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            Coordinator.execute(new Runnable() { // from class: com.taobao.android.tbtheme.kit.i.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SuccPhenixEvent succPhenixEvent2 = succPhenixEvent;
                    if (succPhenixEvent2 == null || succPhenixEvent2.getDrawable() == null) {
                        return;
                    }
                    final int a2 = c.a(succPhenixEvent.getDrawable().getBitmap());
                    com.taobao.android.festival.utils.d.a(new Runnable() { // from class: com.taobao.android.tbtheme.kit.i.1.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            i.a(i.this).put(AnonymousClass1.this.f15440a, Integer.valueOf(a2));
                            AnonymousClass1.this.b.a(a2);
                        }
                    });
                }
            });
            return false;
        }
    }

    public static ThemeData a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("8d557aea", new Object[0]);
        }
        ThemeData themeData = new ThemeData();
        themeData.actionbarTextColor = e.b("actionbarTextColor");
        themeData.actionBarBackgroundColor = e.b("actionBarBackgroundColor");
        themeData.actionBarBackgroundImage = e.b("actionBarBackgroundImage");
        themeData.skinPic = e.a(mxw.KEY_SKIN_PIC);
        themeData.skinColor = e.a(mxw.KEY_SKIN_COLOR);
        themeData.statusBarStyle = e.b("statusBarStyle");
        themeData.naviStyle = e.b(nom.KEY_NAVI_STYLE);
        themeData.isComplexTexture = "true";
        return themeData;
    }

    private ThemeData d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("b9bc23c7", new Object[]{this});
        }
        ThemeData themeData = new ThemeData();
        themeData.actionbarTextColor = "#EEEEEE";
        themeData.actionBarBackgroundColor = "#111111";
        themeData.actionBarBackgroundImage = "";
        themeData.skinPic = "";
        themeData.skinColor = "#111111";
        themeData.statusBarStyle = "1";
        themeData.naviStyle = "0";
        themeData.isComplexTexture = "false";
        return themeData;
    }

    private ThemeData e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("7333b166", new Object[]{this});
        }
        if (this.c == null) {
            this.c = l.a(f.b());
            if (this.c == null) {
                this.c = new ThemeData();
            }
            if (StringUtils.isEmpty(this.c.skinColor) && StringUtils.isEmpty(this.c.skinPic)) {
                ThemeData themeData = this.c;
                themeData.actionbarTextColor = "#111111";
                themeData.actionBarBackgroundColor = "#ffffff";
                themeData.actionBarBackgroundImage = "";
                themeData.skinPic = "";
                themeData.skinColor = "#fff2f2f2";
                themeData.statusBarStyle = "1";
                themeData.naviStyle = "1";
                themeData.isComplexTexture = "false";
            }
        }
        ThemeData themeData2 = this.c;
        if (themeData2 == null) {
            return null;
        }
        return themeData2.m1027clone();
    }
}
