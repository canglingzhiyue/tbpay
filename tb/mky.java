package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.tao.log.TLog;
import com.taobao.themis.kernel.i;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class mky<CollectResult> extends mkh<CollectResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final /* synthetic */ boolean m = !mky.class.desiredAssertionStatus();
    public boolean c = true;
    public boolean d = false;
    public boolean e = false;
    public long f = 0;
    public long g = 0;
    public String h = "unknown";
    public String i = null;
    public Uri j = null;
    public boolean k = false;
    public long l = SystemClock.uptimeMillis();

    public static /* synthetic */ Object ipc$super(mky mkyVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract CollectResult b(mkx mkxVar, int i, Map<String, ?> map);

    @Override // tb.mkh
    public int[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("ab8ad2ba", new Object[]{this}) : new int[]{11, 12, 1, 0, 4};
    }

    @Override // tb.mkh
    public void b(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c62340b", new Object[]{this, new Integer(i), map});
        } else if (i == 0) {
            this.l = mqe.a(map.get("time"), SystemClock.uptimeMillis());
            this.c = false;
        } else if (i == 1) {
            this.l = mqe.a(map.get("time"), SystemClock.uptimeMillis());
            this.c = true;
        } else if (i == 4) {
            a(map);
        } else if (i == 11) {
            this.d = true;
            this.g = SystemClock.uptimeMillis();
        } else if (i != 12) {
        } else {
            this.k = true;
            if (this.g > 0) {
                this.f += SystemClock.uptimeMillis() - this.g;
            }
            this.g = -1L;
        }
    }

    private void a(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        int a2 = mqe.a(map.get(mln.PARAM_LIFECYCLE), 0);
        if (!map.containsKey("page")) {
            return;
        }
        Object obj = map.get("page");
        if (!m && obj == null) {
            throw new AssertionError();
        }
        if (a2 == 103) {
            this.l = mqe.a(map.get("time"), SystemClock.uptimeMillis());
            this.h = obj.getClass().getSimpleName();
            this.j = a((Activity) obj);
            this.e = true;
        }
        if (a2 == 208) {
            this.l = mqe.a(map.get("time"), SystemClock.uptimeMillis());
            this.i = obj.getClass().getSimpleName();
            this.e = true;
        }
        if (a2 != 209) {
            return;
        }
        this.i = null;
    }

    private Uri a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("914d3af1", new Object[]{this, activity});
        }
        try {
            Intent intent = activity.getIntent();
            if (intent == null) {
                return null;
            }
            return intent.getData();
        } catch (Exception e) {
            TLog.loge("MetricKit.TypedOperationCollector", "getActivityNavUrl error: ", e);
            return null;
        }
    }

    @Override // tb.mkh
    public CollectResult a(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CollectResult) ipChange.ipc$dispatch("8d357de8", new Object[]{this, new Integer(i), map});
        }
        if (this.g > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f += uptimeMillis - this.g;
            this.g = uptimeMillis;
        }
        long j = this.f;
        this.f = 0L;
        String c = c(i, map);
        this.e = false;
        if (this.k) {
            this.k = false;
            this.d = false;
        }
        this.l = 0L;
        return b(new mkx(c, a(a()), j), i, map);
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : TextUtils.isEmpty(str) ? "unknown" : str.replace("^", "%5E").replace("=", "%equal");
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.h)) {
            return "unknown";
        }
        Uri uri = this.j;
        if (uri == null || uri.isOpaque()) {
            return d();
        }
        if ("TabFrameActivity".equals(this.h) || "BrowserActivity".equals(this.h) || "BrowserUpperActivity".equals(this.h)) {
            return d() + ":" + this.j.getHost() + this.j.getPath();
        }
        String queryParameter = this.j.getQueryParameter(i.APP_ID);
        if (!TextUtils.isEmpty(queryParameter)) {
            return d() + ":_ariver_appid->" + queryParameter;
        }
        String queryParameter2 = this.j.getQueryParameter("shopId");
        if (!TextUtils.isEmpty(queryParameter2)) {
            return d() + ":shopId->" + queryParameter2;
        }
        return d();
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.i)) {
            return this.h;
        }
        return this.h + "_" + this.i;
    }

    private String c(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("429d9494", new Object[]{this, new Integer(i), map});
        }
        long a2 = mqe.a(map.get("time"), SystemClock.uptimeMillis());
        String str = this.c ? "background" : "foreground";
        String str2 = this.d ? "Slide" : "Stand";
        if (this.e) {
            if (i != 4 || a2 != this.l) {
                return RenderTrackUtils.pageCreate;
            }
            return str + str2;
        } else if (i == 1 && a2 == this.l) {
            return "foreground" + str2;
        } else if (i == 0 && a2 == this.l) {
            return "background" + str2;
        } else {
            return str + str2;
        }
    }
}
