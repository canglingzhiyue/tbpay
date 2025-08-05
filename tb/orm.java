package tb;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.a;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.b;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.model.WindowStyleModel;
import com.taobao.desktop.channel.desktoplinktask.trigger.e;
import com.taobao.desktop.channel.desktoplinktask.trigger.f;
import com.taobao.desktop.channel.desktoplinktask.widgetservice.c;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* loaded from: classes7.dex */
public class orm extends orn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1435600166);
    }

    public static /* synthetic */ Object ipc$super(orm ormVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1063446546) {
            super.a((f) objArr[0]);
            return null;
        } else if (hashCode != -198775748) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((b) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3]);
            return null;
        }
    }

    public static /* synthetic */ void lambda$T0r4A3socxo668Ly0lX1bSRojbM(b bVar, JSONObject jSONObject) {
        d(bVar, jSONObject);
    }

    public static /* synthetic */ void lambda$nir_pClbqJwkyNoO5jkcJoh2TwY(b bVar, String str) {
        c(bVar, str);
    }

    /* renamed from: lambda$oSafmbQsvr6sPkR-DcGJleQ_Z5c */
    public static /* synthetic */ void m2473lambda$oSafmbQsvr6sPkRDcGJleQ_Z5c(orm ormVar, b bVar, JSONObject jSONObject) {
        ormVar.c(bVar, jSONObject);
    }

    @Override // tb.orn
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : DraftMediaHelper.DraftType.PRODUCT;
    }

    @Override // tb.orn
    public void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f44560", new Object[]{this, bVar});
        }
    }

    @Override // tb.orn
    public /* bridge */ /* synthetic */ void a(f fVar) {
        super.a(fVar);
    }

    @Override // tb.orn
    public boolean a(b bVar) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2d53ce2", new Object[]{this, bVar})).booleanValue();
        }
        JSONObject jSONObject = bVar.f16946a.d;
        if (jSONObject != null && (bool = jSONObject.getBoolean(f.PARAM_KEY_NEED_LOCAL_REQUEST_CACHE)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // tb.orn
    public JSONObject b(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("307f303f", new Object[]{this, bVar});
        }
        if (bVar == null || bVar.f16946a == null) {
            return null;
        }
        final JSONObject jSONObject = bVar.f16946a.d;
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() { // from class: tb.-$$Lambda$orm$T0r4A3socxo668Ly0lX1bSRojbM
            @Override // java.lang.Runnable
            public final void run() {
                orm.lambda$T0r4A3socxo668Ly0lX1bSRojbM(b.this, jSONObject);
            }
        }, 1000L);
        handler.postDelayed(new Runnable() { // from class: tb.-$$Lambda$orm$oSafmbQsvr6sPkR-DcGJleQ_Z5c
            @Override // java.lang.Runnable
            public final void run() {
                orm.m2473lambda$oSafmbQsvr6sPkRDcGJleQ_Z5c(orm.this, bVar, jSONObject);
            }
        }, 5000L);
        Application b = khm.a().b();
        f fVar = bVar.f16946a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("triggerVersion", (Object) "active");
        jSONObject2.put("bizCode", (Object) fVar.c);
        jSONObject2.put("triggerEventId", (Object) fVar.b);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("context", (Object) jSONObject2);
        jSONObject3.put("notifyEnable", (Object) kgy.d(b));
        jSONObject3.put("floatWindowEnable", (Object) Boolean.valueOf(kgy.b(b)));
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("androidFloatWindow", (Object) jSONObject3.toJSONString());
        return jSONObject4;
    }

    public static /* synthetic */ void d(b bVar, JSONObject jSONObject) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff81e96f", new Object[]{bVar, jSONObject});
        } else if (bVar.b() || bVar.d()) {
        } else {
            if (jSONObject != null && (bool = jSONObject.getBoolean("needToast")) != null && !bool.booleanValue()) {
                return;
            }
            String str = null;
            if (jSONObject != null) {
                str = jSONObject.getString(f.PARAM_KEY_TOAST_LOADING);
            }
            if (TextUtils.isEmpty(str)) {
                str = "悬浮窗正在加载中，请稍等";
            }
            Toast.makeText(khm.a().b(), str, 0).show();
        }
    }

    public /* synthetic */ void c(b bVar, JSONObject jSONObject) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f002190", new Object[]{this, bVar, jSONObject});
        } else if (bVar.b() || bVar.d()) {
        } else {
            if (jSONObject != null && (bool = jSONObject.getBoolean("needToast")) != null && !bool.booleanValue()) {
                return;
            }
            String str = null;
            if (jSONObject != null) {
                str = jSONObject.getString(f.PARAM_KEY_TOAST_LOAD_TIME_OUT);
            }
            if (TextUtils.isEmpty(str)) {
                str = "悬浮窗未加载成功，请再试一次";
            }
            b(bVar, str);
            a(bVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "mtopTimeOut", "");
        }
    }

    @Override // tb.orn
    public void a(final b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfc91d2", new Object[]{this, bVar, jSONObject});
            return;
        }
        f fVar = bVar.f16946a;
        if (!kgy.b(khm.a().b())) {
            b(bVar, jSONObject.getJSONObject("failbackAction"));
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(com.taobao.android.abilitykit.ability.pop.model.b.TAK_ABILITY_MATCH_CONTENT);
        if (jSONObject2 == null) {
            a(bVar, e.FUNNEL_STEP_AFTER_REQUEST, "mtopFailed.noMatchContent", "");
            return;
        }
        String string = jSONObject2.getString("bizCode");
        if (TextUtils.isEmpty(string) || !string.equals(fVar.c)) {
            a(bVar, e.FUNNEL_STEP_AFTER_REQUEST, "mtopFailed.bizCodeNotMatch", "");
            return;
        }
        this.f32326a.a(bVar, jSONObject2.getString("dslContent"), jSONObject2.getString("dataContent"), (WindowStyleModel) jSONObject2.getObject("style", WindowStyleModel.class), new a.InterfaceC0651a() { // from class: tb.orm.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                orm.this = this;
            }

            @Override // com.taobao.desktop.channel.desktoplinktask.floatwindow.a.InterfaceC0651a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    orm.this.d(bVar);
                }
            }

            @Override // com.taobao.desktop.channel.desktoplinktask.floatwindow.a.InterfaceC0651a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    orm.this.a(bVar, e.FUNNEL_STEP_VIEW_LOAD, str, "");
                }
            }
        });
        c.a().a(jSONObject);
    }

    @Override // tb.orn
    public void a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93042b28", new Object[]{this, bVar, str});
        } else {
            a(bVar, e.FUNNEL_STEP_AFTER_REQUEST, "mtopFailed.APIFailed", str);
        }
    }

    private void b(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e7e59b1", new Object[]{this, bVar, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("action");
            String string2 = jSONObject.getString("deepUrl");
            if ("call".equals(string) && !TextUtils.isEmpty(string2)) {
                Intent intent = new Intent();
                intent.setData(Uri.parse(string2));
                intent.setFlags(805339136);
                khm.a().b().startActivity(intent);
            }
            bVar.d = true;
            a(bVar, e.FUNNEL_STEP_AFTER_REQUEST, "mtop.FailAction", "");
        }
    }

    @Override // tb.orn
    public void a(b bVar, String str, String str2, String str3) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f426ec3c", new Object[]{this, bVar, str, str2, str3});
            return;
        }
        super.a(bVar, str, str2, str3);
        JSONObject jSONObject = bVar.f16946a.d;
        if (jSONObject != null && (bool = jSONObject.getBoolean("needToast")) != null && !bool.booleanValue()) {
            return;
        }
        String str4 = null;
        if (jSONObject != null) {
            str4 = jSONObject.getString(f.PARAM_KEY_TOAST_LOAD_FAIL);
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = "悬浮窗未加载成功，请再试一次";
        }
        b(bVar, str4);
    }

    private void b(final b bVar, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737d8129", new Object[]{this, bVar, str});
        } else {
            kha.b(new Runnable() { // from class: tb.-$$Lambda$orm$nir_pClbqJwkyNoO5jkcJoh2TwY
                @Override // java.lang.Runnable
                public final void run() {
                    orm.lambda$nir_pClbqJwkyNoO5jkcJoh2TwY(b.this, str);
                }
            });
        }
    }

    public static /* synthetic */ void c(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53f6d72a", new Object[]{bVar, str});
        } else if (bVar.d) {
        } else {
            Toast.makeText(khm.a().b(), str, 0).show();
            bVar.d = true;
        }
    }
}
