package com.taobao.tao.flexbox.layoutmanager.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.animation.Animation;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent;
import com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.h;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;

/* loaded from: classes8.dex */
public class x implements s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1693459935);
        kge.a(-1420926486);
    }

    public static /* synthetic */ void a(x xVar, aa aaVar, aa aaVar2, String str, boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7093c73", new Object[]{xVar, aaVar, aaVar2, str, new Boolean(z), map});
        } else {
            xVar.a(aaVar, aaVar2, str, z, map);
        }
    }

    public static /* synthetic */ void a(x xVar, aa aaVar, aa aaVar2, String str, boolean z, Map map, aa aaVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50da51b", new Object[]{xVar, aaVar, aaVar2, str, new Boolean(z), map, aaVar3});
        } else {
            xVar.a(aaVar, aaVar2, str, z, map, aaVar3);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(aa aaVar, aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        if (str2 != null && str2.startsWith("$://")) {
            String substring = str2.substring(4);
            int indexOf = substring.indexOf("?");
            if ((indexOf != -1 ? substring.substring(0, indexOf) : substring).equals("poplayer")) {
                JSONObject jSONObject = null;
                if (indexOf != -1) {
                    try {
                        jSONObject = JSON.parseObject((String) l.a((String) null, substring.substring(indexOf + 1), aaVar2.c));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                a(aaVar2, (Map) jSONObject, false);
                return true;
            }
        } else if ("poplayer".equals(str)) {
            a(aaVar2, map, true);
            return true;
        } else if ("hidepoplayer".equals(str)) {
            a(aaVar2.L(), map);
            return true;
        } else if ("onclose".equals(str)) {
            aa M = aaVar.M();
            if ("poplayer".equals(M.K()) && (M.I() instanceof PopLayerComponent)) {
                ((PopLayerComponent) M.I()).dismiss();
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue() : onHandleTNodeMessage(eVar.f20300a, eVar.b, eVar.c, null, eVar.d, eVar.e);
    }

    private void a(aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c40135", new Object[]{this, aaVar, map});
        } else {
            a(aaVar.k().a(oec.a(map.get("target"), 0)), oec.a(map.get("src"), (String) null), oec.a(map.get("animated"), false));
        }
    }

    private void a(aa aaVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0688ffa", new Object[]{this, aaVar, str, new Boolean(z)});
        } else if (aaVar != null && (aaVar.x() instanceof FlatViewGroup)) {
            final FlatViewGroup flatViewGroup = (FlatViewGroup) aaVar.x();
            for (int i = 0; i < flatViewGroup.getChildCount(); i++) {
                final View childAt = flatViewGroup.getChildAt(i);
                boolean z2 = childAt instanceof PopLayerComponent.PopLayerContainerView;
                if (z2) {
                    PopLayerComponent.PopLayerContainerView popLayerContainerView = (PopLayerComponent.PopLayerContainerView) childAt;
                    if (StringUtils.equals(str, popLayerContainerView.getSrc())) {
                        if (!z) {
                            flatViewGroup.removeView(childAt);
                        } else {
                            if (!z2) {
                                flatViewGroup.removeView(childAt);
                            }
                            PopLayerComponent popLayerComponent = (PopLayerComponent) popLayerContainerView.getComponent();
                            if (popLayerComponent != null && popLayerComponent.getPopAnimation() != null) {
                                popLayerComponent.getPopAnimation().b(childAt, new PopLayerComponent.b.a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.x.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // android.view.animation.Animation.AnimationListener
                                    public void onAnimationRepeat(Animation animation) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                                        }
                                    }

                                    @Override // android.view.animation.Animation.AnimationListener
                                    public void onAnimationStart(Animation animation) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                                        }
                                    }

                                    @Override // com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.b.a
                                    public void a() {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                        } else {
                                            flatViewGroup.removeView(childAt);
                                        }
                                    }

                                    @Override // android.view.animation.Animation.AnimationListener
                                    public void onAnimationEnd(Animation animation) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                                        } else {
                                            flatViewGroup.removeView(childAt);
                                        }
                                    }
                                });
                            } else {
                                flatViewGroup.removeView(childAt);
                            }
                        }
                    }
                }
            }
        }
    }

    private void a(final aa aaVar, final Map map, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fbcd83f", new Object[]{this, aaVar, map, new Boolean(z)});
            return;
        }
        final String a2 = oec.a(map.get("src"), (String) null);
        if (a2 == null) {
            return;
        }
        final aa L = aaVar.L();
        if (((h.b) L.c.f.get(a2)) == null) {
            return;
        }
        if (EditTextComponent.isInputMethodShown()) {
            oec.f(L.N());
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.x.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        x.a(x.this, aaVar, L, a2, z, map);
                    }
                }
            }, 500L);
            return;
        }
        a(aaVar, L, a2, z, map);
    }

    private void a(aa aaVar, aa aaVar2, String str, boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac74cc33", new Object[]{this, aaVar, aaVar2, str, new Boolean(z), map});
            return;
        }
        int a2 = oec.a(map.get("target"), 0);
        a(aaVar2, str, map, a2);
        aa a3 = aaVar2.k().a(a2);
        if (a3 != null) {
            a(aaVar, aaVar2, str, map, a3);
        } else {
            a(aaVar, aaVar2, str, z, map, (aa) null);
        }
    }

    private void a(aa aaVar, String str, Map map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed37a38", new Object[]{this, aaVar, str, map, new Integer(i)});
        } else if (!oec.a(map.get("singleton"), false)) {
        } else {
            String a2 = oec.a(map.get("url"), "");
            boolean a3 = oec.a(map.get("animated"), false);
            String str2 = a2 + str;
            int d = aaVar.k().d(str2);
            if (d != 0) {
                a(aaVar.k().a(d), str, a3);
            }
            aaVar.k().a(str2, Integer.valueOf(i));
        }
    }

    private void a(final aa aaVar, final aa aaVar2, final String str, final Map map, final aa aaVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64d169eb", new Object[]{this, aaVar, aaVar2, str, map, aaVar3});
            return;
        }
        String a2 = oec.a(map.get("url"), "");
        if (!StringUtils.isEmpty(a2)) {
            ab.h.a aVar = new ab.h.a(aaVar2.N());
            m.b a3 = com.taobao.tao.flexbox.layoutmanager.container.m.a(a2);
            if (a3 == null || !a3.g) {
                ogg.b("invalid poplayer url:" + a2);
                return;
            }
            Uri uri = a3.b;
            String uri2 = uri.toString();
            if (uri2.startsWith("./")) {
                aVar.d(uri2);
            } else {
                String queryParameter = uri.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH);
                aVar.c(uri2);
                if (!StringUtils.isEmpty(queryParameter)) {
                    aVar.d(queryParameter);
                }
            }
            int i = aaVar3.G().b;
            int i2 = aaVar3.G().f20361a;
            aVar.b(str);
            aVar.a((map == null || (map instanceof JSONObject)) ? map : JSON.parseObject(JSON.toJSONString(map)));
            aVar.b(aaVar2.C());
            TNodeView.create(aVar, aaVar2.k(), new TNodeView.b() { // from class: com.taobao.tao.flexbox.layoutmanager.core.x.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
                public void onLayoutCompleted(aa aaVar4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3fb42811", new Object[]{this, aaVar4});
                    } else if (aaVar4.I() instanceof PopLayerComponent) {
                        ((PopLayerComponent) aaVar4.I()).setSrc(str);
                        if (aaVar4.x().getParent() != null) {
                            ((TNodeView) aaVar4.x().getParent()).removeAllViews();
                        }
                        if (aaVar3.x() instanceof FlatViewGroup) {
                            ((PopLayerComponent) aaVar4.I()).showInTargetView((FlatViewGroup) aaVar3.x());
                        } else {
                            ogg.a("poplayer targetNode view must be FlatViewGroup");
                        }
                    } else {
                        x.a(x.this, aaVar, aaVar2, str, true, map, aaVar3);
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
                public void onLayoutError() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("834776a6", new Object[]{this});
                    } else {
                        x.a(x.this, aaVar, aaVar2, str, true, map, aaVar3);
                    }
                }
            }).prelayout(i2, i);
            return;
        }
        a(aaVar, aaVar2, str, true, map, aaVar3);
    }

    private void a(final aa aaVar, aa aaVar2, final String str, boolean z, Map map, final aa aaVar3) {
        int i;
        Activity g;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e33a4db", new Object[]{this, aaVar, aaVar2, str, new Boolean(z), map, aaVar3});
            return;
        }
        ab.h.a aVar = new ab.h.a(aaVar2.N());
        if (!oec.a(map.get("fullScreen"), false) || (g = oec.g(aaVar2.N())) == null) {
            i = 0;
        } else {
            i2 = g.getWindow().getDecorView().getHeight();
            aVar.a(i2);
            i = g.getWindow().getDecorView().getWidth();
            aVar.b(i);
        }
        if (i2 <= 0 || i <= 0) {
            int height = aaVar2.k().A().x().getHeight();
            if (!(aaVar2.k().g() instanceof com.taobao.tao.flexbox.layoutmanager.container.f)) {
                height = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a(aaVar2.N(), height);
            }
            if (aaVar3 != null) {
                height = aaVar3.G().b;
                i = aaVar3.G().f20361a;
                aVar.b(i);
            }
            if (i <= 0 && oeb.a("fixPopLayerWidth", true)) {
                aVar.b(aaVar2.k().A().x().getWidth());
            }
            aVar.a(height);
        }
        aVar.b(str);
        if (z) {
            if (map != null && !(map instanceof JSONObject)) {
                map = JSON.parseObject(JSON.toJSONString(map));
            }
            aVar.a(map);
        } else {
            aVar.a((Map) aaVar.e("data"));
        }
        aVar.b(aaVar2.C());
        aVar.c(aaVar2.f20292a.b);
        aVar.d(aaVar2.f20292a.c);
        ab.h e = aVar.e();
        e.g = aaVar2.k();
        aaVar2.k().a(e, aaVar2.c.f, new ab.g() { // from class: com.taobao.tao.flexbox.layoutmanager.core.x.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.g
            public void a(aa aaVar4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("691d3050", new Object[]{this, aaVar4});
                    return;
                }
                Context N = aaVar.N();
                if (((N instanceof Activity) && ((Activity) N).isFinishing()) || !(aaVar4.I() instanceof PopLayerComponent)) {
                    return;
                }
                ((PopLayerComponent) aaVar4.I()).setSrc(str);
                aa aaVar5 = aaVar3;
                if (aaVar5 == null || aaVar5.x() == null) {
                    if (aaVar.x() == null) {
                        return;
                    }
                    ((PopLayerComponent) aaVar4.I()).show(aaVar.x(), true);
                } else if (aaVar3.x() instanceof FlatViewGroup) {
                    ((PopLayerComponent) aaVar4.I()).showInTargetView((FlatViewGroup) aaVar3.x());
                } else {
                    ogg.a("poplayer targetNode view must be FlatViewGroup");
                }
            }
        });
    }
}
