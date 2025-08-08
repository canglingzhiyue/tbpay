package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.ogk;
import tb.ohd;

/* loaded from: classes8.dex */
public class n extends RichTextContainerComponent implements com.taobao.tao.flexbox.layoutmanager.core.s, StaticLayoutView.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1955369917);
        kge.a(-779973532);
        kge.a(-1420926486);
    }

    public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1814733277) {
            if (hashCode == -613926416) {
                super.onLayout();
                return null;
            } else if (hashCode != 258418204) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Boolean(super.invoke((g.c) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (g.d) objArr[3]));
            }
        }
        return super.onCreateView((Context) objArr[0]);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent, com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        StaticLayoutView staticLayoutView = (StaticLayoutView) super.onCreateView(context);
        staticLayoutView.enableNewMarquee(true, this);
        staticLayoutView.setLoopCount(oec.a(this.node.e("loop"), -1));
        staticLayoutView.setLoopDelay(oec.a(this.node.e("loopdelay"), 0));
        staticLayoutView.setDirection(oec.a(this.node.e("direction"), "left"));
        staticLayoutView.setScrollAmount(ohd.a(this.node, context, oec.b(this.node.e("scrollamount"), 6)));
        staticLayoutView.setMarqueeScrollGap(ohd.a(this.node, context, oec.a(this.node.e("scrollgap"), 0)));
        return staticLayoutView;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6839f0", new Object[]{this});
            return;
        }
        super.onLayout();
        String a2 = oec.a(this.node.e("direction"), "left");
        if (!StringUtils.equals(a2, "left") && !StringUtils.equals(a2, "right")) {
            return;
        }
        ((ogk) this.viewParams).v = StringUtils.TruncateAt.MARQUEE;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        if ((eVar.c.equals("onwilldisappear") || eVar.c.equals("onwillappear")) && this.view != 0) {
            if (eVar.c.equals("onwillappear")) {
                if (((StaticLayoutView) this.view).getMarqueeState() == 1) {
                    ((StaticLayoutView) this.view).startMarquee();
                }
            } else {
                ((StaticLayoutView) this.view).pauseMarquee();
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean invoke(com.taobao.tao.flexbox.layoutmanager.ac.g.c r8, java.lang.String r9, com.alibaba.fastjson.JSONObject r10, com.taobao.tao.flexbox.layoutmanager.ac.g.d r11) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.n.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r1[r5] = r8
            r1[r4] = r9
            r1[r2] = r10
            r8 = 4
            r1[r8] = r11
            java.lang.String r8 = "f67261c"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L25:
            V extends android.view.View r0 = r7.view
            if (r0 == 0) goto L92
            r0 = -1
            int r1 = r9.hashCode()
            r6 = 3540994(0x360802, float:4.96199E-39)
            if (r1 == r6) goto L54
            r6 = 106440182(0x65825f6, float:4.0652974E-35)
            if (r1 == r6) goto L49
            r6 = 109757538(0x68ac462, float:5.219839E-35)
            if (r1 == r6) goto L3e
            goto L5e
        L3e:
            java.lang.String r1 = "start"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L5e
            r0 = 0
            goto L5e
        L49:
            java.lang.String r1 = "pause"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L5e
            r0 = 1
            goto L5e
        L54:
            java.lang.String r1 = "stop"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L5e
            r0 = 2
        L5e:
            if (r0 == 0) goto L83
            if (r0 == r5) goto L74
            if (r0 == r4) goto L65
            goto L92
        L65:
            V extends android.view.View r0 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r0 = (com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView) r0
            r0.setMarqueeState(r2)
            V extends android.view.View r0 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r0 = (com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView) r0
            r0.stopMarquee()
            goto L93
        L74:
            V extends android.view.View r0 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r0 = (com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView) r0
            r0.setMarqueeState(r4)
            V extends android.view.View r0 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r0 = (com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView) r0
            r0.pauseMarquee()
            goto L93
        L83:
            V extends android.view.View r0 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r0 = (com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView) r0
            r0.setMarqueeState(r5)
            V extends android.view.View r0 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r0 = (com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView) r0
            r0.startMarquee()
            goto L93
        L92:
            r5 = 0
        L93:
            if (r5 != 0) goto L99
            boolean r5 = super.invoke(r8, r9, r10, r11)
        L99:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.n.invoke(com.taobao.tao.flexbox.layoutmanager.ac.g$c, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.tao.flexbox.layoutmanager.ac.g$d):boolean");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        sendMessage(this.node, "onstatechanged", null, hashMap, null);
    }
}
