package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.dinamic3.RecommendDxUserContext;
import com.taobao.tao.Globals;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class sdh extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_INFOFLOWCARDWIDTH = -8936854687533104177L;

    static {
        kge.a(449075860);
    }

    public static /* synthetic */ Object ipc$super(sdh sdhVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.D() == null) {
            return Integer.valueOf(gbg.b(Globals.getApplication(), 171.0f));
        }
        Context m = dXRuntimeContext.m();
        DinamicXEngine D = dXRuntimeContext.D();
        int a2 = sdi.a(D);
        if (a2 != -1) {
            return Integer.valueOf(a2);
        }
        osm a3 = a(dXRuntimeContext.b());
        if (a3 == null) {
            e.e("DXDataParserInfoFlowCardWidthAfterBuy", "can't get container");
            return Integer.valueOf(gbg.a(D, m, 171.0f));
        }
        int a4 = h.a().a(m);
        int q = a3.q();
        if (q > 0) {
            a4 = q;
        }
        JSONObject e = dXRuntimeContext.e();
        int a5 = (e == null || (jSONObject = e.getJSONObject("ext")) == null) ? 0 : gbg.a(D, m, jSONObject.getIntValue("marginSide") / 2);
        int p = a3.p();
        if (p <= 0) {
            e.e("DXDataParserInfoFlowCardWidthAfterBuy", "column error");
            return Integer.valueOf(gbg.a(D, m, 171.0f));
        }
        int a6 = gbg.a(D, m, a(a3) / 2);
        if (a6 <= 0) {
            return Integer.valueOf(gbg.a(D, m, 171.0f));
        }
        int max = Math.max(Math.round(((a4 - (a5 << 1)) - ((p - 1) * a6)) / p), 0);
        sdi.a(D, max);
        e.e("DXDataParserInfoFlowCardWidthAfterBuy", "info flow card width: " + max + " screenWidth: " + a4 + " marginSide: " + a5 + " column: " + p + " space: " + a6);
        return Integer.valueOf(max);
    }

    private osm a(ba baVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osm) ipChange.ipc$dispatch("99274278", new Object[]{this, baVar});
        }
        if (!(baVar instanceof RecommendDxUserContext)) {
            return null;
        }
        Object object = ((RecommendDxUserContext) baVar).getObject(osp.RMD_CONTAINER);
        if (!(object instanceof WeakReference)) {
            return null;
        }
        Object obj = ((WeakReference) object).get();
        if (obj instanceof osm) {
            return (osm) obj;
        }
        return null;
    }

    private int a(osm osmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f885f722", new Object[]{this, osmVar})).intValue();
        }
        JSONObject t = osmVar.t();
        if (t == null) {
            return 0;
        }
        try {
            return t.getIntValue("cardSpace");
        } catch (Exception unused) {
            return 0;
        }
    }
}
