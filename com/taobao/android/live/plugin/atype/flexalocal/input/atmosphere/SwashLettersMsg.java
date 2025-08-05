package com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class SwashLettersMsg implements INetDataObject {
    public String itemId;
    public String liveId;
    public String swashLettersAction;
    public SwashLettersDesc swashLettersDesc;
    public String swashLettersId;
    public int swashLettersType;

    /* loaded from: classes6.dex */
    public static class StaticResource implements INetDataObject {
        public String backgroundUrl;
        public float centerX;
        public float centerY;
        public float flexHeight;
        public float flexWidth;
        public String gravity;
        public int height;
        public int marginX;
        public int marginY;
        public String text;
        public float textSize;
        public int width;

        static {
            kge.a(-1008805066);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes6.dex */
    public static class SwashLettersDesc implements INetDataObject {
        public long displayTime;
        public StaticResource staticResource;

        static {
            kge.a(564179046);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-593802902);
        kge.a(-540945145);
    }
}
