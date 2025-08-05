package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.linklog.a;
import com.taobao.taolive.room.utils.aw;

/* loaded from: classes7.dex */
public class kuh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALI_TRACK_ID = "ali_trackid";
    public static final String SCROLL_TO_CAMPAIGN = "campaign";
    public static final String SCROLL_TO_HOME = "home";
    public static final String SCROLL_TO_RECMD = "recmd";

    /* renamed from: a  reason: collision with root package name */
    public String f30326a;
    public String b;
    public boolean c;
    public Intent d;
    public String e;
    private final String f = "PageControlParams";
    public String g;

    static {
        kge.a(-1452064484);
    }

    public kuh(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        this.d = intent;
        this.c = Boolean.parseBoolean(data.getQueryParameter(aw.PARAM_FORCE_REFRESH));
        this.f30326a = data.getQueryParameter("scrollto");
        this.b = data.getQueryParameter("recmdparams");
        this.e = data.getQueryParameter(ALI_TRACK_ID);
        this.g = data.getQueryParameter("categoryTabId");
        a(data);
        a.a("intentProcess", "PageControlParams", "scrollTo : " + this.f30326a + ", recmdParams : " + this.b + "， aLiTrackId ： " + this.e);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "scrollTo : " + this.f30326a + ", recmdParams : " + this.b + ", forceRefresh : " + this.c;
    }

    private void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
        } else if (TextUtils.isEmpty(this.b)) {
            a.a("intentProcess", "PageControlParams", "recmdParams is empty");
        } else {
            try {
                String queryParameter = uri.getQueryParameter("_afc_params_json");
                a.a("intentProcess", "PageControlParams", "afcParams : " + queryParameter);
                JSONObject parseObject = JSON.parseObject(this.b);
                if (parseObject.isEmpty()) {
                    return;
                }
                JSONObject jSONObject = parseObject.getJSONObject("bizparams");
                if (jSONObject.isEmpty()) {
                    return;
                }
                JSONObject parseObject2 = JSON.parseObject(queryParameter);
                if (parseObject2.isEmpty()) {
                    return;
                }
                jSONObject.put("_afc_params_json", (Object) parseObject2);
                parseObject.put("bizparams", (Object) jSONObject);
                this.b = parseObject.toJSONString();
            } catch (Throwable th) {
                e.e("PageControlParams", th.getMessage());
            }
        }
    }
}
