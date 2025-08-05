package com.taobao.taolive.sdk.ui.media.mute;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.global.setting.c;
import com.taobao.login4android.api.Login;
import com.taobao.taolive.room.utils.ae;
import com.taobao.taolive.sdk.utils.m;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.sdk.utils.w;
import tb.kge;
import tb.pmd;
import tb.sst;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MUTE_SETTING_MODULE_BIZ_NAME = "TaoliveRoom";

    /* renamed from: a  reason: collision with root package name */
    private static final String f21943a;

    static {
        kge.a(463131327);
        f21943a = b.class.getSimpleName();
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (!(!sst.a())) {
            m.a(f21943a, "enableGlobalMuteOpen isHitAB == false");
            return false;
        }
        m.a(f21943a, "enableGlobalMuteOpen isHitAB == true");
        return true;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (pmd.a().u() == null || pmd.a().u().c() == null) {
            m.a(f21943a, "isGlobalMuteOpen context == null");
            return false;
        }
        Boolean bool = (Boolean) c.a(pmd.a().u().c(), "TaoliveRoom").b().b("TaoliveRoom", "liveMute", false, null);
        String str = f21943a;
        m.a(str, "isGlobalMuteOpen state:" + bool);
        return bool.booleanValue();
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
        } else if (pmd.a().u() == null || pmd.a().u().c() == null) {
            m.a(f21943a, "switchGlobalMuteOpen context == null");
        } else {
            c.a(pmd.a().u().c(), "TaoliveRoom").c().b("TaoliveRoom", "liveMute", Boolean.valueOf(z), null);
            String str = f21943a;
            m.a(str, "switchGlobalMuteOpen isMuteOpen:" + z);
        }
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            m.a(f21943a, "checkGlobalMuteToast context == null");
            return false;
        }
        if (a(context) && b(context)) {
            if (System.currentTimeMillis() - ae.c(Login.getUserId() + "key_last_mute_toast_timeMs") > o.u()) {
                w.a(context, "当前是静音环境，可调节手机音量打开声音");
                ae.a(Login.getUserId() + "key_last_mute_toast_timeMs", System.currentTimeMillis());
                if (pmd.a().e() != null) {
                    pmd.a().e().b("Page_TaobaoLiveWatch", "mute_show_all", null);
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (pmd.a().u() == null || pmd.a().u().c() == null) {
            m.a(f21943a, "isGlobalMuteSettingOpen context == null");
            return false;
        }
        Boolean bool = (Boolean) c.a(pmd.a().u().c(), "TaoliveRoom").b().a("TaoliveRoom", "liveMute", false, null);
        String str = f21943a;
        m.a(str, "isGlobalMuteSettingOpen state:" + bool);
        return bool.booleanValue();
    }
}
