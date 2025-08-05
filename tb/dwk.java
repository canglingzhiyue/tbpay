package tb;

import android.widget.LinearLayout;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.s;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.widget.AliDetailAuraRecyclerView;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;

/* loaded from: classes4.dex */
public class dwk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final dxu f27034a;
    private final dxs b;
    private final dwj c;

    static {
        kge.a(1674241031);
    }

    public dwk(DetailCoreActivity detailCoreActivity, IAURAPluginCenter[] iAURAPluginCenterArr, dwj dwjVar) {
        this.c = dwjVar;
        this.f27034a = new dxt(detailCoreActivity, iAURAPluginCenterArr, dwjVar);
        this.b = new dxs(detailCoreActivity, iAURAPluginCenterArr, dwjVar);
        emu.a("com.taobao.android.detail.core.aura.AliDetailAuraController");
    }

    public dwj a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dwj) ipChange.ipc$dispatch("f03e5c7", new Object[]{this}) : this.c;
    }

    public LinearLayout b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("e3daedc0", new Object[]{this}) : (LinearLayout) this.b.b();
    }

    public AliDetailAuraRecyclerView c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliDetailAuraRecyclerView) ipChange.ipc$dispatch("85e16e49", new Object[]{this}) : (AliDetailAuraRecyclerView) this.f27034a.b();
    }

    public s d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("d4cf6bf2", new Object[]{this}) : this.f27034a.a();
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.b.b(jSONObject);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b.a(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
        if (r1.getBooleanValue("finalUltronCompare") != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091 A[Catch: Throwable -> 0x00ac, TryCatch #0 {Throwable -> 0x00ac, blocks: (B:21:0x0070, B:24:0x0091, B:27:0x009b, B:29:0x00a3), top: B:58:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dwk.e():void");
    }

    public dxw f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dxw) ipChange.ipc$dispatch("357c25f6", new Object[]{this}) : this.f27034a.e();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.f27034a.d();
        this.b.d();
        dwj dwjVar = this.c;
        if (dwjVar == null) {
            return;
        }
        dwjVar.g();
    }
}
