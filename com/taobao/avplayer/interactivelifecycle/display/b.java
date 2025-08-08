package com.taobao.avplayer.interactivelifecycle.display;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.ac;
import com.taobao.avplayer.core.component.DWComponent;
import com.taobao.avplayer.core.protocol.DWInteractiveObject;
import com.taobao.avplayer.core.protocol.DWInteractiveVideoObject;
import com.taobao.avplayer.core.protocol.DWTimelineObject;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import org.json.JSONException;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class b extends ac {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DWContext c;
    public DWInteractiveVideoObject d;

    static {
        kge.a(-146417407);
        kge.a(1212562064);
    }

    public Class<? extends DWComponent> a(DWInteractiveObject dWInteractiveObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("9a038dc5", new Object[]{this, dWInteractiveObject});
        }
        return null;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public b(DWContext dWContext) {
        this.c = dWContext;
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_DWInteractive);
    }

    public void a(DWInteractiveVideoObject dWInteractiveVideoObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79529c5f", new Object[]{this, dWInteractiveVideoObject});
        } else {
            this.d = dWInteractiveVideoObject;
        }
    }

    public com.taobao.avplayer.core.a a(DWTimelineObject dWTimelineObject, DWVideoScreenType dWVideoScreenType) {
        DWInteractiveObject dWInteractiveObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.avplayer.core.a) ipChange.ipc$dispatch("82e2402c", new Object[]{this, dWTimelineObject, dWVideoScreenType});
        }
        try {
            dWInteractiveObject = dWVideoScreenType != DWVideoScreenType.LANDSCAPE_FULL_SCREEN ? dWTimelineObject.getPortraitMode() : dWTimelineObject.getLandscapeMode();
        } catch (JSONException e) {
            e.printStackTrace();
            dWInteractiveObject = null;
        }
        if (dWInteractiveObject == null) {
            return null;
        }
        DWContext dWContext = this.c;
        if (dWContext != null && dWContext.getIctTmpCallback() != null && dWTimelineObject.mPortraitMode != null) {
            this.c.getIctTmpCallback().a(dWInteractiveObject, dWVideoScreenType);
        }
        com.taobao.avplayer.core.a aVar = new com.taobao.avplayer.core.a();
        aVar.f16482a = a(dWInteractiveObject, dWVideoScreenType);
        aVar.b = dWInteractiveObject.getLayout();
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.avplayer.core.component.DWComponent a(com.taobao.avplayer.core.protocol.DWInteractiveObject r5, com.taobao.avplayer.DWVideoScreenType r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.avplayer.interactivelifecycle.display.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            r5 = 2
            r1[r5] = r6
            java.lang.String r5 = "e8b36656"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            com.taobao.avplayer.core.component.DWComponent r5 = (com.taobao.avplayer.core.component.DWComponent) r5
            return r5
        L1b:
            if (r5 != 0) goto L1f
            r5 = 0
            return r5
        L1f:
            com.taobao.avplayer.DWVideoScreenType r0 = com.taobao.avplayer.DWVideoScreenType.PORTRAIT_FULL_SCREEN
            if (r6 == r0) goto L50
            java.lang.String r0 = r5.getJsTemplateUrl()
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            if (r1 != 0) goto L43
            com.taobao.avplayer.core.protocol.DWInteractiveVideoObject r1 = r4.d
            java.lang.String r1 = r1.getJsTemplateUrl(r0)
            boolean r1 = android.text.StringUtils.isEmpty(r1)
            if (r1 != 0) goto L43
            com.taobao.avplayer.core.protocol.DWInteractiveVideoObject r1 = r4.d
            java.lang.String r0 = r1.getJsTemplateUrl(r0)
            r5.setJsTemplate(r0)
            goto L53
        L43:
            com.taobao.avplayer.core.protocol.DWInteractiveVideoObject r0 = r4.d
            java.lang.String r1 = r5.getJsTemplate()
            java.lang.String r0 = r0.getJsTemplate(r1)
            r5.setJsTemplate(r0)
        L50:
            java.lang.String r0 = ""
            r2 = 0
        L53:
            java.lang.Class r1 = r4.a(r5)
            com.taobao.avplayer.DWContext r3 = r4.c
            com.taobao.avplayer.core.component.DWComponent r5 = com.taobao.avplayer.core.component.a.a(r1, r3, r5, r6)
            if (r5 == 0) goto L68
            boolean r6 = r4.a()
            if (r6 != 0) goto L68
            r5.renderView()
        L68:
            if (r5 == 0) goto L6f
            r5.isUrlMode = r2
            r5.setJsUrl(r0)
        L6f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.interactivelifecycle.display.b.a(com.taobao.avplayer.core.protocol.DWInteractiveObject, com.taobao.avplayer.DWVideoScreenType):com.taobao.avplayer.core.component.DWComponent");
    }

    public void a(com.taobao.avplayer.core.a aVar, com.taobao.avplayer.core.a aVar2, com.taobao.avplayer.core.a aVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3077f430", new Object[]{this, aVar, aVar2, aVar3});
        } else if (aVar == null || aVar2 == null || aVar3 == null || aVar.f16482a == null || aVar2.f16482a == null || aVar3.f16482a == null) {
        } else {
            com.taobao.avplayer.core.component.c cVar = new com.taobao.avplayer.core.component.c();
            cVar.f16485a = aVar.f16482a;
            cVar.c = aVar2.f16482a;
            cVar.b = aVar3.f16482a;
            this.c.getDWComponentManager().a(aVar.f16482a.getDWComponentInstance(), aVar2.f16482a.getDWComponentInstance(), aVar3.f16482a.getDWComponentInstance(), cVar);
        }
    }
}
