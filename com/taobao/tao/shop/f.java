package com.taobao.tao.shop;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.shop.fetcher.adapter.b;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.ouu;
import tb.ouy;

/* loaded from: classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1478980650);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        ouu.a("getProcessedWeexUrl-- original url is " + str);
        HashMap hashMap = new HashMap();
        if (a()) {
            hashMap.put("_wx_shop_render_activity", Boolean.toString(true));
        }
        if (!b.a().u()) {
            hashMap.put("_parallel_render", Boolean.toString(false));
        }
        if (!b.a().v()) {
            hashMap.put("_enable_local_js", Boolean.toString(false));
        }
        String a2 = ouy.a(str, hashMap);
        ouu.a("getProcessedWeexUrl-- processed url is " + a2);
        return a2;
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        List<String> s = b.a().s();
        if (s != null && !s.isEmpty()) {
            String nick = Login.getNick();
            if (!StringUtils.isEmpty(nick) && s.contains(nick)) {
                return true;
            }
        }
        return b.a().t();
    }
}
