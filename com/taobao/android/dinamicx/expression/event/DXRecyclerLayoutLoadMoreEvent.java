package com.taobao.android.dinamicx.expression.event;

import android.text.TextUtils;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class DXRecyclerLayoutLoadMoreEvent extends DXEvent {
    public static final long DXRECYCLERLAYOUT_ONENDREACHED = -2277119638481222228L;
    private String userId;

    static {
        kge.a(1372667113);
    }

    public DXRecyclerLayoutLoadMoreEvent(String str) {
        super(-2277119638481222228L);
        this.userId = str;
        if (this.args == null) {
            this.args = new HashMap();
        }
        if (TextUtils.isEmpty(str)) {
            this.args.put("userId", f.a(""));
        } else {
            this.args.put("userId", f.a(str));
        }
    }
}
