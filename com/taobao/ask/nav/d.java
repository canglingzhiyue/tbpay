package com.taobao.ask.nav;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1225684419);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : com.taobao.ask.utils.c.a("ask_everyone", "answerPublish_enable", true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : com.taobao.ask.utils.c.a("ask_everyone", "answerPublish_checkAnswerd", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : com.taobao.ask.utils.c.a("ask_everyone", "questionPublish_enable", true);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if ("answer".equals(str) || "question".equals(str)) {
            if (!("answer".equals(str) ? a() : c())) {
                return false;
            }
            if (TextUtils.isEmpty(str2)) {
                return true;
            }
            String a2 = com.taobao.ask.utils.c.a("ask_everyone", str + "_publisher_" + str2 + "_enable", "0");
            char c = 65535;
            switch (a2.hashCode()) {
                case 48:
                    if (a2.equals("0")) {
                        c = 0;
                        break;
                    }
                    break;
                case 49:
                    if (a2.equals("1")) {
                        c = 1;
                        break;
                    }
                    break;
                case 50:
                    if (a2.equals("2")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                return false;
            }
            if (c == 1) {
                return true;
            }
            if (c == 2) {
                return "true".equals(com.taobao.ask.utils.a.a("android_ask_everyone", str + "_publisher", str2 + "_enable", "false"));
            }
        }
        return false;
    }
}
