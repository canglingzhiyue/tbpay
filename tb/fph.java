package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.c;
import com.taobao.android.dinamic.e;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamic.view.b;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes5.dex */
public class fph {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static fpl f28090a;
    private static fpi b;
    private static fpm c;
    private static fpg d;

    static {
        kge.a(-364608175);
        f28090a = new fpl();
        b = new fpi();
        c = new fpm();
        d = new fpg();
    }

    public static XmlPullParser a(String str, DinamicTemplate dinamicTemplate, b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (XmlPullParser) ipChange.ipc$dispatch("1c1e3fa6", new Object[]{str, dinamicTemplate, bVar});
        }
        XmlPullParser xmlPullParser = null;
        if (e.a() && c.a(dinamicTemplate)) {
            xmlPullParser = c.a(str, dinamicTemplate, bVar);
        }
        long nanoTime = System.nanoTime();
        if (!dinamicTemplate.isPreset()) {
            XmlPullParser a2 = b.a(str, dinamicTemplate, bVar);
            if (a2 == null) {
                z = false;
            }
            a(str, dinamicTemplate, z, System.nanoTime() - nanoTime);
            return a2;
        }
        if (xmlPullParser == null) {
            xmlPullParser = f28090a.a(str, dinamicTemplate, bVar);
        }
        if (xmlPullParser == null) {
            xmlPullParser = d.a(str, dinamicTemplate, bVar);
        }
        if (xmlPullParser == null) {
            z = false;
        }
        a(str, dinamicTemplate, z, System.nanoTime() - nanoTime);
        return xmlPullParser;
    }

    private static void a(final String str, final DinamicTemplate dinamicTemplate, final boolean z, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e484ac", new Object[]{str, dinamicTemplate, new Boolean(z), new Long(j)});
        } else if (c.a().b() == null || !fpb.a()) {
        } else {
            fpb.f28086a.a(new Runnable() { // from class: tb.fph.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (e.a()) {
                        fpa.a(e.TAG, "module=" + str + "read File=" + dinamicTemplate + (((float) j) / 1000000.0d));
                    }
                    c.a().b().e(str, dinamicTemplate, z, null, j / 1000000.0d);
                }
            });
        }
    }
}
