package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.r;
import com.taobao.browser.utils.i;
import com.taobao.search.mmd.util.c;
import com.taobao.search.rainbow.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public class nsb extends iue<nsc, nsd> implements nsi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ArrayList<String> b;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f31708a;

    @Override // tb.iue, tb.iuh
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    static {
        kge.a(-1120103163);
        kge.a(684702369);
        ArrayList<String> arrayList = new ArrayList<>();
        b = arrayList;
        arrayList.add(i.URL_REFERER_ORIGIN);
        b.add("referrer");
        b.add("gotoSearch");
    }

    @Override // tb.iuh
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            a(getWidget().getActivity().getIntent());
        }
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        this.f31708a = c.a(intent);
        String[] strArr = {"sellerId", "seller_id", "userId", "user_id"};
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            String str = strArr[i2];
            if (!TextUtils.isEmpty(this.f31708a.get(str))) {
                Map<String, String> map = this.f31708a;
                map.put("sellerId", map.remove(str));
                break;
            }
            i2++;
        }
        String[] strArr2 = {"shopId", "shop_id"};
        int length2 = strArr2.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            String str2 = strArr2[i];
            if (!TextUtils.isEmpty(this.f31708a.get(str2))) {
                Map<String, String> map2 = this.f31708a;
                map2.put("shopId", map2.remove(str2));
                break;
            }
            i++;
        }
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            this.f31708a.remove(it.next());
        }
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        String str = this.f31708a.get("shopId");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("shop_id", str);
        String str2 = this.f31708a.get("sellerId");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("seller_id", str2);
        hashMap.put("inshops", "search");
        hashMap.put("spm-cnt", "a2141.7631685.0.0");
        hashMap.put("encode_rainbow", r.c(a.c()));
        Map<String, String> i = getWidget().i();
        if (i != null) {
            hashMap.putAll(i);
        }
        return hashMap;
    }

    @Override // tb.nsi
    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.f31708a;
    }
}
