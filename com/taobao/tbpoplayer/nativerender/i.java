package com.taobao.tbpoplayer.nativerender;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.qnu;

/* loaded from: classes8.dex */
public class i extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private String f22228a;
    private String b;
    private String c;
    private a d;
    private Handler e;
    private e f;
    private com.taobao.tbpoplayer.nativerender.a g;
    private volatile boolean h = false;
    private volatile boolean i = false;
    private Runnable j;

    /* loaded from: classes8.dex */
    public interface a {
        void a(View view, Bitmap bitmap, String str);

        void a(String str, String str2);

        void a(String str, List<String> list, int i, long j);
    }

    static {
        kge.a(-33203503);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$NW4jM_r2J82i8SvpNAIe0AOKxv8(i iVar) {
        iVar.j();
    }

    /* renamed from: lambda$v-H_OVODlYU3WzRMSoujzT8gnOw */
    public static /* synthetic */ void m1453lambda$vH_OVODlYU3WzRMSoujzT8gnOw(i iVar) {
        iVar.k();
    }

    public i(Context context, String str, String str2, Map<String, String> map, a aVar) {
        if (aVar == null) {
            return;
        }
        if (context == null || TextUtils.isEmpty(str)) {
            aVar.a("PARAM_INVALID", "");
            return;
        }
        this.f22228a = str;
        this.b = str2;
        this.d = aVar;
        this.e = new Handler(Looper.getMainLooper());
        this.f = new e(context, this.e, 1, this);
        this.g = new com.taobao.tbpoplayer.nativerender.a(this.f);
        this.f.a().a(map);
        h();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (TextUtils.isEmpty(this.b)) {
        } else {
            try {
                this.f.a().f().put("initServerParam", (Object) JSON.parseObject(this.b));
            } catch (Throwable unused) {
                com.alibaba.poplayer.utils.c.a("NativeWidgetEngine.parseLaunchParam.error.", new Object[0]);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.alibaba.poplayer.utils.c.a("DSLFetcher.fetchDSL.dsl=%s", this.f22228a);
        if (TextUtils.isEmpty(this.f22228a)) {
            this.f.a("DSL_EMPTY", "");
            return;
        }
        try {
            DSLModel dSLModel = (DSLModel) JSONObject.parseObject(this.f22228a, DSLModel.class);
            if (!dSLModel.isValid()) {
                this.f.a("DSL_INVALID", "");
                return;
            }
            this.f.a().a(dSLModel);
            c(dSLModel.extraInfo);
            if (!b.a(dSLModel.condition, this.f, true)) {
                this.f.a("DisplayConditionCheckNotPass", "", (String) null);
                return;
            }
            Pair<StateModel, StateVersionModel> b = this.f.b(null, dSLModel.startStates, false, false);
            if (b == null || b.first == null) {
                this.f.a("GetFirstStateVerFailed", "");
            } else if (this.g.a((StateModel) b.first, (StateVersionModel) b.second) == null) {
                this.f.a("InitStateViewError", "");
            } else {
                this.h = true;
                d();
                if (this.i) {
                    return;
                }
                this.j = new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$i$v-H_OVODlYU3WzRMSoujzT8gnOw
                    {
                        i.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        i.m1453lambda$vH_OVODlYU3WzRMSoujzT8gnOw(i.this);
                    }
                };
                this.e.postDelayed(this.j, 60000L);
            }
        } catch (Throwable unused) {
            this.f.a("DSL_INVALID_CATCH_ERROR", "");
        }
    }

    public /* synthetic */ void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        try {
            if (this.f.a().z() <= 0 || this.i) {
                return;
            }
            this.f.a("LoadResOutOfTime", "");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void c(String str) {
        JSONObject parseObject;
        List<JSONObject> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null) {
                return;
            }
            String string = parseObject.getString("clickAreas");
            if (TextUtils.isEmpty(string) || (list = (List) JSON.parseObject(string, new TypeReference<ArrayList<JSONObject>>() { // from class: com.taobao.tbpoplayer.nativerender.i.1
                {
                    i.this = this;
                }
            }.getType(), new Feature[0])) == null) {
                return;
            }
            for (JSONObject jSONObject : list) {
                if (jSONObject != null) {
                    String a2 = p.a(this.f, jSONObject.getString("deepUrl"), false);
                    if (!TextUtils.isEmpty(a2)) {
                        jSONObject.put("deepUrl", (Object) a2);
                    }
                }
            }
            parseObject.put("clickAreas", (Object) JSON.toJSONString(list));
            this.c = JSON.toJSONString(parseObject);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("NativeWidgetEngine.handleWidgetClickAreas.error", th);
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.f, com.taobao.tbpoplayer.nativerender.e.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            a(str, str2, "");
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.f, com.taobao.tbpoplayer.nativerender.e.a
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            this.f.a().a(true);
            this.d.a(str, str2);
            i();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.f, com.taobao.tbpoplayer.nativerender.e.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.alibaba.poplayer.utils.c.a("NativeWidgetEngine.onImageLoaded", new Object[0]);
        this.f.a().x();
        d();
    }

    @Override // com.taobao.tbpoplayer.nativerender.f, com.taobao.tbpoplayer.nativerender.e.a
    public void c() {
        StateBaseModel k;
        long j;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.alibaba.poplayer.utils.c.a("NativeWidgetEngine.onRenderStart", new Object[0]);
        d a2 = this.f.a();
        if (a2 == null || (k = a2.k()) == null) {
            return;
        }
        StyleModel styleModel = k.style;
        if (styleModel == null || styleModel.widgetAnimBackground == null) {
            j = -1;
            i = -1;
        } else {
            i = styleModel.widgetAnimBackground.times;
            j = styleModel.widgetAnimBackground.interval;
        }
        this.d.a(a2.s(), a2.t(), i, j);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if ((this.f.a().y() != 0 && this.f.a().z() > 0) || this.i || !this.h || this.f.a().g()) {
        } else {
            this.i = true;
            this.f.b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$i$NW4jM_r2J82i8SvpNAIe0AOKxv8
                {
                    i.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.lambda$NW4jM_r2J82i8SvpNAIe0AOKxv8(i.this);
                }
            });
        }
    }

    public /* synthetic */ void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        try {
            d a2 = this.f.a();
            if (a2.g()) {
                com.alibaba.poplayer.utils.c.a("NativeWidgetEngine.tryDisplay.isEngineClosed.return.", new Object[0]);
                return;
            }
            a2.b(true);
            View c = this.g.c();
            this.d.a(c, qnu.a(a2, c), this.c);
            i();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("NativeWidgetEngine.tryDisplay.runInGlobalThread.error", th);
            this.f.a("LOAD_BITMAP_ERROR", String.valueOf(th.getMessage()));
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.g.d();
        Runnable runnable = this.j;
        if (runnable != null) {
            this.e.removeCallbacks(runnable);
        }
        this.d = null;
    }
}
