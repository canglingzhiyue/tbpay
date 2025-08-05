package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import com.taobao.android.litecreator.service.ServiceImpl;

@ServiceImpl("com.taobao.android.litecreator.service.impl.LCTabSwitcher")
/* loaded from: classes9.dex */
public interface ILCTabSwitcher {

    /* loaded from: classes9.dex */
    public interface OnSwitchResult {
        void a();

        void b();
    }

    void switchTargetTab(Context context, String str, OnSwitchResult onSwitchResult);
}
