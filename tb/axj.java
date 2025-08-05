package tb;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

@AURAExtensionImpl(code = "aura.impl.event.redirect.mega")
/* loaded from: classes2.dex */
public final class axj implements arx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f25670a;
    private String b;
    private AURAGlobalData c;
    private q d;

    static {
        kge.a(1786987776);
        kge.a(-1971029813);
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.arx
    public boolean a(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2d42ad8", new Object[]{this, aURAEventIO})).booleanValue();
        }
        AURAGlobalData aURAGlobalData = this.c;
        if (aURAGlobalData == null) {
            arc.a().b("AURAMegaEventRedirectExtensionImpl.handleEventRedirect:mGlobalData is null");
            return false;
        }
        alu aluVar = (alu) aURAGlobalData.get("megaAbilityAdapter", alu.class);
        if (aluVar == null) {
            arc.a().b("AURAMegaEventRedirectExtensionImpl.handleEventRedirect:adapter is null");
            return false;
        }
        String eventType = aURAEventIO.getEventType();
        if (TextUtils.isEmpty(eventType)) {
            arc.a().b("AURAMegaEventRedirectExtensionImpl.handleEventRedirect:eventType is empty");
            return false;
        }
        String[] split = eventType.split("\\.");
        if (split == null || split.length < 2) {
            arc.a().b("AURAMegaEventRedirectExtensionImpl.handleEventRedirect:eventType is invalid");
            return false;
        }
        String str = split[0];
        String str2 = split[1];
        alq alqVar = new alq();
        View a2 = a(this.f25670a, this.c, aURAEventIO.getEventModel().d());
        if (a2 != null) {
            alqVar.a(a2);
        }
        ExecuteResult a3 = aluVar.a(str, str2, alqVar, aURAEventIO.getEventModel().c(), new alo() { // from class: tb.axj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                }
            }
        });
        if (!(a3 instanceof ErrorResult)) {
            return true;
        }
        ard a4 = arc.a();
        a4.b("AURAMegaEventRedirectExtensionImpl.handleEventRedirect:result error:" + ((ErrorResult) a3).a());
        return false;
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        alu aluVar = (alu) aURAGlobalData.get("megaAbilityAdapter", alu.class);
        q qVar = this.d;
        if (qVar != null) {
            this.f25670a = qVar.e();
        }
        if (aluVar == null) {
            String str = this.b;
            if (str == null) {
                str = "aura";
            }
            alr alrVar = new alr(str, "aura");
            alrVar.a(this.f25670a);
            aURAGlobalData.update("megaAbilityAdapter", new alu(alrVar));
        }
        this.c = aURAGlobalData;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.d = qVar;
        this.b = qVar.d();
    }

    private View a(Context context, AURAGlobalData aURAGlobalData, AURARenderComponent aURARenderComponent) {
        View view;
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a776577", new Object[]{this, context, aURAGlobalData, aURARenderComponent});
        }
        View view2 = null;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.getWindow() != null) {
                view = activity.getWindow().getDecorView();
                recyclerView = (RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class);
                if (recyclerView != null || recyclerView.getLayoutManager() == null) {
                    arc.a().b("AURAMegaEventRedirectExtensionImpl.findTriggerView:recyclerView or layoutManager is null");
                    return view;
                }
                List list = (List) aURAGlobalData.get("render_view_item_models", List.class);
                if (list == null) {
                    arc.a().b("AURAMegaEventRedirectExtensionImpl.findTriggerView:renderTree is null");
                    return view;
                } else if (aURARenderComponent == null) {
                    arc.a().b("AURAMegaEventRedirectExtensionImpl.findTriggerView:component is null");
                    return view;
                } else {
                    while (true) {
                        if (i >= list.size()) {
                            break;
                        }
                        Object obj = list.get(i);
                        if ((obj instanceof AURARenderComponent) && TextUtils.equals(((AURARenderComponent) obj).key, aURARenderComponent.key)) {
                            view2 = recyclerView.getLayoutManager().findViewByPosition(i);
                            break;
                        }
                        i++;
                    }
                    return view2 == null ? view : view2;
                }
            }
        }
        view = null;
        recyclerView = (RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class);
        if (recyclerView != null) {
        }
        arc.a().b("AURAMegaEventRedirectExtensionImpl.findTriggerView:recyclerView or layoutManager is null");
        return view;
    }
}
