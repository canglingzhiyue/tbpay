package com.taobao.accs.utl;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-553009000);
    }

    public static String a(JSONObject jSONObject, String str, String str2) throws JSONException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("71c53d76", new Object[]{jSONObject, str, str2}) : (jSONObject != null && jSONObject.has(str)) ? jSONObject.getString(str) : str2;
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f8311a = new JSONObject();

        static {
            kge.a(812638760);
        }

        public a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9368ab3", new Object[]{this, str, str2});
            }
            if (str2 != null && str != null) {
                try {
                    this.f8311a.put(str, str2);
                } catch (JSONException unused) {
                }
            }
            return this;
        }

        public a a(String str, Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a6a0df3c", new Object[]{this, str, num});
            }
            if (num == null) {
                return this;
            }
            try {
                this.f8311a.put(str, num);
            } catch (JSONException unused) {
            }
            return this;
        }

        public a a(String str, Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f85e8ea8", new Object[]{this, str, l});
            }
            if (l == null) {
                return this;
            }
            try {
                this.f8311a.put(str, l);
            } catch (JSONException unused) {
            }
            return this;
        }

        public JSONObject a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("69129956", new Object[]{this}) : this.f8311a;
        }
    }
}
