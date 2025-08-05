package com.alibaba.android.ultron.event;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.ultron.event.model.OpenUrlEventModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Set;
import tb.bga;
import tb.kge;

/* loaded from: classes2.dex */
public class o extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_H5_RESULT = "data";
    public static final String KEY_OPEN_URL_EVENT = "openUrlEvent";
    public static final String KEY_OPEN_URL_PARAMS = "params";
    public static final String KEY_REQUEST_CODE = "activityRequestCode";
    public static final String KEY_RESULT_CODE = "activityResultCode";
    public static final String KEY_RESULT_DATA = "activityResultData";

    /* renamed from: a  reason: collision with root package name */
    public Intent f2606a;
    public com.taobao.android.ultron.common.model.b b;

    static {
        kge.a(-223448293);
    }

    public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
        } else if (!e()) {
        } else {
            int intValue = ((Integer) b("activityResultCode")).intValue();
            String pageType = ((OpenUrlEventModel) JSON.parseObject(this.b.getFields().toJSONString(), OpenUrlEventModel.class)).getPageType();
            if (TextUtils.isEmpty(pageType)) {
                return;
            }
            char c = 65535;
            int hashCode = pageType.hashCode();
            if (hashCode != -1968751561) {
                if (hashCode != 2285) {
                    if (hashCode == 2692129 && pageType.equals("Weex")) {
                        c = 2;
                    }
                } else if (pageType.equals("H5")) {
                    c = 1;
                }
            } else if (pageType.equals("Native")) {
                c = 0;
            }
            if (c == 0) {
                UnifyLog.a(this.f.h(), "OpenUrlResultSubscriber", "从native页面跳回", new String[0]);
                a(this.f2606a, intValue);
            } else if (c == 1) {
                UnifyLog.a(this.f.h(), "OpenUrlResultSubscriber", "从H5页面跳回", new String[0]);
                b(this.f2606a, intValue);
            } else if (c != 2) {
            } else {
                UnifyLog.a(this.f.h(), "OpenUrlResultSubscriber", "从weex页面跳回", new String[0]);
            }
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        int intValue = ((Integer) b("activityRequestCode")).intValue();
        this.f2606a = (Intent) b("activityResultData");
        com.alibaba.android.ultron.event.base.e eVar = (com.alibaba.android.ultron.event.base.e) b("openUrlEvent");
        if (this.g != null && eVar != null) {
            int intValue2 = ((Integer) eVar.d("activityRequestCode")).intValue();
            this.b = (com.taobao.android.ultron.common.model.b) eVar.i();
            com.taobao.android.ultron.common.model.b bVar = this.b;
            if (bVar == null) {
                return false;
            }
            JSONObject fields = bVar.getFields();
            if (intValue == intValue2 && fields != null) {
                return true;
            }
        }
        return false;
    }

    public void a(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2864bb7e", new Object[]{this, intent, new Integer(i)});
        } else if (i != -1 || intent == null) {
        } else {
            JSONObject a2 = a(intent);
            OpenUrlEventModel openUrlEventModel = null;
            try {
                openUrlEventModel = (OpenUrlEventModel) JSON.parseObject(this.b.getFields().toJSONString(), OpenUrlEventModel.class);
            } catch (Exception e) {
                bga.a.a(this.f.h(), "OpenUrlResultSubscriber.handleNativeResult", e);
            }
            if (openUrlEventModel == null) {
                return;
            }
            JSONObject params = openUrlEventModel.getParams();
            params.putAll(a2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("params", (Object) params);
            a(this.b, jSONObject);
        }
    }

    public void b(Intent intent, int i) {
        OpenUrlEventModel openUrlEventModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2911671d", new Object[]{this, intent, new Integer(i)});
        } else if (i != -1 || intent == null || (openUrlEventModel = (OpenUrlEventModel) JSON.parseObject(this.b.getFields().toJSONString(), OpenUrlEventModel.class)) == null) {
        } else {
            JSONObject params = openUrlEventModel.getParams();
            if (params == null) {
                params = new JSONObject();
            }
            String stringExtra = intent.getStringExtra("data");
            if (stringExtra == null) {
                return;
            }
            try {
                JSONObject parseObject = JSON.parseObject(stringExtra);
                if (parseObject != null) {
                    a(parseObject);
                    params.putAll(parseObject);
                }
            } catch (Exception e) {
                String h = this.f.h();
                UnifyLog.a(h, "OpenUrlResultSubscriber", "handleH5Result", "h5转化json失败: " + stringExtra);
                bga.a.a(this.f.h(), "OpenUrlResultSubscriber.handleH5Result", e);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("params", (Object) params);
            a(this.b, jSONObject);
        }
    }

    private JSONObject a(Intent intent) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c4801345", new Object[]{this, intent});
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        Set<String> keySet = extras.keySet();
        JSONObject jSONObject = new JSONObject();
        if (keySet != null) {
            for (String str : keySet) {
                if (!TextUtils.isEmpty(str) && (obj = extras.get(str)) != null) {
                    jSONObject.put(str, (Object) String.valueOf(obj));
                }
            }
        }
        return jSONObject;
    }
}
