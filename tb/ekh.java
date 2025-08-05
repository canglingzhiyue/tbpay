package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "alidetail.impl.locator.connector.trigger")
/* loaded from: classes4.dex */
public final class ekh implements atg, ath, ekm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private eki b;
    private AURAGlobalData e;
    private aqs f;
    private SparseArray<AURARenderComponent> h;

    /* renamed from: a  reason: collision with root package name */
    private final String f27366a = "主图触发器";
    private final HashMap<AURARenderComponent, ekk> c = new HashMap<>();
    private final HashMap<AURARenderComponent, AURARenderComponent> d = new HashMap<>();
    private boolean g = true;

    static {
        kge.a(-1173754413);
        kge.a(836884500);
        kge.a(-450410939);
        kge.a(-1017987774);
    }

    @Override // tb.ath
    public void a(View view, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b016bcab", new Object[]{this, view, state});
        }
    }

    @Override // tb.ath
    public void a(AURAInputData<AURARenderIO> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4bc11", new Object[]{this, aURAInputData});
        }
    }

    @Override // tb.ath
    public void a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
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

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        }
    }

    public static /* synthetic */ eki a(ekh ekhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eki) ipChange.ipc$dispatch("c8e25a8d", new Object[]{ekhVar}) : ekhVar.b;
    }

    public static /* synthetic */ void a(ekh ekhVar, RecyclerView recyclerView, ekj ekjVar, aqt aqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f11fb5c", new Object[]{ekhVar, recyclerView, ekjVar, aqtVar});
        } else {
            ekhVar.a(recyclerView, ekjVar, aqtVar);
        }
    }

    public static /* synthetic */ void a(ekh ekhVar, ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68eb60e1", new Object[]{ekhVar, ekkVar});
        } else {
            ekhVar.a(ekkVar);
        }
    }

    public static /* synthetic */ boolean a(ekh ekhVar, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c65f7369", new Object[]{ekhVar, aURARenderComponent})).booleanValue() : ekhVar.c(aURARenderComponent);
    }

    public static /* synthetic */ boolean a(ekh ekhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f94e1682", new Object[]{ekhVar, new Boolean(z)})).booleanValue();
        }
        ekhVar.g = z;
        return z;
    }

    public static /* synthetic */ boolean b(ekh ekhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d585859b", new Object[]{ekhVar})).booleanValue() : ekhVar.g;
    }

    public ekh() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.locator.AliSDetailLocatorTriggerExtension");
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.e = aURAGlobalData;
        this.f = aqsVar;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.clear();
        this.d.clear();
    }

    @Override // tb.atg
    public void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        ejh.a(false, recyclerView, i);
        if (i != 0) {
            return;
        }
        a(recyclerView, new ekj<AURARenderComponent, AURARenderComponent>() { // from class: tb.ekh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ekj
            public boolean a(AURARenderComponent aURARenderComponent, AURARenderComponent aURARenderComponent2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d77e2b0c", new Object[]{this, aURARenderComponent, aURARenderComponent2})).booleanValue();
                }
                return false;
            }
        }, new aqt<ekk>() { // from class: tb.ekh.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aqt
            public void a(ekk ekkVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e703dc33", new Object[]{this, ekkVar});
                } else {
                    ekh.a(ekh.this, ekkVar);
                }
            }
        });
    }

    private void a(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e703dc33", new Object[]{this, ekkVar});
            return;
        }
        eki ekiVar = this.b;
        if (ekiVar == null) {
            arc.a().c("主图触发器", "锚点触发器#停止时", "callback is null");
        } else {
            ekiVar.a(ekkVar);
        }
    }

    private boolean c(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b1c95", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        SparseArray<AURARenderComponent> sparseArray = this.h;
        return sparseArray != null && sparseArray.indexOfValue(aURARenderComponent) >= 0;
    }

    @Override // tb.atg
    public void a(final RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        ejh.a(false, recyclerView, i, i2);
        a(recyclerView, new ekj<AURARenderComponent, AURARenderComponent>() { // from class: tb.ekh.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ekj
            public boolean a(AURARenderComponent aURARenderComponent, AURARenderComponent aURARenderComponent2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d77e2b0c", new Object[]{this, aURARenderComponent, aURARenderComponent2})).booleanValue() : ekh.a(ekh.this, aURARenderComponent);
            }
        }, new aqt<ekk>() { // from class: tb.ekh.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aqt
            public void a(ekk ekkVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e703dc33", new Object[]{this, ekkVar});
                    return;
                }
                ejh.a(recyclerView.getContext(), ekkVar);
                if (ekh.a(ekh.this) == null) {
                    arc.a().c("主图触发器", "锚点触发器#滚动时", "callback is null");
                } else {
                    ekh.a(ekh.this).b(ekkVar);
                }
            }
        });
    }

    private void a(int i, AURARenderComponent aURARenderComponent, SparseIntArray sparseIntArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf5828a", new Object[]{this, new Integer(i), aURARenderComponent, sparseIntArray});
            return;
        }
        if (this.h == null) {
            this.h = new SparseArray<>();
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (sparseIntArray.indexOfKey(this.h.keyAt(i2)) < 0) {
                this.h.removeAt(i2);
            }
        }
        this.h.put(i, aURARenderComponent);
    }

    private void a(RecyclerView recyclerView, ekj<AURARenderComponent, AURARenderComponent> ekjVar, aqt<ekk> aqtVar) {
        ArrayList arrayList;
        SparseIntArray a2;
        int size;
        AURARenderComponent aURARenderComponent;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243bcaae", new Object[]{this, recyclerView, ekjVar, aqtVar});
            return;
        }
        AURAGlobalData aURAGlobalData = this.e;
        if (aURAGlobalData == null || (arrayList = (ArrayList) aURAGlobalData.get("render_view_item_models", ArrayList.class)) == null || (size = (a2 = emj.a(recyclerView)).size()) == 0) {
            return;
        }
        int size2 = arrayList.size();
        AURARenderComponent aURARenderComponent2 = null;
        while (true) {
            if (i >= size) {
                aURARenderComponent = null;
                break;
            }
            int valueAt = a2.valueAt(i);
            if (valueAt < 0 || valueAt >= size2) {
                ard a3 = arc.a();
                a3.c("主图触发器", "triggerFrameComponentShown", "越界了：visiblePosition=" + valueAt + ",size=" + size2);
            } else {
                aURARenderComponent = (AURARenderComponent) arrayList.get(valueAt);
                if (aURARenderComponent == null) {
                    arc.a().c("主图触发器", "triggerFrameComponentShown", "");
                } else {
                    aURARenderComponent2 = b(aURARenderComponent, aURARenderComponent);
                    if (aURARenderComponent2 != null && !ekjVar.a(aURARenderComponent, aURARenderComponent2) && emj.a(recyclerView, valueAt)) {
                        a(valueAt, aURARenderComponent, a2);
                        break;
                    }
                }
            }
            i++;
        }
        if (aURARenderComponent2 == null || aURARenderComponent == null) {
            return;
        }
        a(aURARenderComponent, aURARenderComponent2, aqtVar);
    }

    private void a(AURARenderComponent aURARenderComponent, AURARenderComponent aURARenderComponent2, aqt<ekk> aqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86c23cb4", new Object[]{this, aURARenderComponent, aURARenderComponent2, aqtVar});
            return;
        }
        ekk ekkVar = this.c.get(aURARenderComponent2);
        if (ekkVar == null) {
            ard a2 = arc.a();
            a2.c("主图触发器", "锚点触发器", "cannot find locator model of " + aURARenderComponent2.key);
            return;
        }
        ekkVar.a(aURARenderComponent);
        ekkVar.c(a(aURARenderComponent2, aURARenderComponent));
        ekkVar.b(this.c.size());
        ekkVar.a(aURARenderComponent2.children.size());
        aqtVar.a(ekkVar);
    }

    private int a(AURARenderComponent aURARenderComponent, AURARenderComponent aURARenderComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d77e2afb", new Object[]{this, aURARenderComponent, aURARenderComponent2})).intValue();
        }
        AURARenderComponent aURARenderComponent3 = aURARenderComponent2.parent;
        if (aURARenderComponent3 == null) {
            return -1;
        }
        if (aURARenderComponent == aURARenderComponent3) {
            return aURARenderComponent.children.indexOf(aURARenderComponent2);
        }
        return a(aURARenderComponent, aURARenderComponent3);
    }

    @Override // tb.atf
    public void onContentViewCreated(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1c2042", new Object[]{this, view});
        } else if (!(view instanceof RecyclerView)) {
        } else {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: tb.ekh.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("899df952", new Object[]{this, view2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    } else if (!ekh.b(ekh.this)) {
                    } else {
                        ekh.a(ekh.this, false);
                        ekh.a(ekh.this, (RecyclerView) view, new ekj<AURARenderComponent, AURARenderComponent>() { // from class: tb.ekh.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.ekj
                            public boolean a(AURARenderComponent aURARenderComponent, AURARenderComponent aURARenderComponent2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ((Boolean) ipChange3.ipc$dispatch("d77e2b0c", new Object[]{this, aURARenderComponent, aURARenderComponent2})).booleanValue();
                                }
                                return false;
                            }
                        }, new aqt<ekk>() { // from class: tb.ekh.5.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.aqt
                            public void a(ekk ekkVar) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("e703dc33", new Object[]{this, ekkVar});
                                } else {
                                    ekh.a(ekh.this, ekkVar);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // tb.ath
    public void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        } else {
            a();
        }
    }

    @Override // tb.ath
    public void b(AURARenderComponent aURARenderComponent) {
        AURARenderComponentContainer aURARenderComponentContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ed2032", new Object[]{this, aURARenderComponent});
            return;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || (aURARenderComponentContainer = aURARenderComponentData.container) == null || !"locator".equalsIgnoreCase(aURARenderComponentContainer.name)) {
            return;
        }
        Map<String, Object> map = aURARenderComponentData.fields;
        String str = aURARenderComponent.key;
        if (map == null) {
            ard a2 = arc.a();
            a2.c("主图触发器", "onFlatEachRenderComponent", "fields of " + str + " is null");
            return;
        }
        Object obj = map.get("locatorId");
        if (!(obj instanceof String)) {
            ard a3 = arc.a();
            a3.c("主图触发器", "onFlatEachRenderComponent", "locatorId of " + str + " is null");
            return;
        }
        Object obj2 = map.get("locatorComponent");
        if (!(obj2 instanceof JSONArray)) {
            ard a4 = arc.a();
            a4.c("主图触发器", "onFlatEachRenderComponent", "locatorComponent of " + str + " is null");
            return;
        }
        JSONArray jSONArray = (JSONArray) obj2;
        AURARenderComponent aURARenderComponent2 = aURARenderComponent.parent;
        if (aURARenderComponent2 == null) {
            ard a5 = arc.a();
            a5.c("主图触发器", "onFlatEachRenderComponent", "parent of " + str + " is null");
            return;
        }
        List<AURARenderComponent> list = aURARenderComponent2.children;
        if (bau.a(list)) {
            ard a6 = arc.a();
            a6.c("主图触发器", "onFlatEachRenderComponent", "no brother component of " + str);
            return;
        }
        ekk ekkVar = new ekk((String) obj, jSONArray, aURARenderComponent, list.indexOf(aURARenderComponent));
        this.c.put(aURARenderComponent, ekkVar);
        eki ekiVar = this.b;
        if (ekiVar == null) {
            return;
        }
        ekiVar.c(ekkVar);
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            a();
        }
    }

    @Override // tb.ekm
    public void a(eki ekiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e702f375", new Object[]{this, ekiVar});
        } else {
            this.b = ekiVar;
        }
    }

    private AURARenderComponent b(AURARenderComponent aURARenderComponent, AURARenderComponent aURARenderComponent2) {
        AURARenderComponentData aURARenderComponentData;
        AURARenderComponentLayout aURARenderComponentLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("51875074", new Object[]{this, aURARenderComponent, aURARenderComponent2});
        }
        AURARenderComponent aURARenderComponent3 = this.d.get(aURARenderComponent);
        if (aURARenderComponent3 != null) {
            return aURARenderComponent3;
        }
        AURARenderComponent aURARenderComponent4 = aURARenderComponent2.parent;
        if (aURARenderComponent4 == null || (aURARenderComponentData = aURARenderComponent4.data) == null || (aURARenderComponentLayout = aURARenderComponentData.layout) == null || !aURARenderComponent4.isValidLayout()) {
            return null;
        }
        if ("locator".equalsIgnoreCase(aURARenderComponentLayout.type)) {
            this.d.put(aURARenderComponent, aURARenderComponent4);
            return aURARenderComponent4;
        }
        return b(aURARenderComponent, aURARenderComponent4);
    }
}
