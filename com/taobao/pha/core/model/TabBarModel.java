package com.taobao.pha.core.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;
import tb.mxr;

/* loaded from: classes7.dex */
public class TabBarModel extends PageModel implements Serializable {
    @JSONField(name = "background_color")
    public String backgroundColor;
    @JSONField(name = mxr.KEY_FONT_SIZE)
    public int fontSize;
    @JSONField(name = "h5_loading_options")
    public H5LoadingOptions h5LoadingOptions;
    public int height;
    @JSONField(name = "icon_size")
    public int iconSize;
    @JSONField(name = "line_height")
    public int lineHeight;
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "position")
    public String position;
    @JSONField(name = "selected_color")
    public String selectedColor;
    @JSONField(name = "selected_index")
    public int selectedIndex;
    public int spacing;
    @JSONField(name = "text_color")
    public String textColor;
    public ArrayList<TabBarItemModel> items = new ArrayList<>();
    @JSONField(name = "enable_scroll_listener")
    public boolean enableScrollListener = false;

    /* loaded from: classes7.dex */
    public static class H5LoadingOptions implements Serializable {
        @JSONField(name = "defer")
        public boolean defer = false;
        @JSONField(name = "timeout")
        public long timeout = 2000;

        static {
            kge.a(-462807803);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(936257774);
        kge.a(1028243835);
    }
}
