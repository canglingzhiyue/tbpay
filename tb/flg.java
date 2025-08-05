package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.detail2.core.framework.view.manager.ListViewManager;
import java.util.List;

/* loaded from: classes5.dex */
public class flg extends flf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long d;

    static {
        kge.a(1176231323);
    }

    public static /* synthetic */ Object ipc$super(flg flgVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -936327841) {
            if (hashCode != 654903500) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.a(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        }
        return new Boolean(super.a(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (JSONObject) objArr[2], (List) objArr[3], ((Number) objArr[4]).intValue(), ((Boolean) objArr[5]).booleanValue()));
    }

    public flg(b bVar, fmd fmdVar, DetailDataManager detailDataManager) {
        super(bVar, fmdVar, detailDataManager);
    }

    @Override // tb.flf, com.taobao.android.detail2.core.framework.data.DetailDataManager.a
    public boolean a(boolean z, int i, JSONObject jSONObject, List<d> list, int i2, boolean z2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c830c55f", new Object[]{this, new Boolean(z), new Integer(i), jSONObject, list, new Integer(i2), new Boolean(z2)})).booleanValue();
        }
        a(z, i, jSONObject);
        if (this.c.h().O()) {
            this.c.h().G().mHasRefresh = true;
            a(true);
            this.f28027a.b(list);
            this.b.b(this.f28027a.m().size());
        } else if (DetailDataManager.a(z, i)) {
            z3 = a(list);
            if (z2) {
                this.c.h().c(this.f28027a.M());
            }
            this.b.b(this.f28027a.m().size());
        } else if (z) {
            this.f28027a.c(true);
            this.f28027a.c(list);
            DetailDataManager detailDataManager = this.b;
            if (list != null) {
                i3 = list.size();
            }
            detailDataManager.a(i3);
        } else {
            this.f28027a.d(list);
            if (z2) {
                this.c.h().c(this.f28027a.M());
            }
            DetailDataManager detailDataManager2 = this.b;
            if (list != null) {
                i3 = list.size();
            }
            detailDataManager2.a(i3);
        }
        fmd fmdVar = this.f28027a;
        long j = this.d + 1;
        this.d = j;
        fmdVar.a(j);
        if (!z) {
            this.f28027a.a(ListViewManager.ListStatus.STATUS_PULL_LOAD_MORE);
        }
        super.a(z, i, jSONObject, list, i2, z2);
        return z3;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) String.valueOf(z));
        this.f28027a.a("refreshResult", jSONObject);
    }

    private void a(boolean z, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4856cb9", new Object[]{this, new Boolean(z), new Integer(i), jSONObject});
        } else if (jSONObject == null || !DetailDataManager.a(z, i)) {
        } else {
            this.f28027a.u();
        }
    }

    @Override // tb.flf, com.taobao.android.detail2.core.framework.data.DetailDataManager.a
    public void a(boolean z, String str, d dVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903e0c8", new Object[]{this, new Boolean(z), str, dVar, new Boolean(z2)});
        } else {
            a(true, false, dVar.k, dVar);
        }
    }

    @Override // tb.flf, com.taobao.android.detail2.core.framework.data.DetailDataManager.a
    public void a(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270908cc", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        super.a(z, i, i2);
        if (!DetailDataManager.a(z, i)) {
            return;
        }
        if (this.c.h().O()) {
            a(false);
            fjt.a(fjt.TAG_REFRESH_DATA, "刷新数据失败,errorCode = " + i2);
        } else if (i2 == 2) {
        } else {
            fkr h = this.c.h();
            d a2 = this.b.a(h.f(), h.I());
            a(true, false, a2.k, a2);
        }
    }

    @Override // tb.flf, com.taobao.android.detail2.core.framework.data.DetailDataManager.a
    public boolean a(boolean z, String str, int i, d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ecde17e7", new Object[]{this, new Boolean(z), str, new Integer(i), dVar})).booleanValue() : z || !"0".equals(str) || i != 0;
    }

    @Override // tb.flf, com.taobao.android.detail2.core.framework.data.DetailDataManager.a
    public boolean b(boolean z, String str, int i, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd576de8", new Object[]{this, new Boolean(z), str, new Integer(i), dVar})).booleanValue();
        }
        if (!z && "0".equals(str) && i == 0) {
            if (a() && !TextUtils.equals(this.c.h().f(), dVar.k)) {
                dVar.y = true;
                dVar.D();
                fjp.b(dVar, "recommend", fjp.ERROR_CODE_RECOMMEND_ITEM_ID_INCONSISTENCY, "推荐数据返回的itemid与入口id不一致, 入口id：" + this.c.h().f() + ", 当前id：" + dVar.k, true);
            } else {
                dVar.y = !dVar.q();
                if (dVar.y) {
                    fjp.b(dVar, "recommend", fjp.ERROR_CODE_RECOMMEND_FIRST_NODE_DETAIL_INFO_EMPTY, "推荐数据返回的首个节点detailinfo为空", true);
                }
            }
            return true;
        }
        boolean q = dVar.q();
        if (!q) {
            fjp.b(dVar, "recommend", fjp.ERROR_CODE_RECOMMEND_NODE_DETAIL_INFO_EMPTY, "推荐数据返回的节点detailinfo为空, 当前id：" + dVar.k, true);
        }
        return q;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        fkx Q = this.c.h().Q();
        return (Q == null || !Q.a() || Q.c()) && !fkr.NO_ID_DEFAULT.equals(this.c.h().f());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.util.List<com.taobao.android.detail2.core.framework.data.model.d> r11) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.flg.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r2] = r11
            java.lang.String r11 = "c705295d"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L1c:
            java.lang.Object r0 = r11.get(r3)
            com.taobao.android.detail2.core.framework.data.model.d r0 = (com.taobao.android.detail2.core.framework.data.model.d) r0
            com.taobao.android.detail2.core.framework.b r1 = r10.c
            tb.fkr r1 = r1.h()
            int r4 = r11.size()
            com.taobao.android.detail2.core.framework.b r5 = r10.c
            tb.fkr r5 = r5.h()
            java.lang.String r6 = r0.g
            boolean r5 = r5.a(r3, r6)
            r1.a(r4, r5)
            boolean r1 = r0.y
            if (r1 == 0) goto L61
            com.taobao.android.detail2.core.framework.data.DetailDataManager r1 = r10.b
            com.taobao.android.detail2.core.framework.b r4 = r10.c
            tb.fkr r4 = r4.h()
            java.lang.String r4 = r4.f()
            java.lang.String r0 = r0.g
            com.taobao.android.detail2.core.framework.data.model.d r0 = r1.a(r4, r0)
            boolean r1 = r0.y
            if (r1 == 0) goto L57
            r1 = 0
            goto L62
        L57:
            java.lang.String r1 = "recommend"
            java.lang.String r4 = "10063"
            java.lang.String r5 = "首卡错误，但是有兜底数据或者瞬开数据，将列表数据追加"
            tb.fjp.a(r0, r1, r4, r5)
        L61:
            r1 = 1
        L62:
            boolean r4 = r0.r()
            if (r4 == 0) goto L6d
            tb.fmd r4 = r10.f28027a
            r4.g()
        L6d:
            java.lang.String r4 = r0.k
            r10.a(r2, r3, r4, r0)
            if (r1 != 0) goto L75
            return r3
        L75:
            int r1 = r11.size()
            java.util.List r1 = r11.subList(r2, r1)
            tb.fmd r4 = r10.f28027a
            r4.d(r1)
            com.taobao.android.detail2.core.framework.b r1 = r10.c
            android.app.Activity r1 = r1.g()
            tb.fky.a(r1, r0)
            boolean r0 = tb.ipa.K()
            if (r0 != 0) goto Lb5
            com.taobao.android.detail2.core.framework.b r0 = r10.c
            com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout$d r0 = r0.k()
            if (r0 == 0) goto Lb6
            com.taobao.android.detail2.core.framework.b r0 = r10.c
            com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout$d r0 = r0.k()
            boolean r0 = r0.b()
            if (r0 == 0) goto Lb6
            com.taobao.android.detail2.core.framework.b r0 = r10.c
            tb.fkr r0 = r0.h()
            tb.fkt r0 = r0.b()
            boolean r0 = r0.am()
            if (r0 == 0) goto Lb6
        Lb5:
            r3 = 1
        Lb6:
            java.util.Iterator r11 = r11.iterator()
        Lba:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Led
            java.lang.Object r0 = r11.next()
            com.taobao.android.detail2.core.framework.data.model.d r0 = (com.taobao.android.detail2.core.framework.data.model.d) r0
            if (r0 == 0) goto Lba
            com.taobao.android.detail2.core.framework.b r1 = r10.c
            android.app.Activity r1 = r1.g()
            com.alibaba.fastjson.JSONArray r4 = r0.N()
            r5 = 0
            tb.fln.a(r1, r4, r5, r3)
            com.taobao.android.detail2.core.framework.data.DetailDataManager r1 = r10.b
            tb.flo r4 = r1.i()
            com.taobao.android.detail2.core.framework.b r1 = r10.c
            android.app.Activity r5 = r1.g()
            com.alibaba.fastjson.JSONArray r6 = r0.O()
            r7 = 0
            r8 = 0
            r9 = r3
            tb.fln.a(r4, r5, r6, r7, r8, r9)
            goto Lba
        Led:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.flg.a(java.util.List):boolean");
    }
}
