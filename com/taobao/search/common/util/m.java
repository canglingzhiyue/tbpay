package com.taobao.search.common.util;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import tb.kge;
import tb.rvm;

/* loaded from: classes7.dex */
public final class m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FONT_MAX_DP = 32;
    public static final m INSTANCE;

    @JvmStatic
    public static final int a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821d35f", new Object[]{new Boolean(z)})).intValue() : z ? 2 : 0;
    }

    static {
        kge.a(1575401437);
        INSTANCE = new m();
    }

    private m() {
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE;

        /* renamed from: a  reason: collision with root package name */
        private static final Integer[] f19039a;
        private static final Integer[] b;
        private static final Integer[] c;
        private static final Integer[] d;
        private static final Integer[] e;
        private static final Integer[] f;
        private static final Integer[] g;

        static {
            kge.a(1385515091);
            INSTANCE = new a();
            f19039a = new Integer[]{13, 13, 13, 21, 21};
            b = new Integer[]{16, 16, 16, 22, 22};
            c = new Integer[]{14, 14, 14, 18, 18};
            d = new Integer[]{13, 13, 13, 18, 18};
            e = new Integer[]{16, 16, 16, 18, 18};
            f = new Integer[]{15, 15, 15, 18, 18};
            g = new Integer[]{16, 16, 16, 23, 23};
        }

        private a() {
        }

        public final Integer[] a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer[]) ipChange.ipc$dispatch("ddaad070", new Object[]{this}) : f19039a;
        }

        public final Integer[] b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer[]) ipChange.ipc$dispatch("d9ac5f4f", new Object[]{this}) : b;
        }

        public final Integer[] c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer[]) ipChange.ipc$dispatch("d5adee2e", new Object[]{this}) : c;
        }

        public final Integer[] d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer[]) ipChange.ipc$dispatch("d1af7d0d", new Object[]{this}) : d;
        }

        public final Integer[] e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer[]) ipChange.ipc$dispatch("cdb10bec", new Object[]{this}) : e;
        }

        public final Integer[] f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer[]) ipChange.ipc$dispatch("c9b29acb", new Object[]{this}) : f;
        }
    }

    @JvmStatic
    public static final float b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d6abfb", new Object[]{new Boolean(z)})).floatValue();
        }
        int a2 = a(z);
        if (a2 == -1) {
            return 0.84f;
        }
        if (a2 == 1) {
            return 1.28f;
        }
        if (a2 == 2) {
            return 1.64f;
        }
        return a2 != 3 ? 1.0f : 2.28f;
    }

    @JvmStatic
    public static final int a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c11928c", new Object[]{new Integer(i), new Boolean(z)})).intValue();
        }
        int a2 = rvm.a(i * b(z));
        if (a2 <= 32) {
            return a2;
        }
        return 32;
    }

    @JvmStatic
    public static final int a(Integer[] numArr, boolean z) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c8be5dd", new Object[]{numArr, new Boolean(z)})).intValue();
        }
        if (numArr != null) {
            if (!(numArr.length == 0)) {
                int a2 = a(z) + 1;
                if (a2 >= numArr.length) {
                    intValue = ((Number) kotlin.collections.g.c(numArr)).intValue();
                } else {
                    intValue = numArr[a2].intValue();
                }
                if (intValue <= 32) {
                    return intValue;
                }
                return 32;
            }
        }
        return 0;
    }
}
