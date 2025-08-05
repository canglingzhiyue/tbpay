package com.taobao.homepage.business.getconfig;

import android.graphics.Color;
import com.alibaba.ability.localization.b;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class DefaultRefreshConfig extends RefreshConfig {
    static {
        kge.a(-1881515980);
    }

    public DefaultRefreshConfig() {
        this.pullToRefreshText = b.a(R.string.taobao_app_1000_1_16141);
        this.releaseToRefreshText = b.a(R.string.app_release_to_reload);
        this.refreshingText = b.a(R.string.taobao_app_1000_1_16173);
        this.refreshFinishedText = b.a(R.string.taobao_app_1000_1_16144);
        this.pullTextColor = "#999999";
        this.parsePullTextColor = Integer.valueOf(Color.parseColor(this.pullTextColor));
        this.pullTextSize = 12;
        this.pullRefreshHeight = 40;
    }
}
