package com.taobao.android.revisionswitch;

import android.content.Context;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.core.h;
import com.taobao.android.revisionswitch.core.i;
import com.taobao.android.revisionswitch.utils.LocationHelper;
import com.taobao.android.revisionswitch.utils.a;
import com.taobao.android.revisionswitch.windvane.JsBridgeRevisionSwitch;
import com.taobao.android.revisionswitch.windvane.RevisionSwitchModule;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXSDKEngine;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import tb.ilw;
import tb.ily;
import tb.ilz;

/* loaded from: classes6.dex */
public class c extends TBRevisionSwitchManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String b = "TaoBaoVersionManagerB";
    private Context c;
    private final Map<String, String> d = new ConcurrentHashMap();
    private ilz e;
    private i f;
    private volatile h g;

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : "";
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public boolean a(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8df32b29", new Object[]{this, context, map})).booleanValue();
        }
        this.c = context;
        return true;
    }

    private h j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("82bfb88f", new Object[]{this});
        }
        if (this.g == null) {
            synchronized (c.class) {
                if (this.g == null) {
                    if (this.e == null) {
                        this.e = new ily(this.c);
                    }
                    if (this.f == null) {
                        this.f = new i(this.e);
                    }
                    this.g = new h(this.c, this.e, this.f);
                    this.g.f();
                    b(null, null);
                }
            }
        }
        return this.g;
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        synchronized (c.class) {
            if (this.e == null) {
                this.e = new ily(this.c);
            }
            if (this.f == null) {
                this.f = new i(this.e);
            }
        }
        this.f.a();
        this.f.a(j());
        return true;
    }

    private void b(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2893eda6", new Object[]{this, context, map});
            return;
        }
        try {
            q.a(JsBridgeRevisionSwitch.NAME, (Class<? extends e>) JsBridgeRevisionSwitch.class);
            WXSDKEngine.registerModule(RevisionSwitchModule.MODULE_NAME, RevisionSwitchModule.class);
        } catch (Exception e) {
            TLog.loge(b, "registerPlugin exception", e);
        }
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1875777107:
                if (str.equals(ilw.KEY_SUBSCRIBE_ENABLE)) {
                    c = 3;
                    break;
                }
                break;
            case 706363092:
                if (str.equals("new2021UIEnable")) {
                    c = 1;
                    break;
                }
                break;
            case 744893843:
                if (str.equals(ilw.KEY_NEW_DISCOVERY_ENABLE)) {
                    c = 5;
                    break;
                }
                break;
            case 778421885:
                if (str.equals(ilw.KEY_NEW_FACE_OVERSEAS_ENABLE)) {
                    c = 4;
                    break;
                }
                break;
            case 1016654848:
                if (str.equals(ilw.KEY_NEW_FACE_ENABLE)) {
                    c = 0;
                    break;
                }
                break;
            case 1648521628:
                if (str.equals(ilw.KEY_NEW_CONTENT_ENABLE)) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            return c();
        }
        if (c == 1) {
            return true;
        }
        if (c == 2) {
            return d();
        }
        if (c == 3) {
            return e();
        }
        if (c == 4) {
            return f();
        }
        if (c == 5) {
            return LocationHelper.c(this.c);
        }
        return LocationHelper.b(this.c);
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : "1".equalsIgnoreCase(c("elderHome"));
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : LocationHelper.b(this.c) || a(this.c);
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
        } else {
            a.C0568a.helper.a();
        }
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public void a(Map<String, String> map, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21c198c", new Object[]{this, map, new Boolean(z), new Integer(i)});
        } else {
            j().a(map, z, i);
        }
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str}) : j().c(str);
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public String a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d7b527fe", new Object[]{this, str, new Boolean(z)}) : j().a(str, z);
    }
}
