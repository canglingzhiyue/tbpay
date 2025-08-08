package com.taobao.android.detail2.core.framework.view.navbar;

import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.dwy;
import tb.fhi;
import tb.fhj;
import tb.fhk;
import tb.fhl;
import tb.fjt;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TIconFontTextView b;
    private JSONObject c;
    private boolean d;
    private String e;
    private String f;
    private String g;
    private fhi h;
    private com.taobao.android.detail2.core.framework.b i;
    private fmd j;
    private boolean k;
    private int l;
    private a p;

    /* renamed from: a  reason: collision with root package name */
    private String f11629a = "NavbarCollect";
    private String m = "取消收藏成功";
    private String n = "收藏成功";
    private String o = "系统开小差了~";

    /* loaded from: classes5.dex */
    public interface a {
        void a(boolean z);
    }

    static {
        kge.a(1186584101);
    }

    public static /* synthetic */ void a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ff4d6", new Object[]{bVar, str});
        } else {
            bVar.a(str);
        }
    }

    public static /* synthetic */ void a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d7be48", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.a(z);
        }
    }

    public static /* synthetic */ boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f1fb610", new Object[]{bVar})).booleanValue() : bVar.d;
    }

    public static /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35e25ab", new Object[]{bVar});
        } else {
            bVar.c();
        }
    }

    public static /* synthetic */ void b(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88674289", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.b(z);
        }
    }

    public static /* synthetic */ void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779c954a", new Object[]{bVar});
        } else {
            bVar.d();
        }
    }

    public static /* synthetic */ String d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f0e3ed7", new Object[]{bVar}) : bVar.f11629a;
    }

    public static /* synthetic */ String e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("46372118", new Object[]{bVar}) : bVar.n;
    }

    public static /* synthetic */ String f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4d600359", new Object[]{bVar}) : bVar.o;
    }

    public b(com.taobao.android.detail2.core.framework.b bVar, fmd fmdVar, fhi fhiVar, TIconFontTextView tIconFontTextView, JSONObject jSONObject, int i) {
        this.b = tIconFontTextView;
        this.h = fhiVar;
        this.i = bVar;
        this.j = fmdVar;
        this.c = jSONObject;
        this.l = i;
        e();
        if (this.b == null || this.c == null || StringUtils.isEmpty(this.e)) {
            return;
        }
        this.b.setTextColor(this.l);
        this.b.setText(this.g);
        b();
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail2.core.framework.view.navbar.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (b.a(b.this)) {
                    b.b(b.this);
                    b.a(b.this, "Navigation_CancelToFavorite");
                    b.a(b.this, false);
                } else {
                    b.c(b.this);
                    b.a(b.this, "Navigation_AddToFavorite");
                    b.a(b.this, true);
                }
            }
        });
        this.k = true;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.p;
        if (aVar == null) {
            return;
        }
        aVar.a(z);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df5b2f", new Object[]{this, aVar});
        } else {
            this.p = aVar;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", this.e);
        com.taobao.android.msoa.c.a().a(new fhl("taobao_detail", hashMap), new MSOAServiceListener() { // from class: com.taobao.android.detail2.core.framework.view.navbar.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onSuccess(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                } else if (map != null && map.containsKey("isFavorite")) {
                    b.b(b.this, ((Boolean) map.get("isFavorite")).booleanValue());
                } else {
                    b.b(b.this, false);
                }
            }

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                    return;
                }
                b.b(b.this, false);
                fjt.a(b.d(b.this), "查看是否收藏失败,原因未知");
            }
        });
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", this.e);
        com.taobao.android.msoa.c.a().a(new fhk("taobao_detail", hashMap), new MSOAServiceListener() { // from class: com.taobao.android.detail2.core.framework.view.navbar.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onSuccess(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                } else if (map != null && map.containsKey("deleteResult") && ((Boolean) map.get("deleteResult")).booleanValue()) {
                    b.b(b.this, false);
                } else {
                    fjt.a(b.d(b.this), "取消收藏失败,原因未知");
                }
            }

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                    return;
                }
                b.b(b.this, true);
                if (!StringUtils.isEmpty(str2) && z) {
                    if (ErrorConstant.isSessionInvalid(str) || "ANDROID_SYS_LOGIN_CANCEL".equals(str)) {
                        fjt.a(b.d(b.this), "亲,您暂未登录~");
                        return;
                    } else {
                        fjt.a(b.d(b.this), "取消收藏失败,原因未知");
                        return;
                    }
                }
                fjt.a(b.d(b.this), "取消收藏失败,原因未知");
            }
        });
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", this.e);
        com.taobao.android.msoa.c.a().a(new fhj("taobao_detail", hashMap), new MSOAServiceListener() { // from class: com.taobao.android.detail2.core.framework.view.navbar.b.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onSuccess(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                } else if (map != null && map.containsKey("addResult") && ((Boolean) map.get("addResult")).booleanValue()) {
                    b.b(b.this, true);
                    fjt.a(b.d(b.this), b.e(b.this));
                } else {
                    fjt.a(b.d(b.this), b.f(b.this));
                }
            }

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                    return;
                }
                b.b(b.this, false);
                if (!StringUtils.isEmpty(str2) && z) {
                    if (ErrorConstant.isSessionInvalid(str) || "ANDROID_SYS_LOGIN_CANCEL".equals(str)) {
                        fjt.a(b.d(b.this), "亲,您暂未登录~");
                        return;
                    } else {
                        fjt.a(b.d(b.this), "收藏失败,原因未知");
                        return;
                    }
                }
                fjt.a(b.d(b.this), "收藏失败,原因未知");
            }
        });
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.d == z) {
        } else {
            this.d = z;
            if (this.d) {
                this.b.setText(this.f);
                this.b.setTextColor(Color.parseColor("#f50000"));
                return;
            }
            this.b.setTextColor(this.l);
            this.b.setText(this.g);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.c;
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        if (jSONObject2 == null) {
            this.c = null;
            return;
        }
        this.e = jSONObject2.getString("itemId");
        JSONObject jSONObject3 = jSONObject2.getJSONObject(dwy.KEY_DETAIL_COLLECTED);
        if (jSONObject3 == null) {
            this.c = null;
            return;
        }
        this.f = jSONObject3.getString("iconFont");
        JSONObject jSONObject4 = jSONObject2.getJSONObject("uncollect");
        if (jSONObject3 == null) {
            this.c = null;
        } else {
            this.g = jSONObject4.getString("iconFont");
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.k;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.j.y().a("item", str, "", "", new HashMap(), this.h);
        }
    }
}
