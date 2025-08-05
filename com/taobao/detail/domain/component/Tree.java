package com.taobao.detail.domain.component;

import com.taobao.detail.domain.base.Unit;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class Tree extends BaseInputView {
    public static final int TYPE = 3;
    public Unit api;
    public List<Branch> branches;
    public Boolean sync;

    /* loaded from: classes7.dex */
    public static class Branch implements Serializable {
        public List<Branch> branches;
        public Boolean leaf;
        public String query;
        public Boolean sync;
        public String text;

        static {
            kge.a(-713584074);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(388230832);
    }

    public Tree() {
        this.type = 3;
    }
}
