package tb;

import com.alibaba.fastjson.annotation.JSONField;

/* loaded from: classes7.dex */
public class kgi {
    public static final int MIDR_ARCH_INDEX = 2;
    public static final int MIDR_IMPL_INDEX = 0;
    public static final int MIDR_LENGTH = 5;
    public static final int MIDR_PART_INDEX = 3;
    public static final int MIDR_REVISION_INDEX = 4;
    public static final int MIDR_VARIANT_INDEX = 1;
    @JSONField(name = "coreCount")

    /* renamed from: a  reason: collision with root package name */
    public int f30051a;
    @JSONField(name = "clusters")
    public a[] b;

    /* loaded from: classes7.dex */
    public static class a {
        @JSONField(name = "midr")

        /* renamed from: a  reason: collision with root package name */
        public short[] f30052a;
        @JSONField(name = "coreMask")
        public int b;
        @JSONField(name = "frequencies")
        public int[] c;

        static {
            kge.a(-36217447);
        }
    }

    static {
        kge.a(-1645643933);
    }
}
