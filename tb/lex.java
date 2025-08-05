package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* loaded from: classes.dex */
public class lex extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_SCROLLEXPOSE = -4629410644348754929L;

    static {
        kge.a(1913575234);
    }

    public static /* synthetic */ Object ipc$super(lex lexVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(lex lexVar, BaseSectionModel baseSectionModel, JSONObject jSONObject, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24655e2f", new Object[]{lexVar, baseSectionModel, jSONObject, new Float(f), new Float(f2)});
        } else {
            lexVar.a(baseSectionModel, jSONObject, f, f2);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DinamicXEngine D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (!a(objArr, dXRuntimeContext)) {
        } else {
            final BaseSectionModel<?> b = lfq.b(dXRuntimeContext);
            if (b == null) {
                ldf.d("DXScrollExposeEventHandler", "cardSection is null");
                return;
            }
            final JSONObject jSONObject = (JSONObject) objArr[0];
            float a2 = a((String) objArr[1]);
            float b2 = b((String) objArr[2]);
            Context m = dXRuntimeContext.m();
            final float a3 = gbg.a(dXRuntimeContext.D(), m, a2);
            final float a4 = a(dXEvent, dXRuntimeContext, gbg.a(D, m, b2));
            ljd.a().d(new Runnable() { // from class: tb.lex.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lex.a(lex.this, b, jSONObject, a4, a3);
                    }
                }
            });
        }
    }

    private float a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext, float f) {
        int measuredWidth;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75aa1df5", new Object[]{this, dXEvent, dXRuntimeContext, new Float(f)})).floatValue();
        }
        float f2 = 0.0f;
        if (dXEvent instanceof DXScrollEvent) {
            DXScrollEvent dXScrollEvent = (DXScrollEvent) dXEvent;
            measuredWidth = dXScrollEvent.getScrollerSize().f11827a + dXScrollEvent.getOffsetX();
        } else {
            if (dXEvent instanceof DXViewEvent) {
                measuredWidth = dXRuntimeContext.d().getMeasuredWidth();
            }
            return f2 - f;
        }
        f2 = measuredWidth;
        return f2 - f;
    }

    private float a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c22", new Object[]{this, str})).floatValue();
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception e) {
            ldf.d("DXScrollExposeEventHandler", "getItemWidth failed: " + e);
            return 0.0f;
        }
    }

    private float b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e563", new Object[]{this, str})).floatValue();
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception e) {
            ldf.d("DXScrollExposeEventHandler", "getItemWidth failed: " + e);
            return 0.0f;
        }
    }

    private boolean a(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad925d7e", new Object[]{this, objArr, dXRuntimeContext})).booleanValue();
        }
        if (objArr == null) {
            ldf.d("DXScrollExposeEventHandler", "args == null");
            return false;
        } else if (objArr.length < 3) {
            ldf.d("DXScrollExposeEventHandler", "args.length < 3");
            return false;
        } else if (!(objArr[0] instanceof JSONObject) || !(objArr[1] instanceof String) || !(objArr[2] instanceof String)) {
            ldf.d("DXScrollExposeEventHandler", "参数不符合格式");
            return false;
        } else if (dXRuntimeContext != null) {
            return dXRuntimeContext.m() != null;
        } else {
            ldf.d("DXScrollExposeEventHandler", "runtimeContext == null");
            return false;
        }
    }

    private void a(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d0f2b40", new Object[]{this, baseSectionModel, jSONObject, new Float(f), new Float(f2)});
        } else if (f2 > 0.0f) {
            int ceil = (int) Math.ceil(f / f2);
            for (int i = 0; i < ceil; i++) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(i));
                if (jSONObject2 != null) {
                    BaseSectionModel createBaseSectionModel = baseSectionModel.createBaseSectionModel(jSONObject2);
                    ljh.b(baseSectionModel, (BaseSectionModel<?>) createBaseSectionModel);
                    ljh.a((BaseSectionModel<?>) createBaseSectionModel, (JSONObject) null);
                    if (lcz.b()) {
                        ldf.a("DXScrollExposeEventHandler", "expose position = " + i);
                    }
                }
            }
        }
    }
}
