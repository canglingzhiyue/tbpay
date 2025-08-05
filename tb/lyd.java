package tb;

import android.content.Context;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class lyd extends AsyncTask<Object, Object, Map<String, Map<String, String>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f30984a = "lyd";
    private Map<String, Map<String, String>> b;

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>, java.lang.Object] */
    @Override // android.os.AsyncTask
    public /* synthetic */ Map<String, Map<String, String>> doInBackground(Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ void onPostExecute(Map<String, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b105c779", new Object[]{this, map});
        } else {
            a(map);
        }
    }

    public lyd(Map<String, Map<String, String>> map) {
        this.b = map;
    }

    public Map<String, Map<String, String>> a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fc68f43e", new Object[]{this, objArr});
        }
        if (objArr != null && objArr.length >= 2 && (objArr[0] instanceof Context) && (objArr[1] instanceof String)) {
            return new lyg().a((Context) objArr[0], (String) objArr[1]);
        }
        return new HashMap();
    }

    public void a(Map<String, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        if (this.b != null && map != null && map.size() > 0) {
            this.b.clear();
            this.b.putAll(map);
        }
        String str = f30984a;
        Object[] objArr = new Object[3];
        objArr[0] = "loadPrams-Success";
        objArr[1] = getClass().getSimpleName();
        Map<String, Map<String, String>> map2 = this.b;
        if (map2 != null) {
            i = map2.size();
        }
        objArr[2] = Integer.valueOf(i);
        lyk.a(str, objArr);
    }
}
