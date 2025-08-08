package tb;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.ultron.common.utils.UnifyLog;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class hym {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f28842a;

    static {
        kge.a(-1976471054);
    }

    public void a(MtopResponse mtopResponse) {
        JSONObject dataJsonObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
        } else if (mtopResponse == null || (dataJsonObject = mtopResponse.getDataJsonObject()) == null) {
        } else {
            try {
                JSONObject jSONObject = dataJsonObject.getJSONObject("global");
                if (jSONObject == null || !jSONObject.has("redirectUrlWhenClose")) {
                    return;
                }
                String string = jSONObject.getString("redirectUrlWhenClose");
                if (StringUtils.isEmpty(string)) {
                    return;
                }
                this.f28842a = string;
                UnifyLog.b("RedirectUtil", "redirectUrlWhenClose=" + string);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{this, activity})).booleanValue();
        }
        if (!StringUtils.isEmpty(this.f28842a) && hyk.I()) {
            return Nav.from(activity).disableTransition().toUri(this.f28842a);
        }
        return false;
    }
}
