package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.face.factory.SharedPreferencesFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.tcp;

/* loaded from: classes4.dex */
public class jml implements SharedPreferencesFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Map<String, SharedPreferences> f29633a = new ConcurrentHashMap();
    private final SharedPreferencesFactory b;

    static {
        kge.a(-1622153645);
        kge.a(1021064496);
    }

    public static /* synthetic */ SharedPreferences lambda$V6BXiUcIRjzJK65Zv1ihA1spQxA(jml jmlVar, Context context, String str, int i) {
        return jmlVar.a(context, str, i);
    }

    public jml(SharedPreferencesFactory sharedPreferencesFactory) {
        this.b = sharedPreferencesFactory;
    }

    @Override // com.taobao.android.boutique.fastsp.face.factory.SharedPreferencesFactory
    public SharedPreferences create(final Context context, final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("11676488", new Object[]{this, context, str, new Integer(i)});
        }
        SharedPreferences sharedPreferences = this.f29633a.get(str);
        if (sharedPreferences == null) {
            synchronized (this.f29633a) {
                sharedPreferences = this.f29633a.get(str);
                if (sharedPreferences == null) {
                    ixq a2 = ixq.a(str, this.b.getClass().getName(), new tcp.c() { // from class: tb.-$$Lambda$jml$V6BXiUcIRjzJK65Zv1ihA1spQxA
                        @Override // tb.tcp.c
                        public final Object call() {
                            return jml.lambda$V6BXiUcIRjzJK65Zv1ihA1spQxA(jml.this, context, str, i);
                        }
                    });
                    jvh jvhVar = new jvh(a2.b(), a2.a());
                    this.f29633a.put(str, jvhVar);
                    sharedPreferences = jvhVar;
                }
            }
        }
        return sharedPreferences;
    }

    public /* synthetic */ SharedPreferences a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("692cecad", new Object[]{this, context, str, new Integer(i)}) : this.b.create(context, str, i);
    }
}
