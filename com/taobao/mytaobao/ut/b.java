package com.taobao.mytaobao.ut;

import android.util.Pair;
import com.taobao.global.setting.util.h;
import com.taobao.mytaobao.basement.BasementConstants;
import com.taobao.mytaobao.basement.i;
import com.taobao.mytaobao.homepage.MyTaobaoFragment;
import com.taobao.mytaobao.newSettingV2.NewGeneralSettingV2Activity;
import com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public final class b {
    public static final List<Pair<String, String>> FONT_SETTING_TRACKS;

    /* renamed from: a  reason: collision with root package name */
    public static String[][] f18533a;

    static {
        kge.a(-796976387);
        f18533a = new String[][]{new String[]{MyTaobaoFragment.class.getName(), "Page_MyTaobao", "a2141.7631743"}, new String[]{NewTaobaoSettingActivity.class.getName(), "Page_TBAccountSettingVC", null}, new String[]{NewGeneralSettingV2Activity.class.getName(), h.PAGE_NAME, null}, new String[]{i.class.getName(), com.taobao.mytaobao.basement.monitor.b.MODULE_NAME, BasementConstants.SPM}};
        FONT_SETTING_TRACKS = new ArrayList<Pair<String, String>>() { // from class: com.taobao.mytaobao.ut.UserTrackConstants$1
            {
                add(new Pair("Page_MYTBSettingVC_generic_字体大小_标准-1", "a2141.20998086.3.17.2"));
                add(new Pair("Page_MYTBSettingVC_generic_字体大小_标准", "a2141.20998086.3.17.1"));
                add(new Pair("Page_MYTBSettingVC_generic_字体大小_标准+1", "a2141.20998086.3.17.3"));
                add(new Pair("Page_MYTBSettingVC_generic_字体大小_标准+2", "a2141.20998086.3.17.4"));
                add(new Pair("Page_MYTBSettingVC_generic_字体大小_标准+3", "a2141.20998086.3.17.5"));
            }
        };
    }
}
