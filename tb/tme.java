package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.preload.c;
import com.taobao.themis.uniapp.solution.d;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0005R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/taobao/themis/uniapp/solution/prefetch/UniAppMainDocumentPrefetchPool;", "", "()V", "prefetchMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/taobao/themis/kernel/preload/UniAppDocumentLoadInfo;", "getPrefetchMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "consumePrefetch", "navUrl", "doPrefetch", "", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class tme {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tme INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<String, c> f34210a;

    static {
        kge.a(-985943326);
        INSTANCE = new tme();
        f34210a = new ConcurrentHashMap<>();
    }

    private tme() {
    }

    public final ConcurrentHashMap<String, c> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("f779de7e", new Object[]{this}) : f34210a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r6.a(r7, r8) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tme.a(java.lang.String):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J,\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e\u0018\u00010\rH\u0016¨\u0006\u000f"}, d2 = {"com/taobao/themis/uniapp/solution/prefetch/UniAppMainDocumentPrefetchPool$doPrefetch$1", "Lcom/taobao/themis/uniapp/solution/UniAppDocumentClient$Callback;", "onError", "", "code", "", "msg", "", "onFinish", "loadInfo", "Lcom/taobao/themis/kernel/preload/UniAppDocumentLoadInfo;", "onNetWorkResponse", "header", "", "", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f34211a;

        @Override // com.taobao.themis.uniapp.solution.d.a
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            }
        }

        @Override // com.taobao.themis.uniapp.solution.d.a
        public void b(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c62340b", new Object[]{this, new Integer(i), map});
            }
        }

        public a(String str) {
            this.f34211a = str;
        }

        @Override // com.taobao.themis.uniapp.solution.d.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                d.a.C0978a.a(this);
            }
        }

        @Override // com.taobao.themis.uniapp.solution.d.a
        public void a(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
            } else {
                d.a.C0978a.a(this, i, map);
            }
        }

        @Override // com.taobao.themis.uniapp.solution.d.a
        public void a(c loadInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f61bb256", new Object[]{this, loadInfo});
                return;
            }
            q.d(loadInfo, "loadInfo");
            tme.INSTANCE.a().put(this.f34211a, loadInfo);
        }
    }

    public final c b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("5cf5d8b1", new Object[]{this, str});
        }
        if (str != null) {
            return f34210a.remove(str);
        }
        return null;
    }
}
