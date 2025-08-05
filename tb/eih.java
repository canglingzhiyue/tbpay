package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.constant.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class eih {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final eih[] CHANNEL_LIST;

    /* renamed from: a  reason: collision with root package name */
    public String f27319a;
    public String b;

    static {
        kge.a(-665077421);
        CHANNEL_LIST = new eih[]{a("navPreload", "high"), a("search", "high"), a("shopsearch", "high"), a("cart", "low"), a("detail", "low"), a("detailRec", "high"), a("newDetail", "high"), a("feed", "high"), a("live", "low"), a("hold", "low"), a("99tm", "low"), a("yxhd", "low"), a("bybt", "low")};
    }

    private eih(String str, String str2) {
        this.b = str2;
        this.f27319a = str;
        emu.a("com.taobao.android.detail.core.performance.channel.Channel");
    }

    public static eih a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eih) ipChange.ipc$dispatch("953965c6", new Object[]{str, str2}) : new eih(str, str2);
    }

    public static List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (eih eihVar : CHANNEL_LIST) {
            arrayList.add(eihVar.f27319a);
        }
        return arrayList;
    }

    public static String a(String str) {
        eih[] eihVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "low";
        }
        for (eih eihVar : CHANNEL_LIST) {
            if (str.equals(eihVar)) {
                return eihVar.b;
            }
        }
        return "low";
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : TextUtils.isEmpty(str) ? a.UN_KNOW : str;
    }
}
