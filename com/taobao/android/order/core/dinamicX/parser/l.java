package com.taobao.android.order.core.dinamicX.parser;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import tb.fuf;
import tb.kge;

/* loaded from: classes6.dex */
public class l extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TABINFO = 5360454983433149130L;

    /* renamed from: a  reason: collision with root package name */
    private JSONArray f14613a;
    private int b = 0;
    private boolean c = false;

    static {
        kge.a(1543221184);
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public l(JSONArray jSONArray) {
        this.f14613a = jSONArray;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        a(dXRuntimeContext);
        return this.f14613a;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f14613a.size();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        JSONArray jSONArray = this.f14613a;
        if (jSONArray == null || jSONArray.size() == 0 || i == this.b) {
            return;
        }
        ((JSONObject) this.f14613a.get(i)).put("isSelected", (Object) "true");
        ((JSONObject) this.f14613a.get(this.b)).put("isSelected", (Object) "false");
        this.b = i;
    }

    public String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{this, new Integer(i)});
        }
        JSONArray jSONArray = this.f14613a;
        if (jSONArray != null && i >= 0 && i < jSONArray.size()) {
            JSONObject jSONObject = (JSONObject) this.f14613a.get(i);
            if (jSONObject.containsKey("tabCode")) {
                return jSONObject.getString("tabCode");
            }
        }
        return "";
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (this.f14613a == null) {
            return -1;
        }
        for (int i = 0; i < this.f14613a.size(); i++) {
            Object obj = this.f14613a.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.containsKey("tabCode") && jSONObject.getString("tabCode").equals(str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (this.f14613a == null) {
            return 0;
        }
        for (int i = 0; i < this.f14613a.size(); i++) {
            Object obj = this.f14613a.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.containsKey("isSelected") && jSONObject.getString("isSelected").equals("true")) {
                    this.b = i;
                    return i;
                }
            }
        }
        return 0;
    }

    public JSONArray c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("c49d9194", new Object[]{this}) : this.f14613a;
    }

    private void a(DXRuntimeContext dXRuntimeContext) {
        boolean z;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487cd5d9", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext == null) {
            UnifyLog.d("DXDataParserTabInfo.setupTabArray", "dxRuntimeContext is null");
        } else {
            JSONObject e = dXRuntimeContext.e();
            if (e == null) {
                UnifyLog.d("DXDataParserTabInfo.setupTabArray", com.taobao.vessel.utils.c.LOAD_DATA_NULL);
                return;
            }
            JSONObject jSONObject = e.getJSONObject("fields");
            if (jSONObject == null) {
                UnifyLog.d("DXDataParserTabInfo.setupTabArray", "fields is null");
            } else if (!StringUtils.equals(jSONObject.getString("isContainRefund"), "true")) {
                while (i < this.f14613a.size()) {
                    JSONObject jSONObject2 = this.f14613a.getJSONObject(i);
                    if (jSONObject2 != null && StringUtils.equals("reFund", jSONObject2.getString("tabCode"))) {
                        this.c = StringUtils.equals(jSONObject2.getString("isSelected"), "true");
                        this.f14613a.mo1572remove(i);
                        return;
                    }
                    i++;
                }
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f14613a.size()) {
                        z = false;
                        break;
                    }
                    JSONObject jSONObject3 = this.f14613a.getJSONObject(i2);
                    if (jSONObject3 != null && StringUtils.equals("reFund", jSONObject3.getString("tabCode"))) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (z) {
                    return;
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("title", (Object) com.alibaba.ability.localization.b.a(R.string.order_biz_refund));
                jSONObject4.put("isSelected", (Object) String.valueOf(this.c));
                jSONObject4.put("tabCode", (Object) "reFund");
                if (this.f14613a.size() - 1 > 0) {
                    i = this.f14613a.size() - 1;
                }
                this.f14613a.add(i, jSONObject4);
            }
        }
    }
}
