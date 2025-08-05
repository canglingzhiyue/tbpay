package com.alibaba.poplayer.config.model.keep;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.poplayer.config.model.base.IModel;
import com.alibaba.poplayer.config.model.trigger.UriModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class KeepModel implements IModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODE_KEEP_LIVE = "keepLive";
    public static final String MODE_PAGE_LIVE = "pageLive";
    public static final String STRATEGY_BLACK_LIST = "blackList";
    public static final String STRATEGY_WHITE_LIST = "whiteList";
    @JSONField(name = "mode")
    public String mode;
    @JSONField(name = "pages")
    public List<UriModel> pages;
    @JSONField(name = "strategy")
    public String strategy;

    static {
        kge.a(-560169601);
        kge.a(-284545415);
    }

    @Override // com.alibaba.poplayer.config.model.base.IModel
    public boolean isValid() {
        List<UriModel> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.mode) && !TextUtils.isEmpty(this.strategy) && (list = this.pages) != null && !list.isEmpty() && (MODE_PAGE_LIVE.equals(this.mode) || MODE_KEEP_LIVE.equals(this.mode)) && (STRATEGY_WHITE_LIST.equals(this.strategy) || STRATEGY_BLACK_LIST.equals(this.strategy));
    }
}
