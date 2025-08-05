package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.aura.AURADismissFloatEvent_InputField_floatView;
import com.alibaba.android.aura.AURARaxComponentExtension_InputField_floatView;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.AURAEmptySerializable;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.render.AURARenderOutput;
import com.alibaba.android.aura.s;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public class bso implements bsm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f26106a;
    private s b;

    static {
        kge.a(-2145495661);
        kge.a(1495610614);
    }

    @Override // tb.bsm
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab49e612", new Object[]{this, aVar});
        } else {
            this.f26106a = aVar;
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
        s sVar = (s) bbc.a(map, "auraInstance", s.class, null);
        s sVar2 = this.b;
        if (sVar != sVar2 && sVar2 != null) {
            sVar2.a();
            this.b = null;
        }
        this.b = sVar;
        if (sVar == null) {
            bsnVar.a(new b(0, "NUTFloatView", "render-exception", "请设置AURAInstance参数到params中，key为：NUTFloatViewConstants.RenderParam.KEY_AURA_INSTANCE"));
            return false;
        }
        String a2 = a(map, "startPointWorkflow", (String) null);
        if (TextUtils.isEmpty(a2)) {
            bsnVar.a(new b(0, "NUTFloatView", "render-exception", "param: startPointWorkflow is empty"));
            return false;
        }
        sVar.b(new AURADismissFloatEvent_InputField_floatView(this.f26106a)).b(new AURARaxComponentExtension_InputField_floatView(this.f26106a)).a(a2, (Serializable) bbc.a(map, "startPointInputIO", Serializable.class, new AURAEmptySerializable()), new aqq() { // from class: tb.bso.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aqq
            public void a(c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    return;
                }
                Serializable b = cVar.b();
                if (b instanceof AURARenderOutput) {
                    View view = ((AURARenderOutput) b).getView();
                    if (view == null) {
                        bsnVar.a(new b(0, "NUTFloatView", "render-exception", "result view is null"));
                        return;
                    } else {
                        bsnVar.a(view);
                        return;
                    }
                }
                bsnVar.a(new b(0, "NUTFloatView", "render-exception", "illegal output, not render output: AURARenderOutput"));
            }

            @Override // tb.aqq, tb.aqs
            public void a(b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                } else {
                    bsnVar.a(bVar);
                }
            }
        });
        return true;
    }

    @Override // tb.bsm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        s sVar = this.b;
        if (sVar != null) {
            sVar.a();
            this.b = null;
        }
        this.f26106a = null;
    }
}
