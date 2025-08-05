package com.taobao.homepage.pop.view.container.sub;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.c;
import com.taobao.homepage.pop.utils.d;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import com.taobao.homepage.pop.view.container.b;
import com.taobao.homepage.pop.view.popview.BasePopView;
import tb.kyu;
import tb.laj;
import tb.lak;

/* loaded from: classes7.dex */
public class b extends com.taobao.homepage.pop.view.container.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ com.taobao.homepage.pop.view.container.a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.homepage.pop.view.container.a) ipChange.ipc$dispatch("caf27820", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ void a(b bVar, b.a aVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be48feb2", new Object[]{bVar, aVar, new Boolean(z), str});
        } else {
            bVar.a(aVar, z, str);
        }
    }

    public static /* synthetic */ void a(b bVar, com.taobao.homepage.pop.viewmodel.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11c01ce6", new Object[]{bVar, bVar2});
        } else {
            bVar.e(bVar2);
        }
    }

    public static /* synthetic */ com.taobao.homepage.pop.view.container.a b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.homepage.pop.view.container.a) ipChange.ipc$dispatch("ca19077f", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ void b(b bVar, b.a aVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f22cd1", new Object[]{bVar, aVar, new Boolean(z), str});
        } else {
            bVar.a(aVar, z, str);
        }
    }

    public static /* synthetic */ void b(b bVar, com.taobao.homepage.pop.viewmodel.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("741b33c5", new Object[]{bVar, bVar2});
        } else {
            bVar.e(bVar2);
        }
    }

    public static /* synthetic */ com.taobao.homepage.pop.view.container.a c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.homepage.pop.view.container.a) ipChange.ipc$dispatch("c93f96de", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ void c(b bVar, b.a aVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("359b5af0", new Object[]{bVar, aVar, new Boolean(z), str});
        } else {
            bVar.a(aVar, z, str);
        }
    }

    public static /* synthetic */ BasePopContainer d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BasePopContainer) ipChange.ipc$dispatch("b9325cf7", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ void d(b bVar, b.a aVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f144890f", new Object[]{bVar, aVar, new Boolean(z), str});
        } else {
            bVar.a(aVar, z, str);
        }
    }

    public static /* synthetic */ com.taobao.homepage.pop.view.container.a e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.homepage.pop.view.container.a) ipChange.ipc$dispatch("c78cb59c", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ Handler f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b60f0271", new Object[]{bVar}) : bVar.f17261a;
    }

    public b(BasePopContainer basePopContainer, lak lakVar, kyu kyuVar) {
        super(basePopContainer, lakVar, kyuVar);
        this.e = new a(kyuVar);
    }

    @Override // com.taobao.homepage.pop.view.container.b
    public void a(final com.taobao.homepage.pop.viewmodel.b bVar, final b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758407ea", new Object[]{this, bVar, aVar});
        } else if (!bVar.a().isAllowShow()) {
            a(aVar, false, com.taobao.homepage.pop.ucp.b.ERROR_MSG_SHOW_COUNT_INVALID);
        } else {
            final IPopData a2 = bVar.a();
            final IPopConfig popConfig = a2.getPopConfig();
            final laj a3 = this.d.a(popConfig.getPopContentType());
            if (a3 == null) {
                a(aVar, false, popConfig.getPopContentType() == 1 ? com.taobao.homepage.pop.ucp.b.ERROR_DX_RENDER_FAILED : com.taobao.homepage.pop.ucp.b.ERROR_WEEX_RENDER_FAILED);
                c.a("SubContainerPopTrigger ", "no viewProvider by contentType=" + popConfig.getPopContentType());
                return;
            }
            new Runnable() { // from class: com.taobao.homepage.pop.view.container.sub.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public int f17268a = 0;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a2.isAllowShow()) {
                        b.a(b.this, aVar, false, com.taobao.homepage.pop.ucp.b.ERROR_MSG_SHOW_COUNT_INVALID);
                    } else {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        View a4 = b.a(b.this).a(bVar);
                        IPopAnchorViewInfo a5 = b.b(b.this).a(a4, 0);
                        if (!a(a5)) {
                            return;
                        }
                        d.a("PopTargetCardValid", a2);
                        BasePopView createPopView = b.d(b.this).createPopView(a2, a3, a4, a5, b.c(b.this), bVar);
                        if (createPopView == null) {
                            b.b(b.this, aVar, false, popConfig.getPopContentType() == 1 ? com.taobao.homepage.pop.ucp.b.ERROR_DX_RENDER_FAILED : com.taobao.homepage.pop.ucp.b.ERROR_WEEX_RENDER_FAILED);
                            b.a(b.this, bVar);
                            c.a("SubContainerPopTrigger ", "create popView error, saveToPending, bizId=" + a2);
                            return;
                        }
                        b.c(b.this, aVar, true, "0");
                        c.a("SubContainerPopTrigger ", "create new pop success, popView=" + createPopView.hashCode() + ", businessId=" + a2.getBusinessID() + ", useTime=" + (SystemClock.uptimeMillis() - uptimeMillis));
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private boolean a(com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo r7) {
                    /*
                        r6 = this;
                        com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.homepage.pop.view.container.sub.b.AnonymousClass1.$ipChange
                        boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                        r2 = 0
                        r3 = 1
                        if (r1 == 0) goto L1c
                        r1 = 2
                        java.lang.Object[] r1 = new java.lang.Object[r1]
                        r1[r2] = r6
                        r1[r3] = r7
                        java.lang.String r7 = "f795e67e"
                        java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
                        java.lang.Boolean r7 = (java.lang.Boolean) r7
                        boolean r7 = r7.booleanValue()
                        return r7
                    L1c:
                        java.lang.String r0 = "SubContainerPopTrigger "
                        if (r7 != 0) goto L27
                        java.lang.String r7 = "IPopAnchorViewInfo is null"
                        com.taobao.homepage.pop.utils.c.a(r0, r7)
                    L25:
                        r7 = 1
                        goto L53
                    L27:
                        int r1 = r7.getScreenX()
                        if (r1 >= 0) goto L42
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r4 = "getScreenX < 0, rePost, info="
                        r1.append(r4)
                        r1.append(r7)
                        java.lang.String r7 = r1.toString()
                        com.taobao.homepage.pop.utils.c.a(r0, r7)
                        goto L25
                    L42:
                        com.taobao.homepage.pop.view.container.sub.b r1 = com.taobao.homepage.pop.view.container.sub.b.this
                        com.taobao.homepage.pop.view.container.a r1 = com.taobao.homepage.pop.view.container.sub.b.e(r1)
                        com.taobao.homepage.pop.protocol.model.pop.IPopData r4 = r2
                        r5 = 0
                        int r7 = r1.a(r4, r7, r5)
                        if (r7 >= 0) goto L52
                        goto L25
                    L52:
                        r7 = 0
                    L53:
                        if (r7 != 0) goto L56
                        return r3
                    L56:
                        int r7 = r6.f17268a
                        int r7 = r7 + r3
                        r6.f17268a = r7
                        int r7 = r6.f17268a
                        r1 = 5
                        if (r7 >= r1) goto L91
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r1 = "rePost,"
                        r7.append(r1)
                        com.taobao.homepage.pop.protocol.model.pop.IPopData r1 = r2
                        java.lang.String r1 = r1.getBusinessID()
                        r7.append(r1)
                        java.lang.String r1 = ", count="
                        r7.append(r1)
                        int r1 = r6.f17268a
                        r7.append(r1)
                        java.lang.String r7 = r7.toString()
                        com.taobao.homepage.pop.utils.c.a(r0, r7)
                        com.taobao.homepage.pop.view.container.sub.b r7 = com.taobao.homepage.pop.view.container.sub.b.this
                        android.os.Handler r7 = com.taobao.homepage.pop.view.container.sub.b.f(r7)
                        r0 = 50
                        r7.postDelayed(r6, r0)
                        goto La1
                    L91:
                        com.taobao.homepage.pop.view.container.sub.b r7 = com.taobao.homepage.pop.view.container.sub.b.this
                        com.taobao.homepage.pop.view.container.b$a r0 = r3
                        java.lang.String r1 = "9"
                        com.taobao.homepage.pop.view.container.sub.b.d(r7, r0, r2, r1)
                        com.taobao.homepage.pop.view.container.sub.b r7 = com.taobao.homepage.pop.view.container.sub.b.this
                        com.taobao.homepage.pop.viewmodel.b r0 = r4
                        com.taobao.homepage.pop.view.container.sub.b.b(r7, r0)
                    La1:
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.homepage.pop.view.container.sub.b.AnonymousClass1.a(com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo):boolean");
                }
            }.run();
        }
    }
}
