package com.taobao.homepage.business.getconfig;

import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class RefreshConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Integer parsePullTextColor;
    public String pullToRefreshText;
    public String refreshFinishedText;
    public String refreshingText;
    public String releaseToRefreshText;
    public String pullTextColor = "#DCDCDC";
    public Integer pullTextSize = 12;
    public Integer pullRefreshHeight = 40;

    static {
        kge.a(786251269);
        kge.a(1028243835);
    }

    public boolean valid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdc1b687", new Object[]{this})).booleanValue();
        }
        if (this.parsePullTextColor == null && !TextUtils.isEmpty(this.pullTextColor)) {
            try {
                this.parsePullTextColor = Integer.valueOf(Color.parseColor(this.pullTextColor));
            } catch (Exception e) {
                e.e("home.RefreshConfig", "parse pullTextColor error" + e);
                return false;
            }
        }
        return !TextUtils.isEmpty(this.pullToRefreshText) && !TextUtils.isEmpty(this.releaseToRefreshText) && !TextUtils.isEmpty(this.refreshingText) && !TextUtils.isEmpty(this.refreshFinishedText) && this.pullTextSize.intValue() > 0 && this.pullRefreshHeight.intValue() > 0 && this.parsePullTextColor != null;
    }
}
