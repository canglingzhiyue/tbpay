package com.taobao.android.detail2.core.framework.view.manager;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecRequestParamsV2;
import com.taobao.android.detail2.core.framework.view.feeds.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fjp;
import tb.fjt;
import tb.fls;
import tb.fly;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.detail2.core.framework.b f11625a;
    private DetailDataManager b;
    private fmd c;
    private boolean e;
    private String g;
    private boolean h;
    private String i;
    private fly d = new fly();
    private List<String> f = new ArrayList();
    private fls j = new fls() { // from class: com.taobao.android.detail2.core.framework.view.manager.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.fls
        public Map<String, String> a(Activity activity, int i, String str, String str2, String str3, Map<String, String> map, d dVar) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            JSONObject jSONObject4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("5d595389", new Object[]{this, activity, new Integer(i), str, str2, str3, map, dVar});
            }
            if (dVar != null && dVar.q != null && (jSONObject = dVar.q.getJSONObject("realtime")) != null && (jSONObject2 = jSONObject.getJSONObject("realtimeList")) != null && (jSONObject3 = jSONObject2.getJSONObject(str)) != null && (jSONObject4 = jSONObject3.getJSONObject("args")) != null) {
                return new HashMap((Map) JSONObject.toJavaObject(jSONObject4, Map.class));
            }
            return null;
        }
    };
    private fly.a k = new fly.a() { // from class: com.taobao.android.detail2.core.framework.view.manager.b.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.fly.a
        public DetailDataManager.LimitedQueue<String> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DetailDataManager.LimitedQueue) ipChange.ipc$dispatch("3dfdd14b", new Object[]{this}) : b.a(b.this).e();
        }

        @Override // tb.fly.a
        public DetailDataManager.LimitedQueue<String> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DetailDataManager.LimitedQueue) ipChange.ipc$dispatch("e579ab0c", new Object[]{this}) : b.a(b.this).f();
        }

        @Override // tb.fly.a
        public d c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("b7353442", new Object[]{this}) : b.b(b.this).f();
        }

        @Override // tb.fly.a
        public List<d> d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : b.b(b.this).i();
        }

        @Override // tb.fly.a
        public void a(RecRequestParamsV2 recRequestParamsV2, DetailDataManager.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3025fb3", new Object[]{this, recRequestParamsV2, aVar});
            } else {
                b.a(b.this).a(recRequestParamsV2, aVar);
            }
        }

        @Override // tb.fly.a
        public boolean a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
            }
            fjt.a(fjt.TAG_REARRANGE, "==============================================================");
            fjp.a("eventProcess", "Monitor_NewDetail_RealTimeRequestBehavior_" + b.c(b.this).h().W().b(), (Map<String, String>) null);
            if (!b.c(b.this).h().m()) {
                fjt.a(fjt.TAG_REARRANGE, "服务端重排开关或orange开关关闭，不符合触发重排条件判断");
                return false;
            } else if (!StringUtils.equals(str, b.c(b.this).h().y())) {
                fjt.a(fjt.TAG_REARRANGE, "instanceId不一致，不符合触发重排条件判断");
                return false;
            } else if (b.d(b.this).contains(str2)) {
                fjt.a(fjt.TAG_REARRANGE, "nid " + str2 + " 已发起过重排，不符合触发重排条件判断");
                return false;
            } else {
                d d = b.b(b.this).d();
                String str3 = d == null ? "" : d.k;
                if (!StringUtils.equals(str2, str3)) {
                    fjt.a(fjt.TAG_REARRANGE, "nid " + str2 + " 与当前正在展示的nid " + str3 + " 不一致已发生过滑动，不符合触发重排条件判断");
                    return false;
                }
                d f = b.b(b.this).f();
                int f2 = f != null ? b.b(b.this).f(f.k) : -1;
                int f3 = d != null ? b.b(b.this).f(d.k) : -1;
                if (f2 == -1 || f3 == -1 || f2 - f3 > 2) {
                    fjt.a(fjt.TAG_REARRANGE, "当前曝光位置小于最大曝光位置，不符合触发重排条件判断");
                    return false;
                }
                d b = b.b(b.this).b(str2);
                if (b == null || b.c(b.this).h().b(b.f, b.g)) {
                    fjt.a(fjt.TAG_REARRANGE, "当前触发卡是非全屏模式，不符合触发重排条件判断");
                    return false;
                } else if (b.e(b.this)) {
                    fjt.a(fjt.TAG_REARRANGE, "上次重排未返回结果，不符合重排条件判断");
                    return false;
                } else if (b.a(b.this).c()) {
                    fjt.a(fjt.TAG_REARRANGE, "推荐列表正在请求中，不符合触发重排条件判断");
                    return false;
                } else {
                    List<d> i = b.b(b.this).i();
                    if (i == null || i.size() <= 0) {
                        fjt.a(fjt.TAG_REARRANGE, "当前未曝光list的size<=0，不符合触发重排条件判断");
                        return false;
                    } else if (b.f(b.this)) {
                        fjt.a(fjt.TAG_REARRANGE, "当前页面不在展示，不符合触发重排条件判断");
                        b.a(b.this, str2);
                        return false;
                    } else {
                        b.a(b.this, true);
                        b.b(b.this, str2);
                        fjt.a(fjt.TAG_REARRANGE, "当前符合触发重排条件判断");
                        fjp.a("eventProcess", "Monitor_NewDetail_RealTimeRequestStart_" + b.c(b.this).h().W().b(), (Map<String, String>) null);
                        return true;
                    }
                }
            }
        }
    };
    private fly.b l = new fly.b() { // from class: com.taobao.android.detail2.core.framework.view.manager.b.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.fly.b
        public void a(d dVar, List<d> list, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d99344b9", new Object[]{this, dVar, list, str});
                return;
            }
            b.a(b.this, false);
            if (!b.c(b.this).h().m()) {
                fjt.a(fjt.TAG_REARRANGE, "端智能返回成功结果，但重排开关是关闭的，重排结果不生效");
            } else if (b.a(b.this).c()) {
                fjt.a(fjt.TAG_REARRANGE, "端智能返回成功结果，但正在翻页请求中，重排结果不生效");
            } else {
                d d = b.b(b.this).d();
                String str2 = "";
                String str3 = d == null ? str2 : d.k;
                if (!StringUtils.equals(b.g(b.this), str3)) {
                    fjt.a(fjt.TAG_REARRANGE, "端智能返回成功结果，nid " + b.g(b.this) + " 与当前正在展示的nid " + str3 + " 不一致已发生过滑动，重排结果不生效");
                } else if (dVar == null) {
                } else {
                    String str4 = dVar.k;
                    d f = b.b(b.this).f();
                    if (f != null) {
                        str2 = f.k;
                    }
                    if (!StringUtils.equals(str4, str2)) {
                        fjt.a(fjt.TAG_REARRANGE, "端智能返回成功结果，之前最大曝光nid " + str4 + " 与当前最大曝光的nid " + str2 + " 不一致已发生过滑动，重排结果不生效");
                    } else if (b.f(b.this)) {
                        fjt.a(fjt.TAG_REARRANGE, "端智能返回成功结果，但当前页面不在前台展示，重排结果不生效");
                        b.a(b.this, str);
                    } else {
                        fjp.a("eventProcess", "Monitor_NewDetail_RealTimeRequestEffect_" + b.c(b.this).h().W().b(), (Map<String, String>) null);
                        b.d(b.this).add(dVar.k);
                        c.b a2 = b.b(b.this).a(list, b.b(b.this).f(dVar.k) + 1);
                        if (a2 == null) {
                            return;
                        }
                        b.a(b.this).a(a2.b);
                    }
                }
            }
        }

        @Override // tb.fly.b
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                return;
            }
            b.a(b.this, false);
            if (!b.c(b.this).h().m()) {
                return;
            }
            fjp.a(fjt.TAG_REARRANGE, "rerank", fjp.ERROR_CODE_RERANK_ERROR, "端智能返回错误结果, errorCode: " + i + ", errorMsg: " + str, (Map<String, String>) null);
        }
    };

    static {
        kge.a(125225888);
    }

    public static /* synthetic */ DetailDataManager a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailDataManager) ipChange.ipc$dispatch("1b30d177", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ String a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9de0ef95", new Object[]{bVar, str});
        }
        bVar.i = str;
        return str;
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32abda17", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.e = z;
        return z;
    }

    public static /* synthetic */ String b(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65103bb4", new Object[]{bVar, str});
        }
        bVar.g = str;
        return str;
    }

    public static /* synthetic */ fmd b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fmd) ipChange.ipc$dispatch("2a833647", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("8d476e12", new Object[]{bVar}) : bVar.f11625a;
    }

    public static /* synthetic */ List d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c123d423", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ boolean e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("540185e9", new Object[]{bVar})).booleanValue() : bVar.e;
    }

    public static /* synthetic */ boolean f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47910a2a", new Object[]{bVar})).booleanValue() : bVar.h;
    }

    public static /* synthetic */ String g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4392119", new Object[]{bVar}) : bVar.g;
    }

    public b(com.taobao.android.detail2.core.framework.b bVar, fmd fmdVar, DetailDataManager detailDataManager) {
        this.f11625a = bVar;
        this.c = fmdVar;
        this.b = detailDataManager;
        this.d.a(new com.taobao.android.detail2.core.rearrange.b(bVar));
        this.d.a(this.l);
        this.d.a(this.k);
        this.c.a(this.j);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d.a();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.h = true;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.h = false;
        if (StringUtils.isEmpty(this.i)) {
            return;
        }
        String str = this.i;
        this.g = str;
        this.d.a(str);
        this.e = true;
        this.i = null;
        fjt.a(fjt.TAG_REARRANGE, "之前由于页面不在前台导致的重排没生效，页面resume时机重新发起请求");
    }
}
