package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public class jlg extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 9;
    public String b;

    static {
        kge.a(812344825);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    private jlg(String str) {
        this.f29616a = str;
        try {
            this.b = str.substring(9);
        } catch (Throwable th) {
            jkq.a(jku.TAG, "parse TSFullUrlExpression error", th);
        }
    }

    public static jlg b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jlg) ipChange.ipc$dispatch("e2617f23", new Object[]{str, objArr});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("@fullUrl.")) {
            return null;
        }
        return new jlg(str);
    }

    public String b(a aVar) {
        String uri;
        IpChange ipChange = $ipChange;
        char c = 1;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        try {
            Uri b = aVar.b();
            if (!TextUtils.isEmpty(this.b) && b != null) {
                String str = this.b;
                switch (str.hashCode()) {
                    case -907987547:
                        if (str.equals("scheme")) {
                            break;
                        }
                        c = 65535;
                        break;
                    case 96673:
                        if (str.equals("all")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3208616:
                        if (str.equals("host")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3433509:
                        if (str.equals("path")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3446913:
                        if (str.equals("port")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 107944136:
                        if (str.equals("query")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1475610435:
                        if (str.equals("authority")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        uri = b.toString();
                        break;
                    case 1:
                        uri = b.getScheme();
                        break;
                    case 2:
                        uri = b.getHost();
                        break;
                    case 3:
                        uri = b.getPath();
                        break;
                    case 4:
                        uri = b.getQuery();
                        break;
                    case 5:
                        uri = b.getAuthority();
                        break;
                    case 6:
                        uri = String.valueOf(b.getPort());
                        break;
                    default:
                        uri = null;
                        break;
                }
                jkq.a(jku.TAG, "parse fullUrl params = " + uri);
                return uri;
            }
            return null;
        } catch (Throwable th) {
            jkq.a(jku.TAG, "parse fullUrl params error", th);
            return null;
        }
    }
}
