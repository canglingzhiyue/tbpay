package tb;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.a;
import java.util.List;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class fnm extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1049728069);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [tb.fnm$1] */
    public fnm() {
        new AsyncTask<Void, Void, Void>() { // from class: tb.fnm.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
            @Override // android.os.AsyncTask
            public /* synthetic */ Void doInBackground(Void[] voidArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            public Void a(Void... voidArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Void) ipChange.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                }
                fnn.a().b();
                return null;
            }
        }.execute(new Void[0]);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        if (list != null) {
            try {
                if (list.size() != 0) {
                    Object obj2 = list.get(0);
                    if (obj2 != null) {
                        StringTokenizer stringTokenizer = new StringTokenizer(obj2.toString(), dmp.DELIMITER, false);
                        if (stringTokenizer.hasMoreTokens()) {
                            obj = fnn.a().b();
                            while (stringTokenizer.hasMoreTokens()) {
                                obj = foa.a(obj, stringTokenizer.nextToken());
                            }
                            return (obj != null && list.size() > 1) ? list.get(1) : obj;
                        }
                    }
                    obj = null;
                    if (obj != null) {
                        return obj;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                fpdVar.c().b().a(a.ERROR_CODE_TEMPLATE_PARSER_EXCEPTION, "AppStyleParser parse error");
            }
        }
        return null;
    }
}
