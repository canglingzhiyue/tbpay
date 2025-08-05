package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.datastructure.b;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.task.Coordinator;
import com.taobao.android.trade.boost.request.mtop.a;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.login4android.api.Login;
import com.taobao.tao.homepage.d;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.recommend2.RecommendChannelType;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdGatewayMsg;
import com.taobao.tao.recommend3.remote.RecommendDeleteClient;
import com.taobao.tao.recommend3.remote.RecommendDeleteParams;
import com.taobao.tao.recommend3.remote.RecommendDeleteResult;
import com.taobao.tao.recommend3.util.c;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.ArrayList;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes8.dex */
public class orz implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a<RecommendDeleteResult> f32353a;
    private SectionModel b;
    private JSONObject c;
    private orv d;

    static {
        kge.a(-736348576);
        kge.a(-1201612728);
    }

    public static /* synthetic */ orv a(orz orzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (orv) ipChange.ipc$dispatch("c7f55a52", new Object[]{orzVar}) : orzVar.d;
    }

    public static /* synthetic */ SectionModel b(orz orzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SectionModel) ipChange.ipc$dispatch("9d78c59f", new Object[]{orzVar}) : orzVar.b;
    }

    public static /* synthetic */ JSONObject c(orz orzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e693b4a3", new Object[]{orzVar}) : orzVar.c;
    }

    public orz(orv orvVar, SectionModel sectionModel, JSONObject jSONObject) {
        this.d = orvVar;
        this.b = sectionModel;
        this.c = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        View a2 = c.a(view);
        if (a2 == null) {
            return;
        }
        Object tag = a2.getTag(R.id.tag_recommend_datasource);
        String str = null;
        int i = -1;
        try {
            Object tag2 = a2.getTag(R.id.tag_recommend_containerId);
            Object tag3 = a2.getTag(R.id.tag_recommend_tabIndex);
            if (tag2 != null) {
                str = tag2.toString();
            }
            if (tag3 != null) {
                i = Integer.valueOf(tag3.toString()).intValue();
            }
        } catch (Throwable th) {
            e.a("recmd.delete", th, new String[0]);
        }
        if (str == null) {
            return;
        }
        a(tag, str, i, view);
    }

    private void a(final Object obj, final String str, final int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4288fd", new Object[]{this, obj, str, new Integer(i), view});
            return;
        }
        final String obj2 = view.getTag() == null ? null : view.getTag().toString();
        final RecommendDeleteClient recommendDeleteClient = new RecommendDeleteClient();
        this.f32353a = new a<RecommendDeleteResult>() { // from class: tb.orz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
                } else {
                    a(mtopResponse);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onSuccess(Object obj3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, obj3});
                } else {
                    a((RecommendDeleteResult) obj3);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.a
            public void onSystemFailure(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                    return;
                }
                ksp.c("RItemDeleteListener", "deleteListener.onSystemFailure");
                a(mtopResponse);
            }

            public void a(RecommendDeleteResult recommendDeleteResult) {
                b bVar;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fc92e744", new Object[]{this, recommendDeleteResult});
                    return;
                }
                ksp.a("RItemDeleteListener", "deleteListener.onSuccess");
                orz.a(orz.this).a();
                Object obj3 = obj;
                if (obj3 instanceof osd) {
                    osd osdVar = (osd) obj3;
                    if (recommendDeleteResult.sections == null || recommendDeleteResult.sections.size() == 0) {
                        osdVar.d(orz.b(orz.this));
                        return;
                    }
                    orz.b(orz.this);
                    recommendDeleteResult.sections.get(0);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("containerId", (Object) str);
                jSONObject.put("deleteModel", (Object) orz.b(orz.this));
                if (oqc.b(str)) {
                    jSONObject.put("containers", (Object) new String[]{str});
                    bVar = new b("DeleteOperation", oqc.e, jSONObject);
                } else {
                    bVar = new b("DeleteOperation", opb.f, jSONObject);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(bVar);
                RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
                if (message == null) {
                    return;
                }
                d.b(str).a(message);
            }

            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    return;
                }
                ksp.c("RItemDeleteListener", "deleteListener.onFailure");
                orz.a(orz.this).a();
                orz.this.a();
            }
        };
        Coordinator.execute(new Runnable() { // from class: tb.orz.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                JSONObject jSONObject = orz.b(orz.this).getJSONObject("template");
                JSONObject jSONObject2 = orz.c(orz.this).getJSONObject("ext");
                JSONObject jSONObject3 = orz.c(orz.this).getJSONObject("args");
                RecommendDeleteClient recommendDeleteClient2 = recommendDeleteClient;
                String str2 = null;
                RecommendDeleteParams.a d = new RecommendDeleteParams.a().b(jSONObject2 != null ? jSONObject2.getString("deleteId") : null).c(jSONObject2 != null ? jSONObject2.getString(aw.PARAM_SEARCH_KEYWORD_POS) : null).a(Login.getOldUserId()).a(i).d(jSONObject3 != null ? jSONObject3.getString(aw.PARAM_PVID) : null);
                if (jSONObject != null) {
                    str2 = jSONObject.getString("name");
                }
                recommendDeleteClient2.execute(d.e(str2).h(obj2).g(c.j(RecommendChannelType.HOMEPAGE_R4U.getRequestStr())).a(), orz.this.f32353a, TaoHelper.getTTID());
            }
        });
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            TBToast.makeText(g.a(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16169), 2000L).show();
        } catch (Exception unused) {
        }
    }
}
