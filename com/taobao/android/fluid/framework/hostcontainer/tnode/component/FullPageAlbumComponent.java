package com.taobao.android.fluid.framework.hostcontainer.tnode.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.ogl;
import tb.shr;
import tb.sht;
import tb.spz;

/* loaded from: classes5.dex */
public class FullPageAlbumComponent extends Component<RecyclerView, d> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;

    /* renamed from: a  reason: collision with root package name */
    public LockableRecycerView f12564a;
    private c c;
    private long e;
    private boolean f;
    private boolean g;
    private String h;
    private int d = -1;
    private final Runnable i = new Runnable() { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (FullPageAlbumComponent.this.f12564a == null || FullPageAlbumComponent.f(FullPageAlbumComponent.this) == null || !FullPageAlbumComponent.g(FullPageAlbumComponent.this)) {
            } else {
                if (FullPageAlbumComponent.a(FullPageAlbumComponent.this) < FullPageAlbumComponent.f(FullPageAlbumComponent.this).getItemCount() - 1) {
                    FullPageAlbumComponent.this.f12564a.smoothScrollToPosition(FullPageAlbumComponent.a(FullPageAlbumComponent.this) + 1);
                    return;
                }
                FullPageAlbumComponent.this.f12564a.scrollToPosition(0);
                FullPageAlbumComponent.f(FullPageAlbumComponent.this).notifyDataSetChanged();
                FullPageAlbumComponent.a(FullPageAlbumComponent.this, 0);
                FullPageAlbumComponent.c(FullPageAlbumComponent.this);
            }
        }
    };

    /* loaded from: classes5.dex */
    public static class AlbumModel implements Serializable {
        public double interval;
        public List<Pic> pics;

        /* loaded from: classes5.dex */
        public static class Pic implements Serializable {
            public String height;
            public String url;
            public String width;

            static {
                kge.a(-925895410);
                kge.a(1028243835);
            }
        }

        static {
            kge.a(1392034376);
            kge.a(1028243835);
        }
    }

    public static /* synthetic */ Object ipc$super(FullPageAlbumComponent fullPageAlbumComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2141646649) {
            super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode != 2127624665) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDetach();
            return null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void applyAttrForView(RecyclerView recyclerView, d dVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, recyclerView, dVar, map, new Boolean(z)});
        } else {
            a(recyclerView, dVar, map, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent$d, tb.ogl] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ d mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.support.v7.widget.RecyclerView, android.view.View] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ RecyclerView onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    public static /* synthetic */ int a(FullPageAlbumComponent fullPageAlbumComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("45ea4456", new Object[]{fullPageAlbumComponent})).intValue() : fullPageAlbumComponent.d;
    }

    public static /* synthetic */ shr a(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shr) ipChange.ipc$dispatch("397382bf", new Object[]{view}) : b(view);
    }

    public static /* synthetic */ void a(FullPageAlbumComponent fullPageAlbumComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("775ebb00", new Object[]{fullPageAlbumComponent, new Integer(i)});
        } else {
            fullPageAlbumComponent.b(i);
        }
    }

    public static /* synthetic */ boolean a(FullPageAlbumComponent fullPageAlbumComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("775efad5", new Object[]{fullPageAlbumComponent, new Boolean(z)})).booleanValue();
        }
        fullPageAlbumComponent.g = z;
        return z;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : b;
    }

    public static /* synthetic */ void b(FullPageAlbumComponent fullPageAlbumComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa4fb41", new Object[]{fullPageAlbumComponent, new Integer(i)});
        } else {
            fullPageAlbumComponent.a(i);
        }
    }

    public static /* synthetic */ boolean b(FullPageAlbumComponent fullPageAlbumComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("15aa7806", new Object[]{fullPageAlbumComponent})).booleanValue() : fullPageAlbumComponent.g;
    }

    public static /* synthetic */ void c(FullPageAlbumComponent fullPageAlbumComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56aaba1", new Object[]{fullPageAlbumComponent});
        } else {
            fullPageAlbumComponent.d();
        }
    }

    public static /* synthetic */ void d(FullPageAlbumComponent fullPageAlbumComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b52adf40", new Object[]{fullPageAlbumComponent});
        } else {
            fullPageAlbumComponent.c();
        }
    }

    public static /* synthetic */ void e(FullPageAlbumComponent fullPageAlbumComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84eb12df", new Object[]{fullPageAlbumComponent});
        } else {
            fullPageAlbumComponent.e();
        }
    }

    public static /* synthetic */ c f(FullPageAlbumComponent fullPageAlbumComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b03a83da", new Object[]{fullPageAlbumComponent}) : fullPageAlbumComponent.c;
    }

    public static /* synthetic */ boolean g(FullPageAlbumComponent fullPageAlbumComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("246b7a21", new Object[]{fullPageAlbumComponent})).booleanValue() : fullPageAlbumComponent.f;
    }

    static {
        kge.a(174962998);
        b = FullPageAlbumComponent.class.getSimpleName();
    }

    private static shr b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (shr) ipChange.ipc$dispatch("4e5c4b00", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            return null;
        }
        View view2 = (View) parent;
        Object tag = view2.getTag();
        if (tag instanceof shr) {
            return (shr) tag;
        }
        return b(view2);
    }

    public void a(RecyclerView recyclerView, d dVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef4e4", new Object[]{this, recyclerView, dVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(recyclerView, dVar, map, z);
        if (recyclerView == null || this.c == null || dVar == null) {
            return;
        }
        this.h = dVar.e;
        this.e = dVar.f12573a != null ? (long) (dVar.f12573a.interval * 1000.0d) : 0L;
        this.f = dVar.b;
        this.c.a(dVar.f12573a != null ? dVar.f12573a.pics : null);
        this.c.a(dVar.c);
        int i = dVar.d;
        if (i < this.c.getItemCount()) {
            recyclerView.scrollToPosition(i);
        }
        this.c.notifyDataSetChanged();
        this.d = i;
        d();
    }

    public d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("c2606963", new Object[]{this}) : new d();
    }

    public RecyclerView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("3fe22864", new Object[]{this, context});
        }
        this.f12564a = new LockableRecycerView(context);
        this.f12564a.setHookScrollHorizontally();
        this.f12564a.setLayoutManager(new LinearLayoutManager(context, 0, false) { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 1046880189) {
                    return new Integer(super.getExtraLayoutSpace((RecyclerView.State) objArr[0]));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.LinearLayoutManager
            public int getExtraLayoutSpace(RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("3e661fbd", new Object[]{this, state})).intValue() : super.getExtraLayoutSpace(state) + 100;
            }
        });
        new a() { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else if (FullPageAlbumComponent.a(FullPageAlbumComponent.this) == i && !FullPageAlbumComponent.b(FullPageAlbumComponent.this)) {
                } else {
                    FullPageAlbumComponent.a(FullPageAlbumComponent.this, false);
                    FullPageAlbumComponent.a(FullPageAlbumComponent.this, i);
                }
            }
        }.attachToRecyclerView(this.f12564a);
        this.f12564a.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                } else if (i == 0) {
                    FullPageAlbumComponent.c(FullPageAlbumComponent.this);
                } else if (i != 1) {
                } else {
                    FullPageAlbumComponent.a(FullPageAlbumComponent.this, true);
                    FullPageAlbumComponent.d(FullPageAlbumComponent.this);
                    FullPageAlbumComponent.e(FullPageAlbumComponent.this);
                }
            }
        });
        this.c = new c();
        this.c.a(new c.a() { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent.c.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else {
                    FullPageAlbumComponent.b(FullPageAlbumComponent.this, i);
                }
            }
        });
        this.f12564a.setAdapter(this.c);
        this.d = 0;
        return this.f12564a;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        e();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.node == null || ((String) this.node.e("onuserdragstart")) == null) {
        } else {
            sendMessage(this.node, "onuserdragstart", null, null, null);
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.node == null || ((String) this.node.e("onitemclick")) == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("position", String.valueOf(i));
            sendMessage(this.node, "onitemclick", null, hashMap, null);
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
        } else {
            this.d = i;
            if (this.node == null || ((String) this.node.e("onselectchange")) == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("position", String.valueOf(i));
            sendMessage(this.node, "onselectchange", null, hashMap, null);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        LockableRecycerView lockableRecycerView = this.f12564a;
        if (lockableRecycerView == null) {
            return;
        }
        lockableRecycerView.removeCallbacks(this.i);
        if (!this.f) {
            return;
        }
        long j = this.e;
        if (j <= 0) {
            return;
        }
        this.f12564a.postDelayed(this.i, j);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        LockableRecycerView lockableRecycerView = this.f12564a;
        if (lockableRecycerView == null) {
            return;
        }
        lockableRecycerView.removeCallbacks(this.i);
    }

    /* loaded from: classes5.dex */
    public static class c extends RecyclerView.Adapter<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private List<AlbumModel.Pic> f12572a;
        private a b;
        private boolean c;

        /* loaded from: classes5.dex */
        public interface a {
            void a(int i);
        }

        static {
            kge.a(1117656733);
        }

        private c() {
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public /* synthetic */ void onBindViewHolder(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1071b8aa", new Object[]{this, bVar, new Integer(i)});
            } else {
                a(bVar, i);
            }
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [android.support.v7.widget.RecyclerView$ViewHolder, com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent$b] */
        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder */
        public /* synthetic */ b mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
        }

        public b a(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c5bce2f9", new Object[]{this, viewGroup, new Integer(i)}) : new b(viewGroup, this.b);
        }

        public void a(b bVar, int i) {
            AlbumModel.Pic pic;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c4d37e", new Object[]{this, bVar, new Integer(i)});
                return;
            }
            List<AlbumModel.Pic> list = this.f12572a;
            if (list == null || i >= list.size() || (pic = this.f12572a.get(i)) == null) {
                return;
            }
            bVar.a(pic.url);
            bVar.a(this.c);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            List<AlbumModel.Pic> list = this.f12572a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4517fa7", new Object[]{this, aVar});
            } else {
                this.b = aVar;
            }
        }

        public void a(List<AlbumModel.Pic> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else {
                this.f12572a = list;
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class b extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final TUrlImageView f12570a;

        static {
            kge.a(-1765945618);
        }

        public b(ViewGroup viewGroup, final c.a aVar) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fluid_sdk_item_album_card, viewGroup, false));
            this.f12570a = (TUrlImageView) this.itemView.findViewById(R.id.img_pic);
            if (this.itemView instanceof FscrmidFavorFrameLayout) {
                final shr a2 = FullPageAlbumComponent.a(viewGroup);
                this.itemView.setOnClickListener(new shr(new sht.a() { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.sht.a, tb.sht
                    public void onLongClickCancel() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("70b73f2e", new Object[]{this});
                        }
                    }

                    @Override // tb.sht.a, tb.sht
                    public void onDoubleClick(float f, float f2) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
                            return;
                        }
                        shr shrVar = a2;
                        if (shrVar == null) {
                            return;
                        }
                        shrVar.onDoubleClick(f, f2);
                    }

                    @Override // tb.sht.a, tb.sht
                    public boolean onLongClick(boolean z) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return ((Boolean) ipChange.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue();
                        }
                        shr shrVar = a2;
                        if (shrVar != null) {
                            shrVar.onLongClick(z);
                        }
                        return false;
                    }

                    @Override // tb.sht.a, tb.sht
                    public void onPendingClick() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("7bcd6a37", new Object[]{this});
                            return;
                        }
                        shr shrVar = a2;
                        if (shrVar == null) {
                            return;
                        }
                        shrVar.onPendingClick();
                    }

                    @Override // tb.sht.a, tb.sht
                    public void onSingleClick(float f, float f2) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("e461e8c8", new Object[]{this, new Float(f), new Float(f2)});
                            return;
                        }
                        c.a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(b.this.getAdapterPosition());
                        }
                        shr shrVar = a2;
                        if (shrVar == null) {
                            return;
                        }
                        shrVar.onSingleClick(f, f2);
                    }
                }));
                try {
                    Bitmap decodeResource = BitmapFactory.decodeResource(viewGroup.getResources(), R.drawable.fluid_sdk_album_double_click);
                    if (decodeResource == null) {
                        return;
                    }
                    ((FscrmidFavorFrameLayout) this.itemView).setBitmap(decodeResource);
                } catch (Throwable th) {
                    String b = FullPageAlbumComponent.b();
                    spz.c(b, "e =" + th);
                }
            }
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            this.f12570a.setImageUrl(str);
            this.f12570a.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else if (!(this.itemView instanceof FscrmidFavorFrameLayout)) {
            } else {
                ((FscrmidFavorFrameLayout) this.itemView).disableTouch(!z);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class d extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public AlbumModel f12573a;
        public boolean b;
        public boolean c;
        public int d;
        public String e = "承接";

        static {
            kge.a(1128780830);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -2079543418) {
                super.a((Context) objArr[0], (String) objArr[1], objArr[2]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.ogl
        public void a(Context context, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("840caf86", new Object[]{this, context, str, obj});
                return;
            }
            super.a(context, str, obj);
            char c = 65535;
            try {
                switch (str.hashCode()) {
                    case -1162090388:
                        if (str.equals("testsence")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -338115564:
                        if (str.equals("showlike")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 224506198:
                        if (str.equals("selectindex")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 249929369:
                        if (str.equals("albumdata")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1439562083:
                        if (str.equals("autoplay")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    if (!(obj instanceof JSONObject)) {
                        return;
                    }
                    this.f12573a = (AlbumModel) JSON.parseObject(((JSONObject) obj).toJSONString(), AlbumModel.class);
                } else if (c == 1) {
                    this.b = oec.a(obj, false);
                } else if (c == 2) {
                    if (!(obj instanceof String)) {
                        return;
                    }
                    this.d = Integer.parseInt((String) obj);
                } else if (c == 3) {
                    this.c = oec.a(obj, false);
                } else if (c != 4) {
                } else {
                    this.e = (String) obj;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class a extends PagerSnapHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(111629342);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -1209126298) {
                if (hashCode != -464207520) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return super.findSnapView((RecyclerView.LayoutManager) objArr[0]);
            }
            return new Integer(super.findTargetSnapPosition((RecyclerView.LayoutManager) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.support.v7.widget.PagerSnapHelper, android.support.v7.widget.SnapHelper
        public View findSnapView(RecyclerView.LayoutManager layoutManager) {
            int position;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("e454c160", new Object[]{this, layoutManager});
            }
            View findSnapView = super.findSnapView(layoutManager);
            if (findSnapView != null && (position = layoutManager.getPosition(findSnapView)) != -1) {
                a(position);
            }
            return findSnapView;
        }

        @Override // android.support.v7.widget.PagerSnapHelper, android.support.v7.widget.SnapHelper
        public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b7ee3266", new Object[]{this, layoutManager, new Integer(i), new Integer(i2)})).intValue();
            }
            int findTargetSnapPosition = super.findTargetSnapPosition(layoutManager, i, i2);
            if (findTargetSnapPosition != -1) {
                a(findTargetSnapPosition);
            }
            return findTargetSnapPosition;
        }
    }
}
