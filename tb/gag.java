package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.n;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import com.taobao.search.common.util.k;
import com.taobao.taolive.sdk.mergeInfo.b;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

/* loaded from: classes5.dex */
public class gag extends gaf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1975689235);
    }

    public static /* synthetic */ Object ipc$super(gag gagVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.gaf
    public boolean a(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a28f7103", new Object[]{this, dXRecyclerLayout, jSONObject, nVar})).booleanValue();
        }
        List<Object> a2 = a(dXRecyclerLayout.getDXRuntimeContext(), jSONObject);
        if (a2 == null || a2.isEmpty()) {
            return false;
        }
        a(dXRecyclerLayout, a2, d(dXRecyclerLayout), nVar, jSONObject.getString("refreshType"));
        return true;
    }

    public void a(DXRecyclerLayout dXRecyclerLayout, List<Object> list, List<DXWidgetNode> list2, n nVar, String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4da6783", new Object[]{this, dXRecyclerLayout, list, list2, nVar, str});
            return;
        }
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Object obj = list.get(i4);
            if (obj instanceof JSONObject) {
                fzy b = b(dXRecyclerLayout);
                if (b == null || b.f()) {
                    i = i3;
                } else {
                    if (a(dXRecyclerLayout) != null) {
                        if (i2 < 0) {
                            i2 = a(dXRecyclerLayout).size();
                        }
                        a(dXRecyclerLayout).add(obj);
                        i3++;
                    }
                    int i5 = i2;
                    i = i3;
                    int i6 = i5 + i4;
                    b.a(i6, a(dXRecyclerLayout, obj, list2, i6, nVar));
                    i2 = i5;
                }
                i3 = i;
            } else {
                fuw.d("DXRecyclerOperatorCommon", "no setData for append!!!");
            }
        }
        if (i2 < 0 || i3 <= 0) {
            return;
        }
        if (fqi.o()) {
            a(dXRecyclerLayout, b.TYPE_PART, i2, i3, DXRecyclerLayout.MSG_METHOD_APPEND_ITEMS, false);
        } else {
            a(dXRecyclerLayout, b.TYPE_PART, i2, i3, DXRecyclerLayout.MSG_METHOD_APPEND_ITEMS, true);
        }
    }

    @Override // tb.gaf
    public boolean a(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject) {
        fzy b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be1f92f0", new Object[]{this, dXRecyclerLayout, jSONObject})).booleanValue();
        }
        List<Object> a2 = a(dXRecyclerLayout.getDXRuntimeContext(), jSONObject);
        if (a2 != null && !a2.isEmpty() && (b = b(dXRecyclerLayout)) != null && !b.f() && !b.e()) {
            return a(dXRecyclerLayout, a2, jSONObject.get("current"), jSONObject.getString("refreshType"));
        }
        return false;
    }

    private List<Object> a(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5e5eb930", new Object[]{this, dXRuntimeContext, jSONObject});
        }
        try {
            return jSONObject.getJSONArray("data");
        } catch (Exception e) {
            e.printStackTrace();
            if (dXRuntimeContext == null) {
                return null;
            }
            try {
                if (!dXRuntimeContext.O()) {
                    return null;
                }
                return (List) jSONObject.get("data");
            } catch (Exception e2) {
                a.b(e2);
                return null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(com.taobao.android.dinamicx.widget.DXRecyclerLayout r17, java.util.List<java.lang.Object> r18, java.lang.Object r19, java.lang.String r20) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            com.android.alibaba.ip.runtime.IpChange r0 = tb.gag.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r13 = 1
            r14 = 0
            if (r1 == 0) goto L2f
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r14] = r8
            r1[r13] = r9
            r2 = 2
            r1[r2] = r10
            r2 = 3
            r1[r2] = r11
            r2 = 4
            r1[r2] = r12
            java.lang.String r2 = "65a6519f"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L2f:
            r15 = 0
        L30:
            int r0 = r18.size()
            if (r15 >= r0) goto Lc2
            java.lang.Object r0 = r10.get(r15)
            boolean r1 = r0 instanceof com.alibaba.fastjson.JSONObject
            if (r1 == 0) goto Lbe
            r1 = -1
            r2 = r0
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2     // Catch: java.lang.Exception -> L57
            java.lang.String r3 = "isRelative"
            java.lang.Boolean r2 = r2.getBoolean(r3)     // Catch: java.lang.Exception -> L57
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L57
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0     // Catch: java.lang.Exception -> L55
            java.lang.String r3 = "offset"
            int r0 = r0.getIntValue(r3)     // Catch: java.lang.Exception -> L55
            goto L5d
        L55:
            r0 = move-exception
            goto L59
        L57:
            r0 = move-exception
            r2 = 0
        L59:
            r0.printStackTrace()
            r0 = -1
        L5d:
            tb.fzy r3 = r16.b(r17)
            if (r0 == r1) goto Lbe
            if (r3 == 0) goto Lbe
            boolean r1 = r3.f()
            if (r1 != 0) goto Lbe
            if (r2 == 0) goto L8a
            boolean r1 = r11 instanceof com.taobao.android.dinamicx.widget.DXWidgetNode
            if (r1 == 0) goto L8a
            r1 = r11
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = (com.taobao.android.dinamicx.widget.DXWidgetNode) r1
            com.taobao.android.dinamicx.widget.ac r1 = r8.a(r1)
            if (r1 != 0) goto L83
            r0 = 230003(0x38273, float:3.22303E-40)
            java.lang.String r1 = ""
            r8.a(r9, r0, r1)
            return r14
        L83:
            int r1 = r3.a(r1)
            int r1 = r1 + r0
            r4 = r1
            goto L8b
        L8a:
            r4 = r0
        L8b:
            if (r4 < 0) goto L96
            int r0 = r3.g()
            if (r4 >= r0) goto L96
            r3.c(r4)
        L96:
            if (r4 < 0) goto La9
            java.util.List r0 = r16.a(r17)
            int r0 = r0.size()
            if (r4 >= r0) goto La9
            java.util.List r0 = r16.a(r17)
            r0.remove(r4)
        La9:
            java.lang.String r0 = "part"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto Lbe
            r5 = 1
            r7 = 1
            java.lang.String r3 = "part"
            java.lang.String r6 = "DXRecyclerLayout#deleteItems"
            r1 = r16
            r2 = r17
            r1.a(r2, r3, r4, r5, r6, r7)
        Lbe:
            int r15 = r15 + 1
            goto L30
        Lc2:
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto Ld0
            java.lang.String r0 = "all"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto Ld3
        Ld0:
            r16.c(r17)
        Ld3:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gag.a(com.taobao.android.dinamicx.widget.DXRecyclerLayout, java.util.List, java.lang.Object, java.lang.String):boolean");
    }

    @Override // tb.gaf
    public boolean d(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, n nVar) {
        fzy b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8899ed86", new Object[]{this, dXRecyclerLayout, jSONObject, nVar})).booleanValue();
        }
        JSONArray jSONArray = null;
        try {
            jSONArray = jSONObject.getJSONArray(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jSONArray != null && !jSONArray.isEmpty() && (b = b(dXRecyclerLayout)) != null && !b.f() && !b.e()) {
            gah a2 = gah.a(jSONObject);
            boolean z = false;
            for (int i = 0; i < a(dXRecyclerLayout).size(); i++) {
                if (a(dXRecyclerLayout, jSONArray, a2, i, false, nVar)) {
                    z = true;
                }
            }
            if (!fqi.F()) {
                if (z) {
                    c(dXRecyclerLayout);
                    return true;
                }
            } else if (a2.a() == 0 && z) {
                c(dXRecyclerLayout);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(com.taobao.android.dinamicx.widget.DXRecyclerLayout r19, com.alibaba.fastjson.JSONArray r20, tb.gah r21, int r22, boolean r23, com.taobao.analysis.v3.n r24) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gag.a(com.taobao.android.dinamicx.widget.DXRecyclerLayout, com.alibaba.fastjson.JSONArray, tb.gah, int, boolean, com.taobao.analysis.v3.n):boolean");
    }

    @Override // tb.gaf
    public boolean b(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, n nVar) {
        fzy b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef3d9a84", new Object[]{this, dXRecyclerLayout, jSONObject, nVar})).booleanValue();
        }
        List<Object> a2 = a(dXRecyclerLayout.getDXRuntimeContext(), jSONObject);
        if (a2 != null && !a2.isEmpty() && (b = b(dXRecyclerLayout)) != null && !b.f()) {
            return a(dXRecyclerLayout, a2, jSONObject.get("current"), nVar, (String) fxr.a("refreshType", jSONObject, "all"), jSONObject.getIntValue(k.a.PARAM_KEY_LIST_START_INDEX), jSONObject.getIntValue("count"));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(com.taobao.android.dinamicx.widget.DXRecyclerLayout r20, java.util.List<java.lang.Object> r21, java.lang.Object r22, com.taobao.analysis.v3.n r23, java.lang.String r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gag.a(com.taobao.android.dinamicx.widget.DXRecyclerLayout, java.util.List, java.lang.Object, com.taobao.analysis.v3.n, java.lang.String, int, int):boolean");
    }

    private void a(String str, Queue<String> queue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de0aab7e", new Object[]{this, str, queue});
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, dmp.DELIMITER, false);
        while (stringTokenizer.hasMoreTokens()) {
            queue.offer(stringTokenizer.nextToken());
        }
    }

    @Override // tb.gaf
    public boolean a(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, boolean z, n nVar) {
        JSONArray jSONArray;
        Object jSONObject2;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd16f87f", new Object[]{this, dXRecyclerLayout, jSONObject, new Boolean(z), nVar})).booleanValue();
        }
        Object obj = jSONObject.get("current");
        if (obj == null) {
            return false;
        }
        try {
            jSONArray = jSONObject.getJSONArray(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS);
        } catch (Exception e) {
            e.printStackTrace();
            jSONArray = null;
        }
        if (dXRecyclerLayout.getDXRuntimeContext().M() != null) {
            jSONObject2 = jSONObject.get("item_data");
        } else {
            jSONObject2 = jSONObject.getJSONObject("item_data");
        }
        if (jSONArray != null && !jSONArray.isEmpty()) {
            if (obj instanceof DXWidgetNode) {
                ac a2 = a((DXWidgetNode) obj);
                fzy b = b(dXRecyclerLayout);
                if (a2 == null || b == null) {
                    return false;
                }
                int a3 = b.a(a2);
                gah a4 = gah.a(jSONObject);
                boolean a5 = a(dXRecyclerLayout, jSONArray, a4, a3, z, nVar);
                if (z) {
                    return a5;
                }
                if ((!fqi.F() || (a4 != null && a4.a() == 0)) && a5) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("params");
                    if (jSONObject3 != null) {
                        z2 = jSONObject3.getBooleanValue("refreshPart");
                    }
                    if (z2) {
                        if (fqi.o()) {
                            a(dXRecyclerLayout, b.TYPE_PART, a3, 1, DXRecyclerLayout.MSG_METHOD_UPDATE_CURRENT, false);
                        } else {
                            a(dXRecyclerLayout, b.TYPE_PART, a3, 1, DXRecyclerLayout.MSG_METHOD_UPDATE_CURRENT, true);
                        }
                    } else {
                        c(dXRecyclerLayout);
                    }
                    return true;
                }
            }
        } else if (jSONObject2 != null && (obj instanceof DXWidgetNode)) {
            return a(dXRecyclerLayout, (DXWidgetNode) obj, jSONObject2, false);
        }
        return false;
    }

    public boolean a(DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23a39d71", new Object[]{this, dXRecyclerLayout, dXWidgetNode, obj, new Boolean(z)})).booleanValue();
        }
        ac a2 = a(dXWidgetNode);
        fzy b = b(dXRecyclerLayout);
        if (a2 == null || b == null) {
            return false;
        }
        int a3 = b.a(a2);
        if (a3 < 0) {
            a(dXRecyclerLayout, s.DX_ERROR_CODE_RECYCLER_LAYOUT_230005, "index: " + a3);
            return false;
        }
        fux.a(" updateCurrent 获取到的index 为" + a3);
        a(dXRecyclerLayout, obj, gah.a(null), a3, (n) null);
        if (!z) {
            if (fqi.o()) {
                a(dXRecyclerLayout, b.TYPE_PART, a3, 1, DXRecyclerLayout.MSG_METHOD_UPDATE_CURRENT, false);
            } else {
                a(dXRecyclerLayout, b.TYPE_PART, a3, 1, DXRecyclerLayout.MSG_METHOD_UPDATE_CURRENT, true);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    @Override // tb.gaf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(com.taobao.android.dinamicx.widget.DXRecyclerLayout r22, com.alibaba.fastjson.JSONObject r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gag.b(com.taobao.android.dinamicx.widget.DXRecyclerLayout, com.alibaba.fastjson.JSONObject):boolean");
    }

    @Override // tb.gaf
    public boolean c(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, n nVar) {
        List<Object> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bebc405", new Object[]{this, dXRecyclerLayout, jSONObject, nVar})).booleanValue();
        }
        fzy b = b(dXRecyclerLayout);
        if (b != null && !b.f() && !b.e() && (a2 = a(dXRecyclerLayout.getDXRuntimeContext(), jSONObject)) != null && !a2.isEmpty()) {
            return a(dXRecyclerLayout, a2, (DXWidgetNode) fxr.a("current", jSONObject, (Object) null), fxr.a("offset", jSONObject, -1), fxr.a("isRelative", jSONObject, (Boolean) false).booleanValue(), fxr.a("isRelativeOrder", jSONObject, (Boolean) false).booleanValue(), nVar);
        }
        return false;
    }

    private boolean a(DXRecyclerLayout dXRecyclerLayout, List<Object> list, DXWidgetNode dXWidgetNode, int i, boolean z, boolean z2, n nVar) {
        fzy b;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4043c00", new Object[]{this, dXRecyclerLayout, list, dXWidgetNode, new Integer(i), new Boolean(z), new Boolean(z2), nVar})).booleanValue();
        }
        if (list == null || dXWidgetNode == null || (b = b(dXRecyclerLayout)) == null) {
            return false;
        }
        ac a2 = a(dXWidgetNode);
        int a3 = a2 != null ? b.a(a2) : -1;
        int i4 = 0;
        while (i4 < list.size()) {
            Object obj = list.get(i4);
            if (obj != null) {
                int i5 = i + i4;
                if (z) {
                    if (z2) {
                        if (a3 == -1) {
                            return false;
                        }
                        i5 = a3 + i + i4;
                    } else if (a2 == null) {
                        return false;
                    } else {
                        i5 = b.a(a2) + i;
                    }
                }
                int i6 = i5;
                if (a(dXRecyclerLayout) != null && i6 >= 0 && i6 < a(dXRecyclerLayout).size()) {
                    a(dXRecyclerLayout).add(i6, obj);
                }
                i2 = i4;
                i3 = a3;
                DXWidgetNode a4 = a(dXRecyclerLayout, obj, d(dXRecyclerLayout), i6, nVar);
                if (i6 >= 0 && i6 < b.g()) {
                    b.a(i6, a4);
                }
            } else {
                i2 = i4;
                i3 = a3;
            }
            i4 = i2 + 1;
            a3 = i3;
        }
        c(dXRecyclerLayout);
        return true;
    }

    private int a(DXRecyclerLayout dXRecyclerLayout, boolean z, int i, int i2, Object obj) {
        fzy b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30566aff", new Object[]{this, dXRecyclerLayout, new Boolean(z), new Integer(i), new Integer(i2), obj})).intValue();
        }
        if (!z) {
            return i2;
        }
        if (i > 0) {
            return i2 + i;
        }
        if ((obj instanceof DXWidgetNode) && (b = b(dXRecyclerLayout)) != null) {
            return b.a(a((DXWidgetNode) obj)) + i2;
        }
        return -1;
    }

    private void a(String str, DXRecyclerLayout dXRecyclerLayout, int i, gah gahVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc7f072b", new Object[]{this, str, dXRecyclerLayout, new Integer(i), gahVar});
        } else if (!a(str)) {
        } else {
            if (!fqi.F()) {
                if (!b.TYPE_PART.equals(str)) {
                    return;
                }
                a(dXRecyclerLayout, b.TYPE_PART, i, 1, DXRecyclerLayout.MSG_METHOD_UPDATE_ITEMS, false);
            } else if (gahVar.a() != 0 || !b.TYPE_PART.equals(str)) {
            } else {
                a(dXRecyclerLayout, b.TYPE_PART, i, 1, DXRecyclerLayout.MSG_METHOD_UPDATE_ITEMS, false);
            }
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : fqi.aw() && b.TYPE_PART.equals(str);
    }
}
