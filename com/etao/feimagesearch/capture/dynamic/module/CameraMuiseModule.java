package com.etao.feimagesearch.capture.dynamic.module;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.DynCaptureImgGotConfig;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.capture.dynamic.hybrid.d;
import com.etao.feimagesearch.util.al;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.k;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSMethod;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.adt;
import tb.com;
import tb.cot;
import tb.coy;
import tb.cpe;
import tb.cpt;
import tb.cpy;
import tb.kge;

/* loaded from: classes3.dex */
public final class CameraMuiseModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String MODULE_NAME = "TBPSCameraModule";

    static {
        kge.a(447261919);
        Companion = new a(null);
    }

    @MUSMethod
    public final void changeScanMode(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114b27b9", new Object[]{this, jSONObject});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraMuiseModule(String moduleName, MUSDKInstance mUSDKInstance) {
        super(moduleName, mUSDKInstance);
        q.c(moduleName, "moduleName");
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-1047966361);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @MUSMethod
    public final void cameraClickBack() {
        Activity o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4075071", new Object[]{this});
            return;
        }
        cot.a("PltCameraPai", MODULE_NAME, "cameraClickBack");
        cpe.c cVar = cpe.Companion;
        p instance = getInstance();
        q.a((Object) instance, "instance");
        k context = instance.getContext();
        q.a((Object) context, "instance.context");
        Context a2 = context.a();
        q.a((Object) a2, "instance.context.uiContext");
        cpt a3 = cVar.a(a2);
        if (a3 == null || (o = a3.o()) == null) {
            return;
        }
        o.finish();
    }

    @MUSMethod
    public final void cameraClickPhoto() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d861796", new Object[]{this});
            return;
        }
        cot.a("PltCameraPai", MODULE_NAME, "cameraClickPhoto");
        cpe.c cVar = cpe.Companion;
        p instance = getInstance();
        q.a((Object) instance, "instance");
        k context = instance.getContext();
        q.a((Object) context, "instance.context");
        Context a2 = context.a();
        q.a((Object) a2, "instance.context.uiContext");
        cpt a3 = cVar.a(a2);
        if (a3 == null) {
            return;
        }
        a3.h();
    }

    @MUSMethod
    public final void cameraClickHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b14b9b8", new Object[]{this});
            return;
        }
        cot.a("PltCameraPai", MODULE_NAME, "cameraClickHistory");
        cpe.c cVar = cpe.Companion;
        p instance = getInstance();
        q.a((Object) instance, "instance");
        k context = instance.getContext();
        q.a((Object) context, "instance.context");
        Context a2 = context.a();
        q.a((Object) a2, "instance.context.uiContext");
        cpt a3 = cVar.a(a2);
        if (a3 == null) {
            return;
        }
        a3.g();
    }

    @MUSMethod
    public final void cameraChangeScene(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54ecf52", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            cot.a("PltCameraPai", MODULE_NAME, "cameraChangeScene");
            String a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "scene", "");
            String str = a2;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (z) {
                return;
            }
            cpe.c cVar = cpe.Companion;
            p instance = getInstance();
            q.a((Object) instance, "instance");
            k context = instance.getContext();
            q.a((Object) context, "instance.context");
            Context a3 = context.a();
            q.a((Object) a3, "instance.context.uiContext");
            cpt a4 = cVar.a(a3);
            if (a4 == null) {
                return;
            }
            a4.a(a2);
        }
    }

    @MUSMethod
    public final void cameraClickLight(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d135b6", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            cot.a("PltCameraPai", MODULE_NAME, "cameraClickLight");
            if (q.a((Object) com.taobao.android.searchbaseframe.util.a.a(jSONObject, "state", ""), (Object) "open")) {
                cpe.c cVar = cpe.Companion;
                p instance = getInstance();
                q.a((Object) instance, "instance");
                k context = instance.getContext();
                q.a((Object) context, "instance.context");
                Context a2 = context.a();
                q.a((Object) a2, "instance.context.uiContext");
                cpt a3 = cVar.a(a2);
                if (a3 == null) {
                    return;
                }
                a3.b(true);
                return;
            }
            cpe.c cVar2 = cpe.Companion;
            p instance2 = getInstance();
            q.a((Object) instance2, "instance");
            k context2 = instance2.getContext();
            q.a((Object) context2, "instance.context");
            Context a4 = context2.a();
            q.a((Object) a4, "instance.context.uiContext");
            cpt a5 = cVar2.a(a4);
            if (a5 == null) {
                return;
            }
            a5.b(false);
        }
    }

    @MUSMethod
    public final void cameraClickFlip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93f418f7", new Object[]{this});
            return;
        }
        cot.a("PltCameraPai", MODULE_NAME, "cameraClickFlip");
        cpe.c cVar = cpe.Companion;
        p instance = getInstance();
        q.a((Object) instance, "instance");
        k context = instance.getContext();
        q.a((Object) context, "instance.context");
        Context a2 = context.a();
        q.a((Object) a2, "instance.context.uiContext");
        cpt a3 = cVar.a(a2);
        if (a3 == null) {
            return;
        }
        a3.i();
    }

    @MUSMethod
    public final void cameraClickTakePhoto() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("193af44f", new Object[]{this});
            return;
        }
        cot.a("PltCameraPai", MODULE_NAME, "cameraClickTakePhoto");
        com.etao.feimagesearch.newresult.perf.a.ar();
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "takePhotoByFrontend", 19999, new String[0]);
        cpe.c cVar = cpe.Companion;
        p instance = getInstance();
        q.a((Object) instance, "instance");
        k context = instance.getContext();
        q.a((Object) context, "instance.context");
        Context a2 = context.a();
        q.a((Object) a2, "instance.context.uiContext");
        cpt a3 = cVar.a(a2);
        if (a3 == null) {
            return;
        }
        a3.j();
    }

    @MUSMethod
    public final void cameraSceneContinue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d28bb5", new Object[]{this});
            return;
        }
        cot.a("PltCameraPai", MODULE_NAME, "cameraSceneContinue");
        cpe.c cVar = cpe.Companion;
        p instance = getInstance();
        q.a((Object) instance, "instance");
        k context = instance.getContext();
        q.a((Object) context, "instance.context");
        Context a2 = context.a();
        q.a((Object) a2, "instance.context.uiContext");
        cpt a3 = cVar.a(a2);
        if (a3 == null) {
            return;
        }
        a3.k();
    }

    @MUSMethod
    public final void cameraSceneStop(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ebbfe0", new Object[]{this, jSONObject});
            return;
        }
        cot.a("PltCameraPai", MODULE_NAME, "cameraSceneStop");
        cpe.c cVar = cpe.Companion;
        p instance = getInstance();
        q.a((Object) instance, "instance");
        k context = instance.getContext();
        q.a((Object) context, "instance.context");
        Context a2 = context.a();
        q.a((Object) a2, "instance.context.uiContext");
        cpt a3 = cVar.a(a2);
        if (a3 == null) {
            return;
        }
        a3.l();
    }

    @MUSMethod
    public final void cameraSceneResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d31c9fb", new Object[]{this});
            return;
        }
        cot.a("PltCameraPai", MODULE_NAME, "cameraSceneResume");
        cpe.c cVar = cpe.Companion;
        p instance = getInstance();
        q.a((Object) instance, "instance");
        k context = instance.getContext();
        q.a((Object) context, "instance.context");
        Context a2 = context.a();
        q.a((Object) a2, "instance.context.uiContext");
        cpt a3 = cVar.a(a2);
        if (a3 == null) {
            return;
        }
        a3.k();
    }

    @MUSMethod
    public final void cameraScenePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a174ed6", new Object[]{this});
            return;
        }
        cot.a("PltCameraPai", MODULE_NAME, "cameraScenePause");
        cpe.c cVar = cpe.Companion;
        p instance = getInstance();
        q.a((Object) instance, "instance");
        k context = instance.getContext();
        q.a((Object) context, "instance.context");
        Context a2 = context.a();
        q.a((Object) a2, "instance.context.uiContext");
        cpt a3 = cVar.a(a2);
        if (a3 == null) {
            return;
        }
        a3.l();
    }

    @MUSMethod
    public final void cameraJumpToIrp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b33830", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            cot.a("PltCameraPai", MODULE_NAME, "cameraJumpToIrp");
            cpe.c cVar = cpe.Companion;
            p instance = getInstance();
            q.a((Object) instance, "instance");
            k context = instance.getContext();
            q.a((Object) context, "instance.context");
            Context a2 = context.a();
            q.a((Object) a2, "instance.context.uiContext");
            cpt a3 = cVar.a(a2);
            if (a3 == null) {
                return;
            }
            a3.a(jSONObject);
        }
    }

    @MUSMethod
    public final void cameraChangeMetaSight(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ac69e46", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            cot.a("PltCameraPai", MODULE_NAME, "cameraChangeMetaSight");
            String a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "state", "close");
            q.a((Object) a2, "FastJsonParseUtil.parseS…params, \"state\", \"close\")");
            boolean equals = StringUtils.equals("open", a2);
            cpe.c cVar = cpe.Companion;
            p instance = getInstance();
            q.a((Object) instance, "instance");
            k context = instance.getContext();
            q.a((Object) context, "instance.context");
            Context a3 = context.a();
            q.a((Object) a3, "instance.context.uiContext");
            cpt a4 = cVar.a(a3);
            if (a4 == null) {
                return;
            }
            a4.c(equals);
        }
    }

    @MUSMethod
    public final void cameraOuterAlbumClick(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b90f5a", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            cot.a("PltCameraPai", MODULE_NAME, "cameraOuterAlbumClick");
            MusOuterAlbumBean a2 = MusOuterAlbumBean.Companion.a(jSONObject);
            if (a2 == null) {
                return;
            }
            cpe.c cVar = cpe.Companion;
            p instance = getInstance();
            q.a((Object) instance, "instance");
            k context = instance.getContext();
            q.a((Object) context, "instance.context");
            Context a3 = context.a();
            q.a((Object) a3, "instance.context.uiContext");
            cpt a4 = cVar.a(a3);
            if (a4 == null) {
                return;
            }
            a4.a(a2);
        }
    }

    @MUSMethod
    public final void getPreviewData(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f1f1d1b", new Object[]{this, jSONObject, bVar, bVar2});
        } else if (jSONObject == null || bVar == null) {
        } else {
            cot.a("PltCameraPai", MODULE_NAME, "getPreviewData");
            DynCaptureImgGotConfig a2 = DynCaptureImgGotConfig.a(jSONObject, new cpy(bVar, bVar2));
            if (a2 == null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = jSONObject2;
                jSONObject3.put((JSONObject) "errorCode", (String) (-1));
                jSONObject3.put((JSONObject) "errorMessage", "Img Config Parse Error");
                if (bVar2 == null) {
                    return;
                }
                bVar2.a(jSONObject2);
                return;
            }
            cpe.c cVar = cpe.Companion;
            p instance = getInstance();
            q.a((Object) instance, "instance");
            k context = instance.getContext();
            q.a((Object) context, "instance.context");
            Context a3 = context.a();
            q.a((Object) a3, "instance.context.uiContext");
            cpt a4 = cVar.a(a3);
            if (a4 == null) {
                return;
            }
            a4.a(a2, new cpy(bVar, bVar2));
        }
    }

    @MUSMethod
    public final void selectPhotoFromAlbum(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fbeb568", new Object[]{this, jSONObject, bVar, bVar2});
        } else if (jSONObject == null || bVar == null) {
        } else {
            cot.a("PltCameraPai", MODULE_NAME, "selectPhotoFromAlbum");
            DynCaptureImgGotConfig b = DynCaptureImgGotConfig.b(jSONObject, new cpy(bVar, bVar2));
            if (b == null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = jSONObject2;
                jSONObject3.put((JSONObject) "errorCode", (String) (-1));
                jSONObject3.put((JSONObject) "errorMessage", "Img Config Parse Error");
                if (bVar2 == null) {
                    return;
                }
                bVar2.a(jSONObject2);
                return;
            }
            cpe.c cVar = cpe.Companion;
            p instance = getInstance();
            q.a((Object) instance, "instance");
            k context = instance.getContext();
            q.a((Object) context, "instance.context");
            Context a2 = context.a();
            q.a((Object) a2, "instance.context.uiContext");
            cpt a3 = cVar.a(a2);
            if (a3 == null) {
                return;
            }
            a3.a(b);
        }
    }

    @MUSMethod(uiThread = true)
    public final void cameraSwitch(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25f45de", new Object[]{this, jSONObject, bVar, bVar2});
        } else if (jSONObject == null) {
        } else {
            cot.a("PltCameraPai", MODULE_NAME, "cameraSwitch");
            boolean a2 = q.a((Object) "open", (Object) com.taobao.android.searchbaseframe.util.a.a(jSONObject, "state", "open"));
            boolean a3 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "isFront", false);
            cpe.c cVar = cpe.Companion;
            p instance = getInstance();
            q.a((Object) instance, "instance");
            k context = instance.getContext();
            q.a((Object) context, "instance.context");
            Context a4 = context.a();
            q.a((Object) a4, "instance.context.uiContext");
            cpt a5 = cVar.a(a4);
            if (a5 == null) {
                return;
            }
            a5.a(a2, a3, new cpy(bVar, bVar2));
        }
    }

    @MUSMethod(uiThread = true)
    public final void getPicData(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc5f5299", new Object[]{this, jSONObject, bVar, bVar2});
        } else if (jSONObject == null || bVar == null) {
        } else {
            cot.a("PltCameraPai", MODULE_NAME, "getPicData");
            DynCaptureImgGotConfig c = DynCaptureImgGotConfig.c(jSONObject, new cpy(bVar, bVar2));
            if (c == null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = jSONObject2;
                jSONObject3.put((JSONObject) "errorCode", (String) (-1));
                jSONObject3.put((JSONObject) "errorMessage", "Img Config Parse Error");
                if (bVar2 == null) {
                    return;
                }
                bVar2.a(jSONObject2);
                return;
            }
            new d(c).a();
        }
    }

    @MUSMethod
    public final void getDebugInfo(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35e7309", new Object[]{this, bVar});
            return;
        }
        cot.a("PltCameraPai", MODULE_NAME, "getDebugInfo");
        if (bVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) com.taobao.tao.log.statistics.d.PARAM_IS_DEBUG, (String) Boolean.valueOf(com.a()));
        bVar.a(jSONObject);
    }

    @MUSMethod
    public final void updateAllowanceState(JSONObject jSONObject, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3608819e", new Object[]{this, jSONObject, bVar});
        } else if (jSONObject == null) {
        } else {
            cot.a("PltCameraPai", MODULE_NAME, "updateAllowanceState");
            Boolean bool = null;
            if (com.taobao.android.searchbaseframe.util.a.a(jSONObject, "isShow", false)) {
                adt a2 = adt.Companion.a(com.taobao.android.searchbaseframe.util.a.b(jSONObject, "data"));
                if (a2 == null) {
                    return;
                }
                cpe.c cVar = cpe.Companion;
                p instance = getInstance();
                q.a((Object) instance, "instance");
                k context = instance.getContext();
                q.a((Object) context, "instance.context");
                Context a3 = context.a();
                q.a((Object) a3, "instance.context.uiContext");
                cpt a4 = cVar.a(a3);
                if (a4 != null) {
                    bool = Boolean.valueOf(a4.a(a2, true));
                }
            } else {
                cpe.c cVar2 = cpe.Companion;
                p instance2 = getInstance();
                q.a((Object) instance2, "instance");
                k context2 = instance2.getContext();
                q.a((Object) context2, "instance.context");
                Context a5 = context2.a();
                q.a((Object) a5, "instance.context.uiContext");
                cpt a6 = cVar2.a(a5);
                if (a6 != null) {
                    bool = Boolean.valueOf(a6.a((adt) null, false));
                }
            }
            if (bVar == null) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "success", (String) bool);
            bVar.a(jSONObject2);
        }
    }

    @MUSMethod
    public final void requireFloatingWindowPermissionState(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a34e45", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            cot.a("PltCameraPai", MODULE_NAME, "requireFloatingWindowPermissionState");
            boolean c = al.c();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "state", (String) Integer.valueOf(c ? 1 : 0));
            bVar.a(jSONObject);
        }
    }

    @MUSMethod
    public final void requestFloatingWindowPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7087763b", new Object[]{this});
            return;
        }
        cot.a("PltCameraPai", MODULE_NAME, "requestFloatingWindowPermission");
        cpe.c cVar = cpe.Companion;
        p instance = getInstance();
        q.a((Object) instance, "instance");
        k context = instance.getContext();
        q.a((Object) context, "instance.context");
        Context a2 = context.a();
        q.a((Object) a2, "instance.context.uiContext");
        cpt a3 = cVar.a(a2);
        if (a3 == null) {
            return;
        }
        a3.m();
    }

    @MUSMethod
    public final void optionFloatingBtnState(JSONObject jSONObject, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb340b90", new Object[]{this, jSONObject, bVar});
        } else if (jSONObject == null) {
        } else {
            cot.a("PltCameraPai", MODULE_NAME, "optionFloatingBtnState");
            boolean a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "isShow", false);
            cpe.c cVar = cpe.Companion;
            p instance = getInstance();
            q.a((Object) instance, "instance");
            k context = instance.getContext();
            q.a((Object) context, "instance.context");
            Context a3 = context.a();
            q.a((Object) a3, "instance.context.uiContext");
            cpt a4 = cVar.a(a3);
            if (a4 == null) {
                return;
            }
            a4.a(a2, bVar);
        }
    }
}
