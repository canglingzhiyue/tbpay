package com.etao.feimagesearch.videosearch;

import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.VideoIrpActivity;
import com.etao.feimagesearch.videosearch.o;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.TypeCastException;
import tb.cot;
import tb.coy;
import tb.cud;
import tb.kge;

/* loaded from: classes4.dex */
public final class c extends RecyclerView.Adapter<com.etao.feimagesearch.videosearch.b<Object>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "VideoSearch_DetectAdapter";
    private static final int o;

    /* renamed from: a  reason: collision with root package name */
    private final VideoIrpActivity f7044a;
    private final int b;
    private final ArrayList<cud> c;
    private final ArrayList<cud> d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private HashSet<com.taobao.android.weex_framework.p> i;
    private final e j;
    private int k;
    private int l;
    private final HashSet<cud> m;
    private long n;

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(285225753);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    public c(VideoIrpActivity activity) {
        kotlin.jvm.internal.q.c(activity, "activity");
        this.f7044a = activity;
        this.b = 1;
        this.c = new ArrayList<>(5);
        this.d = new ArrayList<>(5);
        this.i = new HashSet<>();
        this.j = e.a();
        this.k = -1;
        this.m = new HashSet<>(10);
    }

    public static final /* synthetic */ VideoIrpActivity a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoIrpActivity) ipChange.ipc$dispatch("c30e6476", new Object[]{cVar}) : cVar.f7044a;
    }

    public static final /* synthetic */ cud a(c cVar, cud cudVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cud) ipChange.ipc$dispatch("2fcd4991", new Object[]{cVar, cudVar, jSONObject}) : cVar.b(cudVar, jSONObject);
    }

    public static final /* synthetic */ ArrayList b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ee575f8a", new Object[]{cVar}) : cVar.c;
    }

    public static final /* synthetic */ cud b(c cVar, cud cudVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cud) ipChange.ipc$dispatch("f5f7d252", new Object[]{cVar, cudVar, jSONObject}) : cVar.a(cudVar, jSONObject);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(com.etao.feimagesearch.videosearch.b<Object> bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, bVar, new Integer(i)});
        } else {
            a(bVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [android.support.v7.widget.RecyclerView$ViewHolder, com.etao.feimagesearch.videosearch.b<java.lang.Object>] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ com.etao.feimagesearch.videosearch.b<Object> mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    static {
        kge.a(-1459640047);
        Companion = new a(null);
        o = com.etao.feimagesearch.config.b.ax();
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public com.etao.feimagesearch.videosearch.b<Object> a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.videosearch.b) ipChange.ipc$dispatch("44b55b42", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup);
    }

    private final com.etao.feimagesearch.videosearch.b<Object> a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.videosearch.b) ipChange.ipc$dispatch("c7838b7", new Object[]{this, viewGroup});
        }
        return new f(LayoutInflater.from(viewGroup != null ? viewGroup.getContext() : null).inflate(R.layout.feis_view_video_detect, viewGroup, false), this.j, this.i, this.f7044a);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : this.b;
    }

    public void a(com.etao.feimagesearch.videosearch.b<Object> bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e913473", new Object[]{this, bVar, new Integer(i)});
        } else if (!(bVar instanceof f)) {
        } else {
            cud cudVar = this.c.get(i);
            kotlin.jvm.internal.q.a((Object) cudVar, "imageList[position]");
            cud cudVar2 = cudVar;
            f fVar = (f) bVar;
            fVar.a(this.m.contains(cudVar2));
            fVar.a(cudVar2);
        }
    }

    private final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        this.g = Math.max(this.g, i);
        c();
    }

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c.isEmpty()) {
        } else {
            this.f7044a.p();
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - this.n) > 500) {
                this.n = currentTimeMillis;
                int a2 = a("updateWhenProgressChange");
                if (a2 >= 0) {
                    cot.c(TAG, "updateWhenProgressChange: currentProgress = " + this.g);
                    notifyItemRangeChanged(a2, this.c.size() - a2);
                }
            }
            if (this.k < 0) {
                return;
            }
            int itemCount = getItemCount();
            int i = this.k;
            if (itemCount < i + 1) {
                return;
            }
            this.f7044a.b(i);
            this.k = -1;
        }
    }

    private final int a(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        int i2 = 0;
        boolean z = false;
        for (cud item : new ArrayList(this.c)) {
            kotlin.jvm.internal.q.a((Object) item, "item");
            if (b(item)) {
                if (!this.m.contains(item)) {
                    this.m.add(item);
                    cot.c(TAG, str + " add item index " + i2);
                    if (z) {
                    }
                    i = i2;
                    z = true;
                }
                i2++;
            } else {
                if (this.m.contains(item)) {
                    cot.c(TAG, str + " remove item index " + i2);
                    this.m.remove(item);
                    if (z) {
                    }
                    i = i2;
                    z = true;
                }
                i2++;
            }
        }
        return i;
    }

    private final boolean b(cud cudVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2a6edeb", new Object[]{this, cudVar})).booleanValue() : cudVar.d >= this.g - o && cudVar.d <= this.g;
    }

    public final void a(cud result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e423e766", new Object[]{this, result});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        int i = this.l;
        this.l = i + 1;
        result.o = i;
        this.c.add(result);
        if (b(result)) {
            int a2 = a("addImage");
            if (!this.f) {
                if (a2 < 0) {
                    notifyDataSetChanged();
                } else {
                    notifyItemRangeChanged(a2, this.c.size() - a2);
                }
            }
        } else {
            notifyItemInserted(this.e);
            this.e++;
            this.f7044a.p();
        }
        this.f = true;
        this.f7044a.r().a(result.f, result.g, new b(result, result), this.f7044a.f(), this.f7044a.b());
    }

    /* loaded from: classes4.dex */
    public static final class b implements o.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ cud b;
        public final /* synthetic */ cud c;

        @Override // com.etao.feimagesearch.videosearch.o.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public b(cud cudVar, cud cudVar2) {
            this.b = cudVar;
            this.c = cudVar2;
        }

        @Override // com.etao.feimagesearch.videosearch.o.b
        public void a(JSONObject jSONObject, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8e3c9c2", new Object[]{this, jSONObject, str, new Boolean(z)});
            } else if (jSONObject == null) {
            } else {
                try {
                    if (z) {
                        c.a(c.this, this.b, jSONObject);
                    } else {
                        c.b(c.this, this.b, jSONObject);
                    }
                    coy.a("Page_VideoSearchDetect", "AlgoOutput", 2101, "boxCoordinates", c.this.a(this.b.g), "trackID", String.valueOf(this.b.i), "frameIndex", String.valueOf(this.b.o), com.etao.feimagesearch.util.h.KEY_VIDEO_ID, String.valueOf(c.a(c.this).g()));
                    int indexOf = c.b(c.this).indexOf(this.c);
                    if (indexOf >= 0) {
                        c.this.notifyItemChanged(indexOf);
                    }
                    c.a(c.this).l();
                } catch (Exception unused) {
                }
            }
        }
    }

    private final cud a(cud cudVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cud) ipChange.ipc$dispatch("a01fbb0a", new Object[]{this, cudVar, jSONObject});
        }
        Object obj = jSONObject.get("data");
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
        }
        JSONObject jSONObject2 = ((JSONObject) obj).getJSONArray("listItems").getJSONObject(0);
        String string = jSONObject2.getJSONObject("itemPic").getString("src");
        String string2 = jSONObject2.getString("priceWap");
        cudVar.l = jSONObject2.getString("nid");
        cudVar.k = string;
        cudVar.j = string2;
        cudVar.m = jSONObject2;
        return cudVar;
    }

    private final cud b(cud cudVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cud) ipChange.ipc$dispatch("2d5a6c8b", new Object[]{this, cudVar, jSONObject});
        }
        try {
            Object obj = jSONObject.get("data");
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            Object obj2 = ((JSONObject) obj).get("combos");
            if (obj2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
            }
            Iterator<Object> it = ((JSONArray) obj2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if ((next instanceof JSONObject) && kotlin.jvm.internal.q.a((Object) "itemsFloor", ((JSONObject) next).get("name"))) {
                    Object obj3 = ((JSONObject) next).get("pages");
                    if (obj3 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
                    }
                    JSONArray jSONArray = (JSONArray) obj3;
                    if (jSONArray.size() > 0) {
                        Object obj4 = jSONArray.get(0);
                        if (obj4 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                        }
                        JSONObject jSONObject2 = (JSONObject) obj4;
                        Object obj5 = jSONObject2.get("itemPic");
                        if (obj5 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                        }
                        cudVar.l = jSONObject2.getString("nid");
                        cudVar.k = ((JSONObject) obj5).getString("src");
                        cudVar.j = jSONObject2.getString("priceWap");
                    }
                }
            }
        } catch (Exception e) {
            cot.b(TAG, e.getMessage());
        }
        return cudVar;
    }

    public final String a(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("368a2247", new Object[]{this, rectF});
        }
        if (rectF == null) {
            return "";
        }
        return String.valueOf(rectF.left) + "_" + String.valueOf(rectF.top) + "_" + String.valueOf(rectF.right) + "_" + String.valueOf(rectF.bottom);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.c.size();
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.c.size() + this.d.size();
    }

    public final void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        c(i);
        if (i < i3) {
            return;
        }
        this.f7044a.k();
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Iterator<com.taobao.android.weex_framework.p> it = this.i.iterator();
        while (it.hasNext()) {
            com.taobao.android.weex_framework.p next = it.next();
            if (next != null) {
                next.destroy();
            }
        }
    }
}
