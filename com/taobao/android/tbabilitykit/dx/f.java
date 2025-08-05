package com.taobao.android.tbabilitykit.dx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.fyx;
import tb.kge;

/* loaded from: classes6.dex */
public class f extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String VIDEO_CONTROL_ABILITY = "4633893273292495833";

    static {
        kge.a(-158861816);
        Companion = new a(null);
    }

    @Override // com.taobao.android.tbabilitykit.dx.d
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "videoPlay";
    }

    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(-1572735152);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
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
        if (((fyx) (!(layout instanceof fyx) ? null : layout)) == null) {
            return;
        }
        if (n.a(str, JarvisConstant.KEY_JARVIS_TRIGGER, false, 2, (Object) null)) {
            ((fyx) layout).triggerVideoPlayControl();
        } else if (!n.a(str, "stop", false, 2, (Object) null)) {
        } else {
            ((fyx) layout).stopVideoPlayControl();
        }
    }
}
