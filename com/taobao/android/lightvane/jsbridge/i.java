package com.taobao.android.lightvane.jsbridge;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes5.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLOSED = "HY_CLOSED";
    public static final String ERROR_EXECUTE = "HY_ERROR_EXECUTE";
    public static final String FAIL = "HY_FAILED";
    public static final String NO_CLASS = "HY_NO_CLASS";
    public static final String NO_METHOD = "HY_NO_HANDLER";
    public static final String NO_PERMISSION = "HY_NO_PERMISSION";
    public static final String PARAM_ERR = "HY_PARAM_ERR";
    public static final i RET_CLOSED;
    public static final i RET_FAIL;
    public static final i RET_NO_METHOD;
    public static final i RET_NO_PERMISSION;
    public static final i RET_PARAM_ERR;
    public static final i RET_SUCCESS;
    public static final String SUCCESS = "HY_SUCCESS";

    /* renamed from: a  reason: collision with root package name */
    private int f13295a = 0;
    private JSONObject b = new JSONObject();

    static {
        kge.a(-1857562534);
        RET_SUCCESS = new i("HY_SUCCESS");
        RET_FAIL = new i("HY_FAILED");
        RET_PARAM_ERR = new i("HY_PARAM_ERR");
        RET_NO_METHOD = new i("HY_NO_HANDLER");
        RET_NO_PERMISSION = new i("HY_NO_PERMISSION");
        RET_CLOSED = new i("HY_CLOSED");
    }

    public i() {
    }

    public i(String str) {
        a(str);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (str == null || str2 == null) {
        } else {
            try {
                this.b.put(str, str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f13295a = 1;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            this.b.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, str);
            if (!"HY_SUCCESS".equals(str)) {
                i = -1;
            }
            this.f13295a = i;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        try {
            if (this.f13295a == 1) {
                this.b.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, "HY_SUCCESS");
            } else if (this.f13295a == 0) {
                this.b.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, "HY_FAILED");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.b.toString();
    }
}
