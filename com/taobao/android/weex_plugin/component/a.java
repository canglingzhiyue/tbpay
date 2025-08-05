package com.taobao.android.weex_plugin.component;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.b;
import com.taobao.android.weex.e;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.s;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f16113a;
    private boolean b;
    private s c;
    private boolean d;
    private boolean e;
    private boolean f;
    private int g;
    private boolean h;

    public static /* synthetic */ int a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9f60f00c", new Object[]{aVar})).intValue() : aVar.g;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cbdc5df", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.b = z;
        return z;
    }

    public static /* synthetic */ s b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("4672897e", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e74241f", new Object[]{aVar})).booleanValue() : aVar.h;
    }

    public static /* synthetic */ boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9dfdbe20", new Object[]{aVar})).booleanValue() : aVar.e;
    }

    public static /* synthetic */ boolean e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d875821", new Object[]{aVar})).booleanValue() : aVar.f;
    }

    public static /* synthetic */ boolean f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d10f222", new Object[]{aVar})).booleanValue() : aVar.d;
    }

    public void a(WeexInstance weexInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("397cbe2a", new Object[]{this, weexInstance, jSONObject});
            return;
        }
        s.a aVar = new s.a((Activity) weexInstance.getContext());
        aVar.a(jSONObject.getString("src"));
        aVar.h(true);
        aVar.d("NonTBVideo");
        aVar.f(true);
        this.c = aVar.a();
        if (!this.f16113a) {
            return;
        }
        this.c.a();
    }

    public void a(final WeexInstance weexInstance, final int i, final b bVar, final b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71504a3d", new Object[]{this, weexInstance, new Integer(i), bVar, bVar2});
            return;
        }
        s sVar = this.c;
        if (sVar == null) {
            return;
        }
        sVar.a(new aw() { // from class: com.taobao.android.weex_plugin.component.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.aw
            public void onVideoClose() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("24db3403", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
                }
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoPrepared(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3faee61c", new Object[]{this, obj});
                }
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
                }
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoSeekTo(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i2)});
                }
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c2b2d56d", new Object[]{this});
                    return;
                }
                if (a.a(a.this) > 0 && a.b(a.this) != null) {
                    a.b(a.this).d(a.a(a.this));
                }
                if (a.b(a.this) != null) {
                    a.b(a.this).a(a.c(a.this));
                }
                bVar.a(new JSONObject());
                if (!a.d(a.this)) {
                    return;
                }
                weexInstance.dispatchNodeEvent(i, "play", e.b().a(new JSONObject()));
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoPause(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                    return;
                }
                a.a(a.this, false);
                if (!a.e(a.this)) {
                    return;
                }
                weexInstance.dispatchNodeEvent(i, "pause", e.b().a(new JSONObject()));
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoPlay() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("931007b7", new Object[]{this});
                    return;
                }
                a.a(a.this, false);
                if (!a.d(a.this)) {
                    return;
                }
                weexInstance.dispatchNodeEvent(i, "play", e.b().a(new JSONObject()));
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoError(Object obj, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i2), new Integer(i3)});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", (Object) Integer.valueOf(i2));
                jSONObject.put("message", (Object) Integer.valueOf(i3));
                bVar2.a(jSONObject);
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                if (a.e(a.this)) {
                    weexInstance.dispatchNodeEvent(i, "pause", e.b().a(new JSONObject()));
                }
                weexInstance.dispatchNodeEvent(i, "ended", e.b().a(new JSONObject()));
                a.a(a.this, true);
            }

            @Override // com.taobao.avplayer.aw
            public void onVideoProgressChanged(int i2, int i3, int i4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
                } else if (!a.f(a.this)) {
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("currentTime", (Object) Integer.valueOf(i2));
                    jSONObject.put("totalPlayTime", (Object) Integer.valueOf(i4));
                    jSONObject.put("duration", (Object) Integer.valueOf(i2 / 1000));
                    weexInstance.dispatchNodeEvent(i, "timeupdate", e.b().a(jSONObject));
                }
            }
        });
        if (this.c.j() == 2) {
            this.c.g();
            return;
        }
        this.c.a();
        this.c.g();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.b();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c.a((aw) null);
        this.c.f();
    }

    public void a(WeexInstance weexInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12bd9d0", new Object[]{this, weexInstance, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", (Object) str);
        s sVar = this.c;
        if (sVar != null) {
            sVar.f();
            this.c = null;
        }
        a(weexInstance, jSONObject);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.g = i * 1000;
        this.c.d(this.g);
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c.k();
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.c.l();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = z;
        this.c.a(z);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.c.i();
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : !this.c.n();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.b;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f16113a = z;
        if (this.c.n()) {
            return;
        }
        this.c.g();
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.c.d(z);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if ("timeupdate".equals(str)) {
            this.d = true;
        } else if ("play".equals(str)) {
            this.e = true;
        } else if (!"pause".equals(str)) {
        } else {
            this.f = true;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if ("timeupdate".equals(str)) {
            this.d = false;
        } else if ("play".equals(str)) {
            this.e = false;
        } else if (!"pause".equals(str)) {
        } else {
            this.f = false;
        }
    }
}
