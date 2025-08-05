package android.taobao.windvane.prerender;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroid/taobao/windvane/prerender/DefaultPrerenderChecker;", "Landroid/taobao/windvane/prerender/IPrerenderChecker;", "preRenderType", "", "spmBValues", "", "", "queryIgnores", "(ILjava/util/List;Ljava/util/List;)V", "hit", "", "preRenderUrl", "pageUrl", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f1689a;
    private final List<String> b;
    private final List<String> c;

    static {
        kge.a(713113187);
        kge.a(907343115);
    }

    public b(int i, List<String> list, List<String> list2) {
        this.f1689a = i;
        this.b = list;
        this.c = list2;
    }

    @Override // android.taobao.windvane.prerender.c
    public boolean a(String preRenderUrl, String pageUrl) {
        boolean z;
        boolean equals;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, preRenderUrl, pageUrl})).booleanValue();
        }
        q.d(preRenderUrl, "preRenderUrl");
        q.d(pageUrl, "pageUrl");
        try {
            Result.a aVar = Result.Companion;
            if (this.f1689a == 0) {
                return false;
            }
            if (this.f1689a == 1) {
                String queryParameter = Uri.parse(pageUrl).getQueryParameter("spm");
                List b = queryParameter != null ? n.b((CharSequence) queryParameter, new String[]{"."}, false, 0, 6, (Object) null) : null;
                List<String> list = this.b;
                if (list != null) {
                    List<String> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (String str : list2) {
                            if (TextUtils.equals(str, "*")) {
                                equals = true;
                                continue;
                            } else {
                                if (b != null && b.size() >= 2) {
                                    equals = TextUtils.equals(str, (String) b.get(1));
                                    continue;
                                }
                                equals = false;
                            }
                            if (equals) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                z = false;
                if (!z) {
                    com.taobao.android.riverlogger.e.a(RVLLevel.Error, "Themis/Performance/Prerender", "spm not matched");
                    return false;
                }
            }
            Uri preRenderUri = Uri.parse(preRenderUrl);
            Uri pageUri = Uri.parse(pageUrl);
            q.b(preRenderUri, "preRenderUri");
            String scheme = preRenderUri.getScheme();
            q.b(pageUri, "pageUri");
            if (!(!q.a((Object) scheme, (Object) pageUri.getScheme())) && !(!q.a((Object) preRenderUri.getHost(), (Object) pageUri.getHost())) && !(!q.a((Object) preRenderUri.getPath(), (Object) pageUri.getPath()))) {
                for (String query : preRenderUri.getQueryParameterNames()) {
                    List<String> list3 = this.c;
                    if (list3 == null || !list3.contains(query)) {
                        q.b(query, "query");
                        if (!n.b((CharSequence) pageUrl, (CharSequence) query, false, 2, (Object) null) || (!q.a((Object) preRenderUri.getQueryParameter(query), (Object) pageUri.getQueryParameter(query)))) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
            return false;
        }
    }
}
