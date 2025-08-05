package com.taobao.themis.canvas.canvas;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.utils.n;
import tb.kge;

/* loaded from: classes9.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-546553067);
    }

    public static boolean a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0cb8a31", new Object[]{fVar})).booleanValue();
        }
        return false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : n.a(i.ORANGE_GROUP_THEMIS_GRAPHICS_COMMON, "enable_gpu_tracing", (Boolean) true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : n.a(i.GROUP_THEMIS_COMMON_CONFIG, "enableFixedFrameRate", (Boolean) true);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String a2 = n.a(i.ORANGE_GROUP_THEMIS_GRAPHICS_COMMON, "enable_fixed_frame_rate_white_list", "");
            if (!TextUtils.isEmpty(a2)) {
                TMSLogger.b("TMSCanvasUtils", "[orange] enable_fixed_frame_rate_white_list, value: " + a2);
                JSONArray parseArray = JSON.parseArray(a2);
                if (parseArray != null) {
                    for (int i = 0; i < parseArray.size(); i++) {
                        if (str.equals(parseArray.getString(i))) {
                            TMSLogger.d("TMSCanvasUtils", "[orange] fixed frame rate whitelist hit: " + str);
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TMSLogger.b("TMSCanvasUtils", "parse enable_fixed_frame_rate_white_list config failed because of ", th);
        }
        return false;
    }
}
