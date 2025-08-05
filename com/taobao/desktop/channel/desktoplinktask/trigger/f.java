package com.taobao.desktop.channel.desktoplinktask.trigger;

import android.os.Messenger;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ppi;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_KEY_NEED_LOCAL_REQUEST_CACHE = "needLocalRequestCache";
    public static final String PARAM_KEY_NEED_TOAST = "needToast";
    public static final String PARAM_KEY_TOAST_LOADING = "loadingToast";
    public static final String PARAM_KEY_TOAST_LOAD_FAIL = "loadFailToast";
    public static final String PARAM_KEY_TOAST_LOAD_TIME_OUT = "loadTimeOutToast";
    public static final int TRIGGER_TYPE_FLOAT_WINDOW_LOCAL_TASK = 2;
    public static final int TRIGGER_TYPE_FLOAT_WINDOW_ONCE_EVENT_TASK = 1;
    public static final int TRIGGER_TYPE_FLOAT_WINDOW_USER_EVENT = 3;

    /* renamed from: a  reason: collision with root package name */
    public final int f16953a;
    public String b;
    public String c;
    public JSONObject d;
    public Messenger e;
    public ppi f;

    static {
        kge.a(1778482576);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f16953a == 3;
    }

    public f(int i) {
        this.f16953a = i;
    }
}
