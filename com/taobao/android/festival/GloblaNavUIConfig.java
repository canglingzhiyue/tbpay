package com.taobao.android.festival;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.taobao.TBActionBar;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.festival.b;
import com.taobao.android.festival.skin.SkinConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.navigation.NavigationTabIconSourceType;
import com.taobao.tao.navigation.e;
import com.taobao.tao.navigation.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.giy;
import tb.gjd;
import tb.gje;
import tb.kge;

/* loaded from: classes5.dex */
public class GloblaNavUIConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_GLOBAL_ACTIONBAR_TEXT_COLOR = "actionbarTextColor";
    public static final String KEY_GLOBAL_ACTIONBAR_UPINDICATOR = "actionBarUpIndicator";
    public static final String KEY_GLOBAL_MSGCENTER_BORDER_COLOR = "messageBorderColor";
    public static final String KEY_GLOBAL_MSGCENTER_NUM_COLOR = "messageNumColor";

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f12338a;

    /* renamed from: com.taobao.android.festival.GloblaNavUIConfig$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12341a;
        public static final /* synthetic */ int[] b = new int[TABBAR_IMAGE_TYPE.values().length];

        static {
            try {
                b[TABBAR_IMAGE_TYPE.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[TABBAR_IMAGE_TYPE.WEITAO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[TABBAR_IMAGE_TYPE.CART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[TABBAR_IMAGE_TYPE.MYTAOBAO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[TABBAR_IMAGE_TYPE.COMMUNITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f12341a = new int[TBActionBar.ActionBarStyle.values().length];
            try {
                f12341a[TBActionBar.ActionBarStyle.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12341a[TBActionBar.ActionBarStyle.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes5.dex */
    enum TABBAR_IMAGE_TYPE {
        HOME("tabbarImagesURL_home", "tabbarImagesURL_home_selected"),
        WEITAO("tabbarImagesURL_we", "tabbarImagesURL_we_selected"),
        COMMUNITY("tabbarImagesURL_community", "tabbarImagesURL_community_selected"),
        CART("tabbarImagesURL_cart", "tabbarImagesURL_cart_selected"),
        MYTAOBAO("tabbarImagesURL_my", "tabbarImagesURL_my_selected");
        
        public String selected;
        public String unselect;

        TABBAR_IMAGE_TYPE(String str, String str2) {
            this.unselect = str;
            this.selected = str2;
        }
    }

    static {
        kge.a(-589876728);
    }

    public GloblaNavUIConfig(Context context) {
        this.f12338a = new WeakReference<>(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r26, final android.view.View r27, android.support.v7.taobao.TBActionBar.ActionBarStyle r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.festival.GloblaNavUIConfig.a(android.content.Context, android.view.View, android.support.v7.taobao.TBActionBar$ActionBarStyle, boolean):void");
    }

    public void a(Context context, View view, TBActionBar.ActionBarStyle actionBarStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87949a5", new Object[]{this, context, view, actionBarStyle});
        } else {
            a(context, view, actionBarStyle, false);
        }
    }

    public static void a() {
        Pair pair;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        FestivalMgr a2 = FestivalMgr.a();
        final boolean i2 = a2.i();
        ArrayList arrayList = new ArrayList();
        final HashMap hashMap = new HashMap();
        String str = "global";
        String a3 = a2.a(str, "tabbarImagesURL_home_second_selected");
        String a4 = a2.a(str, "tabbarImagesURL_community_selected");
        if (StringUtils.isEmpty(a3)) {
            a3 = "//gw.alicdn.com/mt/TB1WyjhPpXXXXb9XpXXXXXXXXXX-156-156.png";
        }
        if (StringUtils.isEmpty(a4)) {
            a4 = "//gw.alicdn.com/mt/TB1abm0PpXXXXcfaXXXXXXXXXXX-156-156.png";
        }
        final int a5 = a2.a(str, "tabbarTextColorSel", Color.parseColor("#ff5000"));
        final int a6 = a2.a(str, "tabbarTextColorUnSel", Color.parseColor("#3D4245"));
        final int parseColor = Color.parseColor("#c1c4cd");
        final String a7 = a2.a(str, "tabbarImagesURL_tabbar_bkg");
        TABBAR_IMAGE_TYPE[] values = TABBAR_IMAGE_TYPE.values();
        int length = values.length;
        while (i < length) {
            TABBAR_IMAGE_TYPE tabbar_image_type = values[i];
            TABBAR_IMAGE_TYPE[] tabbar_image_typeArr = values;
            arrayList.add(new Pair(str, tabbar_image_type.unselect));
            arrayList.add(new Pair(str, tabbar_image_type.selected));
            String a8 = a2.a(str, tabbar_image_type.unselect);
            String a9 = a2.a(str, tabbar_image_type.selected);
            FestivalMgr festivalMgr = a2;
            int i3 = AnonymousClass3.b[tabbar_image_type.ordinal()];
            String str2 = str;
            if (i3 == 1) {
                pair = new Pair(a8, a3);
            } else if (i3 == 2 || i3 == 3 || i3 == 4) {
                pair = new Pair(a8, a9);
            } else {
                pair = i3 != 5 ? null : new Pair(a8, a4);
            }
            hashMap.put(tabbar_image_type, pair);
            i++;
            values = tabbar_image_typeArr;
            str = str2;
            a2 = festivalMgr;
        }
        new gjd().a(arrayList, new gjd.d() { // from class: com.taobao.android.festival.GloblaNavUIConfig.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gjd.d
            public void a(boolean z) {
                Map map;
                TABBAR_IMAGE_TYPE tabbar_image_type2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else if (!z) {
                    FestivalMgr.a().a(false);
                    e.f();
                } else {
                    ArrayList<g> e = e.e();
                    Iterator<g> it = e.iterator();
                    while (it.hasNext()) {
                        g next = it.next();
                        if (next != null) {
                            int o = next.o();
                            if (o == 0) {
                                map = hashMap;
                                tabbar_image_type2 = TABBAR_IMAGE_TYPE.HOME;
                            } else if (o == 1) {
                                map = hashMap;
                                tabbar_image_type2 = TABBAR_IMAGE_TYPE.WEITAO;
                            } else if (o == 2) {
                                map = hashMap;
                                tabbar_image_type2 = TABBAR_IMAGE_TYPE.COMMUNITY;
                            } else if (o != 3) {
                                if (o == 4) {
                                    map = hashMap;
                                    tabbar_image_type2 = TABBAR_IMAGE_TYPE.MYTAOBAO;
                                }
                                next.b(a5);
                                next.a(a6);
                                next.f(FestivalMgr.a().a(next.o()));
                            } else {
                                map = hashMap;
                                tabbar_image_type2 = TABBAR_IMAGE_TYPE.CART;
                            }
                            next.a((Pair) map.get(tabbar_image_type2));
                            next.b(a5);
                            next.a(a6);
                            next.f(FestivalMgr.a().a(next.o()));
                        }
                    }
                    HashMap hashMap2 = new HashMap();
                    SkinConfig d = gje.a().d();
                    b a10 = b.a();
                    String str3 = "";
                    hashMap2.put("festivalCode", a10 != null ? a10.a("global", "festivalCode") : str3);
                    if (d != null) {
                        str3 = d.skinCode;
                    }
                    hashMap2.put("skinCode", str3);
                    for (int i4 = 0; i4 < e.size(); i4++) {
                        e.get(i4).a(NavigationTabIconSourceType.URL);
                    }
                    if (StringUtils.isEmpty(a7)) {
                        e.a(e, new ColorDrawable(-1), parseColor, i2);
                    } else {
                        e.a(e, a7, 0, i2);
                    }
                    giy.a(Globals.getApplication(), hashMap2);
                    FestivalMgr.a().a(true);
                }
            }
        });
    }
}
