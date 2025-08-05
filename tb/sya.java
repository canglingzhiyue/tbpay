package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.family.globalbubble.GlobalWindowFactory;
import com.taobao.family.globalbubble.c;
import com.taobao.family.globalbubble.h;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* loaded from: classes7.dex */
public class sya extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GB_IMQUICK_CHAT_DISMISSED = "gbIMQuickChatDismissed";
    public static final String QUICK_CHAT_URL = "https://tb.cn/n/im/dynamic/quickchat.html";
    private boolean h;

    public static /* synthetic */ Object ipc$super(sya syaVar, String str, Object... objArr) {
        if (str.hashCode() == 95609329) {
            return new Boolean(super.f());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.family.globalbubble.h
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "ShareBackBubble";
    }

    @Override // com.taobao.family.globalbubble.h
    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : "shareback_bubble";
    }

    public sya(Context context, boolean z, int i) {
        super(context, z, i);
        this.h = OrangeConfig.getInstance().getConfig("social_global_bubble", "showSocialBubble", "true").equals("true");
    }

    @Override // com.taobao.family.globalbubble.h
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        JSONObject jSONObject = c.a().d;
        String string = jSONObject == null ? null : jSONObject.getString("popPageUrl");
        if (string == null || string.contains("wh_ttid=native")) {
            return string;
        }
        return string + "&wh_ttid=native";
    }

    @Override // com.taobao.family.globalbubble.h
    public boolean f() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (super.f() || !this.h) {
            return true;
        }
        return !(this.c != null && (this.c.equals("com.taobao.tao.detail.activity.DetailActivity") || this.c.equals("com.taobao.android.detail.wrapper.activity.DetailActivity"))) || c.a().a(GlobalWindowFactory.WINDOW_AFFECTION) || (jSONObject = c.a().d) == null || !jSONObject.getBooleanValue("isShowPop") || TextUtils.isEmpty(b()) || jSONObject.getJSONObject("popData") == null;
    }

    @Override // com.taobao.family.globalbubble.h, com.taobao.family.globalbubble.e
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (!GlobalWindowFactory.EVENT_SHARE_BACK_POP.equals(str)) {
        } else {
            this.f17142a.sendEmptyMessage(1);
        }
    }
}
