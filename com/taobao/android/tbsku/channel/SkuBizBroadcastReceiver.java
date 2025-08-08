package com.taobao.android.tbsku.channel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbsku.TBXSkuCore;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.net.URLDecoder;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes6.dex */
public class SkuBizBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f15406a;
    private TBXSkuCore b;

    static {
        kge.a(70535035);
    }

    public static /* synthetic */ Object ipc$super(SkuBizBroadcastReceiver skuBizBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public SkuBizBroadcastReceiver(TBXSkuCore tBXSkuCore, String str) {
        this.b = tBXSkuCore;
        this.f15406a = str;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (StringUtils.isEmpty(this.f15406a)) {
        } else {
            try {
                JSONObject parseObject = JSONObject.parseObject(intent.getStringExtra("stringifyData"));
                if (parseObject == null || !a(this.f15406a, parseObject.getString("skuToken"))) {
                    return;
                }
                String string = parseObject.getString("action");
                if ("biz_maccolor".equalsIgnoreCase(string)) {
                    a(parseObject);
                } else if (StringUtils.isEmpty(string)) {
                } else {
                    b(parseObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (str.equals(str2)) {
            return true;
        }
        return str.equals(URLDecoder.decode(str2, "UTF-8"));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.taobao.android.tbsku.channel.SkuBizBroadcastReceiver$2] */
    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        final JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject parseObject = JSONObject.parseObject(jSONObject.getString("params"));
            if (parseObject != null) {
                jSONObject2.putAll(parseObject);
            }
        } catch (Throwable unused) {
        }
        e a2 = this.b.b().k().d().a();
        a2.a("adjustState");
        a2.a(new DMEvent("adjustState", new JSONObject() { // from class: com.taobao.android.tbsku.channel.SkuBizBroadcastReceiver.1
            {
                put("subType", "change_prop");
            }
        }, null));
        a2.a("extraParams", new ArrayList<Object>() { // from class: com.taobao.android.tbsku.channel.SkuBizBroadcastReceiver.2
            {
                add("propChangeFromMacColor");
                add(jSONObject2);
            }
        }.toArray());
        this.b.b().k().d().a(a2);
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.b.b().b(jSONObject);
        }
    }
}
