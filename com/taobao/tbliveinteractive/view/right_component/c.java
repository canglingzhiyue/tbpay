package com.taobao.tbliveinteractive.view.right_component;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.tbliveinteractive.InteractiveComponent;
import com.taobao.tbliveinteractive.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import tb.ddv;
import tb.ddw;
import tb.fpr;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.qmv;
import tb.qmz;
import tb.qne;
import tb.qnh;
import tb.qni;

/* loaded from: classes8.dex */
public class c implements com.taobao.tbliveinteractive.view.right_component.a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RightComponent";

    /* renamed from: a  reason: collision with root package name */
    private Context f22174a;
    private e b;
    private com.taobao.tbliveinteractive.b c;
    private final String d;
    private View e;
    private boolean f;
    private RecyclerView h;
    private FrameLayout i;
    private LinearLayoutManager j;
    private a k;
    private b n;
    private com.taobao.tbliveinteractive.c o;
    private View p;
    private com.taobao.alilive.aliliveframework.frame.a q;
    private int r = -1;
    private ArrayList<InteractiveComponent> l = new ArrayList<>();
    private HashSet<InteractiveComponent> m = new HashSet<>();
    private final int g = qne.c();

    static {
        kge.a(2045351618);
        kge.a(191318335);
        kge.a(1039350886);
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : e.EVENTCENTER_BIZCODE;
    }

    public static /* synthetic */ RecyclerView a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("47eb0369", new Object[]{cVar}) : cVar.h;
    }

    public static /* synthetic */ Context b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("8bdb2912", new Object[]{cVar}) : cVar.f22174a;
    }

    public static /* synthetic */ e c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("9715a341", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ ArrayList d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("60996e32", new Object[]{cVar}) : cVar.l;
    }

    public static /* synthetic */ String e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d5957409", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ HashSet f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("8ec99a33", new Object[]{cVar}) : cVar.m;
    }

    public static /* synthetic */ com.taobao.tbliveinteractive.b g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tbliveinteractive.b) ipChange.ipc$dispatch("3b34b6e8", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ com.taobao.tbliveinteractive.c h(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tbliveinteractive.c) ipChange.ipc$dispatch("243c7c08", new Object[]{cVar}) : cVar.o;
    }

    public static /* synthetic */ int i(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d8ca99e6", new Object[]{cVar})).intValue() : cVar.f();
    }

    public c(String str, Context context, com.taobao.alilive.aliliveframework.frame.a aVar, e eVar, com.taobao.tbliveinteractive.b bVar, com.taobao.tbliveinteractive.c cVar) {
        this.d = str;
        this.f22174a = context;
        this.q = aVar;
        this.b = eVar;
        this.c = bVar;
        this.o = cVar;
    }

    public void a(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4670d", new Object[]{this, viewGroup, new Boolean(z)});
        } else if (viewGroup == null) {
        } else {
            viewGroup.addView(LayoutInflater.from(this.f22174a).inflate(R.layout.taolive_room_interactive_right_component_parent, (ViewGroup) null));
            this.e = viewGroup;
            a(z);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        this.p = this.e.findViewById(R.id.interactive_right_component_layout);
        this.h = (RecyclerView) this.e.findViewById(R.id.interactive_right_component_recycler);
        this.i = (FrameLayout) this.e.findViewById(R.id.interactive_right_component_anim);
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        float b = com.taobao.taolive.sdk.utils.b.b(this.f22174a);
        layoutParams.width = fpr.a(this.f22174a, "60ap", (int) ((60.0f * b) / 375.0f));
        layoutParams.height = fpr.a(this.f22174a, "72ap", (int) ((b * 72.0f) / 375.0f));
        this.i.setLayoutParams(layoutParams);
        this.k = new a();
        RecyclerView recyclerView = this.h;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f22174a);
        this.j = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        if (z && !y.c(this.f22174a)) {
            this.j.setReverseLayout(true);
            this.j.setOrientation(0);
            this.j.setStackFromEnd(true);
        } else {
            this.j.setOrientation(1);
            this.h.setHasFixedSize(true);
            this.k.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.taobao.tbliveinteractive.view.right_component.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeInserted(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i), new Integer(i2)});
                    } else if (c.a(c.this).getMeasuredWidth() != 0 && c.a(c.this).getMeasuredHeight() != 0) {
                    } else {
                        c.a(c.this).requestLayout();
                    }
                }
            });
        }
        this.h.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.taobao.tbliveinteractive.view.right_component.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -1263079482) {
                    super.getItemOffsets((Rect) objArr[0], (View) objArr[1], (RecyclerView) objArr[2], (RecyclerView.State) objArr[3]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView2, RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView2, state});
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView2, state);
                rect.bottom = com.taobao.taolive.sdk.utils.b.a(c.b(c.this), 8.0f);
            }
        });
        ((DefaultItemAnimator) this.h.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.e;
    }

    public View e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("42261fae", new Object[]{this}) : this.p;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (!this.f && qne.A()) {
            this.i.bringToFront();
            this.n = new b(this.d, this.f22174a, this.i, this.b, this);
        }
        com.taobao.tbliveinteractive.b bVar = this.c;
        if (bVar != null) {
            this.l.addAll(bVar.d());
        }
        int f = f();
        for (int size = this.l.size() - 1; size > f - 1; size--) {
            this.l.remove(size);
        }
        this.h.setAdapter(this.k);
        this.h.setRecycledViewPool(this.q.z().H());
        ddw.a().a(this);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        b bVar = this.n;
        if (bVar != null) {
            bVar.b();
        }
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            recyclerView.swapAdapter(null, true);
        }
        ddw.a().b(this);
        this.l.clear();
        this.m.clear();
        this.o = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        char c;
        InteractiveComponent b;
        String str2;
        b bVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        switch (str.hashCode()) {
            case -2008943835:
                if (str.equals("com.taobao.taolive.room.dxmanager.event")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1046333867:
                if (str.equals("com.taobao.taolive.room.interactive_all_component_load_complete")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1328534656:
                if (str.equals("com.taobao.taolive.room.interactive_component_update_entrance_info")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1922212234:
                if (str.equals("com.taobao.taolive.room.interactive_component_update_entrance_anim_info")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            if (!(obj instanceof InteractiveComponent)) {
                return;
            }
            InteractiveComponent interactiveComponent = (InteractiveComponent) obj;
            if (!interactiveComponent.migrationFlag || !interactiveComponent.rightShowFlag || StringUtils.isEmpty(interactiveComponent.iconViewStyle) || interactiveComponent.interactivePanelDisplayOnly) {
                return;
            }
            int f = f();
            pnj m = pmd.a().m();
            m.a("RightComponentFrame", "UPDATE_ENTRANCE_INFO onSuccess " + interactiveComponent.parseJsonTBLiveInteractiveComponent().toJSONString() + " mComponentList.size() " + this.l.size());
            int i = 0;
            int i2 = -1;
            while (true) {
                if (i < this.l.size()) {
                    InteractiveComponent interactiveComponent2 = this.l.get(i);
                    if (i2 < 0 && ((interactiveComponent.showOrder >= 0 && interactiveComponent2.showOrder > interactiveComponent.showOrder) || (interactiveComponent.showOrder >= 0 && interactiveComponent2.showOrder < 0))) {
                        i2 = i;
                    }
                    if (!StringUtils.equals(interactiveComponent.fedName, interactiveComponent2.fedName) && !StringUtils.equals(interactiveComponent.name, interactiveComponent2.name)) {
                        i++;
                    }
                } else {
                    i = -1;
                }
            }
            if (i < 0) {
                if (!interactiveComponent.isNeedShowEntrance) {
                    return;
                }
                if (i2 < 0) {
                    this.l.add(interactiveComponent);
                    if (this.l.size() <= f) {
                        this.k.notifyItemInserted(this.l.size() - 1);
                    } else {
                        e eVar = this.b;
                        if (eVar != null) {
                            eVar.a(interactiveComponent);
                        }
                    }
                } else {
                    if (i2 < f) {
                        z = true;
                    }
                    if (z && this.l.size() >= f) {
                        e eVar2 = this.b;
                        if (eVar2 != null) {
                            eVar2.a(this.l.get(f - 1));
                        }
                        this.k.notifyItemRemoved(f - 1);
                    }
                    this.l.add(i2, interactiveComponent);
                    if (z) {
                        this.k.notifyItemInserted(i2);
                    } else {
                        e eVar3 = this.b;
                        if (eVar3 != null) {
                            eVar3.a(interactiveComponent);
                        }
                    }
                }
                d();
            } else if (interactiveComponent.isNeedShowEntrance) {
                this.l.set(i, interactiveComponent);
                if (i < f) {
                    this.k.notifyItemChanged(i);
                    return;
                }
                e eVar4 = this.b;
                if (eVar4 == null) {
                    return;
                }
                eVar4.a(interactiveComponent);
            } else {
                this.l.remove(i);
                if (i < f) {
                    this.k.notifyItemRemoved(i);
                    if (this.l.size() >= f) {
                        e eVar5 = this.b;
                        if (eVar5 != null) {
                            eVar5.b(this.l.get(f - 1));
                        }
                        this.k.notifyItemInserted(f - 1);
                    }
                } else {
                    e eVar6 = this.b;
                    if (eVar6 != null) {
                        eVar6.b(interactiveComponent);
                    }
                }
                d();
            }
        } else if (c != 1) {
            if (c != 2) {
                if (c != 3 || (bVar = this.n) == null) {
                    return;
                }
                bVar.a();
            } else if (!(obj instanceof InteractiveComponentRightAnim)) {
            } else {
                InteractiveComponentRightAnim interactiveComponentRightAnim = (InteractiveComponentRightAnim) obj;
                b bVar2 = this.n;
                if (bVar2 == null) {
                    return;
                }
                bVar2.a(interactiveComponentRightAnim);
            }
        } else if (!(obj instanceof qmv.a)) {
        } else {
            qmv.a aVar = (qmv.a) obj;
            if (aVar.f32947a == null || aVar.f32947a.length < 2 || this.c == null) {
                return;
            }
            if ("interact_click".equals(aVar.f32947a[1])) {
                InteractiveComponent a2 = this.c.a(this.f22174a, aVar.f32947a);
                if (a2 == null || aVar.f32947a.length < 4) {
                    return;
                }
                if (qne.z().equals(a2.fedName)) {
                    if (a2.viewParams instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) a2.viewParams;
                        if (jSONArray.size() > aVar.b && aVar.b >= 0) {
                            str2 = jSONArray.getJSONObject(aVar.b).getString("id");
                            e eVar7 = this.b;
                            qnh.a(eVar7, "RightEntrance", "event=" + aVar.f32947a[1], "compName=" + aVar.f32947a[2], "comppos=0", "iconAction=" + aVar.f32947a[3], "actionNavUrl=" + aVar.f32947a[4], "clickIndex=" + aVar.b, "cp_oprt_id=" + str2, "dataComp=" + a2.parseJsonTBLiveInteractiveComponent().toJSONString());
                            return;
                        }
                    }
                    str2 = "";
                    e eVar72 = this.b;
                    qnh.a(eVar72, "RightEntrance", "event=" + aVar.f32947a[1], "compName=" + aVar.f32947a[2], "comppos=0", "iconAction=" + aVar.f32947a[3], "actionNavUrl=" + aVar.f32947a[4], "clickIndex=" + aVar.b, "cp_oprt_id=" + str2, "dataComp=" + a2.parseJsonTBLiveInteractiveComponent().toJSONString());
                    return;
                }
                e eVar8 = this.b;
                qnh.a(eVar8, "RightEntrance", "event=" + aVar.f32947a[1], "compName=" + aVar.f32947a[2], "comppos=0", "iconAction=" + aVar.f32947a[3], "actionNavUrl=" + aVar.f32947a[4], "click_position=entrance", "clickIndex=" + aVar.b, "dataComp=" + a2.parseJsonTBLiveInteractiveComponent().toJSONString());
            } else if (!"interact_right_anim_click".equals(aVar.f32947a[1]) || (b = this.c.b(this.f22174a, aVar.f32947a)) == null) {
            } else {
                e eVar9 = this.b;
                qnh.a(eVar9, "RightEntrance", "event=" + aVar.f32947a[1], "compName=" + aVar.f32947a[2], "comppos=0", "iconAction=" + b.iconAction, "actionNavUrl=" + b.actionUrl, "click_position=cartoon", "dataComp=" + b.parseJsonTBLiveInteractiveComponent().toJSONString());
            }
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!qne.w() || this.b == null || this.l == null) {
        } else {
            HashMap hashMap = new HashMap();
            JSONArray jSONArray = new JSONArray();
            Iterator<InteractiveComponent> it = this.l.iterator();
            while (it.hasNext()) {
                InteractiveComponent next = it.next();
                if (next != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", (Object) next.id);
                    jSONObject.put("fedName", (Object) next.fedName);
                    jSONArray.add(jSONObject);
                }
            }
            hashMap.put("right", jSONArray);
            this.b.a("TBLiveWVPlugin.Event.EntranceChanged", hashMap);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.interactive_component_update_entrance_info", "com.taobao.taolive.room.dxmanager.event", "com.taobao.taolive.room.interactive_component_update_entrance_anim_info", "com.taobao.taolive.room.interactive_all_component_load_complete"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.tbliveinteractive.view.right_component.a
    public Integer a(InteractiveComponentRightAnim interactiveComponentRightAnim) {
        InteractiveComponent interactiveComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("74f11f3", new Object[]{this, interactiveComponentRightAnim});
        }
        Integer a2 = a(interactiveComponentRightAnim, true);
        if (interactiveComponentRightAnim != null && a2 != null && a2.intValue() >= 0 && a2.intValue() < this.l.size() && (interactiveComponent = this.l.get(a2.intValue())) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dataComp", interactiveComponent.parseJsonTBLiveInteractiveComponent().toJSONString());
            hashMap.put("dataAnim", interactiveComponentRightAnim.parseJsonComponentRightAnim().toJSONString());
            hashMap.put("compName", interactiveComponent.fedName);
            hashMap.put("name", interactiveComponent.fedName);
            hashMap.put("comppos", "0");
            qnh.a(this.b, "Show-RightEntrance_cartoon", hashMap);
        }
        return a2;
    }

    @Override // com.taobao.tbliveinteractive.view.right_component.a
    public Integer b(InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("30b68ad2", new Object[]{this, interactiveComponentRightAnim}) : a(interactiveComponentRightAnim, false);
    }

    private Integer a(InteractiveComponentRightAnim interactiveComponentRightAnim, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("3573abaf", new Object[]{this, interactiveComponentRightAnim, new Boolean(z)});
        }
        if (interactiveComponentRightAnim == null || this.l == null) {
            return null;
        }
        int f = f();
        int i = 0;
        while (i < this.l.size()) {
            InteractiveComponent interactiveComponent = this.l.get(i);
            if (StringUtils.equals(interactiveComponent.fedName, interactiveComponentRightAnim.name) || StringUtils.equals(interactiveComponent.name, interactiveComponentRightAnim.name)) {
                interactiveComponent.isRightAnimated = i < f && z;
                a aVar = this.k;
                if (aVar != null && i < f) {
                    aVar.notifyItemChanged(i);
                    return Integer.valueOf(i);
                }
            }
            i++;
        }
        return null;
    }

    /* loaded from: classes8.dex */
    public class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(236544078);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        public a() {
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder */
        public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
            }
            HashMap<String, String> b = qne.b();
            Iterator<String> it = b.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = "taolive_normal_countdown_comp";
                    break;
                }
                String next = it.next();
                if (i == next.hashCode()) {
                    str = b.get(next);
                    break;
                }
            }
            DXRootView a2 = qmz.a(c.c(c.this), c.b(c.this), str);
            if (a2 == null) {
                return new qni(new View(c.b(c.this)));
            }
            return new qni(a2);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            if (c.d(c.this) != null && c.d(c.this).size() > i && c.d(c.this).get(i) != null && ((InteractiveComponent) c.d(c.this).get(i)).iconViewStyle != null) {
                return ((InteractiveComponent) c.d(c.this).get(i)).iconViewStyle.hashCode();
            }
            return 0;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            try {
                InteractiveComponent interactiveComponent = (InteractiveComponent) c.d(c.this).get(i);
                JSONObject parseJsonTBLiveInteractiveComponent = interactiveComponent.parseJsonTBLiveInteractiveComponent();
                qmz.a(c.c(c.this), (DXRootView) viewHolder.itemView, parseJsonTBLiveInteractiveComponent, c.e(c.this));
                pnj m = pmd.a().m();
                m.a("RightComponentFrame", "interactUpdateEntranceView onBindViewHolder " + parseJsonTBLiveInteractiveComponent.toJSONString() + " mComponentList.size() " + c.d(c.this).size());
                if (c.f(c.this).contains(interactiveComponent)) {
                    return;
                }
                c.f(c.this).add(interactiveComponent);
                HashMap hashMap = new HashMap();
                hashMap.put("dataComp", parseJsonTBLiveInteractiveComponent.toJSONString());
                hashMap.put("compName", interactiveComponent.fedName);
                hashMap.put("name", interactiveComponent.fedName);
                hashMap.put("comppos", "0");
                if (qne.z().equals(interactiveComponent.fedName) && (interactiveComponent.viewParams instanceof JSONArray)) {
                    JSONArray jSONArray = (JSONArray) interactiveComponent.viewParams;
                    String str = "";
                    while (i2 < jSONArray.size()) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(i2 == 0 ? "" : "@");
                        sb.append(jSONObject.getString("id"));
                        str = sb.toString();
                        i2++;
                    }
                    hashMap.put("cp_oprt_id", str);
                }
                hashMap.put("index", String.valueOf(i));
                hashMap.put("priority", interactiveComponent.priority);
                if (c.g(c.this) != null) {
                    hashMap.put("isEnableMultiBatchRender", String.valueOf(c.g(c.this).g()));
                }
                qnh.a(c.c(c.this), "Show-RightEntrance", hashMap);
                ddw.a().a("com.taobao.taolive.room.interactive_component_entrance_render_finished", interactiveComponent, c.e(c.this));
                if (c.h(c.this) == null) {
                    return;
                }
                c.h(c.this).b(interactiveComponent, hashMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : Math.min(c.i(c.this), c.d(c.this).size());
        }
    }

    private int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        int i = this.r;
        return i <= 0 ? this.g : Math.min(this.g, i);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!qne.x()) {
        } else {
            this.r = i;
            a aVar = this.k;
            if (aVar == null) {
                return;
            }
            aVar.notifyDataSetChanged();
        }
    }
}
