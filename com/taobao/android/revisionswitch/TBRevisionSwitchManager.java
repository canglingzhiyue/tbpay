package com.taobao.android.revisionswitch;

import android.content.Context;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.core.g;
import com.taobao.android.revisionswitch.core.i;
import com.taobao.android.revisionswitch.windvane.JsBridgeRevisionSwitch;
import com.taobao.android.revisionswitch.windvane.RevisionSwitchModule;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXSDKEngine;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import org.json.JSONObject;
import tb.ilw;
import tb.ily;
import tb.ilz;

/* loaded from: classes.dex */
public class TBRevisionSwitchManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_REVISION_SWITCH_CHANGE = "taobao.action.ACTION_REVISION_SWITCH_CHANGE";
    public static final int DO_NOT_NOTIFY = 0;
    public static final int NOTIFY_BACKGROUND = 2;
    public static final int NOTIFY_IMMEDIATELY = 1;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f14881a = true;
    private static String b = "TaoBaoVersionManager";
    private static TBRevisionSwitchManager g;
    private static c h;
    private g c;
    private ilz d;
    private Context e;
    private i f;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface NotifyType {
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean a(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8df32b29", new Object[]{this, context, map})).booleanValue();
        }
        this.e = context;
        this.d = new ily(context);
        this.f = new i(this.d);
        this.c = new g(context, this.d, this.f);
        a(map);
        this.c.f();
        try {
            q.a(JsBridgeRevisionSwitch.NAME, (Class<? extends e>) JsBridgeRevisionSwitch.class);
            WXSDKEngine.registerModule(RevisionSwitchModule.MODULE_NAME, RevisionSwitchModule.class);
        } catch (Exception e) {
            TLog.loge(b, "registerPlugin exception", e);
        }
        return true;
    }

    private void a(Map<String, Object> map) {
        String str;
        String b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        if (map != null) {
            Object obj = map.get("appVersion");
            if (obj instanceof String) {
                str = (String) obj;
                b2 = this.d.b("appVersion", null);
                com.taobao.android.revisionswitch.core.a a2 = this.d.a();
                if ((b2 == null && b2.equals(str)) || a2 != null) {
                    return;
                }
                this.d.c("appVersion", str);
                b("{\"switch\":{\"newFaceEnable\":\"true\",\"newContentEnable\":\"true\"}}");
            }
        }
        str = null;
        b2 = this.d.b("appVersion", null);
        com.taobao.android.revisionswitch.core.a a22 = this.d.a();
        if (b2 == null) {
        }
        this.d.c("appVersion", str);
        b("{\"switch\":{\"newFaceEnable\":\"true\",\"newContentEnable\":\"true\"}}");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            this.d = new ily(this.e);
        }
        if (this.f == null) {
            this.f = new i(this.d);
        }
        this.f.a();
        this.f.a(this.c);
        return true;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        g gVar = this.c;
        if (gVar != null) {
            return gVar.b(str);
        }
        return false;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        g gVar = this.c;
        return (gVar == null || gVar.b() == null) ? false : true;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (!b()) {
            return false;
        }
        return this.c.b(ilw.KEY_NEW_FACE_ENABLE);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (!b()) {
            return false;
        }
        return this.c.b(ilw.KEY_NEW_CONTENT_ENABLE);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (!b()) {
            return false;
        }
        return this.c.b(ilw.KEY_SUBSCRIBE_ENABLE);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (!b()) {
            return false;
        }
        return this.c.b(ilw.KEY_NEW_FACE_OVERSEAS_ENABLE);
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : b() ? this.c.b().a() : "";
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!b()) {
        } else {
            String str2 = b;
            TLog.loge(str2, "insertDosaSwitch : " + str);
            this.c.b().b(str);
        }
    }

    public void a(Map<String, String> map, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21c198c", new Object[]{this, map, new Boolean(z), new Integer(i)});
        } else if (!b()) {
        } else {
            String str = b;
            TLog.loge(str, "insertSimpleSwitch: key: " + map);
            this.c.a(map, z, i);
        }
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str}) : a(str, false);
    }

    public String a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7b527fe", new Object[]{this, str, new Boolean(z)});
        }
        if (!b()) {
            return null;
        }
        if (z) {
            String c = this.c.c(str);
            String str2 = b;
            TLog.loge(str2, "getSwitch inDisk: key: " + str + "; value: " + c);
            return c;
        }
        String a2 = this.c.a(str);
        String str3 = b;
        TLog.loge(str3, "getSwitch not inDisk: key: " + str + "; value: " + a2);
        return a2;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
        } else if (!b() || jSONObject == null) {
        } else {
            String str = b;
            TLog.loge(str, "insertDosaSwitchImmediately : " + jSONObject.toString());
            this.c.b().c(jSONObject.toString());
        }
    }

    public static TBRevisionSwitchManager i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBRevisionSwitchManager) ipChange.ipc$dispatch("8c6d003e", new Object[0]);
        }
        if (f14881a) {
            if (h == null) {
                synchronized (TBRevisionSwitchManager.class) {
                    if (h == null) {
                        h = new c();
                        TLog.loge("RevisionSwitch", b, "use Opt TBRevisionSwitchManagerB ");
                    }
                }
            }
            return h;
        }
        if (g == null) {
            synchronized (TBRevisionSwitchManager.class) {
                if (g == null) {
                    g = new TBRevisionSwitchManager();
                    TLog.loge("RevisionSwitch", b, "use TBRevisionSwitchManager");
                }
            }
        }
        return g;
    }
}
