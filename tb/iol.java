package tb;

import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.lightoff.DXFloatContainer;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.p;
import com.taobao.android.dinamicx.DXRootView;
import tb.ezh;

/* loaded from: classes5.dex */
public class iol implements ezh.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ezh f29189a;
    public final /* synthetic */ int b;
    public final /* synthetic */ iok c;

    public iol(iok iokVar, ezh ezhVar, int i) {
        this.c = iokVar;
        this.f29189a = ezhVar;
        this.b = i;
    }

    @Override // tb.ezh.c
    public void a(ezi eziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d65404", new Object[]{this, eziVar});
            return;
        }
        i.a("LightOffLayerManger", "loadTemplates onSuccess:" + eziVar.a());
        iok iokVar = this.c;
        ezh ezhVar = this.f29189a;
        JSONObject e = iok.$ipChange.e();
        iok iokVar2 = this.c;
        int i = iok.$ipChange;
        iok iokVar3 = this.c;
        iok.a(iokVar, p.a(ezhVar, e, eziVar, i, iok.$ipChange));
        iok iokVar4 = this.c;
        if (!(iok.$ipChange instanceof DXRootView)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = this.b;
        DXFloatContainer a2 = iok.a(this.c);
        iok iokVar5 = this.c;
        a2.addView(iok.$ipChange, layoutParams);
        ezh ezhVar2 = this.f29189a;
        iok iokVar6 = this.c;
        ezhVar2.a((DXRootView) iok.$ipChange);
    }

    @Override // tb.ezh.c
    public void a(ezi eziVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd804ce", new Object[]{this, eziVar, str});
            return;
        }
        i.a("LightOffLayerManger", "loadTemplates onFailure:" + str + " info:" + eziVar.a());
    }
}
