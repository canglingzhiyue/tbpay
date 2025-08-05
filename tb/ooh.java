package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.d;

/* loaded from: classes8.dex */
public class ooh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_OPEN_SLIDE_PRE_RENDER = "openSlidePreRender";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f32226a;

    static {
        kge.a(360807015);
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        String str = null;
        if (jSONObject != null) {
            str = jSONObject.getString(KEY_OPEN_SLIDE_PRE_RENDER);
        }
        boolean parseBoolean = Boolean.parseBoolean(str);
        if (b() == parseBoolean) {
            return;
        }
        ldf.d("SlidePreRenderSwitchPatch", "updateSlidePreRenderSwitch isOpenSlidePreRender ：" + parseBoolean);
        f32226a = Boolean.valueOf(parseBoolean);
        d.a(KEY_OPEN_SLIDE_PRE_RENDER, String.valueOf(parseBoolean));
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        Boolean bool = f32226a;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(Boolean.parseBoolean(d.b(KEY_OPEN_SLIDE_PRE_RENDER, (String) null)));
        f32226a = valueOf;
        return valueOf.booleanValue();
    }
}
