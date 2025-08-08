package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.ability.localization.b;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.search.common.util.r;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class npd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(788417785);
    }

    public final View a(Context context, ResultError resultError, View.OnClickListener clickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("aacc6ab7", new Object[]{this, context, resultError, clickListener});
        }
        q.c(context, "context");
        q.c(clickListener, "clickListener");
        TBErrorView tBErrorView = new TBErrorView(context);
        if (resultError == null) {
            tBErrorView.setStatus(TBErrorView.Status.STATUS_EMPTY);
            tBErrorView.setTitle(b.a(R.string.app_system_error));
            tBErrorView.setSubTitle(b.a(R.string.taobao_app_1005_1_16651));
            tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
            tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        } else {
            Error uniError = resultError.getUniError();
            if (uniError == null) {
                uniError = Error.Factory.newError(resultError.getMtopCode(), resultError.getErrorMsg());
            }
            tBErrorView.setError(uniError);
            tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, b.a(R.string.app_refresh), clickListener);
            String errorCode = uniError.errorCode;
            q.a((Object) errorCode, "errorCode");
            if (n.b(errorCode, its.TRAFFIC_LIMIT_STATUS, false, 2, (Object) null) || n.b(errorCode, "ANDROID_SYS_API_FLOW_LIMIT_LOCKED", false, 2, (Object) null)) {
                tBErrorView.setStatus(TBErrorView.Status.STATUS_EMPTY);
                tBErrorView.setTitle(r.o());
                tBErrorView.setSubTitle(r.p());
                tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
                tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
            } else {
                JSONObject a2 = r.a(errorCode);
                if (a2 != null) {
                    tBErrorView.setStatus(TBErrorView.Status.STATUS_EMPTY);
                    String optString = a2.optString("mainTitle", "");
                    if (!StringUtils.isEmpty(optString)) {
                        tBErrorView.setTitle(optString);
                    }
                    if (!StringUtils.isEmpty(a2.optString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, ""))) {
                        tBErrorView.setTitle(optString);
                    }
                    String optString2 = a2.optString("imageUrl");
                    if (!StringUtils.isEmpty(optString2)) {
                        tBErrorView.setIconUrl(optString2);
                    }
                    if (!a2.optBoolean("showRetry", true)) {
                        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
                        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
                    }
                }
            }
        }
        return tBErrorView;
    }
}
