package com.taobao.taolive.sdk.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class v {
    static {
        kge.a(1242529800);
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-366129558);
        }

        public static boolean a(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{str, str2, new Boolean(z)})).booleanValue() : l.a(a(str, str2, String.valueOf(z)), z);
        }

        public static long a(String str, String str2, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4dba98bc", new Object[]{str, str2, new Long(j)})).longValue();
            }
            return l.a(a(str, str2, "" + j), j);
        }

        public static String a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3}) : pmd.a().d().a(str, str2, str3);
        }
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2117815747);
        }

        public static boolean b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a3509d0b", new Object[]{str, str2, str3})).booleanValue() : a(str, str2, str3, false);
        }

        public static boolean a(String str, String str2, String str3, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0bfeb52", new Object[]{str, str2, str3, new Boolean(z)})).booleanValue() : l.a(a(str, str2, str3, String.valueOf(z)), z);
        }

        public static int a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("929ad039", new Object[]{str, str2, str3})).intValue() : a(str, str2, str3, 0);
        }

        public static int a(String str, String str2, String str3, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c0bfab70", new Object[]{str, str2, str3, new Integer(i)})).intValue();
            }
            return l.a(a(str, str2, str3, "" + i), i);
        }

        public static String a(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{str, str2, str3, str4}) : pmd.a().t().a(str, str2, str3, str4);
        }
    }
}
