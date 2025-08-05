package com.tmall.wireless.membershop.core;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.Map;

/* loaded from: classes9.dex */
public class a implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "MemberShopNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            String scheme = data.getScheme();
            String host = data.getHost();
            String path = data.getPath();
            if (("http".equals(scheme) || "https".equals(scheme)) && (("pages.tmall.com".equals(host) || "tmclub.tmall.com".equals(host)) && ("/wow/tmclub/act/home".equals(path) || "/wow/z/tmclub/channel/home".equals(path)))) {
                intent.setDataAndType(Uri.parse("taobao://page.tm/membershop").buildUpon().encodedQuery(data.getEncodedQuery()).build(), intent.getType());
            }
        }
        return true;
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue() : !a();
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : !b();
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        OrangeConfig.getInstance().getConfig("android_tmall_membershop", "downgrade", "false");
        OrangeConfig.getInstance().registerListener(new String[]{"android_tmall_membershop"}, new com.taobao.orange.d() { // from class: com.tmall.wireless.membershop.core.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    return;
                }
                Globals.getApplication().getSharedPreferences("tmall_membershop_orange_preference", 0).edit().putBoolean("downgrade", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_tmall_membershop", "downgrade", "true"))).apply();
                OrangeConfig.getInstance().unregisterListener(new String[]{"android_tmall_membershop"});
            }
        }, false);
        return Globals.getApplication().getSharedPreferences("tmall_membershop_orange_preference", 0).getBoolean("downgrade", false);
    }
}
