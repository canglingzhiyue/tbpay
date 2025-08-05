package com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure;

import java.io.Serializable;
import java.util.List;
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
        kge.a(1299825173);
        kge.a(1028243835);
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
            kge.a(1977866747);
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
