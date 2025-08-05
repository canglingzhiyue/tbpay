package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class rit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Object f33171a = new Object();
    private static rit b;
    private Context c;
    private final HashMap<String, ArrayList<WeakReference<ris>>> d = new HashMap<>();

    private rit(Context context) {
        this.c = context;
    }

    public static rit a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rit) ipChange.ipc$dispatch("34c8b0a9", new Object[]{context});
        }
        if (b == null) {
            synchronized (f33171a) {
                if (b == null) {
                    b = new rit(context.getApplicationContext());
                }
            }
        }
        return b;
    }

    public void a(ris risVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1a503c", new Object[]{this, risVar});
            return;
        }
        synchronized (this.d) {
            if (risVar == null) {
                return;
            }
            ArrayList<WeakReference<ris>> arrayList = this.d.get(risVar.a());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.d.put(risVar.a(), arrayList);
            }
            arrayList.add(new WeakReference<>(risVar));
        }
    }

    public void b(ris risVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9d56bd", new Object[]{this, risVar});
            return;
        }
        synchronized (this.d) {
            if (risVar == null) {
                return;
            }
            ArrayList<WeakReference<ris>> arrayList = this.d.get(risVar.a());
            if (arrayList == null) {
                return;
            }
            Iterator<WeakReference<ris>> it = arrayList.iterator();
            while (it.hasNext()) {
                ris risVar2 = it.next().get();
                if (risVar2 == null || risVar2 == risVar) {
                    it.remove();
                }
            }
            if (arrayList.size() == 0) {
                this.d.remove(risVar.a());
            }
        }
    }

    public void a(ris risVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52592918", new Object[]{this, risVar, obj});
            return;
        }
        synchronized (this.d) {
            if (risVar == null) {
                return;
            }
            ArrayList<WeakReference<ris>> arrayList = this.d.get(risVar.a());
            if (arrayList == null) {
                return;
            }
            try {
                Iterator<WeakReference<ris>> it = arrayList.iterator();
                while (it.hasNext()) {
                    ris risVar2 = it.next().get();
                    if (risVar2 != null && risVar2 != risVar) {
                        risVar2.b(obj);
                    }
                }
            } catch (Exception e) {
                Log.e("MessageChannelManager", e.getMessage());
            }
        }
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        synchronized (this.d) {
            ArrayList<WeakReference<ris>> arrayList = this.d.get(str);
            if (arrayList == null) {
                return;
            }
            try {
                Iterator<WeakReference<ris>> it = arrayList.iterator();
                while (it.hasNext()) {
                    ris risVar = it.next().get();
                    if (risVar != null) {
                        risVar.b(obj);
                    }
                }
            } catch (Exception e) {
                Log.e("MessageChannelManager", e.getMessage());
            }
        }
    }
}
