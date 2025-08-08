package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.o;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.android.umf.datamodel.service.render.UMFRenderOutput;
import com.alibaba.android.umf.e;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public class bsp implements bsm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f26108a;
    private final String b = "NUTFloatContentUMFRender";
    private e c;

    static {
        kge.a(-38235158);
        kge.a(1495610614);
    }

    @Override // tb.bsm
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab49e612", new Object[]{this, aVar});
        } else {
            this.f26108a = aVar;
        }
    }

    private String a(Map<String, Object> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("696f900f", new Object[]{this, map, str, str2});
        }
        if (map == null) {
            return str2;
        }
        Object obj = map.get(str);
        return !(obj instanceof String) ? str2 : (String) obj;
    }

    @Override // tb.bsm
    public boolean a(Context context, Map<String, Object> map, final bsn bsnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5c61d3c", new Object[]{this, context, map, bsnVar})).booleanValue();
        }
        e eVar = (e) bbc.a(map, "umfInstance", e.class, null);
        e eVar2 = this.c;
        if (eVar != eVar2 && eVar2 != null) {
            this.c = null;
        }
        this.c = eVar;
        if (eVar == null) {
            bsnVar.a(new b(0, "NUTFloatView", "render-exception", "请设置UMFInstance参数到params中，key为：NUTFloatViewConstants.RenderParam.KEY_UMF_INSTANCE"));
            return false;
        } else if (StringUtils.isEmpty(a(map, "startPointWorkflow", (String) null))) {
            bsnVar.a(new b(0, "NUTFloatView", "render-exception", "param: startPointWorkflow is empty"));
            return false;
        } else {
            if (((UMFBaseIO) bbc.a(map, "startPointInputIO", UMFBaseIO.class, null)) == null) {
                new UMFBaseIO();
            }
            final com.alibaba.android.umf.datamodel.b bVar = (com.alibaba.android.umf.datamodel.b) bbc.a(map, o.a.KEY_USER_CONTEXT_UMF_RUNTIME_CONTEXT, com.alibaba.android.umf.datamodel.b.class, new com.alibaba.android.umf.datamodel.b());
            bVar.a("nutFloatView", this.f26108a);
            bVar.a(eVar);
            new bpx<UMFBaseIO>() { // from class: tb.bsp.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bpy
                public void a(UMFBaseIO uMFBaseIO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ce3697e6", new Object[]{this, uMFBaseIO});
                    } else if (uMFBaseIO instanceof UMFRenderOutput) {
                        Map<String, View> views = ((UMFRenderOutput) uMFBaseIO).getViews();
                        if (views != null && !views.isEmpty()) {
                            View view = null;
                            for (Map.Entry<String, View> entry : views.entrySet()) {
                                view = entry.getValue();
                            }
                            bsnVar.a(view);
                            return;
                        }
                        bqe.a().c("NUTFloatContentUMFRender", "add failed, view is null");
                        bsnVar.a(new b(0, "NUTFloatView", "render-exception", "add failed, view is null"));
                        bsu.a(bVar.d(), "DX_FLOAT_VIEW_COMMON_EXCEPTION", "umf", "add failed, view is null");
                    } else {
                        bqe.a().c("NUTFloatContentUMFRender", "add failed, not render output");
                        bsnVar.a(new b(0, "NUTFloatView", "render-exception", "illegal output, not render output"));
                        bsu.a(bVar.d(), "DX_FLOAT_VIEW_COMMON_EXCEPTION", "umf", "illegal output, not render output");
                    }
                }

                @Override // tb.bpy
                public void a(com.alibaba.android.umf.datamodel.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1a35b70a", new Object[]{this, aVar});
                        return;
                    }
                    bqe.a().c("MainActivity", aVar.toString());
                    bsnVar.a(new b(1, "NUTFloatView", "render-exception", aVar.toString()));
                    bsu.a(bVar.d(), "DX_FLOAT_VIEW_COMMON_EXCEPTION", "umf", aVar.a());
                }
            };
            return true;
        }
    }

    @Override // tb.bsm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c == null) {
        } else {
            this.c = null;
        }
    }
}
