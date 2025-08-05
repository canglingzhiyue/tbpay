package tb;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.openarchitecture.listener.b;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.playcontrol.card.TBLOpenPlatformView;
import com.uc.webview.export.WebView;
import com.uc.webview.export.media.MessageID;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class pkh extends b implements TBLOpenPlatformView.a, pjm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    public TBLOpenPlatformView f32717a;
    private String b;
    private IWVWebView c;
    private String d;

    public static /* synthetic */ Object ipc$super(pkh pkhVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(283941716);
        kge.a(518407104);
        kge.a(-2091817362);
        TAG = pkh.class.getSimpleName();
    }

    public pkh(Context context, Object obj) {
        a("init");
        a((pjm) this);
        this.f32717a = new TBLOpenPlatformView(context);
        this.f32717a.setOpenPlatformViewEvent(this);
        this.f32717a.setEnableCoverFade(true);
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.get("id") instanceof String) {
                this.b = (String) map.get("id");
            }
            if (!(map.get(ecg.UMB_FEATURE_WEB_VIEW) instanceof WebView)) {
                return;
            }
            this.c = (IWVWebView) map.get(ecg.UMB_FEATURE_WEB_VIEW);
        }
    }

    @Override // tb.pjm
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        WVCallBackContext q = q(obj);
        if (q == null) {
            return;
        }
        a("subscribePM");
        this.f32717a.startSubscribePM("h5Card", true);
        q.success();
    }

    @Override // tb.pjm
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            return;
        }
        WVCallBackContext q = q(obj);
        if (q == null) {
            return;
        }
        a("unsubscribePM");
        this.f32717a.stopSubscribePM();
        q.success();
    }

    @Override // tb.pjm
    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
            return;
        }
        WVCallBackContext q = q(obj);
        if (q == null) {
            return;
        }
        try {
            new r().a(new JSONObject(this.d));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        q.success();
    }

    @Override // tb.pjm
    public void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9de07", new Object[]{this, obj});
            return;
        }
        WVCallBackContext q = q(obj);
        if (q == null) {
            return;
        }
        try {
            if (obj instanceof Map) {
                this.d = String.valueOf(((Map) obj).get("params"));
                if (!TextUtils.isEmpty(this.d)) {
                    com.alibaba.fastjson.JSONObject b = pqj.b(this.d);
                    if (this.f32717a != null) {
                        this.f32717a.setData(b);
                    }
                }
                a("setConfiguration mOriginParams = " + this.d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        q.success();
    }

    @Override // tb.pjm
    public void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceeb7748", new Object[]{this, obj});
            return;
        }
        WVCallBackContext q = q(obj);
        if (q == null) {
            return;
        }
        a("play");
        TBLOpenPlatformView tBLOpenPlatformView = this.f32717a;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.playVideo();
        }
        q.success();
    }

    @Override // tb.pjm
    public void f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191d1089", new Object[]{this, obj});
            return;
        }
        WVCallBackContext q = q(obj);
        if (q == null) {
            return;
        }
        a("stop");
        TBLOpenPlatformView tBLOpenPlatformView = this.f32717a;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.stopVideo();
        }
        q.success();
    }

    @Override // tb.pjm
    public void g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("634ea9ca", new Object[]{this, obj});
            return;
        }
        WVCallBackContext q = q(obj);
        if (q == null) {
            return;
        }
        q.success();
    }

    @Override // tb.pjm
    public void h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad80430b", new Object[]{this, obj});
            return;
        }
        WVCallBackContext q = q(obj);
        if (q == null) {
            return;
        }
        if (obj instanceof Map) {
            String valueOf = String.valueOf(((Map) obj).get("params"));
            TBLOpenPlatformView tBLOpenPlatformView = this.f32717a;
            if (tBLOpenPlatformView != null) {
                tBLOpenPlatformView.setMuted(pro.d(valueOf));
            }
            a("setMuted mute = " + valueOf);
        }
        q.success();
    }

    @Override // tb.pjm
    public void i(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b1dc4c", new Object[]{this, obj});
            return;
        }
        WVCallBackContext q = q(obj);
        if (q == null) {
            return;
        }
        if (this.f32717a != null) {
            r rVar = new r();
            rVar.a("result", String.valueOf(this.f32717a.isMuted()));
            q.success(rVar);
            return;
        }
        q.error();
    }

    @Override // tb.pjm
    public void j(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3758d", new Object[]{this, obj});
        } else {
            a("onAttachedToWebView");
        }
    }

    @Override // tb.pjm
    public void k(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c150ece", new Object[]{this, obj});
            return;
        }
        a("onDetachedFromWebView");
        TBLOpenPlatformView tBLOpenPlatformView = this.f32717a;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.destroy();
    }

    @Override // tb.pjm
    public void l(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d646a80f", new Object[]{this, obj});
        } else {
            a("onPause");
        }
    }

    @Override // tb.pjm
    public void m(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20784150", new Object[]{this, obj});
        } else {
            a("onResume");
        }
    }

    @Override // tb.pjm
    public void n(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aa9da91", new Object[]{this, obj});
            return;
        }
        a("onVisibilityChanged: " + obj.toString());
    }

    @Override // tb.pjm
    public void o(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4db73d2", new Object[]{this, obj});
            return;
        }
        WVCallBackContext q = q(obj);
        if (q == null) {
            return;
        }
        if (this.f32717a != null) {
            r rVar = new r();
            rVar.a("playerSession", this.f32717a.getPlayerSession());
            rVar.a(aw.PARAM_PLAYER_TOKEN, this.f32717a.getPlayerToken());
            q.success(rVar);
            return;
        }
        q.error();
    }

    @Override // tb.pjm
    public void p(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0d0d13", new Object[]{this, obj});
            return;
        }
        a(MessageID.onDestroy);
        TBLOpenPlatformView tBLOpenPlatformView = this.f32717a;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.destroy();
    }

    @Override // com.taobao.taolive.sdk.playcontrol.card.TBLOpenPlatformView.a
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            b(str, str2, str3);
        }
    }

    private void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
            return;
        }
        a("notifyH5Event type = " + str + " eventCode = " + str2 + " extra = " + str3);
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("type", (Object) str);
        jSONObject.put("code", (Object) str2);
        jSONObject.put("extra", (Object) str3);
        IWVWebView iWVWebView = this.c;
        if (iWVWebView == null) {
            return;
        }
        WVStandardEventCenter.postNotificationToJS(iWVWebView, "TLOVideoPlayer_event_" + this.b, jSONObject.toString());
    }

    private WVCallBackContext q(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("ae163b3f", new Object[]{this, obj});
        }
        try {
            if (!(obj instanceof Map)) {
                return null;
            }
            return (WVCallBackContext) ((Map) obj).get("callback");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String str2 = TAG;
        TLog.loge(str2, hashCode() + " " + str);
    }
}
