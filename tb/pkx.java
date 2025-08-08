package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class pkx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f32740a;
    private a b;

    static {
        kge.a(-827840740);
    }

    public pkx(Context context) {
        this.f32740a = context;
    }

    public boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3286165a", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString("messageCode");
        String optString2 = jSONObject.optString("messageInfo");
        if (!StringUtils.isEmpty(optString2) && !StringUtils.isEmpty(optString)) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("forbidden_reason", optString);
            phg.a().a(this.b, "Forbiddenspeech", hashMap);
            if (a(optString)) {
                plx.b("PublishInterceptor", "intercept | messageCode=" + optString + "   messageInfo=" + optString2);
                Context context = this.f32740a;
                if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                    pkz pkzVar = new pkz(this.f32740a);
                    pkzVar.a("您已被禁言").b(optString2).a("我知道了", new View.OnClickListener() { // from class: tb.pkx.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            }
                        }
                    });
                    pkzVar.show();
                }
                return true;
            }
        }
        return false;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        String c = ply.c();
        if (StringUtils.isEmpty(c)) {
            return false;
        }
        for (String str2 : c.split(",")) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
