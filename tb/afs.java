package tb;

import android.support.v7.widget.RecyclerView;
import android.taobao.windvane.util.m;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.alibaba.android.ultron.vfw.viewholder.j;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class afs extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<IDMComponent> f25314a;
    private final bny b;
    private c c;
    private final j d;
    private final Map<Integer, h> e = new HashMap();
    private final HashMap<String, IDMComponent> f = new HashMap<>();
    private final HashMap<String, Integer> g = new HashMap<>();
    private com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.c h;
    private ViewGroup i;

    static {
        kge.a(255044190);
        kge.a(766180776);
    }

    public static /* synthetic */ Object ipc$super(afs afsVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public afs(c cVar, List<IDMComponent> list, com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.c cVar2, RecyclerView recyclerView) {
        this.i = null;
        this.c = cVar;
        this.f25314a = list;
        d B = cVar.B();
        this.d = B.q().v();
        this.b = B.q();
        this.h = cVar2;
        this.i = recyclerView;
        a(this.f25314a);
        for (int i = 0; i < this.f25314a.size(); i++) {
            if (this.f25314a.get(i) != null) {
                his.a("HeaderRVAdapter", "RecyclerViewAdapter（） | name=" + this.f25314a.get(i).getKey() + " type=" + this.f25314a.get(i).getType());
            }
        }
    }

    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        String key = iDMComponent.getKey();
        int intValue = b(key).intValue();
        if (intValue < 0) {
            return;
        }
        his.a("HeaderRVAdapter", "notifyComponentChange | component=" + key + "    index=" + intValue);
        notifyItemChanged(intValue, iDMComponent);
    }

    public List<IDMComponent> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str}) : a(str, this.f25314a);
    }

    private List<IDMComponent> a(String str, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bf7c52c4", new Object[]{this, str, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (IDMComponent iDMComponent : list) {
                if (a(iDMComponent, str)) {
                    arrayList.add(iDMComponent);
                }
                arrayList.addAll(a(str, iDMComponent.getChildren()));
            }
        }
        return arrayList;
    }

    private boolean a(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a050eeba", new Object[]{this, iDMComponent, str})).booleanValue();
        }
        JSONObject jSONObject = iDMComponent.getData().getJSONObject("fields");
        return jSONObject != null && jSONObject.containsKey("apiName") && str.equals(jSONObject.getString("apiName"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Integer b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("78142dda", new Object[]{this, str});
        }
        if (this.g.containsKey(str)) {
            return this.g.get(str);
        }
        Pair<IDMComponent, Integer> b = b(str, this.f25314a);
        if (b != null) {
            this.f.put(str, b.first);
            this.g.put(str, b.second);
            return (Integer) b.second;
        }
        m.e("HeaderRVAdapter", "输入的componentName：" + str + " 错误，拿不到index");
        return -1;
    }

    public List<IDMComponent> b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8d49fbdc", new Object[]{this, iDMComponent});
        }
        ArrayList arrayList = new ArrayList();
        if ("dinamicx".equals(iDMComponent.getContainerType()) || "native".equals(iDMComponent.getContainerType())) {
            arrayList.add(iDMComponent);
        }
        for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
            if ("dinamicx".equals(iDMComponent2.getContainerType()) || "native".equals(iDMComponent2.getContainerType())) {
                arrayList.add(iDMComponent2);
            }
            if (iDMComponent2.getChildren() != null && !iDMComponent2.getChildren().isEmpty()) {
                arrayList.addAll(b(iDMComponent2));
            }
        }
        return arrayList;
    }

    private Pair<IDMComponent, Integer> b(String str, List<IDMComponent> list) {
        Pair<IDMComponent, Integer> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("61b44dae", new Object[]{this, str, list});
        }
        for (int i = 0; i < list.size(); i++) {
            IDMComponent iDMComponent = list.get(i);
            if (str.equals(iDMComponent.getKey())) {
                return new Pair<>(iDMComponent, Integer.valueOf(i));
            }
            if (iDMComponent.getChildren() != null && (b = b(str, iDMComponent.getChildren())) != null && b.first != null && b.second != null) {
                return new Pair<>(b.first, Integer.valueOf(i));
            }
        }
        return null;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new RecyclerView.ViewHolder(frameLayout) { // from class: tb.afs.1
        };
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61bdb19b", new Object[]{this, viewHolder, new Integer(i), list});
        } else if (list.size() > 0) {
            for (Object obj : list) {
                if (obj instanceof IDMComponent) {
                    IDMComponent iDMComponent = (IDMComponent) obj;
                    boolean a2 = afr.a(iDMComponent);
                    int a3 = this.d.a(iDMComponent);
                    if (this.e.containsKey(Integer.valueOf(a3))) {
                        h hVar = this.e.get(Integer.valueOf(a3));
                        his.a("HeaderRVAdapter", "onBindViewHolder payloads | component name=" + iDMComponent.getKey() + "  已上屏");
                        if (a2) {
                            his.a("HeaderRVAdapter", "component name:" + iDMComponent.getKey() + "直接刷新");
                            iDMComponent.getExtMap().put("keyViewHandler", this.h.h());
                            iDMComponent.getExtMap().put("keyTopBarHandler", this.h.e);
                            iDMComponent.getExtMap().put("gl_ultron_context", this.c);
                            a(iDMComponent.getFields());
                            b(iDMComponent.getFields());
                            this.d.a(hVar, iDMComponent);
                            if (hVar == null || hVar.c() == null || hVar.c().getParent() != null) {
                                return;
                            }
                            ((ViewGroup) viewHolder.itemView).addView(hVar.c());
                            return;
                        }
                        ((FrameLayout) viewHolder.itemView).removeView(hVar.itemView);
                    } else if (a2) {
                        h a4 = a(a3, iDMComponent);
                        if (hiq.a(iDMComponent) && (a4.itemView instanceof DXRootView)) {
                            this.e.put(Integer.valueOf(a3), a4);
                        }
                        FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
                        iDMComponent.getExtMap().put("keyViewHandler", this.h.h());
                        iDMComponent.getExtMap().put("keyTopBarHandler", this.h.e);
                        iDMComponent.getExtMap().put("gl_ultron_context", this.c);
                        a(iDMComponent.getFields());
                        b(iDMComponent.getFields());
                        this.d.a(a4, iDMComponent);
                        if (a4.itemView instanceof DXRootView) {
                            if (a4.itemView.getParent() instanceof ViewGroup) {
                                ((ViewGroup) a4.itemView.getParent()).removeView(a4.itemView);
                            }
                            frameLayout.removeAllViews();
                            frameLayout.addView(a4.itemView);
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        } else {
            onBindViewHolder(viewHolder, i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        IDMComponent iDMComponent = this.f25314a.get(i);
        his.a("HeaderRVAdapter", "onBindViewHolder | component=" + iDMComponent.getKey());
        List<IDMComponent> b = b(iDMComponent);
        int size = b.size();
        FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
        frameLayout.removeAllViews();
        if (size <= 0) {
            m.e("HeaderRVAdapter", "container is empty！");
            return;
        }
        for (int i2 = 0; i2 < size; i2++) {
            IDMComponent iDMComponent2 = b.get(i2);
            his.a("HeaderRVAdapter", "onBindViewHolder | leaf component=" + iDMComponent2.getKey());
            if (afr.a(iDMComponent2)) {
                int a2 = this.d.a(iDMComponent2);
                if (this.e.containsKey(Integer.valueOf(a2))) {
                    hVar = this.e.get(Integer.valueOf(a2));
                } else {
                    h a3 = a(a2, iDMComponent2);
                    if (hiq.a(iDMComponent) && (a3.itemView instanceof DXRootView)) {
                        this.e.put(Integer.valueOf(a2), a3);
                    }
                    hVar = a3;
                }
                if (hVar == null) {
                    pmd.a().m().a("HeaderRVAdapter", "DX ViewHolder 失败");
                    return;
                }
                his.a("HeaderRVAdapter", "onBindViewHolder | name=" + iDMComponent2.getKey());
                iDMComponent2.getExtMap().put("keyViewHandler", this.h.h());
                iDMComponent2.getExtMap().put("keyTopBarHandler", this.h.e);
                iDMComponent2.getExtMap().put("gl_ultron_context", this.c);
                a(iDMComponent2.getFields());
                b(iDMComponent2.getFields());
                this.d.a(hVar, iDMComponent2);
                if (!(hVar.itemView instanceof DXRootView)) {
                    return;
                }
                if (hVar.itemView.getParent() instanceof ViewGroup) {
                    ((ViewGroup) hVar.itemView.getParent()).removeView(hVar.itemView);
                }
                frameLayout.removeAllViews();
                frameLayout.addView(hVar.itemView);
                return;
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.f25314a.size();
    }

    public List<IDMComponent> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f25314a;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i >= 0 && i < this.f25314a.size()) {
            return i;
        }
        return -1;
    }

    private h a(int i, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("e5f9423e", new Object[]{this, new Integer(i), iDMComponent});
        }
        if (!a.c().booleanValue()) {
            return this.d.a(this.i, i);
        }
        if (this.c.E() == null) {
            return null;
        }
        return this.c.E().d().a(this.d, this.i, i, iDMComponent, true);
    }

    private void a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (!list.isEmpty()) {
            for (IDMComponent iDMComponent : list) {
                if ("dinamicx".equals(iDMComponent.getContainerType())) {
                    iDMComponent.getFields().put("extraGoodsTabList", pqj.b(this.c.t().extraGoodsTabList));
                    iDMComponent.getFields().put("itemListType", pqj.b((Object) this.c.t().itemListType));
                }
                List<IDMComponent> children = iDMComponent.getChildren();
                if (!children.isEmpty()) {
                    a(children);
                }
            }
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        int i = this.h.i();
        if (this.c.t() != null && this.c.G() != null && this.c.G().size() > i) {
            jSONObject.put("showTopBarType", pqj.b(this.c.G().get(i).showTopBarType));
            jSONObject.put("tabIndex", (Object) Integer.valueOf(i));
            return;
        }
        his.b("HeaderRVAdapter", "putCurrentTabInfo | info empty. index=" + i);
        jSONObject.remove("showTopBarType");
    }

    private void b(JSONObject jSONObject) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (intValue = jSONObject.getIntValue("compressList")) <= 0) {
        } else {
            this.h.b(hin.a(hhs.a().c(), this.c.f(), intValue));
        }
    }
}
