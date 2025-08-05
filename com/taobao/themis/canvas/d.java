package com.taobao.themis.canvas;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.ihq;
import tb.ihz;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0007H\u0002J\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/taobao/themis/canvas/FCanvasLibraryInit;", "", "()V", "LIBRARY_NAME", "", RPCDataItems.SWITCH_TAG_LOG, "getFCanvasIsReady", "", "loadFCanvasLibrary", "", "loadFCanvasLibraryFromLocal", "loadFCanvasLibrarySync", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d INSTANCE;

    static {
        kge.a(1786943502);
        INSTANCE = new d();
    }

    private d() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r0.g() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.canvas.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r4
            java.lang.String r2 = "56c6c6c"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L19:
            boolean r0 = c()
            if (r0 == 0) goto L20
            return r3
        L20:
            tb.iia r0 = tb.ihq.a()     // Catch: java.lang.Exception -> L36
            java.lang.String r1 = "fcanvas_v8_jsi"
            tb.ihz r0 = r0.c(r1)     // Catch: java.lang.Exception -> L36
            java.lang.String r1 = "RemoteSo.loader().loadSync(LIBRARY_NAME)"
            kotlin.jvm.internal.q.b(r0, r1)     // Catch: java.lang.Exception -> L36
            boolean r0 = r0.g()     // Catch: java.lang.Exception -> L36
            if (r0 != 0) goto L42
            goto L41
        L36:
            r0 = move-exception
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r1 = "FCanvasLibraryInit"
            java.lang.String r2 = "loadFCanvasLibrarySync"
            com.taobao.themis.kernel.basic.TMSLogger.b(r1, r2, r0)
        L41:
            r2 = 1
        L42:
            if (r2 == 0) goto L49
            boolean r0 = r4.d()
            return r0
        L49:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.canvas.d.a():boolean");
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            ihz b = ihq.a().b("fcanvas_v8_jsi");
            q.b(b, "RemoteSo.loader().load(LIBRARY_NAME)");
            if (b.g()) {
                z = false;
            }
        } catch (Exception e) {
            TMSLogger.b("FCanvasLibraryInit", "loadFCanvasLibrarySync", e);
        }
        if (!z) {
            return;
        }
        d();
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : ihq.a().a("fcanvas_v8_jsi") || INSTANCE.d();
    }

    private final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        try {
            System.loadLibrary("fcanvas_v8_jsi");
            return true;
        } catch (Throwable th) {
            TMSLogger.b("FCanvasLibraryInit", "loadFCanvasLibraryFromLocal", th);
            return false;
        }
    }
}
