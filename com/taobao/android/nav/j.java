package com.taobao.android.nav;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.kge;

/* loaded from: classes.dex */
public class j implements Nav.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(814041470);
        kge.a(-234059470);
    }

    @Override // com.taobao.android.nav.Nav.h
    public boolean beforeNavTo(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
        }
        if (intent != null && (data = intent.getData()) != null) {
            String scheme = data.getScheme();
            String host = data.getHost();
            String path = data.getPath();
            if ((("https".equals(scheme) || "http".equals(scheme) || "taobao".equals(scheme)) && "m.taobao.com".equals(host) && "/go/mytaobao/settings".equals(path)) || (("https".equals(scheme) || "http".equals(scheme)) && "tb.cn".equals(host) && "/x/sz/".equals(path))) {
                if ("/x/sz/".equals(path)) {
                    intent.setData(data.buildUpon().path("/x/nsz/").build());
                } else {
                    intent.setData(data.buildUpon().path("/go/mytaobao/newsettings").build());
                }
                return true;
            } else if (("https".equals(scheme) || "http".equals(scheme) || "taobao".equals(scheme)) && "m.taobao.com".equals(host) && "/go/mytaobaocommonsettings".equals(path)) {
                intent.setData(data.buildUpon().path("/go/newmytaobaocommonsettings").build());
            }
        }
        return true;
    }
}
