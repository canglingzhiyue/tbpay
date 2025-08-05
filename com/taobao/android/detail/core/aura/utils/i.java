package com.taobao.android.detail.core.aura.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.u;
import java.util.HashMap;
import tb.bga;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1360219299);
        emu.a("com.taobao.android.detail.core.aura.utils.AliDetailUserTracker");
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        u.a().a(context, new HashMap<String, String>() { // from class: com.taobao.android.detail.core.aura.utils.AliDetailUserTracker$1
            {
                put("finalUltron", "true");
            }
        });
        bga.c.a("detail_aura", "finalUltron", "E_DETAIL_FINAL_ULTRON", "default", true);
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        u.a().a(context, new HashMap<String, String>() { // from class: com.taobao.android.detail.core.aura.utils.AliDetailUserTracker$2
            {
                put("finalUltron", "false");
            }
        });
        bga.c.a("detail_aura", "finalUltron", "E_DETAIL_NONE_FINAL_ULTRON", "default", true);
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else {
            u.a().a(context, new HashMap<String, String>() { // from class: com.taobao.android.detail.core.aura.utils.AliDetailUserTracker$3
                {
                    put("auraModeDegrade", "true");
                }
            });
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
            return;
        }
        u.a().a(context, new HashMap<String, String>() { // from class: com.taobao.android.detail.core.aura.utils.AliDetailUserTracker$4
            {
                put("industryPicGallery", "true");
            }
        });
        bga.c.b("detail_aura", "finalUltron", "E_DETAIL_INDUSTRY_PIC_GALLERY", "default");
    }
}
