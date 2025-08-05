package com.taobao.android.fluid.framework.data.datamodel.pop;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class PopPositionData implements Serializable {
    private static final long serialVersionUID = 6582228519250197871L;
    public PositionData data;

    /* loaded from: classes5.dex */
    public static class PositionData implements Serializable {
        private static final long serialVersionUID = 4582228519250197453L;
        public JSONObject animations;
        public Long duration;
        public int h;
        public int w;
        public int x;
        public int y;

        static {
            kge.a(718686589);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1362242426);
        kge.a(1028243835);
    }
}
