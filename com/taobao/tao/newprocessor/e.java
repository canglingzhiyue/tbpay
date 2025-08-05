package com.taobao.tao.newprocessor;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class e implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(703498405);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "NewSettingProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
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
