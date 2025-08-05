package com.alibaba.android.icart.core.data;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bbx;
import tb.bed;
import tb.ieu;
import tb.jnv;
import tb.jny;
import tb.jqg;
import tb.jqi;
import tb.kge;

/* loaded from: classes2.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final bbx f2305a;
    private a c;
    private boolean d;
    private int e;
    private boolean b = false;
    private boolean f = false;

    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z);
    }

    static {
        kge.a(-1245087048);
    }

    public static /* synthetic */ void a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7051e4", new Object[]{eVar, new Boolean(z)});
        } else {
            eVar.a(z);
        }
    }

    public e(bbx bbxVar) {
        this.f2305a = bbxVar;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        jqg.b("iCart", "hasDoFirstPageRequest=" + z);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = jqi.a("iCart", ieu.sPageScrollBottomLeftCountToPrefetch, 10);
        this.d = true;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f593b13", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public void a(RecyclerView recyclerView, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd8c091e", new Object[]{this, recyclerView, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (!this.d && !z) {
            this.b = false;
        } else if (this.b || i2 <= 0 || !this.f2305a.n().l()) {
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager.getChildCount() + linearLayoutManager.findFirstVisibleItemPosition() < linearLayoutManager.getItemCount() - this.e) {
                z2 = false;
            }
            if (this.b || !z2) {
                return;
            }
            a((jnv) null);
        }
    }

    public void a(final jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbb5de6", new Object[]{this, jnvVar});
        } else if (this.b) {
            jqg.b("iCart", "正在预请求，不要重复做滚动预请求下一页");
        } else if (!this.f) {
            bed.a("prefetchNextPageError", "首页请求还没有成功返回");
        } else {
            jqg.b("iCart", "触发滚动预加载下一页");
            this.b = true;
            this.f2305a.b(false, (Map<String, String>) null, new jnv() { // from class: com.alibaba.android.icart.core.data.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jnv
                public void b(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ac39879b", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    e.a(e.this, false);
                    jnv jnvVar2 = jnvVar;
                    if (jnvVar2 == null) {
                        return;
                    }
                    jnvVar2.b(i, mtopResponse, obj);
                }

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                        return;
                    }
                    e.a(e.this, false);
                    jnv jnvVar2 = jnvVar;
                    if (jnvVar2 == null) {
                        return;
                    }
                    jnvVar2.a(i, mtopResponse, obj, z, (Map<String, ? extends Object>) map);
                }

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                        return;
                    }
                    e.a(e.this, true);
                    jnv jnvVar2 = jnvVar;
                    if (jnvVar2 == null) {
                        return;
                    }
                    jnvVar2.a(i, mtopResponse, obj, jnyVar, (Map<String, ? extends Object>) map);
                }
            });
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b = false;
        a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.a(z);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.b) {
            jqg.b("iCart", "已经发起了滚动预请求，不再重复发起自动预请求");
        } else {
            jqg.b("iCart", "自动预加载下一页");
            this.b = true;
            HashMap hashMap = new HashMap();
            hashMap.put(RequestConfig.FIRST_PAGE_PRELOAD, "true");
            this.f2305a.b(false, (Map<String, String>) hashMap, new jnv() { // from class: com.alibaba.android.icart.core.data.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                    } else {
                        e.a(e.this, false);
                    }
                }

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    } else {
                        e.a(e.this, true);
                    }
                }

                @Override // tb.jnv
                public void b(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ac39879b", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        e.a(e.this, false);
                    }
                }
            });
        }
    }
}
