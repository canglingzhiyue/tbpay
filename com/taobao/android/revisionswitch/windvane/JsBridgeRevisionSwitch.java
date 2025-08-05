package com.taobao.android.revisionswitch.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class JsBridgeRevisionSwitch extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GET_BUCKET = "getBucket";
    private static final String GET_ELDER_SIMPLE_SWITCH_VALUE = "getElderSimpleSwitchValue";
    private static final String GET_SWITCH_VALUE = "getSwitchValue";
    private static final String INSERT_SWITCH_IMMEDIATELY = "insertSwitchImmediately";
    public static final String NAME = "JsBridgeRevisionSwitch";

    public static /* synthetic */ Object ipc$super(JsBridgeRevisionSwitch jsBridgeRevisionSwitch, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 317811936:
                if (str.equals(GET_BUCKET)) {
                    c = 1;
                    break;
                }
                break;
            case 1057359767:
                if (str.equals(GET_ELDER_SIMPLE_SWITCH_VALUE)) {
                    c = 3;
                    break;
                }
                break;
            case 1480233319:
                if (str.equals(GET_SWITCH_VALUE)) {
                    c = 0;
                    break;
                }
                break;
            case 2041375601:
                if (str.equals(INSERT_SWITCH_IMMEDIATELY)) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            return getSwitchValue(str2, wVCallBackContext);
        }
        if (c == 1) {
            return getBucket(str2, wVCallBackContext);
        }
        if (c == 2) {
            return insertSwitchImmediately(str2, wVCallBackContext);
        }
        if (c == 3) {
            return getElderSimpleSwitchValue(str2, wVCallBackContext);
        }
        return false;
    }

    private boolean insertSwitchImmediately(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd8c3583", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            TBRevisionSwitchManager.i().a(new JSONObject(str));
            wVCallBackContext.success(new r("HY_SUCCESS"));
        } catch (JSONException e) {
            wVCallBackContext.error(e.getMessage());
        }
        return true;
    }

    private boolean getSwitchValue(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2c4aff9", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            boolean a2 = TBRevisionSwitchManager.i().a(new JSONObject(str).getString("key"));
            r rVar = new r("HY_SUCCESS");
            rVar.a("value", Boolean.valueOf(a2));
            wVCallBackContext.success(rVar);
        } catch (JSONException e) {
            wVCallBackContext.error(e.getMessage());
        }
        return true;
    }

    private boolean getElderSimpleSwitchValue(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82caa29", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            String c = TBRevisionSwitchManager.i().c(new JSONObject(str).getString("key"));
            r rVar = new r("HY_SUCCESS");
            rVar.a("value", c);
            wVCallBackContext.success(rVar);
        } catch (JSONException e) {
            wVCallBackContext.error(e.getMessage());
        }
        return true;
    }

    private boolean getBucket(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bde00032", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        String h = TBRevisionSwitchManager.i().h();
        if (h == null) {
            h = "";
        }
        r rVar = new r("HY_SUCCESS");
        rVar.a("bucket", h);
        wVCallBackContext.success(rVar);
        return true;
    }
}
