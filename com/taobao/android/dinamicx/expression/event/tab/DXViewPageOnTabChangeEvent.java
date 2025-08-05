package com.taobao.android.dinamicx.expression.event.tab;

import com.alibaba.fastjson.JSONObject;
import tb.kge;

/* loaded from: classes5.dex */
public class DXViewPageOnTabChangeEvent extends TabEvent {
    public static final long DXVIEWPAGER_ONTABCHANGED = -7836695228328867158L;

    static {
        kge.a(1380972303);
    }

    public DXViewPageOnTabChangeEvent(int i, int i2, JSONObject jSONObject, boolean z, int i3) {
        super(-7836695228328867158L, i, i2, jSONObject, z, false, i3);
    }
}
