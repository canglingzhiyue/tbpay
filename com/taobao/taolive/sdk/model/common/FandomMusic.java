package com.taobao.taolive.sdk.model.common;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class FandomMusic implements INetDataObject {
    public ArrayList<Music> musicList;
    public String playType;

    /* loaded from: classes8.dex */
    public static class Music implements INetDataObject {
        public String coverUrl;
        public String id;
        public String name;
        public String url;

        static {
            kge.a(1103770594);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(2055844929);
        kge.a(-540945145);
    }
}
