package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.tbpoplayer.info.a;
import com.taobao.tbpoplayer.util.e;

/* loaded from: classes9.dex */
public class sep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private boolean f33515a;
    private boolean b;
    private boolean c;
    private boolean d = a.a().Q();
    private OnScreenChangedListener e;

    static {
        kge.a(-235055577);
    }

    public static /* synthetic */ void lambda$IOxj3IoQXRff9DS8DECUEE3YBcw(sep sepVar, PopLayerBaseView popLayerBaseView, int i, Configuration configuration) {
        sepVar.a(popLayerBaseView, i, configuration);
    }

    public sep(Context context) {
        this.f33515a = e.b(context);
        this.b = e.a(context);
    }

    public void a(final PopLayerBaseView popLayerBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a15f69c", new Object[]{this, popLayerBaseView});
        } else if (!this.d) {
        } else {
            if (!this.f33515a && !this.b) {
                return;
            }
            this.e = new OnScreenChangedListener() { // from class: tb.-$$Lambda$sep$IOxj3IoQXRff9DS8DECUEE3YBcw
                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                    OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
                }

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public final void onScreenChanged(int i, Configuration configuration) {
                    sep.lambda$IOxj3IoQXRff9DS8DECUEE3YBcw(sep.this, popLayerBaseView, i, configuration);
                }
            };
            h.a().c(this.e);
        }
    }

    public /* synthetic */ void a(PopLayerBaseView popLayerBaseView, int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ead08a9", new Object[]{this, popLayerBaseView, new Integer(i), configuration});
            return;
        }
        boolean z = 1 == i;
        try {
            if (this.c == z) {
                c.a("OnScreenChanged.sameCallBack.ignore.changeType=%s", Integer.valueOf(i));
                return;
            }
            this.c = z;
            c.a("OnScreenChanged.changeType=%s", Integer.valueOf(i));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFoldDevice", (Object) String.valueOf(this.f33515a));
            jSONObject.put("isTabletDevice", (Object) String.valueOf(this.b));
            jSONObject.put("changeType", (Object) (z ? "portrait" : "landscape"));
            popLayerBaseView.onReceiveEvent("PopLayer.ScreenChange", jSONObject.toJSONString());
        } catch (Throwable th) {
            c.a("OnScreenChanged.OnScreenChangedListener.error", th);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.e == null) {
        } else {
            h.a().d(this.e);
        }
    }
}
