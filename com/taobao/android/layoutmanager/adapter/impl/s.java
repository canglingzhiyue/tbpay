package com.taobao.android.layoutmanager.adapter.impl;

import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival;
import java.util.Map;
import tb.kge;
import tb.nom;

/* loaded from: classes5.dex */
public class s implements IFestival {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1769579818);
        kge.a(-192217099);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival
    public IFestival.FestivalInfo a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IFestival.FestivalInfo) ipChange.ipc$dispatch("5e052808", new Object[]{this}) : j();
    }

    private static IFestival.FestivalInfo j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFestival.FestivalInfo) ipChange.ipc$dispatch("e5ff795f", new Object[0]);
        }
        IFestival.FestivalInfo festivalInfo = new IFestival.FestivalInfo();
        ThemeData f = com.taobao.android.tbtheme.kit.j.f();
        boolean c = c();
        festivalInfo.isFestivalOn = c;
        if (c) {
            festivalInfo.mode = d();
            festivalInfo.color = h();
            festivalInfo.url = i();
            festivalInfo.navigationColor = f.actionBarBackgroundColor;
            festivalInfo.navigationImage = f.actionBarBackgroundImage;
            festivalInfo.statusBarStyle = f.statusBarStyle;
            festivalInfo.textColor = f.actionbarTextColor;
            festivalInfo.textColorStyle = f.naviStyle;
            festivalInfo.festivalCode = f();
        }
        festivalInfo.hasTabbarFestival = e();
        festivalInfo.naviStyle = g();
        festivalInfo.isTabbarTitleSplit = FestivalMgr.a().i();
        return festivalInfo;
    }

    public static Map b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]) : j().toMap();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : d() != 0;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        if (com.taobao.android.tbtheme.kit.j.e()) {
            return 1;
        }
        return com.taobao.android.tbtheme.kit.j.d() ? 2 : 0;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : FestivalMgr.a().h();
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : com.taobao.android.festival.festival.b.a().a("global", "festivalCode");
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : FestivalMgr.a().a("global", nom.KEY_NAVI_STYLE);
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]);
        }
        try {
            String str = com.taobao.android.tbtheme.kit.j.f().actionBarBackgroundColor;
            if (TextUtils.isEmpty(str)) {
                str = com.taobao.android.tbtheme.kit.j.f().skinColor;
            }
            if (str != null && str.length() > 0 && str.charAt(0) == '#') {
                return str;
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            int parseColor = Color.parseColor(str);
            String str2 = "#" + Integer.toHexString(parseColor);
            int length = str2.length();
            if (length <= 7) {
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append('#');
            int i = (length - 7) + 1;
            sb.append(str2.substring(i));
            sb.append(str2.substring(1, i));
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : com.taobao.android.tbtheme.kit.j.f().skinPic;
    }
}
