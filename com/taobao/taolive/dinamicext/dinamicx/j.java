package com.taobao.taolive.dinamicext.dinamicx;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.taolive.uikit.view.TBMaskView;
import com.taobao.weex.common.Constants;
import tb.kge;

/* loaded from: classes8.dex */
public class j extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLMASKVIEW_TBENDCOLOR = 5793645708615970550L;
    public static final long DXTBLMASKVIEW_TBID = 38174466807L;
    public static final long DXTBLMASKVIEW_TBLMASKVIEW = -1112551920354485228L;
    public static final long DXTBLMASKVIEW_TBORIENTATION = 3892001199285555311L;
    public static final long DXTBLMASKVIEW_TBSTARTCOLOR = -1401304785392888081L;

    /* renamed from: a  reason: collision with root package name */
    private String f21418a;
    private Object b;
    private String c = Constants.Value.HORIZONTAL;
    private String d;

    static {
        kge.a(400750596);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* loaded from: classes8.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1088189733);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new j();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new j();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof j)) {
        } else {
            super.onClone(dXWidgetNode, z);
            j jVar = (j) dXWidgetNode;
            this.f21418a = jVar.f21418a;
            this.b = jVar.b;
            this.c = jVar.c;
            this.d = jVar.d;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new TBMaskView(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRenderView(android.content.Context r7, android.view.View r8) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taolive.dinamicext.dinamicx.j.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r6
            r1[r3] = r7
            r1[r2] = r8
            java.lang.String r7 = "ede516ab"
            r0.ipc$dispatch(r7, r1)
            return
        L18:
            super.onRenderView(r7, r8)
            boolean r7 = r8 instanceof com.taobao.taolive.uikit.view.TBMaskView
            if (r7 == 0) goto L6e
            com.taobao.taolive.uikit.view.TBMaskView r8 = (com.taobao.taolive.uikit.view.TBMaskView) r8
            java.lang.Object r7 = r6.b
            if (r7 == 0) goto L28
            r8.setTag(r7)
        L28:
            java.lang.String r7 = r6.c
            boolean r7 = android.text.StringUtils.isEmpty(r7)
            if (r7 != 0) goto L6e
            java.lang.String r7 = r6.d     // Catch: java.lang.Exception -> L3f
            int r7 = tb.prf.a(r7)     // Catch: java.lang.Exception -> L3f
            java.lang.String r0 = r6.f21418a     // Catch: java.lang.Exception -> L3d
            int r0 = tb.prf.a(r0)     // Catch: java.lang.Exception -> L3d
            goto L45
        L3d:
            r0 = move-exception
            goto L41
        L3f:
            r0 = move-exception
            r7 = 0
        L41:
            r0.printStackTrace()
            r0 = 0
        L45:
            java.lang.String r1 = r6.c
            java.lang.String r5 = "vertical"
            boolean r1 = r5.endsWith(r1)
            if (r1 == 0) goto L5e
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r5 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r2 = new int[r2]
            r2[r4] = r7
            r2[r3] = r0
            r1.<init>(r5, r2)
            goto L6b
        L5e:
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r5 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            int[] r2 = new int[r2]
            r2[r4] = r7
            r2[r3] = r0
            r1.<init>(r5, r2)
        L6b:
            r8.setMask(r1)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.dinamicext.dinamicx.j.onRenderView(android.content.Context, android.view.View):void");
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == 38174466807L) {
            this.b = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXTBLMASKVIEW_TBENDCOLOR) {
            this.f21418a = str;
        } else if (j == DXTBLMASKVIEW_TBORIENTATION) {
            this.c = str;
        } else if (j == DXTBLMASKVIEW_TBSTARTCOLOR) {
            this.d = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : j == DXTBLMASKVIEW_TBORIENTATION ? Constants.Value.HORIZONTAL : super.getDefaultValueForStringAttr(j);
    }
}
