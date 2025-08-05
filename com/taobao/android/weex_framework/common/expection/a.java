package com.taobao.android.weex_framework.common.expection;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.util.b;
import com.taobao.android.weex_framework.adapter.i;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.util.g;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXCEPTION_BUNDLE_URL = "key_bundle_url";
    public static final String KEY_JS_VERSION_INFO = "key_js_version_info";
    public static final String TAG = "[WXExceptionManager]";

    /* renamed from: a  reason: collision with root package name */
    private i f15988a = l.a().i();

    static {
        kge.a(1474877639);
    }

    public void a(int i, String str, String str2, String str3, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fadd26ea", new Object[]{this, new Integer(i), str, str2, str3, new Integer(i2)});
            return;
        }
        i iVar = this.f15988a;
        if (iVar == null || 10018 == i) {
            return;
        }
        iVar.a(i, str, str2, str3, i2);
    }

    public void a(int i, String str, String str2, String str3, String str4, WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a28ae1", new Object[]{this, new Integer(i), str, str2, str3, str4, weexInstanceImpl});
            return;
        }
        i iVar = this.f15988a;
        if (iVar == null) {
            return;
        }
        iVar.a(i, str, str2, str3, str4, weexInstanceImpl);
    }

    public void a(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1835b846", new Object[]{this, weexInstanceImpl});
        } else if (this.f15988a == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(KEY_EXCEPTION_BUNDLE_URL, (Object) weexInstanceImpl.getBundleUrl());
            jSONObject.put(KEY_JS_VERSION_INFO, (Object) weexInstanceImpl.getInstanceInfo().get("js_version_info"));
            this.f15988a.a(weexInstanceImpl.getInstanceId(), jSONObject);
        }
    }

    public void b(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dafde87", new Object[]{this, weexInstanceImpl});
            return;
        }
        i iVar = this.f15988a;
        if (iVar == null) {
            return;
        }
        iVar.a(weexInstanceImpl.getInstanceId());
    }

    public void c(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a04c8", new Object[]{this, weexInstanceImpl});
            return;
        }
        try {
            if (this.f15988a == null) {
                return;
            }
            String str = "";
            Context context = weexInstanceImpl.getContext();
            if (context != null) {
                str = context.getClass().getSimpleName();
            }
            this.f15988a.b(weexInstanceImpl.getInstanceId(), b.c(weexInstanceImpl.getBundleUrl()), str);
        } catch (Exception e) {
            g.c(TAG, e);
        }
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (this.f15988a == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("page_url", str);
            hashMap.put(i.KEY_CRASH_INFO_JS_VERSION, str2);
            this.f15988a.a(hashMap);
        }
    }
}
