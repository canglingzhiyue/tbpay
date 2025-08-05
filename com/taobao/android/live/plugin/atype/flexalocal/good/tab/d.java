package com.taobao.android.live.plugin.atype.flexalocal.good.tab;

import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.List;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean anchorTab;
    public Object baseFrame;
    public View frameView;
    @Deprecated
    public int index;
    public String key;
    public boolean showTab;
    public List<String> showTopBarType;
    public FrameLayout tabFrameLayout;
    public final VideoInfo.ExtraGoodsTabItem tabItem;
    public String tabType;
    public String title;
    public String url;

    static {
        kge.a(-1371446729);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void onHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
        }
    }

    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
        }
    }

    public d(VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        this(0, extraGoodsTabItem);
    }

    public d(int i, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        this.anchorTab = false;
        this.showTab = true;
        this.index = i;
        this.tabItem = extraGoodsTabItem;
        if (extraGoodsTabItem != null) {
            this.tabType = extraGoodsTabItem.type;
            this.key = createTabKey(extraGoodsTabItem);
            this.url = extraGoodsTabItem.url;
            this.title = extraGoodsTabItem.title;
            return;
        }
        this.key = null;
        this.tabType = null;
    }

    public static String createTabKey(VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f653c11e", new Object[]{extraGoodsTabItem});
        }
        return "" + extraGoodsTabItem.type + "_" + extraGoodsTabItem.title;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString() + "   [title = " + this.title + ", key = " + this.key + ", tabType = " + this.tabType + ", url = " + this.url + ", anchorTab = " + this.anchorTab + ", showTab = " + this.showTab + ", " + riy.ARRAY_END_STR;
    }
}
