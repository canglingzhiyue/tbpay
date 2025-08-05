package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.view.BlurViewGroup;
import java.util.ArrayList;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.ogl;

/* loaded from: classes8.dex */
public class b extends e implements com.taobao.tao.flexbox.layoutmanager.core.s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f20115a = true;

    static {
        kge.a(-66540741);
        kge.a(-1420926486);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2141646649) {
            super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode != 1052797818) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.detach(((Boolean) objArr[0]).booleanValue());
            return null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e, com.taobao.tao.flexbox.layoutmanager.core.d
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e
    public boolean needRecycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98f38ff2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ View a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("850c2d52", new Object[]{bVar}) : bVar.view;
    }

    public static /* synthetic */ View b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4c181453", new Object[]{bVar}) : bVar.view;
    }

    public static /* synthetic */ View c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("1323fb54", new Object[]{bVar}) : bVar.view;
    }

    public static /* synthetic */ View d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("da2fe255", new Object[]{bVar}) : bVar.view;
    }

    public static /* synthetic */ View e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a13bc956", new Object[]{bVar}) : bVar.view;
    }

    public static /* synthetic */ View f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6847b057", new Object[]{bVar}) : bVar.view;
    }

    public static /* synthetic */ View g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("2f539758", new Object[]{bVar}) : bVar.view;
    }

    public static /* synthetic */ View h(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f65f7e59", new Object[]{bVar}) : bVar.view;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e, com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        BlurViewGroup blurViewGroup = new BlurViewGroup(context);
        blurViewGroup.setBlurRadius(((a) this.viewParams).b);
        blurViewGroup.setScaleRadius(((a) this.viewParams).c);
        blurViewGroup.bindComponent(this);
        return blurViewGroup;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void applyAttrForView(View view, ogl oglVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, view, oglVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(view, oglVar, map, z);
        if (!this.f20115a) {
            return;
        }
        BlurViewGroup blurViewGroup = (BlurViewGroup) view;
        blurViewGroup.setViewParams(oglVar);
        blurViewGroup.setOriginBackground(view.getBackground());
        this.f20115a = false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e, com.taobao.tao.flexbox.layoutmanager.core.d, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        super.detach(z);
        this.f20115a = true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public ogl mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : new a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(final com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        if ("onBlurViewRefresh".equals(str)) {
            if (((a) this.viewParams).d) {
                oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (b.a(b.this) == null) {
                        } else {
                            if (((BlurViewGroup) b.b(b.this)).getTargetBlurView() == null && (a2 = aaVar.a(j.class, (aa.c) new aa.c<com.taobao.tao.flexbox.layoutmanager.core.aa>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.b.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                                public boolean b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar3) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        return ((Boolean) ipChange3.ipc$dispatch("aca84e15", new Object[]{this, aaVar3})).booleanValue();
                                    }
                                    return false;
                                }

                                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                                public boolean a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar3) {
                                    IpChange ipChange3 = $ipChange;
                                    return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("691d3054", new Object[]{this, aaVar3})).booleanValue() : oec.a(aaVar3.e("effect-view"), false);
                                }
                            }, false)) != null) {
                                ((BlurViewGroup) b.c(b.this)).setTargetBlurView(a2.x());
                            }
                            ((BlurViewGroup) b.d(b.this)).refreshBG();
                        }
                    }
                });
            }
        } else if ("onstatechanged".equals(str)) {
            if (1 == oec.a(map.get("state"), -1)) {
                oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
                        com.taobao.tao.flexbox.layoutmanager.core.aa b;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (b.e(b.this) == null) {
                        } else {
                            if (((BlurViewGroup) b.f(b.this)).getTargetBlurView() == null && (a2 = aaVar.a(t.class, (aa.c) null, true)) != null && (b = a2.b(c.class)) != null) {
                                View x = b.x();
                                com.taobao.tao.flexbox.layoutmanager.core.aa a3 = ((c) b.I()).a();
                                ArrayList arrayList = new ArrayList();
                                a3.a(new aa.c<com.taobao.tao.flexbox.layoutmanager.core.aa>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.b.2.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                                    public boolean b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar3) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            return ((Boolean) ipChange3.ipc$dispatch("aca84e15", new Object[]{this, aaVar3})).booleanValue();
                                        }
                                        return false;
                                    }

                                    @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                                    public boolean a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar3) {
                                        IpChange ipChange3 = $ipChange;
                                        return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("691d3054", new Object[]{this, aaVar3})).booleanValue() : oec.a(aaVar3.e("effect-view"), false);
                                    }
                                }, arrayList, 2);
                                if (!arrayList.isEmpty()) {
                                    x = arrayList.get(0).x();
                                }
                                ((BlurViewGroup) b.g(b.this)).setTargetBlurView(x);
                            }
                            ((BlurViewGroup) b.h(b.this)).refreshBG();
                        }
                    }
                });
            }
            return true;
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue() : onHandleTNodeMessage(eVar.f20300a, eVar.b, eVar.c, null, eVar.d, eVar.e);
    }

    /* loaded from: classes8.dex */
    public class a extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f20120a = "light";
        public int b = 25;
        public int c = 10;
        public boolean d = false;

        static {
            kge.a(801873147);
        }

        public a() {
        }

        @Override // tb.ogl
        public void a(Context context, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("840caf86", new Object[]{this, context, str, obj});
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case 109780401:
                    if (str.equals("style")) {
                        c = 0;
                        break;
                    }
                    break;
                case 681292984:
                    if (str.equals("blur-radius")) {
                        c = 1;
                        break;
                    }
                    break;
                case 911124085:
                    if (str.equals("scale-radius")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1707220945:
                    if (str.equals("blur-normal-state")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.f20120a = oec.a(obj, "light");
            } else if (c == 1) {
                this.b = oec.a(obj, 25);
            } else if (c == 2) {
                this.c = oec.a(obj, 10);
            } else if (c != 3) {
            } else {
                this.d = oec.a(obj, false);
            }
        }
    }
}
