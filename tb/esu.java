package tb;

import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.NavigationTabMsgMode;
import com.taobao.tao.navigation.a;
import com.taobao.tao.navigation.f;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class esu implements lyt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Pattern b = Pattern.compile("^[1-9]\\d*$");
    private static final Pair<JSONObject, JSONObject> c = new Pair<>(new JSONObject(), new JSONObject());

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f27550a = Pattern.compile(f.g());

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : b.matcher(str).matches();
    }

    @Override // tb.lyt
    public Pair<JSONObject, JSONObject> a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f88b7d10", new Object[]{this, str, str2, str3});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (!UCPManager.a("bottomBar", str, NavigationTabConstraints.MATERIAL_TYPE_ALIEN_EFFECTIVE, str3, jSONObject, jSONObject2)) {
            hut.b("IconRuleCheckResultProvider", "Update message count failed for materialSubType is limited!" + str + " " + str3);
            return null;
        }
        return new Pair<>(jSONObject, jSONObject2);
    }

    @Override // tb.lyt
    public Pair<JSONObject, JSONObject> a(String str, NavigationTabMsgMode navigationTabMsgMode, String str2) {
        boolean matches;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("61f843d7", new Object[]{this, str, navigationTabMsgMode, str2});
        }
        if (str2 == null || "0".equals(str2)) {
            return c;
        }
        if (navigationTabMsgMode == NavigationTabMsgMode.DEFAULT || navigationTabMsgMode == NavigationTabMsgMode.GUARDIAN_DEFAULT) {
            matches = b.matcher(str2).matches();
            str3 = UiUtil.INPUT_TYPE_VALUE_NUM;
        } else {
            matches = this.f27550a.matcher(str2).matches();
            str3 = "text";
        }
        String str4 = str3;
        if (!matches) {
            String a2 = a.a();
            TLog.loge(a2, "IconRuleCheckResultProvider", "Update message count failed for message format error!" + str + " " + navigationTabMsgMode + " " + str2);
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (!UCPManager.a("bottomBar", str, NavigationTabConstraints.MATERIAL_TYPE_COMMON_MARK, str4, jSONObject, jSONObject2)) {
            String a3 = a.a();
            TLog.loge(a3, "IconRuleCheckResultProvider", "Update message count failed for materialSubType is limited!" + str + " " + str4 + " " + str2);
            return null;
        }
        return new Pair<>(jSONObject, jSONObject2);
    }
}
