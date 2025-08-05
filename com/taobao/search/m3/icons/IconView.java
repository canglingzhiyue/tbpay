package com.taobao.search.m3.icons;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.BaseItemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class IconView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int iconHeight;
    private static final int iconRightPadding;
    private static final int itemMargin;
    private static final int itemPadding;
    private static final int viewHeight;
    private b currentInfo;
    private final ArrayList<com.taobao.search.m3.icons.a> drawList;
    private g exposeListener;
    private boolean onlyAdIcon;
    private final com.taobao.search.m3.f provider;
    private int totalWidth;
    private final boolean waterfall;

    public static /* synthetic */ Object ipc$super(IconView iconView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(822471632);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : IconView.access$getIconHeight$cp();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconView(Context context, com.taobao.search.m3.f provider, boolean z) {
        super(context);
        q.c(provider, "provider");
        this.provider = provider;
        this.waterfall = z;
        this.drawList = new ArrayList<>();
    }

    public static final /* synthetic */ int access$getIconHeight$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("10532b15", new Object[0])).intValue() : iconHeight;
    }

    static {
        kge.a(-2024043896);
        Companion = new a(null);
        int a2 = l.a(14.0f);
        viewHeight = a2;
        iconHeight = a2;
        itemMargin = l.a(4.0f);
        itemPadding = l.a(1.5f);
        iconRightPadding = l.a(3.0f);
    }

    @Override // com.taobao.search.m3.BaseItemView
    public boolean isWrapContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("920aeb50", new Object[]{this})).booleanValue() : this.onlyAdIcon;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getWrapContentWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fe693fa7", new Object[]{this})).intValue() : this.totalWidth;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (!this.onlyAdIcon && this.waterfall) {
            measuredWidth -= iconRightPadding;
        }
        this.totalWidth = 0;
        Iterator<com.taobao.search.m3.icons.a> it = this.drawList.iterator();
        int i = measuredWidth;
        boolean z = true;
        while (it.hasNext()) {
            com.taobao.search.m3.icons.a next = it.next();
            int c = next.c();
            if (!next.j()) {
                c += z ? itemPadding : itemPadding * 2;
            }
            if (i < c) {
                next.a(false);
                next.b();
            } else {
                this.totalWidth += c;
                if (!z) {
                    this.totalWidth += itemMargin;
                } else {
                    z = false;
                }
                next.a(true);
                next.d();
                i = (i - itemMargin) - c;
            }
        }
        b bVar = this.currentInfo;
        if (bVar == null || bVar.c()) {
            return;
        }
        bVar.a(true);
        g gVar = this.exposeListener;
        if (gVar == null) {
            return;
        }
        gVar.a(getDisplayIcons());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.m3.icons.IconView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r9
            r1[r3] = r10
            java.lang.String r10 = "bd69fddb"
            r0.ipc$dispatch(r10, r1)
            return
        L15:
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.q.c(r10, r0)
            java.util.ArrayList<com.taobao.search.m3.icons.a> r0 = r9.drawList
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r3 = 0
            r4 = 1
        L23:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L7c
            java.lang.Object r5 = r0.next()
            com.taobao.search.m3.icons.a r5 = (com.taobao.search.m3.icons.a) r5
            boolean r6 = r5.a()
            if (r6 == 0) goto L23
            if (r4 != 0) goto L44
            boolean r6 = r5.j()
            if (r6 != 0) goto L45
            int r6 = com.taobao.search.m3.icons.IconView.itemPadding
            float r6 = (float) r6
            r10.translate(r6, r1)
            goto L46
        L44:
            r4 = 0
        L45:
            r6 = 0
        L46:
            r5.a(r10)
            boolean r7 = r5.j()
            if (r7 == 0) goto L5c
            int r7 = r5.c()
            float r7 = (float) r7
            int r8 = com.taobao.search.m3.icons.IconView.itemMargin
            float r8 = (float) r8
            float r7 = r7 + r8
            r10.translate(r7, r1)
            goto L70
        L5c:
            int r7 = com.taobao.search.m3.icons.IconView.itemPadding
            float r7 = (float) r7
            float r6 = r6 + r7
            int r7 = r5.c()
            float r7 = (float) r7
            int r8 = com.taobao.search.m3.icons.IconView.itemMargin
            float r8 = (float) r8
            float r7 = r7 + r8
            int r8 = com.taobao.search.m3.icons.IconView.itemPadding
            float r8 = (float) r8
            float r7 = r7 + r8
            r10.translate(r7, r1)
        L70:
            int r5 = r5.c()
            float r5 = (float) r5
            float r3 = r3 + r5
            int r5 = com.taobao.search.m3.icons.IconView.itemMargin
            float r5 = (float) r5
            float r3 = r3 + r5
            float r3 = r3 + r6
            goto L23
        L7c:
            float r0 = -r3
            r10.translate(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.m3.icons.IconView.onDraw(android.graphics.Canvas):void");
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue() : viewHeight;
    }

    public final List<c> getDisplayIcons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("64cf632", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList(this.drawList.size());
        Iterator<com.taobao.search.m3.icons.a> it = this.drawList.iterator();
        while (it.hasNext()) {
            com.taobao.search.m3.icons.a next = it.next();
            if (next.a()) {
                arrayList.add(next.i());
            }
        }
        return arrayList;
    }

    public final void update(b iconInfo, boolean z, g listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa45fff", new Object[]{this, iconInfo, new Boolean(z), listener});
            return;
        }
        q.c(iconInfo, "iconInfo");
        q.c(listener, "listener");
        this.exposeListener = listener;
        if (this.currentInfo == iconInfo) {
            return;
        }
        this.onlyAdIcon = z;
        reset();
        this.currentInfo = iconInfo;
        updateDrawList();
    }

    private final void updateDrawList() {
        List<c> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4f46af2", new Object[]{this});
            return;
        }
        release();
        this.drawList.clear();
        if (this.onlyAdIcon) {
            b bVar = this.currentInfo;
            if (bVar == null) {
                q.a();
            }
            a2 = bVar.b();
        } else {
            b bVar2 = this.currentInfo;
            if (bVar2 == null) {
                q.a();
            }
            a2 = bVar2.a();
        }
        if (a2 == null) {
            return;
        }
        for (c cVar : a2) {
            if (cVar == null) {
                q.a();
            }
            String c = cVar.c();
            int hashCode = c.hashCode();
            if (hashCode != -1551543255) {
                if (hashCode == 104387) {
                    if (c.equals("img")) {
                        this.drawList.add(new d(cVar, this));
                    }
                } else if (hashCode == 3556653 && c.equals("text") && !TextUtils.isEmpty(cVar.d())) {
                    this.drawList.add(new f(cVar, this, this.provider));
                }
            } else if (c.equals("richText")) {
                this.drawList.add(new e(cVar, this, this.provider));
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        load();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        release();
    }

    private final void load() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
            return;
        }
        Iterator<com.taobao.search.m3.icons.a> it = this.drawList.iterator();
        while (it.hasNext()) {
            com.taobao.search.m3.icons.a next = it.next();
            if (next.a()) {
                next.d();
            }
        }
    }

    private final void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        Iterator<com.taobao.search.m3.icons.a> it = this.drawList.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }
}
