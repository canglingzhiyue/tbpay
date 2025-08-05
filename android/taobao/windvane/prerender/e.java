package android.taobao.windvane.prerender;

import android.taobao.windvane.extra.uc.WVUCWebView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.eau;
import tb.kge;
import tb.riy;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Landroid/taobao/windvane/prerender/PrerenderItem;", "", "webview", "Landroid/taobao/windvane/extra/uc/WVUCWebView;", "prerenderRequestParams", "Landroid/taobao/windvane/export/prerender/PrerenderRequestParams;", "isReady", "", "(Landroid/taobao/windvane/extra/uc/WVUCWebView;Landroid/taobao/windvane/export/prerender/PrerenderRequestParams;Z)V", "()Z", "setReady", "(Z)V", "getPrerenderRequestParams", "()Landroid/taobao/windvane/export/prerender/PrerenderRequestParams;", "getWebview", "()Landroid/taobao/windvane/extra/uc/WVUCWebView;", "component1", "component2", "component3", "copy", eau.PARSER_TAG, "other", "hashCode", "", "toString", "", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WVUCWebView f1691a;
    private final android.taobao.windvane.export.prerender.e b;
    private boolean c;

    static {
        kge.a(-1605153102);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (!q.a(this.f1691a, eVar.f1691a) || !q.a(this.b, eVar.b) || this.c != eVar.c) {
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
        WVUCWebView wVUCWebView = this.f1691a;
        int hashCode = (wVUCWebView != null ? wVUCWebView.hashCode() : 0) * 31;
        android.taobao.windvane.export.prerender.e eVar = this.b;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PrerenderItem(webview=" + this.f1691a + ", prerenderRequestParams=" + this.b + ", isReady=" + this.c + riy.BRACKET_END_STR;
    }

    public e(WVUCWebView webview, android.taobao.windvane.export.prerender.e prerenderRequestParams, boolean z) {
        q.d(webview, "webview");
        q.d(prerenderRequestParams, "prerenderRequestParams");
        this.f1691a = webview;
        this.b = prerenderRequestParams;
        this.c = z;
    }

    public final WVUCWebView a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("5b142d0f", new Object[]{this}) : this.f1691a;
    }

    public final android.taobao.windvane.export.prerender.e b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (android.taobao.windvane.export.prerender.e) ipChange.ipc$dispatch("6d16e344", new Object[]{this}) : this.b;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }
}
