package com.taobao.tao.flexbox.layoutmanager.module;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import tb.kge;
import tb.oeb;
import tb.ohh;

@AnyThread
/* loaded from: classes8.dex */
public class StorageModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1460457741);
        kge.a(-818961104);
    }

    public static void get(final g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df6a2c2", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.containsKey("key") ? jSONObject.getString("key") : null;
            if (!TextUtils.isEmpty(string)) {
                if (jSONObject.getBooleanValue("memory")) {
                    cVar.c.a(cVar, ohh.a(string));
                    return;
                } else {
                    ohh.a(string, new IStorage.a() { // from class: com.taobao.tao.flexbox.layoutmanager.module.StorageModule.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage.a
                        public void a(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                            } else {
                                g.c.this.c.a(g.c.this, obj);
                            }
                        }
                    });
                    return;
                }
            }
            cVar.c.a(cVar, (g.a) null);
        }
    }

    public static void set(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("441ddf36", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            Object obj = null;
            String string = jSONObject.containsKey("key") ? jSONObject.getString("key") : null;
            if (jSONObject.containsKey("value")) {
                obj = jSONObject.get("value");
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            if (jSONObject.getBooleanValue("memory")) {
                ohh.a(string, obj);
            } else {
                ohh.b(string, obj);
            }
        }
    }

    public static void clear(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e2a84ab", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            ohh.a(jSONObject.getString("group"), jSONObject.getString("key"));
            long longValue = jSONObject.getLongValue("expireTime");
            if (longValue <= 0 || !oeb.a("enableClearExpireCache", true)) {
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().q().a(longValue);
        }
    }
}
