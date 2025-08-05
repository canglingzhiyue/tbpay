package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.trade.boost.request.mtop.a;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request.InfoFlowDeleteClient;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request.InfoFlowDeleteParams;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request.InfoFlowDeleteResult;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taolive.room.utils.aw;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes7.dex */
public class lpz implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BaseSectionModel f30810a;
    private BaseSectionModel b;
    private ljs c;

    static {
        kge.a(-820450595);
        kge.a(-1201612728);
    }

    public static /* synthetic */ void a(lpz lpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3430fa2", new Object[]{lpzVar});
        } else {
            lpzVar.d();
        }
    }

    public static /* synthetic */ void b(lpz lpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c61623", new Object[]{lpzVar});
        } else {
            lpzVar.b();
        }
    }

    public static /* synthetic */ void c(lpz lpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0491ca4", new Object[]{lpzVar});
        } else {
            lpzVar.c();
        }
    }

    public static /* synthetic */ BaseSectionModel d(lpz lpzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseSectionModel) ipChange.ipc$dispatch("93e65f99", new Object[]{lpzVar}) : lpzVar.f30810a;
    }

    public static /* synthetic */ BaseSectionModel e(lpz lpzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseSectionModel) ipChange.ipc$dispatch("71d9c578", new Object[]{lpzVar}) : lpzVar.b;
    }

    public lpz(ljs ljsVar, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
        this.f30810a = baseSectionModel;
        this.b = baseSectionModel2;
        this.c = ljsVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            a(a());
        }
    }

    private a<InfoFlowDeleteResult> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b9fe3a75", new Object[]{this}) : new a<InfoFlowDeleteResult>() { // from class: tb.lpz.1
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
            public /* synthetic */ void onSuccess(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                } else {
                    a((InfoFlowDeleteResult) obj);
                }
            }

            public void a(InfoFlowDeleteResult infoFlowDeleteResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2aa73890", new Object[]{this, infoFlowDeleteResult});
                } else {
                    lpz.a(lpz.this);
                }
            }

            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    return;
                }
                lpz.b(lpz.this);
                lpz.c(lpz.this);
            }

            @Override // com.taobao.android.trade.boost.request.mtop.a
            public void onSystemFailure(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                    return;
                }
                ldf.d("RItemDeleteListener", "deleteListener.onSystemFailure");
                a(mtopResponse);
            }
        };
    }

    private void a(final a<InfoFlowDeleteResult> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75dc01f5", new Object[]{this, aVar});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.lpz.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = lpz.d(lpz.this).getJSONObject("template");
                    JSONObject jSONObject2 = lpz.e(lpz.this).getJSONObject("ext");
                    JSONObject jSONObject3 = lpz.d(lpz.this).getJSONObject("args");
                    if (jSONObject2 == null || jSONObject3 == null) {
                        return;
                    }
                    new InfoFlowDeleteClient().execute(new InfoFlowDeleteParams.a().b(jSONObject2.getString("deleteId")).c(lpz.d(lpz.this).getString("index")).a(Login.getOldUserId()).d(jSONObject3.getString(aw.PARAM_PVID)).e(jSONObject == null ? null : jSONObject.getString("name")).a(), aVar, TaoHelper.getTTID());
                }
            });
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ICardOverlayService iCardOverlayService = (ICardOverlayService) this.c.a(ICardOverlayService.class);
        if (iCardOverlayService == null) {
            return;
        }
        iCardOverlayService.hideOverlay();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            TBToast.makeText(Globals.getApplication(), "网络不好，删除失败了\n/(ㄒoㄒ)/", 2000L).show();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ICardOverlayService iCardOverlayService = (ICardOverlayService) this.c.a(ICardOverlayService.class);
        if (iCardOverlayService == null) {
            return;
        }
        iCardOverlayService.deleteOverlayHostCard(this.b);
    }
}
