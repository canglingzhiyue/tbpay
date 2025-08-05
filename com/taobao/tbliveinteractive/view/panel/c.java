package com.taobao.tbliveinteractive.view.panel;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.tbliveinteractive.InteractiveComponent;
import com.taobao.tbliveinteractive.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.qmy;
import tb.qmz;
import tb.qne;
import tb.qnh;
import tb.qni;

/* loaded from: classes8.dex */
public class c extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f22161a;
    private List<InteractiveComponent> b = new ArrayList();
    private final String c;
    private e d;
    private final String e;

    static {
        kge.a(-924302155);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public c(String str, Context context, e eVar, String str2) {
        this.c = str;
        this.f22161a = context;
        this.d = eVar;
        this.e = str2;
    }

    public void a(List<InteractiveComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.b.clear();
        if (list != null && list.size() > 0) {
            for (InteractiveComponent interactiveComponent : list) {
                if (c(interactiveComponent) && interactiveComponent.isNeedShowEntrance) {
                    this.b.add(interactiveComponent);
                }
            }
        }
        Collections.sort(this.b, new Comparator<InteractiveComponent>() { // from class: com.taobao.tbliveinteractive.view.panel.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(InteractiveComponent interactiveComponent2, InteractiveComponent interactiveComponent3) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, interactiveComponent2, interactiveComponent3})).intValue() : a(interactiveComponent2, interactiveComponent3);
            }

            public int a(InteractiveComponent interactiveComponent2, InteractiveComponent interactiveComponent3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("6631b6db", new Object[]{this, interactiveComponent2, interactiveComponent3})).intValue();
                }
                return (interactiveComponent2.showOrder < 0 ? interactiveComponent2.showOrder + 10000 : interactiveComponent2.showOrder) - (interactiveComponent3.showOrder < 0 ? interactiveComponent3.showOrder + 10000 : interactiveComponent3.showOrder);
            }
        });
    }

    public void a(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84243444", new Object[]{this, interactiveComponent});
        } else if (c(interactiveComponent)) {
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < this.b.size(); i3++) {
                InteractiveComponent interactiveComponent2 = this.b.get(i3);
                if (i2 < 0 && ((interactiveComponent.showOrder > 0 && interactiveComponent2.showOrder > interactiveComponent.showOrder) || (interactiveComponent.showOrder > 0 && interactiveComponent2.showOrder < 0))) {
                    i2 = i3;
                }
                if (TextUtils.equals(interactiveComponent.fedName, interactiveComponent2.fedName) || TextUtils.equals(interactiveComponent.name, interactiveComponent2.name)) {
                    i = i3;
                    break;
                }
            }
            if (i < 0) {
                if (!interactiveComponent.isNeedShowEntrance) {
                    return;
                }
                if (i2 < 0) {
                    this.b.add(interactiveComponent);
                    notifyItemInserted(this.b.size() - 1);
                    return;
                }
                this.b.add(i2, interactiveComponent);
                notifyItemInserted(i2);
            } else if (interactiveComponent.isNeedShowEntrance) {
                this.b.set(i, interactiveComponent);
                notifyItemChanged(i);
            } else {
                this.b.remove(i);
                notifyItemRemoved(i);
            }
        }
    }

    public void b(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("855a8723", new Object[]{this, interactiveComponent});
            return;
        }
        for (int i = 0; i < this.b.size(); i++) {
            InteractiveComponent interactiveComponent2 = this.b.get(i);
            if (TextUtils.equals(interactiveComponent.fedName, interactiveComponent2.fedName) || TextUtils.equals(interactiveComponent.name, interactiveComponent2.name)) {
                this.b.remove(i);
                notifyItemRemoved(i);
                return;
            }
        }
    }

    private boolean c(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8690da06", new Object[]{this, interactiveComponent})).booleanValue() : interactiveComponent != null && interactiveComponent.migrationFlag && !TextUtils.isEmpty(interactiveComponent.panelTitle) && qne.a(interactiveComponent.fedName);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        DXRootView a2 = qmz.a(this.d, this.f22161a, this.e);
        if (a2 == null) {
            return new qni(new View(this.f22161a));
        }
        return new qni(a2);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        InteractiveComponent interactiveComponent;
        String str = "native";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
        } else if (i < 0 || i >= getItemCount() || (interactiveComponent = this.b.get(i)) == null) {
        } else {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("dataComp", interactiveComponent.parseJsonTBLiveInteractiveComponent().toJSONString());
                hashMap.put("compName", interactiveComponent.fedName);
                hashMap.put("name", interactiveComponent.fedName);
                if (!str.equals(interactiveComponent.type)) {
                    str = "interact";
                }
                hashMap.put("type", str);
                hashMap.put("comppos", "1");
                qnh.a(this.d, "Show-RightEntrance", hashMap);
                qmz.a(this.d, (DXRootView) viewHolder.itemView, interactiveComponent.parseJsonTBLiveInteractiveComponent(), this.c);
                if (viewHolder == null || viewHolder.itemView == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 16) {
                    viewHolder.itemView.setImportantForAccessibility(1);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    viewHolder.itemView.setFocusable(1);
                }
                if (interactiveComponent != null && interactiveComponent.label != null) {
                    viewHolder.itemView.setContentDescription(interactiveComponent.label);
                }
                qmy.a(viewHolder.itemView);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<InteractiveComponent> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public JSONArray a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        for (InteractiveComponent interactiveComponent : this.b) {
            if (interactiveComponent != null && c(interactiveComponent)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", (Object) interactiveComponent.id);
                jSONObject.put("fedName", (Object) interactiveComponent.fedName);
                jSONArray.add(jSONObject);
            }
        }
        return jSONArray;
    }
}
