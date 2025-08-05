package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.utils.c;
import com.alibaba.poplayer.utils.f;
import com.alibaba.poplayer.utils.g;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class bzn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final String f26203a;

    static {
        kge.a(860723400);
    }

    /* renamed from: lambda$2uLIgRSDEAx8C-XUuvCELHVVLag */
    public static /* synthetic */ void m2432lambda$2uLIgRSDEAx8CXUuvCELHVVLag(bzn bznVar, String str) {
        bznVar.c(str);
    }

    public bzn(String str) {
        this.f26203a = str;
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : c();
    }

    public /* synthetic */ void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            b(str);
        }
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            f.a(new Runnable() { // from class: tb.-$$Lambda$bzn$2uLIgRSDEAx8C-XUuvCELHVVLag
                @Override // java.lang.Runnable
                public final void run() {
                    bzn.m2432lambda$2uLIgRSDEAx8CXUuvCELHVVLag(bzn.this, str);
                }
            });
        }
    }

    private JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject(new ConcurrentHashMap());
        try {
            String a2 = g.a(b());
            if (!TextUtils.isEmpty(a2)) {
                jSONObject.putAll(JSON.parseObject(a2));
            }
            return jSONObject;
        } catch (Throwable th) {
            c.a("PopFileHelper.doReadAndSetup.error.", th);
            return jSONObject;
        }
    }

    private synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            g.b(b(), str);
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        return PopLayer.getReference().getApp().getFilesDir().getAbsolutePath() + File.separator + "pop" + File.separator + this.f26203a;
    }
}
