package android.taobao.windvane.export.prerender;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.eau;
import tb.kge;
import tb.riy;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Landroid/taobao/windvane/export/prerender/PrerenderRequestParams;", "", "url", "", "preRenderType", "", "prerenderChecker", "Landroid/taobao/windvane/prerender/IPrerenderChecker;", "delayNextTime", "", RemoteMessageConst.TTL, "(Ljava/lang/String;ILandroid/taobao/windvane/prerender/IPrerenderChecker;JJ)V", "getDelayNextTime", "()J", "getPreRenderType", "()I", "getPrerenderChecker", "()Landroid/taobao/windvane/prerender/IPrerenderChecker;", "getTtl", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", eau.PARSER_TAG, "", "other", "hashCode", "toString", "Builder", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f1609a;
    private final int b;
    private final android.taobao.windvane.prerender.c c;
    private final long d;
    private final long e;

    static {
        kge.a(-1892072663);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (!q.a((Object) this.f1609a, (Object) eVar.f1609a) || this.b != eVar.b || !q.a(this.c, eVar.c) || this.d != eVar.d || this.e != eVar.e) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f1609a;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
        android.taobao.windvane.prerender.c cVar = this.c;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        long j = this.d;
        long j2 = this.e;
        return ((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PrerenderRequestParams(url=" + this.f1609a + ", preRenderType=" + this.b + ", prerenderChecker=" + this.c + ", delayNextTime=" + this.d + ", ttl=" + this.e + riy.BRACKET_END_STR;
    }

    public e(String url, @PrerenderType int i, android.taobao.windvane.prerender.c prerenderChecker, long j, long j2) {
        q.d(url, "url");
        q.d(prerenderChecker, "prerenderChecker");
        this.f1609a = url;
        this.b = i;
        this.c = prerenderChecker;
        this.d = j;
        this.e = j2;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f1609a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public final android.taobao.windvane.prerender.c c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (android.taobao.windvane.prerender.c) ipChange.ipc$dispatch("bfad2d32", new Object[]{this}) : this.c;
    }

    public final long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.d;
    }

    public final long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0012\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0016\u0010\u0014\u001a\u00020\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroid/taobao/windvane/export/prerender/PrerenderRequestParams$Builder;", "", "()V", "delayNextTime", "", "preRenderType", "", "getPreRenderType$annotations", "prerenderChecker", "Landroid/taobao/windvane/prerender/IPrerenderChecker;", "queryIgnores", "", "", "spmBValues", "url", CartRecommendRefreshScene.build, "Landroid/taobao/windvane/export/prerender/PrerenderRequestParams;", "setDelayNextTime", "setPreRenderType", "setQueryIgnores", "setSpmBValues", "setUrl", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f1610a = -1;
        private String b = "";
        private int c;
        private final android.taobao.windvane.prerender.c d;
        private List<String> e;
        private List<String> f;

        static {
            kge.a(-85794560);
        }

        public final a a(String url) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("685b723e", new Object[]{this, url});
            }
            q.d(url, "url");
            this.b = url;
            return this;
        }

        public final a a(@PrerenderType int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7a10a175", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public final a a(List<String> queryIgnores) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ec364877", new Object[]{this, queryIgnores});
            }
            q.d(queryIgnores, "queryIgnores");
            this.e = queryIgnores;
            return this;
        }

        public final a b(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5665d096", new Object[]{this, list});
            }
            this.f = list;
            return this;
        }

        public final a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b3db4354", new Object[]{this, new Long(j)});
            }
            this.f1610a = j;
            return this;
        }

        public final e a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("334c4165", new Object[]{this});
            }
            long j = this.c != 1 ? 60000L : 10800000L;
            String str = this.b;
            int i = this.c;
            android.taobao.windvane.prerender.b bVar = this.d;
            if (bVar == null) {
                bVar = new android.taobao.windvane.prerender.b(i, this.f, this.e);
            }
            return new e(str, i, bVar, this.f1610a, j);
        }
    }
}
