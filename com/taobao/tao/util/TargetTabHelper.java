package com.taobao.tao.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.navigationextern.e;
import com.taobao.tao.tbmaincontroller.ATBMainController;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes.dex */
public class TargetTabHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(513273445);
    }

    public static int getTargetTabIndex(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6798886d", new Object[]{context, intent})).intValue();
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            int i = extras.getInt(ATBMainController.EXTRA_FRAGMENT_TAB_INDEX, -1);
            if (i != -1) {
                return i;
            }
            int i2 = extras.getInt("INTENT_FILTER_LABEL", -1);
            if (i2 != -1) {
                if (i2 == R.string.tb_tab_home_title || i2 == R.string.tb_tab_weitao_title) {
                    return 0;
                }
                if (i2 == R.string.tb_tab_guangguang_title) {
                    if (!e.f()) {
                        return 0;
                    }
                } else if (i2 == R.string.tb_tab_discovery_title) {
                    if (!e.a(context)) {
                        return 0;
                    }
                } else if (i2 == R.string.tb_tab_chat_title) {
                    return 2;
                } else {
                    if (i2 == R.string.tb_tab_cart_title) {
                        return 3;
                    }
                    if (i2 == R.string.tb_tab_mytaobao_title) {
                        return 4;
                    }
                    if (!b.c() || i2 != R.string.tb_tab_category_title) {
                    }
                }
                return 1;
            }
        }
        return -1;
    }
}
