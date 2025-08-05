package com.taobao.message.lab.comfrm.inner2.config;

import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.SlotInstance;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class LayoutInfo {
    @Deprecated
    public Map<String, SlotInstance> children;
    @Deprecated
    public Map<String, String> data;
    public Map<String, List<EventHandlerItem>> eventHandler;
    public RenderTemplate renderTemplate;
    @Deprecated
    public Map<String, Object> style;
    public String uniqueId;
    public UserTrackInfo userTrack;
    public String version;

    static {
        kge.a(99923428);
    }
}
