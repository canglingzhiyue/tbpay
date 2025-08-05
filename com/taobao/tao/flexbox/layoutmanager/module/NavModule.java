package com.taobao.tao.flexbox.layoutmanager.module;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.m;
import com.taobao.tao.flexbox.layoutmanager.component.i;
import com.taobao.tao.flexbox.layoutmanager.component.j;
import com.taobao.tao.flexbox.layoutmanager.container.SheetContainer;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.oga;
import tb.ogj;
import tb.ogl;
import tb.ogu;

/* loaded from: classes8.dex */
public class NavModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FULL_PAGE_SEGMENT = "/app/tb-source-app/video-fullpage/pages/index2";
    public static final String FULL_PAGE_TRANSPARENT_SEGMENT = "/video-fullpage/transparent-videolist.html";

    static {
        kge.a(425307317);
        kge.a(-818961104);
    }

    public static /* synthetic */ void access$000(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6817c91f", new Object[]{aaVar});
        } else {
            cacheShareDrawable(aaVar);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:6|(2:8|(13:10|(2:11|(3:13|(2:15|16)(1:18)|17)(0))|20|(1:22)|24|(4:30|(3:32|(2:35|33)|36)|37|(1:41))|(4:43|44|45|(2:48|46))(1:76)|49|50|(2:52|(5:56|(1:58)|59|(2:62|60)|63))|(2:(1:67)|68)|69|70)(2:78|(1:80)(0)))(2:81|(1:83)(1:84))|19|20|(0)|24|(6:26|28|30|(0)|37|(2:39|41))|(0)(0)|49|50|(0)|(0)|69|70) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0193, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0194, code lost:
        tb.ogg.b("parse tnode_transition_info failed " + r3.getMessage());
        r3.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1 A[Catch: Throwable -> 0x00a4, TRY_LEAVE, TryCatch #1 {Throwable -> 0x00a4, blocks: (B:24:0x0095, B:26:0x00a1), top: B:79:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149 A[Catch: Exception -> 0x0193, TryCatch #2 {Exception -> 0x0193, blocks: (B:54:0x0143, B:56:0x0149, B:58:0x015a, B:60:0x0160, B:62:0x016d, B:63:0x0173, B:64:0x017b, B:66:0x0181), top: B:81:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void openURL(com.taobao.tao.flexbox.layoutmanager.ac.g.c r11) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.module.NavModule.openURL(com.taobao.tao.flexbox.layoutmanager.ac.g$c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void navOpenUrl(com.taobao.tao.flexbox.layoutmanager.ac.g.c r10, java.lang.String r11, java.util.List<android.util.Pair<android.view.View, java.lang.String>> r12, android.os.Bundle r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.module.NavModule.navOpenUrl(com.taobao.tao.flexbox.layoutmanager.ac.g$c, java.lang.String, java.util.List, android.os.Bundle, android.os.Bundle):void");
    }

    private static void findTransitionViews(ab abVar, int i, Pair<Map, List> pair, List<Pair<View, String>> list) {
        aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2df07a96", new Object[]{abVar, new Integer(i), pair, list});
        } else if (pair != null && (a2 = abVar.a(i)) != null) {
            Map map = (Map) pair.first;
            List list2 = (List) pair.second;
            if (map == null) {
                if (list2 == null) {
                    return;
                }
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    Map a3 = oec.a(list2.get(i2), (Map) null);
                    if (a3 != null) {
                        searchShareElement(a3, a2, list, true, false);
                    }
                }
                return;
            }
            searchShareElement(map, a2, list, true, true);
            if (list2 == null) {
                return;
            }
            for (int i3 = 0; i3 < list2.size(); i3++) {
                Map a4 = oec.a(list2.get(i3), (Map) null);
                if (a4 != null) {
                    searchShareElement(a4, a2, list, oeb.bi(), false);
                }
            }
        }
    }

    private static void searchShareElement(Map map, aa aaVar, final List<Pair<View, String>> list, final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbeb5732", new Object[]{map, aaVar, list, new Boolean(z), new Boolean(z2)});
        } else if (map != null) {
            for (final Map.Entry entry : map.entrySet()) {
                final boolean[] zArr = new boolean[1];
                aaVar.a(new aa.c<aa>() { // from class: com.taobao.tao.flexbox.layoutmanager.module.NavModule.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                    public boolean a(aa aaVar2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("691d3054", new Object[]{this, aaVar2})).booleanValue();
                        }
                        String str = (String) entry.getValue();
                        boolean z3 = str != null && str.equals(aaVar2.e((String) entry.getKey()));
                        zArr[0] = z3;
                        if (z3 && aaVar2.I() != null && aaVar2.I().getTransitionView() != null) {
                            View transitionView = aaVar2.I().getTransitionView();
                            if (z) {
                                if (z2 && oeb.bi()) {
                                    str = str + "card";
                                    transitionView.setTag(R.id.layout_manager_transition_card_view, true);
                                }
                                transitionView.setTransitionName(str);
                                transitionView.setId(str.hashCode());
                                list.add(Pair.create(transitionView, transitionView.getTransitionName()));
                            }
                            NavModule.access$000(aaVar2);
                        }
                        return z3;
                    }

                    @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                    public boolean b(aa aaVar2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("aca84e15", new Object[]{this, aaVar2})).booleanValue() : zArr[0];
                    }
                }, (List<aa>) null, 2);
            }
        }
    }

    private static void cacheShareDrawable(aa aaVar) {
        Drawable imageDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc67aeaa", new Object[]{aaVar});
        } else if (aaVar.I() instanceof j) {
            Drawable d = ((j) aaVar.I()).d();
            if (d == null) {
                return;
            }
            ogu.a(((ogj) ((j) aaVar.I()).getViewParams()).f, aaVar.x(), d);
        } else if (!(aaVar.I() instanceof i) || (imageDrawable = ((i) aaVar.I()).getImageDrawable()) == null) {
        } else {
            ogu.a(((i) aaVar.I()).getImageUrl(), aaVar.x(), imageDrawable);
        }
    }

    private static void findTransitionViews(aa aaVar, List<Pair<View, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ae13440", new Object[]{aaVar, list});
            return;
        }
        if (aaVar.I() != null && aaVar.I().getTransitionView() != null) {
            View transitionView = aaVar.I().getTransitionView();
            ogl viewParams = aaVar.I().getViewParams();
            if (!oec.h(viewParams.bc)) {
                transitionView.setTransitionName(viewParams.bc);
                transitionView.setId(viewParams.bc.hashCode());
                list.add(Pair.create(transitionView, transitionView.getTransitionName()));
                Drawable drawable = null;
                if (aaVar.I() instanceof j) {
                    drawable = ((j) aaVar.I()).d();
                } else if (aaVar.I() instanceof i) {
                    drawable = ((i) aaVar.I()).getImageDrawable();
                }
                if (drawable != null) {
                    ogu.a(viewParams.bc, transitionView, drawable);
                }
                com.taobao.tao.flexbox.layoutmanager.animation.shareelement.b.a(transitionView);
            }
        }
        for (aa aaVar2 : aaVar.d) {
            findTransitionViews(aaVar2, list);
        }
    }

    public static void push(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c724937e", new Object[]{cVar});
        } else {
            openURL(cVar);
        }
    }

    public static void pop(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("975ca127", new Object[]{cVar});
        } else if (cVar.f19938a.g() instanceof SheetContainer) {
            ((SheetContainer) cVar.f19938a.g()).destroy();
        } else {
            f fVar = null;
            if (cVar.f19938a.g() instanceof f) {
                fVar = (f) cVar.f19938a.g();
            }
            if (oga.a(cVar.a(), fVar)) {
                return;
            }
            boolean a2 = cVar.b instanceof Map ? oec.a(((Map) cVar.b).get("animated"), false) : false;
            if (fVar != null) {
                fVar.finish(a2);
            } else if (cVar.a() instanceof Activity) {
                ((Activity) cVar.a()).finish();
                if (a2) {
                    return;
                }
                ((Activity) cVar.a()).overridePendingTransition(0, 0);
            } else if (!cVar.f19938a.A().c().k) {
            } else {
                cVar.f19938a.y();
            }
        }
    }

    public static void popTo(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e81342c", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            oec.a(((Map) cVar.b).get("animated"), false);
            if (oec.a(((Map) cVar.b).get("target"), -1) <= 0) {
                return;
            }
            String e = cVar.f19938a.A().c().e();
            String name = cVar.a().getClass().getName();
            Bundle bundle = new Bundle();
            bundle.putBoolean(m.EXTRA_POP_TO, true);
            bundle.putInt(m.EXTRA_NODE_TARGET, cVar.f19938a.A().E());
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().l().a(cVar.a(), name, e, bundle, null, 603979776);
        }
    }
}
