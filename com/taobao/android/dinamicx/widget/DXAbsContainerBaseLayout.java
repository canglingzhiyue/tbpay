package com.taobao.android.dinamicx.widget;

import android.support.v7.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.widget.recycler.WaterfallLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.fqi;
import tb.fuw;
import tb.fux;
import tb.fxe;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class DXAbsContainerBaseLayout extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXABSCONTAINERBASELAYOUT_POSTEVENTSAMPLING = 6334795214712177940L;
    public static final long DXDXABSCONTAINERBASELAYOUT_DATASOURCE = -5948810534719014123L;
    public static final long DXDXABSCONTAINERBASELAYOUT_ONCREATE = 5288680013941347641L;
    public static final long DXDXABSCONTAINERBASELAYOUT_ONSCROLL = 5288751146867425108L;
    public static final long DXDXABSCONTAINERBASELAYOUT_ONSCROLLBEGIN = 9144262755562405950L;
    public static final long DXDXABSCONTAINERBASELAYOUT_ONSCROLLEND = 2691126191158604142L;
    public static final int DXRECYCLERLAYOUT_ISOPENLOADMORE_TRUE = 1;
    public static final int DXRECYCLERLAYOUT_ISOPENPULLTOREFRESH_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_ONENDREACHED = -2277119638481222228L;
    public static final long DXRECYCLERLAYOUT_ORIENTATION = -7199229155167727177L;
    public static final int LOAD_MORE_EMPTY_INT = 6;
    public static final int LOAD_MORE_END = 4;
    public static final int LOAD_MORE_FAIL = 3;
    public static final int LOAD_MORE_IDLE = 1;
    public static final int LOAD_MORE_LOADING = 2;
    public static final int LOAD_MORE_NO_DATA = 5;
    public static final String TAG = "DXAbsContainerBaseLayout";

    /* renamed from: a  reason: collision with root package name */
    public List<Object> f11994a;
    public WaterfallLayout b;
    public ArrayList<DXWidgetNode> c;
    public List<WeakReference<DXWidgetNode>> d;
    private ArrayList<DXWidgetNode> f;
    private JSONArray g;
    private int h = 1;
    private int i = 1;
    public int e = -1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface LoadMoreStatus {
    }

    static {
        kge.a(1534294998);
        kge.a(1655226774);
    }

    public static /* synthetic */ Object ipc$super(DXAbsContainerBaseLayout dXAbsContainerBaseLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1756697323:
                return super.queryWTByAutoId(((Number) objArr[0]).intValue());
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -428783541:
                super.onSetUserDefinedListAttribute(((Number) objArr[0]).longValue(), (List) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 545780165:
                return new Integer(super.getMarginLeft());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 769574994:
                return new Integer(super.getMarginRight());
            case 1172714098:
                return super.queryWTByUserId((String) objArr[0]);
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2091670201:
                return super.exportMethods();
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void a(DXRuntimeContext dXRuntimeContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71e584a", new Object[]{this, dXRuntimeContext, new Integer(i)});
        }
    }

    public DXAbsContainerBaseLayout() {
        this.markContainer = true;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.e;
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new m();
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        if (this.c == null) {
            this.c = new ArrayList<>();
            this.c.addAll(getChildren());
        }
        if (this.f11994a == null) {
            fux.b(getUserId() + " datasource 是空重新构建一个");
            this.f11994a = new JSONArray();
        }
        Iterator<DXWidgetNode> it = this.c.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        List<Object> list = this.f11994a;
        a(a(list, this.c, 0, list.size(), null));
        removeAllChild();
        if (fqi.f()) {
            for (DXWidgetNode dXWidgetNode : d()) {
                addChild(dXWidgetNode, false);
            }
        }
        setDisableFlatten(true);
    }

    public ArrayList<DXWidgetNode> a(List<Object> list, List<DXWidgetNode> list2, int i, int i2, com.taobao.analysis.v3.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c0a6aa17", new Object[]{this, list, list2, new Integer(i), new Integer(i2), nVar});
        }
        ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
        if (list2 != null && !list2.isEmpty() && list != null && !list.isEmpty()) {
            while (i < i2) {
                Object obj = list.get(i);
                DXWidgetNode dXWidgetNode = null;
                for (int i3 = 0; i3 < list2.size() && (dXWidgetNode = a(list2.get(i3), obj, i, nVar)) == null; i3++) {
                }
                if (dXWidgetNode == null) {
                    dXWidgetNode = new com.taobao.android.dinamicx.ah();
                    dXWidgetNode.setDXRuntimeContext(getDXRuntimeContext().a(dXWidgetNode));
                    dXWidgetNode.setVisibility(2);
                }
                arrayList.add(dXWidgetNode);
                i++;
            }
        }
        return arrayList;
    }

    public void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
            return;
        }
        if (dXWidgetNode.getSourceWidget() == null) {
            dXWidgetNode.setSourceWidget(dXWidgetNode);
        }
        List<DXWidgetNode> children = dXWidgetNode.getChildren();
        if (children == null || children.size() == 0) {
            return;
        }
        for (DXWidgetNode dXWidgetNode2 : children) {
            a(dXWidgetNode2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode queryWTByAutoId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("974aed15", new Object[]{this, new Integer(i)});
        }
        DXWidgetNode queryWTByAutoId = super.queryWTByAutoId(i);
        if (queryWTByAutoId == null) {
            if (d() == null) {
                return null;
            }
            Iterator<DXWidgetNode> it = d().iterator();
            while (it.hasNext() && (queryWTByAutoId = it.next().queryWTByAutoId(i)) == null) {
            }
        }
        return queryWTByAutoId;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode queryWTByUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("45e63272", new Object[]{this, str});
        }
        DXWidgetNode queryWTByUserId = super.queryWTByUserId(str);
        if (queryWTByUserId == null) {
            if (d() == null) {
                return null;
            }
            for (DXWidgetNode dXWidgetNode : d()) {
                DXWidgetNode queryWTByUserId2 = dXWidgetNode.queryWTByUserId(str);
                if (queryWTByUserId2 != null) {
                    return queryWTByUserId2;
                }
            }
        }
        return queryWTByUserId;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void sendBroadcastEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6df6ca", new Object[]{this, dXEvent});
        } else if (dXEvent == null) {
        } else {
            if (5288671110273408574L == dXEvent.getEventId()) {
                postEvent(dXEvent);
                a(new DXViewEvent(-8975334121118753601L));
            } else if (5388973340095122049L == dXEvent.getEventId()) {
                postEvent(dXEvent);
                a(new DXViewEvent(-5201408949358043646L));
            } else {
                postEvent(dXEvent);
                a(dXEvent);
            }
        }
    }

    private void a(DXEvent dXEvent) {
        Iterator<WeakReference<DXWidgetNode>> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed70072a", new Object[]{this, dXEvent});
            return;
        }
        try {
            if (this.d == null || this.d.size() == 0 || (it = this.d.iterator()) == null) {
                return;
            }
            while (it.hasNext()) {
                WeakReference<DXWidgetNode> next = it.next();
                DXWidgetNode dXWidgetNode = next.get();
                if (next != null && next.get() != null) {
                    if (dXEvent instanceof DXViewEvent) {
                        ((DXViewEvent) dXEvent).setItemIndex(dXWidgetNode.getDXRuntimeContext().i());
                    } else {
                        dXWidgetNode.sendBroadcastEvent(dXEvent);
                    }
                }
                it.remove();
            }
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
        }
    }

    public void b(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b577266", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode == null) {
        } else {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(new WeakReference<>(dXWidgetNode));
            if (!(dXWidgetNode instanceof ac)) {
                return;
            }
            ((ac) dXWidgetNode).a(true);
        }
    }

    public boolean c(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9572f109", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode != null) {
            try {
                if (this.d != null) {
                    if (dXWidgetNode instanceof ac) {
                        ((ac) dXWidgetNode).a(false);
                    }
                    Iterator<WeakReference<DXWidgetNode>> it = this.d.iterator();
                    if (it == null) {
                        return false;
                    }
                    while (it.hasNext()) {
                        WeakReference<DXWidgetNode> next = it.next();
                        if (next != null && next.get() != null) {
                            if (next.get() == dXWidgetNode) {
                                it.remove();
                                return true;
                            }
                        }
                        it.remove();
                    }
                    return false;
                }
            } catch (Exception e) {
                com.taobao.android.dinamicx.exception.a.b(e);
            }
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void updateRefreshType(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22ac2b0", new Object[]{this, new Integer(i)});
        } else if (fqi.G() && getDXRuntimeContext().G() && i == 0) {
            fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (DXAbsContainerBaseLayout.this.dXRuntimeContext != null) {
                        DXAbsContainerBaseLayout.this.dXRuntimeContext.d(i);
                    }
                    if (DXAbsContainerBaseLayout.this.d() == null) {
                        return;
                    }
                    for (DXWidgetNode dXWidgetNode : DXAbsContainerBaseLayout.this.d()) {
                        dXWidgetNode.updateRefreshType(i);
                    }
                }
            });
        } else {
            if (this.dXRuntimeContext != null) {
                this.dXRuntimeContext.d(i);
            }
            if (d() == null) {
                return;
            }
            for (DXWidgetNode dXWidgetNode : d()) {
                dXWidgetNode.updateRefreshType(i);
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        fuw.b(TAG, "收到loadMore1");
        a(2);
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            postEvent(new DXEvent(-2277119638481222228L));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue() : super.onEvent(dXEvent);
    }

    public boolean a(int i) {
        RecyclerView b;
        com.taobao.android.dinamicx.widget.recycler.h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        WaterfallLayout waterfallLayout = this.b;
        if (waterfallLayout == null || (b = waterfallLayout.b()) == null || (hVar = (com.taobao.android.dinamicx.widget.recycler.h) b.getAdapter()) == null) {
            return false;
        }
        hVar.i(i);
        fuw.b(TAG, "更新状态" + i);
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindRuntimeContext(DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9a0548", new Object[]{this, dXRuntimeContext, new Boolean(z)});
        } else if (dXRuntimeContext != null) {
            Object obj = null;
            if (z) {
                obj = this.dXRuntimeContext.f();
                i = this.dXRuntimeContext.i();
            }
            if (this.dXRuntimeContext != dXRuntimeContext) {
                this.dXRuntimeContext = dXRuntimeContext.a((DXWidgetNode) this);
                if (z) {
                    this.dXRuntimeContext.a(obj);
                    this.dXRuntimeContext.b(i);
                }
            }
            if (d() == null) {
                return;
            }
            for (DXWidgetNode dXWidgetNode : d()) {
                dXWidgetNode.bindRuntimeContext(dXRuntimeContext, z);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof DXAbsContainerBaseLayout)) {
        } else {
            super.onClone(dXWidgetNode, z);
            DXAbsContainerBaseLayout dXAbsContainerBaseLayout = (DXAbsContainerBaseLayout) dXWidgetNode;
            this.f11994a = dXAbsContainerBaseLayout.f11994a;
            a(dXAbsContainerBaseLayout.d());
            this.d = dXAbsContainerBaseLayout.d;
            this.c = dXAbsContainerBaseLayout.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getMarginLeft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2087f1c5", new Object[]{this})).intValue() : super.getMarginLeft();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getMarginRight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2ddec852", new Object[]{this})).intValue() : super.getMarginRight();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public JSONArray exportMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7cac5ab9", new Object[]{this});
        }
        if (this.g == null) {
            this.g = new JSONArray() { // from class: com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout.2
            };
            this.g.addAll(super.exportMethods());
        }
        return this.g;
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        removeAllChild();
        super.onMeasure(i, i2);
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == -5948810534719014123L) {
            if (fqi.ay()) {
                List<Object> list = this.f11994a;
                int size = list != null ? list.size() : 0;
                this.f11994a = jSONArray;
                this.propertyInitFlag |= 2;
                List<Object> list2 = this.f11994a;
                if (list2 != null) {
                    i = list2.size();
                }
                if (i == size) {
                    return;
                }
                this.dataSizeChange = true;
                return;
            }
            this.f11994a = jSONArray;
            this.propertyInitFlag |= 2;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXABSCONTAINERBASELAYOUT_POSTEVENTSAMPLING) {
            if (i <= 0) {
                i = 1;
            }
            this.h = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : super.getDefaultValueForStringAttr(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.widget.ac a(com.taobao.android.dinamicx.widget.DXWidgetNode r6, java.lang.Object r7, int r8, com.taobao.analysis.v3.n r9) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout.a(com.taobao.android.dinamicx.widget.DXWidgetNode, java.lang.Object, int, com.taobao.analysis.v3.n):com.taobao.android.dinamicx.widget.ac");
    }

    public List<Object> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.f11994a;
    }

    public void a(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1059b339", new Object[]{this, new Integer(i), str, str2, str3});
        } else {
            com.taobao.android.dinamicx.monitor.b.a(getDXRuntimeContext().A(), getDXRuntimeContext().c(), DXMonitorConstant.DX_MONITOR_RECYCLER, DXMonitorConstant.DX_MONITOR_RECYCLER_ERROR, i, str);
        }
    }

    public List<DXWidgetNode> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.f;
    }

    public void a(List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f = (ArrayList) list;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetUserDefinedListAttribute(long j, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e671484b", new Object[]{this, new Long(j), list});
        } else if (-5948810534719014123L == j) {
            this.f11994a = list;
            this.propertyInitFlag |= 2;
        } else {
            super.onSetUserDefinedListAttribute(j, list);
        }
    }
}
