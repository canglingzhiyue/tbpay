package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ohf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f32055a;

    /* loaded from: classes8.dex */
    public interface a {
        void close();

        void setCursorMoveAnimDuration(long j);

        void setCursorThemeColor(int i, int i2);

        void setTargetScreenSize(int i, int i2);

        void show();

        void stop();

        void update(JSONObject jSONObject);
    }

    static {
        kge.a(372204022);
    }

    public static /* synthetic */ a a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("797d6e2e", new Object[]{aVar});
        }
        f32055a = aVar;
        return aVar;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f32055a != null) {
        } else {
            c.a("com.taobao.cursor.CursorManager", new c.a() { // from class: tb.ohf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassNotFound() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                    }
                }

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassLoaded(Class<?> cls) {
                    if (cls != null) {
                        try {
                            ohf.a((a) cls.newInstance());
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    public static a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("516f2c13", new Object[0]);
        }
        if (f32055a == null) {
            a();
        }
        return f32055a;
    }
}
