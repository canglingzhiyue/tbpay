package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx_v4.loader.g;

/* loaded from: classes5.dex */
public class gez {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte DXBinaryLogicProductCategoryFlexa = 2;
    public static final byte DXBinaryLogicProductCategoryHyengine = 1;
    public static final byte DXBinaryLogicProductCategoryInvalid = -1;
    public static final byte DXBinaryLogicProductCategoryJS = 3;
    public static final byte DXBinaryLogicProductCategoryJSV400 = 0;

    /* renamed from: a  reason: collision with root package name */
    private int f28303a = 0;
    private int b;
    private String c;
    private byte d;
    private g e;

    static {
        kge.a(-336238115);
        kge.a(-202982083);
    }

    public gez(g gVar) {
        this.e = gVar;
    }

    public boolean a(fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c47e4ac", new Object[]{this, fwrVar, dXRuntimeContext})).booleanValue();
        }
        this.b = this.e.a();
        if (this.b <= 0) {
            return true;
        }
        this.f28303a = fwrVar.f();
        if (this.f28303a <= 4) {
            return true;
        }
        short e = fwrVar.e();
        this.c = new String(fwrVar.a(), fwrVar.b(), (int) e);
        fwrVar.b(e);
        this.d = fwrVar.d();
        int i = this.f28303a - ((6 + e) + 1);
        if (i > 0) {
            fwrVar.b(i);
        }
        fuw.a("读取 headerextension结束");
        return true;
    }

    public byte a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c54", new Object[]{this})).byteValue() : this.d;
    }
}
