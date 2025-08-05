package com.taobao.android.order.bundle.search.factory;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.search.common.b;
import tb.hxl;
import tb.hxm;
import tb.hxn;
import tb.hxo;
import tb.hxp;
import tb.hxq;
import tb.hxr;
import tb.hxt;
import tb.hxu;
import tb.hxv;
import tb.hxw;
import tb.hxx;
import tb.hxy;
import tb.kge;

/* loaded from: classes6.dex */
public class RecommendHolderFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public enum RecommendViewHolderType {
        HISTORY_TIPS_VIEW(0, hxn.class) { // from class: com.taobao.android.order.bundle.search.factory.RecommendHolderFactory.RecommendViewHolderType.1
            @Override // com.taobao.android.order.bundle.search.factory.RecommendHolderFactory.RecommendViewHolderType
            public b getHolder(Activity activity) {
                return new hxu(activity);
            }
        },
        HISTORY_VIEW(1, hxm.class) { // from class: com.taobao.android.order.bundle.search.factory.RecommendHolderFactory.RecommendViewHolderType.2
            @Override // com.taobao.android.order.bundle.search.factory.RecommendHolderFactory.RecommendViewHolderType
            public b getHolder(Activity activity) {
                return new hxt(activity);
            }
        },
        RECOMMEND_GOODS_TIPS_VIEW(2, hxp.class) { // from class: com.taobao.android.order.bundle.search.factory.RecommendHolderFactory.RecommendViewHolderType.3
            @Override // com.taobao.android.order.bundle.search.factory.RecommendHolderFactory.RecommendViewHolderType
            public b getHolder(Activity activity) {
                return new hxw(activity);
            }
        },
        RECOMMEND_GOODS_VIEW(3, hxo.class) { // from class: com.taobao.android.order.bundle.search.factory.RecommendHolderFactory.RecommendViewHolderType.4
            @Override // com.taobao.android.order.bundle.search.factory.RecommendHolderFactory.RecommendViewHolderType
            public b getHolder(Activity activity) {
                return new hxv(activity);
            }
        },
        RECOMMEND_SHOP_TIPS_VIEW(4, hxr.class) { // from class: com.taobao.android.order.bundle.search.factory.RecommendHolderFactory.RecommendViewHolderType.5
            @Override // com.taobao.android.order.bundle.search.factory.RecommendHolderFactory.RecommendViewHolderType
            public b getHolder(Activity activity) {
                return new hxy(activity);
            }
        },
        RECOMMEND_SHOP_VIEW(5, hxq.class) { // from class: com.taobao.android.order.bundle.search.factory.RecommendHolderFactory.RecommendViewHolderType.6
            @Override // com.taobao.android.order.bundle.search.factory.RecommendHolderFactory.RecommendViewHolderType
            public b getHolder(Activity activity) {
                return new hxx(activity);
            }
        };
        
        private Class<? extends hxl> clazz;
        private int type;

        RecommendViewHolderType(int i, Class cls) {
            this.type = i;
            this.clazz = cls;
        }

        public Class<? extends hxl> getClazz() {
            return this.clazz;
        }

        public abstract b getHolder(Activity activity);

        public int getType() {
            return this.type;
        }
    }

    static {
        kge.a(1126051797);
    }

    public static b a(Activity activity, Class<? extends hxl> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7ad3b208", new Object[]{activity, cls});
        }
        if (activity != null && cls != null) {
            RecommendViewHolderType[] values = RecommendViewHolderType.values();
            for (int i = 0; i < values.length; i++) {
                if (cls.isAssignableFrom(values[i].getClazz())) {
                    return values[i].getHolder(activity);
                }
            }
        }
        return null;
    }

    public static int a(Class<? extends hxl> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20fa47c8", new Object[]{cls})).intValue();
        }
        if (cls == null) {
            return -1;
        }
        RecommendViewHolderType[] values = RecommendViewHolderType.values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].clazz.isAssignableFrom(cls)) {
                return values[i].type;
            }
        }
        return -1;
    }
}
