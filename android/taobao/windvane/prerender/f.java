package android.taobao.windvane.prerender;

import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.storage.FirstChunkStorage;
import android.taobao.windvane.extra.storage.ResponseContext;
import android.taobao.windvane.thread.WVThreadPool;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00040\bH\u0016J&\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00040\bH\u0002¨\u0006\r"}, d2 = {"Landroid/taobao/windvane/prerender/SnapShotPrerenderFactory;", "Landroid/taobao/windvane/prerender/IPrerenderFactory;", "()V", "createPrerenderItem", "", "params", "Landroid/taobao/windvane/export/prerender/PrerenderRequestParams;", "callback", "Lkotlin/Function1;", "Landroid/taobao/windvane/prerender/PrerenderItem;", "readValidSnapshotAsync", "url", "", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1692a;
        public final /* synthetic */ rul b;

        public a(String str, rul rulVar) {
            this.f1692a = str;
            this.b = rulVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ResponseContext read = new FirstChunkStorage(this.f1692a).read(this.f1692a);
            if (read == null || !read.isEnable() || read.isExpired()) {
                this.b.mo2421invoke(null);
            } else {
                this.b.mo2421invoke(read.getHtml());
            }
        }
    }

    static {
        kge.a(2093101327);
        kge.a(-926853536);
    }

    public void a(android.taobao.windvane.export.prerender.e params, rul<? super e, t> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f64b26", new Object[]{this, params, callback});
            return;
        }
        q.d(params, "params");
        q.d(callback, "callback");
        if (StringUtils.isEmpty(params.a()) || params.b() != 2) {
            callback.mo2421invoke(null);
            return;
        }
        WVCore wVCore = WVCore.getInstance();
        q.b(wVCore, "WVCore.getInstance()");
        if (!wVCore.isUCSupport()) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, "Themis/Performance/Prerender", "preRendering webview is not support");
            callback.mo2421invoke(null);
            return;
        }
        a(params.a(), new SnapShotPrerenderFactory$createPrerenderItem$1(callback, params));
    }

    private final void a(String str, rul<? super String, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3daab179", new Object[]{this, str, rulVar});
        } else {
            WVThreadPool.getInstance().execute(new a(str, rulVar));
        }
    }
}
