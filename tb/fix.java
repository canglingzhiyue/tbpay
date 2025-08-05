package tb;

import android.view.ViewGroup;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.av;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.ax;
import com.taobao.avplayer.ba;
import com.taobao.avplayer.common.z;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public interface fix {

    /* loaded from: classes5.dex */
    public interface a {
        a a(int i);

        a a(DWAspectRatio dWAspectRatio);

        a a(DWInstanceType dWInstanceType);

        a a(String str);

        a a(JSONObject jSONObject);

        a a(boolean z);

        fix a();

        a b(int i);

        a b(String str);

        a b(boolean z);

        a c(String str);

        a c(boolean z);

        a d(String str);

        void e(String str);
    }

    void a();

    void a(float f);

    void a(int i);

    void a(int i, int i2);

    void a(DWInstanceType dWInstanceType);

    void a(av avVar);

    void a(aw awVar);

    void a(ax axVar);

    void a(ba baVar);

    void a(z zVar);

    void a(HashMap<String, String> hashMap);

    void a(boolean z, com.alibaba.fastjson.JSONObject jSONObject);

    void b();

    void b(HashMap<String, String> hashMap);

    void b(boolean z);

    void c();

    void d();

    void e();

    int f();

    ViewGroup g();

    void h();

    void i();
}
