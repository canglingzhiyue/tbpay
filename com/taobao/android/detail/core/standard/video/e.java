package com.taobao.android.detail.core.standard.video;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.datasdk.model.datamodel.node.NativeFloatButtonNode;
import java.util.HashMap;
import java.util.Map;
import tb.aqs;
import tb.dya;
import tb.dyy;
import tb.ecf;
import tb.emj;
import tb.emu;
import tb.epq;
import tb.ieg;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.render.picGalleryFloatButton.scroll")
/* loaded from: classes4.dex */
public final class e extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DetailCoreActivity b;

    static {
        kge.a(-1977699686);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == 563256106) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.atg
    public void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public static /* synthetic */ DetailCoreActivity a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("366846a0", new Object[]{eVar}) : eVar.b;
    }

    public static /* synthetic */ Map a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6c82f654", new Object[]{eVar, str}) : eVar.a(str);
    }

    public e() {
        emu.a("com.taobao.android.detail.core.standard.video.PicGalleryFloatButtonExtension");
    }

    @Override // tb.atg
    public void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        com.taobao.android.detail.core.detail.widget.d a2 = a();
        if (a2 == null || a2.b() == null) {
            return;
        }
        int i4 = s.b() ? 5 : 1;
        int a3 = emj.a(recyclerView, false);
        if (a3 <= i4) {
            z = false;
        }
        com.taobao.android.detail.core.utils.i.a("PicGalleryFloatButtonExtension", "onScrolled isOverScrollThreshold = " + z + ", firstVisibleItemIndex = " + a3);
        final NativeFloatButtonNode.a b = com.taobao.android.detail.core.utils.d.b(this.b);
        NativeFloatButtonNode.a c = com.taobao.android.detail.core.utils.d.c(this.b);
        boolean a4 = com.taobao.android.detail.core.utils.d.a(b);
        boolean a5 = com.taobao.android.detail.core.utils.d.a(c);
        final String d = com.taobao.android.detail.core.utils.d.d(b);
        String e = com.taobao.android.detail.core.utils.d.e(c);
        a2.b().a(new View.OnClickListener() { // from class: com.taobao.android.detail.core.standard.video.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (!StringUtils.equals(com.taobao.android.detail.core.utils.d.c(b), "openUrl") || StringUtils.isEmpty(d)) {
                } else {
                    epq.a(e.a(e.this), d);
                    ecf.a(e.a(e.this), e.a(e.this, d));
                }
            }
        });
        if (a2.b().a((!a5 || !z) ? 8 : 0)) {
            ecf.d(this.b, a(e));
        }
        dyy b2 = a2.b();
        if (!a4 || !z) {
            i3 = 8;
        }
        if (b2.b(i3)) {
            ecf.b(this.b, a(d));
        }
        if (z) {
            a2.d();
        } else {
            a2.e();
        }
        ieg b3 = b();
        if (b3 == null) {
            return;
        }
        b3.b(z);
    }

    private Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (StringUtils.isEmpty(str)) {
            return hashMap;
        }
        hashMap.put("url", str);
        return hashMap;
    }

    private com.taobao.android.detail.core.detail.widget.d a() {
        dya y;
        com.taobao.android.detail.core.detail.activity.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.core.detail.widget.d) ipChange.ipc$dispatch("a74d152b", new Object[]{this});
        }
        DetailCoreActivity detailCoreActivity = this.b;
        if (detailCoreActivity != null && (y = detailCoreActivity.y()) != null && (bVar = y.k) != null) {
            return bVar.c;
        }
        return null;
    }

    private ieg b() {
        dya y;
        com.taobao.android.detail.core.detail.activity.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ieg) ipChange.ipc$dispatch("16b78d12", new Object[]{this});
        }
        DetailCoreActivity detailCoreActivity = this.b;
        if (detailCoreActivity != null && (y = detailCoreActivity.y()) != null && (bVar = y.k) != null) {
            return bVar.y;
        }
        return null;
    }

    @Override // tb.arl
    public void onCreate(q qVar, com.alibaba.android.aura.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else if (!(qVar.e() instanceof DetailCoreActivity)) {
        } else {
            this.b = (DetailCoreActivity) qVar.e();
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.a, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        }
    }
}
