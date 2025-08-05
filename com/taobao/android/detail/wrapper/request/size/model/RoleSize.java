package com.taobao.android.detail.wrapper.request.size.model;

import java.io.Serializable;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class RoleSize implements Serializable {
    public String arTitle;
    public List<SizeDo> data;
    public int roleId;
    public int sizeType;
    public String tip;
    public String title;

    static {
        kge.a(1397596932);
        kge.a(1028243835);
    }

    public RoleSize() {
        emu.a("com.taobao.android.detail.wrapper.request.size.model.RoleSize");
    }

    /* loaded from: classes5.dex */
    public static class SizeDo implements Serializable {
        public String key;
        public int max;
        public int maxLength;
        public int min;
        public String tip;
        public String title;
        public String value;

        static {
            kge.a(-819143124);
            kge.a(1028243835);
        }

        public SizeDo() {
        }

        public SizeDo(SizeDo sizeDo) {
            if (sizeDo == null) {
                return;
            }
            this.maxLength = sizeDo.maxLength;
            this.title = sizeDo.title;
            this.key = sizeDo.key;
            this.max = sizeDo.max;
            this.min = sizeDo.min;
            this.value = sizeDo.value;
            this.tip = sizeDo.tip;
        }
    }
}
