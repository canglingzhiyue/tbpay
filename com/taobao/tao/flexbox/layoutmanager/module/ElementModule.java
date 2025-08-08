package com.taobao.tao.flexbox.layoutmanager.module;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.AbsListView;
import android.widget.ScrollView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent;
import com.taobao.tao.flexbox.layoutmanager.component.TextComponent;
import com.taobao.tao.flexbox.layoutmanager.component.m;
import com.taobao.tao.flexbox.layoutmanager.component.q;
import com.taobao.tao.flexbox.layoutmanager.component.u;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.ad;
import com.taobao.tao.flexbox.layoutmanager.core.z;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogi;
import tb.ogj;
import tb.ogl;
import tb.ogu;
import tb.ohd;

@CleanAnnotation(name = "clean")
/* loaded from: classes8.dex */
public class ElementModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashMap<ab, SparseArray> componentObservers;

    public static /* synthetic */ void access$000(aa aaVar, g.c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714a0f8a", new Object[]{aaVar, cVar, str});
        } else {
            getSnapshotInternal(aaVar, cVar, str);
        }
    }

    static {
        kge.a(-1179744050);
        kge.a(-818961104);
        componentObservers = new HashMap<>();
    }

    public static void scrollToTop(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a69eceb", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            aa findTargetNode = findTargetNode(cVar.f19938a.a(jSONObject.getIntValue("target")), jSONObject.getString("id"));
            boolean a2 = oec.a(jSONObject.get("animated"), true);
            if (findTargetNode == null) {
                return;
            }
            if (oeb.a("enableNewScrollToTop", true)) {
                Component I = findTargetNode.I();
                if (!(I instanceof z)) {
                    return;
                }
                ((z) I).scrollToPosition(0, a2, 0);
                unFolderTab(findTargetNode);
            } else if (findTargetNode.x() instanceof AbsListView) {
                ((AbsListView) findTargetNode.x()).setSelection(0);
                unFolderTab(findTargetNode);
            } else if (findTargetNode.x() instanceof RecyclerView) {
                ((RecyclerView) findTargetNode.x()).scrollToPosition(0);
                unFolderTab(findTargetNode);
            } else if (!(findTargetNode.x() instanceof ScrollView)) {
            } else {
                ((ScrollView) findTargetNode.x()).fullScroll(33);
            }
        }
    }

    public static void scrollToBottom(g.c cVar) {
        z zVar;
        int scrollCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f81a945", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            aa findTargetNode = findTargetNode(cVar.f19938a.a(jSONObject.getIntValue("target")), jSONObject.getString("id"));
            boolean a2 = oec.a(jSONObject.get("animated"), true);
            if (findTargetNode == null) {
                return;
            }
            Component I = findTargetNode.I();
            if (!(I instanceof z) || (scrollCount = (zVar = (z) I).getScrollCount()) <= 0) {
                return;
            }
            zVar.scrollToPosition(scrollCount - 1, a2, 2);
        }
    }

    public static void scrollToIndex(g.c cVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0e110e", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            aa findTargetNode = findTargetNode(cVar.f19938a.a(jSONObject.getIntValue("target")), jSONObject.getString("id"));
            int a2 = oec.a(jSONObject.get("index"), -1);
            int a3 = oec.a(jSONObject.get("jumpNumber"), 0);
            boolean a4 = oec.a(jSONObject.get("animated"), true);
            String a5 = oec.a(jSONObject.get("position"), "none");
            if ("middle".equals(a5)) {
                i = 1;
            } else if ("bottom".equals(a5)) {
                i = 2;
            }
            if (findTargetNode == null && a2 < 0) {
                return;
            }
            Component I = findTargetNode.I();
            if (!(I instanceof z)) {
                return;
            }
            ((z) I).scrollToPositionWithNumber(a2, a4, i, a3);
        }
    }

    public static void scroll(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e3642b", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("offset");
            aa aaVar = null;
            String[] split = string != null ? string.split(",") : null;
            if (split == null || split.length != 2) {
                return;
            }
            boolean a2 = oec.a(jSONObject.get("animated"), true);
            aa findTargetNode = findTargetNode(cVar.f19938a.a(jSONObject.getIntValue("target")), jSONObject.getString("id"));
            boolean a3 = oec.a(jSONObject.get("scrollby"), false);
            if (findTargetNode == null) {
                return;
            }
            if (cVar != null && cVar.f19938a != null) {
                aaVar = cVar.f19938a.A();
            }
            Component I = findTargetNode.I();
            int a4 = ohd.a(aaVar, cVar.a(), oec.b(split[0].trim(), 0));
            int a5 = ohd.a(aaVar, cVar.a(), oec.b(split[1].trim(), 0));
            if (!(I instanceof z)) {
                return;
            }
            if (a3) {
                ((z) I).scrollBy(a4, a5, a2);
            } else {
                ((z) I).scrollTo(a4, a5, a2);
            }
        }
    }

    public static void scrollby(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989f63f4", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("offset");
            String[] strArr = null;
            if (string != null) {
                strArr = string.split(",");
            }
            if (strArr == null || strArr.length != 2) {
                return;
            }
            boolean a2 = oec.a(jSONObject.get("animated"), true);
            aa findTargetNode = findTargetNode(cVar.f19938a.a(jSONObject.getIntValue("target")), jSONObject.getString("id"));
            if (findTargetNode == null) {
                return;
            }
            Component I = findTargetNode.I();
            int a3 = ohd.a(cVar.a(), (int) oec.b(strArr[0].trim(), 0));
            int a4 = ohd.a(cVar.a(), (int) oec.b(strArr[1].trim(), 0));
            if (!(I instanceof z)) {
                return;
            }
            ((z) I).scrollBy(a3, a4, a2);
        }
    }

    private static void unFolderTab(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f13fc5d", new Object[]{aaVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("foldTab", false);
        aaVar.I().sendMessage(aaVar, "foldtab", null, hashMap, null);
    }

    public static void selectTab(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51cf77f", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            int intValue = jSONObject.getIntValue("index");
            final String string = jSONObject.getString("id");
            aa a2 = cVar.f19938a.a(jSONObject.getIntValue("target")).M().a(u.class, (aa.c) new aa.c<aa>() { // from class: com.taobao.tao.flexbox.layoutmanager.module.ElementModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean b(aa aaVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("aca84e15", new Object[]{this, aaVar})).booleanValue();
                    }
                    return false;
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean a(aa aaVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("691d3054", new Object[]{this, aaVar})).booleanValue();
                    }
                    if (((u) aaVar.I()) == null) {
                        return false;
                    }
                    if (StringUtils.isEmpty(string)) {
                        return StringUtils.isEmpty(oec.a(aaVar.e("id"), (String) null));
                    }
                    return StringUtils.equals(oec.a(aaVar.e("id"), (String) null), string);
                }
            }, false);
            if (a2 == null) {
                return;
            }
            ((u) a2.I()).a(intValue);
        }
    }

    public static void call(g.c cVar) {
        aa a2;
        aa findTargetNode;
        Component I;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f41648ba", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("name");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            if (StringUtils.isEmpty(string) || (a2 = cVar.f19938a.a(jSONObject.getIntValue("target"))) == null || (findTargetNode = findTargetNode(a2, jSONObject.getString("id"))) == null || (I = findTargetNode.I()) == null) {
                return;
            }
            try {
                I.invoke(cVar, string, jSONObject2, cVar.c);
            } catch (Exception e) {
                ogg.b(e.getMessage());
            }
        }
    }

    public static void setToFront(g.c cVar) {
        aa findTargetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f4832c", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            aa a2 = cVar.f19938a.a(jSONObject.getIntValue("target"));
            if (a2 == null || (findTargetNode = findTargetNode(a2, jSONObject.getString("id"))) == null || findTargetNode.I() == null) {
                return;
            }
            findTargetNode.I().invoke(cVar, "setToFront", null, cVar.c);
        }
    }

    public static void setProgress(g.c cVar) {
        aa findTargetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("424bb289", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            int intValue = jSONObject.getIntValue("progress");
            aa a2 = cVar.f19938a.a(jSONObject.getIntValue("target"));
            if (a2 == null || (findTargetNode = findTargetNode(a2, jSONObject.getString("id"))) == null || !(findTargetNode.I() instanceof q)) {
                return;
            }
            ((q) findTargetNode.I()).a(intValue);
        }
    }

    public static void setFocus(g.c cVar) {
        final aa findTargetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b96482", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            boolean booleanValue = jSONObject.getBoolean(Constants.Event.FOCUS).booleanValue();
            aa a2 = cVar.f19938a.a(jSONObject.getIntValue("target"));
            if (a2 == null || (findTargetNode = findTargetNode(a2, jSONObject.getString("id"))) == null || findTargetNode.x() == null || !(findTargetNode.I() instanceof EditTextComponent)) {
                return;
            }
            if (booleanValue) {
                findTargetNode.x().requestFocus();
                oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.module.ElementModule.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (aa.this.x() == null) {
                        } else {
                            oec.a(aa.this.x());
                        }
                    }
                }, 100L);
                return;
            }
            findTargetNode.x().clearFocus();
            oec.f(findTargetNode.N());
        }
    }

    public static void setAttributes(g.c cVar) {
        aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b46751f", new Object[]{cVar});
        } else if (cVar.b instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) cVar.b;
            JSONObject jSONObject2 = jSONObject.getJSONObject("options");
            JSONArray jSONArray = jSONObject.getJSONArray("list");
            aa a3 = cVar.f19938a.a(jSONObject.getIntValue("target"));
            HashSet hashSet = new HashSet();
            aa.d dVar = new aa.d(cVar, jSONObject2);
            if (jSONArray == null) {
                jSONArray = new JSONArray();
                jSONArray.add(jSONObject);
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                String string = jSONObject3.getString("id");
                aa findTargetNode = !StringUtils.isEmpty(string) ? findTargetNode(a3, string) : a3;
                JSONObject jSONObject4 = jSONObject3.getJSONObject("attrs");
                if (findTargetNode != null && (a2 = findTargetNode.a(jSONObject4, dVar, oeb.ct())) != null) {
                    hashSet.add(new Pair(a2, dVar));
                }
            }
            aa.a(hashSet, dVar);
        }
    }

    public static void setText(g.c cVar) {
        aa findTargetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cafd1e89", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("text");
            aa a2 = cVar.f19938a.a(jSONObject.getIntValue("target"));
            if (a2 == null || (findTargetNode = findTargetNode(a2, jSONObject.getString("id"))) == null) {
                return;
            }
            Component I = findTargetNode.I();
            if (!(I instanceof TextComponent)) {
                return;
            }
            ((TextComponent) I).elementSetText(string);
        }
    }

    public static aa findTargetNode(aa aaVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("5e3493d9", new Object[]{aaVar, str}) : ad.a(aaVar, str);
    }

    private static void getSnapshotInternal(aa aaVar, g.c cVar, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e154d43", new Object[]{aaVar, cVar, str});
            return;
        }
        Component.b snapshot = aaVar.I().getSnapshot();
        if (snapshot != null) {
            ogu.a(str, snapshot);
            if (snapshot.d == null) {
                Context a2 = cVar.a();
                if (a2 instanceof Activity) {
                    try {
                        View decorView = ((Activity) a2).getWindow().getDecorView();
                        decorView.setDrawingCacheEnabled(true);
                        decorView.buildDrawingCache();
                        Bitmap drawingCache = decorView.getDrawingCache();
                        if (drawingCache != null) {
                            snapshot.e = Bitmap.createBitmap(drawingCache);
                        }
                        decorView.setDrawingCacheEnabled(false);
                    } catch (Throwable th) {
                        ogg.a("failed to get drawcache", th.getMessage());
                    }
                }
            }
        }
        if (cVar.c == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (snapshot != null) {
            hashMap.put("imageUrl", snapshot.f20279a);
            hashMap.put("location", snapshot.b.left + "," + snapshot.b.top + "," + snapshot.b.right + "," + snapshot.b.bottom);
            hashMap.put("view_x", Integer.valueOf(snapshot.b.left));
            hashMap.put("view_y", Integer.valueOf(snapshot.b.top));
            hashMap.put("view_w", Integer.valueOf(snapshot.b.right - snapshot.b.left));
            hashMap.put("view_h", Integer.valueOf(snapshot.b.bottom - snapshot.b.top));
        }
        if (!(aaVar.I().getViewParams() instanceof ogj) || (str2 = ((ogj) aaVar.I().getViewParams()).l) == null) {
            str2 = "cover";
        }
        hashMap.put("contentMode", str2);
        hashMap.put("borderRadius", Integer.valueOf(aaVar.I().getViewParams().aJ));
        hashMap.put("key", str);
        cVar.c.a(cVar, hashMap);
    }

    public static void getSnapshot(final g.c cVar) {
        final aa findTargetNode;
        final TNodeRecyclerView tNodeRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89d735e", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            aa a2 = cVar.f19938a.a(jSONObject.getIntValue("target"));
            String string = jSONObject.getString("key");
            if (a2 != null && (findTargetNode = findTargetNode(a2, jSONObject.getString("id"))) != null) {
                if (StringUtils.isEmpty(string)) {
                    string = "snapshot_node_" + findTargetNode.E();
                }
                final String str = string;
                try {
                    aa a3 = findTargetNode.a(m.class, (aa.c) null, true);
                    if (a3 != null && (tNodeRecyclerView = (TNodeRecyclerView) a3.x()) != null && tNodeRecyclerView.getScrollState() != 0) {
                        ScrollChangeListener scrollChangeListener = new ScrollChangeListener() { // from class: com.taobao.tao.flexbox.layoutmanager.module.ElementModule.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
                            public void onNestScroll(int i, int i2, int i3, int i4) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("10a7e84b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                                }
                            }

                            @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
                            public void onScroll(int i, int i2, int i3, int i4) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("e9628353", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                                }
                            }

                            @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
                            public void onScrollStateChanged(int i, int i2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("faf93876", new Object[]{this, new Integer(i), new Integer(i2)});
                                } else if (i != 0) {
                                } else {
                                    ElementModule.access$000(aa.this, cVar, str);
                                    oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.module.ElementModule.3.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                tNodeRecyclerView.removeScrollChangeListener(r5[0]);
                                            }
                                        }
                                    });
                                }
                            }
                        };
                        tNodeRecyclerView.addScrollChangeListener(scrollChangeListener);
                        final ScrollChangeListener[] scrollChangeListenerArr = {scrollChangeListener};
                        return;
                    }
                    getSnapshotInternal(findTargetNode, cVar, str);
                    return;
                } catch (Exception unused) {
                }
            }
            if (cVar.c == null) {
                return;
            }
            cVar.c.a(cVar, new g.a("AC_ERR_FAILED", "AC_ERR_PARAM", null));
        }
    }

    public static void setOpacity(g.c cVar) {
        aa findTargetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402e812f", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            float floatValue = jSONObject.getFloatValue("opacity");
            aa a2 = cVar.f19938a.a(jSONObject.getIntValue("target"));
            if (a2 == null || (findTargetNode = findTargetNode(a2, jSONObject.getString("id"))) == null) {
                return;
            }
            try {
                findTargetNode.a("opacity", Float.valueOf(floatValue));
                findTargetNode.I().getViewParams().aT = floatValue;
                if (findTargetNode.x() == null) {
                    return;
                }
                findTargetNode.x().setAlpha(floatValue);
            } catch (Exception unused) {
            }
        }
    }

    public static void bindEventListener(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bdb5747", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            JSONObject jSONObject2 = jSONObject.getJSONObject("attrs");
            JSONObject jSONObject3 = jSONObject.getJSONObject("bindattrs");
            JSONObject jSONObject4 = jSONObject.getJSONObject("defaultattrs");
            JSONObject jSONObject5 = jSONObject.getJSONObject("event");
            JSONObject jSONObject6 = jSONObject.getJSONObject("options");
            aa a2 = cVar.f19938a.a(jSONObject.getIntValue("target"));
            if (a2 == null) {
                return;
            }
            aa findTargetNode = findTargetNode(a2, jSONObject.getString("id"));
            aa findTargetNode2 = findTargetNode(a2, jSONObject5.getString("id"));
            if (findTargetNode == null || findTargetNode2 == null) {
                return;
            }
            findTargetNode2.a(new ogi(cVar, findTargetNode2, jSONObject5, findTargetNode, jSONObject2, jSONObject3, jSONObject4, jSONObject6));
        }
    }

    public static void addEventListener(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e354ab", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("targetId");
            String string2 = jSONObject.getString("name");
            aa a2 = cVar.f19938a.a(jSONObject.getIntValue("target"));
            if (a2 == null) {
                return;
            }
            aa findTargetNode = findTargetNode(a2, jSONObject.getString("id"));
            aa findTargetNode2 = findTargetNode(a2, string);
            if (findTargetNode == null || findTargetNode2 == null) {
                return;
            }
            findTargetNode2.a(new ogi(findTargetNode2, string2, findTargetNode, cVar));
        }
    }

    public static void bindAttributeListener(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14763705", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            JSONObject jSONObject2 = jSONObject.getJSONObject("attrs");
            JSONObject jSONObject3 = jSONObject.getJSONObject("bindattrs");
            JSONObject jSONObject4 = jSONObject.getJSONObject("defaultattrs");
            JSONObject jSONObject5 = jSONObject.getJSONObject(com.taobao.android.weex_framework.util.a.ATOM_EXT_bind);
            JSONObject jSONObject6 = jSONObject.getJSONObject("options");
            aa a2 = cVar.f19938a.a(jSONObject.getIntValue("target"));
            if (a2 == null) {
                return;
            }
            aa findTargetNode = findTargetNode(a2, jSONObject.getString("id"));
            aa findTargetNode2 = findTargetNode(a2, jSONObject5.getString("id"));
            if (findTargetNode == null || findTargetNode2 == null) {
                return;
            }
            findTargetNode2.a(new ogi(cVar, findTargetNode2, jSONObject5, findTargetNode, jSONObject2, jSONObject3, jSONObject4, jSONObject6));
        }
    }

    public static void addAttributeListener(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b8e269", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("targetId");
            String string2 = jSONObject.getString("name");
            aa a2 = cVar.f19938a.a(jSONObject.getIntValue("target"));
            if (a2 == null) {
                return;
            }
            aa findTargetNode = findTargetNode(a2, jSONObject.getString("id"));
            aa findTargetNode2 = findTargetNode(a2, string);
            if (findTargetNode == null || findTargetNode2 == null) {
                return;
            }
            findTargetNode2.a(new ogi(findTargetNode2, string2, findTargetNode, cVar));
        }
    }

    public static void setHidden(g.c cVar) {
        aa findTargetNode;
        AlphaAnimation alphaAnimation;
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18e5ac2c", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            boolean a2 = oec.a(jSONObject.get("hidden"), false);
            boolean a3 = oec.a(jSONObject.get("animated"), true);
            aa a4 = cVar.f19938a.a(jSONObject.getIntValue("target"));
            if (a4 == null || (findTargetNode = findTargetNode(a4, jSONObject.getString("id"))) == null) {
                return;
            }
            try {
                findTargetNode.I().getViewParams().aU = !a2;
                View x = findTargetNode.x();
                if (x == null) {
                    return;
                }
                AlphaAnimation alphaAnimation2 = null;
                if (a3) {
                    if (a2) {
                        alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    } else {
                        alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    }
                    alphaAnimation2 = alphaAnimation;
                    alphaAnimation2.setDuration(oec.a(jSONObject.get("duration"), 300L));
                }
                if (alphaAnimation2 != null) {
                    x.startAnimation(alphaAnimation2);
                }
                findTargetNode.I().getViewParams().aV = Boolean.valueOf(!a2);
                ogl viewParams = findTargetNode.I().getViewParams();
                if (a2) {
                    z = false;
                }
                viewParams.aU = z;
                if (a2) {
                    i = 8;
                }
                x.setVisibility(i);
                if (a2) {
                    return;
                }
                findTargetNode.b(x.getContext());
            } catch (Exception unused) {
            }
        }
    }

    public static void findComponents(g.c cVar) {
        aa a2;
        aa a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e7f189", new Object[]{cVar});
        } else if (cVar.b instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) cVar.b;
            aa a4 = cVar.f19938a.a(jSONObject.getIntValue("target"));
            JSONArray jSONArray = jSONObject.getJSONArray("list");
            String string = jSONObject.getString("id");
            boolean booleanValue = jSONObject.getBooleanValue("root");
            boolean a5 = oec.a(jSONObject.get("depth"), true);
            if (booleanValue) {
                if (a4 != null) {
                    a4 = a4.M();
                } else {
                    a4 = cVar.f19938a.A();
                }
            }
            HashMap hashMap = new HashMap();
            ArrayList<aa> arrayList = new ArrayList();
            if (a4 != null) {
                if (jSONArray != null && !jSONArray.isEmpty()) {
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        String a6 = oec.a(it.next(), (String) null);
                        if (!StringUtils.isEmpty(a6) && (a3 = a4.a(a6, !a5)) != null) {
                            arrayList.add(a3);
                        }
                    }
                } else if (!StringUtils.isEmpty(string) && (a2 = a4.a(string, !a5)) != null) {
                    arrayList.add(a2);
                }
            }
            for (aa aaVar : arrayList) {
                hashMap.put(aaVar.e("id"), Integer.valueOf(aaVar.E()));
            }
            if (cVar.c == null) {
                return;
            }
            cVar.c.a(cVar, hashMap);
        }
    }

    public static void clean(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f1097", new Object[]{abVar});
        } else {
            componentObservers.remove(abVar);
        }
    }
}
