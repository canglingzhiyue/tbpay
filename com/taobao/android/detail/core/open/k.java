package com.taobao.android.detail.core.open;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import java.util.ArrayList;
import java.util.List;
import tb.ehu;
import tb.ehw;
import tb.emu;
import tb.epe;
import tb.kge;

/* loaded from: classes4.dex */
public class k implements ehw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<ehw> f9777a = new ArrayList();

    static {
        kge.a(1360515836);
        kge.a(1339695439);
    }

    public k() {
        emu.a("com.taobao.android.detail.core.open.DetailStructureCustomizerManager");
    }

    public void a(ehw ehwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6df0a24", new Object[]{this, ehwVar});
        } else if (this.f9777a.contains(ehwVar)) {
        } else {
            this.f9777a.add(ehwVar);
        }
    }

    @Override // tb.ehw
    public ehu a(DetailCoreActivity detailCoreActivity, epe epeVar) {
        ehu a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ehu) ipChange.ipc$dispatch("edaf856b", new Object[]{this, detailCoreActivity, epeVar});
        }
        for (int size = this.f9777a.size() - 1; size >= 0; size--) {
            try {
                a2 = this.f9777a.get(size).a(detailCoreActivity, epeVar);
            } catch (Throwable th) {
                com.taobao.android.detail.core.utils.i.a("DetailStructureCustomizerManager", "getCustomActionBar", th);
            }
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // tb.ehw
    public List<epe> a(List<epe> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        for (int size = this.f9777a.size() - 1; size >= 0; size--) {
            try {
                List<epe> a2 = this.f9777a.get(size).a(list);
                if (a2 != null && !a2.isEmpty()) {
                    return a2;
                }
            } catch (Throwable th) {
                com.taobao.android.detail.core.utils.i.a("DetailStructureCustomizerManager", "preHandleDetailController", th);
            }
        }
        return list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
        if (r10.equals("detailInfo") != false) goto L29;
     */
    @Override // tb.ehw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.detail.core.detail.widget.container.a b(com.taobao.android.detail.core.detail.activity.DetailCoreActivity r9, tb.epe r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.core.open.k.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r1 == 0) goto L1b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r2] = r8
            r1[r5] = r9
            r1[r3] = r10
            java.lang.String r9 = "be4c379c"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            com.taobao.android.detail.core.detail.widget.container.a r9 = (com.taobao.android.detail.core.detail.widget.container.a) r9
            return r9
        L1b:
            java.util.List<tb.ehw> r0 = r8.f9777a
            int r0 = r0.size()
            int r0 = r0 - r5
        L22:
            if (r0 < 0) goto L3e
            java.util.List<tb.ehw> r1 = r8.f9777a
            java.lang.Object r1 = r1.get(r0)
            tb.ehw r1 = (tb.ehw) r1
            com.taobao.android.detail.core.detail.widget.container.a r1 = r1.b(r9, r10)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L3b
            return r1
        L33:
            r1 = move-exception
            java.lang.String r6 = "DetailStructureCustomizerManager"
            java.lang.String r7 = "getDetailController"
            com.taobao.android.detail.core.utils.i.a(r6, r7, r1)
        L3b:
            int r0 = r0 + (-1)
            goto L22
        L3e:
            com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel r0 = r10.component
            r1 = 0
            if (r0 == 0) goto L48
            com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel r10 = r10.component
            java.lang.String r10 = r10.type
            goto L5a
        L48:
            com.taobao.android.ultron.common.model.IDMComponent r0 = r10.dmComponent
            if (r0 == 0) goto L59
            com.taobao.android.ultron.common.model.IDMComponent r10 = r10.dmComponent
            com.alibaba.fastjson.JSONObject r10 = r10.getFields()
            java.lang.String r0 = "type"
            java.lang.String r10 = r10.getString(r0)
            goto L5a
        L59:
            r10 = r1
        L5a:
            int r0 = r10.hashCode()
            r6 = 4
            switch(r0) {
                case -1977517709: goto L8a;
                case -1036780926: goto L80;
                case -1036623713: goto L77;
                case 149310114: goto L6d;
                case 364720301: goto L63;
                default: goto L62;
            }
        L62:
            goto L94
        L63:
            java.lang.String r0 = "division"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L94
            r2 = 4
            goto L95
        L6d:
            java.lang.String r0 = "detailInfoAura"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L94
            r2 = 2
            goto L95
        L77:
            java.lang.String r0 = "detailInfo"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L94
            goto L95
        L80:
            java.lang.String r0 = "detailDesc"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L94
            r2 = 3
            goto L95
        L8a:
            java.lang.String r0 = "detailInfoUltron"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L94
            r2 = 1
            goto L95
        L94:
            r2 = -1
        L95:
            if (r2 == 0) goto Lac
            if (r2 == r5) goto Lac
            if (r2 == r3) goto Lac
            if (r2 == r4) goto La6
            if (r2 == r6) goto La0
            return r1
        La0:
            tb.dye r10 = new tb.dye
            r10.<init>(r9)
            return r10
        La6:
            tb.dyd r10 = new tb.dyd
            r10.<init>(r9)
            return r10
        Lac:
            tb.dyf r10 = new tb.dyf
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.open.k.b(com.taobao.android.detail.core.detail.activity.DetailCoreActivity, tb.epe):com.taobao.android.detail.core.detail.widget.container.a");
    }
}
