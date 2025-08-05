package com.taobao.android.detail.sdk.request.size.model;

import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class RoleSize implements Serializable {
    public String arTitle;
    public List<SizeDo> data;
    public int roleId;
    public int sizeType;
    public String tip;
    public String title;

    static {
        kge.a(-982459221);
        kge.a(1028243835);
    }

    public RoleSize() {
        tpc.a("com.taobao.android.detail.sdk.request.size.model.RoleSize");
    }

    /* loaded from: classes4.dex */
    public static class SizeDo implements Serializable {
        public String key;
        public int max;
        public int maxLength;
        public int min;
        public String tip;
        public String title;
        public String value;

        static {
            kge.a(646695589);
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
