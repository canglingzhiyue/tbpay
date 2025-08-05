package android.taobao.windvane.monitor;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.musie.weex.MusWeex;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.aem;
import tb.kge;

/* loaded from: classes2.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile k f1681a;
    public j config = new j();

    static {
        kge.a(-285696663);
        f1681a = null;
    }

    public static k getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("f6d8a3d1", new Object[0]);
        }
        if (f1681a == null) {
            synchronized (k.class) {
                if (f1681a == null) {
                    f1681a = new k();
                }
            }
        }
        return f1681a;
    }

    /* loaded from: classes2.dex */
    public static class a implements aek {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1844034905);
            kge.a(1845411121);
        }

        private a() {
        }

        @Override // tb.aek
        public ael onEvent(int i, aej aejVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
            }
            if (i == 1002) {
                try {
                    double d = k.getInstance().config.perfCheckSampleRate;
                    String str = k.getInstance().config.perfCheckURL;
                    if (TextUtils.isEmpty(MusWeex.ATTR_SCRIPT_URL) || d <= Math.random()) {
                        return null;
                    }
                    aejVar.f25289a.evaluateJavascript(String.format("(function(d){var s = d.createElement('script');s.src='%s';d.head.appendChild(s);})(document)", str));
                } catch (Exception unused) {
                    return null;
                }
            }
            return null;
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            aem.a().a(new a());
        }
    }
}
