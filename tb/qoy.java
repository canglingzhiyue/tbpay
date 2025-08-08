package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.sp.framework.model.SimpleProfile;

/* loaded from: classes9.dex */
public class qoy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f33005a;
    public JSONObject b;

    static {
        kge.a(-328457566);
    }

    public qoy(boolean z, JSONObject jSONObject) {
        this.f33005a = z;
        this.b = jSONObject;
    }

    public qoy(boolean z) {
        this.f33005a = z;
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().getString("error");
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().getString("errorMessage");
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f33005a;
    }

    public static a a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("414d30b2", new Object[]{str, str2}) : new a(str, str2);
    }

    public static a a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("18677128", new Object[]{str, str2, str3}) : new a(str, str2, str3);
    }

    /* loaded from: classes9.dex */
    public static class a extends qoy {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String c;
        public String d;
        public String e;

        static {
            kge.a(980187494);
        }

        public a(String str, String str2) {
            super(false);
            this.c = str;
            this.d = str2;
        }

        public a(String str, String str2, String str3) {
            super(false);
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        @Override // tb.qoy
        public JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", (Object) this.c);
            jSONObject.put("message", (Object) this.d);
            jSONObject.put("errorMessage", (Object) this.d);
            if (!StringUtils.isEmpty(this.e)) {
                jSONObject.put(SimpleProfile.KEY_SIGNATURE, (Object) this.e);
            }
            return jSONObject;
        }
    }
}
