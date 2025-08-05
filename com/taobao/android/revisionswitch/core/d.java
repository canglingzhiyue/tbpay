package com.taobao.android.revisionswitch.core;

import android.content.Context;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.revisionswitch.utils.LocationHelper;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ilw;
import tb.ilz;

/* loaded from: classes.dex */
public class d implements ilw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ilz f14884a;
    private final Map<String, Boolean> b = new HashMap();
    private final com.taobao.android.revisionswitch.utils.a c;

    public d(ilz ilzVar, com.taobao.android.revisionswitch.utils.a aVar) {
        this.f14884a = ilzVar;
        this.c = aVar;
    }

    @Override // tb.ilw
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.b.get(str).booleanValue();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.b.clear();
            this.b.put("location", Boolean.valueOf(jSONObject.getBoolean("location")));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.c.b();
        if (!TBRevisionSwitchManager.f14881a) {
            return;
        }
        this.c.c();
    }

    public void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        com.alibaba.ability.localization.b.a(new b.a() { // from class: com.taobao.android.revisionswitch.core.LocationSwitchExtractor$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ability.localization.b.a
            public void a(Language language, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("246661b", new Object[]{this, language, str});
                    return;
                }
                TLog.loge("LocationSwitchExtractor", "receive location change broadcast");
                boolean b = LocationHelper.b(context);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("location", b);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                d.this.b(jSONObject.toString());
            }
        });
        this.b.put("location", Boolean.valueOf(LocationHelper.b(context)));
    }
}
