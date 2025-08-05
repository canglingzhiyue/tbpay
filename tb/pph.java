package tb;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.desktop.channel.desktoplinktask.trigger.b;
import com.taobao.desktop.channel.desktoplinktask.widgetservice.DesktopTaskServiceReceiver;

/* loaded from: classes7.dex */
public class pph {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f32798a;
    private Handler b;

    static {
        kge.a(1172892656);
    }

    public pph(Context context, Handler handler) {
        this.f32798a = new b(context, DesktopTaskServiceReceiver.class);
        this.b = handler;
    }

    public boolean a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2bf4cf8", new Object[]{this, str, str2, jSONObject})).booleanValue();
        }
        if (this.f32798a == null || this.b == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("triggerEventId", str);
        bundle.putString("bizCode", str2);
        bundle.putString("action", JarvisConstant.KEY_JARVIS_TRIGGER);
        bundle.putBoolean("needToast", (jSONObject == null || !jSONObject.containsKey("needToast")) ? true : jSONObject.getBoolean("needToast").booleanValue());
        this.f32798a.a(3, bundle, this.b);
        return true;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.f32798a == null || this.b == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("triggerEventId", "default");
        bundle.putString("bizCode", str);
        bundle.putString("action", "query");
        this.f32798a.a(3, bundle, this.b);
        return true;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (this.f32798a == null || this.b == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("triggerEventId", "default");
        bundle.putString("bizCode", str);
        bundle.putString("action", "close");
        this.f32798a.a(3, bundle, this.b);
        return true;
    }
}
