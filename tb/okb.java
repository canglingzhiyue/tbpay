package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class okb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean d;
    public int e;
    public String f;
    public String g;
    public int i;
    public Context j;

    /* renamed from: a  reason: collision with root package name */
    public int f32134a = 1900;
    public int b = 400;
    public boolean c = true;
    public boolean h = true;

    static {
        kge.a(-1712804154);
    }

    public okb(Context context) {
        this.j = context;
        this.e = fjl.a(context, 38.0f) / 2;
    }

    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("mainPicContainer")) == null) {
        } else {
            String string = jSONObject2.getString("autoScrollGap");
            if (!TextUtils.isEmpty(string)) {
                this.f32134a = Integer.parseInt(string);
            }
            this.c = !"false".equals(jSONObject2.getString("enableAutoScroll"));
            String string2 = jSONObject2.getString("autoScrollDuration");
            if (!TextUtils.isEmpty(string2)) {
                this.b = Integer.parseInt(string2);
            }
            this.d = "true".equals(jSONObject2.getString("enableImagePullLeftTips"));
            String string3 = jSONObject2.getString("imagePullLeftDistance");
            if (!TextUtils.isEmpty(string3)) {
                this.e = Integer.parseInt(string3);
                this.e = fjl.a(this.j, this.e) / 2;
            }
            this.f = jSONObject2.getString("imagePullLeftDragText");
            this.f = a(this.f);
            this.g = jSONObject2.getString("imagePullLeftReleaseText");
            this.g = a(this.g);
            String string4 = jSONObject2.getString("enableBlurImage");
            if (!TextUtils.isEmpty(string4)) {
                this.h = !"false".equals(string4);
            }
            String string5 = jSONObject2.getString("bottomAreaBasic");
            if (TextUtils.isEmpty(string5)) {
                return;
            }
            this.i = Integer.parseInt(string5);
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(c);
            sb.append("\n");
        }
        return sb.toString();
    }
}
