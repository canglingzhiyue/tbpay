package com.taobao.homepage.pop.ucp;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPReachViewState;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.d;

/* loaded from: classes7.dex */
public class b implements com.taobao.android.external.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CODE_ERROR = 3;
    public static final int CODE_OK = 0;
    public static final int CODE_TERMINAL = 2;
    public static final int CODE_WARNING = 1;
    public static final String ERROR_DX_RENDER_FAILED = "DxRenderFailed";
    public static final String ERROR_MSG_ANCHOR_VIEW_INVALID = "AnchorViewInvalid";
    public static final String ERROR_MSG_NO_POP_DATA = "NoPopDataError";
    public static final String ERROR_MSG_SHOW_COUNT_INVALID = "ShowCountInvalid";
    public static final String ERROR_MSG_TARGET_VIEW_ERROR = "TargetViewError";
    public static final String ERROR_OTHER_ERROR = "OtherError";
    public static final String ERROR_WEEX_RENDER_FAILED = "WeexRenderFailed";
    public static final String KEY_BIZ_CHECK = "BizCheck";
    public static final String KEY_CANCEL = "Cancel";
    public static final String KEY_CLICK = "Click";
    public static final String KEY_ERROR = "Error";
    public static final String KEY_EXPOSE = "Expose";
    public static final String KEY_PAUSE = "Stop";
    public static final String KEY_RESUME = "Resume";
    public static final String KEY_TERMINAL = "Terminal";

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f17251a;
    private final JSONObject b;
    private final com.taobao.android.external.a c;
    private boolean d;
    private boolean e;

    public boolean a(IPopData<?> iPopData) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6ae3edc", new Object[]{this, iPopData})).booleanValue();
        }
        if (iPopData != null) {
            try {
                if (iPopData.getUCPConfig() == null || !iPopData.getUCPConfig().enable() || this.f17251a == null || (jSONObject = this.f17251a.getJSONObject("ext")) == null) {
                    return false;
                }
                String string = jSONObject.getString("businessId");
                if (!StringUtils.isEmpty(string)) {
                    return StringUtils.equals(iPopData.getBusinessID(), string);
                }
                return false;
            } catch (Exception e) {
                com.taobao.homepage.pop.utils.c.a(a.TAG, e);
            }
        }
        return false;
    }

    @Override // com.taobao.android.external.a
    public void a(UCPReachViewState uCPReachViewState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe4b5af", new Object[]{this, uCPReachViewState});
        } else if (uCPReachViewState == null) {
        } else {
            com.taobao.homepage.pop.utils.c.a(a.TAG, "synchronizeState, key = " + uCPReachViewState.key + ", code = " + uCPReachViewState.code + ", msg = " + uCPReachViewState.msg);
            if (StringUtils.equals(uCPReachViewState.key, "Expose")) {
                if (this.e) {
                    com.taobao.homepage.pop.utils.c.a(a.TAG, "synchronizeState, already exposed");
                    return;
                }
                this.e = true;
            }
            if (StringUtils.equals(uCPReachViewState.key, KEY_BIZ_CHECK)) {
                if (this.d) {
                    com.taobao.homepage.pop.utils.c.a(a.TAG, "synchronizeState, already checked");
                    return;
                }
                this.d = true;
            }
            if (uCPReachViewState.code == 0) {
                d.a(uCPReachViewState.key, a(), String.valueOf(uCPReachViewState.code), uCPReachViewState.msg);
            } else {
                d.b(uCPReachViewState.key, a(), String.valueOf(uCPReachViewState.code), uCPReachViewState.msg);
            }
            com.taobao.android.external.a aVar = this.c;
            if (aVar == null) {
                return;
            }
            aVar.a(uCPReachViewState);
        }
    }

    public String a() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        JSONObject jSONObject2 = this.f17251a;
        return (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("ext")) == null) ? "" : jSONObject.getString("businessId");
    }

    public void a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed88149b", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        UCPReachViewState uCPReachViewState = new UCPReachViewState();
        uCPReachViewState.group = a.KEY_UCP_PROTOCOL;
        uCPReachViewState.key = str;
        uCPReachViewState.code = i;
        uCPReachViewState.msg = str2;
        uCPReachViewState.trackInfo = this.b;
        a(uCPReachViewState);
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, com.taobao.android.external.a aVar) {
        this.f17251a = jSONObject;
        this.b = jSONObject2;
        this.c = aVar;
    }

    public static b a(JSONObject jSONObject, JSONObject jSONObject2, com.taobao.android.external.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("52688af1", new Object[]{jSONObject, jSONObject2, aVar}) : new b(jSONObject, jSONObject2, aVar);
    }
}
