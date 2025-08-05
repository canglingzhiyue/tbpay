package com.taobao.artc.api;

import java.util.ArrayList;
import tb.kge;

/* loaded from: classes6.dex */
public class ArtcVideoLayout {
    public int bg_color;
    public int bg_height;
    public int bg_width;
    public ArrayList<ArtcVideoRect> desc;
    public int sub_height;
    public int sub_width;
    public String extension = null;
    public int bg_from_type = 1;
    public int bg_type = 0;
    public String background_imge_url = null;

    static {
        kge.a(-808587788);
    }

    /* loaded from: classes6.dex */
    public class ArtcVideoRect {
        public int height;
        public String index;
        public String uid;
        public int width;
        public int x;
        public int y;
        public int z;

        static {
            kge.a(-502717521);
        }

        public ArtcVideoRect(int i, int i2, int i3, int i4, int i5, String str) {
            this.x = i;
            this.y = i2;
            this.z = i3;
            this.width = i4;
            this.height = i5;
            this.uid = str;
        }

        public ArtcVideoRect(int i, int i2, int i3, int i4, int i5, String str, String str2) {
            this.x = i;
            this.y = i2;
            this.z = i3;
            this.width = i4;
            this.height = i5;
            this.uid = str;
            this.index = str2;
        }
    }
}
