package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.o;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class iyh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_ID = -1;
    public static final String TAG = "ContainerStorage";

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f29409a = new AtomicInteger(1);
    private Map<String, String> b = new HashMap();
    private Map<String, List<Map.Entry<Integer, a>>> c = new HashMap();

    /* loaded from: classes6.dex */
    public interface a {
        void a(String str, String str2);
    }

    static {
        kge.a(-1080254221);
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        o.c(TAG, "saveData: key is " + str + " ,value is " + str2);
        if (str == null) {
            o.c(TAG, "saveData: key is null");
            return false;
        }
        String str3 = this.b.get(str);
        this.b.put(str, str2);
        if (StringUtils.equals(str3, str2)) {
            o.c(TAG, "saveData: oldValue and newValue is same");
            return true;
        }
        List<Map.Entry<Integer, a>> list = this.c.get(str);
        if (list == null) {
            return true;
        }
        o.c(TAG, "notifyDataChanged: observer size: " + list.size());
        for (Map.Entry<Integer, a> entry : list) {
            String a2 = a(str);
            if (StringUtils.equals(str3, str2)) {
                o.c(TAG, "notifyDataChanged: has set same value internal");
            } else {
                entry.getValue().a(str3, a2);
                o.c(TAG, "notifyDataChanged: observer id: " + entry.getKey());
            }
        }
        return true;
    }

    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        o.c(TAG, "saveDataWithoutNotify: key is " + str + " ,value is " + str2);
        if (str == null) {
            return false;
        }
        this.b.put(str, str2);
        return true;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        o.c(TAG, "getData: key is " + str);
        if (str != null) {
            return this.b.get(str);
        }
        return null;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        o.c(TAG, "clear data");
        this.b.clear();
    }

    public int a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2742600", new Object[]{this, str, aVar})).intValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("registerObserver: key is ");
        sb.append(str);
        sb.append(" ,listener is ");
        sb.append(aVar == null ? "null" : "not null");
        o.c(TAG, sb.toString());
        if (StringUtils.isEmpty(str) || aVar == null) {
            return -1;
        }
        List<Map.Entry<Integer, a>> list = this.c.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.c.put(str, list);
        }
        for (Map.Entry<Integer, a> entry : list) {
            if (entry.getValue().equals(aVar)) {
                o.c(TAG, "registerObserver: found same listener, id is " + entry.getKey());
                return entry.getKey().intValue();
            }
        }
        int andIncrement = this.f29409a.getAndIncrement();
        list.add(new AbstractMap.SimpleEntry(Integer.valueOf(andIncrement), aVar));
        o.c(TAG, "registerObserver: new observerId " + andIncrement);
        return andIncrement;
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        o.c(TAG, "unregisterObserver: observerId is " + i);
        for (Map.Entry<String, List<Map.Entry<Integer, a>>> entry : this.c.entrySet()) {
            List<Map.Entry<Integer, a>> value = entry.getValue();
            int size = value.size();
            for (int i2 = 0; i2 < size; i2++) {
                Map.Entry<Integer, a> entry2 = value.get(i2);
                if (entry2.getKey().intValue() == i) {
                    value.remove(i2);
                    o.c(TAG, "unregisterObserver: found observerId " + entry2.getKey());
                    return true;
                }
            }
        }
        return false;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.clear();
        this.c.clear();
    }
}
