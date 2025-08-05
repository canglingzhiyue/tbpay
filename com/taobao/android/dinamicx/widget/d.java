package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeAdaptiveLinearLayout;
import java.util.List;
import tb.ivg;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXADAPTIVELINEARLAYOUT_ALWAYSSHOWINDICATOR = 2031908517150824674L;
    public static final long DXADAPTIVELINEARLAYOUT_IGNOREPARENTMEASURE = 7254937418530680787L;
    public static final long DXADAPTIVELINEARLAYOUT_MOREINDICATORUSERID = -205834946367932241L;
    public static final long DXADAPTIVELINEARLAYOUT_USENEWMEASURESPEC_ANDROID = 3254316919567709453L;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12093a = false;
    private boolean b = false;
    private String c;
    private boolean d;
    private DXWidgetNode e;
    private DXWidgetNode f;

    static {
        kge.a(-885541513);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 895336024:
                super.onBeforeBindChildDataWithButter();
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-14080690);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new d();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new d();
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof d)) {
        } else {
            super.onClone(dXWidgetNode, z);
            d dVar = (d) dXWidgetNode;
            this.b = dVar.b;
            this.c = dVar.c;
            this.f12093a = dVar.f12093a;
            this.d = dVar.d;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXADAPTIVELINEARLAYOUT_MOREINDICATORUSERID) {
            this.c = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXADAPTIVELINEARLAYOUT_ALWAYSSHOWINDICATOR) {
            if (i != 0) {
                z = true;
            }
            this.b = z;
        } else if (j == DXADAPTIVELINEARLAYOUT_USENEWMEASURESPEC_ANDROID) {
            if (i == 1) {
                z = true;
            }
            this.f12093a = z;
        } else if (j == DXADAPTIVELINEARLAYOUT_IGNOREPARENTMEASURE) {
            if (i == 1) {
                z = true;
            }
            this.d = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j != DXADAPTIVELINEARLAYOUT_ALWAYSSHOWINDICATOR) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXNativeAdaptiveLinearLayout(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    @Override // com.taobao.android.dinamicx.widget.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measureVertical(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.d.measureVertical(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    @Override // com.taobao.android.dinamicx.widget.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measureHorizontal(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.d.measureHorizontal(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9 A[LOOP:3: B:54:0x00e3->B:56:0x00e9, LOOP_END] */
    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBeforeBindChildData() {
        /*
            r13 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx.widget.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r13
            java.lang.String r2 = "92a35092"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            int r0 = r13.propertyInitFlag
            r0 = r0 & 2
            if (r0 != 0) goto L19
            return
        L19:
            com.alibaba.fastjson.JSONArray r0 = r13.getListData()
            if (r0 == 0) goto Lf6
            com.alibaba.fastjson.JSONArray r0 = r13.getListData()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lf6
            java.util.List r0 = r13.getChildren()
            if (r0 != 0) goto L31
            goto Lf6
        L31:
            java.lang.String r0 = r13.c
            r1 = 0
            if (r0 == 0) goto L44
            com.taobao.android.dinamicx.widget.DXWidgetNode r0 = r13.queryWTByUserId(r0)
            if (r0 == 0) goto L45
            int r4 = r0.getAutoId()
            r13.removeChildWithAutoId(r4)
            goto L46
        L44:
            r0 = r1
        L45:
            r2 = 0
        L46:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = com.taobao.android.dinamicx.bx.o()
            if (r5 != 0) goto Lc2
            java.util.List r5 = r13.getChildren()
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r6 = 0
        L58:
            com.alibaba.fastjson.JSONArray r7 = r13.getListData()
            int r7 = r7.size()
            if (r6 >= r7) goto Ldd
            com.alibaba.fastjson.JSONArray r7 = r13.getListData()
            java.lang.Object r7 = r7.get(r6)
            com.taobao.android.dinamicx.widget.bg r8 = r13.getDxv3VariableInfo()
            if (r8 == 0) goto L79
            com.taobao.android.dinamicx.widget.bg r8 = r13.getDxv3VariableInfo()
            com.taobao.android.dinamicx.widget.bg r8 = r8.b()
            goto L7a
        L79:
            r8 = r1
        L7a:
            if (r6 != 0) goto L90
            java.util.Iterator r9 = r5.iterator()
        L80:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lbf
            java.lang.Object r10 = r9.next()
            com.taobao.android.dinamicx.widget.DXWidgetNode r10 = (com.taobao.android.dinamicx.widget.DXWidgetNode) r10
            r13.bindContext(r10, r7, r6, r8)
            goto L80
        L90:
            java.util.Iterator r9 = r5.iterator()
        L94:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lbf
            java.lang.Object r10 = r9.next()
            com.taobao.android.dinamicx.widget.DXWidgetNode r10 = (com.taobao.android.dinamicx.widget.DXWidgetNode) r10
            com.taobao.android.dinamicx.DXRuntimeContext r11 = r10.getDXRuntimeContext()
            com.taobao.android.dinamicx.DXRuntimeContext r11 = r11.a(r10)
            r11.a(r7)
            r11.b(r6)
            com.taobao.android.dinamicx.widget.bg r12 = r13.getDxv3VariableInfo()
            if (r12 == 0) goto Lb7
            r11.a(r8)
        Lb7:
            com.taobao.android.dinamicx.widget.DXWidgetNode r10 = com.taobao.android.dinamicx.widget.n.a(r10, r11)
            r4.add(r10)
            goto L94
        Lbf:
            int r6 = r6 + 1
            goto L58
        Lc2:
            com.taobao.android.dinamicx.widget.DXWidgetNode r5 = r13.getOriginNode()
            if (r5 == 0) goto Ld0
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = r13.getOriginNode()
            java.util.List r1 = r1.getChildren()
        Ld0:
            if (r1 == 0) goto Lda
            com.alibaba.fastjson.JSONArray r4 = r13.getListData()
            java.util.ArrayList r4 = r13.generateWidgetNodeByDataNew(r3, r4, r1)
        Lda:
            r13.removeAllChild()
        Ldd:
            if (r2 == 0) goto Le2
            r4.add(r0)
        Le2:
            r0 = 0
        Le3:
            int r1 = r4.size()
            if (r0 >= r1) goto Lf5
            java.lang.Object r1 = r4.get(r0)
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = (com.taobao.android.dinamicx.widget.DXWidgetNode) r1
            r13.addChild(r1, r3)
            int r0 = r0 + 1
            goto Le3
        Lf5:
            return
        Lf6:
            r13.removeAllChild()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.d.onBeforeBindChildData():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBeforeBindChildDataWithButter() {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx.widget.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r5
            java.lang.String r2 = "355dbe58"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            int r0 = r5.propertyInitFlag
            r0 = r0 & 2
            if (r0 != 0) goto L19
            return
        L19:
            r0 = 0
            java.lang.String r1 = r5.c
            if (r1 == 0) goto L4e
            com.taobao.android.dinamicx.widget.DXWidgetNode r0 = r5.getOriginNode()
            com.taobao.android.dinamicx.widget.d r0 = (com.taobao.android.dinamicx.widget.d) r0
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = r0.f
            if (r1 != 0) goto L3d
            java.lang.String r1 = r5.c
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = r0.a(r1)
            if (r1 == 0) goto L3a
            r0.f = r1
            int r4 = r1.getAutoId()
            r0.removeChildWithAutoId(r4)
            goto L3d
        L3a:
            r0 = r1
            r2 = 0
            goto L3e
        L3d:
            r0 = r1
        L3e:
            java.lang.String r1 = r5.c
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = r5.queryWTByUserId(r1)
            int r1 = r5.indexOf(r1)
            if (r1 <= 0) goto L4f
            r5.a(r1)
            goto L4f
        L4e:
            r2 = 0
        L4f:
            super.onBeforeBindChildDataWithButter()
            if (r2 == 0) goto L66
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = r5.e
            if (r1 != 0) goto L60
            com.taobao.android.dinamicx.DXRuntimeContext r1 = r5.getDXRuntimeContext()
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = r0.shallowButterClone(r1)
        L60:
            r1.setVisibility(r3)
            r5.addChild(r1, r3)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.d.onBeforeBindChildDataWithButter():void");
    }

    private DXWidgetNode a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("8fea1d51", new Object[]{this, str});
        }
        List<DXWidgetNode> children = getOriginNode().getChildren();
        if (children == null) {
            return null;
        }
        for (int i = 0; i < children.size(); i++) {
            DXWidgetNode dXWidgetNode = children.get(i);
            ivg ivgVar = dXWidgetNode.getConstAttributeMap().get(10297924263834610L);
            if (ivgVar != null && str.equals(ivgVar.e)) {
                return dXWidgetNode;
            }
        }
        return null;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        DXWidgetNode childAt = getChildAt(i);
        removeChildAt(i);
        ViewGroup viewContainer = childAt.getViewContainer();
        View nativeView = childAt.getNativeView();
        if (viewContainer != null && nativeView != null) {
            viewContainer.removeView(nativeView);
        }
        this.e = childAt;
    }
}
