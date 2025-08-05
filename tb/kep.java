package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.taobao.windvane.util.b;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;

/* loaded from: classes6.dex */
public class kep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static kep c;

    /* renamed from: a  reason: collision with root package name */
    private a f30014a = new a();
    private boolean b = false;
    private SharedPreferences d;

    static {
        kge.a(1674046686);
        c = new kep();
    }

    public static kep a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kep) ipChange.ipc$dispatch("f06d188", new Object[0]) : c;
    }

    private kep() {
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long b = 0;

        /* renamed from: a  reason: collision with root package name */
        public long f30016a = this.b + b.DEFAULT_MAX_AGE;
        public long c = b.DEFAULT_MAX_AGE;

        static {
            kge.a(758429610);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "FatigueInfo{, lastShowTimeMs=" + this.b + ", limitedTime=" + this.f30016a + ", limitedDurationTimeMs=" + this.c + '}';
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!this.b) {
        } else {
            b(context);
        }
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        this.d = context.getSharedPreferences(BootImageDataMgr.CACHE_MODULE, 0);
        String string = this.d.getString("global_fatigue_info", "");
        if ("".equals(string)) {
            return;
        }
        try {
            this.f30014a = (a) JSONObject.parseObject(string, new TypeReference<a>() { // from class: tb.kep.1
            }.getType(), new Feature[0]);
            this.b = true;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        if (j > 0) {
            a aVar = this.f30014a;
            aVar.f30016a = aVar.b + j;
            this.f30014a.c = j;
        }
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString("global_fatigue_info", JSONObject.toJSONString(this.f30014a)).apply();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f30014a.b = keo.b();
        a aVar = this.f30014a;
        aVar.f30016a = aVar.b + this.f30014a.c;
        d();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : keo.b() <= this.f30014a.f30016a;
    }
}
