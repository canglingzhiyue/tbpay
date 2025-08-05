package com.taobao.wireless.link.model;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class MessageData implements Serializable {
    public String activity_id;
    public long assistant_animation_time;
    public String assistant_click_url;
    public String assistant_logo_url;
    public String assistant_pic_url;
    public String assistant_title;
    public String assistant_type;
    public String message_id = "-1";
    public int message_type;
    public long msg_arrive_time;
    public String noti_linkUrl_hc;
    public String noti_linkUrl_hd;
    public String noti_picUrl_hc;
    public String noti_picUrl_hd;
    public String noti_text_hc;
    public String noti_text_hd;
    public String noti_text_title;
    public String noti_title_left;
    public String noti_type;
    public long validTime;

    static {
        kge.a(2073431156);
        kge.a(1028243835);
    }
}
