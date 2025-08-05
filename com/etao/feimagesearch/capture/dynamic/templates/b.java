package com.etao.feimagesearch.capture.dynamic.templates;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.o;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.weex.e;
import com.taobao.android.weex.j;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.com;
import tb.cpe;
import tb.kge;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b INSTANCE;
    public static final String KEY_CAPTURE_TAB_3 = "plt_camera_page_tab3";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Boolean> f6573a;
    private static long b;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f6574a;

        public a(String[] strArr) {
            this.f6574a = strArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sversion", com.h());
            linkedHashMap.put(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID, "android");
            String str = "";
            for (String str2 : this.f6574a) {
                str = str + str2 + ',';
            }
            linkedHashMap.put("pageKeys", str);
            TLogTracker.b("PltTemplateManager", "fetch cloud info", "page: " + str);
            o.a(linkedHashMap, PltTemplatesManager$fetchTemplatesInfoFromCloud$1$1.INSTANCE, new PltTemplatesManager$fetchTemplatesInfoFromCloud$1$2(this));
        }
    }

    /* renamed from: com.etao.feimagesearch.capture.dynamic.templates.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class RunnableC0218b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6575a;
        public final /* synthetic */ JSONObject b;

        public RunnableC0218b(String str, JSONObject jSONObject) {
            this.f6575a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b.a(b.INSTANCE, this.f6575a, this.b);
            }
        }
    }

    static {
        kge.a(2068990254);
        INSTANCE = new b();
        f6573a = new LinkedHashMap();
        com.taobao.android.searchbaseframe.roman.c.a();
    }

    private b() {
    }

    public static final /* synthetic */ Map a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b04d8628", new Object[]{bVar}) : f6573a;
    }

    public static final /* synthetic */ void a(b bVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20e0a53", new Object[]{bVar, str, jSONObject});
        } else {
            bVar.a(str, jSONObject);
        }
    }

    @JvmStatic
    public static final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : com.alibaba.ability.localization.b.c() ? com.taobao.android.searchbaseframe.roman.a.PLT_CAMERA_I18N : com.taobao.android.searchbaseframe.roman.a.PLT_CAMERA;
    }

    @JvmStatic
    public static final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : com.alibaba.ability.localization.b.c() ? com.taobao.android.searchbaseframe.roman.a.PLT_IRP_I18N : com.taobao.android.searchbaseframe.roman.a.PLT_IRP;
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!com.etao.feimagesearch.config.b.dy()) {
        } else {
            TLogTracker.b("PltTemplateManager", "preload trigger", "");
            if (Math.abs(System.currentTimeMillis() - b) <= com.etao.feimagesearch.config.b.dK()) {
                return;
            }
            INSTANCE.a(new String[]{b(), "plt_camera_page_tab3", c()});
        }
    }

    @JvmStatic
    public static final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return com.taobao.android.searchbaseframe.roman.c.a().a(str, com.h());
    }

    @JvmStatic
    public static final void a(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60829596", new Object[]{str, jSONObject, new Boolean(z)});
        } else if (str == null || q.a((Object) f6573a.get(str), (Object) true)) {
        } else {
            if (z) {
                VExecutors.defaultSharedThreadPool().submit(new RunnableC0218b(str, jSONObject));
            } else {
                INSTANCE.a(str, jSONObject);
            }
        }
    }

    private final void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
            return;
        }
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        com.etao.feimagesearch.pipline.c.a(new a(strArr));
    }

    private final void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (str == null || q.a((Object) f6573a.get(str), (Object) true)) {
        } else {
            try {
                TLogTracker.b("PltTemplateManager", "weex preload template", "template: " + str);
                e.c().a(new j.b(str), new c(str, jSONObject));
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements j.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6576a;
        public final /* synthetic */ JSONObject b;

        public c(String str, JSONObject jSONObject) {
            this.f6576a = str;
            this.b = jSONObject;
        }

        @Override // com.taobao.android.weex.j.a
        public void a(j.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c97ddeab", new Object[]{this, cVar});
                return;
            }
            b.a(b.INSTANCE).put(this.f6576a, true);
            TLogTracker.b("PltTemplateManager", "weex preload success", "template: " + this.f6576a);
            JSONObject jSONObject = this.b;
            if (jSONObject == null) {
                return;
            }
            com.taobao.android.searchbaseframe.roman.c.a().a(jSONObject);
        }

        @Override // com.taobao.android.weex.j.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            TLogTracker.b("PltTemplateManager", "weex preload failure", "template: " + this.f6576a + ", errCode:" + str + ", errMsg:" + str2);
        }
    }
}
