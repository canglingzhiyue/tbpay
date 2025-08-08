package com.taobao.uikit.extend.component.error;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes9.dex */
public class DefaultErrorFilter extends AbsErrorFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context context;
    public JSONObject filterRule;

    static {
        kge.a(1076425069);
    }

    public static /* synthetic */ Object ipc$super(DefaultErrorFilter defaultErrorFilter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DefaultErrorFilter(Context context, String str) {
        this.context = context;
        try {
            this.filterRule = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.uikit.extend.component.error.AbsErrorFilter
    public String filterTitle(Error error, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9045b85c", new Object[]{this, error, charSequence});
        }
        String charSequence2 = StringUtils.isEmpty(charSequence) ? "" : charSequence.toString();
        String codeToTitleKey = codeToTitleKey(error.responseCode, String.valueOf(error.errorCode));
        if (StringUtils.isEmpty(codeToTitleKey)) {
            codeToTitleKey = codeToTitleKey(error.responseCode, error.errorCode);
        }
        String optString = this.filterRule.optString(codeToTitleKey);
        return StringUtils.isEmpty(optString) ? charSequence2 : optString;
    }

    @Override // com.taobao.uikit.extend.component.error.AbsErrorFilter
    public String filterSubTitle(Error error, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66d1222c", new Object[]{this, error, charSequence});
        }
        String charSequence2 = StringUtils.isEmpty(charSequence) ? "" : charSequence.toString();
        String codeToSubTitleKey = codeToSubTitleKey(error.responseCode, String.valueOf(error.errorCode));
        if (StringUtils.isEmpty(codeToSubTitleKey)) {
            codeToSubTitleKey = codeToSubTitleKey(error.responseCode, error.errorCode);
        }
        String optString = this.filterRule.optString(codeToSubTitleKey);
        return StringUtils.isEmpty(optString) ? charSequence2 : optString;
    }

    @Override // com.taobao.uikit.extend.component.error.AbsErrorFilter
    public int filterIcon(Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8214222", new Object[]{this, error})).intValue();
        }
        if (isNetworkError(error.errorCode)) {
            return R.drawable.uik_error_icon_v2;
        }
        if (isLimitError(error.responseCode, error.errorCode)) {
            return R.drawable.uik_limit_error_icon_v2;
        }
        if (!isSysError(error.responseCode, error.errorCode)) {
            return -1;
        }
        return R.drawable.uik_sys_error_icon_v2;
    }

    private String codeToTitleKey(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("602d5289", new Object[]{this, new Integer(i), str}) : StringUtils.isEmpty(str) ? "" : isNetworkError(str) ? AbsErrorFilter.KEY_ERRORVIEW_NETWORKERROR_TITLE : isLimitError(i, str) ? AbsErrorFilter.KEY_ERRORVIEW_LIMIT_ERROR_TITLE : isSysError(i, str) ? AbsErrorFilter.KEY_ERRORVIEW_SYS_ERROR_TITLE : "";
    }

    private String codeToSubTitleKey(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("485a7119", new Object[]{this, new Integer(i), str}) : StringUtils.isEmpty(str) ? "" : isNetworkError(str) ? AbsErrorFilter.KEY_ERRORVIEW_NETWORKERROR_SUBTITLE : isLimitError(i, str) ? AbsErrorFilter.KEY_ERRORVIEW_LIMIT_ERROR_SUBTITLE : isSysError(i, str) ? AbsErrorFilter.KEY_ERRORVIEW_SYS_ERROR_SUBTITLE : "";
    }
}
