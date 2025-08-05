package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "picGallery.impl.event.openPop")
/* loaded from: classes4.dex */
public final class ejt extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openPop";

    static {
        kge.a(1357933606);
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "openPop";
    }

    public ejt() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.events.PicGalleryOpenPopEvent");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    @Override // tb.arv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.alibaba.android.aura.service.event.AURAEventIO r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ejt.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "186833d5"
            r0.ipc$dispatch(r5, r1)
            return
        L15:
            tb.dlr r0 = new tb.dlr
            r0.<init>()
            com.alibaba.android.aura.q r1 = r4.b()
            android.content.Context r1 = r1.e()
            r0.a(r1)
            com.alibaba.android.aura.service.event.d r5 = r5.getEventModel()
            java.lang.String r2 = "dx_runtime_context"
            java.lang.Object r2 = r5.c(r2)
            boolean r3 = r2 instanceof com.taobao.android.dinamicx.DXRuntimeContext
            if (r3 == 0) goto L43
            com.taobao.android.dinamicx.DXRuntimeContext r2 = (com.taobao.android.dinamicx.DXRuntimeContext) r2
            com.taobao.android.dinamicx.DXRootView r3 = r2.s()
            if (r3 == 0) goto L43
            com.taobao.android.dinamicx.DXRootView r2 = r2.s()
            r0.a(r2)
            goto L5b
        L43:
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L7a
            r2 = r1
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.Window r3 = r2.getWindow()
            if (r3 == 0) goto L7a
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r0.a(r2)
        L5b:
            tb.dkt r2 = new tb.dkt
            r2.<init>()
            com.alibaba.fastjson.JSONObject r3 = r5.c()
            if (r3 != 0) goto L6c
            com.alibaba.fastjson.JSONObject r5 = new com.alibaba.fastjson.JSONObject
            r5.<init>()
            goto L70
        L6c:
            com.alibaba.fastjson.JSONObject r5 = r5.c()
        L70:
            r3 = 0
            r2.a(r5, r0, r3)
            java.lang.String r5 = "openPop"
            com.taobao.android.detail.core.detail.kit.utils.p.a(r1, r5)
            return
        L7a:
            tb.ard r5 = tb.arc.a()
            java.lang.String r0 = "PicGalleryOpenPopEvent"
            java.lang.String r1 = "innerHandleEvent"
            java.lang.String r2 = "view is null"
            r5.c(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ejt.b(com.alibaba.android.aura.service.event.AURAEventIO):void");
    }
}
