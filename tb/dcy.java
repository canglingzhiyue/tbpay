package tb;

import android.content.Intent;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.e;
import com.taobao.adaemon.j;
import com.taobao.adaemon.l;
import com.taobao.taolive.room.utils.aw;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dcy extends dcw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f26703a;
    private String b;
    private long c;

    static {
        kge.a(-1151544489);
    }

    public dcy(String str, int i) {
        super(str, i);
    }

    @Override // tb.dcw
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f26703a = jSONObject.optString(MspGlobalDefine.UA);
            this.b = jSONObject.optString(aw.PARAM_INTENT_URL);
            this.c = jSONObject.optLong("clientTimestamp");
            e.b("LauncherTbAction", "parse succ", MspGlobalDefine.UA, this.f26703a, "uri", this.b, "reqTimeInMill", Long.valueOf(this.c));
        } catch (Exception e) {
            e.a("LauncherTbAction", "parse err", e, new Object[0]);
        }
    }

    @Override // tb.dcw
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Long l = null;
        try {
            if (!j.a().q()) {
                e.b("LauncherTbAction", "switch off", new Object[0]);
                c();
            } else if (StringUtils.isEmpty(this.b)) {
                e.b("LauncherTbAction", "empty uri", new Object[0]);
                c();
            } else if (!StringUtils.isEmpty(this.f26703a) && !this.f26703a.contains(Build.MODEL)) {
                e.b("LauncherTbAction", "model err", "model", Build.MODEL);
                c();
            } else {
                if (this.c > 0) {
                    l = Long.valueOf(System.currentTimeMillis() - this.c);
                    if (l.longValue() > j.a().s()) {
                        e.b("LauncherTbAction", "wait too long", "timeDiff", l);
                        c();
                        if (l == null) {
                            return;
                        }
                        e.b("LauncherTbAction", "timeDiff: " + l, new Object[0]);
                        return;
                    }
                }
                Intent parseUri = Intent.parseUri(this.b, 0);
                parseUri.addFlags(268435456);
                l.e().startActivity(parseUri);
                c();
                if (l == null) {
                    return;
                }
                e.b("LauncherTbAction", "timeDiff: " + l, new Object[0]);
            }
        } catch (Throwable th) {
            try {
                e.a("LauncherTbAction", "execute err", th, new Object[0]);
                c();
                if (0 == 0) {
                    return;
                }
                e.b("LauncherTbAction", "timeDiff: " + ((Object) null), new Object[0]);
            } catch (Throwable th2) {
                c();
                if (0 != 0) {
                    e.b("LauncherTbAction", "timeDiff: " + ((Object) null), new Object[0]);
                }
                throw th2;
            }
        }
    }
}
