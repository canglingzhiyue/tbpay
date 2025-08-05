package com.alibaba.android.icart.core.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bbz;
import tb.bca;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class z extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1105092050);
    }

    public static /* synthetic */ Object ipc$super(z zVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r1.equals("openSearch") == false) goto L24;
     */
    @Override // com.alibaba.android.ultron.trade.event.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(tb.bmz r9) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.android.icart.core.event.z.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r2] = r8
            r1[r3] = r9
            java.lang.String r9 = "d08b596a"
            r0.ipc$dispatch(r9, r1)
            return
        L15:
            tb.bbz r0 = r8.f25791a
            java.lang.String r1 = r9.b()
            r5 = -1
            int r6 = r1.hashCode()
            r7 = -565331776(0xffffffffde4db8c0, float:-3.70595232E18)
            if (r6 == r7) goto L43
            r7 = 158651840(0x974d5c0, float:2.9470936E-33)
            if (r6 == r7) goto L39
            r7 = 334239890(0x13ec1892, float:5.9599004E-27)
            if (r6 == r7) goto L30
            goto L4d
        L30:
            java.lang.String r6 = "openSearch"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4d
            goto L4e
        L39:
            java.lang.String r2 = "closeSearch"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4d
            r2 = 1
            goto L4e
        L43:
            java.lang.String r2 = "searchClick"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4d
            r2 = 2
            goto L4e
        L4d:
            r2 = -1
        L4e:
            if (r2 == 0) goto L5d
            if (r2 == r3) goto L59
            if (r2 == r4) goto L55
            goto L58
        L55:
            r8.b(r0)
        L58:
            return
        L59:
            r8.a(r0)
            return
        L5d:
            r8.a(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.icart.core.event.z.b(tb.bmz):void");
    }

    private void a(bbz bbzVar, bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e638e0df", new Object[]{this, bbzVar, bmzVar});
            return;
        }
        bbzVar.p().a();
        bbzVar.n().b("search_");
        bbzVar.x().n();
        bmz a2 = this.f25791a.F().a();
        a2.c(bmzVar.f());
        a2.a("openPopupWindow");
        a2.a(this.d.e());
        a2.a(this.h);
        this.f25791a.F().a(a2);
    }

    private void a(bbz bbzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16d505e", new Object[]{this, bbzVar});
        } else {
            bbzVar.p().b();
        }
    }

    private void b(bbz bbzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff056df", new Object[]{this, bbzVar});
        } else {
            bbzVar.p().a(this.d);
        }
    }
}
