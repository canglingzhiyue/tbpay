package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.fvc;

/* loaded from: classes.dex */
public class fzm implements fvc.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PERIOD_COUNT = 2;
    public int c;
    public CopyOnWriteArrayList<fzl> b = new CopyOnWriteArrayList<>();
    public Map<String, List<WeakReference<fzo>>> d = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public Map<String, List<fzo>> f28240a = new HashMap();

    static {
        kge.a(332882739);
        kge.a(1933598856);
    }

    public fzm() {
        fvc.a().a(this);
    }

    public void a(fzo fzoVar, String str) {
        List<fzo> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fbf367", new Object[]{this, fzoVar, str});
        } else if (fqi.aV()) {
            b(fzoVar, str);
        } else if (StringUtils.isEmpty(str) || fzoVar == null) {
        } else {
            List<fzo> list = this.f28240a.get(str);
            if (list == null) {
                if (fqi.az()) {
                    arrayList = new CopyOnWriteArrayList<>();
                } else {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fzoVar);
                this.f28240a.put(str, arrayList);
                return;
            }
            list.add(fzoVar);
        }
    }

    public void b(fzo fzoVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e4bba8", new Object[]{this, fzoVar, str});
        } else if (StringUtils.isEmpty(str) || fzoVar == null) {
        } else {
            List<WeakReference<fzo>> list = this.d.get(str);
            if (list == null) {
                if (fqi.az()) {
                    list = new CopyOnWriteArrayList<>();
                } else {
                    list = new ArrayList<>();
                }
                list.add(new WeakReference<>(fzoVar));
                this.d.put(str, list);
            } else {
                list.add(new WeakReference<>(fzoVar));
            }
            a(list);
        }
    }

    public void a(fzl fzlVar) {
        List<fzo> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98c89c0", new Object[]{this, fzlVar});
        } else if (fqi.aV()) {
            c(fzlVar);
        } else if (fzlVar != null && !StringUtils.isEmpty(fzlVar.b) && (list = this.f28240a.get(fzlVar.b)) != null) {
            if (fqi.af()) {
                Iterator<fzo> it = list.iterator();
                if (it == null) {
                    return;
                }
                while (it.hasNext()) {
                    fzo next = it.next();
                    if (next != null) {
                        next.a(fzlVar);
                    }
                }
                return;
            }
            for (fzo fzoVar : list) {
                fzoVar.a(fzlVar);
            }
        }
    }

    public void c(fzl fzlVar) {
        List<WeakReference<fzo>> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69296c2", new Object[]{this, fzlVar});
        } else if (fzlVar != null && !StringUtils.isEmpty(fzlVar.b) && (list = this.d.get(fzlVar.b)) != null) {
            if (fqi.af()) {
                Iterator<WeakReference<fzo>> it = list.iterator();
                if (it == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    WeakReference<fzo> next = it.next();
                    if (next == null) {
                        it.remove();
                    } else {
                        fzo fzoVar = next.get();
                        if (fzoVar == null) {
                            arrayList.add(next);
                        } else {
                            fzoVar.a(fzlVar);
                        }
                    }
                }
                list.removeAll(arrayList);
                return;
            }
            for (WeakReference<fzo> weakReference : list) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().a(fzlVar);
                }
            }
        }
    }

    private void a(List<WeakReference<fzo>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        Iterator<WeakReference<fzo>> it = list.iterator();
        if (it == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            WeakReference<fzo> next = it.next();
            if (next == null) {
                it.remove();
            } else if (next.get() == null) {
                arrayList.add(next);
            }
        }
        list.removeAll(arrayList);
    }

    public void b(fzl fzlVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80f9041", new Object[]{this, fzlVar});
            return;
        }
        int i = 0;
        while (true) {
            try {
                if (i >= this.b.size()) {
                    z = true;
                    break;
                } else if (this.b.get(i).a(fzlVar)) {
                    break;
                } else {
                    i++;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (!z) {
            return;
        }
        this.b.add(fzlVar);
    }

    @Override // tb.fvc.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        int i = this.c;
        if (i == 2) {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                a(this.b.get(i2));
            }
            this.b.clear();
            this.c = 0;
            return;
        }
        this.c = i + 1;
    }
}
