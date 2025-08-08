package tb;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderOutput;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.alibaba.android.aura.s;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.detail.core.aura.presenter.a;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.standard.lightoff.g;
import com.taobao.android.detail.core.standard.mainscreen.interaction.b;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.android.detail.core.standard.video.d;
import com.taobao.android.detail.core.standard.video.j;
import com.taobao.android.detail.core.standard.widget.overpull.AURAOverPullContainerLayout;
import com.taobao.android.detail.core.utils.i;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class elq extends a implements elp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AURA_CONFIG = "aura/aura_detail_main_pic.json";
    private final String b;
    private final Map<String, Object> c;
    private d d;
    private com.taobao.android.detail.core.standard.lightoff.a e;
    private final AtomicReference<MultiTreeNode> f;
    private JSONObject g;
    private JSONObject h;
    private View i;
    private Context j;
    private boolean k;
    private boolean l;

    static {
        kge.a(-2002321233);
        kge.a(-538680299);
        kge.a(724356649);
    }

    public static /* synthetic */ Object ipc$super(elq elqVar, String str, Object... objArr) {
        if (str.hashCode() == 93762283) {
            super.d();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dxu
    public s a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("3c3eac55", new Object[]{this});
        }
        return null;
    }

    @Override // tb.dxu
    public void a(UMFRuleIO uMFRuleIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2724f84e", new Object[]{this, uMFRuleIO});
        }
    }

    @Override // tb.dxu
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.dxu
    public dxw e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dxw) ipChange.ipc$dispatch("2dca8097", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ void a(elq elqVar, c cVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d135fd", new Object[]{elqVar, cVar, view});
        } else {
            elqVar.a(cVar, view);
        }
    }

    public elq(Context context, String str, Map<String, Object> map) {
        super(context);
        this.f = new AtomicReference<>();
        this.k = true;
        this.l = false;
        if (!(context instanceof Activity)) {
            throw new IllegalArgumentException("context must be Activity");
        }
        this.j = context;
        this.b = str;
        this.c = map;
        Activity activity = (Activity) context;
        this.d = new j(activity);
        this.d.a(a(activity));
        this.e = new g(context, this.b);
        b.a(this.b);
        emu.a("com.taobao.android.detail.core.standard.mainscreen.render.component.PicGalleryAuraPresenter");
    }

    @Override // com.taobao.android.detail.core.aura.presenter.a
    public AURAPluginContainerNodeModel c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("30794f2c", new Object[]{this});
        }
        Context context = this.j;
        return com.taobao.android.detail.core.aura.utils.b.b(context, ((DetailCoreActivity) context).aV());
    }

    @Override // com.taobao.android.detail.core.aura.presenter.a
    public Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("AliDetailPicGalleryVideoManager", this.d);
        hashMap.put("AliDetailPicGalleryLightOffManager", this.e);
        Map<String, Object> map = this.c;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    @Override // tb.dxu
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.i;
    }

    @Override // com.taobao.android.detail.core.aura.presenter.a, tb.dxu
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        d dVar = this.d;
        if (dVar != null) {
            dVar.b();
            this.d = null;
        }
        com.taobao.android.detail.core.standard.lightoff.a aVar = this.e;
        if (aVar != null) {
            aVar.d();
            this.e = null;
        }
        b.c(this.b);
    }

    public void a(AURARenderComponent aURARenderComponent, final View view, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b690fc6c", new Object[]{this, aURARenderComponent, view, aqsVar});
            return;
        }
        i.d(com.taobao.android.detail.core.performance.j.a("PicGalleryAuraPresenter"), "buildPage start");
        JSONObject jSONObject = aURARenderComponent.protocol;
        if (jSONObject == null) {
            ema.a("abort#headerPicProtocolIsEmpty", "头图协议为空", aqsVar);
            com.taobao.android.detail.core.aura.utils.c.a(this.j);
            i.d(com.taobao.android.detail.core.performance.j.a("PicGalleryAuraPresenter"), "buildPage 头图降级1");
            return;
        }
        JSONObject a2 = a(jSONObject, aqsVar);
        if (a2 == null) {
            ema.b("abort#headerPicCannotShiftRoot", "shift header pic protocol error,  cannot shift to root key mainPicProtocol:" + a2, aqsVar);
            com.taobao.android.detail.core.aura.utils.c.a(this.j);
            i.d(com.taobao.android.detail.core.performance.j.a("PicGalleryAuraPresenter"), "buildPage 头图降级2");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.alibaba.android.aura.datamodel.parse.a(a2));
        a("tbdetail.workflow.mainpic", new AURAParseIO(arrayList), new aqq<AURARenderOutput>() { // from class: tb.elq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 90991720) {
                    super.a();
                    return null;
                } else if (hashCode == 112764847) {
                    super.a((c) objArr[0]);
                    return null;
                } else if (hashCode != 744952192) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.a((com.alibaba.android.aura.b) objArr[0]);
                    return null;
                }
            }

            @Override // tb.aqq
            public void a(c<AURARenderOutput> cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    return;
                }
                super.a(cVar);
                elq.a(elq.this, cVar, view);
                i.d(com.taobao.android.detail.core.performance.j.a("PicGalleryAuraPresenter"), "buildPage aura callback onNext");
            }

            @Override // tb.aqq, tb.aqs
            public void a(com.alibaba.android.aura.b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    return;
                }
                super.a(bVar);
                ard a3 = arc.a();
                a3.c("PicGalleryAuraPresenter", "onError", ag.ARG_TAOKE_ERROR + bVar.b());
                String a4 = com.taobao.android.detail.core.performance.j.a("PicGalleryAuraPresenter");
                i.d(a4, "buildPage aura callback onError=" + bVar);
            }

            @Override // tb.aqq
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                super.a();
                i.d(com.taobao.android.detail.core.performance.j.a("PicGalleryAuraPresenter"), "buildPage aura callback onNext onCompleted");
            }
        });
        i.d(com.taobao.android.detail.core.performance.j.a("PicGalleryAuraPresenter"), "buildPage aura executeFlow end");
        i.d(com.taobao.android.detail.core.performance.j.a("PicGalleryAuraPresenter"), "buildPage end");
    }

    public d h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("d455837d", new Object[]{this}) : this.d;
    }

    public com.taobao.android.detail.core.standard.lightoff.a i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.standard.lightoff.a) ipChange.ipc$dispatch("25ee61bd", new Object[]{this}) : this.e;
    }

    public JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2185e711", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = this.g;
        if (jSONObject2 != null) {
            jSONObject.put("light_off_server_data", (Object) jSONObject2);
        }
        m();
        JSONObject jSONObject3 = this.h;
        if (jSONObject3 != null) {
            jSONObject.put("light_off_local_data", (Object) jSONObject3);
        }
        return jSONObject;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        try {
            String string = this.h.getString(ThemisConfig.SCENE_SELECT);
            for (Map.Entry<String, Object> entry : this.g.getJSONObject("data").entrySet()) {
                JSONObject jSONObject = (JSONObject) entry.getValue();
                if (string.equals(jSONObject.getString("id"))) {
                    return jSONObject.getJSONObject("fields").getString("url");
                }
            }
            return null;
        } catch (Exception e) {
            ard a2 = arc.a();
            a2.b("PicGallery getSelectPicUrl exception:" + e.getMessage());
            return null;
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            this.g = null;
        }
        this.g = bst.a(jSONObject, "lightoffpage");
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        this.h = new JSONObject();
        if (jSONObject != null && jSONObject.containsKey(ThemisConfig.SCENE_SELECT)) {
            this.h.put(ThemisConfig.SCENE_SELECT, (Object) jSONObject.getString(ThemisConfig.SCENE_SELECT));
        }
        m();
    }

    public boolean l() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject4 = this.g;
        return jSONObject4 != null && !jSONObject4.isEmpty() && (jSONObject = this.g.getJSONObject("data")) != null && !jSONObject.isEmpty() && (jSONObject2 = this.g.getJSONObject("hierarchy")) != null && !jSONObject2.isEmpty() && !StringUtils.isEmpty(jSONObject2.getString("root")) && (jSONObject3 = jSONObject2.getJSONObject("structure")) != null && !jSONObject3.isEmpty();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        if (this.h == null) {
            this.h = new JSONObject();
        }
        List<AbsPicGalleryVideoPlayer> a2 = this.d.a();
        if (a2 == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        this.h.put("videoInfo", (Object) jSONArray);
        for (AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer : a2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("videoId", (Object) absPicGalleryVideoPlayer.n().a());
            jSONObject.put("videoProgress", (Object) String.valueOf(absPicGalleryVideoPlayer.q()));
            jSONObject.put(iyx.PARAM_VIDEO_AUTO_PLAY, (Object) String.valueOf(StringUtils.equals(absPicGalleryVideoPlayer.p(), AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PAUSING)));
            jSONObject.put("videoMute", (Object) "false");
            jSONArray.add(jSONObject);
        }
    }

    private ViewGroup a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("7373231b", new Object[]{this, activity});
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.topMargin = bay.a(220.0f);
        ((RelativeLayout) activity.findViewById(R.id.pagegroup)).addView(frameLayout, layoutParams);
        return frameLayout;
    }

    private JSONObject a(JSONObject jSONObject, aqs aqsVar) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24702ff5", new Object[]{this, jSONObject, aqsVar});
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("hierarchy");
        if (jSONObject3 == null) {
            return null;
        }
        String string = jSONObject3.getString("root");
        if (StringUtils.isEmpty(string) || (jSONObject2 = jSONObject3.getJSONObject("structure")) == null || (jSONArray = jSONObject2.getJSONArray(string)) == null || jSONArray.isEmpty()) {
            return null;
        }
        return bst.a(jSONObject, jSONArray.getString(0));
    }

    private void a(c<AURARenderOutput> cVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22803cc3", new Object[]{this, cVar, view});
        } else if (!(view instanceof AURAOverPullContainerLayout)) {
            arc.a().c("PicGalleryAuraPresenter", "onNext", "containerView must be AliSDetailLoadMoreContainerLayout");
        } else {
            this.i = cVar.b().getView();
            View view2 = this.i;
            if (!(view2 instanceof RecyclerView)) {
                arc.a().c("PicGalleryAuraPresenter", "onNext", "contentView is not RecyclerView");
            } else if (view != view2.getParent()) {
                ((AURAOverPullContainerLayout) view).setContentView((RecyclerView) this.i);
                MultiTreeNode multiTreeNode = (MultiTreeNode) cVar.c().get("global_data_render_root", MultiTreeNode.class);
                AtomicReference<MultiTreeNode> atomicReference = this.f;
                if (atomicReference != null) {
                    atomicReference.set(multiTreeNode);
                }
                if (multiTreeNode == null && multiTreeNode.subtrees() == null) {
                    return;
                }
                for (TreeNode<RenderComponent> treeNode : multiTreeNode.subtrees()) {
                    if (treeNode != null && treeNode.data() != null && treeNode.data().component != null) {
                        Component component = treeNode.data().component;
                        if (StringUtils.equals(treeNode.data().key, "lightoffpage")) {
                            if (component.fields == null || !(component.fields.get("url") instanceof String)) {
                                return;
                            }
                            this.e.a((String) component.fields.get("url"));
                            return;
                        }
                    }
                }
            }
        }
    }
}
