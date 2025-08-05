package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.face.factory.SharedPreferencesFactory;
import com.taobao.android.boutique.fastsp.face.factory.SysSharedPreferencesFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class kgo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, SharedPreferences> f30057a;
    private static volatile SharedPreferencesFactory b;

    static {
        kge.a(-223748963);
        f30057a = new ConcurrentHashMap();
    }

    public static SharedPreferences a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("692cecad", new Object[]{context, str, new Integer(i)});
        }
        if (b == null) {
            synchronized (kgo.class) {
                if (b == null) {
                    Object a2 = new kgp().a(context);
                    b = a2 instanceof SharedPreferencesFactory ? (SharedPreferencesFactory) a2 : new SysSharedPreferencesFactory();
                }
            }
        }
        SharedPreferences sharedPreferences = f30057a.get(str);
        if (sharedPreferences == null) {
            synchronized (f30057a) {
                sharedPreferences = f30057a.get(str);
                if (sharedPreferences == null) {
                    SharedPreferences create = b.create(context, str, i);
                    f30057a.put(str, create);
                    sharedPreferences = create;
                }
            }
        }
        return sharedPreferences;
    }
}
