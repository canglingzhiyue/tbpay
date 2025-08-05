package com.taobao.tao.flexbox.layoutmanager.module;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import com.taobao.android.scancode.common.object.ScancodeResult;
import com.taobao.desktop.ditto.anim.AnimConstance;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.u;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.ad;
import com.taobao.tao.flexbox.layoutmanager.core.h;
import com.taobao.tao.flexbox.layoutmanager.drawable.b;
import com.taobao.tao.flexbox.layoutmanager.jsonpatch.c;
import com.taobao.tao.flexbox.layoutmanager.view.FeedToastView;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView;
import com.taobao.taobao.R;
import com.taobao.weex.ui.view.gesture.WXGestureType;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cje;
import tb.ijp;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.oga;
import tb.ogb;
import tb.ogg;
import tb.ogh;
import tb.ogy;
import tb.ogz;
import tb.ohd;
import tb.ohk;

/* loaded from: classes8.dex */
public class AppModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SCAN_ACTION = "guangguang_scan";
    private static final String SCAN_RESULT = "callback_result";
    private static final String SCAN_URL = "https://m.taobao.com/scancode/scan";

    static {
        kge.a(1789675315);
        kge.a(-818961104);
    }

    public static /* synthetic */ JSONObject access$000(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bf67f71b", new Object[]{view}) : getViewProperty(view);
    }

    public static /* synthetic */ void access$100(aa aaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44aa3c6a", new Object[]{aaVar, str});
        } else {
            notifyNodeEventHandler(aaVar, str);
        }
    }

    public static void generateKey(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e0b3ee", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            String generateUrlKey = generateUrlKey((String) ((Map) cVar.b).get("url"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", (Object) generateUrlKey);
            cVar.c.a(cVar, jSONObject);
        }
    }

    public static String generateUrlKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16356e4a", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            ogg.b("generateUrlKey url is empty");
            return "";
        }
        return ogz.a(ohk.a(str));
    }

    public static void deleteFile(g.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4411a471", new Object[]{cVar});
            return;
        }
        try {
            if (!(cVar.b instanceof Map)) {
                return;
            }
            String str = (String) ((Map) cVar.b).get("path");
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists()) {
                    if (file.isDirectory()) {
                        cje.a(file);
                        z = true;
                    } else {
                        z = file.delete();
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("deleteResult", (Object) Boolean.valueOf(z));
                    jSONObject.put(ijp.FROM_EXIST, (Object) Boolean.valueOf(z2));
                    cVar.c.a(cVar, jSONObject);
                }
            }
            z2 = false;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("deleteResult", (Object) Boolean.valueOf(z));
            jSONObject2.put(ijp.FROM_EXIST, (Object) Boolean.valueOf(z2));
            cVar.c.a(cVar, jSONObject2);
        } catch (Throwable th) {
            ogg.b("deleteFile error," + th.getMessage());
        }
    }

    public static void fileExist(g.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98f4ddd", new Object[]{cVar});
            return;
        }
        try {
            if (!(cVar.b instanceof Map)) {
                return;
            }
            String str = (String) ((Map) cVar.b).get("path");
            if (!TextUtils.isEmpty(str)) {
                z = new File(str).exists();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", (Object) Boolean.valueOf(z));
            cVar.c.a(cVar, jSONObject);
        } catch (Throwable th) {
            ogg.b("fileExist error," + th.getMessage());
        }
    }

    public static void getTNodeInfo(g.c cVar) {
        View x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04c756a", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            int a2 = oec.a(((Map) cVar.b).get("target"), -1);
            aa aaVar = null;
            String a3 = oec.a(((Map) cVar.b).get("id"), (String) null);
            if (a2 != -1) {
                aaVar = cVar.f19938a.a(a2);
            }
            aa a4 = ad.a(aaVar, a3);
            if (a4 != null && (x = a4.x()) != null) {
                cVar.c.a(cVar, getViewProperty(x));
            } else {
                cVar.c.a(cVar, new JSONObject());
            }
        }
    }

    public static void getNodeInfo(g.c cVar) {
        aa a2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79fc5cd2", new Object[]{cVar});
        } else if (cVar.b instanceof JSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = (JSONObject) cVar.b;
                String string = jSONObject3.getString("containerId");
                String string2 = jSONObject3.getString("target");
                String string3 = jSONObject3.getString("imageId");
                String string4 = jSONObject3.getString("listId");
                JSONObject jSONObject4 = null;
                aa a3 = !TextUtils.isEmpty(string2) ? cVar.f19938a.a(Integer.valueOf(string2).intValue()) : null;
                if (a3 != null && !TextUtils.isEmpty(string)) {
                    a2 = a3.a(string, true);
                } else {
                    a2 = !TextUtils.isEmpty(string) ? cVar.f19938a.a(Integer.valueOf(string).intValue()) : null;
                }
                if (a2 != null) {
                    JSONArray jSONArray = new JSONArray();
                    ArrayList arrayList = new ArrayList();
                    if (!TextUtils.isEmpty(string3)) {
                        a2.a(string3, (List<aa>) arrayList);
                    }
                    if (!TextUtils.isEmpty(string4)) {
                        jSONObject4 = getListViewProperty(a2, string4);
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        aa aaVar = arrayList.get(i);
                        View x = aaVar.x();
                        if (x != null) {
                            jSONObject = getViewProperty(x);
                            if (jSONObject4 != null) {
                                jSONObject.putAll(jSONObject4);
                            }
                        } else {
                            jSONObject = new JSONObject();
                        }
                        jSONObject.put("target", (Object) Integer.valueOf(aaVar.E()));
                        jSONArray.add(i, jSONObject);
                    }
                    jSONObject2.put("positions", (Object) jSONArray);
                }
            } catch (Exception e) {
                ogg.b("getNodeInfo:" + e.getMessage());
            }
            cVar.c.a(cVar, jSONObject2);
        }
    }

    public static void postMessage(g.c cVar) {
        aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766eeaf1", new Object[]{cVar});
        } else if (cVar.b instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("msg");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            HashMap hashMap = new HashMap();
            if (jSONObject2 != null) {
                for (String str : jSONObject2.keySet()) {
                    hashMap.put(str, jSONObject2.get(str));
                }
            }
            int intValue = jSONObject.getIntValue("flag");
            String string2 = jSONObject.getString("value");
            String string3 = jSONObject.getString("target");
            if (TextUtils.isEmpty(string3) || (a2 = cVar.f19938a.a(Integer.valueOf(string3).intValue())) == null) {
                return;
            }
            cVar.f19938a.b(intValue, a2, string, string2, hashMap, null);
        }
    }

    private static JSONObject getListViewProperty(aa aaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ae4527", new Object[]{aaVar, str});
        }
        JSONObject jSONObject = null;
        aa findTargetNode = ElementModule.findTargetNode(aaVar, str);
        if (findTargetNode != null) {
            View x = findTargetNode.x();
            jSONObject = new JSONObject();
            if (x != null) {
                try {
                    int[] iArr = new int[2];
                    x.getLocationOnScreen(iArr);
                    jSONObject.put("listScreenX", (Object) Integer.valueOf(iArr[0]));
                    jSONObject.put("listScreenY", (Object) Integer.valueOf(iArr[1]));
                    jSONObject.put("listWidth", (Object) Integer.valueOf(x.getWidth()));
                    jSONObject.put("listHeight", (Object) Integer.valueOf(x.getHeight()));
                } catch (Exception e) {
                    ogg.b("getListViewProperty " + e.getMessage());
                }
            }
        }
        return jSONObject;
    }

    private static JSONObject getViewProperty(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8e7f53fb", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", (Object) Float.valueOf(view.getX()));
        jSONObject.put("y", (Object) Float.valueOf(view.getY()));
        jSONObject.put("width", (Object) Integer.valueOf(view.getWidth()));
        jSONObject.put("height", (Object) Integer.valueOf(view.getHeight()));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        jSONObject.put("windowX", (Object) Integer.valueOf(iArr[0]));
        jSONObject.put("windowY", (Object) Integer.valueOf(iArr[1]));
        view.getLocationOnScreen(iArr);
        jSONObject.put(WXGestureType.GestureInfo.SCREEN_X, (Object) Integer.valueOf(iArr[0]));
        jSONObject.put(WXGestureType.GestureInfo.SCREEN_Y, (Object) Integer.valueOf(iArr[1]));
        jSONObject.put("windowWidth", (Object) Integer.valueOf(ohd.b(view.getContext())));
        jSONObject.put("windowHeight", (Object) Integer.valueOf(ohd.e(view.getContext())));
        Drawable background = view.getBackground();
        if (background instanceof b.C0848b) {
            b.C0848b c0848b = (b.C0848b) background;
            float[] a2 = c0848b.a();
            float b = c0848b.b();
            if (a2 == null) {
                a2 = new float[]{b};
            }
            jSONObject.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_radius, (Object) a2);
        }
        return jSONObject;
    }

    private static TNodeRecyclerView findRecyclerViewForView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeRecyclerView) ipChange.ipc$dispatch("750ff5f2", new Object[]{view});
        }
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof TNodeRecyclerView) {
                return (TNodeRecyclerView) parent;
            }
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            view = (View) parent;
        }
        return null;
    }

    public static void findNodesById(final g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a78b202e", new Object[]{cVar});
            return;
        }
        String string = ((JSONObject) cVar.b).getString("target");
        Object obj = ((JSONObject) cVar.b).get("id");
        int a2 = oec.a(((JSONObject) cVar.b).get("flag"), 2);
        aa a3 = cVar.f19938a.a(oec.a((Object) string, -1));
        final ArrayList arrayList = new ArrayList();
        a3.a(obj, a2, arrayList, true, false);
        cVar.f19938a.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (aa aaVar : arrayList) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (aaVar.B() != null) {
                            jSONObject.put("attrs", (Object) aaVar.B());
                        }
                        jSONObject.put("target", (Object) Integer.valueOf(aaVar.E()));
                        if (aaVar.A() != null) {
                            jSONObject.put("props", (Object) aaVar.A());
                        }
                        View x = aaVar.x();
                        if (x != null) {
                            jSONObject.put("view", (Object) AppModule.access$000(x));
                        }
                        arrayList2.add(jSONObject);
                    } catch (Throwable th) {
                        ogg.b(th.getMessage());
                    }
                }
                cVar.c.a(cVar, arrayList2);
            }
        });
    }

    public static void getTNodeData(final g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347bb1ee", new Object[]{cVar});
            return;
        }
        final g.d dVar = cVar.c;
        if (!(cVar.b instanceof JSONObject)) {
            return;
        }
        final String string = ((JSONObject) cVar.b).getString("target");
        final String string2 = ((JSONObject) cVar.b).getString("keypath");
        if (TextUtils.isEmpty(string) || !TextUtils.isDigitsOnly(string)) {
            return;
        }
        cVar.f19938a.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TextUtils.isEmpty(string2)) {
                    aa a2 = cVar.f19938a.a(Integer.valueOf(string).intValue());
                    if (a2 == null) {
                        return;
                    }
                    Object D = a2.M().D();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("target", (Object) Integer.valueOf(a2.M().E()));
                    jSONObject.put("data", D);
                    dVar.a(cVar, jSONObject);
                } else {
                    aa a3 = cVar.f19938a.a(Integer.valueOf(string).intValue());
                    if (a3 == null) {
                        return;
                    }
                    try {
                        Object a4 = a3.d().a(string2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("target", (Object) string);
                        jSONObject2.put("data", a4);
                        dVar.a(cVar, jSONObject2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public static void updateTNodeData(g.c cVar) {
        IpChange ipChange = $ipChange;
        final boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed015a1", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("target");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            if (jSONObject.containsKey("force")) {
                z = jSONObject.getBooleanValue("force");
            }
            JSONObject jSONObject2 = null;
            final JSONArray jSONArray = jSONObject.containsKey("jsonpatch") ? jSONObject.getJSONArray("jsonpatch") : null;
            if (jSONObject.containsKey("data")) {
                jSONObject2 = jSONObject.getJSONObject("data");
            }
            final aa a2 = cVar.f19938a.a(Integer.valueOf(string).intValue());
            if (jSONArray != null && a2 != null) {
                if (!(a2.D() instanceof JSON)) {
                    return;
                }
                a2.k().a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        c.a(JSONArray.this, (JSON) a2.D());
                        aa aaVar = a2;
                        aaVar.a(aaVar.D(), z);
                    }
                });
            } else if (jSONObject2 == null || a2 == null) {
            } else {
                a2.a(jSONObject2, z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void actionSheet(final com.taobao.tao.flexbox.layoutmanager.ac.g.c r10) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.module.AppModule.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L12
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r10
            java.lang.String r10 = "e4b691af"
            r0.ipc$dispatch(r10, r1)
            return
        L12:
            com.alibaba.fastjson.JSON r0 = r10.b
            boolean r0 = r0 instanceof com.alibaba.fastjson.JSONObject
            if (r0 == 0) goto Lbc
            com.alibaba.fastjson.JSON r0 = r10.b
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            java.lang.String r1 = "title"
            java.lang.String r6 = r0.getString(r1)
            com.alibaba.fastjson.JSON r0 = r10.b
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            java.lang.String r1 = "message"
            r0.getString(r1)
            com.alibaba.fastjson.JSON r0 = r10.b
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            java.lang.String r1 = "buttons"
            com.alibaba.fastjson.JSONArray r0 = r0.getJSONArray(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
            if (r0 == 0) goto L6f
            int r4 = r0.size()
            if (r4 <= 0) goto L6f
            r4 = 0
        L46:
            int r5 = r0.size()
            if (r4 >= r5) goto L56
            java.lang.String r5 = r0.getString(r4)
            r1.add(r5)
            int r4 = r4 + 1
            goto L46
        L56:
            int r0 = r1.size()
            java.lang.String[] r0 = new java.lang.String[r0]
        L5c:
            int r4 = r1.size()
            if (r2 >= r4) goto L6d
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r0[r2] = r4
            int r2 = r2 + 1
            goto L5c
        L6d:
            r7 = r0
            goto L70
        L6f:
            r7 = r3
        L70:
            android.content.Context r0 = r10.a()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L87
            android.content.Context r0 = r10.a()
            android.app.Activity r0 = (android.app.Activity) r0
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)
        L85:
            r5 = r0
            goto La3
        L87:
            com.taobao.tao.flexbox.layoutmanager.core.ab r0 = r10.f19938a
            if (r0 == 0) goto La2
            com.taobao.tao.flexbox.layoutmanager.core.ab r0 = r10.f19938a
            java.lang.Object r0 = r0.g()
            boolean r0 = r0 instanceof android.support.v4.app.Fragment
            if (r0 == 0) goto La2
            com.taobao.tao.flexbox.layoutmanager.core.ab r0 = r10.f19938a
            java.lang.Object r0 = r0.g()
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            android.view.View r0 = r0.getView()
            goto L85
        La2:
            r5 = r3
        La3:
            if (r5 == 0) goto Lbc
            com.taobao.tao.flexbox.layoutmanager.view.e r0 = new com.taobao.tao.flexbox.layoutmanager.view.e     // Catch: java.lang.Exception -> Lbc
            android.content.Context r4 = r10.a()     // Catch: java.lang.Exception -> Lbc
            com.taobao.tao.flexbox.layoutmanager.module.AppModule$8 r8 = new com.taobao.tao.flexbox.layoutmanager.module.AppModule$8     // Catch: java.lang.Exception -> Lbc
            r8.<init>()     // Catch: java.lang.Exception -> Lbc
            com.taobao.tao.flexbox.layoutmanager.module.AppModule$9 r9 = new com.taobao.tao.flexbox.layoutmanager.module.AppModule$9     // Catch: java.lang.Exception -> Lbc
            r9.<init>()     // Catch: java.lang.Exception -> Lbc
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lbc
            r0.a()     // Catch: java.lang.Exception -> Lbc
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.module.AppModule.actionSheet(com.taobao.tao.flexbox.layoutmanager.ac.g$c):void");
    }

    public static void alert(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb863cf", new Object[]{context, str});
        } else {
            alert(context, null, str, null, null, true, null, null, null);
        }
    }

    private static void alert(Context context, String str, String str2, String str3, String str4, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52ae220", new Object[]{context, str, str2, str3, str4, new Boolean(z), onClickListener, onClickListener2, onCancelListener});
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.setMessage(str2);
        }
        builder.setCancelable(z);
        if (!TextUtils.isEmpty(str3)) {
            builder.setPositiveButton(str3, onClickListener);
        }
        if (!TextUtils.isEmpty(str4)) {
            builder.setNegativeButton(str4, onClickListener2);
        }
        builder.setOnCancelListener(onCancelListener);
        builder.create().show();
    }

    public static void alert(final g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a983cd7c", new Object[]{cVar});
            return;
        }
        final g.d dVar = cVar.c;
        if (!(cVar.b instanceof JSONObject)) {
            return;
        }
        String string = ((JSONObject) cVar.b).getString("title");
        String string2 = ((JSONObject) cVar.b).getString("message");
        String string3 = ((JSONObject) cVar.b).getString("confirmTitle");
        String string4 = ((JSONObject) cVar.b).getString("cancelTitle");
        alert(cVar.a(), string, string2, string3, string4, ((JSONObject) cVar.b).containsKey(com.taobao.android.weex_framework.util.a.ATOM_EXT_cancelable) ? ((JSONObject) cVar.b).getBooleanValue(com.taobao.android.weex_framework.util.a.ATOM_EXT_cancelable) : true, !TextUtils.isEmpty(string3) ? new DialogInterface.OnClickListener() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, "confirm");
                g.d.this.a(cVar, hashMap);
            }
        } : null, !TextUtils.isEmpty(string4) ? new DialogInterface.OnClickListener() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, "cancel");
                g.d.this.a(cVar, hashMap);
            }
        } : null, new DialogInterface.OnCancelListener() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, "cancel");
                g.d.this.a(cVar, hashMap);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void toast(com.taobao.tao.flexbox.layoutmanager.ac.g.c r11) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.module.AppModule.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L12
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r11
            java.lang.String r11 = "cd66fc11"
            r0.ipc$dispatch(r11, r1)
            return
        L12:
            com.alibaba.fastjson.JSON r0 = r11.b
            boolean r0 = r0 instanceof com.alibaba.fastjson.JSONObject
            if (r0 == 0) goto Lf5
            com.alibaba.fastjson.JSON r0 = r11.b
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            java.lang.String r1 = "message"
            java.lang.String r6 = r0.getString(r1)
            java.lang.String r1 = "duration"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r3 = "position"
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r4 = "system"
            boolean r4 = r0.getBooleanValue(r4)
            java.lang.String r5 = "customStyle"
            boolean r5 = r0.getBooleanValue(r5)
            r7 = 0
            java.lang.String r8 = "target"
            int r0 = r0.getIntValue(r8)
            com.taobao.tao.flexbox.layoutmanager.core.ab r8 = r11.f19938a
            com.taobao.tao.flexbox.layoutmanager.core.aa r0 = r8.a(r0)
            if (r0 == 0) goto L5e
            android.view.View r0 = r0.x()
            if (r0 == 0) goto L5e
            android.view.View r0 = r0.getRootView()
            boolean r8 = r0 instanceof android.view.ViewGroup
            if (r8 == 0) goto L5e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L5f
        L5e:
            r0 = r7
        L5f:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto Lf5
            r7 = 1500(0x5dc, float:2.102E-42)
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 != 0) goto L81
            boolean r8 = android.text.TextUtils.isDigitsOnly(r1)
            if (r8 == 0) goto L81
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            int r7 = r1 / 1000
            r10 = r7
            r7 = r1
            r1 = r10
            goto L82
        L81:
            r1 = 0
        L82:
            java.lang.String r8 = "center"
            boolean r8 = r8.equals(r3)
            r9 = -1
            if (r8 == 0) goto L90
            r3 = 17
            r8 = 17
            goto Lac
        L90:
            java.lang.String r8 = "top"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L9e
            r3 = 49
            r8 = 49
            goto Lac
        L9e:
            java.lang.String r8 = "bottom"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto Lab
            r3 = 81
            r8 = 81
            goto Lac
        Lab:
            r8 = -1
        Lac:
            com.taobao.tao.flexbox.layoutmanager.adapter.a r3 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a()
            com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.s r3 = r3.e()
            if (r3 == 0) goto Lc9
            if (r4 != 0) goto Lc9
            com.taobao.tao.flexbox.layoutmanager.adapter.a r1 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a()
            com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.s r3 = r1.e()
            android.content.Context r4 = r11.a()
            r5 = r0
            r3.a(r4, r5, r6, r7, r8)
            return
        Lc9:
            com.taobao.tao.flexbox.layoutmanager.adapter.a r0 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a()
            com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.s r0 = r0.e()
            if (r0 == 0) goto Le5
            if (r5 == 0) goto Le5
            com.taobao.tao.flexbox.layoutmanager.adapter.a r0 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a()
            com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.s r0 = r0.e()
            android.content.Context r11 = r11.a()
            r0.a(r11, r6, r1, r8)
            return
        Le5:
            android.content.Context r11 = r11.a()
            android.widget.Toast r11 = android.widget.Toast.makeText(r11, r6, r1)
            if (r8 == r9) goto Lf2
            r11.setGravity(r8, r2, r2)
        Lf2:
            r11.show()
        Lf5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.module.AppModule.toast(com.taobao.tao.flexbox.layoutmanager.ac.g$c):void");
    }

    public static void showTips(g.c cVar) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34254023", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject) || !(cVar.a() instanceof Activity)) {
        } else {
            String string = ((JSONObject) cVar.b).getString("message");
            String string2 = ((JSONObject) cVar.b).getString("duration");
            if (cVar.f19938a.g() instanceof Fragment) {
                viewGroup = (ViewGroup) ((Fragment) cVar.f19938a.g()).getView();
            } else {
                viewGroup = (ViewGroup) ((Activity) cVar.a()).getWindow().findViewById(16908290);
            }
            if (viewGroup == null) {
                return;
            }
            View findViewWithTag = viewGroup.findViewWithTag("TNode_TIP_TOAST");
            long j = 2500;
            if (!TextUtils.isEmpty(string2)) {
                j = Long.valueOf(string2).longValue();
            }
            if (findViewWithTag != null) {
                if (!(findViewWithTag instanceof FeedToastView) || TextUtils.isEmpty(string)) {
                    return;
                }
                ((FeedToastView) findViewWithTag).show(string, j);
                return;
            }
            View inflate = ((Activity) cVar.a()).getLayoutInflater().inflate(R.layout.layout_feed_msg_toast_view, viewGroup, false);
            inflate.setTag("TNode_TIP_TOAST");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, ohd.b(cVar.a(), 30));
            layoutParams.gravity = 49;
            layoutParams.setMargins(0, ohd.b(viewGroup.getContext(), 132), 0, 0);
            viewGroup.addView(inflate, layoutParams);
            inflate.setVisibility(0);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            ((FeedToastView) inflate).show(string, j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void showLoading(com.taobao.tao.flexbox.layoutmanager.ac.g.c r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.module.AppModule.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L12
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            java.lang.String r7 = "fb2515b9"
            r0.ipc$dispatch(r7, r1)
            return
        L12:
            if (r7 == 0) goto Ldf
            android.content.Context r0 = r7.a()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto Ldf
            r0 = 0
            com.alibaba.fastjson.JSON r1 = r7.b
            boolean r1 = r1 instanceof com.alibaba.fastjson.JSONObject
            if (r1 == 0) goto L52
            com.alibaba.fastjson.JSON r1 = r7.b
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1
            java.lang.String r3 = "title"
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L38
            com.alibaba.fastjson.JSON r0 = r7.b
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            java.lang.String r0 = r0.getString(r3)
        L38:
            com.alibaba.fastjson.JSON r1 = r7.b
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1
            java.lang.String r3 = "show"
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L52
            com.alibaba.fastjson.JSON r1 = r7.b
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1
            java.lang.Boolean r1 = r1.getBoolean(r3)
            boolean r1 = r1.booleanValue()
            goto L53
        L52:
            r1 = 0
        L53:
            com.taobao.tao.flexbox.layoutmanager.core.ab r3 = r7.f19938a
            java.lang.Object r3 = r3.g()
            boolean r3 = r3 instanceof android.support.v4.app.Fragment
            if (r3 == 0) goto L6c
            com.taobao.tao.flexbox.layoutmanager.core.ab r3 = r7.f19938a
            java.lang.Object r3 = r3.g()
            android.support.v4.app.Fragment r3 = (android.support.v4.app.Fragment) r3
            android.view.View r3 = r3.getView()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L7f
        L6c:
            android.content.Context r3 = r7.a()
            android.app.Activity r3 = (android.app.Activity) r3
            android.view.Window r3 = r3.getWindow()
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r3.findViewById(r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L7f:
            if (r3 == 0) goto Ldf
            java.lang.String r4 = "TNode_Loading"
            android.view.View r5 = r3.findViewWithTag(r4)
            if (r5 == 0) goto La2
            boolean r7 = r5 instanceof com.taobao.tao.flexbox.layoutmanager.uikit.view.TNodeCircularProgress
            if (r7 == 0) goto L99
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto L99
            r7 = r5
            com.taobao.tao.flexbox.layoutmanager.uikit.view.TNodeCircularProgress r7 = (com.taobao.tao.flexbox.layoutmanager.uikit.view.TNodeCircularProgress) r7
            r7.setProgressText(r0)
        L99:
            if (r1 == 0) goto L9c
            goto L9e
        L9c:
            r2 = 8
        L9e:
            r5.setVisibility(r2)
            return
        La2:
            if (r1 == 0) goto Ldf
            android.content.Context r1 = r7.a()
            r5 = 96
            int r1 = tb.ohd.b(r1, r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r1, r1)
            r1 = 17
            r5.gravity = r1
            android.content.Context r1 = r7.a()
            r6 = -50
            int r1 = tb.ohd.b(r1, r6)
            r5.setMargins(r2, r1, r2, r2)
            com.taobao.tao.flexbox.layoutmanager.uikit.view.TNodeCircularProgress r1 = new com.taobao.tao.flexbox.layoutmanager.uikit.view.TNodeCircularProgress
            android.content.Context r7 = r7.a()
            r1.<init>(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto Ld6
            r1.setProgressText(r0)
        Ld6:
            r1.setTag(r4)
            r3.addView(r1, r5)
            r1.setVisibility(r2)
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.module.AppModule.showLoading(com.taobao.tao.flexbox.layoutmanager.ac.g$c):void");
    }

    public static void playSound(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19155e7d", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            if (((JSONObject) cVar.b).containsKey("type")) {
                String string = ((JSONObject) cVar.b).getString("type");
                if (TextUtils.isEmpty(string) || !TextUtils.isDigitsOnly(string)) {
                    return;
                }
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().s().a(Integer.valueOf(string).intValue());
            } else if (!((JSONObject) cVar.b).containsKey("url")) {
            } else {
                String string2 = ((JSONObject) cVar.b).getString("url");
                if (TextUtils.isEmpty(string2)) {
                    return;
                }
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().s().a(string2);
            }
        }
    }

    public static void getMediaPlayDevice(g.c cVar) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c452e0", new Object[]{cVar});
            return;
        }
        try {
            AudioManager audioManager = (AudioManager) cVar.a().getSystemService("audio");
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            if (((JSONObject) cVar.b).containsKey("type")) {
                String string = ((JSONObject) cVar.b).getString("type");
                if (!"input".equals(string)) {
                    if (NetConfig.OUPUT_KEY.equals(string)) {
                        i = 2;
                    }
                }
                AudioDeviceInfo[] devices = audioManager.getDevices(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("devices", (Object) devices);
                cVar.c.a(cVar, jSONObject);
            }
            i = 3;
            AudioDeviceInfo[] devices2 = audioManager.getDevices(i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("devices", (Object) devices2);
            cVar.c.a(cVar, jSONObject2);
        } catch (Throwable th) {
            ogg.a("APPModule", "getMediaPlayDevice:" + th.getMessage());
        }
    }

    public static void closePoplayer(g.c cVar) {
        aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a12a0", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject) || (a2 = cVar.f19938a.a(((JSONObject) cVar.b).getInteger("target").intValue())) == null || !(a2.I() instanceof PopLayerComponent)) {
        } else {
            ((PopLayerComponent) a2.I()).dismiss();
        }
    }

    public static void commit(final g.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aebd2b01", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            final JSONObject jSONObject = (JSONObject) cVar.b;
            final String string = jSONObject.getString("msg");
            int intValue = jSONObject.getInteger("target").intValue();
            final JSONArray jSONArray = jSONObject.getJSONArray("patches");
            final boolean a2 = oec.a(jSONObject.get("force"), false);
            final Object obj = jSONObject.get("options");
            final long longValue = jSONObject.getLongValue("time");
            final aa a3 = cVar.f19938a.a(intValue);
            final Context a4 = cVar.a();
            if (!cVar.f19938a.c && Build.VERSION.SDK_INT >= 21 && cVar.f19938a.n() && (a4 instanceof Activity)) {
                z = true;
            }
            if (z) {
                final g.d dVar = cVar.c;
                cVar.c = new g.d() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.13
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.flexbox.layoutmanager.ac.g.d
                    public void a(g.c cVar2, Object obj2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fb15ed33", new Object[]{this, cVar2, obj2});
                            return;
                        }
                        g.d.this.a(cVar2, obj2);
                        if (cVar.f19938a.c) {
                            return;
                        }
                        cVar.f19938a.c = true;
                        if (cVar2.f19938a.g() instanceof f) {
                            ((f) cVar2.f19938a.g()).startPostponedEnterTransition(cVar2.f19938a.s().c());
                        } else {
                            ((Activity) a4).startPostponedEnterTransition();
                        }
                    }

                    @Override // com.taobao.tao.flexbox.layoutmanager.ac.g.d
                    public void a(g.c cVar2, g.a aVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fed2540a", new Object[]{this, cVar2, aVar});
                        } else {
                            g.d.this.a(cVar2, aVar);
                        }
                    }
                };
            }
            if (a3 != null) {
                Object g = a3.k().g();
                f.a aVar = new f.a(g, oec.f()) { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        AppModule.access$100(a3, string);
                        JSONArray jSONArray2 = jSONArray;
                        if (jSONArray2 == null || jSONArray2.isEmpty()) {
                            a();
                        } else {
                            a3.k().a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    boolean z2 = false;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("data", a3.D());
                                    try {
                                        z2 = c.a(jSONArray, jSONObject2);
                                    } catch (Exception e) {
                                        ogg.a("TNode", "jsonpatch:" + e.getMessage());
                                    }
                                    if (z2 || a2) {
                                        a3.a(cVar, a3.g(string), longValue, a3.D(), obj, a2);
                                    }
                                    a();
                                }
                            });
                        }
                        if (!oeb.aO()) {
                            return;
                        }
                        oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.2.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    a3.k().d().flick(a3);
                                }
                            }
                        }, true);
                    }
                };
                if (g instanceof f) {
                    if (((f) g).checkAndAddPendingTask(aVar)) {
                        return;
                    }
                    aVar.b();
                    return;
                }
                aVar.run();
                return;
            }
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (oec.e(g.c.this.a())) {
                        Toast.makeText(g.c.this.a(), "app.commit node is null", 0).show();
                    }
                    ogg.b("app.commit node is null, args: " + jSONObject);
                }
            }, true);
        }
    }

    private static void notifyNodeEventHandler(final aa aaVar, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89163c94", new Object[]{aaVar, str});
        } else {
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.tao.flexbox.layoutmanager.event.b b = aa.this.b(str);
                    if (b == null) {
                        return;
                    }
                    b.a(null);
                }
            }, true);
        }
    }

    public static void hideInputMethod(g.c cVar) {
        aa a2;
        aa findTargetNode;
        View x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab88bcf", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            Context a3 = cVar.a();
            JSONObject jSONObject = (JSONObject) cVar.b;
            if (jSONObject != null && (a2 = cVar.f19938a.a(jSONObject.getIntValue("target"))) != null && (findTargetNode = ElementModule.findTargetNode(a2, jSONObject.getString("id"))) != null && (x = findTargetNode.x()) != null) {
                x.clearFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) a3.getSystemService("input_method");
                if (inputMethodManager == null) {
                    return;
                }
                inputMethodManager.hideSoftInputFromWindow(x.getWindowToken(), 0);
            } else if (!(a3 instanceof Activity)) {
            } else {
                oec.f(a3);
            }
        }
    }

    public static void showInputMethod(g.c cVar) {
        aa findTargetNode;
        View x;
        InputMethodManager inputMethodManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8048470a", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            aa a2 = cVar.f19938a.a(jSONObject.getIntValue("target"));
            if (a2 == null || (findTargetNode = ElementModule.findTargetNode(a2, jSONObject.getString("id"))) == null || (x = findTargetNode.x()) == null || (inputMethodManager = (InputMethodManager) x.getContext().getSystemService("input_method")) == null) {
                return;
            }
            x.requestFocus();
            inputMethodManager.showSoftInput(x, 2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r0.equals("light") != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void impactFeedback(com.taobao.tao.flexbox.layoutmanager.ac.g.c r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.module.AppModule.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r9
            java.lang.String r9 = "884fdbcd"
            r0.ipc$dispatch(r9, r1)
            return
        L12:
            com.alibaba.fastjson.JSON r0 = r9.b
            boolean r0 = r0 instanceof com.alibaba.fastjson.JSONObject
            if (r0 == 0) goto L99
            com.alibaba.fastjson.JSON r0 = r9.b
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            java.lang.String r1 = "type"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r1 = "light"
            java.lang.String r0 = tb.oec.a(r0, r1)
            android.content.Context r9 = r9.a()
            java.lang.String r4 = "vibrator"
            java.lang.Object r9 = r9.getSystemService(r4)
            android.os.Vibrator r9 = (android.os.Vibrator) r9
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L3e
            r0 = r1
        L3e:
            r4 = -1
            int r5 = r0.hashCode()
            r6 = 4
            r7 = 3
            r8 = 2
            switch(r5) {
                case -1078030475: goto L71;
                case 3535914: goto L66;
                case 99152071: goto L5c;
                case 102970646: goto L55;
                case 108511787: goto L4a;
                default: goto L49;
            }
        L49:
            goto L7c
        L4a:
            java.lang.String r1 = "rigid"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7c
            r2 = 4
            goto L7d
        L55:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7c
            goto L7d
        L5c:
            java.lang.String r1 = "heavy"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7c
            r2 = 3
            goto L7d
        L66:
            java.lang.String r1 = "soft"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7c
            r2 = 1
            goto L7d
        L71:
            java.lang.String r1 = "medium"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7c
            r2 = 2
            goto L7d
        L7c:
            r2 = -1
        L7d:
            r0 = 60
            if (r2 == 0) goto L95
            if (r2 == r3) goto L93
            if (r2 == r8) goto L90
            if (r2 == r7) goto L8d
            if (r2 == r6) goto L8a
            goto L95
        L8a:
            r0 = 180(0xb4, float:2.52E-43)
            goto L95
        L8d:
            r0 = 150(0x96, float:2.1E-43)
            goto L95
        L90:
            r0 = 120(0x78, float:1.68E-43)
            goto L95
        L93:
            r0 = 90
        L95:
            long r0 = (long) r0
            r9.vibrate(r0)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.module.AppModule.impactFeedback(com.taobao.tao.flexbox.layoutmanager.ac.g$c):void");
    }

    public static void slideSecondPage(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd14024", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("utParams");
            ogb a2 = oga.a(cVar);
            if (a2 == null) {
                return;
            }
            a2.slideSecondPage(string, string2);
        }
    }

    public static void setPasteboard(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6882dc3", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            String string = ((JSONObject) cVar.b).getString("value");
            if (!oec.j()) {
                return;
            }
            ((ClipboardManager) cVar.a().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Label", string));
        }
    }

    public static void getPasteboard(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39af24f", new Object[]{cVar});
            return;
        }
        g.d dVar = cVar.c;
        if (dVar == null || !oec.j()) {
            return;
        }
        try {
            ClipData primaryClip = ((ClipboardManager) cVar.a().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip == null || primaryClip.getItemCount() <= 0) {
                return;
            }
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            HashMap hashMap = new HashMap();
            hashMap.put("value", charSequence);
            dVar.a(cVar, hashMap);
        } catch (Exception e) {
            ogg.b(e.getMessage());
        }
    }

    public static void preloadDSL(final g.c cVar) {
        final JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96926e4", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject) || (jSONArray = ((JSONObject) cVar.b).getJSONArray(AnimConstance.VIEW_ANIM_KEY_URLS)) == null) {
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ogh.a("preloadDSL");
                    try {
                        final int[] iArr = {JSONArray.this.size()};
                        final HashMap hashMap = new HashMap();
                        for (int i = 0; i < JSONArray.this.size(); i++) {
                            final String string = JSONArray.this.getString(i);
                            if (!TextUtils.isEmpty(string)) {
                                h.a(cVar.f19938a, string, null, null, new h.a() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.5.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // com.taobao.tao.flexbox.layoutmanager.core.h.a
                                    public void a(Map map, String str) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("d7b3cea7", new Object[]{this, map, str});
                                            return;
                                        }
                                        HashMap hashMap2 = new HashMap();
                                        if (map == null || map.isEmpty()) {
                                            hashMap2.put("succeed", false);
                                        } else {
                                            hashMap2.put("succeed", true);
                                        }
                                        hashMap2.put("type", str);
                                        if (h.a(string)) {
                                            hashMap2.put("succeed", false);
                                            hashMap2.put("type", "dev");
                                        }
                                        hashMap.put(string, hashMap2);
                                        int[] iArr2 = iArr;
                                        iArr2[0] = iArr2[0] - 1;
                                        if (iArr2[0] != 0 || cVar.c == null) {
                                            return;
                                        }
                                        cVar.c.a(cVar, hashMap);
                                    }
                                });
                            } else {
                                iArr[0] = iArr[0] - 1;
                                if (iArr[0] == 0 && cVar.c != null) {
                                    cVar.c.a(cVar, hashMap);
                                }
                            }
                        }
                    } catch (Exception e) {
                        ogg.b(e.getMessage());
                    }
                    ogh.b();
                }
            });
        }
    }

    public static void prefetchNext(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a0030e", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().f().a((JSONObject) cVar.b);
        }
    }

    public static void getPrefetchConfig(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c48f3629", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().f().a(((JSONObject) cVar.b).getString(IStorage.TYPE_DSL));
            } catch (Exception e) {
                ogg.b("getPrefetchConfig:" + e.getMessage());
            }
            cVar.c.a(cVar, jSONObject);
        }
    }

    public static void setLocalSetting(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d085d451", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            ogy.a((JSONObject) cVar.b);
        }
    }

    public static void getLocalSetting(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f9a5dd", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            Map a2 = ogy.a();
            if (cVar.c == null) {
                return;
            }
            cVar.c.a(cVar, a2);
        }
    }

    public static void showQR(final g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a993a", new Object[]{cVar});
            return;
        }
        final g.d dVar = cVar.c;
        if (!(cVar.a() instanceof Activity)) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SCAN_ACTION);
        cVar.a().registerReceiver(new BroadcastReceiver() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AppModule.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (!AppModule.SCAN_ACTION.equals(intent.getAction())) {
                } else {
                    ScancodeResult scancodeResult = (ScancodeResult) intent.getSerializableExtra("callback_result");
                    JSONObject jSONObject = new JSONObject();
                    if (scancodeResult == null || TextUtils.isEmpty(scancodeResult.code)) {
                        jSONObject.put("succeed", (Object) false);
                        jSONObject.put("url", (Object) "");
                        g.d.this.a(cVar, new g.a("AC_ERR_FAILED", "get url failed", jSONObject));
                    } else {
                        jSONObject.put("url", (Object) scancodeResult.code);
                        jSONObject.put("succeed", (Object) true);
                        g.d.this.a(cVar, jSONObject);
                    }
                    cVar.a().unregisterReceiver(this);
                }
            }
        }, intentFilter);
        Bundle bundle = new Bundle();
        bundle.putString(com.taobao.android.scancode.common.util.a.GATEWAY_CALLBACK_ACTION_PARAM, SCAN_ACTION);
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().l().a(cVar.a(), SCAN_URL, bundle);
    }

    public static void updateTabRedirectInfo(g.c cVar) {
        aa findTargetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0690f42", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject) || cVar.f19938a == null) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            aa A = cVar.f19938a.A();
            if (A == null || (findTargetNode = ElementModule.findTargetNode(A, jSONObject.getString("tabbarId"))) == null || !(findTargetNode.I() instanceof u)) {
                return;
            }
            ((u) findTargetNode.I()).a(u.b.a(jSONObject));
        }
    }

    public static void openTNodeTool(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8407b4", new Object[]{cVar});
            return;
        }
        ab.a(true);
        cVar.f19938a.q();
        cVar.f19938a.d().showTool(cVar.f19938a.k().d());
    }

    public static void ignoringInteractionEvents(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafc435c", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            boolean booleanValue = ((JSONObject) cVar.b).getBooleanValue("ignoring");
            View x = cVar.f19938a.A().x();
            if (!(x instanceof TNodeView)) {
                return;
            }
            ((TNodeView) x).setIgnoreTouchEvent(booleanValue);
        }
    }

    public static void keypathForTarget(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53fef102", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            int intValue = ((JSONObject) cVar.b).getIntValue("target");
            aa a2 = cVar.f19938a.a(intValue);
            if (a2 != null && cVar.c != null) {
                cVar.c.a(cVar, a2.U());
                return;
            }
            ogg.a("keypathForTarget doesn't find node, target:" + intValue);
        }
    }

    public static void getLaunchInfo(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b06941", new Object[]{cVar});
        } else if (cVar.c == null) {
        } else {
            cVar.c.a(cVar, com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().c());
        }
    }
}
