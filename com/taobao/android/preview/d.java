package com.taobao.android.preview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends RecyclerView.Adapter<f> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bd f14703a;
    public Context b;
    private RecyclerView e;
    private final int c = -1;
    private int f = 0;
    private HashMap<Integer, Integer> g = new HashMap<>();
    private HashMap<String, Integer> h = new HashMap<>(128);
    private HashMap<Integer, DXTemplateItem> i = new HashMap<>(128);
    private JSONArray d = new JSONArray();

    static {
        kge.a(-1362126225);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, fVar, new Integer(i)});
        } else {
            a(fVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.preview.f, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ f mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public d(Context context, JSONArray jSONArray, RecyclerView recyclerView, bd bdVar) {
        this.d.addAll(jSONArray);
        this.f14703a = bdVar;
        this.e = recyclerView;
        this.b = context;
        b();
    }

    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
            return;
        }
        JSONArray jSONArray2 = this.d;
        if (jSONArray2 != null) {
            jSONArray2.clear();
            this.d.addAll(jSONArray);
        } else {
            this.d = new JSONArray();
            this.d.addAll(jSONArray);
        }
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.d.size(); i++) {
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            JSONObject jSONObject = (JSONObject) this.d.getJSONObject(i).get("template");
            if (jSONObject != null) {
                dXTemplateItem.b = Long.parseLong(jSONObject.getString("version"));
                dXTemplateItem.f11925a = jSONObject.getString("name");
                dXTemplateItem.c = jSONObject.getString("url");
                String b = dXTemplateItem.b();
                if (this.h.containsKey(b)) {
                    this.g.put(Integer.valueOf(i), this.h.get(b));
                } else {
                    DXTemplateItem a2 = this.f14703a.a(dXTemplateItem);
                    if (a2 == null) {
                        this.g.put(Integer.valueOf(i), -1);
                    } else {
                        String b2 = a2.b();
                        if (this.h.containsKey(b2)) {
                            this.g.put(Integer.valueOf(i), this.h.get(b2));
                        } else {
                            this.f++;
                            this.h.put(b2, Integer.valueOf(this.f));
                            this.i.put(Integer.valueOf(this.f), a2);
                            this.g.put(Integer.valueOf(i), Integer.valueOf(this.f));
                        }
                    }
                }
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        Integer num = this.g.get(Integer.valueOf(i));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.preview.f a(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.preview.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L20
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r2 = 1
            r1[r2] = r6
            r6 = 2
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            r1[r6] = r2
            java.lang.String r6 = "dfb3fd5d"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            com.taobao.android.preview.f r6 = (com.taobao.android.preview.f) r6
            return r6
        L20:
            r0 = -1
            r1 = 0
            if (r7 != r0) goto L2e
            android.content.Context r7 = r6.getContext()
            android.view.View r7 = a(r7)
            r0 = r7
            goto L68
        L2e:
            java.util.HashMap<java.lang.Integer, com.taobao.android.dinamicx.template.download.DXTemplateItem> r0 = r5.i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r0.get(r7)
            com.taobao.android.dinamicx.template.download.DXTemplateItem r7 = (com.taobao.android.dinamicx.template.download.DXTemplateItem) r7
            if (r7 == 0) goto L67
            com.taobao.android.dinamicx.bd r0 = r5.f14703a     // Catch: java.lang.Exception -> L5d
            android.content.Context r3 = r5.b     // Catch: java.lang.Exception -> L5d
            com.taobao.android.dinamicx.DXResult r0 = r0.a(r3, r6, r7)     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L67
            T r3 = r0.f11780a     // Catch: java.lang.Exception -> L5d
            if (r3 == 0) goto L67
            T r0 = r0.f11780a     // Catch: java.lang.Exception -> L5d
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Exception -> L5d
            boolean r7 = r5.a(r7)     // Catch: java.lang.Exception -> L5b
            if (r7 == 0) goto L68
            r7 = r0
            com.taobao.android.dinamicx.DXRootView r7 = (com.taobao.android.dinamicx.DXRootView) r7     // Catch: java.lang.Exception -> L5b
            r5.a(r7)     // Catch: java.lang.Exception -> L5b
            goto L68
        L5b:
            r7 = move-exception
            goto L5f
        L5d:
            r7 = move-exception
            r0 = r1
        L5f:
            java.lang.String r3 = "DXTemplatePreviewActivity"
            java.lang.String r4 = "createViewHolder failed"
            android.util.Log.e(r3, r4, r7)
            goto L68
        L67:
            r0 = r1
        L68:
            if (r0 != 0) goto L7f
            android.content.Context r7 = r6.getContext()
            android.view.View r0 = a(r7)
            android.content.Context r6 = r6.getContext()
            java.lang.String r7 = "Preview template failed"
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r2)
            r6.show()
        L7f:
            com.taobao.android.preview.f r6 = new com.taobao.android.preview.f
            r6.<init>(r0, r1)
            android.view.View r7 = r6.itemView
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            if (r7 == 0) goto L97
            android.support.v7.widget.RecyclerView r0 = r5.e
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            android.support.v7.widget.RecyclerView$LayoutParams r7 = r0.generateLayoutParams(r7)
            goto La1
        L97:
            android.support.v7.widget.RecyclerView r7 = r5.e
            android.support.v7.widget.RecyclerView$LayoutManager r7 = r7.getLayoutManager()
            android.support.v7.widget.RecyclerView$LayoutParams r7 = r7.generateDefaultLayoutParams()
        La1:
            android.view.View r0 = r6.itemView
            r0.setLayoutParams(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.preview.d.a(android.view.ViewGroup, int):com.taobao.android.preview.f");
    }

    private boolean a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a042615", new Object[]{this, dXTemplateItem})).booleanValue();
        }
        if (dXTemplateItem == null) {
            return false;
        }
        if (dXTemplateItem.d() == 30000) {
            return true;
        }
        if (dXTemplateItem.d() == 20000) {
            return false;
        }
        if (!StringUtils.isEmpty(dXTemplateItem.c) && (dXTemplateItem.c.endsWith(".zip") || dXTemplateItem.c.endsWith("._dxv4") || dXTemplateItem.c.contains("._dxv4") || dXTemplateItem.c.contains(".zip"))) {
            return true;
        }
        return StringUtils.isEmpty(dXTemplateItem.c) && dXTemplateItem.b >= 0;
    }

    private void a(final DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
        } else {
            this.f14703a.d().a(dXRootView, new DXRootView.a() { // from class: com.taobao.android.preview.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.DXRootView.a
                public void b(DXRootView dXRootView2, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a57523d9", new Object[]{this, dXRootView2, new Integer(i)});
                    } else if (i == 0) {
                        d.this.f14703a.d().b(dXRootView2);
                    } else {
                        d.this.f14703a.d().a(dXRootView2);
                    }
                }

                @Override // com.taobao.android.dinamicx.DXRootView.a
                public void a(View view, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
                    } else if (i == 0) {
                        d.this.f14703a.d().b(dXRootView);
                    } else {
                        d.this.f14703a.d().a(dXRootView);
                    }
                }

                @Override // com.taobao.android.dinamicx.DXRootView.a
                public void a(DXRootView dXRootView2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("acc619e9", new Object[]{this, dXRootView2});
                    } else {
                        d.this.f14703a.d().a(dXRootView2);
                    }
                }

                @Override // com.taobao.android.dinamicx.DXRootView.a
                public void b(DXRootView dXRootView2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4766dc6a", new Object[]{this, dXRootView2});
                    } else {
                        d.this.f14703a.d().b(dXRootView2);
                    }
                }
            });
        }
    }

    public void a(f fVar, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c8a778", new Object[]{this, fVar, new Integer(i)});
        } else if (getItemViewType(i) == -1) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putAll((JSONObject) this.d.get(i));
                DXResult<DXRootView> a2 = this.f14703a.a(this.b, jSONObject, (DXRootView) fVar.itemView, 0, 0, null);
                if (a2 != null && a2.b()) {
                    Log.e("DinamicX", a2.a().c.toString());
                }
            } catch (Exception e) {
                com.taobao.android.dinamicx.exception.a.b(e);
            }
            StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) fVar.itemView.getLayoutParams();
            String string = this.d.getJSONObject(i).getJSONObject("template").getString("columnType");
            if (!StringUtils.equals(string, "one") && !StringUtils.isEmpty(string)) {
                z = false;
            }
            layoutParams.setFullSpan(z);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        JSONArray jSONArray = this.d;
        if (jSONArray == null) {
            return 0;
        }
        return jSONArray.size();
    }

    public static View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        return frameLayout;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        this.h.clear();
        return true;
    }
}
