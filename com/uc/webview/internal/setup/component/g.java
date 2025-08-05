package com.uc.webview.internal.setup.component;

import android.text.TextUtils;
import com.taobao.tao.shop.common.ShopConstants;
import com.uc.webview.base.GlobalSettings;
import java.util.Random;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final boolean[] f23909a = new boolean[24];

        static {
            String[] split;
            int i = 0;
            while (true) {
                boolean[] zArr = f23909a;
                if (i >= zArr.length) {
                    break;
                }
                zArr[i] = false;
                i++;
            }
            String str = GlobalSettings.get((int) com.alibaba.triver.triver_shop.shop2023.nativeview.a.bottomBarHeightWithBottomMarginRpxValue, "");
            if (TextUtils.isEmpty(str) || (split = str.split(",")) == null || split.length == 0) {
                return;
            }
            for (String str2 : split) {
                int a2 = a(str2);
                if (a2 != -1) {
                    f23909a[a2] = true;
                }
            }
        }

        private static int a(String str) {
            int parseInt;
            if (str == null) {
                return -1;
            }
            String trim = str.trim();
            if (trim.length() == 0) {
                return -1;
            }
            try {
                parseInt = Integer.parseInt(trim);
            } catch (Throwable unused) {
            }
            if (parseInt >= 0 && parseInt <= 23) {
                return parseInt;
            }
            return -1;
        }
    }

    private static long a() {
        int c = x.c();
        if (c >= 0 && c <= 23) {
            if (!a.f23909a[c]) {
                return 0L;
            }
            int i = c + 1;
            int i2 = i + 23;
            while (i < i2 && a.f23909a[i % 24]) {
                i++;
            }
            if (i != i2) {
                return ((((i * 60) * 60) + new Random().nextInt(ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)) - x.b()) * 1000;
            }
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(long j) {
        int i;
        long a2 = a();
        long j2 = 0;
        if (a2 <= 0) {
            if (j <= 0 || (i = (int) (System.currentTimeMillis() - j)) < 0) {
                i = 0;
            }
            int i2 = GlobalSettings.get(111, 45);
            if (i2 < 5 || i2 >= 1000) {
                i2 = 45;
            }
            long j3 = i2 * 1000;
            long j4 = i;
            if (j4 < j3) {
                j2 = new Random().nextInt((int) j3) + (j3 - j4);
            }
            return j2;
        }
        return a2;
    }
}
