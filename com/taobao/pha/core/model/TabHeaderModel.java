package com.taobao.pha.core.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class TabHeaderModel extends PageModel implements Serializable {
    public static final String POSITION_ABSOLUTE = "absolute";
    public static final String POSITION_STATIC = "static";
    @JSONField(name = "background_color")
    public String backgroundColor;
    @JSONField(name = "enable_scroll_listener")
    public boolean enableScrollListener;
    @JSONField(name = "enable_swiper_listener")
    public boolean enableSwiperListener;
    public int height;
    public String name;
    public String position;
    @JSONField(name = "selected_index")
    public int selectedIndex = -1;
    @JSONField(name = "included_safe_area")
    public boolean includedSafeArea = true;
    @JSONField(name = "height_unit")
    public String heightUnit = "rpx";
    @JSONField(name = "penetrate")
    public boolean penetrate = false;
    public boolean firstPage = false;

    static {
        kge.a(-254485628);
        kge.a(1028243835);
    }
}
