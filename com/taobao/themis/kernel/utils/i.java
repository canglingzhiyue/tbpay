package com.taobao.themis.kernel.utils;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.QueryPass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.p;
import kotlin.jvm.JvmStatic;
import kotlin.text.Regex;
import tb.kge;
import tb.nfc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u00010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012JB\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020\u001dJ\u001c\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040!2\u0006\u0010\"\u001a\u00020\u0004J\u0016\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u0004J\"\u0010&\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0012\u0010)\u001a\u00020\u00182\b\u0010*\u001a\u0004\u0018\u00010+H\u0007J\u0012\u0010,\u001a\u00020\u00182\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010.\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0004J\u0012\u0010/\u001a\u00020\u0018*\u00020+2\u0006\u0010*\u001a\u00020+R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/taobao/themis/kernel/utils/TMSUniAppUtils;", "", "()V", "KEY_DOM", "", "KEY_MUS", "MANIFEST_ONLINE_URL", "MANIFEST_PRE_URL", "SOURCE_URL", "baseInfoCache", "Landroid/util/LruCache;", "Lcom/taobao/themis/kernel/utils/TMSUniAppUtils$UniAppBaseInfo;", "pattern", "Lkotlin/text/Regex;", "completeQueries", "url", "queries", "allowList", "", "ignoreList", "completeQueriesOld", "generateManifestUrlWithId", "id", "isPreload", "", "getFirstLoadPage", "Lcom/taobao/themis/kernel/metaInfo/manifest/AppManifest$Page;", "baseInfo", "metaInfo", "Lcom/taobao/themis/kernel/metaInfo/TMSMetaInfoWrapper;", "getFirstPageInfo", "mataInfo", "getPageIdAndQueryWithPushPage", "", "pageId", "getTabUrlQueryWithQueryPass", "tabItem", "Lcom/taobao/themis/kernel/metaInfo/manifest/TabBarItem;", "getTargetUrlWithQueryPass", "queryPass", "Lcom/taobao/themis/kernel/metaInfo/manifest/QueryPass;", "isUniApp", "uri", "Landroid/net/Uri;", "isValidWeexV2URL", "bundleUrl", "parseUniAppUrl", SmartLandingTask.Operation.STR_EQUAL, "UniAppBaseInfo", "themis_kernel_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final i INSTANCE;
    public static final String MANIFEST_ONLINE_URL = "https://pages-fast.m.taobao.com/wow/z/uniapp/";
    public static final String MANIFEST_PRE_URL = "https://pre-pages-fast.m.taobao.com/wow/z/uniapp/";
    public static final String SOURCE_URL = "pages-fast.m.taobao.com/wow/z/uniapp/";

    /* renamed from: a  reason: collision with root package name */
    private static final Regex f22572a;
    private static final LruCache<String, a> b;

    static {
        kge.a(935306656);
        INSTANCE = new i();
        f22572a = new Regex("^(https?://[^/]+/wow/z/uniapp/)([0-9]+)/?([^?]+)?");
        b = new LruCache<>(5);
    }

    private i() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006$"}, d2 = {"Lcom/taobao/themis/kernel/utils/TMSUniAppUtils$UniAppBaseInfo;", "", "()V", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "setBaseUrl", "(Ljava/lang/String;)V", "isExternal", "", "()Z", "setExternal", "(Z)V", "isMockManifest", "setMockManifest", "isPre", "setPre", nfc.PHA_MONITOR_DIMENSION_MANIFEST_URL, "getManifestUrl", "setManifestUrl", "originUrl", "getOriginUrl", "setOriginUrl", "pageId", "getPageId", "setPageId", "query", "getQuery", "setQuery", "subPageId", "getSubPageId", "setSubPageId", "uniAppId", "getUniAppId", "setUniAppId", "themis_kernel_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f22573a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private boolean g;
        private boolean h;
        private boolean i;
        private String j;

        static {
            kge.a(-527315724);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f22573a;
        }

        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.f22573a = str;
            }
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public final void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }

        public final void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
        }

        public final void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            } else {
                this.d = str;
            }
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
        }

        public final void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            } else {
                this.e = str;
            }
        }

        public final String f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
        }

        public final void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            } else {
                this.f = str;
            }
        }

        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.g = z;
            }
        }

        public final boolean g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.g;
        }

        public final void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else {
                this.h = z;
            }
        }

        public final boolean h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.h;
        }

        public final void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            } else {
                this.i = z;
            }
        }

        public final boolean i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.i;
        }

        public final void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            } else {
                this.j = str;
            }
        }

        public final String j() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.j;
        }
    }

    @JvmStatic
    public static final boolean a(Uri uri) {
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{uri})).booleanValue();
        }
        if (!n.aA() || (a2 = INSTANCE.a(String.valueOf(uri))) == null || kotlin.text.n.b((CharSequence) n.aE(), (CharSequence) String.valueOf(a2.b()), false, 2, (Object) null)) {
            return false;
        }
        if (kotlin.jvm.internal.q.a((Object) (uri != null ? uri.getQueryParameter("tms_force_h5") : null), (Object) "true") || uri == null || kotlin.jvm.internal.q.a((Object) uri.getQueryParameter("isUniApp"), (Object) "false")) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("uniapp_id");
        if (queryParameter != null && (!kotlin.text.n.a((CharSequence) queryParameter))) {
            return true;
        }
        String path = uri.getPath();
        return (path == null || kotlin.text.n.b((CharSequence) path, (CharSequence) "wow/z/uniapp", false, 2, (Object) null)) && a2 != null;
    }

    public final a a(String url) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("619a7047", new Object[]{this, url});
        }
        kotlin.jvm.internal.q.d(url, "url");
        a aVar = b.get(url);
        if (aVar != null) {
            return aVar;
        }
        Uri uri = Uri.parse(url);
        a aVar2 = new a();
        if (!StringUtils.isEmpty(uri.getQueryParameter("uniapp_id"))) {
            aVar2.a(url);
            aVar2.b(uri.getQueryParameter("uniapp_id"));
            String queryParameter = uri.getQueryParameter("uniapp_page");
            if (queryParameter == null) {
                queryParameter = "/";
            }
            aVar2.c(queryParameter);
            String str2 = kotlin.jvm.internal.q.a((Object) uri.getQueryParameter("uniapp_env"), (Object) "pre") ? MANIFEST_PRE_URL : MANIFEST_ONLINE_URL;
            aVar2.e(str2 + aVar2.b() + "?wh_showError=false&x-ssr=true");
            aVar2.a(true);
        } else {
            kotlin.text.j find$default = Regex.find$default(f22572a, url, 0, 2, null);
            if (find$default == null) {
                return null;
            }
            kotlin.text.g a2 = find$default.d().a(1);
            aVar2.a(a2 != null ? a2.a() : null);
            kotlin.text.g a3 = find$default.d().a(2);
            aVar2.b(a3 != null ? a3.a() : null);
            kotlin.text.g a4 = find$default.d().a(3);
            if (a4 == null || (str = a4.a()) == null) {
                str = "/";
            }
            aVar2.c(str);
            aVar2.e(aVar2.a() + aVar2.b() + "?wh_showError=false&x-ssr=true");
        }
        if (n.bM() && kotlin.text.n.b((CharSequence) url, (CharSequence) "uniapp_sub_page", false, 2, (Object) null)) {
            aVar2.g(uri.getQueryParameter("uniapp_sub_page"));
        }
        aVar2.d(url);
        kotlin.jvm.internal.q.b(uri, "uri");
        aVar2.f(uri.getEncodedQuery());
        if (com.taobao.themis.kernel.utils.a.b()) {
            TMSLogger.d("TMSUniAppUtils", "hit debugMode");
            String queryParameter2 = uri.getQueryParameter("_manifest");
            if (queryParameter2 != null) {
                TMSLogger.d("TMSUniAppUtils", "mock manifest");
                aVar2.e(queryParameter2);
                if (!kotlin.jvm.internal.q.a((Object) com.taobao.themis.utils.o.a(url, "tms_auto_reload"), (Object) "true")) {
                    aVar2.b(true);
                }
            }
        }
        String e = aVar2.e();
        if (e != null && kotlin.text.n.b(e, MANIFEST_PRE_URL, false, 2, (Object) null)) {
            aVar2.c(true);
        }
        b.put(url, aVar2);
        return aVar2;
    }

    public static /* synthetic */ String a(i iVar, String str, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("448a5d03", new Object[]{iVar, str, new Boolean(z), new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return iVar.a(str, z);
    }

    public final String a(String id, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7b527fe", new Object[]{this, id, new Boolean(z)});
        }
        kotlin.jvm.internal.q.d(id, "id");
        String bZ = z ? n.INSTANCE.bZ() : MANIFEST_ONLINE_URL;
        return bZ + id + "?wh_showError=false&x-ssr=true";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final AppManifest.Page a(a aVar, TMSMetaInfoWrapper metaInfo) {
        String c;
        AppManifest.Page page;
        String str;
        List<AppManifest.Page> t;
        AppManifest.Page page2;
        Object obj;
        ?? r3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppManifest.Page) ipChange.ipc$dispatch("f562b502", new Object[]{this, aVar, metaInfo});
        }
        kotlin.jvm.internal.q.d(metaInfo, "metaInfo");
        AppManifest.Page page3 = null;
        if (aVar == null || (c = aVar.c()) == null) {
            return null;
        }
        List<AppManifest.Page> t2 = metaInfo.t();
        if (t2 != null) {
            Iterator it = t2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r3 = 0;
                    break;
                }
                r3 = it.next();
                if (kotlin.jvm.internal.q.a((Object) ((AppManifest.Page) r3).getId(), (Object) c)) {
                    break;
                }
            }
            page = r3;
        } else {
            page = null;
        }
        if (!n.bs() || page == null || !com.taobao.themis.kernel.metaInfo.manifest.a.a(page)) {
            return page;
        }
        String j = aVar.j();
        if (j != null) {
            List<AppManifest.Page> t3 = metaInfo.t();
            if (t3 != null) {
                Iterator it2 = t3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (kotlin.jvm.internal.q.a((Object) ((AppManifest.Page) obj).getId(), (Object) j)) {
                        break;
                    }
                }
                page2 = (AppManifest.Page) obj;
            } else {
                page2 = null;
            }
            if (page2 != null) {
                return page2;
            }
        }
        List<String> children = page.getChildren();
        if (children == null || (str = children.get(com.taobao.themis.kernel.metaInfo.manifest.a.b(page))) == null || (t = metaInfo.t()) == null) {
            return null;
        }
        Iterator it3 = t.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            ?? next = it3.next();
            if (kotlin.jvm.internal.q.a((Object) ((AppManifest.Page) next).getId(), (Object) str)) {
                page3 = next;
                break;
            }
        }
        return page3;
    }

    public final AppManifest.Page a(TMSMetaInfoWrapper mataInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppManifest.Page) ipChange.ipc$dispatch("75d9705f", new Object[]{this, mataInfo});
        }
        kotlin.jvm.internal.q.d(mataInfo, "mataInfo");
        List<AppManifest.Page> t = mataInfo.t();
        if (t == null) {
            return null;
        }
        return (AppManifest.Page) p.i((List<? extends Object>) t);
    }

    private final String b(String str, String str2, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("704ac221", new Object[]{this, str, str2, list, list2});
        }
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            return str;
        }
        Uri originUri = Uri.parse(str);
        Uri.Builder clearQuery = originUri.buildUpon().clearQuery();
        List<String> b2 = kotlin.text.n.b((CharSequence) str2, new String[]{"&"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        boolean z = list != null;
        for (String str3 : b2) {
            try {
                Result.a aVar = Result.Companion;
                List b3 = kotlin.text.n.b((CharSequence) str3, new String[]{"="}, false, 0, 6, (Object) null);
                String str4 = (String) b3.get(0);
                String str5 = (String) b3.get(1);
                if ((z && list != null && list.contains(str4)) || (!z && (list2 == null || !list2.contains(str4)))) {
                    arrayList.add(str4);
                    clearQuery.appendQueryParameter(str4, str5);
                }
                Result.m2371constructorimpl(kotlin.t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(kotlin.i.a(th));
            }
        }
        kotlin.jvm.internal.q.b(originUri, "originUri");
        for (String str6 : originUri.getQueryParameterNames()) {
            if (!arrayList.contains(str6)) {
                clearQuery.appendQueryParameter(str6, originUri.getQueryParameter(str6));
            }
        }
        return clearQuery.build().toString();
    }

    public static /* synthetic */ String a(i iVar, String str, String str2, List list, List list2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33f619ff", new Object[]{iVar, str, str2, list, list2, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            list2 = null;
        }
        return iVar.a(str, str2, list, list2);
    }

    public final String a(String str, String str2, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3859e702", new Object[]{this, str, str2, list, list2});
        }
        if (!n.INSTANCE.l()) {
            return b(str, str2, list, list2);
        }
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Map<String, String> targetParams = com.taobao.themis.utils.o.a(str);
        List<String> b2 = kotlin.text.n.b((CharSequence) str2, new String[]{"&"}, false, 0, 6, (Object) null);
        boolean z = list != null;
        for (String str3 : b2) {
            try {
                Result.a aVar = Result.Companion;
                List b3 = kotlin.text.n.b((CharSequence) str3, new String[]{"="}, false, 0, 6, (Object) null);
                String str4 = (String) b3.get(0);
                String str5 = (String) b3.get(1);
                if ((z && list != null && list.contains(str4)) || (!z && (list2 == null || !list2.contains(str4)))) {
                    kotlin.jvm.internal.q.b(targetParams, "targetParams");
                    targetParams.put(str4, str5);
                }
                Result.m2371constructorimpl(kotlin.t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(kotlin.i.a(th));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : targetParams.keySet()) {
            int i2 = i + 1;
            if (i < 0) {
                p.b();
            }
            String str6 = (String) obj;
            if (i == 0) {
                sb.append(str6 + '=' + targetParams.get(str6));
            } else {
                sb.append('&' + str6 + '=' + targetParams.get(str6));
            }
            i = i2;
        }
        return parse.buildUpon().encodedQuery(sb.toString()).build().toString();
    }

    public final String a(String url, QueryPass queryPass, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e208a8e", new Object[]{this, url, queryPass, str});
        }
        kotlin.jvm.internal.q.d(url, "url");
        String str2 = str;
        if ((str2 == null || kotlin.text.n.a((CharSequence) str2)) || queryPass == null) {
            return url;
        }
        List<String> allow = queryPass.getAllow();
        if (!(allow == null || allow.isEmpty())) {
            List<String> allow2 = queryPass.getAllow();
            kotlin.jvm.internal.q.a(allow2);
            if (allow2.contains("*")) {
                String a2 = a(this, url, str, null, null, 12, null);
                kotlin.jvm.internal.q.a((Object) a2);
                return a2;
            }
            String a3 = a(this, url, str, queryPass.getAllow(), null, 8, null);
            kotlin.jvm.internal.q.a((Object) a3);
            return a3;
        }
        List<String> ignore = queryPass.getIgnore();
        if (ignore != null && !ignore.isEmpty()) {
            z = false;
        }
        if (z) {
            return url;
        }
        List<String> ignore2 = queryPass.getIgnore();
        kotlin.jvm.internal.q.a(ignore2);
        if (ignore2.contains("*")) {
            return url;
        }
        String a4 = a(this, url, str, null, queryPass.getIgnore(), 4, null);
        kotlin.jvm.internal.q.a((Object) a4);
        return a4;
    }

    public final boolean a(Uri equal, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d711a94c", new Object[]{this, equal, uri})).booleanValue();
        }
        kotlin.jvm.internal.q.d(equal, "$this$equal");
        kotlin.jvm.internal.q.d(uri, "uri");
        return kotlin.text.n.a(equal.getScheme(), uri.getScheme(), true) && kotlin.text.n.a(equal.getHost(), uri.getHost(), true) && equal.getPort() == uri.getPort() && kotlin.text.n.a(equal.getPath(), uri.getPath(), false, 2, (Object) null);
    }

    @JvmStatic
    public static final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        Uri bundleUri = Uri.parse(str);
        kotlin.jvm.internal.q.b(bundleUri, "bundleUri");
        if (!bundleUri.isHierarchical()) {
            return false;
        }
        String queryParameter = bundleUri.getQueryParameter("weex_mode");
        if ((!kotlin.jvm.internal.q.a((Object) "dom", (Object) queryParameter)) && (!kotlin.jvm.internal.q.a((Object) com.taobao.homepage.page.weexv2.a.KEY_MUS, (Object) queryParameter))) {
            return false;
        }
        return kotlin.jvm.internal.q.a((Object) "true", (Object) bundleUri.getQueryParameter("wh_weex")) || !StringUtils.isEmpty(bundleUri.getQueryParameter(com.taobao.vessel.utils.b.WX_TPL)) || !StringUtils.isEmpty(bundleUri.getQueryParameter("_mus_tpl"));
    }
}
