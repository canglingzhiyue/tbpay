package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.homepage.utils.e;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class orw implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f32339a;
    private JSONObject b;
    private osa c;

    static {
        kge.a(-1920460634);
        kge.a(-1201612728);
        f32339a = Pattern.compile("locate=(.*)(\"|&)");
    }

    public orw(osa osaVar, JSONObject jSONObject) {
        this.b = jSONObject;
        this.c = osaVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        JSONObject jSONObject = this.b;
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        String string = jSONObject2.getString("similarUrl");
        Matcher matcher = f32339a.matcher(string);
        if (matcher.find() && matcher.groupCount() > 0) {
            String str = "Page_Home_Button-" + matcher.group(1);
            JSONObject jSONObject3 = this.b.getJSONObject("clickParam");
            String string2 = jSONObject2.getString("similarArgs");
            if (jSONObject3 != null && string2 != null) {
                kss.a(jSONObject3.getString("page"), jSONObject3.getIntValue("eventId"), str, string2);
            }
        }
        this.c.b();
        Nav.from(e.a(view)).toUri(string);
    }
}
