package com.uc.webview.stat;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.security.wukong.pipe.RiskDataPipeManager;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.alipay.sdk.sys.BizContext;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.uc.webview.internal.stats.StatsManager;
import com.uc.webview.internal.stats.c;
import java.util.HashMap;
import java.util.Map;
import tb.pqe;

/* loaded from: classes9.dex */
public class a extends com.uc.webview.internal.stats.g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uc.webview.stat.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1046a {

        /* renamed from: a  reason: collision with root package name */
        static final Map<String, c.a> f24012a;

        static {
            HashMap hashMap = new HashMap();
            f24012a = hashMap;
            hashMap.put("bfcache_v2", new g((byte) 0));
            f24012a.put("prerender_v0", new aw((byte) 0));
            f24012a.put("bkpg", new k((byte) 0));
            f24012a.put("wpk_pv", new bq((byte) 0));
            f24012a.put("block_subres", new m((byte) 0));
            f24012a.put("v8aot", new bm((byte) 0));
            f24012a.put("snapsh_load", new bi((byte) 0));
            f24012a.put("snapsh_init", new bg((byte) 0));
            f24012a.put("snapsh_creat", new be((byte) 0));
            f24012a.put("proc_stats2", new ay((byte) 0));
            f24012a.put("jsi", new ag((byte) 0));
            f24012a.put("keyword_hyperlink_expose", new ak((byte) 0));
            f24012a.put("keyword_hyperlink_click", new ai((byte) 0));
            f24012a.put("sdkpv", new ba((byte) 0));
            f24012a.put("sdksus", new bc((byte) 0));
            f24012a.put("lottie_stats", new am((byte) 0));
            f24012a.put("canvas_stats", new o((byte) 0));
            f24012a.put("pr_stats", new au((byte) 0));
            f24012a.put("ac_stats", new c((byte) 0));
            f24012a.put("media_stats", new ao((byte) 0));
            f24012a.put("webrtc_stats", new bo((byte) 0));
            f24012a.put("pinch_zoom", new as((byte) 0));
            f24012a.put("auto_fill", new e((byte) 0));
            f24012a.put("pass_fail", new aq((byte) 0));
            f24012a.put("embed_req", new aa((byte) 0));
            f24012a.put("capture_stat", new q((byte) 0));
            f24012a.put("core_errpage", new w((byte) 0));
            f24012a.put("ext_img", new ac((byte) 0));
            f24012a.put("component2", new s((byte) 0));
            f24012a.put("fea_s", new ae((byte) 0));
            f24012a.put("css_s", new y((byte) 0));
            f24012a.put("und_s", new bk((byte) 0));
            f24012a.put("con_s", new u((byte) 0));
            f24012a.put("bfcache_w", new i((byte) 0));
        }
    }

    /* loaded from: classes9.dex */
    static class aa implements c.a {
        private aa() {
        }

        /* synthetic */ aa(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new z(a.a(map, "h", ""), a.a(map, "t", ""), a.a(map, "v", ""), a.a(map, "m"), a.a(map, com.taobao.android.msoa.c.TAG), a.a(map, "s"), a.a(map, "w"), a.a(map, "e"), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class ab extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h g;
        public long b;
        public String c;
        public String d;
        public String e;
        public String f;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("ext_img");
            g = hVar;
            StatsManager.a(hVar);
        }

        public ab() {
        }

        private ab(long j, String str, String str2, String str3, String str4) {
            this.b = j;
            if (str != null && str.length() > 64) {
                str = str.substring(0, 64);
            }
            this.c = str;
            if (str2 == null || str2.length() <= 64) {
                this.d = str2;
            } else {
                this.d = str2.substring(0, 64);
            }
            if (str3 == null || str3.length() <= 64) {
                this.e = str3;
            } else {
                this.e = str3.substring(0, 64);
            }
            if (str4 == null || str4.length() <= 64) {
                this.f = str4;
            } else {
                this.f = str4.substring(0, 64);
            }
        }

        /* synthetic */ ab(long j, String str, String str2, String str3, String str4, byte b) {
            this(j, str, str2, str3, str4);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return g;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.b(this.b) + 21 + a.a(this.c) + a.a(this.d) + a.a(this.e) + a.a(this.f);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 21;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_ret", String.valueOf(this.b));
            String str = this.c;
            if (str == null) {
                str = "";
            }
            hashMap.put("_ver", str);
            String str2 = this.d;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_fmt", str2);
            String str3 = this.e;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("_ext", str3);
            String str4 = this.f;
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("_mime", str4);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new ab(this.b, this.c, this.d, this.e, this.f);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = 0L;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("ext_img", e());
        }
    }

    /* loaded from: classes9.dex */
    static class ac implements c.a {
        private ac() {
        }

        /* synthetic */ ac(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new ab(a.a(map, com.taobao.mtop.wvplugin.a.RESULT_KEY), a.a(map, MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, ""), a.a(map, "fmt", ""), a.a(map, "ext", ""), a.a(map, "mime", ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class ad extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h e;
        public String b;
        public String c;
        public String d;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("fea_s");
            e = hVar;
            StatsManager.a(hVar);
        }

        public ad() {
        }

        private ad(String str, String str2, String str3) {
            if (str != null && str.length() > 128) {
                str = str.substring(0, 128);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 1024) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 1024);
            }
            if (str3 == null || str3.length() <= 4096) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 4096);
            }
        }

        /* synthetic */ ad(String str, String str2, String str3, byte b) {
            this(str, str2, str3);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return e;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 6 + a.a(this.c) + a.a(this.d);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 6;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_h", str);
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_u", str2);
            String str3 = this.d;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("_r", str3);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new ad(this.b, this.c, this.d);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("fea_s", e());
        }
    }

    /* loaded from: classes9.dex */
    static class ae implements c.a {
        private ae() {
        }

        /* synthetic */ ae(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new ad(a.a(map, "h", ""), a.a(map, RVStartParams.KEY_URL_SHORT, ""), a.a(map, "r", ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class af extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h j;
        public String b;
        public String c;
        public String d;
        public long e;
        public String f;
        public long g;
        public String h;
        public String i;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("jsi");
            j = hVar;
            StatsManager.a(hVar);
        }

        public af() {
        }

        private af(String str, String str2, String str3, long j2, String str4, long j3, String str5, String str6) {
            this.e = j2;
            this.g = j3;
            if (str != null && str.length() > 64) {
                str = str.substring(0, 64);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 64) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 64);
            }
            if (str3 == null || str3.length() <= 32) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 32);
            }
            if (str4 == null || str4.length() <= 16) {
                this.f = str4;
            } else {
                this.f = str4.substring(0, 16);
            }
            if (str5 == null || str5.length() <= 24) {
                this.h = str5;
            } else {
                this.h = str5.substring(0, 24);
            }
            if (str6 == null || str6.length() <= 32) {
                this.i = str6;
            } else {
                this.i = str6.substring(0, 32);
            }
        }

        /* synthetic */ af(String str, String str2, String str3, long j2, String str4, long j3, String str5, String str6, byte b) {
            this(str, str2, str3, j2, str4, j3, str5, str6);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return j;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 35 + a.a(this.c) + a.a(this.d) + a.b(this.e) + a.a(this.f) + a.b(this.g) + a.a(this.h) + a.a(this.i);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 35;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_ebd", str);
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_prc", str2);
            String str3 = this.d;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("_thr", str3);
            hashMap.put("_jpv", String.valueOf(this.e));
            String str4 = this.f;
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("_jsv", str4);
            hashMap.put("_jsvi", String.valueOf(this.g));
            String str5 = this.h;
            if (str5 == null) {
                str5 = "";
            }
            hashMap.put("_jsid", str5);
            String str6 = this.i;
            if (str6 == null) {
                str6 = "";
            }
            hashMap.put("_aver", str6);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new af(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        @Override // com.uc.webview.internal.stats.c
        public final boolean h() {
            return false;
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 0L;
            this.f = null;
            this.g = 0L;
            this.h = null;
            this.i = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("jsi", e());
        }
    }

    /* loaded from: classes9.dex */
    static class ag implements c.a {
        private ag() {
        }

        /* synthetic */ ag(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new af(a.a(map, "ebd", ""), a.a(map, "prc", ""), a.a(map, "thr", ""), a.a(map, "jpv"), a.a(map, "jsv", ""), a.a(map, "jsvi"), a.a(map, "jsid", ""), a.a(map, "aver", ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class ah extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h d;
        public String b;
        public String c;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("keyword_hyperlink_click");
            d = hVar;
            StatsManager.a(hVar);
        }

        public ah() {
        }

        private ah(String str, String str2) {
            if (str != null && str.length() > 64) {
                str = str.substring(0, 64);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 64) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 64);
            }
        }

        /* synthetic */ ah(String str, String str2, byte b) {
            this(str, str2);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return d;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 8 + a.a(this.c);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 8;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_url", str);
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_txt", str2);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new ah(this.b, this.c);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("keyword_hyperlink_click", e());
        }
    }

    /* loaded from: classes9.dex */
    static class ai implements c.a {
        private ai() {
        }

        /* synthetic */ ai(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new ah(a.a(map, "url", ""), a.a(map, "txt", ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class aj extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h d;
        public String b;
        public String c;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("keyword_hyperlink_expose");
            d = hVar;
            StatsManager.a(hVar);
        }

        public aj() {
        }

        private aj(String str, String str2) {
            if (str != null && str.length() > 64) {
                str = str.substring(0, 64);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 64) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 64);
            }
        }

        /* synthetic */ aj(String str, String str2, byte b) {
            this(str, str2);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return d;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 8 + a.a(this.c);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 8;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_url", str);
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_txt", str2);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new aj(this.b, this.c);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("keyword_hyperlink_expose", e());
        }
    }

    /* loaded from: classes9.dex */
    static class ak implements c.a {
        private ak() {
        }

        /* synthetic */ ak(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new aj(a.a(map, "url", ""), a.a(map, "txt", ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class al extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h s;
        public String b;
        public String c;
        public String d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public long j;
        public long k;
        public long l;
        public long m;
        public long n;
        public long o;
        public long p;
        public long q;
        public long r;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("lottie_stats");
            s = hVar;
            StatsManager.a(hVar);
        }

        public al() {
        }

        private al(String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
            String str4 = str;
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = j4;
            this.i = j5;
            this.j = j6;
            this.k = j7;
            this.l = j8;
            this.m = j9;
            this.n = j10;
            this.o = j11;
            this.p = j12;
            this.q = j13;
            this.r = j14;
            if (str4 != null && str.length() > 64) {
                str4 = str.substring(0, 64);
            }
            this.b = str4;
            if (str2 == null || str2.length() <= 64) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 64);
            }
            if (str3 == null || str3.length() <= 128) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 128);
            }
        }

        /* synthetic */ al(String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, byte b) {
            this(str, str2, str3, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return s;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 53 + a.a(this.c) + a.a(this.d) + a.b(this.e) + a.b(this.f) + a.b(this.g) + a.b(this.h) + a.b(this.i) + a.b(this.j) + a.b(this.k) + a.b(this.l) + a.b(this.m) + a.b(this.n) + a.b(this.o) + a.b(this.p) + a.b(this.q) + a.b(this.r);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 53;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_ver", str);
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_sv", str2);
            String str3 = this.d;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("_url", str3);
            hashMap.put("_jl", String.valueOf(this.e));
            hashMap.put("_js", String.valueOf(this.f));
            hashMap.put("_ja", String.valueOf(this.g));
            hashMap.put("_al", String.valueOf(this.h));
            hashMap.put("_bs", String.valueOf(this.i));
            hashMap.put("_dd", String.valueOf(this.j));
            hashMap.put("_id", String.valueOf(this.k));
            hashMap.put("_fd", String.valueOf(this.l));
            hashMap.put("_ff", String.valueOf(this.m));
            hashMap.put("_t2", String.valueOf(this.n));
            hashMap.put("_fr", String.valueOf(this.o));
            hashMap.put("_ex", String.valueOf(this.p));
            hashMap.put("_ac", String.valueOf(this.q));
            hashMap.put("_rr", String.valueOf(this.r));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new al(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = 0L;
            this.i = 0L;
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            this.m = 0L;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            this.q = 0L;
            this.r = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("lottie_stats", e());
        }
    }

    /* loaded from: classes9.dex */
    static class am implements c.a {
        private am() {
        }

        /* synthetic */ am(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new al(a.a(map, MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, ""), a.a(map, BizContext.KEY_SDK_VERSION, ""), a.a(map, "url", ""), a.a(map, "jl"), a.a(map, "js"), a.a(map, "ja"), a.a(map, "al"), a.a(map, "bs"), a.a(map, "dd"), a.a(map, "id"), a.a(map, "fd"), a.a(map, "ff"), a.a(map, pqe.STAGE_T2), a.a(map, "fr"), a.a(map, ErrorType.DEFAULT), a.a(map, "ac"), a.a(map, "rr"), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class an extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h aJ;
        public long A;
        public long B;
        public long C;
        public long D;
        public long E;
        public long F;
        public long G;
        public long H;
        public long I;
        public long J;
        public String K;
        public long L;
        public long M;
        public long N;
        public long O;
        public long P;
        public long Q;
        public long R;
        public long S;
        public long T;
        public long U;
        public long V;
        public long W;
        public long X;
        public long Y;
        public long Z;
        public long aA;
        public long aB;
        public long aC;
        public String aD;
        public long aE;
        public long aF;
        public long aG;
        public long aH;
        public String aI;
        public long aa;
        public long ab;
        public long ac;
        public long ad;
        public long ae;
        public long af;
        public long ag;
        public long ah;
        public long ai;
        public long aj;
        public long ak;
        public long al;
        public long am;
        public long an;
        public long ao;
        public long ap;
        public long aq;
        public long ar;
        public long as;
        public long at;
        public long au;
        public long av;
        public long aw;
        public long ax;
        public long ay;
        public long az;
        public long b;
        public long c;
        public long d;
        public String e;
        public String f;
        public long g;
        public long h;
        public long i;
        public long j;
        public long k;
        public long l;
        public long m;
        public long n;
        public long o;
        public long p;
        public long q;
        public long r;
        public long s;
        public long t;
        public long u;
        public long v;
        public long w;
        public long x;
        public long y;
        public long z;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("media_stats");
            aJ = hVar;
            StatsManager.a(hVar);
        }

        public an() {
        }

        private an(long j, long j2, long j3, String str, String str2, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, String str3, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, long j63, long j64, long j65, long j66, long j67, long j68, long j69, long j70, long j71, long j72, long j73, long j74, long j75, long j76, long j77, String str4, long j78, long j79, long j80, long j81, String str5) {
            String str6 = str;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.g = j4;
            this.h = j5;
            this.i = j6;
            this.j = j7;
            this.k = j8;
            this.l = j9;
            this.m = j10;
            this.n = j11;
            this.o = j12;
            this.p = j13;
            this.q = j14;
            this.r = j15;
            this.s = j16;
            this.t = j17;
            this.u = j18;
            this.v = j19;
            this.w = j20;
            this.x = j21;
            this.y = j22;
            this.z = j23;
            this.A = j24;
            this.B = j25;
            this.C = j26;
            this.D = j27;
            this.E = j28;
            this.F = j29;
            this.G = j30;
            this.H = j31;
            this.I = j32;
            this.J = j33;
            this.L = j34;
            this.M = j35;
            this.N = j36;
            this.O = j37;
            this.P = j38;
            this.Q = j39;
            this.R = j40;
            this.S = j41;
            this.T = j42;
            this.U = j43;
            this.V = j44;
            this.W = j45;
            this.X = j46;
            this.Y = j47;
            this.Z = j48;
            this.aa = j49;
            this.ab = j50;
            this.ac = j51;
            this.ad = j52;
            this.ae = j53;
            this.af = j54;
            this.ag = j55;
            this.ah = j56;
            this.ai = j57;
            this.aj = j58;
            this.ak = j59;
            this.al = j60;
            this.am = j61;
            this.an = j62;
            this.ao = j63;
            this.ap = j64;
            this.aq = j65;
            this.ar = j66;
            this.as = j67;
            this.at = j68;
            this.au = j69;
            this.av = j70;
            this.aw = j71;
            this.ax = j72;
            this.ay = j73;
            this.az = j74;
            this.aA = j75;
            this.aB = j76;
            this.aC = j77;
            this.aE = j78;
            this.aF = j79;
            this.aG = j80;
            this.aH = j81;
            if (str6 != null && str.length() > 64) {
                str6 = str6.substring(0, 64);
            }
            this.e = str6;
            if (str2 == null || str2.length() <= 64) {
                this.f = str2;
            } else {
                this.f = str2.substring(0, 64);
            }
            if (str3 == null || str3.length() <= 64) {
                this.K = str3;
            } else {
                this.K = str3.substring(0, 64);
            }
            if (str4 == null || str4.length() <= 10) {
                this.aD = str4;
            } else {
                this.aD = str4.substring(0, 10);
            }
            if (str5 == null || str5.length() <= 10) {
                this.aI = str5;
            } else {
                this.aI = str5.substring(0, 10);
            }
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return aJ;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.b(this.b) + 313 + a.b(this.c) + a.b(this.d) + a.a(this.e) + a.a(this.f) + a.b(this.g) + a.b(this.h) + a.b(this.i) + a.b(this.j) + a.b(this.k) + a.b(this.l) + a.b(this.m) + a.b(this.n) + a.b(this.o) + a.b(this.p) + a.b(this.q) + a.b(this.r) + a.b(this.s) + a.b(this.t) + a.b(this.u) + a.b(this.v) + a.b(this.w) + a.b(this.x) + a.b(this.y) + a.b(this.z) + a.b(this.A) + a.b(this.B) + a.b(this.C) + a.b(this.D) + a.b(this.E) + a.b(this.F) + a.b(this.G) + a.b(this.H) + a.b(this.I) + a.b(this.J) + a.a(this.K) + a.b(this.L) + a.b(this.M) + a.b(this.N) + a.b(this.O) + a.b(this.P) + a.b(this.Q) + a.b(this.R) + a.b(this.S) + a.b(this.T) + a.b(this.U) + a.b(this.V) + a.b(this.W) + a.b(this.X) + a.b(this.Y) + a.b(this.Z) + a.b(this.aa) + a.b(this.ab) + a.b(this.ac) + a.b(this.ad) + a.b(this.ae) + a.b(this.af) + a.b(this.ag) + a.b(this.ah) + a.b(this.ai) + a.b(this.aj) + a.b(this.ak) + a.b(this.al) + a.b(this.am) + a.b(this.an) + a.b(this.ao) + a.b(this.ap) + a.b(this.aq) + a.b(this.ar) + a.b(this.as) + a.b(this.at) + a.b(this.au) + a.b(this.av) + a.b(this.aw) + a.b(this.ax) + a.b(this.ay) + a.b(this.az) + a.b(this.aA) + a.b(this.aB) + a.b(this.aC) + a.a(this.aD) + a.b(this.aE) + a.b(this.aF) + a.b(this.aG) + a.b(this.aH) + a.a(this.aI);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 313;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_t3", String.valueOf(this.b));
            hashMap.put("_t3n", String.valueOf(this.c));
            hashMap.put("_blob", String.valueOf(this.d));
            String str = this.e;
            if (str == null) {
                str = "";
            }
            hashMap.put("_ph", str);
            String str2 = this.f;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_src", str2);
            hashMap.put("_nt", String.valueOf(this.g));
            hashMap.put("_errt", String.valueOf(this.h));
            hashMap.put("_errc", String.valueOf(this.i));
            hashMap.put("_erre", String.valueOf(this.j));
            hashMap.put("_ket", String.valueOf(this.k));
            hashMap.put("_kec", String.valueOf(this.l));
            hashMap.put("_kee", String.valueOf(this.m));
            hashMap.put("_cv", String.valueOf(this.n));
            hashMap.put("_tm", String.valueOf(this.o));
            hashMap.put("_td", String.valueOf(this.p));
            hashMap.put("_tdn", String.valueOf(this.q));
            hashMap.put("_pr", String.valueOf(this.r));
            hashMap.put("_dur", String.valueOf(this.s));
            hashMap.put("_pd", String.valueOf(this.t));
            hashMap.put("_sc", String.valueOf(this.u));
            hashMap.put("_st", String.valueOf(this.v));
            hashMap.put("_bc", String.valueOf(this.w));
            hashMap.put("_bt", String.valueOf(this.x));
            hashMap.put("_pt", String.valueOf(this.y));
            hashMap.put("_t0", String.valueOf(this.z));
            hashMap.put("_gcf", String.valueOf(this.A));
            hashMap.put("_bk", String.valueOf(this.B));
            hashMap.put("_ap", String.valueOf(this.C));
            hashMap.put("_mss", String.valueOf(this.D));
            hashMap.put("_ctr", String.valueOf(this.E));
            hashMap.put("_at", String.valueOf(this.F));
            hashMap.put("_mt", String.valueOf(this.G));
            hashMap.put("_aty", String.valueOf(this.H));
            hashMap.put("_lp", String.valueOf(this.I));
            hashMap.put("_fr", String.valueOf(this.J));
            String str3 = this.K;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("_ver", str3);
            hashMap.put("_rhp", String.valueOf(this.L));
            hashMap.put("_ucf", String.valueOf(this.M));
            hashMap.put("_tp", String.valueOf(this.N));
            hashMap.put("_ts", String.valueOf(this.O));
            hashMap.put("_tpp", String.valueOf(this.P));
            hashMap.put("_tpp2", String.valueOf(this.Q));
            hashMap.put("_dl", String.valueOf(this.R));
            hashMap.put("_vm", String.valueOf(this.S));
            hashMap.put("_sf", String.valueOf(this.T));
            hashMap.put("_se", String.valueOf(this.U));
            hashMap.put("_af", String.valueOf(this.V));
            hashMap.put("_ef", String.valueOf(this.W));
            hashMap.put("_cf", String.valueOf(this.X));
            hashMap.put("_ef1", String.valueOf(this.Y));
            hashMap.put("_cf1", String.valueOf(this.Z));
            hashMap.put("_lw", String.valueOf(this.aa));
            hashMap.put("_lh", String.valueOf(this.ab));
            hashMap.put("_adt", String.valueOf(this.ac));
            hashMap.put("_adtd", String.valueOf(this.ad));
            hashMap.put("_rt", String.valueOf(this.ae));
            hashMap.put("_bc2", String.valueOf(this.af));
            hashMap.put("_bt2", String.valueOf(this.ag));
            hashMap.put("_upr", String.valueOf(this.ah));
            hashMap.put("_upt", String.valueOf(this.ai));
            hashMap.put("_csv", String.valueOf(this.aj));
            hashMap.put("_csv1", String.valueOf(this.ak));
            hashMap.put("_usm", String.valueOf(this.al));
            hashMap.put("_udmc", String.valueOf(this.am));
            hashMap.put("_pl", String.valueOf(this.an));
            hashMap.put("_wt", String.valueOf(this.ao));
            hashMap.put("_efc", String.valueOf(this.ap));
            hashMap.put("_efct", String.valueOf(this.aq));
            hashMap.put("_jsc", String.valueOf(this.ar));
            hashMap.put("_th", String.valueOf(this.as));
            hashMap.put("_ce", String.valueOf(this.at));
            hashMap.put("_hb", String.valueOf(this.au));
            hashMap.put("_hbr", String.valueOf(this.av));
            hashMap.put("_el", String.valueOf(this.aw));
            hashMap.put("_cl", String.valueOf(this.ax));
            hashMap.put("_ef3", String.valueOf(this.ay));
            hashMap.put("_cf3", String.valueOf(this.az));
            hashMap.put("_sd", String.valueOf(this.aA));
            hashMap.put("_sd2", String.valueOf(this.aB));
            hashMap.put("_ib", String.valueOf(this.aC));
            String str4 = this.aD;
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("_bid", str4);
            hashMap.put("_unca", String.valueOf(this.aE));
            hashMap.put("_jsf", String.valueOf(this.aF));
            hashMap.put("_cvc", String.valueOf(this.aG));
            hashMap.put("_nafr", String.valueOf(this.aH));
            String str5 = this.aI;
            if (str5 == null) {
                str5 = "";
            }
            hashMap.put("_fd", str5);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new an(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.aa, this.ab, this.ac, this.ad, this.ae, this.af, this.ag, this.ah, this.ai, this.aj, this.ak, this.al, this.am, this.an, this.ao, this.ap, this.aq, this.ar, this.as, this.at, this.au, this.av, this.aw, this.ax, this.ay, this.az, this.aA, this.aB, this.aC, this.aD, this.aE, this.aF, this.aG, this.aH, this.aI);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = null;
            this.f = null;
            this.g = 0L;
            this.h = 0L;
            this.i = 0L;
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            this.m = 0L;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            this.q = 0L;
            this.r = 0L;
            this.s = 0L;
            this.t = 0L;
            this.u = 0L;
            this.v = 0L;
            this.w = 0L;
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.E = 0L;
            this.F = 0L;
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = null;
            this.L = 0L;
            this.M = 0L;
            this.N = 0L;
            this.O = 0L;
            this.P = 0L;
            this.Q = 0L;
            this.R = 0L;
            this.S = 0L;
            this.T = 0L;
            this.U = 0L;
            this.V = 0L;
            this.W = 0L;
            this.X = 0L;
            this.Y = 0L;
            this.Z = 0L;
            this.aa = 0L;
            this.ab = 0L;
            this.ac = 0L;
            this.ad = 0L;
            this.ae = 0L;
            this.af = 0L;
            this.ag = 0L;
            this.ah = 0L;
            this.ai = 0L;
            this.aj = 0L;
            this.ak = 0L;
            this.al = 0L;
            this.am = 0L;
            this.an = 0L;
            this.ao = 0L;
            this.ap = 0L;
            this.aq = 0L;
            this.ar = 0L;
            this.as = 0L;
            this.at = 0L;
            this.au = 0L;
            this.av = 0L;
            this.aw = 0L;
            this.ax = 0L;
            this.ay = 0L;
            this.az = 0L;
            this.aA = 0L;
            this.aB = 0L;
            this.aC = 0L;
            this.aD = null;
            this.aE = 0L;
            this.aF = 0L;
            this.aG = 0L;
            this.aH = 0L;
            this.aI = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("media_stats", e());
        }
    }

    /* loaded from: classes9.dex */
    static class ao implements c.a {
        private ao() {
        }

        /* synthetic */ ao(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new an(a.a(map, pqe.STAGE_T3), a.a(map, "t3n"), a.a(map, "blob"), a.a(map, "ph", ""), a.a(map, "src", ""), a.a(map, "nt"), a.a(map, "errt"), a.a(map, "errc"), a.a(map, "erre"), a.a(map, "ket"), a.a(map, "kec"), a.a(map, "kee"), a.a(map, DispatchConstants.CONFIG_VERSION), a.a(map, "tm"), a.a(map, TimeDisplaySetting.TIME_DISPLAY), a.a(map, "tdn"), a.a(map, "pr"), a.a(map, "dur"), a.a(map, "pd"), a.a(map, "sc"), a.a(map, "st"), a.a(map, "bc"), a.a(map, "bt"), a.a(map, AdvertisementOption.PRIORITY_VALID_TIME), a.a(map, pqe.STAGE_T0), a.a(map, "gcf"), a.a(map, "bk"), a.a(map, "ap"), a.a(map, "mss"), a.a(map, "ctr"), a.a(map, "at"), a.a(map, "mt"), a.a(map, "aty"), a.a(map, "lp"), a.a(map, "fr"), a.a(map, MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, ""), a.a(map, "rhp"), a.a(map, "ucf"), a.a(map, "tp"), a.a(map, "ts"), a.a(map, "tpp"), a.a(map, "tpp2"), a.a(map, "dl"), a.a(map, "vm"), a.a(map, "sf"), a.a(map, "se"), a.a(map, "af"), a.a(map, "ef"), a.a(map, "cf"), a.a(map, "ef1"), a.a(map, "cf1"), a.a(map, "lw"), a.a(map, "lh"), a.a(map, "adt"), a.a(map, "adtd"), a.a(map, "rt"), a.a(map, "bc2"), a.a(map, "bt2"), a.a(map, "upr"), a.a(map, "upt"), a.a(map, "csv"), a.a(map, "csv1"), a.a(map, "usm"), a.a(map, "udmc"), a.a(map, "pl"), a.a(map, "wt"), a.a(map, "efc"), a.a(map, "efct"), a.a(map, "jsc"), a.a(map, "th"), a.a(map, "ce"), a.a(map, "hb"), a.a(map, "hbr"), a.a(map, "el"), a.a(map, "cl"), a.a(map, "ef3"), a.a(map, "cf3"), a.a(map, "sd"), a.a(map, "sd2"), a.a(map, "ib"), a.a(map, "bid", ""), a.a(map, "unca"), a.a(map, "jsf"), a.a(map, "cvc"), a.a(map, "nafr"), a.a(map, "fd", ""));
        }
    }

    /* loaded from: classes9.dex */
    public static class ap extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h g;
        public long b;
        public long c;
        public long d;
        public long e;
        public String f;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("pass_fail");
            g = hVar;
            StatsManager.a(hVar);
        }

        public ap() {
        }

        private ap(long j, long j2, long j3, long j4, String str) {
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            if (str == null || str.length() <= 64) {
                this.f = str;
            } else {
                this.f = str.substring(0, 64);
            }
        }

        /* synthetic */ ap(long j, long j2, long j3, long j4, String str, byte b) {
            this(j, j2, j3, j4, str);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return g;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.b(this.b) + 10 + a.b(this.c) + a.b(this.d) + a.b(this.e) + a.a(this.f);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 10;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_r", String.valueOf(this.b));
            hashMap.put("_o", String.valueOf(this.c));
            hashMap.put("_s", String.valueOf(this.d));
            hashMap.put("_n", String.valueOf(this.e));
            String str = this.f;
            if (str == null) {
                str = "";
            }
            hashMap.put("_m", str);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new ap(this.b, this.c, this.d, this.e, this.f);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("pass_fail", e());
        }
    }

    /* loaded from: classes9.dex */
    static class aq implements c.a {
        private aq() {
        }

        /* synthetic */ aq(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new ap(a.a(map, "r"), a.a(map, com.alibaba.security.realidentity.o.b), a.a(map, "s"), a.a(map, "n"), a.a(map, "m", ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class ar extends com.uc.webview.internal.stats.c {
        static final /* synthetic */ boolean d = !a.class.desiredAssertionStatus();
        private static final com.uc.webview.internal.stats.h e;
        public String b;
        public long c;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("pinch_zoom");
            e = hVar;
            StatsManager.a(hVar);
        }

        public ar() {
        }

        private ar(String str, long j) {
            this.c = j;
            if (str == null || str.length() <= 256) {
                this.b = str;
            } else {
                this.b = str.substring(0, 256);
            }
        }

        /* synthetic */ ar(String str, long j, byte b) {
            this(str, j);
        }

        @Override // com.uc.webview.internal.stats.c
        public final boolean a(com.uc.webview.internal.stats.c cVar) {
            if (d || (cVar instanceof ar)) {
                ar arVar = (ar) cVar;
                String str = this.b;
                return str != null && str.equals(arVar.b);
            }
            throw new AssertionError();
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return e;
        }

        @Override // com.uc.webview.internal.stats.c
        public final void b(com.uc.webview.internal.stats.c cVar) {
            if (d || (cVar instanceof ar)) {
                this.c += ((ar) cVar).c;
                this.f23996a = 0;
                return;
            }
            throw new AssertionError();
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 4 + a.b(this.c);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 4;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_u", str);
            hashMap.put("_c", String.valueOf(this.c));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new ar(this.b, this.c);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("pinch_zoom", e());
        }
    }

    /* loaded from: classes9.dex */
    static class as implements c.a {
        private as() {
        }

        /* synthetic */ as(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new ar(a.a(map, RVStartParams.KEY_URL_SHORT, ""), a.a(map, com.taobao.android.msoa.c.TAG), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class at extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h d;
        public long b;
        public long c;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("pr_stats");
            d = hVar;
            StatsManager.a(hVar);
        }

        public at() {
        }

        private at(long j, long j2) {
            this.b = j;
            this.c = j2;
        }

        /* synthetic */ at(long j, long j2, byte b) {
            this(j, j2);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return d;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.b(this.b) + 6 + a.b(this.c);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 6;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_at", String.valueOf(this.b));
            hashMap.put("_tl", String.valueOf(this.c));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new at(this.b, this.c);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = 0L;
            this.c = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("pr_stats", e());
        }
    }

    /* loaded from: classes9.dex */
    static class au implements c.a {
        private au() {
        }

        /* synthetic */ au(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new at(a.a(map, "at"), a.a(map, "tl"), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class av extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h f;
        public long b;
        public long c;
        public long d;
        public long e;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("prerender_v0");
            f = hVar;
            StatsManager.a(hVar);
        }

        public av() {
        }

        private av(long j, long j2, long j3, long j4) {
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
        }

        /* synthetic */ av(long j, long j2, long j3, long j4, byte b) {
            this(j, j2, j3, j4);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return f;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.b(this.b) + 12 + a.b(this.c) + a.b(this.d) + a.b(this.e);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 12;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_ps", String.valueOf(this.b));
            hashMap.put("_pr", String.valueOf(this.c));
            hashMap.put("_rs", String.valueOf(this.d));
            hashMap.put("_pt", String.valueOf(this.e));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new av(this.b, this.c, this.d, this.e);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("prerender_v0", e());
        }
    }

    /* loaded from: classes9.dex */
    static class aw implements c.a {
        private aw() {
        }

        /* synthetic */ aw(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new av(a.a(map, "ps"), a.a(map, "pr"), a.a(map, "rs"), a.a(map, AdvertisementOption.PRIORITY_VALID_TIME), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class ax extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h c;
        public String b;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("proc_stats2");
            c = hVar;
            StatsManager.a(hVar);
        }

        public ax() {
        }

        private ax(String str) {
            if (str == null || str.length() <= 256) {
                this.b = str;
            } else {
                this.b = str.substring(0, 256);
            }
        }

        /* synthetic */ ax(String str, byte b) {
            this(str);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return c;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 6;
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 6;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_procs", str);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new ax(this.b);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("proc_stats2", e());
        }
    }

    /* loaded from: classes9.dex */
    static class ay implements c.a {
        private ay() {
        }

        /* synthetic */ ay(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new ax(a.a(map, "procs", ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class az extends com.uc.webview.internal.stats.c {
        static final /* synthetic */ boolean f = !a.class.desiredAssertionStatus();
        private static final com.uc.webview.internal.stats.h g;
        public long b;
        public long c;
        public long d;
        public long e;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("sdkpv");
            g = hVar;
            StatsManager.a(hVar);
        }

        public az() {
        }

        private az(long j, long j2, long j3, long j4) {
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
        }

        /* synthetic */ az(long j, long j2, long j3, long j4, byte b) {
            this(j, j2, j3, j4);
        }

        @Override // com.uc.webview.internal.stats.c
        public final boolean a(com.uc.webview.internal.stats.c cVar) {
            if (f || (cVar instanceof az)) {
                return this.b == ((az) cVar).b;
            }
            throw new AssertionError();
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return g;
        }

        @Override // com.uc.webview.internal.stats.c
        public final void b(com.uc.webview.internal.stats.c cVar) {
            if (f || (cVar instanceof az)) {
                az azVar = (az) cVar;
                this.c += azVar.c;
                this.d += azVar.d;
                this.e += azVar.e;
                this.f23996a = 0;
                return;
            }
            throw new AssertionError();
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.b(this.b) + 16 + a.b(this.c) + a.b(this.d) + a.b(this.e);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 16;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_pvt", Long.toString(this.b));
            long j = this.c;
            if (0 != j) {
                hashMap.put("_pvu", Long.toString(j));
            }
            long j2 = this.d;
            if (0 != j2) {
                hashMap.put("_pvs", Long.toString(j2));
            }
            long j3 = this.e;
            if (0 != j3) {
                hashMap.put("_pvi", Long.toString(j3));
            }
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new az(this.b, this.c, this.d, this.e);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("sdkpv", e());
        }
    }

    /* loaded from: classes9.dex */
    public static class b extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h e;
        public long b;
        public String c;
        public long d;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("ac_stats");
            e = hVar;
            StatsManager.a(hVar);
        }

        public b() {
        }

        private b(long j, String str, long j2) {
            this.b = j;
            this.d = j2;
            if (str == null || str.length() <= 64) {
                this.c = str;
            } else {
                this.c = str.substring(0, 64);
            }
        }

        /* synthetic */ b(long j, String str, long j2, byte b) {
            this(j, str, j2);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return e;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.b(this.b) + 9 + a.a(this.c) + a.b(this.d);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 9;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_ac", String.valueOf(this.b));
            String str = this.c;
            if (str == null) {
                str = "";
            }
            hashMap.put("_ph", str);
            hashMap.put("_dc", String.valueOf(this.d));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new b(this.b, this.c, this.d);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = 0L;
            this.c = null;
            this.d = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("ac_stats", e());
        }
    }

    /* loaded from: classes9.dex */
    static class ba implements c.a {
        private ba() {
        }

        /* synthetic */ ba(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new az(a.a(map, "pvt"), a.a(map, "pvu"), a.a(map, "pvs"), a.a(map, "pvi"), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class bb extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h Z;
        public long A;
        public long B;
        public long C;
        public long D;
        public long E;
        public long F;
        public long G;
        public long H;
        public long I;
        public long J;
        public long K;
        public long L;
        public long M;
        public long N;
        public long O;
        public long P;
        public long Q;
        public long R;
        public long S;
        public long T;
        public long U;
        public long V;
        public long W;
        public long X;
        public long Y;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public long n;
        public long o;
        public long p;
        public long q;
        public long r;
        public long s;
        public long t;
        public long u;
        public long v;
        public long w;
        public long x;
        public long y;
        public long z;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("sdksus");
            Z = hVar;
            StatsManager.a(hVar);
        }

        public bb() {
        }

        private bb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
            String str13 = str;
            this.n = j;
            this.o = j2;
            this.p = j3;
            this.q = j4;
            this.r = j5;
            this.s = j6;
            this.t = j7;
            this.u = j8;
            this.v = j9;
            this.w = j10;
            this.x = j11;
            this.y = j12;
            this.z = j13;
            this.A = j14;
            this.B = j15;
            this.C = j16;
            this.D = j17;
            this.E = j18;
            this.F = j19;
            this.G = j20;
            this.H = j21;
            this.I = j22;
            this.J = j23;
            this.K = j24;
            this.L = j25;
            this.M = j26;
            this.N = j27;
            this.O = j28;
            this.P = j29;
            this.Q = j30;
            this.R = j31;
            this.S = j32;
            this.T = j33;
            this.U = j34;
            this.V = j35;
            this.W = j36;
            this.X = j37;
            this.Y = j38;
            if (str13 != null && str.length() > 64) {
                str13 = str13.substring(0, 64);
            }
            this.b = str13;
            if (str2 == null || str2.length() <= 64) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 64);
            }
            if (str3 == null || str3.length() <= 64) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 64);
            }
            if (str4 == null || str4.length() <= 64) {
                this.e = str4;
            } else {
                this.e = str4.substring(0, 64);
            }
            if (str5 == null || str5.length() <= 64) {
                this.f = str5;
            } else {
                this.f = str5.substring(0, 64);
            }
            if (str6 == null || str6.length() <= 64) {
                this.g = str6;
            } else {
                this.g = str6.substring(0, 64);
            }
            if (str7 == null || str7.length() <= 64) {
                this.h = str7;
            } else {
                this.h = str7.substring(0, 64);
            }
            if (str8 == null || str8.length() <= 64) {
                this.i = str8;
            } else {
                this.i = str8.substring(0, 64);
            }
            if (str9 == null || str9.length() <= 64) {
                this.j = str9;
            } else {
                this.j = str9.substring(0, 64);
            }
            if (str10 == null || str10.length() <= 64) {
                this.k = str10;
            } else {
                this.k = str10.substring(0, 64);
            }
            if (str11 == null || str11.length() <= 64) {
                this.l = str11;
            } else {
                this.l = str11.substring(0, 64);
            }
            if (str12 == null || str12.length() <= 64) {
                this.m = str12;
            } else {
                this.m = str12.substring(0, 64);
            }
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return Z;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 170 + a.a(this.c) + a.a(this.d) + a.a(this.e) + a.a(this.f) + a.a(this.g) + a.a(this.h) + a.a(this.i) + a.a(this.j) + a.a(this.k) + a.a(this.l) + a.a(this.m) + a.b(this.n) + a.b(this.o) + a.b(this.p) + a.b(this.q) + a.b(this.r) + a.b(this.s) + a.b(this.t) + a.b(this.u) + a.b(this.v) + a.b(this.w) + a.b(this.x) + a.b(this.y) + a.b(this.z) + a.b(this.A) + a.b(this.B) + a.b(this.C) + a.b(this.D) + a.b(this.E) + a.b(this.F) + a.b(this.G) + a.b(this.H) + a.b(this.I) + a.b(this.J) + a.b(this.K) + a.b(this.L) + a.b(this.M) + a.b(this.N) + a.b(this.O) + a.b(this.P) + a.b(this.Q) + a.b(this.R) + a.b(this.S) + a.b(this.T) + a.b(this.U) + a.b(this.V) + a.b(this.W) + a.b(this.X) + a.b(this.Y);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 170;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_ru", str);
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_fu", str2);
            String str3 = this.d;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("_it", str3);
            String str4 = this.e;
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("_fc", str4);
            String str5 = this.f;
            if (str5 == null) {
                str5 = "";
            }
            hashMap.put("_fm", str5);
            String str6 = this.g;
            if (str6 == null) {
                str6 = "";
            }
            hashMap.put("_re", str6);
            String str7 = this.h;
            if (str7 == null) {
                str7 = "";
            }
            hashMap.put("_uf", str7);
            String str8 = this.i;
            if (str8 == null) {
                str8 = "";
            }
            hashMap.put("_zf", str8);
            String str9 = this.j;
            if (str9 == null) {
                str9 = "";
            }
            hashMap.put("_nd", str9);
            String str10 = this.k;
            if (str10 == null) {
                str10 = "";
            }
            hashMap.put("_upcd", str10);
            String str11 = this.l;
            if (str11 == null) {
                str11 = "";
            }
            hashMap.put("_upcs", str11);
            String str12 = this.m;
            if (str12 == null) {
                str12 = "";
            }
            hashMap.put("_pcdlt", str12);
            hashMap.put("_as", String.valueOf(this.n));
            hashMap.put("_is", String.valueOf(this.o));
            hashMap.put("_ise", String.valueOf(this.p));
            hashMap.put("_cr", String.valueOf(this.q));
            hashMap.put("_cre", String.valueOf(this.r));
            hashMap.put("_us", String.valueOf(this.s));
            hashMap.put("_uh", String.valueOf(this.t));
            hashMap.put("_ue", String.valueOf(this.u));
            hashMap.put("_ux", String.valueOf(this.v));
            hashMap.put("_es", String.valueOf(this.w));
            hashMap.put("_ee", String.valueOf(this.x));
            hashMap.put("_ex", String.valueOf(this.y));
            hashMap.put("_ci", String.valueOf(this.z));
            hashMap.put("_ld", String.valueOf(this.A));
            hashMap.put("_lde", String.valueOf(this.B));
            hashMap.put("_ln", String.valueOf(this.C));
            hashMap.put("_lne", String.valueOf(this.D));
            hashMap.put("_ic", String.valueOf(this.E));
            hashMap.put("_cf", String.valueOf(this.F));
            hashMap.put("_cfe", String.valueOf(this.G));
            hashMap.put("_ce", String.valueOf(this.H));
            hashMap.put("_cee", String.valueOf(this.I));
            hashMap.put("_nl", String.valueOf(this.J));
            hashMap.put("_nle", String.valueOf(this.K));
            hashMap.put("_ew", String.valueOf(this.L));
            hashMap.put("_ewe", String.valueOf(this.M));
            hashMap.put("_ww", String.valueOf(this.N));
            hashMap.put("_wwe", String.valueOf(this.O));
            hashMap.put("_aw", String.valueOf(this.P));
            hashMap.put("_awe", String.valueOf(this.Q));
            hashMap.put("_ac", String.valueOf(this.R));
            hashMap.put("_ace", String.valueOf(this.S));
            hashMap.put("_pr", String.valueOf(this.T));
            hashMap.put("_pre", String.valueOf(this.U));
            hashMap.put("_pi", String.valueOf(this.V));
            hashMap.put("_pie", String.valueOf(this.W));
            hashMap.put("_ps", String.valueOf(this.X));
            hashMap.put("_px", String.valueOf(this.Y));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bb(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            this.q = 0L;
            this.r = 0L;
            this.s = 0L;
            this.t = 0L;
            this.u = 0L;
            this.v = 0L;
            this.w = 0L;
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.E = 0L;
            this.F = 0L;
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.L = 0L;
            this.M = 0L;
            this.N = 0L;
            this.O = 0L;
            this.P = 0L;
            this.Q = 0L;
            this.R = 0L;
            this.S = 0L;
            this.T = 0L;
            this.U = 0L;
            this.V = 0L;
            this.W = 0L;
            this.X = 0L;
            this.Y = 0L;
            this.f23996a = 0;
        }

        public String toString() {
            return a("sdksus", e());
        }
    }

    /* loaded from: classes9.dex */
    static class bc implements c.a {
        private bc() {
        }

        /* synthetic */ bc(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bb(a.a(map, "ru", ""), a.a(map, "fu", ""), a.a(map, AdvanceSetting.NETWORK_TYPE, ""), a.a(map, "fc", ""), a.a(map, "fm", ""), a.a(map, "re", ""), a.a(map, "uf", ""), a.a(map, "zf", ""), a.a(map, "nd", ""), a.a(map, "upcd", ""), a.a(map, "upcs", ""), a.a(map, "pcdlt", ""), a.a(map, "as"), a.a(map, "is"), a.a(map, "ise"), a.a(map, "cr"), a.a(map, "cre"), a.a(map, "us"), a.a(map, "uh"), a.a(map, "ue"), a.a(map, "ux"), a.a(map, "es"), a.a(map, "ee"), a.a(map, ErrorType.DEFAULT), a.a(map, "ci"), a.a(map, "ld"), a.a(map, "lde"), a.a(map, "ln"), a.a(map, "lne"), a.a(map, "ic"), a.a(map, "cf"), a.a(map, "cfe"), a.a(map, "ce"), a.a(map, "cee"), a.a(map, "nl"), a.a(map, "nle"), a.a(map, "ew"), a.a(map, "ewe"), a.a(map, "ww"), a.a(map, "wwe"), a.a(map, "aw"), a.a(map, "awe"), a.a(map, "ac"), a.a(map, "ace"), a.a(map, "pr"), a.a(map, "pre"), a.a(map, "pi"), a.a(map, "pie"), a.a(map, "ps"), a.a(map, "px"));
        }
    }

    /* loaded from: classes9.dex */
    public static class bd extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h f;
        public String b;
        public long c;
        public long d;
        public long e;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("snapsh_creat");
            f = hVar;
            StatsManager.a(hVar);
        }

        public bd() {
        }

        private bd(String str, long j, long j2, long j3) {
            this.c = j;
            this.d = j2;
            this.e = j3;
            if (str == null || str.length() <= 128) {
                this.b = str;
            } else {
                this.b = str.substring(0, 128);
            }
        }

        /* synthetic */ bd(String str, long j, long j2, long j3, byte b) {
            this(str, j, j2, j3);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return f;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 20 + a.b(this.c) + a.b(this.d) + a.b(this.e);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 20;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_key", str);
            hashMap.put("_usnap", String.valueOf(this.c));
            hashMap.put("_ccti", String.valueOf(this.d));
            hashMap.put("_ccre", String.valueOf(this.e));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bd(this.b, this.c, this.d, this.e);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("snapsh_creat", e());
        }
    }

    /* loaded from: classes9.dex */
    static class be implements c.a {
        private be() {
        }

        /* synthetic */ be(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bd(a.a(map, "key", ""), a.a(map, "usnap"), a.a(map, "ccti"), a.a(map, "ccre"), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class bf extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h g;
        public String b;
        public long c;
        public long d;
        public long e;
        public long f;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("snapsh_init");
            g = hVar;
            StatsManager.a(hVar);
        }

        public bf() {
        }

        private bf(String str, long j, long j2, long j3, long j4) {
            this.c = j;
            this.d = j2;
            this.e = j3;
            this.f = j4;
            if (str == null || str.length() <= 128) {
                this.b = str;
            } else {
                this.b = str.substring(0, 128);
            }
        }

        /* synthetic */ bf(String str, long j, long j2, long j3, long j4, byte b) {
            this(str, j, j2, j3, j4);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return g;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 24 + a.b(this.c) + a.b(this.d) + a.b(this.e) + a.b(this.f);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 24;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_key", str);
            hashMap.put("_ssiz", String.valueOf(this.c));
            hashMap.put("_siti", String.valueOf(this.d));
            hashMap.put("_sire", String.valueOf(this.e));
            hashMap.put("_sibd", String.valueOf(this.f));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bf(this.b, this.c, this.d, this.e, this.f);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("snapsh_init", e());
        }
    }

    /* loaded from: classes9.dex */
    static class bg implements c.a {
        private bg() {
        }

        /* synthetic */ bg(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bf(a.a(map, "key", ""), a.a(map, "ssiz"), a.a(map, "siti"), a.a(map, "sire"), a.a(map, "sibd"), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class bh extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h e;
        public String b;
        public String c;
        public long d;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("snapsh_load");
            e = hVar;
            StatsManager.a(hVar);
        }

        public bh() {
        }

        private bh(String str, String str2, long j) {
            this.d = j;
            if (str != null && str.length() > 128) {
                str = str.substring(0, 128);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 128) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 128);
            }
        }

        /* synthetic */ bh(String str, String str2, long j, byte b) {
            this(str, str2, j);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return e;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 15 + a.a(this.c) + a.b(this.d);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 15;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_skey", str);
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_surl", str2);
            hashMap.put("_slre", String.valueOf(this.d));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bh(this.b, this.c, this.d);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = null;
            this.d = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("snapsh_load", e());
        }
    }

    /* loaded from: classes9.dex */
    static class bi implements c.a {
        private bi() {
        }

        /* synthetic */ bi(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bh(a.a(map, "skey", ""), a.a(map, "surl", ""), a.a(map, "slre"), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class bj extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h f;
        public String b;
        public String c;
        public String d;
        public String e;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("und_s");
            f = hVar;
            StatsManager.a(hVar);
        }

        public bj() {
        }

        private bj(String str, String str2, String str3, String str4) {
            if (str != null && str.length() > 128) {
                str = str.substring(0, 128);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 1024) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 1024);
            }
            if (str3 == null || str3.length() <= 4096) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 4096);
            }
            if (str4 == null || str4.length() <= 4096) {
                this.e = str4;
            } else {
                this.e = str4.substring(0, 4096);
            }
        }

        /* synthetic */ bj(String str, String str2, String str3, String str4, byte b) {
            this(str, str2, str3, str4);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return f;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 8 + a.a(this.c) + a.a(this.d) + a.a(this.e);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 8;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_h", str);
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_u", str2);
            String str3 = this.d;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("_r", str3);
            String str4 = this.e;
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("_e", str4);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bj(this.b, this.c, this.d, this.e);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("und_s", e());
        }
    }

    /* loaded from: classes9.dex */
    static class bk implements c.a {
        private bk() {
        }

        /* synthetic */ bk(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bj(a.a(map, "h", ""), a.a(map, RVStartParams.KEY_URL_SHORT, ""), a.a(map, "r", ""), a.a(map, "e", ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class bl extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h s;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public String h;
        public long i;
        public long j;
        public long k;
        public long l;
        public long m;
        public long n;
        public long o;
        public long p;
        public long q;
        public long r;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("v8aot");
            s = hVar;
            StatsManager.a(hVar);
        }

        public bl() {
        }

        private bl(long j, long j2, long j3, long j4, long j5, long j6, String str, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.i = j7;
            this.j = j8;
            this.k = j9;
            this.l = j10;
            this.m = j11;
            this.n = j12;
            this.o = j13;
            this.p = j14;
            this.q = j15;
            this.r = j16;
            if (str == null || str.length() <= 128) {
                this.h = str;
            } else {
                this.h = str.substring(0, 128);
            }
        }

        /* synthetic */ bl(long j, long j2, long j3, long j4, long j5, long j6, String str, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, byte b) {
            this(j, j2, j3, j4, j5, j6, str, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return s;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.b(this.b) + 72 + a.b(this.c) + a.b(this.d) + a.b(this.e) + a.b(this.f) + a.b(this.g) + a.a(this.h) + a.b(this.i) + a.b(this.j) + a.b(this.k) + a.b(this.l) + a.b(this.m) + a.b(this.n) + a.b(this.o) + a.b(this.p) + a.b(this.q) + a.b(this.r);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 72;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            long j = this.b;
            if (0 != j) {
                hashMap.put("_tal", Long.toString(j));
            }
            long j2 = this.c;
            if (0 != j2) {
                hashMap.put("_suc", Long.toString(j2));
            }
            long j3 = this.d;
            if (0 != j3) {
                hashMap.put("_neww", Long.toString(j3));
            }
            long j4 = this.e;
            if (0 != j4) {
                hashMap.put("_otal", Long.toString(j4));
            }
            long j5 = this.f;
            if (0 != j5) {
                hashMap.put("_osuc", Long.toString(j5));
            }
            long j6 = this.g;
            if (0 != j6) {
                hashMap.put("_oupd", Long.toString(j6));
            }
            String str = this.h;
            if (str != null && !str.isEmpty()) {
                hashMap.put("_purl", this.h);
            }
            long j7 = this.i;
            if (0 != j7) {
                hashMap.put("_js", Long.toString(j7));
            }
            long j8 = this.j;
            if (0 != j8) {
                hashMap.put("_ctc", Long.toString(j8));
            }
            long j9 = this.k;
            if (0 != j9) {
                hashMap.put("_hmc", Long.toString(j9));
            }
            long j10 = this.l;
            if (0 != j10) {
                hashMap.put("_tcc", Long.toString(j10));
            }
            long j11 = this.m;
            if (0 != j11) {
                hashMap.put("_hcc", Long.toString(j11));
            }
            long j12 = this.n;
            if (0 != j12) {
                hashMap.put("_tuc", Long.toString(j12));
            }
            long j13 = this.o;
            if (0 != j13) {
                hashMap.put("_huc", Long.toString(j13));
            }
            long j14 = this.p;
            if (0 != j14) {
                hashMap.put("_ncc", Long.toString(j14));
            }
            long j15 = this.q;
            if (0 != j15) {
                hashMap.put("_hac", Long.toString(j15));
            }
            long j16 = this.r;
            if (0 != j16) {
                hashMap.put("_afl", Long.toString(j16));
            }
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bl(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        }

        @Override // com.uc.webview.internal.stats.c
        public final boolean h() {
            return false;
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = null;
            this.i = 0L;
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            this.m = 0L;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            this.q = 0L;
            this.r = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("v8aot", e());
        }
    }

    /* loaded from: classes9.dex */
    static class bm implements c.a {
        private bm() {
        }

        /* synthetic */ bm(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bl(a.a(map, "tal"), a.a(map, "suc"), a.a(map, "neww"), a.a(map, "otal"), a.a(map, "osuc"), a.a(map, "oupd"), a.a(map, "purl", ""), a.a(map, "js"), a.a(map, "ctc"), a.a(map, "hmc"), a.a(map, "tcc"), a.a(map, "hcc"), a.a(map, "tuc"), a.a(map, "huc"), a.a(map, "ncc"), a.a(map, "hac"), a.a(map, "afl"), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class bn extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h m;
        public String b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public long j;
        public long k;
        public long l;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("webrtc_stats");
            m = hVar;
            StatsManager.a(hVar);
        }

        public bn() {
        }

        private bn(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
            this.c = j;
            this.d = j2;
            this.e = j3;
            this.f = j4;
            this.g = j5;
            this.h = j6;
            this.i = j7;
            this.j = j8;
            this.k = j9;
            this.l = j10;
            if (str == null || str.length() <= 64) {
                this.b = str;
            } else {
                this.b = str.substring(0, 64);
            }
        }

        /* synthetic */ bn(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, byte b) {
            this(str, j, j2, j3, j4, j5, j6, j7, j8, j9, j10);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return m;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 34 + a.b(this.c) + a.b(this.d) + a.b(this.e) + a.b(this.f) + a.b(this.g) + a.b(this.h) + a.b(this.i) + a.b(this.j) + a.b(this.k) + a.b(this.l);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 34;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_ph", str);
            hashMap.put("_cv", String.valueOf(this.c));
            hashMap.put("_ca", String.valueOf(this.d));
            hashMap.put("_cmd", String.valueOf(this.e));
            hashMap.put("_d1", String.valueOf(this.f));
            hashMap.put("_d2", String.valueOf(this.g));
            hashMap.put("_d3", String.valueOf(this.h));
            hashMap.put("_d4", String.valueOf(this.i));
            hashMap.put("_d5", String.valueOf(this.j));
            hashMap.put("_cp", String.valueOf(this.k));
            hashMap.put("_cd", String.valueOf(this.l));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bn(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = 0L;
            this.i = 0L;
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("webrtc_stats", e());
        }
    }

    /* loaded from: classes9.dex */
    static class bo implements c.a {
        private bo() {
        }

        /* synthetic */ bo(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bn(a.a(map, "ph", ""), a.a(map, DispatchConstants.CONFIG_VERSION), a.a(map, "ca"), a.a(map, "cmd"), a.a(map, "d1"), a.a(map, "d2"), a.a(map, "d3"), a.a(map, "d4"), a.a(map, "d5"), a.a(map, StatisticRecord.ET_CP), a.a(map, "cd"), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class bp extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h h;
        public String b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("wpk_pv");
            h = hVar;
            StatsManager.a(hVar);
        }

        public bp() {
        }

        private bp(String str, long j, long j2, long j3, long j4, long j5) {
            this.c = j;
            this.d = j2;
            this.e = j3;
            this.f = j4;
            this.g = j5;
            if (str == null || str.length() <= 128) {
                this.b = str;
            } else {
                this.b = str.substring(0, 128);
            }
        }

        /* synthetic */ bp(String str, long j, long j2, long j3, long j4, long j5, byte b) {
            this(str, j, j2, j3, j4, j5);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return h;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 21 + a.b(this.c) + a.b(this.d) + a.b(this.e) + a.b(this.f) + a.b(this.g);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 21;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_url", str);
            hashMap.put("_src", String.valueOf(this.c));
            hashMap.put("_pt", String.valueOf(this.d));
            hashMap.put("_nt", String.valueOf(this.e));
            hashMap.put("_t0", String.valueOf(this.f));
            hashMap.put("_mct", String.valueOf(this.g));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new bp(this.b, this.c, this.d, this.e, this.f, this.g);
        }

        @Override // com.uc.webview.internal.stats.c
        public final boolean h() {
            return false;
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("wpk_pv", e());
        }
    }

    /* loaded from: classes9.dex */
    static class bq implements c.a {
        private bq() {
        }

        /* synthetic */ bq(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new bp(a.a(map, "url", ""), a.a(map, "src"), a.a(map, AdvertisementOption.PRIORITY_VALID_TIME), a.a(map, "nt"), a.a(map, pqe.STAGE_T0), a.a(map, "mct"), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    static class c implements c.a {
        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new b(a.a(map, "ac"), a.a(map, "ph", ""), a.a(map, "dc"), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class d extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h c;
        public String b;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("auto_fill");
            c = hVar;
            StatsManager.a(hVar);
        }

        public d() {
        }

        private d(String str) {
            if (str == null || str.length() <= 64) {
                this.b = str;
            } else {
                this.b = str.substring(0, 64);
            }
        }

        /* synthetic */ d(String str, byte b) {
            this(str);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return c;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 5;
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 5;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_host", str);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new d(this.b);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("auto_fill", e());
        }
    }

    /* loaded from: classes9.dex */
    static class e implements c.a {
        private e() {
        }

        /* synthetic */ e(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new d(a.a(map, "host", ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class f extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h s;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public long j;
        public long k;
        public long l;
        public long m;
        public long n;
        public long o;
        public long p;
        public long q;
        public long r;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("bfcache_v2");
            s = hVar;
            StatsManager.a(hVar);
        }

        public f() {
        }

        private f(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.h = j7;
            this.i = j8;
            this.j = j9;
            this.k = j10;
            this.l = j11;
            this.m = j12;
            this.n = j13;
            this.o = j14;
            this.p = j15;
            this.q = j16;
            this.r = j17;
        }

        /* synthetic */ f(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, byte b) {
            this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return s;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.b(this.b) + 51 + a.b(this.c) + a.b(this.d) + a.b(this.e) + a.b(this.f) + a.b(this.g) + a.b(this.h) + a.b(this.i) + a.b(this.j) + a.b(this.k) + a.b(this.l) + a.b(this.m) + a.b(this.n) + a.b(this.o) + a.b(this.p) + a.b(this.q) + a.b(this.r);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 51;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_pv", String.valueOf(this.b));
            hashMap.put("_ec", String.valueOf(this.c));
            hashMap.put("_ns", String.valueOf(this.d));
            hashMap.put("_er", String.valueOf(this.e));
            hashMap.put("_fr", String.valueOf(this.f));
            hashMap.put("_rp", String.valueOf(this.g));
            hashMap.put("_sk", String.valueOf(this.h));
            hashMap.put("_nn", String.valueOf(this.i));
            hashMap.put("_ul", String.valueOf(this.j));
            hashMap.put("_rr", String.valueOf(this.k));
            hashMap.put("_bf", String.valueOf(this.l));
            hashMap.put("_hc", String.valueOf(this.m));
            hashMap.put("_mc", String.valueOf(this.n));
            hashMap.put("_pc", String.valueOf(this.o));
            hashMap.put("_rd", String.valueOf(this.p));
            hashMap.put("_ps", String.valueOf(this.q));
            hashMap.put("_pr", String.valueOf(this.r));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new f(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = 0L;
            this.i = 0L;
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            this.m = 0L;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            this.q = 0L;
            this.r = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("bfcache_v2", e());
        }
    }

    /* loaded from: classes9.dex */
    static class g implements c.a {
        private g() {
        }

        /* synthetic */ g(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new f(a.a(map, "pv"), a.a(map, RiskDataPipeManager.PIPE_RESULT_ERROR_CODE_KEY), a.a(map, NotificationStyle.NOTIFICATION_STYLE), a.a(map, "er"), a.a(map, "fr"), a.a(map, CountValue.T_RP), a.a(map, "sk"), a.a(map, "nn"), a.a(map, "ul"), a.a(map, "rr"), a.a(map, "bf"), a.a(map, "hc"), a.a(map, "mc"), a.a(map, "pc"), a.a(map, "rd"), a.a(map, "ps"), a.a(map, "pr"), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class h extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h e;
        public long b;
        public long c;
        public String d;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("bfcache_w");
            e = hVar;
            StatsManager.a(hVar);
        }

        public h() {
        }

        private h(long j, long j2, String str) {
            this.b = j;
            this.c = j2;
            if (str == null || str.length() <= 128) {
                this.d = str;
            } else {
                this.d = str.substring(0, 128);
            }
        }

        /* synthetic */ h(long j, long j2, String str, byte b) {
            this(j, j2, str);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return e;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.b(this.b) + 6 + a.b(this.c) + a.a(this.d);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 6;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_c", String.valueOf(this.b));
            hashMap.put("_m", String.valueOf(this.c));
            String str = this.d;
            if (str == null) {
                str = "";
            }
            hashMap.put("_h", str);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new h(this.b, this.c, this.d);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = 0L;
            this.c = 0L;
            this.d = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("bfcache_w", e());
        }
    }

    /* loaded from: classes9.dex */
    static class i implements c.a {
        private i() {
        }

        /* synthetic */ i(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new h(a.a(map, com.taobao.android.msoa.c.TAG), a.a(map, "m"), a.a(map, "h", ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class j extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h D;
        public long A;
        public String B;
        public String C;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public String h;
        public String i;
        public String j;
        public String k;
        public long l;
        public long m;
        public long n;
        public long o;
        public long p;
        public long q;
        public long r;
        public long s;
        public long t;
        public long u;
        public long v;
        public long w;
        public long x;
        public long y;
        public long z;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("bkpg");
            D = hVar;
            StatsManager.a(hVar);
        }

        public j() {
        }

        private j(long j, long j2, long j3, long j4, long j5, long j6, String str, String str2, String str3, String str4, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, String str5, String str6) {
            String str7 = str;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.l = j7;
            this.m = j8;
            this.n = j9;
            this.o = j10;
            this.p = j11;
            this.q = j12;
            this.r = j13;
            this.s = j14;
            this.t = j15;
            this.u = j16;
            this.v = j17;
            this.w = j18;
            this.x = j19;
            this.y = j20;
            this.z = j21;
            this.A = j22;
            if (str7 != null && str.length() > 64) {
                str7 = str7.substring(0, 64);
            }
            this.h = str7;
            if (str2 == null || str2.length() <= 64) {
                this.i = str2;
            } else {
                this.i = str2.substring(0, 64);
            }
            if (str3 == null || str3.length() <= 64) {
                this.j = str3;
            } else {
                this.j = str3.substring(0, 64);
            }
            if (str4 == null || str4.length() <= 64) {
                this.k = str4;
            } else {
                this.k = str4.substring(0, 64);
            }
            if (str5 == null || str5.length() <= 128) {
                this.B = str5;
            } else {
                this.B = str5.substring(0, 128);
            }
            if (str6 == null || str6.length() <= 128) {
                this.C = str6;
            } else {
                this.C = str6.substring(0, 128);
            }
        }

        /* synthetic */ j(long j, long j2, long j3, long j4, long j5, long j6, String str, String str2, String str3, String str4, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, String str5, String str6, byte b) {
            this(j, j2, j3, j4, j5, j6, str, str2, str3, str4, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, str5, str6);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return D;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.b(this.b) + 99 + a.b(this.c) + a.b(this.d) + a.b(this.e) + a.b(this.f) + a.b(this.g) + a.a(this.h) + a.a(this.i) + a.a(this.j) + a.a(this.k) + a.b(this.l) + a.b(this.m) + a.b(this.n) + a.b(this.o) + a.b(this.p) + a.b(this.q) + a.b(this.r) + a.b(this.s) + a.b(this.t) + a.b(this.u) + a.b(this.v) + a.b(this.w) + a.b(this.x) + a.b(this.y) + a.b(this.z) + a.b(this.A) + a.a(this.B) + a.a(this.C);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 99;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_cc", String.valueOf(this.b));
            hashMap.put("_co", String.valueOf(this.c));
            hashMap.put("_ec", String.valueOf(this.d));
            hashMap.put("_ex", String.valueOf(this.e));
            hashMap.put("_sv", String.valueOf(this.f));
            hashMap.put("_rc", String.valueOf(this.g));
            String str = this.h;
            if (str == null) {
                str = "";
            }
            hashMap.put("_sc", str);
            String str2 = this.i;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_edl", str2);
            String str3 = this.j;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("_ebl", str3);
            String str4 = this.k;
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("_len", str4);
            hashMap.put("_src", String.valueOf(this.l));
            hashMap.put("_es", String.valueOf(this.m));
            hashMap.put("_fp", String.valueOf(this.n));
            hashMap.put("_pt", String.valueOf(this.o));
            hashMap.put("_aw", String.valueOf(this.p));
            hashMap.put("_wlc", String.valueOf(this.q));
            hashMap.put("_cmc", String.valueOf(this.r));
            hashMap.put("_nt", String.valueOf(this.s));
            hashMap.put("_t0", String.valueOf(this.t));
            hashMap.put("_t1", String.valueOf(this.u));
            hashMap.put("_t1l", String.valueOf(this.v));
            hashMap.put("_fpt", String.valueOf(this.w));
            hashMap.put("_t2", String.valueOf(this.x));
            hashMap.put("_t3", String.valueOf(this.y));
            hashMap.put("_sct", String.valueOf(this.z));
            hashMap.put("_time", String.valueOf(this.A));
            String str5 = this.B;
            if (str5 == null) {
                str5 = "";
            }
            hashMap.put("_url", str5);
            String str6 = this.C;
            if (str6 == null) {
                str6 = "";
            }
            hashMap.put("_frmid", str6);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new j(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C);
        }

        @Override // com.uc.webview.internal.stats.c
        public final boolean h() {
            return false;
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = 0L;
            this.m = 0L;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            this.q = 0L;
            this.r = 0L;
            this.s = 0L;
            this.t = 0L;
            this.u = 0L;
            this.v = 0L;
            this.w = 0L;
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.A = 0L;
            this.B = null;
            this.C = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("bkpg", e());
        }
    }

    /* loaded from: classes9.dex */
    static class k implements c.a {
        private k() {
        }

        /* synthetic */ k(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new j(a.a(map, "cc"), a.a(map, "co"), a.a(map, RiskDataPipeManager.PIPE_RESULT_ERROR_CODE_KEY), a.a(map, ErrorType.DEFAULT), a.a(map, BizContext.KEY_SDK_VERSION), a.a(map, LogContext.RELEASETYPE_RC), a.a(map, "sc", ""), a.a(map, "edl", ""), a.a(map, "ebl", ""), a.a(map, "len", ""), a.a(map, "src"), a.a(map, "es"), a.a(map, "fp"), a.a(map, AdvertisementOption.PRIORITY_VALID_TIME), a.a(map, "aw"), a.a(map, "wlc"), a.a(map, "cmc"), a.a(map, "nt"), a.a(map, pqe.STAGE_T0), a.a(map, pqe.STAGE_T1), a.a(map, "t1l"), a.a(map, "fpt"), a.a(map, pqe.STAGE_T2), a.a(map, pqe.STAGE_T3), a.a(map, "sct"), a.a(map, "time"), a.a(map, "url", ""), a.a(map, "frmid", ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class l extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h j;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public long h;
        public long i;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("block_subres");
            j = hVar;
            StatsManager.a(hVar);
        }

        public l() {
        }

        private l(String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
            this.h = j2;
            this.i = j3;
            if (str != null && str.length() > 64) {
                str = str.substring(0, 64);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 64) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 64);
            }
            if (str3 == null || str3.length() <= 64) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 64);
            }
            if (str4 == null || str4.length() <= 64) {
                this.e = str4;
            } else {
                this.e = str4.substring(0, 64);
            }
            if (str5 == null || str5.length() <= 64) {
                this.f = str5;
            } else {
                this.f = str5.substring(0, 64);
            }
            if (str6 == null || str6.length() <= 64) {
                this.g = str6;
            } else {
                this.g = str6.substring(0, 64);
            }
        }

        /* synthetic */ l(String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3, byte b) {
            this(str, str2, str3, str4, str5, str6, j2, j3);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return j;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 28 + a.a(this.c) + a.a(this.d) + a.a(this.e) + a.a(this.f) + a.a(this.g) + a.b(this.h) + a.b(this.i);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 28;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_rule", str);
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_url", str2);
            String str3 = this.d;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("_suf", str3);
            String str4 = this.e;
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("_mt", str4);
            String str5 = this.f;
            if (str5 == null) {
                str5 = "";
            }
            hashMap.put("_rf", str5);
            String str6 = this.g;
            if (str6 == null) {
                str6 = "";
            }
            hashMap.put("_dt", str6);
            hashMap.put("_sz", String.valueOf(this.h));
            hashMap.put("_am", String.valueOf(this.i));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new l(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = 0L;
            this.i = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("block_subres", e());
        }
    }

    /* loaded from: classes9.dex */
    static class m implements c.a {
        private m() {
        }

        /* synthetic */ m(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new l(a.a(map, LinkageUtils.PolicyType.RULE, ""), a.a(map, "url", ""), a.a(map, "suf", ""), a.a(map, "mt", ""), a.a(map, "rf", ""), a.a(map, "dt", ""), a.a(map, "sz"), a.a(map, "am"), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class n extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h f;
        public long b;
        public String c;
        public long d;
        public long e;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("canvas_stats");
            f = hVar;
            StatsManager.a(hVar);
        }

        public n() {
        }

        private n(long j, String str, long j2, long j3) {
            this.b = j;
            this.d = j2;
            this.e = j3;
            if (str == null || str.length() <= 64) {
                this.c = str;
            } else {
                this.c = str.substring(0, 64);
            }
        }

        /* synthetic */ n(long j, String str, long j2, long j3, byte b) {
            this(j, str, j2, j3);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return f;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.b(this.b) + 12 + a.a(this.c) + a.b(this.d) + a.b(this.e);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 12;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_ac", String.valueOf(this.b));
            String str = this.c;
            if (str == null) {
                str = "";
            }
            hashMap.put("_ph", str);
            hashMap.put("_sm", String.valueOf(this.d));
            hashMap.put("_pc", String.valueOf(this.e));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new n(this.b, this.c, this.d, this.e);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = 0L;
            this.c = null;
            this.d = 0L;
            this.e = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("canvas_stats", e());
        }
    }

    /* loaded from: classes9.dex */
    static class o implements c.a {
        private o() {
        }

        /* synthetic */ o(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new n(a.a(map, "ac"), a.a(map, "ph", ""), a.a(map, "sm"), a.a(map, "pc"), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class p extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h j;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public String i;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("capture_stat");
            j = hVar;
            StatsManager.a(hVar);
        }

        public p() {
        }

        private p(long j2, long j3, long j4, long j5, long j6, long j7, long j8, String str) {
            this.b = j2;
            this.c = j3;
            this.d = j4;
            this.e = j5;
            this.f = j6;
            this.g = j7;
            this.h = j8;
            if (str == null || str.length() <= 64) {
                this.i = str;
            } else {
                this.i = str.substring(0, 64);
            }
        }

        /* synthetic */ p(long j2, long j3, long j4, long j5, long j6, long j7, long j8, String str, byte b) {
            this(j2, j3, j4, j5, j6, j7, j8, str);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return j;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.b(this.b) + 26 + a.b(this.c) + a.b(this.d) + a.b(this.e) + a.b(this.f) + a.b(this.g) + a.b(this.h) + a.a(this.i);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 26;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            hashMap.put("_fs", String.valueOf(this.b));
            hashMap.put("_pdf", String.valueOf(this.c));
            hashMap.put("_dom", String.valueOf(this.d));
            hashMap.put("_bf", String.valueOf(this.e));
            hashMap.put("_st", String.valueOf(this.f));
            hashMap.put("_ct", String.valueOf(this.g));
            hashMap.put("_dl", String.valueOf(this.h));
            String str = this.i;
            if (str == null) {
                str = "";
            }
            hashMap.put("_ph", str);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new p(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = 0L;
            this.i = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("capture_stat", e());
        }
    }

    /* loaded from: classes9.dex */
    static class q implements c.a {
        private q() {
        }

        /* synthetic */ q(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new p(a.a(map, RVStartParams.KEY_FULLSCREEN_SHORT), a.a(map, "pdf"), a.a(map, "dom"), a.a(map, "bf"), a.a(map, "st"), a.a(map, com.taobao.tao.content.business.b.CT), a.a(map, "dl"), a.a(map, "ph", ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class r extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h c;
        public String b;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("component2");
            c = hVar;
            StatsManager.a(hVar);
        }

        public r() {
        }

        private r(String str) {
            if (str == null || str.length() <= 354) {
                this.b = str;
            } else {
                this.b = str.substring(0, 354);
            }
        }

        /* synthetic */ r(String str, byte b) {
            this(str);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return c;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 5;
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 5;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_cpns", str);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new r(this.b);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("component2", e());
        }
    }

    /* loaded from: classes9.dex */
    static class s implements c.a {
        private s() {
        }

        /* synthetic */ s(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new r(a.a(map, "cpns", ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class t extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h d;
        public String b;
        public String c;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("con_s");
            d = hVar;
            StatsManager.a(hVar);
        }

        public t() {
        }

        private t(String str, String str2) {
            if (str != null && str.length() > 1024) {
                str = str.substring(0, 1024);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 4096) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 4096);
            }
        }

        /* synthetic */ t(String str, String str2, byte b) {
            this(str, str2);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return d;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 4 + a.a(this.c);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 4;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_u", str);
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_c", str2);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new t(this.b, this.c);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("con_s", e());
        }
    }

    /* loaded from: classes9.dex */
    static class u implements c.a {
        private u() {
        }

        /* synthetic */ u(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new t(a.a(map, RVStartParams.KEY_URL_SHORT, ""), a.a(map, com.taobao.android.msoa.c.TAG, ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class v extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h s;
        public String b;
        public String c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public long j;
        public String k;
        public String l;
        public String m;
        public String n;
        public long o;
        public String p;
        public String q;
        public String r;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("core_errpage");
            s = hVar;
            StatsManager.a(hVar);
        }

        public v() {
        }

        private v(String str, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, String str3, String str4, String str5, String str6, long j8, String str7, String str8, String str9) {
            String str10 = str;
            String str11 = str2;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = j5;
            this.i = j6;
            this.j = j7;
            this.o = j8;
            if (str10 != null && str.length() > 128) {
                str10 = str.substring(0, 128);
            }
            this.b = str10;
            if (str11 != null && str2.length() > 64) {
                str11 = str2.substring(0, 64);
            }
            this.c = str11;
            if (str3 == null || str3.length() <= 64) {
                this.k = str3;
            } else {
                this.k = str3.substring(0, 64);
            }
            if (str4 == null || str4.length() <= 64) {
                this.l = str4;
            } else {
                this.l = str4.substring(0, 64);
            }
            if (str5 == null || str5.length() <= 64) {
                this.m = str5;
            } else {
                this.m = str5.substring(0, 64);
            }
            if (str6 == null || str6.length() <= 64) {
                this.n = str6;
            } else {
                this.n = str6.substring(0, 64);
            }
            if (str7 == null || str7.length() <= 64) {
                this.p = str7;
            } else {
                this.p = str7.substring(0, 64);
            }
            if (str8 == null || str8.length() <= 64) {
                this.q = str8;
            } else {
                this.q = str8.substring(0, 64);
            }
            if (str9 == null || str9.length() <= 64) {
                this.r = str9;
            } else {
                this.r = str9.substring(0, 64);
            }
        }

        /* synthetic */ v(String str, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, String str3, String str4, String str5, String str6, long j8, String str7, String str8, String str9, byte b) {
            this(str, str2, j, j2, j3, j4, j5, j6, j7, str3, str4, str5, str6, j8, str7, str8, str9);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return s;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 54 + a.a(this.c) + a.b(this.d) + a.b(this.e) + a.b(this.f) + a.b(this.g) + a.b(this.h) + a.b(this.i) + a.b(this.j) + a.a(this.k) + a.a(this.l) + a.a(this.m) + a.a(this.n) + a.b(this.o) + a.a(this.p) + a.a(this.q) + a.a(this.r);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 54;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_ht", str);
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_ad", str2);
            hashMap.put("_rt", String.valueOf(this.d));
            hashMap.put("_ec", String.valueOf(this.e));
            hashMap.put("_oe", String.valueOf(this.f));
            hashMap.put("_nc", String.valueOf(this.g));
            hashMap.put("_nt", String.valueOf(this.h));
            hashMap.put("_rc", String.valueOf(this.i));
            hashMap.put("_fp", String.valueOf(this.j));
            String str3 = this.k;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("_nhi", str3);
            String str4 = this.l;
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("_nht", str4);
            String str5 = this.m;
            if (str5 == null) {
                str5 = "";
            }
            hashMap.put("_nhe", str5);
            String str6 = this.n;
            if (str6 == null) {
                str6 = "";
            }
            hashMap.put("_fm", str6);
            hashMap.put("_mc", String.valueOf(this.o));
            String str7 = this.p;
            if (str7 == null) {
                str7 = "";
            }
            hashMap.put("_mr", str7);
            String str8 = this.q;
            if (str8 == null) {
                str8 = "";
            }
            hashMap.put("_mf", str8);
            String str9 = this.r;
            if (str9 == null) {
                str9 = "";
            }
            hashMap.put("_ma", str9);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new v(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = null;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = 0L;
            this.i = 0L;
            this.j = 0L;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = 0L;
            this.p = null;
            this.q = null;
            this.r = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("core_errpage", e());
        }
    }

    /* loaded from: classes9.dex */
    static class w implements c.a {
        private w() {
        }

        /* synthetic */ w(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new v(a.a(map, "ht", ""), a.a(map, "ad", ""), a.a(map, "rt"), a.a(map, RiskDataPipeManager.PIPE_RESULT_ERROR_CODE_KEY), a.a(map, "oe"), a.a(map, "nc"), a.a(map, "nt"), a.a(map, LogContext.RELEASETYPE_RC), a.a(map, "fp"), a.a(map, "nhi", ""), a.a(map, "nht", ""), a.a(map, "nhe", ""), a.a(map, "fm", ""), a.a(map, "mc"), a.a(map, "mr", ""), a.a(map, "mf", ""), a.a(map, "ma", ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class x extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h e;
        public String b;
        public String c;
        public String d;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("css_s");
            e = hVar;
            StatsManager.a(hVar);
        }

        public x() {
        }

        private x(String str, String str2, String str3) {
            if (str != null && str.length() > 128) {
                str = str.substring(0, 128);
            }
            this.b = str;
            if (str2 == null || str2.length() <= 1024) {
                this.c = str2;
            } else {
                this.c = str2.substring(0, 1024);
            }
            if (str3 == null || str3.length() <= 4096) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 4096);
            }
        }

        /* synthetic */ x(String str, String str2, String str3, byte b) {
            this(str, str2, str3);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return e;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 6 + a.a(this.c) + a.a(this.d);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 6;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_h", str);
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_u", str2);
            String str3 = this.d;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("_r", str3);
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new x(this.b, this.c, this.d);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("css_s", e());
        }
    }

    /* loaded from: classes9.dex */
    static class y implements c.a {
        private y() {
        }

        /* synthetic */ y(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.stats.c.a
        public final com.uc.webview.internal.stats.c a(Map<String, String> map) {
            return new x(a.a(map, "h", ""), a.a(map, RVStartParams.KEY_URL_SHORT, ""), a.a(map, "r", ""), (byte) 0);
        }
    }

    /* loaded from: classes9.dex */
    public static class z extends com.uc.webview.internal.stats.c {
        private static final com.uc.webview.internal.stats.h j;
        public String b;
        public String c;
        public String d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;

        static {
            com.uc.webview.internal.stats.h hVar = new com.uc.webview.internal.stats.h("embed_req");
            j = hVar;
            StatsManager.a(hVar);
        }

        public z() {
        }

        private z(String str, String str2, String str3, long j2, long j3, long j4, long j5, long j6) {
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = j5;
            this.i = j6;
            if (str != null && str.length() > 128) {
                str = str.substring(0, 128);
            }
            this.b = str;
            if (str2 != null && str2.length() > 32) {
                str2 = str2.substring(0, 32);
            }
            this.c = str2;
            if (str3 == null || str3.length() <= 32) {
                this.d = str3;
            } else {
                this.d = str3.substring(0, 32);
            }
        }

        /* synthetic */ z(String str, String str2, String str3, long j2, long j3, long j4, long j5, long j6, byte b) {
            this(str, str2, str3, j2, j3, j4, j5, j6);
        }

        @Override // com.uc.webview.internal.stats.c
        public final com.uc.webview.internal.stats.h b() {
            return j;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int c() {
            if (this.f23996a == 0) {
                this.f23996a = a.a(this.b) + 16 + a.a(this.c) + a.a(this.d) + a.b(this.e) + a.b(this.f) + a.b(this.g) + a.b(this.h) + a.b(this.i);
            }
            return this.f23996a;
        }

        @Override // com.uc.webview.internal.stats.c
        public final int d() {
            return 16;
        }

        @Override // com.uc.webview.internal.stats.c
        public final Map<String, String> e() {
            HashMap hashMap = new HashMap();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            hashMap.put("_h", str);
            String str2 = this.c;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("_t", str2);
            String str3 = this.d;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("_v", str3);
            hashMap.put("_m", String.valueOf(this.e));
            hashMap.put("_c", String.valueOf(this.f));
            hashMap.put("_s", String.valueOf(this.g));
            hashMap.put("_w", String.valueOf(this.h));
            hashMap.put("_e", String.valueOf(this.i));
            return hashMap;
        }

        @Override // com.uc.webview.internal.stats.c
        public final /* synthetic */ com.uc.webview.internal.stats.c f() {
            return new z(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        @Override // com.uc.webview.internal.stats.c
        public final void j() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = 0L;
            this.i = 0L;
            this.f23996a = 0;
        }

        public final String toString() {
            return a("embed_req", e());
        }
    }

    public static c.a b(String str) {
        return C1046a.f24012a.get(str);
    }
}
