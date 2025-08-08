package com.taobao.android.detail2.core.framework.view.navbar;

import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fjp;
import tb.fkr;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1774105347);
    }

    public static int a(com.taobao.android.detail2.core.framework.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f8b714a", new Object[]{bVar})).intValue() : a(null, bVar);
    }

    public static int a(com.taobao.android.detail2.core.framework.data.model.d dVar, com.taobao.android.detail2.core.framework.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f0359b4", new Object[]{dVar, bVar})).intValue();
        }
        AtmosParams G = bVar.h().G();
        if (G != null && G.showAtmos && !StringUtils.isEmpty(G.atmosColor)) {
            try {
                return Color.parseColor(G.atmosColor);
            } catch (Exception e) {
                e.printStackTrace();
                fkr h = bVar.h();
                fjp.a(fjp.SCENE_ENTRANCE_ATMOS, fjp.ERROR_CODE_ATMOS_COLOR_PARSE_ERROR, "atmoscolor解析错误，入口itemid：" + h.e() + ", 入口nid" + h.f() + ", colorStr: " + G.atmosColor, h.T());
            }
        }
        if (dVar != null && !StringUtils.isEmpty(dVar.O)) {
            try {
                return Color.parseColor(dVar.O);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return -16777216;
    }
}
