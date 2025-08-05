package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gnz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f28401a;
    public String b;
    public String c;
    public JSONObject d;
    public String e;
    public JSONObject f;
    public JSONObject g;
    public String h;
    public JSONArray i = new JSONArray();

    static {
        kge.a(2112761493);
    }

    private gnz() {
    }

    public static gnz a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gnz) ipChange.ipc$dispatch("249cdde3", new Object[]{str, str2, str3, str4});
        }
        gnz gnzVar = new gnz();
        gnzVar.f28401a = str;
        gnzVar.b = str2;
        gnzVar.c = str3;
        gnzVar.h = str4;
        return gnzVar;
    }
}
