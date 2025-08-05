package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;

/* loaded from: classes6.dex */
public class jyq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public jyn f29863a = new jyn();
    public jyp b = new jyp();
    public jyk c = new jyk();
    public jyr d = new jyr();
    public jym e = new jym();
    public jyi f = new jyi();

    static {
        kge.a(-539983813);
    }

    public jyj a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jyj) ipChange.ipc$dispatch("7c715079", new Object[]{this, str});
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1364766353:
                if (str.equals("stopScroll")) {
                    c = 4;
                    break;
                }
                break;
            case -1289153596:
                if (str.equals("expose")) {
                    c = 1;
                    break;
                }
                break;
            case -1036844840:
                if (str.equals(JarvisConstant.TRIGGER_POINT_DETAIL_BACK)) {
                    c = 2;
                    break;
                }
                break;
            case 3227604:
                if (str.equals("idle")) {
                    c = 3;
                    break;
                }
                break;
            case 92734940:
                if (str.equals(JarvisConstant.TRIGGER_POINT_AFTER)) {
                    c = 0;
                    break;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c == 0) {
            return this.f;
        }
        if (c == 1) {
            return this.f29863a;
        }
        if (c == 2) {
            return this.e;
        }
        if (c == 3) {
            return this.b;
        }
        if (c == 4) {
            return this.d;
        }
        if (c == 5) {
            return this.c;
        }
        return null;
    }
}
