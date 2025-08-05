package com.alibaba.android.ultron.trade.event;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Arrays;
import tb.bmz;
import tb.bne;
import tb.bnf;
import tb.dkt;
import tb.dkx;
import tb.dlh;
import tb.dll;
import tb.dlr;
import tb.kge;

/* loaded from: classes2.dex */
public class j extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_COMMON_POPUP_FIELDS = "commonPopupFields";
    public static final String KEY_NEED_CALL_ADJUST_WHEN_CLOSE = "needCallAdjustWhenClose";
    public static final String KEY_OPTIONS = "options";
    public static final String KEY_PARAMS = "params";
    public static final String KEY_TYPE = "type";
    public static final String TAG = "OpenCommonPopupWindowSubscriber";
    public static final String TYPE_CLOSE = "close";
    public static final String TYPE_CONFIRM = "confirm";

    /* renamed from: a  reason: collision with root package name */
    public static dkt f2663a;
    private dll b = new dll() { // from class: com.alibaba.android.ultron.trade.event.j.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dll
        public void callback(String str, dkx dkxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398d9b15", new Object[]{this, str, dkxVar});
            } else if (dkxVar == null) {
                UnifyLog.d(j.TAG, "AKIAbilityCallback result is null");
            } else {
                Object c = dkxVar.c();
                if (!(c instanceof JSONObject)) {
                    UnifyLog.d(j.TAG, "AKIAbilityCallback result invalid");
                    return;
                }
                JSONObject jSONObject = (JSONObject) c;
                String string = jSONObject.getString("type");
                if ("close".equals(string)) {
                    j.a(j.this);
                } else if (!"confirm".equals(string)) {
                } else {
                    j.a(j.this, jSONObject);
                }
            }
        }
    };

    static {
        kge.a(-1524576427);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1289c367", new Object[]{jVar});
        } else {
            jVar.f();
        }
    }

    public static /* synthetic */ void a(j jVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b70c069", new Object[]{jVar, jSONObject});
        } else {
            jVar.a(jSONObject);
        }
    }

    public j() {
        a();
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
        } else if (bmzVar == null) {
            UnifyLog.d(TAG, "onHandleEvent,event is null");
        } else {
            com.taobao.android.ultron.common.model.b b = b();
            if (b == null) {
                UnifyLog.d(TAG, "onHandleEvent,idmEvent is null");
                return;
            }
            JSONObject fields = b.getFields();
            if (fields == null) {
                UnifyLog.d(TAG, "onHandleEvent,event fields is null");
            } else if (this.h == null) {
                UnifyLog.d(TAG, "onHandleEvent,mComponent is null");
            } else {
                bne bneVar = new bne(Arrays.asList(this.h));
                bneVar.b();
                bmzVar.a((bnf) bneVar);
                a(bmzVar, fields);
            }
        }
    }

    private void a(bmz bmzVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc61a927", new Object[]{this, bmzVar, jSONObject});
            return;
        }
        if (f2663a == null) {
            f2663a = new dkt();
        }
        Context a2 = bmzVar.a();
        if (!(a2 instanceof Activity)) {
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(KEY_COMMON_POPUP_FIELDS);
        if (jSONObject2 == null) {
            UnifyLog.d(TAG, "showCommonPopupWindow,popupFields is null");
            return;
        }
        try {
            dlh dlhVar = new dlh(jSONObject2);
            dlr dlrVar = new dlr();
            dlrVar.a(a2);
            dlrVar.a(((Activity) a2).getWindow().getDecorView());
            f2663a.a(dlhVar, dlrVar, this.b);
        } catch (Exception e) {
            UnifyLog.d(TAG, e.toString());
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (this.d != null) {
            this.d.g();
        }
        if (!g()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) "H5Back");
        a(b(), jSONObject);
        this.f.w().b(this.h);
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        JSONObject c = c();
        if (c != null && c.getJSONObject("options") != null) {
            return Boolean.parseBoolean(c.getJSONObject("options").getString(KEY_NEED_CALL_ADJUST_WHEN_CLOSE));
        }
        return false;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (this.h == null) {
            UnifyLog.d(TAG, "confirm,mComponent is null");
        } else {
            JSONObject fields = this.h.getFields();
            if (fields != null) {
                fields.put("type", (Object) jSONObject.getString("type"));
                fields.put("params", (Object) jSONObject.getJSONObject("params"));
            }
            if (!a(this.h)) {
                return;
            }
            this.f.w().b(this.h);
        }
    }

    private boolean a(IDMComponent iDMComponent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{this, iDMComponent})).booleanValue();
        }
        JSONObject stashData = iDMComponent.getStashData();
        JSONObject data = iDMComponent.getData();
        if (stashData != null && data != null) {
            try {
                z = a(data, stashData);
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        for (String str : jSONObject.keySet()) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if (obj instanceof JSONObject) {
                if (!a((JSONObject) obj, (JSONObject) obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }
}
