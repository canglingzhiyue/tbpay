package com.taobao.android.dinamic.view;

import android.content.Context;
import com.taobao.android.dinamic.e;
import tb.kge;

/* loaded from: classes5.dex */
public class CompatibleView extends DFrameLayout {
    static {
        kge.a(728339952);
    }

    public CompatibleView(Context context, String str) {
        super(context);
        if (e.a()) {
            setContentDescription(str);
        }
    }
}
