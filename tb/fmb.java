package tb;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fmb<T extends RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, fma<T>> f28049a = new HashMap();
    private Map<Integer, String> b = new HashMap();

    static {
        kge.a(-1579921412);
    }

    public void a(String str, fma<T> fmaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28bacde8", new Object[]{this, str, fmaVar});
        } else {
            this.f28049a.put(str, fmaVar);
        }
    }

    public T a(b bVar, fmd fmdVar, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7039b6f7", new Object[]{this, bVar, fmdVar, viewGroup, new Integer(i)});
        }
        fma<T> fmaVar = this.f28049a.get(this.b.get(Integer.valueOf(i)));
        if (fmaVar == null) {
            return null;
        }
        try {
            return fmaVar.b(viewGroup, fmdVar, bVar);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (str == null) {
            return -1;
        }
        int hashCode = str.hashCode();
        this.b.put(Integer.valueOf(hashCode), str);
        return hashCode;
    }
}
