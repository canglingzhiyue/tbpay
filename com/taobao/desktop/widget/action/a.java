package com.taobao.desktop.widget.action;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.action.FloatWindowStateManager;
import com.taobao.desktop.widget.manager.g;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.monitor.a;
import tb.kge;
import tb.kif;
import tb.ors;
import tb.pfp;
import tb.ppi;

/* loaded from: classes7.dex */
public class a extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private ors f16961a = new ors();
    private FloatWindowStateManager.FloatWindowStateReceiver b;

    static {
        kge.a(2009316744);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("165ee1ca", new Object[]{aVar});
        } else {
            aVar.c();
        }
    }

    @Override // com.taobao.desktop.widget.action.f
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (this.f16961a == null) {
                return;
            }
            String string = jSONObject.getString("bizCode");
            String string2 = jSONObject.getString("triggerEventId");
            int a2 = this.f16961a.a(string);
            kif.a("[WidgetFloatWin] checkState: " + a2);
            if (a2 == 0) {
                a(string2, string);
            } else if (a2 == 1) {
                a(string);
            }
            b();
            com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_STATE, new a.C0652a().a(this.e).d("widget_click_float_window"));
        } catch (Throwable th) {
            kif.a("[WidgetFloatWin] actionFloatWindowLink error: " + th.getMessage());
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.taobao.desktop.channel.desktoplinktask.trigger.f.PARAM_KEY_NEED_LOCAL_REQUEST_CACHE, (Object) true);
        this.f16961a.a(str, str2, jSONObject, null, new ppi() { // from class: com.taobao.desktop.widget.action.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ppi
            public void b(com.taobao.desktop.channel.desktoplinktask.trigger.f fVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d152e4af", new Object[]{this, fVar});
                }
            }

            {
                a.this = this;
            }

            @Override // tb.ppi
            public void a(com.taobao.desktop.channel.desktoplinktask.trigger.f fVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c09d17ee", new Object[]{this, fVar});
                    return;
                }
                kif.a("[WidgetFloatWin] floatWindowOpen success bizCode: " + fVar.c);
                a.a(a.this);
            }

            @Override // tb.ppi
            public void a(com.taobao.desktop.channel.desktoplinktask.trigger.f fVar, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9516238", new Object[]{this, fVar, str3});
                    return;
                }
                kif.a("[WidgetFloatWin] floatWindowOpen fail bizCode: " + fVar.c + ",msg: " + str3);
            }
        });
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        kif.a("[WidgetFloatWin] floatWindowClose bizCode: " + str);
        this.f16961a.b(str);
        c();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = new FloatWindowStateManager.FloatWindowStateReceiver() { // from class: com.taobao.desktop.widget.action.FloatWindowLinkAction$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(FloatWindowLinkAction$2 floatWindowLinkAction$2, String str, Object... objArr) {
                if (str.hashCode() == 1006950490) {
                    super.onReceive((Context) objArr[0], (Intent) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // com.taobao.desktop.widget.action.FloatWindowStateManager.FloatWindowStateReceiver, android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                super.onReceive(context, intent);
                kif.a("[WidgetFloatWin] intent: " + intent);
                if (!"com.taobao.desktop.float_window_close".equals(intent.getAction())) {
                    return;
                }
                a.a(a.this);
            }
        };
        FloatWindowStateManager.a(this.c, this.b);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String d = g.a(this.c).d(this.e);
        if (TextUtils.isEmpty(d)) {
            return;
        }
        String b = b(d);
        if (this.d == null) {
            return;
        }
        this.d.a(this.g, this.f, b);
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            return this.f16961a != null ? JSONObject.parseObject(JSON.toJSONString(pfp.a())).toString() : "";
        } catch (Exception e) {
            kif.a("[WidgetFloatWin] stateReset error: " + e);
            return "";
        }
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        try {
            String a2 = a();
            JSONObject parseObject = JSONObject.parseObject(str);
            JSONObject jSONObject = parseObject.getJSONObject("dataContent");
            if (jSONObject != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("floatWindowLink", (Object) a2);
                jSONObject.put("native", (Object) jSONObject2);
            }
            return parseObject.toString();
        } catch (Exception e) {
            kif.a("[WidgetFloatWin] disposeFloatWinDslData error: " + e);
            return "";
        }
    }
}
