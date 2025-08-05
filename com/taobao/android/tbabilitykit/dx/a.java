package com.taobao.android.tbabilitykit.dx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.fyu;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0589a Companion;
    public static final String EXPOSURE_ABILITY = "-6578109113989720488";

    static {
        kge.a(135496278);
        Companion = new C0589a(null);
    }

    @Override // com.taobao.android.tbabilitykit.dx.d
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "exposure";
    }

    /* renamed from: com.taobao.android.tbabilitykit.dx.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0589a {
        static {
            kge.a(-243467746);
        }

        private C0589a() {
        }

        public /* synthetic */ C0589a(o oVar) {
            this();
        }
    }

    @Override // com.taobao.android.tbabilitykit.dx.d
    public void a(String str, DXWidgetNode layout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b5093d", new Object[]{this, str, layout});
            return;
        }
        q.d(layout, "layout");
        if (((fyu) (!(layout instanceof fyu) ? null : layout)) == null) {
            return;
        }
        if (n.a(str, JarvisConstant.KEY_JARVIS_TRIGGER, false, 2, (Object) null)) {
            ((fyu) layout).triggerExposure();
        } else if (!n.a(str, "clearCache", false, 2, (Object) null)) {
        } else {
            ((fyu) layout).clearExposureCache();
        }
    }
}
