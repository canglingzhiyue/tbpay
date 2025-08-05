package com.taobao.android.tab2liveroom.liveroom.immersive;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.facebook.yoga.YogaNode;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.android.tab2liveroom.liveroom.b;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import tb.kge;
import tb.oeb;
import tb.ogg;
import tb.ohd;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private com.taobao.android.tab2liveroom.liveroom.a f15294a;
    private Context b;
    private boolean c = false;
    private NavigationTabModule.a d;
    private boolean e;

    static {
        kge.a(-660144394);
    }

    public static /* synthetic */ Context a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3a323732", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb3c32fb", new Object[]{aVar});
        } else {
            aVar.f();
        }
    }

    public a(com.taobao.android.tab2liveroom.liveroom.a aVar, Context context) {
        this.f15294a = aVar;
        this.b = context;
    }

    public YogaMeasureFunction a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaMeasureFunction) ipChange.ipc$dispatch("1064bfb7", new Object[]{this});
        }
        if (!h()) {
            return null;
        }
        return new YogaMeasureFunction() { // from class: com.taobao.android.tab2liveroom.liveroom.immersive.ImmersiveManager$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.facebook.yoga.YogaMeasureFunction
            public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("15b3ebfa", new Object[]{this, yogaNode, new Float(f), yogaMeasureMode, new Float(f2), yogaMeasureMode2})).longValue();
                }
                int o = ohd.o(a.a(a.this));
                ogg.a("ImmersiveManager", "tab2直播测量组件宽高结果，availableHeight：" + o);
                return YogaMeasureOutput.make(f, o);
            }
        };
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.e) {
        } else {
            this.d = new NavigationTabModule.a() { // from class: com.taobao.android.tab2liveroom.liveroom.immersive.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // com.taobao.android.layoutmanager.module.NavigationTabModule.a
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    ogg.a("ImmersiveManager", "沉浸式监听到底部TabBar显隐状态的改变，isHideStatus：" + z);
                    a.this.a(z);
                    a.b(a.this);
                }
            };
            a(!com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().g());
            NavigationTabModule.registerNavigationShowHideStatusListener(this.d);
            this.e = true;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        NavigationTabModule.unregisterNavigationShowHideStatusListener(this.d);
        this.e = false;
    }

    public JSONObject a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("eef312bb", new Object[]{this, new Integer(i)}) : a(0, 0, 0, i);
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        if (h() && !e()) {
            return ohd.b(this.b, 48);
        }
        return 0;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.c;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void b(boolean z) {
        com.taobao.android.tab2liveroom.liveroom.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if ((i() != null && !oeb.b(i().n(), i().o())) || (aVar = this.f15294a) == null || aVar.getNode() == null || this.f15294a.getNode().am() == null) {
        } else {
            if (z) {
                this.f15294a.getNode().am().resetForceLayout();
                return;
            }
            int o = ohd.o(this.b);
            int f = ohd.f(this.b);
            ogg.c("ImmersiveManager", "沉浸式，rootViewHeightChange: width:" + f + ",height:" + o + ",needRecover" + z);
            this.f15294a.getNode().am().forceLayout(f, o, 10);
        }
    }

    private JSONObject a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("36462c48", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("leftOffset", (Object) Integer.valueOf(i));
        jSONObject.put("topOffset", (Object) Integer.valueOf(i2));
        jSONObject.put("rightOffset", (Object) Integer.valueOf(i3));
        jSONObject.put("bottomOffset", (Object) Integer.valueOf(i4));
        return jSONObject;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (g() == null) {
        } else {
            JSONObject a2 = a(d());
            ogg.a("ImmersiveManager", "沉浸式直播间容器偏移处理，handleLiveContainerOffset，offset " + a2);
            g().callPlatform(PlatformListenerEnum.setContainerOffset, a2);
        }
    }

    private TaoliveOpenLiveRoom g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveOpenLiveRoom) ipChange.ipc$dispatch("7ff75a7a", new Object[]{this});
        }
        com.taobao.android.tab2liveroom.liveroom.a aVar = this.f15294a;
        if (aVar == null) {
            return null;
        }
        return aVar.b();
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        if (i() == null) {
            return false;
        }
        return oeb.a(i().n(), i().o());
    }

    private b i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9ca04183", new Object[]{this});
        }
        com.taobao.android.tab2liveroom.liveroom.a aVar = this.f15294a;
        if (aVar != null && aVar.getViewParams() != null) {
            return this.f15294a.getViewParams();
        }
        return null;
    }
}
