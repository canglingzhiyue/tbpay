package com.taobao.message.datasdk.facade.message.newmsgbody;

import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class ActivePart implements Serializable {
    public String actionType;
    public String actionValue;
    public int color = CollectionTabLayout.INDICATOR_DEFAUT_COLOR;
    public String guildSourceType;
    public int index;
    public int length;
    public String sys_action;
    public String text;
    public String url;
    public String utKey;

    static {
        kge.a(-1142023646);
        kge.a(1028243835);
    }
}
