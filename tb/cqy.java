package tb;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.nn.NetConfig;
import com.etao.feimagesearch.nn.b;
import com.etao.feimagesearch.nn.f;
import com.etao.feimagesearch.nn.optimize.OptimizeOutput;
import com.etao.feimagesearch.nn.optimize.a;
import com.etao.feimagesearch.util.f;
import com.taobao.android.searchbaseframe.util.k;
import tb.cre;

/* loaded from: classes3.dex */
public class cqy extends b<a, OptimizeOutput> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public cre b;
    private com.etao.feimagesearch.mnn.utils.b c;

    static {
        kge.a(-820116298);
    }

    public static /* synthetic */ Object ipc$super(cqy cqyVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public cqy(NetConfig netConfig) {
        super(netConfig);
        this.c = new com.etao.feimagesearch.mnn.utils.b();
    }

    @Override // com.etao.feimagesearch.nn.k
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.b = new cre(com.etao.feimagesearch.config.b.a(false));
        boolean a2 = this.b.a();
        com.etao.feimagesearch.mnn.utils.a.b(this.f6888a, System.currentTimeMillis() - currentTimeMillis);
        String str = com.etao.feimagesearch.structure.capture.a.f6987a;
        String utEventName = BaseMnnRunUnit.Companion.AlgoAction.INIT_ACTION.getUtEventName();
        String[] strArr = new String[10];
        strArr[0] = BaseMnnRunUnit.KEY_TASK_NAME;
        strArr[1] = this.b.k();
        strArr[2] = BaseMnnRunUnit.KEY_TASK_CID;
        strArr[3] = "1.0";
        strArr[4] = "result";
        strArr[5] = a2 ? "success" : "fail";
        strArr[6] = "extraInfo";
        strArr[7] = "";
        strArr[8] = "curTab";
        strArr[9] = f.Companion.a().a() + "";
        coy.a(str, utEventName, 19999, strArr);
        return a2;
    }

    @Override // com.etao.feimagesearch.nn.k
    public OptimizeOutput a(a aVar, Object obj) {
        OptimizeOutput a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OptimizeOutput) ipChange.ipc$dispatch("a5034d85", new Object[]{this, aVar, obj});
        }
        if (this.b == null) {
            return null;
        }
        Bitmap a3 = ((f.b) com.etao.feimagesearch.util.f.a(aVar.f6920a, aVar.c, aVar.d, aVar.v, aVar.b)).b(aVar.e, aVar.f).a();
        k.f(" 自动识别", "图像尺寸: width=" + a3.getWidth() + " - height=" + a3.getHeight(), new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        this.c.f();
        cre.b a4 = this.b.a(a3);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        this.c.a(currentTimeMillis2);
        if (a4 != null && (!aVar.t || a(a4, a3.getWidth(), a3.getHeight()))) {
            this.c.a(true);
            a2 = OptimizeOutput.a(a4.a(), a4.f26465a, a3, currentTimeMillis2, null);
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "objectDetected", 19999, BaseMnnRunUnit.KEY_TASK_NAME, this.b.k());
            cot.a("AutoDetect", "objectDetected", "taskName: " + this.b.k());
        } else {
            this.c.a(false);
            a2 = OptimizeOutput.a(null, null, null, currentTimeMillis2, null);
        }
        this.c.a("{}");
        d();
        return a2;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.c.d() >= 1000) {
        } else {
            com.etao.feimagesearch.mnn.utils.a.a(this.c);
        }
    }

    private boolean a(cre.b bVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21c458a8", new Object[]{this, bVar, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (com.etao.feimagesearch.config.b.C() || bVar == null || bVar.a() == null || bVar.a().isEmpty()) {
            return true;
        }
        float B = com.etao.feimagesearch.config.b.B();
        RectF rectF = new RectF();
        float f = i;
        float f2 = f / 2.0f;
        float f3 = B / 2.0f;
        float f4 = f3 * f;
        rectF.left = f2 - f4;
        rectF.right = f2 + f4;
        float f5 = i2;
        float f6 = f5 / 2.0f;
        float f7 = f3 * f5;
        rectF.top = f6 - f7;
        rectF.bottom = f6 + f7;
        boolean z = false;
        for (RectF rectF2 : bVar.a()) {
            z = rectF.contains((int) (((rectF2.left * f) + (rectF2.right * f)) / 2.0f), (int) (((rectF2.top * f5) + (rectF2.bottom * f5)) / 2.0f));
            if (z) {
                break;
            }
        }
        k.f("自动识别", "主体是否符合在屏幕中心区域:" + z, new Object[0]);
        return z;
    }

    @Override // com.etao.feimagesearch.nn.k
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, BaseMnnRunUnit.Companion.AlgoAction.DESTROY_ACTION.getUtEventName(), 19999, BaseMnnRunUnit.KEY_TASK_NAME, this.b.k(), BaseMnnRunUnit.KEY_TASK_CID, "1.0", "result", "success", "extraInfo", "");
            this.b.f();
        } catch (Exception unused) {
        }
    }
}
