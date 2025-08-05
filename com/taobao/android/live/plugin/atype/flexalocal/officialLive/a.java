package com.taobao.android.live.plugin.atype.flexalocal.officialLive;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.taolive.room.utils.n;
import tb.ddw;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVEOFFICIALENTRYCLICK = -8122558392255960062L;
    public static final String EVENT_OFFICIAL_ANCHOR_CLICK = "official_anchor_click";
    public static final String EVENT_OFFICIAL_ENTRY_CLICK = "official_entry_click";
    public static final String EVENT_OFFICIAL_FOLLOW = "official_follow";

    static {
        kge.a(814410143);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length < 2 || dXRuntimeContext == null) {
        } else {
            String str = (String) objArr[0];
            com.taobao.alilive.aliliveframework.frame.a a2 = n.a();
            String G = a2 == null ? null : a2.G();
            if (!"event".equals(str)) {
                return;
            }
            String str2 = (String) objArr[1];
            if (EVENT_OFFICIAL_FOLLOW.equals(str2)) {
                ddw.a().a(EVENT_OFFICIAL_FOLLOW, null, G);
            } else if (EVENT_OFFICIAL_ANCHOR_CLICK.equals(str2)) {
                ddw.a().a(EVENT_OFFICIAL_ANCHOR_CLICK, null, G);
            } else if (!EVENT_OFFICIAL_ENTRY_CLICK.equals(str2)) {
            } else {
                ddw.a().a(EVENT_OFFICIAL_ENTRY_CLICK, null, G);
            }
        }
    }
}
