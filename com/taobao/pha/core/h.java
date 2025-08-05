package com.taobao.pha.core;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import tb.kge;
import tb.ngn;
import tb.ngr;

/* loaded from: classes.dex */
public interface h {
    boolean A();

    boolean B();

    String a(String str);

    void a();

    boolean a(Context context, String str);

    boolean a(Uri uri);

    boolean a(String str, boolean z);

    String b(String str);

    boolean b(Uri uri);

    boolean c();

    boolean d(Uri uri);

    boolean f();

    boolean g();

    boolean h();

    boolean i();

    boolean j();

    JSONObject k();

    boolean l();

    String m();

    boolean n();

    String o();

    boolean p();

    int q();

    int r();

    int s();

    boolean t();

    boolean u();

    boolean v();

    boolean y();

    boolean z();

    /* loaded from: classes.dex */
    public static class a implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final String f18739a;
        private static volatile a b;

        @Override // com.taobao.pha.core.h
        public String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
            }
            return null;
        }

        @Override // com.taobao.pha.core.h
        public boolean a(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, str})).booleanValue();
            }
            return false;
        }

        @Override // com.taobao.pha.core.h
        public String b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : str;
        }

        static {
            kge.a(-59218923);
            kge.a(436643749);
            f18739a = h.class.getName();
        }

        public static h C() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("594105ca", new Object[0]);
            }
            if (b == null) {
                synchronized (a.class) {
                    if (b == null) {
                        b = new a();
                    }
                }
            }
            return b;
        }

        @Override // com.taobao.pha.core.h
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!p.d()) {
            } else {
                com.taobao.pha.core.manifest.e.a().b();
            }
        }

        @Override // com.taobao.pha.core.h
        public String o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this});
            }
            String a2 = a("manifest_prefetches");
            return TextUtils.isEmpty(a2) ? MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264 : a2;
        }

        @Override // com.taobao.pha.core.h
        public boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            String a2 = a(str);
            return TextUtils.isEmpty(a2) ? z : "true".equals(a2);
        }

        @Override // com.taobao.pha.core.h
        public boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : a("enable_entrance_manifest", true);
        }

        @Override // com.taobao.pha.core.h
        public boolean a(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{this, uri})).booleanValue();
            }
            if (uri == null) {
                return false;
            }
            String uri2 = uri.toString();
            String a2 = a("disable_entrance_manifest_black_list");
            if (!TextUtils.isEmpty(a2)) {
                for (String str : a2.split(",")) {
                    if (uri2.contains(str)) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // com.taobao.pha.core.h
        public boolean f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : a("enable_webview_template", true);
        }

        @Override // com.taobao.pha.core.h
        public boolean g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : a("enable_storage", true);
        }

        @Override // com.taobao.pha.core.h
        public boolean h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : a("enable_dev_tools", true);
        }

        @Override // com.taobao.pha.core.h
        public boolean i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : !a("disable_safearea_injection", false);
        }

        @Override // com.taobao.pha.core.h
        public boolean j() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : a("enable_data_prefetches", true);
        }

        @Override // com.taobao.pha.core.h
        public JSONObject k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("352dba92", new Object[]{this});
            }
            try {
                return JSONObject.parseObject(a("manifest_presets"));
            } catch (Exception unused) {
                ngr.c(f18739a, "manifestPresets JsonObject parse failed!");
                return null;
            }
        }

        @Override // com.taobao.pha.core.h
        public boolean l() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : a("disable_jsi_trap_java_exception", true);
        }

        @Override // com.taobao.pha.core.h
        public String m() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : a("webview_template");
        }

        @Override // com.taobao.pha.core.h
        public boolean n() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : a("enable_manifest_prefetch", true);
        }

        @Override // com.taobao.pha.core.h
        public boolean p() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : a("enable_manifest_cache", true);
        }

        @Override // com.taobao.pha.core.h
        public boolean b(Uri uri) {
            String[] split;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{this, uri})).booleanValue();
            }
            if (uri == null || "true".equals(uri.getQueryParameter("disable_manifest_cache"))) {
                return true;
            }
            String a2 = a("disable_manifest_cache_urls");
            if (!TextUtils.isEmpty(a2)) {
                for (String str : a2.split(",")) {
                    if (!TextUtils.isEmpty(str) && ngn.a(Uri.parse(str), uri)) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // com.taobao.pha.core.h
        public int q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue();
            }
            String a2 = a("manifest_cache_default_max_age");
            if (TextUtils.isEmpty(a2)) {
                a2 = String.valueOf(300);
            }
            try {
                return Integer.parseInt(a2);
            } catch (Throwable unused) {
                return 300;
            }
        }

        @Override // com.taobao.pha.core.h
        public int r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue();
            }
            String a2 = a("downgrade_timeout");
            if (TextUtils.isEmpty(a2)) {
                return 5000;
            }
            try {
                return Integer.parseInt(a2);
            } catch (Throwable th) {
                th.printStackTrace();
                return 5000;
            }
        }

        @Override // com.taobao.pha.core.h
        public int s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue();
            }
            String a2 = a("manifest_request_timeout");
            if (TextUtils.isEmpty(a2)) {
                return 10;
            }
            try {
                return Integer.parseInt(a2);
            } catch (Throwable th) {
                th.printStackTrace();
                return 10;
            }
        }

        @Override // com.taobao.pha.core.h
        public boolean t() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : a("enable_domain_security", true);
        }

        @Override // com.taobao.pha.core.h
        public boolean d(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4533b5c0", new Object[]{this, uri})).booleanValue();
            }
            if (uri != null) {
                String a2 = a("disable_native_statistic_urls");
                if (!TextUtils.isEmpty(a2)) {
                    String builder = uri.buildUpon().clearQuery().scheme("").toString();
                    for (String str : a2.split(",")) {
                        if (builder.contains(str)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override // com.taobao.pha.core.h
        public boolean u() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : a("enable_template_built_in_url", true);
        }

        @Override // com.taobao.pha.core.h
        public boolean v() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : a("enable_offline_resource_v2", true);
        }

        @Override // com.taobao.pha.core.h
        public boolean z() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : a("enable_pre_process_manifest", true);
        }

        public boolean D() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue() : a("enable_tabBar_control", true);
        }

        @Override // com.taobao.pha.core.h
        public boolean y() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : a("enable_navigator_sub_page", true);
        }

        @Override // com.taobao.pha.core.h
        public boolean A() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : a("enable_url_abtest", true);
        }

        @Override // com.taobao.pha.core.h
        public boolean B() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue() : a("enable_load_webview_parallel_v2", true);
        }
    }
}
