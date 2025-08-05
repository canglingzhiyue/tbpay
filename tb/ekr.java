package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.standard.widget.anchor.PicGalleryAnchorView;
import com.taobao.android.detail.core.standard.widget.anchor.a;
import com.taobao.android.detail.core.standard.widget.anchor.b;
import com.taobao.android.detail.core.standard.widget.anchor.c;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "alidetail.impl.render.component.creator.locatorbar")
/* loaded from: classes4.dex */
public final class ekr extends atl implements a, atf, ekl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_TYPE = "locatorbar";
    private static final int e;
    private static final int f;
    private PicGalleryAnchorView k;
    private RecyclerView l;
    private AURAGlobalData m;
    private aqs n;
    private c o;
    private final String d = "AliSDetailLocatorBarComponentExtension";
    private final String g = "hideLocator";
    private final String h = "fixed";
    private final String i = "text";
    private final String j = "locator";
    private final Map<String, ekk> p = new HashMap();

    public static /* synthetic */ Object ipc$super(ekr ekrVar, String str, Object... objArr) {
        if (str.hashCode() == 563256106) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ekl
    public String F_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec7b57c0", new Object[]{this});
        }
        return null;
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : COMPONENT_TYPE;
    }

    @Override // tb.eki
    public void b(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d586e2b4", new Object[]{this, ekkVar});
        }
    }

    @Override // tb.atf
    public RecyclerView getContainerView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("a859cf93", new Object[]{this, context});
        }
        return null;
    }

    static {
        kge.a(200051109);
        kge.a(-1823923563);
        kge.a(1621565502);
        kge.a(-2099803679);
        e = bay.a(48.0f);
        f = bay.a(48.0f);
    }

    public ekr() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.render.component.AliSDetailLocatorBarComponentExtension");
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.c != null) {
            Context e2 = this.c.e();
            if (e2 instanceof DetailCoreActivity) {
                return ((DetailCoreActivity) e2).K();
            }
        }
        return false;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.o != null) {
        } else {
            this.o = g();
        }
    }

    @Override // tb.atl, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.m = aURAGlobalData;
        this.n = aqsVar;
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.k != null) {
        } else {
            this.k = (PicGalleryAnchorView) this.m.get("AliDetailMainGalleryAnchorView", PicGalleryAnchorView.class);
            if (this.k != null) {
                return;
            }
            this.k = f();
            this.m.update("AliDetailMainGalleryAnchorView", this.k);
        }
    }

    private PicGalleryAnchorView f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PicGalleryAnchorView) ipChange.ipc$dispatch("a01cc0da", new Object[]{this});
        }
        d();
        PicGalleryAnchorView picGalleryAnchorView = new PicGalleryAnchorView(this.b);
        picGalleryAnchorView.setId(R.id.standard_detail_gallery_locator_bar_anchor);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, this.o.a());
        layoutParams.gravity = 19;
        layoutParams.leftMargin = f;
        picGalleryAnchorView.setLayoutParams(layoutParams);
        picGalleryAnchorView.setAnchorListener(this);
        if (eme.b(this.b)) {
            picGalleryAnchorView.setAlpha(0.0f);
        }
        return picGalleryAnchorView;
    }

    @Override // tb.atc
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setTag(R.id.standard_detail_gallery_tag_is_locatorbar, "true");
        int b = ecr.b(this.b);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, e);
        marginLayoutParams.topMargin = b;
        frameLayout.setLayoutParams(marginLayoutParams);
        e();
        emm.a(this.k);
        frameLayout.addView(this.k);
        return frameLayout;
    }

    @Override // tb.atc
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
            return;
        }
        List<AURARenderComponent> list = aURARenderComponent.children;
        if (bau.a(list)) {
            arc.a().c("AliSDetailLocatorBarComponentExtension", "渲染头图", "没有配置锚点");
            return;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            ard a2 = arc.a();
            a2.c("AliSDetailLocatorBarComponentExtension", "渲染头图", "data of " + aURARenderComponent.key + " is null");
        } else if (a(aURARenderComponentData, view)) {
        } else {
            PicGalleryAnchorView picGalleryAnchorView = (PicGalleryAnchorView) view.findViewById(R.id.standard_detail_gallery_locator_bar_anchor);
            if (picGalleryAnchorView != null) {
                d();
                picGalleryAnchorView.bindData(this.o, a(list));
            }
            com.alibaba.android.aura.service.event.a.a(this.c.b(), aURARenderComponent, AURAEventKey.exposureItem);
        }
    }

    private boolean a(AURARenderComponentData aURARenderComponentData, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("220ee3ed", new Object[]{this, aURARenderComponentData, view})).booleanValue();
        }
        Map<String, Object> map = aURARenderComponentData.fields;
        if (map == null) {
            view.setVisibility(0);
            return false;
        }
        Object obj = map.get("hideLocator");
        if ((obj instanceof String) && "true".equalsIgnoreCase((String) obj)) {
            view.setVisibility(4);
            arc.a().a("AliSDetailLocatorBarComponentExtension", "toggleShowLocatorBar", "hide locator");
            return true;
        }
        view.setVisibility(0);
        return false;
    }

    private List<b> a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        for (AURARenderComponent aURARenderComponent : list) {
            AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
            if (aURARenderComponentData != null) {
                Map<String, Object> map = aURARenderComponentData.fields;
                if (!bau.a(map)) {
                    String str = (String) bbc.a(map, "text", String.class, null);
                    if (TextUtils.isEmpty(str)) {
                        arc.a().c("AliSDetailLocatorBarComponentExtension", "assembleAnchorModels", "title is empty");
                    } else {
                        String str2 = (String) bbc.a(map, "locator", String.class, null);
                        if (TextUtils.isEmpty(str2)) {
                            arc.a().c("AliSDetailLocatorBarComponentExtension", "assembleAnchorModels", "locatorId is empty");
                        } else {
                            Boolean bool = (Boolean) bbc.a(map, "fixed", Boolean.class, false);
                            arrayList.add(new b(str, str2, bool == null ? false : bool.booleanValue(), aURARenderComponent));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private c g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("30e9ba58", new Object[]{this}) : c.a.a(c()).a(h()).b(4).a();
    }

    private int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        return (bay.b() - ((bay.a(32.0f) * 4) + (8 * bay.a(4.0f)))) - (bay.a(10.0f) * 3);
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent});
        }
        String str = aURARenderComponent.key;
        return TextUtils.isEmpty(str) ? a() : str;
    }

    @Override // tb.eki
    public void a(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e703dc33", new Object[]{this, ekkVar});
            return;
        }
        PicGalleryAnchorView picGalleryAnchorView = this.k;
        if (picGalleryAnchorView == null || this.l == null) {
            ema.a("locatorbar#selectAnchorWhenFrameIdleViewIsNull", "mPicGalleryAnchorView or mRecyclerView is null,mPicGalleryAnchorView=" + this.k, this.n);
            return;
        }
        picGalleryAnchorView.selectAnchor(ekkVar.b());
    }

    @Override // tb.eki
    public void c(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c409e935", new Object[]{this, ekkVar});
        } else {
            this.p.put(ekkVar.b(), ekkVar);
        }
    }

    @Override // com.taobao.android.detail.core.standard.widget.anchor.a
    public void a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aaf0dc1", new Object[]{this, bVar, new Boolean(z)});
        } else if (this.l == null) {
            ema.a("locatorbar#RecyclerViewIsNull", "mRecyclerView is null", this.n);
        } else if (this.m == null) {
            ema.a("locatorbar#globalDataIsNull", "mGlobalData is null", this.n);
        } else if (!z) {
        } else {
            a(bVar);
            com.alibaba.android.aura.service.event.a.a(this.c.b(), bVar.d(), "itemClick");
        }
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd41373", new Object[]{this, bVar});
            return;
        }
        String b = bVar.b();
        if (TextUtils.isEmpty(b)) {
            ema.a("locatorbar#locatorIdIsEmpty", "locatorId is empty", this.n);
            return;
        }
        ekk ekkVar = this.p.get(b);
        if (ekkVar == null) {
            ema.a("locatorbar#cannotFindLocatormodel", "cannot find locatorModel", this.n);
            return;
        }
        AURARenderComponent g = ekkVar.g();
        if (g == null) {
            ema.a("locatorbar#cannotFindLocatorComponent", "找不到定位的锚点", this.n);
        }
        emn.a(this.l, g, (List) this.m.get("render_view_item_models", ArrayList.class));
    }

    @Override // tb.atf
    public void onContentViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1c2042", new Object[]{this, view});
        } else if (!(view instanceof RecyclerView)) {
        } else {
            this.l = (RecyclerView) view;
        }
    }
}
